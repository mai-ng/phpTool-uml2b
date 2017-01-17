/*
 * generated by Xtext 2.10.0
 */
package b2sql.generator

import b2sql.b2SQL2.Attribute
import b2sql.b2SQL2.BOperation
import b2sql.b2SQL2.BSQLMachine
import b2sql.b2SQL2.BTable
import b2sql.b2SQL2.BType
import b2sql.b2SQL2.BoolOperation
import b2sql.b2SQL2.StringOperation
import b2sql.b2SQL2.VoidOperation
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class B2SQL2Generator extends AbstractGenerator {

	BTable table; 
	
override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (t : resource.allContents.toIterable.filter(BSQLMachine)) {
            if(t.inv != null)
            	table = t.inv;
            fsa.generateFile(
                t.vars + ".sql", t.maptoProcedure)
            
        }
	}	
	def maptoProcedure(BSQLMachine m)'''
		--SQL code of �m.m_name�
		//compile a log table
		�IF m.inv.table_name.toString().endsWith("log")�
			�m.inv.maptoLogTable�
		//compile a object table
		�ELSE�
			�m.inv.maptoFunTable�
			�FOR o : m.bops��o.maptoProcedure��ENDFOR�
		�ENDIF�
    '''
	/**
	 * generate a table from a log B structure
	 */
	def maptoLogTable(BTable t)'''
 	/*generate the SQL table from the B variable �t.table_name�*/		
 	CREATE TABLE �t.table_name� {
 		�FOR a : t.attributes SEPARATOR ','�
 		�IF a.att_name.toString().startsWith("order")��a.att_name� DATETIME DEFAULT CURRENT_TIMESTAMP
 		�ELSE��a.toTextAtrribute� NOT NULL �ENDIF�
 		�ENDFOR�
 		/*the key is a set of attributes denoting the parameters of the method to log*/
 		PRIMARY KEY(�FOR attr:getTableAttr(table,2) SEPARATOR ", "��attr.att_name��ENDFOR�)
 	}
 	'''
    
    /**
     * generate a table from a object B structure
     */
    def maptoFunTable(BTable t)'''
 	/*generate the SQL table from the B variable �t.table_name�*/		
 	CREATE TABLE �t.table_name� {
 		/*the key is the first attribute*/
 		�var first = t.attributes.head��first.toTextAtrribute� PRIMARY KEY NOT NULL 
 		�FOR a : t.attributes SEPARATOR ','��IF a.equals(first)��ELSE�	
 		�a.toTextAtrribute� NOT NULL �ENDIF�
 		�ENDFOR�
 	}
 	'''
 	def toTextAtrribute(Attribute a)'''�a.att_name� �a.type.maptoSQLType�'''
    
    def maptoSQLType(BType t)'''�switch t.type_name{
    		case 'NAT': 'INT /*convert type NAT in B to INT in SQL*/'
    		case 'BOOL': 'BIT /*convert type BOOL in B to BIT in SQL*/'
    		case 'STR': 'VARCHAR(25)'
    		case 'Users': 'VARCHAR(25)'
    		case 'Roles': 'VARCHAR(25)'    		
    		default: 'INT' 	
    	}�''' 
    	
    def maptoProcedure(BOperation o)'''
    	�IF o.bops != null� �o.bops.compile� �ENDIF�
    	�IF o.sops != null� �o.sops.compile� �ENDIF�
    	�IF o.vops != null� �o.vops.compile� �ENDIF�
    '''
    //TODO
    def compile (StringOperation so)'''  '''
    //TODO  
    def compile(VoidOperation vo)''' '''
    
    def compile (BoolOperation bo)'''
	/**
	* generated stored procedure of the operation �bo.op_name�
	**/
	CREATE PROCEDURE �bo.op_name�
	   �FOR p : bo.PTyping SEPARATOR ','�@�p.p_name� �p.type.maptoSQLType��ENDFOR�, 
	   	@res BIT OUTPUT /*BOOL type in B is converted to BIT type in SQL*/
	   	AS
	   		/*checks the existance of records*/
	   		DECLARE @exist int
	   		SELECT @exist = COUNT(*) FROM �IF bo.reshas.objTable.ti_name.equals(bo.reshas.objTable.ti_type.instance_name)��bo.reshas.objTable.ti_type.instance_type��ENDIF�
	   		/*generates conditions from the B predicates*/
	   		WHERE �FOR p: bo.reshas.pres SEPARATOR ' AND ' ��p.PLeft.SRight�=�IF p.PRight.equals('FALSE')� 0 �ELSEIF p.PRight.equals('TRUE')� 1 �ELSEIF p.PRight instanceof String� @�p.PRight��ELSE� �p.PRight� �ENDIF��ENDFOR�
	   		/*returns 1 (corresponds to TRUE in B) if there exists such an instance, 
	   			returns 0 (corresponds to FALSE in B) otherwise*/
	   		IF(@exist > 0) 
	   			SET @res = 1
	   		ELSE 
	   			SET @res = 0	
	   GO
   '''
 /**
 * get the attributes of a table:
 * mode == 0: get all the attributes.
 * mode == 1: get the attributes except the order
 * mode == 2: get the attributes except the user and the order
 */
	def getTableAttr(BTable table, int mode) {
		val ArrayList<Attribute>  listAttrs = new ArrayList<Attribute>()
		for(Attribute attr: table.attributes){
			if(mode == 0){
				listAttrs.add(attr)
			}
			else if(mode == 1){
				if(!attr.att_name.toString().startsWith("order")){
					listAttrs.add(attr)
				}
			}
			else if(mode == 2){
				if(!(attr.att_name.toString().startsWith("user")||attr.att_name.toString().startsWith("order"))){
					listAttrs.add(attr)
				}
			}			
		}
		return listAttrs
	}     
//   def compile(BSubFalse subf)'''
//	//execution of the statement:
//	//returns true if there is no returned result,
//	//false otherwise
//	ResultSet �subf.res� = stmt.executeQuery();
//	if (�subf.res�.next() && �subf.res�.getInt(1)>0) 
//		return false;
//	else
//		return true;
//   '''
//   
//      def compile(BSubTrue subt)'''
//	//execution of the statement:
//	//returns true if there exists at least a returned result,
//	//false otherwise
//	ResultSet �subt.res� = stmt.executeQuery();
//	if (�subt.res�.next() && �subt.res�.getInt(1)>0) 
//		return true;
//	else
//		return false;
//   '''
// /**
// * get the parameters of a void operation:
// * mode == 0: get all the parameters.
// * mode == 1: get the parameters except the time
// */
//	def getOperationParameters(VoidOperation vo, int mode) {
//		val ArrayList<BParameterTyping>  listAttrs = new ArrayList<BParameterTyping>()
//		for(BParameterTyping p: vo.PTyping){
//			if(mode == 0){
//				listAttrs.add(p)
//			}
//			else if(mode == 1){
//				if(!p.p_name.toString().equals("time")){
//					listAttrs.add(p)
//				}
//			}		
//		}
//		return listAttrs
//	}

}

