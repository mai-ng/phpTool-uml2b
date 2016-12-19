package UML2B.Transfo;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;


import fr.lig.vasco.selkis.uml.util.UML_Util;

public class UML2B_NamingRules {
	public UML2B_NamingRules(Package root) {
		super();
		this.root = root;
	}

	Package root;
	
	public static String getClassInstanceLabel(Class c ,Package root){
		return "Instance";
		//return c.getName()+"Instance";
	}
	public static String getClassInstanceNamedLabel(Class c ,Package root){
		//return "Instance";
		return c.getName()+"Instance";
	}
	
	
	private static String removeFirstLevelofQualifedName(String name ,Package root){
		int i = name.indexOf("::");
		int size="::".length();
		if (i!=-1){
			return name.substring(i+size);
		}
		return name; 
	}
	
	
	private static String removeRootFromQualifedName(String name ,Package root){
//		int i = name.indexOf(root.getQualifiedName());
//		int size=root.getQualifiedName().length();		
		if (name.indexOf(root.getQualifiedName())==0){
			return name.substring(root.getQualifiedName().length()+2);
		}else{
			return removeFirstLevelofQualifedName(name, root);
		}
		
		
	}
	
	private static String removeSpace(String text ){		
		return text.replace(' ', '_');
	}
	
	private static String removeNameSpaceSeparator(String text){//'::'		
		return text.replace(':', '_');
	}
	
	private static String removeAccentuations(String text ){		
		return text.replace('\'','_')
					.replace('é', 'e')
					.replace('è', 'e')
					.replace('à', 'a');
	}
	
	
	static public String getLabel(NamedElement element  ,Package root){
		return removeAccentuations(
				removeSpace(
					removeNameSpaceSeparator(
							removeRootFromQualifedName(element.getQualifiedName(),root)
							)
					)
				);		
	}
	
	
	static public String getClassVariableLabel(Class c ,Package root){
		return getLabel(c,root);
	}
	
	static public String getClassAbstractSetLabel(Class c ,Package root){
		if (getClassVariableLabel(c,root).toUpperCase().equals(getClassVariableLabel(c,root)))
			return getClassVariableLabel(c,root).toUpperCase()+"_AS";
		else
			return getClassVariableLabel(c,root).toUpperCase();
	}
	
	
	static public String getDefaultConstructorLabel(Class c ,Package root){
		return getLabel(c,root);
	}
	
	static public String getGeneratedConstructorLabel(Class c ,Package root){
		return getLabel(c,root)+"_NEW";
	}
	
	static public String getGeneratedConstructorSimplifiedLabel(Class c ,Package root){
		return c.getName()+"_NEW";
	}
	
	static public String getDefaultDesructorLabel(Class c ,Package root){
		return getLabel(c,root);
	}
	
	static public String getGeneratedDestructorLabel(Class c ,Package root){
		return getLabel(c,root)+"_Free";
	}
	
	static public String getGeneratedDestructorSimplifiedLabel(Class c ,Package root){
		return c.getName()+"_Free";
	}
	
	static public String getGeneratedParameterLabelForAttribute(Property p ,Package root){
//		return p.getName()+"Value";
		return getLabel(p,root)+"Value";
	}
	
	static public String getGeneratedParameterLabelForRole(Property p ,Package root){
		//p.setName();
//		return p.getName()+"Value"+(UML_Util.isMultivalued(p)?"s":"");
		return getLabel(p,root)+"Value"+(UML_Util.isMultivalued(p)?"s":"");
	}
	
	
	
	
	
	static public String getGeneratedAttributeAccessorLabel(Property p ,Package root){
		return getLabel(p.getClass_(),root)+"__Get"+firstToUpperCase(p.getName());
	}
	
	private static String firstToUpperCase(String name){
		return name.substring(0, 1).toUpperCase()+name.substring(1);
		
	}
	
	
	static public String getGeneratedRoleAccessorLabel(Property p ,Package root) throws Exception{
		return getLabel((Class)UML_Util.getOpposite(p).getType(),root)+"__Get"+firstToUpperCase(p.getAssociation().getName());
	}
	
	
	static public String getGeneratedRoleMutatorSetterLabel(Property p ,Package root) throws Exception{
		return getLabel((Class)UML_Util.getOpposite(p).getType(),root)+"__Set"+firstToUpperCase(p.getAssociation().getName());
	}
	
	
	static public String getGeneratedRoleMutatorAdderLabel(Property p ,Package root) throws Exception{
		return getLabel((Class)UML_Util.getOpposite(p).getType(),root)+"__Add"+firstToUpperCase(p.getAssociation().getName());
	}
	
	static public String getGeneratedRoleMutatorRemoverLabel(Property p ,Package root) throws Exception{
		return getLabel((Class)UML_Util.getOpposite(p).getType(),root)+"__Remove"+firstToUpperCase(p.getAssociation().getName());
	}
	
	static public String getGeneratedMonovaluedAttributeSetterLabel(Property p ,Package root){
		return getLabel(p.getClass_(),root)+"__Set"+firstToUpperCase(p.getName());
	}
	
	
	static public String getGeneratedMultivaluedAttributeAdderLabel(Property p ,Package root){
		return getLabel(p.getClass_(),root)+"__Add"+firstToUpperCase(p.getName());
	}
	
	
	static public String getGeneratedMultivaluedAttributeSetAdderLabel(Property p ,Package root){
		return getLabel(p.getClass_(),root)+"__AddAll"+firstToUpperCase(p.getName());
	}
	
	
	static public String getGeneratedMultivaluedAttributeRemoverLabel(Property p ,Package root){
		return getLabel(p.getClass_(),root)+"__Remove"+firstToUpperCase(p.getName());
	}
	
	
	static public String getGeneratedMultivaluedAttributeSetRemoverLabel(Property p ,Package root){
		return getLabel(p.getClass_(),root)+"__RemoveAll"+firstToUpperCase(p.getName());
	}
	
	
	
	static public String getGeneratedUmlOperationLabel(Operation o ,Package root){
		return getLabel(o.getClass_(),root)+"__"+o.getName();
	}
	
	
//-----------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	public String getClassInstanceLabel(Class c){
		return getClassInstanceLabel(c,root);
	}
	

	
	 public String getLabel(NamedElement element ){
		return getLabel(element, root);
	}
	
	
	 public String getDefaultConstructorLabel(Class c){
		return getDefaultConstructorLabel(c, root);
	}
	
	 public String getGeneratedConstructorLabel(Class c){
		return getGeneratedConstructorLabel(c, root);
	}
	
	 public String getGeneratedConstructorSimplifiedLabel(Class c){
		return getGeneratedConstructorLabel(c,root);
	}
	
	 public String getDefaultDesructorLabel(Class c){
		return getDefaultDesructorLabel(c, root);
	}
	
	 public String getGeneratedDestructorLabel(Class c){
		return getGeneratedDestructorLabel(c, root);
	}
	
	 public String getGeneratedDestructorSimplifiedLabel(Class c){
		return getGeneratedDestructorSimplifiedLabel(c, root);
	}
	
	 public String getGeneratedParameterLabelForAttribute(Property p){
		return getGeneratedParameterLabelForAttribute(p, root);
	}
	
	 public String getGeneratedParameterLabelForRole(Property p){		
		return getGeneratedParameterLabelForRole(p, root);
	}
	
	 
	 public String getGeneratedAttributeAccessorLabel(Property p ){
		 return getGeneratedAttributeAccessorLabel(p, root);
	 }
	

}
