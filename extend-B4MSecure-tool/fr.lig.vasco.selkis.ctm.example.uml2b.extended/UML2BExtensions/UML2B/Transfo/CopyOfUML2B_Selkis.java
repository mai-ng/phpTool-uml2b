package UML2B.Transfo;

import java.util.HashMap;
import java.util.Iterator;

import javax.management.relation.Relation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.lig.vasco.models.b.BAbstractSet;
import fr.lig.vasco.models.b.BComposedType;
import fr.lig.vasco.models.b.BData;
import fr.lig.vasco.models.b.BEnumSet;
import fr.lig.vasco.models.b.BFactory;
import fr.lig.vasco.models.b.BInitialisation;
import fr.lig.vasco.models.b.BInvariant;
import fr.lig.vasco.models.b.BMachine;
import fr.lig.vasco.models.b.BNamedElement;
import fr.lig.vasco.models.b.BOpParameter;
import fr.lig.vasco.models.b.BOperation;
import fr.lig.vasco.models.b.BPackage;
import fr.lig.vasco.models.b.BPowType;
import fr.lig.vasco.models.b.BPrecondition;
import fr.lig.vasco.models.b.BSpec;
import fr.lig.vasco.models.b.BSubstitution;
import fr.lig.vasco.models.b.BType;
import fr.lig.vasco.models.b.BValue;
import fr.lig.vasco.models.b.BVariable;
import fr.lig.vasco.models.b.Bool;
import fr.lig.vasco.models.b.ComposedTypeExp;
import fr.lig.vasco.models.b.SharedTypes;
import fr.lig.vasco.models.b.TypingOperator;
import fr.lig.vasco.models.b.TypingPredicate;
import fr.lig.vasco.models.b.BSet;
import fr.lig.vasco.models.b.Z;
import fr.lig.vasco.models.b.impl.BVariableImpl;
import fr.lig.vasco.selkis.ctm.ITransformationContext;
import fr.lig.vasco.selkis.ctm.example.uml2b.util.BUtil;
import fr.lig.vasco.selkis.ctm.example.uml2b.util.UML2BUtil;
import fr.lig.vasco.selkis.ctm.trace.TransformationTrace;
import fr.lig.vasco.selkis.ctm.transformationconfig.Config;
import fr.lig.vasco.selkis.uml.util.UML_Util;

//org.eclipse.uml2.uml.Package
/**
 * @param ctx
 *            Transformation context : contain the source, the target, the
 *            trace, and the configuration models
 * @param o
 *            the input object must be a sub type of EObject ("Package" or
 *            "Model" for this rule )
 * @return the B system machine
 */
/**
 * @author A. Idani
 *
 */
public class CopyOfUML2B_Selkis {
	static BSet savedPossibleInstances ;
	static public EObject createSysMachine(ITransformationContext ctx, EObject o) {
		if (o instanceof Package) {// input element must be a package (or a
			// sub-type i.e Model )
			Package p = (Package) o;
			BMachine m = BFactory.eINSTANCE.createBMachine();// create a new B
			// Machine using
			// the factory
			m.setName(p.getName());// assign the name of the model to the
			// machine
			m.setSpec((BSpec) ctx.getOutputRoot());// add the machine to the
			// collection of the B
			// specification's machines
			m.getSpec().setSystemMachine(m);// identify the machine as the
			// system machine
			
			
			for (Element e : p.getMembers()){
				if(e instanceof Class){
					
					EAnnotation annotation = UMLUtil.getEAnnotation(e, "uml2b", false);
					if (annotation!=null && annotation.getDetails().containsKey("fromRole")){	
						System.out.println("*************************************************************");
						System.out.println("INFO - at createSysMachine : Annotation fromRole found");					
						System.out.println("*************************************************************");
						BMachine m2 = BFactory.eINSTANCE.createBMachine();
						BMachine m3 = BFactory.eINSTANCE.createBMachine();// create a new B
						//UserAssignments, ContextMachine
						m2.setName("UserAssignments");
						m3.setName("ContextMachine");
						m2.setSpec((BSpec) ctx.getOutputRoot());
						m3.setSpec((BSpec) ctx.getOutputRoot());
						
						m.getUses().add(m2); m.getUses().add(m3);
					}
				}
			}
			return m;
		} else {
			return null;
		}
	}






	static public EObject GeneratePrimitiveTypes(ITransformationContext ctx, EObject o) {
		if (o instanceof Package) {
			Package p = (Package) o;
			BSpec bSpec=((BSpec)ctx.getOutputRoot());

			SharedTypes sharedTypes = BFactory.eINSTANCE.createSharedTypes();
			bSpec.setSharedTypes(sharedTypes);

			EList<PrimitiveType> primitiveTypeList = new BasicEList<PrimitiveType>();
			EObject object ;
			Type type;
			for (Iterator<EObject> iterator = p.eAllContents(); iterator.hasNext();) {				
				object = (EObject) iterator.next();
				if (UMLPackage.Literals.PROPERTY.isInstance(object)){
					type=((Property)object).getType();
					if (UMLPackage.Literals.PRIMITIVE_TYPE.isInstance(type)){
						if (!primitiveTypeList.contains(type)){
							primitiveTypeList.add((PrimitiveType) type);
						}						
					}					
				}				
			}


			//INTEGER
			Z zType = null; 

			//BOOLEAN
			Bool boolType = null; 

			//STRING (or define as an abstractSet) require the system machine 
			BType stringType = null;
			
			
//			//INTEGER
//			 zType = BFactory.eINSTANCE.createZ(); 
//			sharedTypes.getSharedTypes().add(zType);
//			//BOOLEAN
//			 boolType = BFactory.eINSTANCE.createBool(); 
//			sharedTypes.getSharedTypes().add( boolType);
//			//STRING (or define as an abstractSet) require the system machine 
//			if (bSpec.getSystemMachine()==null){
//				stringType = BFactory.eINSTANCE.createString(); 
//				sharedTypes.getSharedTypes().add( stringType);
//			}else{
//				stringType = BFactory.eINSTANCE.createBAbstractSet(); ((BAbstractSet)stringType).setName("STR2");
//				bSpec.getSystemMachine().getData().add((BAbstractSet)stringType);				
//			}







			//BType type;
			for (Iterator iterator = primitiveTypeList.iterator(); iterator.hasNext();) {
				PrimitiveType primitiveType = (PrimitiveType) iterator.next();
				System.out.println("INFO - PrimitiveType found: "+primitiveType.getName()+"("+primitiveType+")");

				if (UML_Util.isIntegerType(primitiveType)){
					if (zType==null){
						zType = BFactory.eINSTANCE.createZ(); 
						sharedTypes.getSharedTypes().add(zType);
					}
						
					//update trace
					((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(primitiveType).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
							+ ".GeneratePrimitiveTypes", EcoreUtil.getURI(zType).toString());

				}else if (UML_Util.isBooleanType(primitiveType)){
					if(boolType==null){
						boolType = BFactory.eINSTANCE.createBool(); 
						sharedTypes.getSharedTypes().add( boolType);
					}
					//update trace
					((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(primitiveType).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
							+ ".GeneratePrimitiveTypes", EcoreUtil.getURI( boolType ).toString());
				}else if (UML_Util.isStringType(primitiveType)){
					if (stringType==null){
						if (bSpec.getSystemMachine()==null){
							stringType = BFactory.eINSTANCE.createString(); 
							sharedTypes.getSharedTypes().add( stringType);
						}else{
							stringType = BFactory.eINSTANCE.createBAbstractSet(); ((BAbstractSet)stringType).setName("STR");
							bSpec.getSystemMachine().getData().add((BAbstractSet)stringType);				
						}
					}
					
					//update trace
					((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(primitiveType).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
							+ ".GeneratePrimitiveTypes", EcoreUtil.getURI( stringType).toString());
				} else{
					System.out.println("WARNING - Unknow PrimitiveType found: "+primitiveType.getName()+"("+primitiveType+")");
				}




			}





		} 
		return null;
	}


	static public EObject GeneratePrimitiveTypes_WRT_attributes(ITransformationContext ctx, EObject o) {
		if (o instanceof Package) {
			Package p = (Package) o;
			BSpec bSpec=((BSpec)ctx.getOutputRoot());

			SharedTypes sharedTypes = BFactory.eINSTANCE.createSharedTypes();
			bSpec.setSharedTypes(sharedTypes);

			//EList<PrimitiveType> primitiveTypeList = new BasicEList<PrimitiveType>();
			EObject object ;
			Type type;
			
			HashMap<Property, PrimitiveType> allPropeties  = new HashMap<Property, PrimitiveType>();
			
			for (Iterator<EObject> iterator = p.eAllContents(); iterator.hasNext();) {				
				object = (EObject) iterator.next();
				if (UMLPackage.Literals.PROPERTY.isInstance(object)){
					type=((Property)object).getType();
					if (UMLPackage.Literals.PRIMITIVE_TYPE.isInstance(type)){
						allPropeties.put(((Property)object), (PrimitiveType) type);						
//						if (!primitiveTypeList.contains(type)){
//							primitiveTypeList.add((PrimitiveType) type);
//						}						
					}					
				}				
			}


			//INTEGER
			Z zType = null; 

			//BOOLEAN
			Bool boolType = null; 

			//STRING (or define as an abstractSet) require the system machine 
			BType stringType = null;
			




			//BType type;
			for (Iterator<Property> iterator = allPropeties.keySet().iterator(); iterator.hasNext();) {
				Property property = iterator.next();
				PrimitiveType primitiveType = allPropeties.get(property);
				System.out.println("INFO - PrimitiveType found: "+primitiveType.getName()+"("+primitiveType+")");

				if (UML_Util.isIntegerType(primitiveType)){
					if (zType==null){
						zType = BFactory.eINSTANCE.createZ(); 
						sharedTypes.getSharedTypes().add(zType);
					}
						
					//update trace
					((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(primitiveType).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
							+ ".GeneratePrimitiveTypes_WRT_attributes", EcoreUtil.getURI(zType).toString());

				}else if (UML_Util.isBooleanType(primitiveType)){
					if(boolType==null){
						boolType = BFactory.eINSTANCE.createBool(); 
						sharedTypes.getSharedTypes().add( boolType);
					}
					//update trace
					((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(primitiveType).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
							+ ".GeneratePrimitiveTypes_WRT_attributes", EcoreUtil.getURI( boolType ).toString());
				}else if (UML_Util.isStringType(primitiveType)){

							stringType = BFactory.eINSTANCE.createBAbstractSet(); 
							String name = "T"+ property.getClass_().getName()+ property.getName().toUpperCase();
							((BAbstractSet)stringType).setName(name);
							bSpec.getSystemMachine().getData().add((BAbstractSet)stringType);				
						
					
					
					//update trace
					((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(primitiveType).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
							+ ".GeneratePrimitiveTypes_WRT_attributes", EcoreUtil.getURI( stringType).toString());
				} else{
					System.out.println("WARNING - Unknow PrimitiveType found: "+primitiveType.getName()+"("+primitiveType+")");
				}




			}





		} 
		return null;
	}
	
	
	




	//Generate a B Enumeration set of an UML enumeration and put it into the system machine 
	//require systemMachine
	/**
	 * @param ctx
	 * @param o
	 * @return a B Enumeration set the  UML enumeration (EObject parameter) and put it into the system machine (required) reachable from the transformationContext ctx 
	 */
	static public EObject GenerateEnumerationSet(ITransformationContext ctx,
			EObject o) {
		if (UMLPackage.Literals.ENUMERATION.isInstance(o)) {
			Enumeration enumeration = (Enumeration) o;
			
			//create BEn
			
			BEnumSet bEnumSet = BFactory.eINSTANCE.createBEnumSet();
			bEnumSet.setName(enumeration.getName());
			
			((BSpec)ctx.getOutputRoot()).getSystemMachine().getData().add(bEnumSet);
			
			
			BType type;
			//retrieve the BType to be used as a type for the values
			  type = (BType) EcoreUtil.getObjectByType(((BSpec)ctx.getOutputRoot()).getSharedTypes().getSharedTypes(),BPackage.Literals.Z);
			  if (type==null){//create
				  type = BFactory.eINSTANCE.createZ(); 
				  ((BSpec)ctx.getOutputRoot()).getSharedTypes().getSharedTypes().add(type);
				  
			  }
			  
			
			
			for (Iterator<EnumerationLiteral> iterator = enumeration.getOwnedLiterals().iterator(); iterator.hasNext();) {
				EnumerationLiteral literal =  iterator.next();
				BValue value = BFactory.eINSTANCE.createBValue();
				value.setName(literal.getName());				
				value.setType(type);
				bEnumSet.getValues().add(value);
				
			}
			
			
			return bEnumSet;
			
		}
	return null;
	}






	/**
	 * @param ctx
	 * @param o
	 * @return
	 * @throws Exception
	 * Generate the class variable within the sytemMachine. this rule does not support multiple root inheritance ()
	 */
	static public EObject GenerateClassBVariableInSystemMachine(ITransformationContext ctx, EObject o) {
			if (UMLPackage.Literals.CLASS.isInstance(o)) try{
				Class c = (Class) o;
				
				//list of the produced elements within the target model : useful to update the trace 			
				EList<EObject> producedElements =new BasicEList<EObject>();
				
				//retrieve the systemMachine
				BMachine machine= ((BSpec)ctx.getOutputRoot()).getSystemMachine();
				if(machine==null){
					System.out.println("ERROR  - at GenerateClassBVariableInSystemMachine("+c.getQualifiedName()+"): enable to retrieve the systemMachine !");				
					return null;
				}
				
				
				BVariable variable = BFactory.eINSTANCE.createBVariable();
				
				/**
				 * Only classes without stereotype have representing variable
				 * */
				//BVariable variable = null;
				//if(c.getAppliedStereotypes().isEmpty())
				//	variable = BFactory.eINSTANCE.createBVariable();
				//if(!c.getAppliedStereotypes().isEmpty())
				//	variable.setName("OverlapAssociationName");
				//else
				variable.setName(UML2B_NamingRules.getClassVariableLabel(c, (Package)ctx.getInputRoot()));
					
				
				//add the variable into systemMachine data collection.
				machine.getData().add(variable);
				producedElements.add(variable);
				
				BType type=null;
				
				//add typing predicates for each direct parent (if exists)
				EList<Class> superClasses = c.getSuperClasses();
				
				//no inheritance detected
				if (superClasses.isEmpty()){					
					//create a BAbstractSet for the set of possible Instance 
					EAnnotation annotation = UMLUtil.getEAnnotation(c, "uml2b", false);
					
					/**************************
					 * nguye_tm
					 * Class without stereotype: Not generate abstract SET, Generate Attributes and Operations... 
					 * ******************************************/
					if(c.getAppliedStereotypes().isEmpty()){
						
					BSet possibleInstances = null ;
					if (annotation!=null){
						if (annotation.getDetails().containsKey("RandomValues")){													
							System.out.println("INFO - at GenerateClassBVariables : RandomValues annotation detected for class " + c.getName() + annotation.getDetails().get("RandomValues"));
							// The random value must equal or greater to 1
							possibleInstances = BFactory.eINSTANCE.createBEnumSet();
							possibleInstances.setName(UML2B_NamingRules.getClassAbstractSetLabel(c, (Package)ctx.getInputRoot()));
							for(int i=1 ; i <= Integer.parseInt(annotation.getDetails().get("RandomValues")) ; i++){
								BValue value = BFactory.eINSTANCE.createBValue();
								value.setName(c.getName() + i);				
								value.setType((BType)possibleInstances);
								((BEnumSet)possibleInstances).getValues().add(value);
							}						
						}
						if (annotation.getDetails().containsKey("fromRole")){			
							System.out.println("INFO - at GenerateClassBVariables : fromRole annotation detected for class " + c.getName() + ", role :  " + annotation.getDetails().get("fromRole"));
							
							possibleInstances = BFactory.eINSTANCE.createBAbstractSet();
							possibleInstances.setName(UML2B_NamingRules.getClassAbstractSetLabel(c, (Package)ctx.getInputRoot())+"fromRole");
							
							BVariable varPossibleInstances = BFactory.eINSTANCE.createBVariable();
							varPossibleInstances.setName(UML2B_NamingRules.getClassAbstractSetLabel(c, (Package)ctx.getInputRoot()));
							machine.getData().add(varPossibleInstances);
							
							BAbstractSet users = BFactory.eINSTANCE.createBAbstractSet();
							users.setName("USERS");
							machine.getData().add(users);
							
							varPossibleInstances.setType(users);					
							TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
							varPossibleInstances.getTypingPredicate().add(typingPredicate);
							typingPredicate.setTypedElement(varPossibleInstances);
							typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
							typingPredicate.setType(varPossibleInstances.getType());
							
							BInitialisation initfromRole = BFactory.eINSTANCE.createBInitialisation();
							BSubstitution subfromRole = BFactory.eINSTANCE.createBSubstitution();
							BPrecondition prefromRole = BFactory.eINSTANCE.createBPrecondition();
							prefromRole.setBody("dom(roleOf |> {{" + annotation.getDetails().get("fromRole") + "}})");
							subfromRole.setPrecondition(prefromRole);
							initfromRole.setSubstitution(subfromRole);
							initfromRole.setInit(varPossibleInstances);		
							machine.getInitialisation().add(initfromRole);
							
							
						}	
					}else{
						possibleInstances = BFactory.eINSTANCE.createBAbstractSet();
						possibleInstances.setName(UML2B_NamingRules.getClassAbstractSetLabel(c, (Package)ctx.getInputRoot()));
					}
					
					//add the possibleInstances set into systemMachine data collection.
					machine.getData().add(possibleInstances);
					producedElements.add(variable);
					
					type= (BType)possibleInstances ;
					
					
					//main typing predicate
					
					variable.setType(type);					
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					variable.getTypingPredicate().add(typingPredicate);
					
					typingPredicate.setTypedElement(variable);
					typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
					typingPredicate.setType(type);
					
					/**********END****************
					 * Class without stereotype: Not generate abstract SET, Generate Attributes and Operations... 
					 * ******************************************/
					}
					
					}else if (superClasses.size()==1){//one parent case
					//Class <: SuperClass
					Class superClass = superClasses.get(0);
					
					//retrieve the superClass variable
					BVariable superClassVariable= UML2BUtil.getClassInstnacesVariable(superClass, ctx);
										
					variable.setType(superClassVariable);					
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					variable.getTypingPredicate().add(typingPredicate);
					typingPredicate.setTypedElement(variable);
					typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
					typingPredicate.setType(variable.getType());				
					
					
				
					
				}else{
					//multiple inheritance case (supported if there is a unique rootClass )
					// Class <: ROOTCLASS /*sPi*/
					// Class <: SuperClass1 & Class <: SuperClass2 ...
				
	//				//retrieve the rootClass which will type the current class ()
					
					
					EList<Class> rootSuperClasses = UML_Util.getRootSuperClasses(c);
					if (rootSuperClasses.size()>1){				
						System.out.println("WARNING  - at GenerateClassBVariableInSystemMachine("+c.getQualifiedName()+"): Multiple Inheritance is unsupported !");				
						return null;					
					}else if (rootSuperClasses.isEmpty()){				
						throw new Exception("ERROR  - at GenerateClassBVariableInSystemMachine("+c.getQualifiedName()+") Logic Error - check the code !");
						}					
					Class rootClass = rootSuperClasses.get(0);
					
					//retrieve the superClass variable
					BVariable rootClassVariable= UML2BUtil.getClassInstnacesVariable(rootClass, ctx);
					BAbstractSet rootClassAbstractSet = BUtil.getVariableType(rootClassVariable);
					//use the Set of Possible Instance (sPi) as type for the class variable
					type=rootClassAbstractSet;
					//main typing predicate					
					variable.setType(type);
					
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					variable.getTypingPredicate().add(typingPredicate);
					typingPredicate.setTypedElement(variable);
					typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
					typingPredicate.setType(type);
					
					
					
					//add typing predicates for each direct parent (if exists)
					
					for (Class superClass : superClasses) {

						//retrieve the superClass variable
						BVariable superClassVariable= UML2BUtil.getClassInstnacesVariable(superClass, ctx);
											
						variable.setType(superClassVariable);					
						typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
						variable.getTypingPredicate().add(typingPredicate);
						typingPredicate.setTypedElement(variable);
						typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
						typingPredicate.setType(variable.getType());		
					}
					
					
				}
				//TODOs to be continued 
				
				//Initialize the variable
				//TODO export as a mapping 
				BInitialisation init = BFactory.eINSTANCE.createBInitialisation();
				init.setInit(variable);		
				machine.getInitialisation().add(init);
				
				return variable;//(EObject) producedElements;	
				
				
				
			}catch(Exception e){
				System.out.println("EXCEPTION OCCURENCE AT : GenerateClassBVariableInSystemMachine("+((Class) o).getQualifiedName()+") !");e.printStackTrace();
			}
			return null;
		}






	public static Operation CreateSetter(Property p) throws Exception {
		if (p.getClass_() == null)
			throw new Exception("Error on CreateSetter : " + p.getName()
					+ " is not an Attribute !");

		EList<String> ownedParameterNames = new BasicEList<String>();
		EList<Type> ownedParameterTypes = new BasicEList<Type>();
		ownedParameterNames.add(p.getName() + "Value");
		ownedParameterTypes.add(p.getType());
		Operation op = p.getClass_().createOwnedOperation(
				"set" + toFirstUpperCase(p.getName()), ownedParameterNames,
				ownedParameterTypes);

		// Stereotype s=UMLFactory.eINSTANCE.createStereotype();
		// s.setName("UML2B_OperationBody");
		// op.applyStereotype(s);

		EAnnotation annotation = op.createEAnnotation("uml2b");
		annotation.getDetails().put(
				"body",
				p.getName() + ":= " + p.getName() + " \\/ {("
				+ p.getClass_().getName() + "Instance" + "|->"
				+ p.getName() + "Value" + ")}");

		return op;
	}

	public static Operation CreateGetter(Property p) throws Exception {
		if (p.getClass_() == null)
			throw new Exception("Error on CreateGetter : " + p.getName()
					+ " is not an Attribute !");

		EList<String> ownedParameterNames = new BasicEList<String>();
		EList<Type> ownedParameterTypes = new BasicEList<Type>();
		// ownedParameterNames.add(p.getName()+"Value");
		// ownedParameterTypes.add(p.getType());
		Operation op = p.getClass_().createOwnedOperation(
				"get" + toFirstUpperCase(p.getName()), ownedParameterNames,
				ownedParameterTypes);
		op.setType(p.getType());

		// Stereotype s=UMLFactory.eINSTANCE.createStereotype();
		// s.setName("UML2B_OperationBody");
		// op.applyStereotype(s);

		EAnnotation annotation = op.createEAnnotation("uml2b");
		annotation.getDetails().put("body",
				"out := " + p.getName() + "(Instance)");

		return op;
	}

	//		
	//
	//
	// public static Operation createConstructor(Class c) {
	// System.out.println("genConstructor : "+c.getName());
	// EList<String> ownedParameterNames= new BasicEList<String>();
	// EList<Type> ownedParameterTypes= new BasicEList<Type>();
	// // ownedParameterNames.add(p.getName()+"Value");
	// // ownedParameterTypes.add(p.getType());
	// Operation op =c.createOwnedOperation("new"+toFirstUpperCase(c.getName()),
	// ownedParameterNames, ownedParameterTypes);
	// op.setType(c);
	// op.setIsStatic(true);
	//		
	// // Stereotype s=UMLFactory.eINSTANCE.createStereotype();
	// // s.setName("UML2B_OperationBody");
	// // op.applyStereotype(s);
	//		
	// EAnnotation annotation= op.createEAnnotation("uml2b");
	// annotation.getDetails().put("body",
	// "ANY Instance WHERE Instance : "+c.getName().toUpperCase()+" - "+
	// c.getName() +" THEN \n"+
	// c.getName()+":= "+ c.getName()+" \\/ { Instance } || \n"+
	// "out := Instance"
	// );
	//		
	// return op;
	// }
	//		
	// public static Operation createConstructor2(Class c) {
	// System.out.println("genConstructor : "+c.getName());
	// EList<String> ownedParameterNames= new BasicEList<String>();
	// EList<Type> ownedParameterTypes= new BasicEList<Type>();
	// // ownedParameterNames.add("Instance");
	// // ownedParameterTypes.add(c);
	// Operation op
	// =c.createOwnedOperation(toFirstUpperCase(c.getName())+"_new",
	// ownedParameterNames, ownedParameterTypes);
	// //op.setType(c);
	// //op.setIsStatic(true);
	//		
	// // Stereotype s=UMLFactory.eINSTANCE.createStereotype();
	// // s.setName("UML2B_OperationBody");
	// // op.applyStereotype(s);
	//		
	//		 
	// op.createEAnnotation("uml2b").getDetails().put("isAConstructor", "true");
	//		
	// EAnnotation annotation= op.createEAnnotation("uml2b");
	// annotation.getDetails().put("body", c.getName()+":= "+
	// c.getName()+" \\/ { Instance } " );
	// annotation.getDetails().put("precondition", " Instance /: "+
	// c.getName());
	//		
	// return op;
	// }

	static public EObject GenerateConstructor(ITransformationContext ctx,
			EObject o) {
		if (o instanceof Class) {
			Class c = (Class) o;
			
			/**
			 * @author nguye_tm
			 * No constructor for class with stereotype
			 * */
			if(c.getAppliedStereotypes().isEmpty()){
				
				
				
			BOperation bop = null;
			
			if (c.isAbstract() ){				
				System.out.println("INFO  - at GenerateConstructor("+c.getQualifiedName()+"):  Abstract Class ");
				return null;
			}



			bop = BFactory.eINSTANCE.createBOperation();
			((BSpec) ctx.getOutputRoot()).getSystemMachine().getOperations()
			.add(bop);
			bop.setName(UML2B_NamingRules.getGeneratedConstructorLabel(c,(Package)ctx.getInputRoot()));

			BVariable var = null;// temp var
			BVariable variable = null;
			BVariable superVariable = null;
			BSet abstractSet = null;

			// retrieve the BVariable representing the set of existing instances
			variable = (BVariable) UML2BUtil
			.getFirstMappingTargetElementByType(c,
					BPackage.Literals.BVARIABLE, ctx);
			if (variable == null) {
				System.out
				.println("WARNING - at GenerateConstructor : no BVariable mapping found for the class ("
						+ c.getQualifiedName() + ")");
				return null;
			}
			var = variable;

			// retrieve the BAbstractSet representing the set of possible
			// instances
			abstractSet = (BSet)variable.getType();
			if (abstractSet == null) {
				System.out
				.println("WARNING - at GenerateConstructor : enable to found the type of the BVariable '"
						+ variable.getName() + "' !");
				return null;
			}

			// retrieve the super class
			try {
				Classifier superClassifier = UML_Util.getRootSuperClass(c);
				if (superClassifier != null
						&& UMLPackage.Literals.CLASS
						.isInstance(superClassifier)) {

					superVariable = UML2BUtil.getClassInstnacesVariable(
							(Class) superClassifier, ctx);

					// retrieve the BAbstractSet representing the set of
					// possible instances
					BAbstractSet as = BUtil.getVariableType(superVariable);
					if (as == null) {
						System.out
						.println("WARNING - at GenerateConstructor : no AbstractSet mapping found for the class ("
								+ superClassifier.getQualifiedName()
								+ ")");
						return null;
					} else if (as != abstractSet) {
						System.out
						.println("WARNING - at GenerateConstructor : AbstractSet mapping different from the variable typing for the class ("
								+ c.getQualifiedName() + ")");
						return null;
					}

				} else {
					superVariable = variable;

				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// declare the new instance as the constructor parameter
			BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
			bop.getParam().add(parm);
			parm.setName(UML2B_NamingRules.getClassInstanceLabel(c,(Package)ctx.getInputRoot()));
			parm.setType((BType)abstractSet);
			// Instance : CLASS
			TypingPredicate typingPredicate = BFactory.eINSTANCE
			.createTypingPredicate();
			parm.getTypingPredicate().add(typingPredicate);
			typingPredicate.setType((BType)abstractSet);
			typingPredicate.setOperator(TypingOperator.IN);
			typingPredicate.setTypedElement(parm);

			// Instance /: Class
			typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
			typingPredicate.setName(parm.getName() + " /: "
					+ superVariable.getName());
			parm.getTypingPredicate().add(typingPredicate);

			// body substitution
			String body = null;
			// add the new instance to the class variable
			// Class:= Class \/ { Instance }
			body = var.getName() + " := " + var.getName() + " \\/ {"
			+ parm.getName() + "}";

			// super classes
			for (Iterator<Classifier> iterator = c.allParents().iterator(); iterator
			.hasNext();) {
				Classifier classifier = (Classifier) iterator.next();

				if (UMLPackage.Literals.CLASS.isInstance(classifier)) {
					Class superClass = (Class) classifier;
					// retrieve the BVariable representing the set of existing
					// instances
					// System.out.println("INFO - at GenerateConstructor : retrieve sueprClass ("+superClass.getQualifiedName()+")");

					try {
						var = UML2BUtil.getClassInstnacesVariable(superClass,
								ctx);
						body = body.concat(" \n || " + var.getName() + " := "
								+ var.getName() + " \\/ {" + parm.getName()
								+ "}");
						System.out
						.println("INFO - at GenerateConstructor : retrieve sueprClass ("
								+ superClass.getQualifiedName() + ")");

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}

			// stBody
			bop.setBody(body);

			// uml constructor
			EList<String> ownedParameterNames = new BasicEList<String>();
			EList<Type> ownedParameterTypes = new BasicEList<Type>();
			Operation op = c.createOwnedOperation(toFirstUpperCase(c.getName())
					+ "_new", ownedParameterNames, ownedParameterTypes);
			op.setName(UML2B_NamingRules
					.getGeneratedConstructorSimplifiedLabel(c,(Package)ctx.getInputRoot()));

			EAnnotation annotation = op.createEAnnotation("uml2b");
			annotation.getDetails().put("autoGenerated", "true");
			annotation.getDetails().put("isAConstructor", "true");

			annotation.getDetails().put("body", body);
			annotation.getDetails().put("precondition",
					"Instance /: " + c.getName());
			// annotation.getDetails().put("precondition"," Instance : "+
			// c.getName().toUpperCase()+ "& Instance /: "+ c.getName());

			System.out.println("INFO - GenerateConstructor for : "
					+ c.getQualifiedName());

			return bop;}
		} else {
			return null;
		}
		return o;
	}
	
	

	static public EObject GenerateDestructor(ITransformationContext ctx,
			EObject o) {
		if (o instanceof Class) {// input element must be a package (or a
			// sub-type i.e Model )
			Class c = (Class) o;
			
			
			/**
			 * No constructor for class with stereotype
			 * */
			if(c.getAppliedStereotypes().isEmpty()){
				
			
				
			BOperation bop = null;
			
			if (c.isAbstract() ){				
				System.out.println("INFO  - at GenerateDestructor("+c.getQualifiedName()+"):  Abstract Class ");
				return null;
			}

			// //uml constructor
			// EList<String> ownedParameterNames= new BasicEList<String>();
			// EList<Type> ownedParameterTypes= new BasicEList<Type>();
			// Operation op
			// =c.createOwnedOperation(toFirstUpperCase(c.getName())+"_new",
			// ownedParameterNames, ownedParameterTypes);
			//		
			// EAnnotation annotation= op.createEAnnotation("uml2b");
			// annotation.getDetails().put("isAConstructor", "true");
			//		
			//			 
			// annotation.getDetails().put("body", c.getName()+":= "+
			// c.getName()+" \\/ { Instance } " );
			// annotation.getDetails().put("precondition", "Instance /: "+
			// c.getName());
			// //annotation.getDetails().put("precondition"," Instance : "+
			// c.getName().toUpperCase()+ "& Instance /: "+ c.getName());
			//		

			// create a new BOperation
			bop = BFactory.eINSTANCE.createBOperation();
			((BSpec) ctx.getOutputRoot()).getSystemMachine().getOperations()
			.add(bop);
			bop.setName(UML2B_NamingRules.getGeneratedDestructorLabel(c,(Package)ctx.getInputRoot()));

			// retrieve the BVariable representing the set of existing instances
			BVariable variable = (BVariable) UML2BUtil
			.getFirstMappingTargetElementByType(c,
					BPackage.Literals.BVARIABLE, ctx);
			if (variable == null) {
				System.out
				.println("WARNING - at GenerateDestructor : no BVariable mapping found for the class ("
						+ c.getQualifiedName() + ")");
				return null;
			}
			BVariable var = variable;

			// retrieve the BSet representing the set of possible
			// instances, this may be an enumerated set if RandomValues annotation exists
			BSet abstractSet = (BSet)var.getType();
			if (abstractSet == null) {
				System.out
				.println("WARNING - at GenerateDestructor : enable to found the type(AbstractSet) of the BVariable '"
						+ var.getName() + "' !");
				return null;
			}

			// declare the new instance as the constructor parameter
			BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
			bop.getParam().add(parm);
			parm.setName(UML2B_NamingRules.getClassInstanceLabel(c,(Package)ctx.getInputRoot()));
			parm.setType(var);
			// Instance : CLASS
			TypingPredicate typingPredicate = BFactory.eINSTANCE
			.createTypingPredicate();
			parm.getTypingPredicate().add(typingPredicate);
			typingPredicate.setType((BType)abstractSet);
			typingPredicate.setOperator(TypingOperator.IN);
			typingPredicate.setTypedElement(parm);

			// Instance : Class
			typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
			// typingPredicate.setName(parm.getName()+" : "+var.getName());
			// parm.getTypingPredicate().add(typingPredicate);
			parm.getTypingPredicate().add(typingPredicate);
			typingPredicate.setType(var);
			typingPredicate.setOperator(TypingOperator.IN);
			typingPredicate.setTypedElement(parm);

			// EObjectImpl obj = (EObjectImpl)model;
			// obj.eAllContents();

			// Instance /: subClassesUnion
			// retrieve sub classes
			EList<Class> subClasses = UML_Util.getSubClasses(c);

			//
			if (!subClasses.isEmpty()) {
				String invar = null;
				try {
					Iterator<Class> iterator = subClasses.iterator();
					var = UML2BUtil.getClassInstnacesVariable(iterator.next(),
							ctx);
					invar = parm.getName() + " /: (" + var.getName();
					for (; iterator.hasNext();) {
						// Class subClass = iterator.next() ;
						var = UML2BUtil.getClassInstnacesVariable(iterator
								.next(), ctx);
						invar = invar.concat(" \\/ " + var.getName());
					}
					invar = invar.concat(" )");
				} catch (Exception e) {
					e.printStackTrace();
				}
				typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				typingPredicate.setName(invar);
				parm.getTypingPredicate().add(typingPredicate);
			}
			//

			// body substitution
			String body = null;
			// add the new instance to the class variable
			// Class:= Class \/ { Instance }
			body = variable.getName() + " := " + variable.getName() + " - {"
			+ parm.getName() + "}";

			// super classes
			for (Iterator<Classifier> iterator = c.allParents().iterator(); iterator
			.hasNext();) {
				Classifier classifier =  iterator.next();

				if (UMLPackage.Literals.CLASS.isInstance(classifier)) {
					Class superClass = (Class) classifier;
					// retrieve the BVariable representing the set of existing
					// instances
					// System.out.println("INFO - at GenerateConstructor : retrieve sueprClass ("+superClass.getQualifiedName()+")");

					try {
						var = UML2BUtil.getClassInstnacesVariable(superClass,
								ctx);
						body = body
						.concat(" \n || " + var.getName() + " := "
								+ var.getName() + " - {"
								+ parm.getName() + "}");
						System.out
						.println("INFO - at GenerateDestructor : retrieve sueprClass ("
								+ superClass.getQualifiedName() + ")");

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}

			// stBody
			bop.setBody(body);

			// uml constructor
			EList<String> ownedParameterNames = new BasicEList<String>();
			EList<Type> ownedParameterTypes = new BasicEList<Type>();
			Operation op = c.createOwnedOperation(toFirstUpperCase(c.getName())
					+ "_free", ownedParameterNames, ownedParameterTypes);
			op.setName(UML2B_NamingRules
					.getGeneratedDestructorSimplifiedLabel(c,(Package)ctx.getInputRoot()));

			EAnnotation annotation = op.createEAnnotation("uml2b");
			annotation.getDetails().put("isAConstructor", "true");

			annotation.getDetails().put("body", body);
			annotation.getDetails().put("precondition",
					"Instance /: " + c.getName());
			// annotation.getDetails().put("precondition"," Instance : "+
			// c.getName().toUpperCase()+ "& Instance /: "+ c.getName());
			// update Trace

			((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(
					op).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
					+ ".GenerateDestructor_Internal", EcoreUtil.getURI(bop)
					.toString());

			System.out.println("INFO - GenerateConstructor for : "
					+ c.getName());

			return bop;
		} else {
			return null;
		}}
		return o;
	}

	//	
	//	
	// static public EObject GenerateGetter(ITransformationContext ctx,EObject
	// o){
	// if (o instanceof Class ){//input element must be a package (or a sub-type
	// i.e Model )
	// Class c = (Class)o;
	// BOperation bop = null;
	//		
	//		
	//		
	// //uml constructor
	// EList<String> ownedParameterNames= new BasicEList<String>();
	// EList<Type> ownedParameterTypes= new BasicEList<Type>();
	// Operation op
	// =c.createOwnedOperation(toFirstUpperCase(c.getName())+"_new",
	// ownedParameterNames, ownedParameterTypes);
	//		
	// EAnnotation annotation= op.createEAnnotation("uml2b");
	// annotation.getDetails().put("isAConstructor", "true");
	//		
	//			 
	// annotation.getDetails().put("body", c.getName()+":= "+
	// c.getName()+" \\/ { Instance } " );
	// annotation.getDetails().put("precondition", "Instance /: "+ c.getName());
	// //annotation.getDetails().put("precondition"," Instance : "+
	// c.getName().toUpperCase()+ "& Instance /: "+ c.getName());
	//		
	//		 
	// bop = BFactory.eINSTANCE.createBOperation();
	// ( (BSpec)
	// ctx.getOutputRoot()).getSystemMachine().getOperations().add(bop);
	// bop.setName(UML2B_NamingRules.getGeneratedConstructorLabel(c));
	//		
	//		
	//		
	// //retrieve the BVariable representing the set of existing instances
	// BVariable var =(BVariable)
	// UML2BUtil.getFirstMappingTargetElementByType(c,
	// BPackage.Literals.BVARIABLE, ctx);
	// if (var==null){
	// System.out.println("WARNING - at GenerateConstructor : no BVariable mapping found for the class ("+c.getQualifiedName()+")");
	// return null;
	// }
	//		
	// //retrieve the BAbstractSet representing the set of possible instances
	// BAbstractSet abstractSet = BUtil.getVariableType(var);
	// if (abstractSet==null){
	// System.out.println("WARNING - at GenerateConstructor : enable to found the type(AbstractSet) of the BVariable '"+var.getName()+"' !");
	// return null;
	// }
	//		
	// //declare the new instance as the constructor parameter
	// BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
	// bop.getParam().add(parm);
	// parm.setName(UML2B_NamingRules.getClassInstanceLabel(c));
	// parm.setType(abstractSet);
	// //Instance : CLASS
	// TypingPredicate typingPredicate =
	// BFactory.eINSTANCE.createTypingPredicate();
	// parm.getTypingPredicate().add(typingPredicate);
	// typingPredicate.setType(abstractSet);
	// typingPredicate.setOperator(TypingOperator.IN);
	// typingPredicate.setTypedElement(parm);
	//		
	// // Instance /: Class
	// typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
	// typingPredicate.setName(parm.getName()+" /: "+var.getName());
	// parm.getTypingPredicate().add(typingPredicate);
	//		
	//				
	// //body
	// //Class:= Class \/ { Instance }
	// bop.setBody(var.getName()+" := "+var.getName()+" \\/ {"+parm.getName()+"}");
	//		
	//		
	// System.out.println("GenerateConstructor for : "+c.getName());
	// return bop;
	// } else{return null;}
	// }
	//	
	//	
	//	

	public static String toFirstUpperCase(String s) {
		return String.valueOf(s.charAt(0)).toUpperCase()
		+ s.substring(1, s.length());
	}

	static public EObject InheritanceDisjonctionInvariant(
			ITransformationContext ctx, EObject o) {
		if (o instanceof Class) {
			Class c = (Class) o;

			try {
				// retrieve the system machine
				BMachine machine = UML2BUtil.getClassInstnacesVariable(c, ctx)
				.getDatadeclare();

				Class a, b;
				// collect subClasses
				EList<Class> subClasses = UML_Util.getSubClasses(c);
				// if more than two subClasses
				if (subClasses.size() > 1) {
					// express the intersection invariant (2by2) which is equal
					// to the union of the shared SubClasses
					for (int i = 0; i < (subClasses.size() - 1); i++) {
						for (int j = 1; j < subClasses.size(); j++) {
							// First subClass
							a = subClasses.get(i);
							BVariable variable_A = UML2BUtil
							.getClassInstnacesVariable(a, ctx);
							// Second subClass
							b = subClasses.get(j);
							BVariable variable_B = UML2BUtil
							.getClassInstnacesVariable(b, ctx);
							// create the invaiant
							BInvariant invariant = BFactory.eINSTANCE
							.createBInvariant();
							String invarBody = variable_A.getName() + " /\\ "
							+ variable_B.getName() + " = ";

							// retrieve shared subClasses
							EList<Class> sharedSubClasses = UML_Util
							.getSharedSubClasses(a, b);
							if (sharedSubClasses.isEmpty()) {// empty Set
								invarBody = invarBody.concat("{}");
							} else {// union of shared SubClasses
								Iterator<Class> iterator = sharedSubClasses
								.iterator();
								BVariable var = UML2BUtil
								.getClassInstnacesVariable(iterator
										.next(), ctx);
								invarBody = invarBody.concat(var.getName());
								for (; iterator.hasNext();) {
									var = UML2BUtil.getClassInstnacesVariable(
											iterator.next(), ctx);
									invarBody = invarBody.concat("\\/"
											+ var.getName());
								}

							}
							// set the invariant body and add it to the machine
							invariant.setBody(invarBody);
							machine.getInvariant().add(invariant);

						}
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	static public EObject GenerateAttributeBVariable(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property attribute = (Property) o;
			try {

				if (attribute.getType()==null){
					System.out.println("WARNING  -  untyped attribute ("+attribute.getQualifiedName()+") ");
					return null;
				}

				if (UML_Util.isMultivalued(attribute)&&(!attribute.isUnique() || attribute.isOrdered())){
					//throw new Exception("ERROR - unsupported case : non-unique or ordered attribute ("+attribute.getQualifiedName()+") ");
					System.out.println("WARNING  - at   unsupported case : non-unique or ordered attribute ("+attribute.getQualifiedName()+") ");
					return null;
				}

				if (UML2BUtil.getFirstMappingTargetElementByType(attribute.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at GenerateAttributeBVariable("+attribute.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				if (attribute.isDerived()){
					System.out.println("WARNING - Unsupported Case: Derived attribute("+attribute.getQualifiedName()+")!");
					//nop
				}else if (attribute.isStatic()){//static attribute
					//retrieve the machine where the class variable is declared 
					BMachine machine = UML2BUtil.getClassInstnacesVariable(attribute.getClass_(), ctx).getDatadeclare();

					BVariable attributeVariable = BFactory.eINSTANCE.createBVariable();
					machine.getData().add(attributeVariable);

					attributeVariable.setName(UML2B_NamingRules.getLabel(attribute, (Package)ctx.getInputRoot()));

					//retrieve the attribute type (primitive, datatype, enum, class)
					BType type=null;

					type = UML2BUtil.getBType(attribute.getType(), ctx);

					attributeVariable.setType(type);

					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					attributeVariable.getTypingPredicate().add(typingPredicate);
					typingPredicate.setTypedElement(attributeVariable);
					typingPredicate.setOperator(TypingOperator.IN);

					String additionalInvar=null;

					//					BInitialisation init=null;
					//					BValue val; val.
					//					init.getValues().

					if (UML_Util.isMultiplicty(attribute,0 ,1)){
						typingPredicate.setType(type);						
					}else if (UML_Util.isMultiplicty(attribute,1 ,1)){
						if (attribute.getDefault()==null || "".equals(attribute.getDefault()))
							throw new Exception("ERROR - the mondatory static attribute ("+attribute.getQualifiedName()+") must have a default value to be initialized");						
						typingPredicate.setType(type);
						throw new Exception("ERROR - unsupported case : initializing a mondatory and static attribute ("+attribute.getQualifiedName()+") ");
					}else if (UML_Util.isMultiplicty(attribute,0 ,-1)){
						typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
						typingPredicate.setType(type);
					}else if (UML_Util.isMultiplicty(attribute, 1,-1)){
						typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
						typingPredicate.setType(type);
						additionalInvar="";//instead of Pow1
						throw new Exception("ERROR - unsupported case : initializing a mondatory, static and multivalued attribute ("+attribute.getQualifiedName()+") ");
					}else if (attribute.lowerBound()>0){
						throw new Exception("ERROR - unsupported case :mondatory,static attribute ("+attribute.getQualifiedName()+") ");
					}else {//0..n
						typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
						typingPredicate.setType(type);
						additionalInvar="card("+attributeVariable.getName()+")<="+attribute.upperBound();
					}


					attributeVariable.setType(typingPredicate.getType());

					if (additionalInvar!=null){
						typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
						attributeVariable.getTypingPredicate().add(typingPredicate);
						typingPredicate.setName(additionalInvar);
					}



					//Initialization
					BInitialisation init = BFactory.eINSTANCE.createBInitialisation();
					init.setInit(attributeVariable);
					machine.getInitialisation().add(init);

					return attributeVariable;	

				}else{//non-static




					//retrieve the variable of the owning class
					BVariable classVariable = (BVariable)UML2BUtil.getClassInstnacesVariable(attribute.getClass_(), ctx);					
					//retrieve the machine where the class variable is declared 
					BMachine machine = classVariable.getDatadeclare();

					BVariable attributeVariable = BFactory.eINSTANCE.createBVariable();
					machine.getData().add(attributeVariable);

					attributeVariable.setName(UML2B_NamingRules.getLabel(attribute, (Package)ctx.getInputRoot()));

					//retrieve the attribute type (primitive, datatype, enum, class)
					BType type=null;

					type = UML2BUtil.getBType(attribute.getType(), ctx);

					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					attributeVariable.getTypingPredicate().add(typingPredicate);
					typingPredicate.setTypedElement(attributeVariable);
					typingPredicate.setOperator(TypingOperator.IN);					

					BComposedType attributeRelation = BFactory.eINSTANCE.createBComposedType();
					attributeRelation.setDom(classVariable);
					typingPredicate.setType(attributeRelation);
					machine.getSpec().getSharedTypes().getSharedTypes().add(attributeRelation);
					attributeRelation.setRan(type);

					attributeVariable.setType(attributeRelation);

					String additionalInvar=null;

					//					BInitialisation init=null;
					//					BValue val; val.
					//					init.getValues().

					if (UML_Util.isMultiplicty(attribute,0 ,1)){//0..1
						attributeRelation.setExpression(ComposedTypeExp.PARTIAL_FUNCTION);				
					}else if (UML_Util.isMultiplicty(attribute,1 ,1)){//1..1
						attributeRelation.setExpression(ComposedTypeExp.TOTAL_FUNCTION);						
					}else{//multi-valued 
						attributeRelation.setExpression(ComposedTypeExp.RELATION);
						if(attribute.lowerBound()==1){
							additionalInvar="dom("+attributeVariable.getName()+")="+classVariable.getName();
						}else if(attribute.lowerBound()>1){
							additionalInvar="!cc.( cc:dom("+attributeVariable.getName()+") => card("+attributeVariable.getName()+"[{cc}])>="+attribute.lowerBound()+")";
						}

						if(attribute.upperBound()!=-1){
							if(additionalInvar==null) 
								additionalInvar="!cc.( cc:dom("+attributeVariable.getName()+") => card("+attributeVariable.getName()+"[{cc}])<="+attribute.upperBound()+")";
							else additionalInvar=additionalInvar+"\n & !cc.( cc:dom("+attributeVariable.getName()+") => card("+attributeVariable.getName()+"[{cc}])<="+attribute.upperBound()+")";

						}

					}						


					if (additionalInvar!=null){
						typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
						attributeVariable.getTypingPredicate().add(typingPredicate);
						typingPredicate.setName(additionalInvar);
					}



					//Initialization
					BInitialisation init = BFactory.eINSTANCE.createBInitialisation();
					init.setInit(attributeVariable);
					machine.getInitialisation().add(init);



					return attributeVariable;						
				}














				//return attributeVariable;		
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : GenerateAttributeBVariable!");e.printStackTrace();
			}

		}
		return null;
	}


	
	static public EObject GenerateUniqueMonovaluedAttributeBVariable(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && UML_Util.isAttribute((Property) o)) {
			Property attribute = (Property) o;
			try {

				if (attribute.getType()==null){
					System.out.println("WARNING  - at GenerateUniqueMonovaluedAttributeBVariable : untyped attribute ("+attribute.getQualifiedName()+") ");
					return null;
				}

				if (UML_Util.isMultivalued(attribute)  || !attribute.isUnique() ){
					//throw new Exception("ERROR - unsupported case : non-unique or ordered attribute ("+attribute.getQualifiedName()+") ");
					System.out.println("INFO  - at GenerateUniqueMonovaluedAttributeBVariable("+attribute.getQualifiedName()+"):  multivalued or non-unique attribute ");
					return null;
				}

				if (UML2BUtil.getFirstMappingTargetElementByType(attribute.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at GenerateUniqueMonovaluedAttributeBVariable("+attribute.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				if (attribute.isDerived()){
					System.out.println("WARNING - Unsupported Case: Derived attribute("+attribute.getQualifiedName()+")!");
					//nop
				}else {//non-static




					//retrieve the variable of the owning class
					BVariable classVariable = (BVariable)UML2BUtil.getClassInstnacesVariable(attribute.getClass_(), ctx);					
					//retrieve the machine where the class variable is declared 
					BMachine machine = classVariable.getDatadeclare();

					BVariable attributeVariable = BFactory.eINSTANCE.createBVariable();
					machine.getData().add(attributeVariable);

					attributeVariable.setName(UML2B_NamingRules.getLabel(attribute, (Package)ctx.getInputRoot()));

					//retrieve the attribute type (primitive, datatype, enum, class)
					BType type=null;

					type = UML2BUtil.getBType(attribute.getType(), ctx);

					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					attributeVariable.getTypingPredicate().add(typingPredicate);
					typingPredicate.setTypedElement(attributeVariable);
					typingPredicate.setOperator(TypingOperator.IN);					

					BComposedType attributeRelation = BFactory.eINSTANCE.createBComposedType();
					attributeRelation.setDom(classVariable);
					typingPredicate.setType(attributeRelation);
					machine.getSpec().getSharedTypes().getSharedTypes().add(attributeRelation);
					attributeRelation.setRan(type);

					attributeVariable.setType(attributeRelation);



					//					BInitialisation init=null;
					//					BValue val; val.
					//					init.getValues().

					if (UML_Util.isMultiplicty(attribute,0 ,1)){//0..1
						attributeRelation.setExpression(ComposedTypeExp.PARTIAL_INJECTION);				
					}else if (UML_Util.isMultiplicty(attribute,1 ,1)){//1..1
						attributeRelation.setExpression(ComposedTypeExp.TOTAL_INJECTION);						
					}					


					//Initialization
					BInitialisation init = BFactory.eINSTANCE.createBInitialisation();
					init.setInit(attributeVariable);
					machine.getInitialisation().add(init);



					return attributeVariable;						
				}














				//return attributeVariable;		
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : GenerateUniqueMonovaluedAttributeBVariable!");e.printStackTrace();
			}

		}
		return null;
	}
	
	
	

	static public EObject Attr_UpdateDestructor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				if (p.getType()==null){
					System.out.println("WARNING  -  untyped attribute ("+p.getQualifiedName()+") ");
					return null;
				}

				if (p.isStatic()){
					System.out.println("WARNING  - at Attr_UpdateDestructor:  static attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_UpdateDestructor("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				// retrieve the attribute relation variable
				if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_UpdateDestructor: unmapped attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				BVariable relation = UML2BUtil.getAttributeBVariable(p, ctx);
				
				BOperation operation = null;
				//TODO resolve abstraction properly
				if (!p.getClass_().isAbstract()){
					// retrieve the class destructor operation
					operation = UML2BUtil.getBDestructor(p.getClass_(), ctx);
				
					
	
					// subtract the destroyed instance from the attribute
					// relation(e.g., Attribute := {Instance}<<|Attribute).
					operation.setBody(operation.getBody() + "\n || "
							+ relation.getName() + ":= {"
							+ operation.getParam().get(0).getName() + "}<<|"
							+ relation.getName());
				
				
					}
//				else{
//					operation = BFactory.eINSTANCE.createBOperation();
//				}
				
				
				
				// process all subClasses
				for (Iterator<Class> iterator = UML_Util.getAllSubClasses(
						p.getClass_()).iterator(); iterator.hasNext();) {
					Class subClass = (Class) iterator.next();
					if (!subClass.isAbstract()){

						// retrieve the class destructor operation
						BOperation op = UML2BUtil.getBDestructor(subClass, ctx);
	
						// subtract the destroyed instance from the attribute
						// relation(e.g., Attribute := {Instance}<<|Attribute).
						if (op.getBody().indexOf(relation.getName()) == -1) {
							op.setBody(op.getBody() + "\n || " + relation.getName()
									+ ":= {" + op.getParam().get(0).getName()
									+ "}<<|" + relation.getName());
	
						}
					}
				}

				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Attr_UpdateDestructor("+p.getQualifiedName()+")!");e.printStackTrace();
			}

		}
		return null;
	}

	static public EObject Attr_UpdateConstructor(ITransformationContext ctx,
			EObject o) {
		
		System.out.println("INFO - attrib upConst : "
				+ o);
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {

			Property p = (Property) o;
			// mandatory attribute
			if (p.getLower() != 0) {
				System.out.println("INFO - attrib upConst : "
						+ p.getQualifiedName());

				try {
					if (p.getType()==null){
						System.out.println("WARNING  - at Attr_UpdateConstructor :  untyped attribute ("+p.getQualifiedName()+") ");
						return null;
					}

					if (p.isStatic()){
						System.out.println("WARNING  - at Attr_UpdateConstructor :  static attribute ("+p.getQualifiedName()+") ");
						return null;
					}


					//TODO change to CTM requirement
					if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at Attr_UpdateConstructor("+p.getQualifiedName()+"):  unmapped owning Class  ");
						return null;
					}
					//					if (UML_Util.isMultivalued(p)){
					//						System.out.println("WARNING  - at Attr_UpdateConstructor  : unsupported multivalued attribute ("+p.getQualifiedName()+") ");
					//						//throw new Exception("ERROR - 
					//						return null;
					//					}




					// retrieve the attribute relation variable
					if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at Attr_UpdateConstructor :  unmapped attribute ("+p.getQualifiedName()+") ");
						return null;
					}					
					
					
					BVariable variable = UML2BUtil.getAttributeBVariable(p, ctx);
					if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(variable
							.getType())) {
						throw new Exception(
								"ERROR - the variable of the attribute( "
								+ variable.getName()
								+ " ) is not a relation!");
					}
					BComposedType relation = (BComposedType) variable.getType();

					System.out.println("INFO - Attr_UpdateConstructor : "
							+ p.getQualifiedName());
					// retrieve the class constructor operation
					BOperation operation = null;
					
					//check abstraction
					if (!p.getClass_().isAbstract()){
						operation=UML2BUtil.getBConstructor(p.getClass_(), ctx);
//					}else{
//						operation = BFactory.eINSTANCE.createBOperation();
//					}
					
						// add the attribute value as a parameter for the
						// constructor
						BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
						operation.getParam().add(parm);
						parm.setName(UML2B_NamingRules
								.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()) );
						parm.setType(relation.getRan());
						// attributeValue : Type
						TypingPredicate typingPredicate = BFactory.eINSTANCE
						.createTypingPredicate();
						parm.getTypingPredicate().add(typingPredicate);
						typingPredicate.setType(parm.getType());
						if (UML_Util.isMultivalued(p)){
							typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
						}else{
							typingPredicate.setOperator(TypingOperator.IN);
						}
						typingPredicate.setTypedElement(parm);
	
						//					//additional invar for min & max cardinalities
						//					String additionalInvars=null;
						//					
						//					if (p.lowerBound()>1){
						//						
						//					
						//					}
	
	
	
						if ( (p.upperBound()!=-1) && (p.upperBound()>1) ){//max card Invar
							//card(AttrVar[{Instance}])<upperBound
							typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
							parm.getTypingPredicate().add(typingPredicate);
							typingPredicate.setName("card("+parm.getName()+")<="+p.upperBound());					
	
						}
	
						if (p.lowerBound()>1){//min card Invar
							//AttrVar[{Instance}]/={}
							typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
							parm.getTypingPredicate().add(typingPredicate);
							typingPredicate.setName("card("+parm.getName()+")>="+p.lowerBound());					
	
						}
	
	
	
	
						//
						String body=null;
						//case of function
						// Attribute := Attribute \/ {(Instance|->AttributeValue)} ).
						if (UML_Util.isMultivalued(p)){
							//Attribute := Attribute \/ ({Instance}*AttributeValues}) )
							body= variable.getName() + ":= " + variable.getName()
							+ " \\/ ({" + operation.getParam().get(0).getName()+ "}*" + parm.getName() + ")";
	
						}else{
							body= variable.getName() + ":= " + variable.getName()
							+ " \\/ {(" + operation.getParam().get(0).getName()+ "|->" + parm.getName() + ")}";
						}
	
						operation.setBody(operation.getBody() + "\n || " +body);
					
						}
					// process subClasses
					//TODO Modularize SubClasses update
					for (Iterator iterator = UML_Util.getAllSubClasses(
							p.getClass_()).iterator(); iterator.hasNext();) {
						Class subClass = (Class) iterator.next();
						if (!subClass.isAbstract())	{
						System.out
						.println("INFO - Attr_UpdateConstructor for subClass: "
								+ subClass.getName());
						// retrieve the class constructor operation
						BOperation op = UML2BUtil
						.getBConstructor(subClass, ctx);
						if (op.getBody().indexOf(variable.getName()) == -1) {
							 BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
							op.getParam().add(parm);
							parm.setName(UML2B_NamingRules
									.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
							parm.setType(relation.getRan());
							// attributeValue : Type
							 TypingPredicate typingPredicate = BFactory.eINSTANCE
							.createTypingPredicate();
							parm.getTypingPredicate().add(typingPredicate);
							typingPredicate.setType(parm.getType());
							if (UML_Util.isMultivalued(p)){
								typingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
							}else{
								typingPredicate.setOperator(TypingOperator.IN);
							}
							typingPredicate.setTypedElement(parm);						


							if ( (p.upperBound()!=-1) && (p.upperBound()>1) ){//max card Invar
								//card(AttrVar[{Instance}])<upperBound
								typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
								parm.getTypingPredicate().add(typingPredicate);
								typingPredicate.setName("card("+parm.getName()+")<="+p.upperBound());					

							}

							if (p.lowerBound()>1){//min card Invar
								//AttrVar[{Instance}]/={}
								typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
								parm.getTypingPredicate().add(typingPredicate);
								typingPredicate.setName("card("+parm.getName()+")>="+p.lowerBound());					

							}



							String body;
							if (UML_Util.isMultivalued(p)){
								//Attribute := Attribute \/ ({Instance}*AttributeValues}) )
								body= variable.getName() + ":= " + variable.getName()
								+ " \\/ ({" + op.getParam().get(0).getName()+ "}*" + parm.getName() + ")";

							}else{
								body= variable.getName() + ":= " + variable.getName()
								+ " \\/ {(" + op.getParam().get(0).getName()+ "|->" + parm.getName() + ")}";
							}

							op.setBody(op.getBody()  + "\n || " +body);

						}
						}
					}

					return operation;
				} catch (Exception e) {
					System.out.println("EXCEPTION OCCURENCE AT : Attr_UpdateConstructor  !");e.printStackTrace();
				}

			}

		}
		return null;
	}

	
	
	
	static public EObject UniqueAttr_UpdateConstructor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {

			Property p = (Property) o;
			// mandatory attribute
			if (p.getLower() != 0) {

				
				if (UML_Util.isMultivalued(p)  || !p.isUnique() ){
					//throw new Exception("ERROR - unsupported case : non-unique or ordered attribute ("+attribute.getQualifiedName()+") ");
					System.out.println("INFO  - at UniqueAttr_UpdateConstructor("+p.getQualifiedName()+"):  multivalued or non-unique attribute ");
					return null;
				}
				try {
					if (p.getType()==null){
						System.out.println("WARNING  - at UniqueAttr_UpdateConstructor :  untyped attribute ("+p.getQualifiedName()+") ");
						return null;
					}

					if (p.isStatic()){
						System.out.println("WARNING  - at UniqueAttr_UpdateConstructor :  static attribute ("+p.getQualifiedName()+") ");
						return null;
					}


					//TODO change to CTM requirement
					if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at UniqueAttr_UpdateConstructor("+p.getQualifiedName()+"):  unmapped owning Class  ");
						return null;
					}
					//					if (UML_Util.isMultivalued(p)){
					//						System.out.println("WARNING  - at UniqueAttr_UpdateConstructor  : unsupported multivalued attribute ("+p.getQualifiedName()+") ");
					//						//throw new Exception("ERROR - 
					//						return null;
					//					}




					// retrieve the attribute relation variable
					if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at UniqueAttr_UpdateConstructor :  unmapped attribute ("+p.getQualifiedName()+") ");
						return null;
					}					
					BVariable variable = UML2BUtil.getAttributeBVariable(p, ctx);
					if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(variable
							.getType())) {
						throw new Exception(
								"ERROR - the variable of the attribute( "
								+ variable.getName()
								+ " ) is not a relation!");
					}
					BComposedType relation = (BComposedType) variable.getType();

					System.out.println("INFO - UniqueAttr_UpdateConstructor : "
							+ p.getName());
					
					BOperation operation =null;
					
					if (!p.getClass_().isAbstract()){
					
					// retrieve the class constructor operation
					operation = UML2BUtil.getBConstructor(p
							.getClass_(), ctx);
					
					// add the attribute value as a parameter for the
					// constructor
					BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
					operation.getParam().add(parm);
					parm.setName(UML2B_NamingRules
							.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
					parm.setType(relation.getRan());
					// attributeValue : Type
					TypingPredicate typingPredicate = BFactory.eINSTANCE
					.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setType(parm.getType());				
					typingPredicate.setOperator(TypingOperator.IN);					
					typingPredicate.setTypedElement(parm);

					//unique invar
					//value /:ran(attr)					
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setName(parm.getName()+" /:ran("+variable.getName()+")");		

					
					String body=null;
					//case of function
					// Attribute := Attribute \/ {(Instance|->AttributeValue)} ).
					
						body = variable.getName() + ":= " + variable.getName()
						+ " \\/ {(" + operation.getParam().get(0).getName()+ "|->" + parm.getName() + ")}";
					

					operation.setBody(operation.getBody() + "\n || " +body);
					}
//					else{
//						operation = BFactory.eINSTANCE.createBOperation();
//					}
					
					
					// process subClasses
					//TODO Modularize SubClasses update
					for (Iterator iterator = UML_Util.getAllSubClasses(
							p.getClass_()).iterator(); iterator.hasNext();) {
						Class subClass = (Class) iterator.next();
						if (!subClass.isAbstract()){
							
						
						System.out
						.println("INFO - UniqueAttr_UpdateConstructor for subClass: "
								+ subClass.getName());
						// retrieve the class constructor operation
						BOperation op = UML2BUtil
						.getBConstructor(subClass, ctx);
						if (op.getBody().indexOf(variable.getName()) == -1) {
							 BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
							op.getParam().add(parm);
							parm.setName(UML2B_NamingRules
									.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
							parm.setType(relation.getRan());
							// attributeValue : Type
							 TypingPredicate typingPredicate = BFactory.eINSTANCE
							.createTypingPredicate();
							parm.getTypingPredicate().add(typingPredicate);
							typingPredicate.setType(parm.getType());
							typingPredicate.setOperator(TypingOperator.IN);
							typingPredicate.setTypedElement(parm);				
							
							
							//unique invar
							//value /:ran(attr)					
							typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
							parm.getTypingPredicate().add(typingPredicate);
							typingPredicate.setName(parm.getName()+" /:ran("+variable.getName()+")");	


							 String body = variable.getName() + ":= " + variable.getName()
								+ " \\/ {(" + op.getParam().get(0).getName()+ "|->" + parm.getName() + ")}";
							

							op.setBody(op.getBody()  + "\n || " +body);

						}
						}						
					}

					return operation;
				} catch (Exception e) {
					System.out.println("EXCEPTION OCCURENCE AT : UniqueAttr_UpdateConstructor  !");e.printStackTrace();
				}

			}

		}
		return null;
	}



	static public EObject Attr_UpdateConstructor_DefaultSupport(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {

			Property p = (Property) o;
			// mandatory attribute
			if (UML_Util.hasValidDefault(p) && p.upperBound()==1) {

				try {
					if (p.getType()==null){
						System.out.println("WARNING  - at Attr_UpdateConstructor_DefaultSupport :  untyped attribute ("+p.getQualifiedName()+") ");
						return null;
					}

					if (p.isStatic()){
						System.out.println("WARNING  - at Attr_UpdateConstructor_DefaultSupport :  static attribute ("+p.getQualifiedName()+") ");
						return null;
					}


					//TODO change to CTM requirement
					if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at Attr_UpdateConstructor_DefaultSupport("+p.getQualifiedName()+"):  unmapped owning Class  ");
						return null;
					}
					//					if (UML_Util.isMultivalued(p)){
					//						System.out.println("WARNING  - at Attr_UpdateConstructor_DefaultSupport  : unsupported multivalued attribute ("+p.getQualifiedName()+") ");
					//						//throw new Exception("ERROR - 
					//						return null;
					//					}




					// retrieve the attribute relation variable
					if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at Attr_UpdateConstructor_DefaultSupport :  unmapped attribute ("+p.getQualifiedName()+") ");
						return null;
					}					
					BVariable variable = UML2BUtil.getAttributeBVariable(p, ctx);
					if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(variable
							.getType())) {
						throw new Exception(
								"ERROR - the variable of the attribute( "
								+ variable.getName()
								+ " ) is not a relation!");
					}
					BComposedType relation = (BComposedType) variable.getType();

					System.out.println("INFO - Attr_UpdateConstructor_DefaultSupport : "
							+ p.getName());
					
					
					//AB format of the value (eg TRUE,FALSE ...)
					String defaultValue = UML_Util.getValidDefault(p).toString().toUpperCase();
					
					
					// retrieve the class constructor operation
					BOperation operation = null;
					
					if (!p.getClass_().isAbstract()){
					
						operation=UML2BUtil.getBConstructor(p.getClass_(), ctx);
											//
						String body=null;
						//case of function
				
	
						body= variable.getName() + ":= " + variable.getName()
						+ " \\/ {(" + operation.getParam().get(0).getName()+ "|->" + defaultValue  + ")}";
	
						operation.setBody(operation.getBody() + " || " +body);
					}
//					else{
//						operation = BFactory.eINSTANCE.createBOperation();
//					}
					
					
					// process subClasses
					//TODO Modularize SubClasses update
					for (Iterator iterator = UML_Util.getAllSubClasses(
							p.getClass_()).iterator(); iterator.hasNext();) {
						Class subClass = (Class) iterator.next();
						if (!subClass.isAbstract()){
													
							System.out
							.println("INFO - Attr_UpdateConstructor_DefaultSupport for subClass: "
									+ subClass.getName());
							// retrieve the class constructor operation
							BOperation op = UML2BUtil
							.getBConstructor(subClass, ctx);
							if (op.getBody().indexOf(variable.getName()) == -1) {
	
								 String body = variable.getName() + ":= " + variable.getName()
								+ " \\/ {(" + op.getParam().get(0).getName()+ "|->" + defaultValue + ")}";
	
	
								op.setBody(op.getBody()  + " || " +body);
	
							}
						}
					}





					return operation;
				} catch (Exception e) {
					System.out.println("EXCEPTION OCCURENCE AT : Attr_UpdateConstructor_DefaultSupport("+p.getQualifiedName()+")  !");e.printStackTrace();
				}

			}
			else {
				System.out.println("\n INFO  - at Attr_UpdateConstructor_DefaultSupport :  default value of the attribute ("+p.getQualifiedName()+") : " +UML_Util.getValidDefault(p));
				return Attr_UpdateConstructor(ctx, o);
			}

		}
		return null;
	}

		




	static public EObject Attr_static_GenerateAccessor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				if (p.getType()==null){
					System.out.println("WARNING  -  untyped attribute ("+p.getQualifiedName()+") ");
					return null;
				}		

				if (!p.isStatic()){
					System.out.println("WARNING  -  non-static attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - at Attr_static_GenerateAccessor: non-static attribut entry ("+p.getQualifiedName()+")");
					return null;
				}

				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_static_GenerateAccessor("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedAttributeAccessorLabel(p, (Package)ctx.getInputRoot()));


				//retrieve the variable of the attribute				
				BVariable attrVariable = UML2BUtil.getAttributeBVariable(p, ctx);
				String body="result := "+attrVariable.getName();				

				operation.setBody(body);				



				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Attr_static_GenerateAccessor!");e.printStackTrace();
			}

		}
		return null;
	}

	static public EObject Attr_GenerateAccessor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				//				if (p.getType()==null){
				//					System.out.println("WARNING  -  untyped attribute ("+p.getQualifiedName()+") ");
				//					return null;
				//				}		

				if (p.isStatic()){
					System.out.println("WARNING  -  static attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - at Attr_static_GenerateAccessor: non-static attribut entry ("+p.getQualifiedName()+")");
					return null;
				}

				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_GenerateAccessor("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedAttributeAccessorLabel(p, (Package)ctx.getInputRoot()));

				//retrieve the variable of the attribute		
				if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  -  unmapped attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				BVariable attrVariable = UML2BUtil.getAttributeBVariable(p, ctx);

				BComposedType attRelation = (BComposedType) attrVariable.getType();

				//add operation to the machine containing the attribute variable
				attrVariable.getDatadeclare().getOperations().add(operation);


				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(p.getClass_(),(Package)ctx.getInputRoot()));
				parm.setType(attRelation.getDom());
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);
				
				// Instance /: dom(relation)
				typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				typingPredicate.setName(parm.getName() + " : dom(" + attrVariable.getName() + ")");
				parm.getTypingPredicate().add(typingPredicate);

				//Body substitution
				String body=null;		


				body="returnedData := "+attrVariable.getName()+"("+parm.getName()+")";

				operation.setBody(body);				



				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Attr_GenerateAccessor!");e.printStackTrace();
			}

		}
		return null;
	}



	static public EObject Attr_GenerateSetter(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				//				if (p.getType()==null){
				//					System.out.println("WARNING  -  untyped attribute ("+p.getQualifiedName()+") ");
				//					return null;
				//				}		

				if (p.isStatic()){
					System.out.println("WARNING  - at Attr_GenerateSetter: static attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - 
					return null;
				}

				//				if (UML_Util.isMultivalued(p)){
				//					System.out.println("WARNING  - at Attr_GenerateSetter : multivalued attribute ("+p.getQualifiedName()+") ");
				//					//throw new Exception("ERROR - at Attr_GenerateSetter: non-static attribut entry ("+p.getQualifiedName()+")");
				//					return null;
				//				}

				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_GenerateSetter("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedMonovaluedAttributeSetterLabel(p, (Package)ctx.getInputRoot()));

				//retrieve the variable of the attribute		
				if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_GenerateSetter unmapped attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				BVariable attrVariable = UML2BUtil.getAttributeBVariable(p, ctx);

				BComposedType attRelation = (BComposedType) attrVariable.getType();

				//add operation to the machine containing the attribute variable
				attrVariable.getDatadeclare().getOperations().add(operation);
				System.out.println("INFO  - > Attr_GenerateSetter("+p.getQualifiedName()+")");

				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(p.getClass_(),(Package)ctx.getInputRoot()));
				parm.setType(attRelation.getDom());
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);

				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
				valueParm.setType(attRelation.getRan());
				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());
				if  (UML_Util.isMultivalued(p))
					valueTypingPredicate.setOperator(TypingOperator.SUB_SET_EQUAL);
				else
					valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);

				//new value
				if  (UML_Util.isMultivalued(p)){
					//skip
				}else{//(Instance |->value) /: attribute
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName("("+parm.getName()+"|-> "+valueParm.getName()+") /: "+attrVariable.getName());	
				}




				if ( (p.upperBound()!=-1) && (p.upperBound()>1) ){//max card Invar
					//card(AttrVar[{Instance}])<upperBound
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName("card("+valueParm.getName()+")<="+p.upperBound());					

				}

				if (p.lowerBound()>1){//min card Invar
					//AttrVar[{Instance}]/={}
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName("card("+valueParm.getName()+")>="+p.lowerBound());					

				}






				//Body substitution
				String body=null;		
				if  (UML_Util.isMultivalued(p)){
					//Attribut:= ({Instance}<<|Attribut)\/ ({Instance}*Values)
					body=attrVariable.getName()+":= ({"+parm.getName()+"}<<|"+attrVariable.getName()+")\\/ ({"+parm.getName()+"}*"+valueParm.getName()+")";

				}else{		
					//Attribut:= ({Instance}<<|Attribut)\/ {(Instance|-> Value)}
					body=attrVariable.getName()+":= ({"+parm.getName()+"}<<|"+attrVariable.getName()+")\\/ {("+parm.getName()+"|-> "+valueParm.getName()+")}";
				}

				operation.setBody(body);				



				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Attr_GenerateSetter!");e.printStackTrace();
			}

		}
		return null;
	}

	
	
	
	
	
	

	static public EObject UniqueAttr_GenerateSetter(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				if (UML_Util.isMultivalued(p)  || !p.isUnique() ){
					//throw new Exception("ERROR - unsupported case : non-unique or ordered attribute ("+attribute.getQualifiedName()+") ");
					System.out.println("WARNING  - at UniqueAttr_GenerateSetter("+p.getQualifiedName()+"):  multivalued or non-unique attribute ");
					return null;
				}
				
				if (p.isStatic()){
					System.out.println("WARNING  - at UniqueAttr_GenerateSetter: static attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - 
					return null;
				}

				//				if (UML_Util.isMultivalued(p)){
				//					System.out.println("WARNING  - at UniqueAttr_GenerateSetter : multivalued attribute ("+p.getQualifiedName()+") ");
				//					//throw new Exception("ERROR - at UniqueAttr_GenerateSetter: non-static attribut entry ("+p.getQualifiedName()+")");
				//					return null;
				//				}

				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at UniqueAttr_GenerateSetter("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedMonovaluedAttributeSetterLabel(p, (Package)ctx.getInputRoot()));

				//retrieve the variable of the attribute		
				if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at UniqueAttr_GenerateSetter unmapped attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				BVariable attrVariable = UML2BUtil.getAttributeBVariable(p, ctx);

				BComposedType attRelation = (BComposedType) attrVariable.getType();

				//add operation to the machine containing the attribute variable
				attrVariable.getDatadeclare().getOperations().add(operation);

				
				System.out.println("INFO  - > UniqueAttr_GenerateSetter("+p.getQualifiedName()+")");

				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(p.getClass_(),(Package)ctx.getInputRoot()));
				parm.setType(attRelation.getDom());
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);

				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
				valueParm.setType(attRelation.getRan());
				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());
				valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);

				//(Instance |->value) /: attribute & value /: ran(attribute) == value /: ran(attribute) 
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName(valueParm.getName()+" /: ran("+attrVariable.getName()+")");	
				








				//Body substitution
				String body=null;		
					//Attribut:= ({Instance}<<|Attribut)\/ {(Instance|-> Value)}
					body=attrVariable.getName()+":= ({"+parm.getName()+"}<<|"+attrVariable.getName()+")\\/ {("+parm.getName()+"|-> "+valueParm.getName()+")}";
		

				operation.setBody(body);				



				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : UniqueAttr_GenerateSetter!");e.printStackTrace();
			}

		}
		return null;
	}

	
	
	
	
	
	


	static public EObject Attr_MultiValued_GenerateMutator_add(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				//				if (p.getType()==null){
				//					System.out.println("WARNING  -  untyped attribute ("+p.getQualifiedName()+") ");
				//					return null;
				//				}		

				if (p.isStatic()){
					System.out.println("WARNING  - at Attr_MultiValued_GenerateMutator_add: static attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - 
					return null;
				}

				if (!UML_Util.isMultivalued(p)){
					System.out.println("WARNING  - at Attr_MultiValued_GenerateMutator_add : mono-valued attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - 
					return null;
				}
				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_MultiValued_GenerateMutator_add("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}
				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedMultivaluedAttributeAdderLabel(p, (Package)ctx.getInputRoot()));

				//retrieve the variable of the attribute		
				if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  -  unmapped attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				BVariable attrVariable = UML2BUtil.getAttributeBVariable(p, ctx);

				BComposedType attRelation = (BComposedType) attrVariable.getType();

				//add operation to the machine containing the attribute variable
				attrVariable.getDatadeclare().getOperations().add(operation);


				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(p.getClass_(),(Package)ctx.getInputRoot()));
				parm.setType(attRelation.getDom());
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);

				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
				valueParm.setType(attRelation.getRan());

				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());			
				valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);

				//additional invar for min and max cardinalities
				String additionalInvars=null;

				//(Instance|->Value)/:attributeVariable
				additionalInvars="("+parm.getName()+"|-> "+valueParm.getName()+")/:"+attrVariable.getName();				

				valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setName(additionalInvars);



				if (p.upperBound()!=-1){//max card Invar
					//card(AttrVar[{Instance}])<upperBound
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName("card("+attrVariable.getName()+"[{"+parm.getName()+"}])<"+p.upperBound());					

				}

				if (p.lowerBound()>1){//min card Invar
					//AttrVar[{Instance}]/={}
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName(attrVariable.getName()+"[{"+parm.getName()+"}]/={}");					

				}


				//Body substitution
				String body=null;	

				body=attrVariable.getName()+":= "+attrVariable.getName()+"\\/ {("+parm.getName()+"|-> "+valueParm.getName()+")}";

				operation.setBody(body);				



				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Attr_MultiValued_GenerateMutator_Add !");e.printStackTrace();
			}

		}
		return null;
	}














	static public EObject Attr_MultiValued_GenerateMutator_remove(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getClass_() != null)) {
			Property p = (Property) o;

			try {
				//				if (p.getType()==null){
				//					System.out.println("WARNING  -  untyped attribute ("+p.getQualifiedName()+") ");
				//					return null;
				//				}		

				if (p.isStatic()){
					System.out.println("WARNING  - at Attr_MultiValued_GenerateMutator_remove: static attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - 
					return null;
				}

				if (!UML_Util.isMultivalued(p)){
					System.out.println("WARNING  - at Attr_MultiValued_GenerateMutator_remove : mono-valued attribute ("+p.getQualifiedName()+") ");
					//throw new Exception("ERROR - 
					return null;
				}

				//TODO change to CTM requirement
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Attr_MultiValued_GenerateMutator_remove("+p.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}

				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedMultivaluedAttributeRemoverLabel(p, (Package)ctx.getInputRoot()));

				//retrieve the variable of the attribute		
				if (UML2BUtil.getFirstMappingTargetElementByType(p,BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  -  unmapped attribute ("+p.getQualifiedName()+") ");
					return null;
				}
				BVariable attrVariable = UML2BUtil.getAttributeBVariable(p, ctx);

				BComposedType attRelation = (BComposedType) attrVariable.getType();

				//add operation to the machine containing the attribute variable
				attrVariable.getDatadeclare().getOperations().add(operation);


				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(p.getClass_(),(Package)ctx.getInputRoot()));
				parm.setType(attRelation.getDom());
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);

				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForAttribute(p,(Package)ctx.getInputRoot()));
				valueParm.setType(attRelation.getRan());				


				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());			
				valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);


				String additionalInvars=null;

				//(Instance|->Value):attributeVariable
				additionalInvars="("+parm.getName()+"|-> "+valueParm.getName()+"):"+attrVariable.getName();			

				valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setName(additionalInvars);





				//				if (p.upperBound()!=-1){//max card Invar
				//					//card(AttrVar[{Instance}])<upperBound
				//					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				//					valueParm.getTypingPredicate().add(valueTypingPredicate);
				//					valueTypingPredicate.setName("card("+attrVariable.getName()+"[{"+parm.getName()+"}])<"+p.upperBound());					
				//					
				//				}

				if (p.lowerBound()>0){//min card Invar
					//AttrVar[{Instance}]/={}
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(valueTypingPredicate);
					valueTypingPredicate.setName("card("+attrVariable.getName()+"[{"+parm.getName()+"}])>"+p.lowerBound());					

				}


				//Body substitution
				String body=null;	

				body=attrVariable.getName()+":= "+attrVariable.getName()+"\\/ {("+parm.getName()+"|-> "+valueParm.getName()+")}";

				operation.setBody(body);				



				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Attr_MultiValued_GenerateMutator_remove !");e.printStackTrace();
			}

		}
		return null;
	}







	//----------------------------Association ----------------
	static public EObject GenerateAssociationBVariable(
			ITransformationContext ctx, EObject o) {
		
		
		if (o instanceof Association) {
			try {
				Association association = (Association) o;
				
				//avoid n-ary associations
				if (!association.isBinary())//(association.getMemberEnds().size() != 2)
					throw new Exception("ERROR - Only binary associations are supported! ("+association.getQualifiedName()+ ") ");
				if (association.isAbstract())
					throw new Exception("ERROR - Abstract associations are not supported! ("+association.getQualifiedName()+ ") ");
				if (association.isDerived())
					throw new Exception("ERROR - Derived associations are not supported! ("+association.getQualifiedName()+ ") ");
				if (association.getNavigableOwnedEnds().isEmpty())
					throw new Exception("ERROR - Non-navigable associations are not supported! ("+association.getQualifiedName()+ ") ");


				Property firstEnd,secondEnd,tmpEnd=null;
				firstEnd=association.getMemberEnds().get(0);
				secondEnd=association.getMemberEnds().get(1);


				if (firstEnd.isOrdered()||secondEnd.isOrdered())
					throw new Exception("ERROR - ordered associations are not supported! ("+association.getQualifiedName()+ ") ");
				if (!(firstEnd.isUnique() && secondEnd.isUnique()))
					throw new Exception("ERROR - duplicated members of an associations are not supported! ("+association.getQualifiedName()+ ") ");

				if (!(UMLPackage.Literals.CLASS.isInstance(firstEnd.getType()) && UMLPackage.Literals.CLASS.isInstance(secondEnd.getType())))
					throw new Exception("ERROR - The type of the memeber ends must be a Class! ("+association.getQualifiedName()+ ") ");

				if(UML_Util.isMondatory(firstEnd)&& UML_Util.isMondatory(secondEnd)){
					System.out.println("WARNING  - at GenerateAssociationBVariable : unrealistic case (both ends are mandatory ) for the association("+association.getQualifiedName()+") ");
					//throw new Exception("ERROR - at Attr_static_GenerateAccessor: non-static attribut entry ("+p.getQualifiedName()+")");
					//return null;					
				}


				//create the variable
				BVariable variable=BFactory.eINSTANCE.createBVariable();
				variable.setName(UML2B_NamingRules.getLabel(association,(Package)ctx.getInputRoot()));

				//create the typing invariants
				//relation
				BComposedType relation = BFactory.eINSTANCE.createBComposedType();
				variable.setType(relation);

				//Typing invariant: to be set according to the multiplicities 
				ComposedTypeExp relationType=ComposedTypeExp.RELATION;
				String AdditionalInvariant="";

				//the member ends might be switched later so the related variables and their assignment as domain and range of the relation have to be done later on  

				if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,0,-1)){//0..*<->0..*					

				}else if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,1,-1,true)){//0..*<->1..*
					if (UML_Util.isMultiplicty(secondEnd, 0, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends				

					BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
					relationType=ComposedTypeExp.RELATION;
					AdditionalInvariant="dom("+variable.getName()+")="+var.getName();
				}else if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,0,1,true)){//0..*<->0..1
					if (UML_Util.isMultiplicty(secondEnd, 0, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.PARTIAL_FUNCTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,1,1,true)){//0..*<->1..1
					if (UML_Util.isMultiplicty(secondEnd, 0, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.TOTAL_FUNCTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 1, -1,secondEnd,1,-1)){//1..*<->1..*				
					//
					relationType=ComposedTypeExp.RELATION;
					//
					BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
					AdditionalInvariant="dom("+variable.getName()+")="+var.getName();
					//
					var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
					AdditionalInvariant=AdditionalInvariant.concat(" & ran("+variable.getName()+")="+var.getName());

				}else if(UML_Util.isMultiplicties(firstEnd, 1, -1,secondEnd,0,1,true)){//1..*<->0..1
					if (UML_Util.isMultiplicty(secondEnd, 1, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.PARTIAL_SURJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 1, -1,secondEnd,1,1,true)){//1..*<->1..1
					if (UML_Util.isMultiplicty(secondEnd, 1, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.TOTAL_SURJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 0, 1,secondEnd,0,1)){//0..1<->0..1
					relationType=ComposedTypeExp.PARTIAL_INJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 0, 1,secondEnd,1,1,true)){//0..1<->1..1
					if (UML_Util.isMultiplicty(secondEnd, 0, 1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.TOTAL_INJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 1, 1,secondEnd,1,1)){//1..1<->1..1
					relationType=ComposedTypeExp.TOTAL_BIJECTION;
				}else{// case of constrained cardinalities (n , 0..n, 1..n, n..*, n..m)
					//consider each role separately 

					//firstEnd
					//lower
					if (firstEnd.lowerBound()==1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"ran("+variable.getName()+")="+var.getName();
					}else if (firstEnd.lowerBound()!=0){//n
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:ran("+variable.getName()+") => card("+variable.getName()+"~[{c2}])>="+firstEnd.lowerBound()+")";
					}


					//upper
					if (firstEnd.upperBound()!=-1 && firstEnd.upperBound()>1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:ran("+variable.getName()+") => card("+variable.getName()+"~[{c2}])<="+firstEnd.upperBound()+")";
					}


					//secondEnd
					//lower
					if (secondEnd.lowerBound()==1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"dom("+variable.getName()+")="+var.getName();
					}else if (secondEnd.lowerBound()!=0){//n
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:dom("+variable.getName()+") => card("+variable.getName()+"[{c2}])>="+secondEnd.lowerBound()+")";
					}


					//upper
					if (secondEnd.upperBound()!=-1 && secondEnd.upperBound()>1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:dom("+variable.getName()+") => card("+variable.getName()+"[{c2}])<="+secondEnd.upperBound()+")";
					}



				}



				//retrieve member ends variable				
				BVariable firstEndVariable= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
				BVariable secondEndVariable= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
				//set relation domain and range
				relation.setDom(firstEndVariable);
				relation.setRan(secondEndVariable);

				relation.setExpression(relationType);
				//typing predicates
				//relation
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();

				typingPredicate.setType(relation);
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(variable);				
				variable.getTypingPredicate().add(typingPredicate);

				//Additional invariants 
				if (AdditionalInvariant!=null && AdditionalInvariant!=""){
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(AdditionalInvariant);
					variable.getTypingPredicate().add(typingPredicate);
				}


				//retrieve the containing BMachine
				if ( !firstEndVariable.getDatadeclare().equals(secondEndVariable.getDatadeclare())  )
					throw new Exception("ERROR - the BVariables related to memeber ends are not located in the same machine ! ("+association.getQualifiedName()+ ") ");				
				BMachine machine= firstEndVariable.getDatadeclare();

				//add the variable to the machine data (system machine )
				machine.getData().add(variable);
				// add the relation to the set of shared types
				//TODO resolve the problem of containment for typing predicates (shared-types usefulness!)
				machine.getSpec().getSharedTypes().getSharedTypes().add(relation);

				//Initialization
				BInitialisation init = BFactory.eINSTANCE.createBInitialisation();
				init.setInit(variable);
				machine.getInitialisation().add(init);





				return variable;

			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : GenerateAssociationBVariable !");e.printStackTrace();
			}
		}
		return null;
	}
	
	
	
	//----------------------------AssociationClass ----------------
	
	static public EObject GenerateAssociationClassBVariable(
			ITransformationContext ctx, EObject o) {
		if (o instanceof AssociationClass) {
			try {
				Association association = (Association) o;
				//avoid n-ary associations
				if (!association.isBinary())//(association.getMemberEnds().size() != 2)
					throw new Exception("ERROR - Only binary associations are supported! ("+association.getQualifiedName()+ ") ");
				if (association.isAbstract())
					throw new Exception("ERROR - Abstract associations are not supported! ("+association.getQualifiedName()+ ") ");
				if (association.isDerived())
					throw new Exception("ERROR - Derived associations are not supported! ("+association.getQualifiedName()+ ") ");
				if (association.getNavigableOwnedEnds().isEmpty())
					throw new Exception("ERROR - Non-navigable associations are not supported! ("+association.getQualifiedName()+ ") ");


				Property firstEnd,secondEnd,tmpEnd=null;
				firstEnd=association.getMemberEnds().get(0);
				secondEnd=association.getMemberEnds().get(1);


				if (firstEnd.isOrdered()||secondEnd.isOrdered())
					throw new Exception("ERROR - ordered associations are not supported! ("+association.getQualifiedName()+ ") ");
				if (!(firstEnd.isUnique() && secondEnd.isUnique()))
					throw new Exception("ERROR - duplicated members of an associations are not supported! ("+association.getQualifiedName()+ ") ");

				if (!(UMLPackage.Literals.CLASS.isInstance(firstEnd.getType()) && UMLPackage.Literals.CLASS.isInstance(secondEnd.getType())))
					throw new Exception("ERROR - The type of the memeber ends must be a Class! ("+association.getQualifiedName()+ ") ");

				if(UML_Util.isMondatory(firstEnd)&& UML_Util.isMondatory(secondEnd)){
					System.out.println("WARNING  - at GenerateAssociationBVariable : unrealistic case (both ends are mandatory ) for the association("+association.getQualifiedName()+") ");
					//throw new Exception("ERROR - at Attr_static_GenerateAccessor: non-static attribut entry ("+p.getQualifiedName()+")");
					//return null;					
				}


				//create the variable
				BVariable variable=BFactory.eINSTANCE.createBVariable();
				variable.setName(UML2B_NamingRules.getLabel(association,(Package)ctx.getInputRoot()));

				//create the typing invariants
				//relation
				BComposedType relation = BFactory.eINSTANCE.createBComposedType();
				variable.setType(relation);

				//Typing invariant: to be set according to the multiplicities 
				ComposedTypeExp relationType=ComposedTypeExp.RELATION;
				String AdditionalInvariant="";

				//the member ends might be switched later so the related variables and their assignment as domain and range of the relation have to be done later on  

				if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,0,-1)){//0..*<->0..*					

				}else if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,1,-1,true)){//0..*<->1..*
					if (UML_Util.isMultiplicty(secondEnd, 0, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends				

					BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
					relationType=ComposedTypeExp.RELATION;
					AdditionalInvariant="dom("+variable.getName()+")="+var.getName();
				}else if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,0,1,true)){//0..*<->0..1
					if (UML_Util.isMultiplicty(secondEnd, 0, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.PARTIAL_FUNCTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 0, -1,secondEnd,1,1,true)){//0..*<->1..1
					if (UML_Util.isMultiplicty(secondEnd, 0, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.TOTAL_FUNCTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 1, -1,secondEnd,1,-1)){//1..*<->1..*				
					//
					relationType=ComposedTypeExp.RELATION;
					//
					BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
					AdditionalInvariant="dom("+variable.getName()+")="+var.getName();
					//
					var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
					AdditionalInvariant=AdditionalInvariant.concat(" & ran("+variable.getName()+")="+var.getName());

				}else if(UML_Util.isMultiplicties(firstEnd, 1, -1,secondEnd,0,1,true)){//1..*<->0..1
					if (UML_Util.isMultiplicty(secondEnd, 1, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.PARTIAL_SURJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 1, -1,secondEnd,1,1,true)){//1..*<->1..1
					if (UML_Util.isMultiplicty(secondEnd, 1, -1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.TOTAL_SURJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 0, 1,secondEnd,0,1)){//0..1<->0..1
					relationType=ComposedTypeExp.PARTIAL_INJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 0, 1,secondEnd,1,1,true)){//0..1<->1..1
					if (UML_Util.isMultiplicty(secondEnd, 0, 1)){tmpEnd=firstEnd;firstEnd=secondEnd;secondEnd=tmpEnd;}//switch ends
					relationType=ComposedTypeExp.TOTAL_INJECTION;
				}else if(UML_Util.isMultiplicties(firstEnd, 1, 1,secondEnd,1,1)){//1..1<->1..1
					relationType=ComposedTypeExp.TOTAL_BIJECTION;
				}else{// case of constrained cardinalities (n , 0..n, 1..n, n..*, n..m)
					//consider each role separately 

					//firstEnd
					//lower
					if (firstEnd.lowerBound()==1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"ran("+variable.getName()+")="+var.getName();
					}else if (firstEnd.lowerBound()!=0){//n
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:ran("+variable.getName()+") => card("+variable.getName()+"~[{c2}])>="+firstEnd.lowerBound()+")";
					}


					//upper
					if (firstEnd.upperBound()!=-1 && firstEnd.upperBound()>1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:ran("+variable.getName()+") => card("+variable.getName()+"~[{c2}])<="+firstEnd.upperBound()+")";
					}


					//secondEnd
					//lower
					if (secondEnd.lowerBound()==1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"dom("+variable.getName()+")="+var.getName();
					}else if (secondEnd.lowerBound()!=0){//n
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:ran("+variable.getName()+") => card("+variable.getName()+"[{c2}])>="+secondEnd.lowerBound()+")";
					}


					//upper
					if (secondEnd.upperBound()!=-1 && secondEnd.upperBound()>1){
						BVariable var= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
						if (AdditionalInvariant!=null && AdditionalInvariant!="")
							AdditionalInvariant=AdditionalInvariant+" & ";
						AdditionalInvariant=AdditionalInvariant+"!c2.( c2:ran("+variable.getName()+") => card("+variable.getName()+"[{c2}])<="+secondEnd.upperBound()+")";
					}



				}



				//retrieve member ends variable				
				BVariable firstEndVariable= UML2BUtil.getClassInstnacesVariable((Class)firstEnd.getType(), ctx);
				BVariable secondEndVariable= UML2BUtil.getClassInstnacesVariable((Class)secondEnd.getType(), ctx);
				//set relation domain and range
				relation.setDom(firstEndVariable);
				relation.setRan(secondEndVariable);

				relation.setExpression(relationType);
				//typing predicates
				//relation
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();

				typingPredicate.setType(relation);
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(variable);				
				variable.getTypingPredicate().add(typingPredicate);

				//Additional invariants 
				if (AdditionalInvariant!=null && AdditionalInvariant!=""){
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(AdditionalInvariant);
					variable.getTypingPredicate().add(typingPredicate);
				}


				//retrieve the containing BMachine
				if ( !firstEndVariable.getDatadeclare().equals(secondEndVariable.getDatadeclare())  )
					throw new Exception("ERROR - the BVariables related to memeber ends are not located in the same machine ! ("+association.getQualifiedName()+ ") ");				
				BMachine machine= firstEndVariable.getDatadeclare();

				//add the variable to the machine data (system machine )
				machine.getData().add(variable);
				// add the relation to the set of shared types
				//TODO resolve the problem of containment for typing predicates (shared-types usefulness!)
				machine.getSpec().getSharedTypes().getSharedTypes().add(relation);

				//Initialization
				BInitialisation init = BFactory.eINSTANCE.createBInitialisation();
				init.setInit(variable);
				machine.getInitialisation().add(init);


				System.out.println("MAI DEBUG Spec: Type of BVariable of an Association class " + variable.getType());


				return variable;

			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : GenerateAssociationBVariable !");e.printStackTrace();
			}
		}
		return null;
	}

	static public EObject Role_UpdateConstructor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getAssociation() != null)&& (((Property) o).getType() instanceof Class)) {

			Property p = (Property) o;
			// mandatory role
			if (p.getLower() != 0) {




				try {



					System.out.println("INFO - Role_UpdateConstructor : "+ p.getName());


					Property opposite=null;
					Class baseClass,referencedClass;
					referencedClass=(Class)p.getType();					
					opposite=UML_Util.getOpposite(p);
					//check if the baseClass is a classifier
					if (!UMLPackage.Literals.CLASS.isInstance(opposite.getType())){
						throw new Exception("ERROR - At "+CopyOfUML2B_Selkis.class.getCanonicalName()+".Role_UpdateConstructor("+p.getQualifiedName()+"): the baseClass is not a class !");
					}
					baseClass=(Class) opposite.getType();

					// retrieve the association  variable
					if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
						System.out.println("WARNING  - at Role_UpdateConstructor("+p.getQualifiedName()+"):  unmapped Association  ");
						return null;
					}


					BVariable baseClassBVariable = UML2BUtil.getClassInstnacesVariable(baseClass, ctx);
					BVariable referencedClassBVariable = UML2BUtil.getClassInstnacesVariable(referencedClass, ctx); 





					// retrieve the association  variable
					//					if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
					//						System.out.println("WARNING  - at NavigableRole_GenerateAccessor("+p.getQualifiedName()+"):  unmapped Association  ");
					//						return null;
					//					}
					BVariable associationBVariable = UML2BUtil
					.getAssociationBVariable(p.getAssociation(), ctx);
					if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(associationBVariable
							.getType())) {
						throw new Exception(
								"ERROR - the variable of the association( "
								+ associationBVariable.getName()
								+ " ) is not a relation!");
					}
					//BComposedType relation = (BComposedType) associationBVariable.getType();
					//System.out.println("INFO - Role_UpdateConstructor : "+ p.getName());

					
					
					
					
					
//					//attribute value as a parameter for the constructor
//					BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();					
//					parm.setName(UML2B_NamingRules.getGeneratedParameterLabelForRole(p,(Package)ctx.getInputRoot()));

//					if (UML_Util.isMultivalued(p)){
//						//TODO use non-empty Power 
//						BPowType type=BFactory.eINSTANCE.createBPowType();						
//						type.setPow(referencedClassBVariable);
//						referencedClassBVariable.getDatadeclare().getSpec().getSharedTypes().getSharedTypes().add(type);
//
//						parm.setType(type);
//						}else{
//							parm.setType(referencedClassBVariable);
//						}
//					
					
					
					
					// retrieve the baseClass constructor operation to be updated
					BOperation operation = null;
						
				
					
					if (baseClass.isAbstract()){
						operation = BFactory.eINSTANCE.createBOperation();
					}else{
						operation =UML2BUtil.getBConstructor(baseClass, ctx);
					}
					
						
					// add the attribute value as a parameter for the constructor
					BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();					
					parm.setName(UML2B_NamingRules.getGeneratedParameterLabelForRole(p,(Package)ctx.getInputRoot()));
					operation.getParam().add(parm);
					
					
					String additionalInvar=null;
					String body="";

					if (UML_Util.isMultivalued(p)){
						//TODO use non-empty Power 
						BPowType type=BFactory.eINSTANCE.createBPowType();						
						type.setPow(referencedClassBVariable);
						//if (!baseClass.isAbstract()){
							referencedClassBVariable.getDatadeclare().getSpec().getSharedTypes().getSharedTypes().add(type);
						//}
						parm.setType(type);

						//Multiplicities invariants
						//Min
						//TODO define the upper and lower bound as BConstants
						if(p.lowerBound()==1){
							additionalInvar=parm.getName()+"/={}";//instead of non-empty Power							
						}else{// >1 : check min card
							additionalInvar="card("+parm.getName()+")>="+p.lowerBound();							
						}
						//max
						if (p.upperBound()!=-1){
							additionalInvar=additionalInvar+" & card("+parm.getName()+")<="+p.upperBound();

						}

						//						//check the upper bound constraint for the referenced class						
						//						if (opposite.upperBound()!=-1){
						//							if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){
						//								// card(relation(value))<upperBound
						//								// !rc.(rc:values => card(relation(rc))<upperBound)
						//								additionalInvar=additionalInvar+" & card("+parm.getName()+")<="+p.upperBound();
						//								
						//							}else{//reverse the relation
						//								
						//							}
						//							
						//							
						//						}
						//						






						//check the upper bound constraint for the referenced class		(upper!=*)				
						if (opposite.upperBound()!=-1){
							if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){								
								if (opposite.upperBound()==1){//!value.(value:Values => value/:domain(relation))) // can be proofed automatically using  pp1(Predicate prover with first level hypothesis)
									//additionalInvar=additionalInvar+" & !value.(value:"+parm.getName()+" =>value/:dom("+associationBVariable.getName()+")"+")"  ;
									additionalInvar=additionalInvar+"\n & "+ associationBVariable.getName()+"["+parm.getName()+"]={}"  ;

								}else if (opposite.upperBound()==2){//!value.(value:Values => not #bcv.(bcv:ran(relation) & bcv/=Instance & (Value|->bcv):relation))
									additionalInvar=additionalInvar+"\n & !value.(value: "+parm.getName()+" =>"+ "not( #bc.(bcv : ran("+associationBVariable.getName()+") & bcv/="+operation.getParam().get(0).getName()+"& (value|->bcv):"+associationBVariable.getName()+"))"+")";

								}else{//!value.(value:Values =>  card(relation(value))< upperBound )//can't be proofed automatically 
									additionalInvar=additionalInvar+"\n & !value.(value: "+parm.getName()+" =>"+"card("+associationBVariable.getName()+"(value))<"+opposite.upperBound()+")";
								}							

							}else{//reverse the relation
								if (opposite.upperBound()==1){//!value.(value:Values => value/:domain(relation))) // can be proofed automatically using  pp1(Predicate prover with first level hypothesis)
									additionalInvar=additionalInvar+"\n & !value.(value:"+parm.getName()+" =>value/:ran("+associationBVariable.getName()+")"+")"  ;

								}else if (opposite.upperBound()==2){//!value.(value:Values => not #bcv.(bcv:ran(relation) & bcv/=Instance & (Value|->bcv):relation))
									additionalInvar=additionalInvar+"\n & !value.(value: "+parm.getName()+" =>"+ "not( #bc.(bcv : ran("+associationBVariable.getName()+") & bcv/="+operation.getParam().get(0).getName()+"& (bcv|->value):"+associationBVariable.getName()+"))"+")";

								}else{//!value.(value:Values =>  card(relation(value))< upperBound )//can't be proofed automatically 
									additionalInvar=additionalInvar+"\n & !value.(value: "+parm.getName()+" =>"+"card("+associationBVariable.getName()+"~(value))<"+opposite.upperBound()+")";
								}	



							}

						}










						//substitution
						if ( ((BComposedType)associationBVariable.getType()).getDom().equals(baseClassBVariable) ){
							body= associationBVariable.getName() + ":= " + associationBVariable.getName()
							+ " \\/ ({" + operation.getParam().get(0).getName()
							+ "}*" + parm.getName() + ")";
						}else{//switch domain and range
							body= associationBVariable.getName() + ":= " + associationBVariable.getName()
							+ " \\/ (" + parm.getName()+"*{" + operation.getParam().get(0).getName()+ "})";							
						}



					}else{//mono-valued			
						//invars
						parm.setType(referencedClassBVariable);
						//additionalInvar=parm.getName()+"/={}";

						//check the upper bound constraint for the referenced class		(upper!=*)				
						if (opposite.upperBound()!=-1){
							if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){								
								if (opposite.upperBound()==1){//value/:domain(relation)
									additionalInvar=parm.getName()+"/:dom("+associationBVariable.getName()+")"  ;

								}else if (opposite.upperBound()==2){//not #bcv.(bcv:ran(relation) & bcv/=Instance & (Value|->bcv):relation)
									additionalInvar= "not( #bc.(bcv : ran("+associationBVariable.getName()+") & bcv/="+operation.getParam().get(0).getName()+"& ("+parm.getName()+"|->bcv):"+associationBVariable.getName()+"))";

								}else{// card(relation(value))< upperBound //can't be proofed automatically 
									additionalInvar="card("+associationBVariable.getName()+"("+parm.getName()+"))<"+opposite.upperBound();
								}



							}else{//reverse the relation

								if (opposite.upperBound()==1){//value/:domain(relation)
									additionalInvar=parm.getName()+"/:ran("+associationBVariable.getName()+")"  ;

								}else if (opposite.upperBound()==2){//not #bcv.(bcv:ran(relation) & bcv/=Instance & (Value|->bcv):relation)
									additionalInvar= "not( #bc.(bcv : dom("+associationBVariable.getName()+") & bcv/="+operation.getParam().get(0).getName()+"& (bcv|->"+parm.getName()+"):"+associationBVariable.getName()+"))";

								}else{// card(relation(value))< upperBound //can't be proofed automatically 
									additionalInvar="card("+associationBVariable.getName()+"~("+parm.getName()+"))<"+opposite.upperBound();
								}


							}

						}



						//substitution
						if ( ((BComposedType)associationBVariable.getType()).getDom().equals(baseClassBVariable) ){
							body= associationBVariable.getName() + ":= " + associationBVariable.getName()
							+ " \\/ {(" + operation.getParam().get(0).getName()
							+ "|->" + parm.getName() + ")}";
						}else{
							body= associationBVariable.getName() + ":= " + associationBVariable.getName()
							+ " \\/ {(" + parm.getName()
							+ "|->" + operation.getParam().get(0).getName() + ")}";
						}

					}

					// attributeValue : Type
					//parm.setType(referencedClassBVariable);

					//typing
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setType(parm.getType());
					typingPredicate.setOperator(TypingOperator.IN);
					typingPredicate.setTypedElement(parm);

					//additional invariants
					if (additionalInvar!=null){
						typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
						typingPredicate.setName(additionalInvar);
						parm.getTypingPredicate().add(typingPredicate);
					}

					//substitution
					operation.setBody(operation.getBody() + " \n || " +body);


					// process subClasses

					for (Iterator iterator = UML_Util.getAllSubClasses(
							baseClass).iterator(); iterator.hasNext();) {
						Class subClass = (Class) iterator.next();
						
						if (!subClass.isAbstract()){

							System.out.println("INFO - Role_UpdateConstructor for subClass: "+ subClass.getName());
	
							// retrieve the class constructor operation
							BOperation op = UML2BUtil
							.getBConstructor(subClass, ctx);
							//not yet processed 
							if (op.getBody().indexOf(associationBVariable.getName()) == -1) {
	
								BOpParameter parm2 = BFactory.eINSTANCE.createBOpParameter();
								op.getParam().add(parm2);
								parm2.setName(parm.getName());
								parm2.setType(parm.getType());
	
								// attributeValue : Type
								 typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
								parm2.getTypingPredicate().add(typingPredicate);
								typingPredicate.setType(parm2.getType());
								typingPredicate.setOperator(TypingOperator.IN);
								typingPredicate.setTypedElement(parm2);
	
								//additional invariants
								if (additionalInvar!=null){
									typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
									typingPredicate.setName(additionalInvar);
									parm2.getTypingPredicate().add(typingPredicate);
								}
	
								//substitution
								op.setBody(op.getBody() + " \n || " +body);
	
	
	
							}
						}
					}

					return operation;
				} catch (Exception e) {
					System.out.println("EXCEPTION OCCURENCE AT : Role_UpdateConstructor!");e.printStackTrace();
				}

			}

		}
		return null;
	}




	/**
	 * 
	 * check the min constraint of th
	 */
	static public EObject Role_UpdateDestructor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && (((Property) o).getAssociation() != null)&& (((Property) o).getType() instanceof Class)) {

			Property p = (Property) o;			
			// mandatory role			
			try {
				System.out.println("INFO - Role_UpdateDestructor : "+ p.getName());
				Property opposite=null;


				Class baseClass,referencedClass;
				referencedClass=(Class)p.getType();
				if(p.getAssociation().getMemberEnds().get(0).getType().equals(referencedClass)){
					opposite=p.getAssociation().getMemberEnds().get(1);
					baseClass=(Class) opposite.getType();

				}else{
					opposite=p.getAssociation().getMemberEnds().get(0);
					baseClass=(Class) opposite.getType();						
				}

				// retrieve the association  variable
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at Role_UpdateDestructor("+p.getQualifiedName()+"):  unmapped Association  ");
					return null;
				}

				BVariable baseClassBVariable = UML2BUtil.getClassInstnacesVariable(baseClass, ctx);
				BVariable referencedClassBVariable = UML2BUtil.getClassInstnacesVariable(referencedClass, ctx); 

				// retrieve the association  variable
				//					if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
				//						System.out.println("WARNING  - at NavigableRole_GenerateAccessor("+p.getQualifiedName()+"):  unmapped Association  ");
				//						return null;
				//					}
				BVariable associationBVariable = UML2BUtil
				.getAssociationBVariable(p.getAssociation(), ctx);
				if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(associationBVariable
						.getType())) {
					throw new Exception(
							"ERROR - the variable of the association( "
							+ associationBVariable.getName()
							+ " ) is not a relation!");
				}
				//BComposedType relation = (BComposedType) associationBVariable.getType();


				// retrieve the baseClass constructor operation to be updated
				BOperation operation = null;
			
				
				if (baseClass.isAbstract()){
					operation = BFactory.eINSTANCE.createBOperation();
				}else{
					operation=UML2BUtil.getBDestructor(referencedClass, ctx);
				}
				
				
				// add the attribute value as a parameter for the
				// constructor
				BOpParameter parm = operation.getParam().get(0);

				if (!parm.getType().equals(referencedClassBVariable))
					throw new Exception("ERROR - at Role_UpdateDestructor referencedClassBVariable("+referencedClassBVariable+") is defferent from the instance type ("+parm.getType()+ ") ");



				//precondition to check the constraint 
				String additionalInvar=null;
				if (p.getLower() == 1) {
					if (p.upperBound()==1){
						if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){	
							additionalInvar=associationBVariable.getName()+"[{"+parm.getName()+"}]={}";
						}else{//reverse the relation
							additionalInvar=associationBVariable.getName()+"~[{"+parm.getName()+"}]={}";
						}
					}else{					
						if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){	
							additionalInvar=" !c2.(c2:"+associationBVariable.getName()+"[{"+parm.getName()+"}] =>"+"#cc.(cc:"+associationBVariable.getName()+"~[{c2}] & cc/="+parm.getName()+") )";
						}else{//reverse the relation
							additionalInvar=" !c2.(c2:"+associationBVariable.getName()+"~[{"+parm.getName()+"}] => #cc.(cc:"+associationBVariable.getName()+"[{c2}] & cc/="+parm.getName()+") )";
						}
					}

				}else	if (p.getLower() != 0) {
					if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){	
						additionalInvar=" !c2.(c2:"+associationBVariable.getName()+"[{"+parm.getName()+"}] =>"+"card("+associationBVariable.getName()+"~[{c2}])>"+p.lowerBound()+")";
					}else{//reverse the relation
						additionalInvar=" !c2.(c2:"+associationBVariable.getName()+"~[{"+parm.getName()+"}] =>"+"card("+associationBVariable.getName()+"[{c2}])>"+p.lowerBound()+")";
					}
				}

				if (opposite.isComposite()){
					if (additionalInvar==null) 
						additionalInvar="";
					else 
						additionalInvar=additionalInvar+"\n & ";

					if ( ((BComposedType)associationBVariable.getType()).getDom().equals(referencedClassBVariable) ){	
						additionalInvar=additionalInvar+associationBVariable.getName()+"[{"+parm.getName()+"}]={}";
					}else{//reverse the relation
						additionalInvar=additionalInvar+associationBVariable.getName()+"~[{"+parm.getName()+"}]={}";
					}

				}




				//Substitution to subtract the destroyed instance form the role's relationship
				String body="";

				if ( ((BComposedType)associationBVariable.getType()).getDom().equals(parm.getType()) ){
					body= associationBVariable.getName() + ":= {" + parm.getName()+"}<<|" + associationBVariable.getName();
				}else{
					body= associationBVariable.getName() + ":= "+ associationBVariable.getName()+"|>> {" + parm.getName()+"}";
				}



				TypingPredicate typingPredicate=null;
				//additional invariants
				if (additionalInvar!=null){
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(additionalInvar);
					parm.getTypingPredicate().add(typingPredicate);
				}

				//substitution
				operation.setBody(operation.getBody() + "\n || " +body);

				// process subClasses

				for (Iterator iterator = UML_Util.getAllSubClasses(
						referencedClass).iterator(); iterator.hasNext();) {
					Class subClass = (Class) iterator.next();
					if (!subClass.isAbstract()) {
						System.out.println("INFO - Role_UpdateDestructor for subClass: "+ subClass.getName());
	
						// retrieve the class constructor operation
						BOperation op = UML2BUtil
						.getBDestructor(subClass, ctx);
						//not yet processed 
						if (op.getBody().indexOf(associationBVariable.getName()) == -1) {
	
							//retrieve Instance parm
							BOpParameter parm2 = op.getParam().get(0);
	
							//additional invariants
							if (additionalInvar!=null){
								typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
								typingPredicate.setName(additionalInvar);
								parm2.getTypingPredicate().add(typingPredicate);
							}
	
							//substitution
							op.setBody(op.getBody() + "\n || " +body);
	
	
	
						}
					}
				}

				return operation;
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : Role_UpdateDestructor("+p.getQualifiedName()+") !");
				e.printStackTrace();
			}

		}


		return null;
	}




	static public EObject NavigableRole_GenerateAccessor(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && UML_Util.isRole((Property) o)) {
			Property p = (Property) o;

			try {

				System.out.println("INFO - NavigableRole_GenerateAccessor : "+ p.getName());

				//retrieve the variable of the Association		
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at NavigableRole_GenerateAccessor("+p.getQualifiedName()+"):  unmapped Association  ");
					return null;
				}


				Property opposite=null;
				Class baseClass,referencedClass;
				referencedClass=(Class)p.getType();					
				opposite=UML_Util.getOpposite(p);
				//check if the baseClass is a classifier
				if (!UMLPackage.Literals.CLASS.isInstance(opposite.getType())){
					throw new Exception("ERROR - At "+CopyOfUML2B_Selkis.class.getCanonicalName()+".NavigableRole_GenerateAccessor("+p.getQualifiedName()+"): the baseClass is not a class !");
				}
				baseClass=(Class) opposite.getType();

				// retrieve the association  variable
				//				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
				//					System.out.println("WARNING  - at NavigableRole_GenerateAccessor("+p.getQualifiedName()+"):  unmapped Association  ");
				//					return null;
				//				}


				BVariable baseClassBVariable = UML2BUtil.getClassInstnacesVariable(baseClass, ctx);
				BVariable referencedClassBVariable = UML2BUtil.getClassInstnacesVariable(referencedClass, ctx); 

				// retrieve the association  variable

				BVariable associationBVariable = UML2BUtil
				.getAssociationBVariable(p.getAssociation(), ctx);
				if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(associationBVariable
						.getType())) {
					throw new Exception(
							"ERROR - the variable of the association( "
							+ associationBVariable.getName()
							+ " ) is not a relation!");
				}				
				BComposedType relation = (BComposedType) associationBVariable.getType();













				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedRoleAccessorLabel(p, (Package)ctx.getInputRoot()));					

				if (!baseClass.isAbstract()){
				//add operation to the machine containing the attribute ariable
				baseClassBVariable.getDatadeclare().getOperations().add(operation);
				}






				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(baseClass,(Package)ctx.getInputRoot()));
				parm.setType(baseClassBVariable);
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);

				//Body substitution
				String body=null;		


				if ( relation.getDom().equals(parm.getType()) ){
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setName(parm.getName() + " : dom(" + associationBVariable.getName() + ")");
					body="returnedData := "+associationBVariable.getName()+"("+parm.getName()+")";
				}else{
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setName(parm.getName() + " : ran(" + associationBVariable.getName() + ")");
					body="returnedData := "+associationBVariable.getName()+"~("+parm.getName()+")";
				}			

				operation.setBody(body);				



				return operation;

			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : NavigableRole_GenerateAccessor!");e.printStackTrace();
			}

		}else{
			System.out.println("WARNING  - at NavigableRole_GenerateAccessor("+o+") : the given parameter is not a role ");
		}
		return null;
	}








	static public EObject NavigableRole_GenerateMutator_monovaluedSetter(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && UML_Util.isRole((Property) o)) {
			Property p = (Property) o;

			try {

				//retrieve the variable of the Association		
				if (p.upperBound()!=1){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_monovaluedSetter("+p.getQualifiedName()+"):  the given role is multivalued  ");
					return null;
				}

				//skip readOnly & derived roles
				//retrieve the variable of the Association		
				if (!UML_Util.isMutableProperty(p) ){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_monovaluedSetter("+p.getQualifiedName()+"):  the given role is unmodifiable  ");
					return null;
				}


				System.out.println("INFO - NavigableRole_GenerateMutator_monovaluedSetter : "+ p.getName());

				//retrieve the variable of the Association		
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_monovaluedSetter("+p.getQualifiedName()+"):  unmapped Association  ");
					return null;
				}


				Property opposite=null;
				Class baseClass,referencedClass;
				referencedClass=(Class)p.getType();					
				opposite=UML_Util.getOpposite(p);
				//check if the baseClass is a classifier
				if (!UMLPackage.Literals.CLASS.isInstance(opposite.getType())){
					throw new Exception("ERROR - At "+CopyOfUML2B_Selkis.class.getCanonicalName()+".NavigableRole_GenerateMutator_monovaluedSetter("+p.getQualifiedName()+"): the baseClass is not a class !");
				}
				baseClass=(Class) opposite.getType();

				// retrieve the association  variable
				//				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
				//					System.out.println("WARNING  - at NavigableRole_GenerateMutator_monovaluedSetter("+p.getQualifiedName()+"):  unmapped Association  ");
				//					return null;
				//				}


				BVariable baseClassBVariable = UML2BUtil.getClassInstnacesVariable(baseClass, ctx);
				BVariable referencedClassBVariable = UML2BUtil.getClassInstnacesVariable(referencedClass, ctx); 

				// retrieve the association  variable

				BVariable associationBVariable = UML2BUtil
				.getAssociationBVariable(p.getAssociation(), ctx);
				if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(associationBVariable
						.getType())) {
					throw new Exception(
							"ERROR - the variable of the association( "
							+ associationBVariable.getName()
							+ " ) is not a relation!");
				}				
				BComposedType relation = (BComposedType) associationBVariable.getType();













				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedRoleMutatorSetterLabel(p, (Package)ctx.getInputRoot()));					

				//add operation to the machine containing the attribute ariable
				baseClassBVariable.getDatadeclare().getOperations().add(operation);






				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(baseClass,(Package)ctx.getInputRoot()));
				parm.setType(baseClassBVariable);
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);




				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForRole(p,(Package)ctx.getInputRoot()));
				if ( relation.getDom().equals(parm.getType()) ){
					valueParm.setType(relation.getRan());
				}else{
					valueParm.setType(relation.getDom());
				}


				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());
				valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);

				//additional invariants
				String addInvars=null;

				//new value : (Instance|->value)/: relation
				valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				if ( relation.getDom().equals(parm.getType()) ){
					addInvars="("+parm.getName()+"|-> "+valueParm.getName()+") /: "+associationBVariable.getName() ;
						
				}else{
					addInvars="("+valueParm.getName()+"|-> "+parm.getName()+") /: "+associationBVariable.getName() ;
				}
				valueTypingPredicate.setName(addInvars);		


				//new value max card constraint : relation(Instance)/=value 
				if (opposite.upperBound()!=-1){

					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					//					if (opposite.lowerBound()==1){
					//						//#cc.(cc:InstanceType & cc/=Instance & cc: rel~[rel[{Instance}]])
					//						if ( relation.getDom().equals(parm.getType()) ){
					//							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"~["+associationBVariable.getName()+"[{"+parm.getName()+"}]])";
					//						}else{
					//							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"["+associationBVariable.getName()+"~[{"+parm.getName()+"}]])";
					//						}
					//
					//					}else
					if (opposite.upperBound()==1){
						//value/:ran(rel)
						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= valueParm.getName()+"/:ran("+associationBVariable.getName()+")";
						}else{
							addInvars= valueParm.getName()+"/:dom("+associationBVariable.getName()+")";
						}

					}else if (opposite.upperBound()==2){
						//not(#(c1,c2).(c1:InstanceType & c2:InstanceType & c1/=c2 & {c1,c2}<: rel~[{Value}]))

						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "not(#(c1,c2).(c1:"+baseClassBVariable.getName()+" & c2:"+baseClassBVariable.getName()+" & c1/=c2 & {c1,c2}<: "+associationBVariable.getName()+"~[{"+valueParm.getName()+"}]))";
						}else{
							addInvars= "not(#(c1,c2).(c1:"+baseClassBVariable.getName()+" & c2:"+baseClassBVariable.getName()+" & c1/=c2 & {c1,c2}<: "+associationBVariable.getName()+"[{"+valueParm.getName()+"}]))";
						}

					}else{

						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "card("+associationBVariable.getName()+"~[{"+valueParm.getName()+"}])<"+opposite.upperBound();
						}else{
							addInvars= "card("+associationBVariable.getName()+"[{"+valueParm.getName()+"}])<"+opposite.upperBound();
						}
					}

					valueTypingPredicate.setName(addInvars);	

				}



				//old value min card constraint 
				if (opposite.lowerBound()!=0){

					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					if (opposite.lowerBound()==1){
						//#cc.(cc:InstanceType & cc/=Instance & cc: rel~[rel[{Instance}]])
						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"~["+associationBVariable.getName()+"[{"+parm.getName()+"}]])";
						}else{
							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"["+associationBVariable.getName()+"~[{"+parm.getName()+"}]])";
						}

					}else{//

						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "(("+associationBVariable.getName()+"[{"+parm.getName()+"}]/={}) => card("+associationBVariable.getName()+"~["+associationBVariable.getName()+"[{"+parm.getName()+"}]])>"+opposite.lowerBound()+")";
						}else{
							addInvars= "(("+associationBVariable.getName()+"~[{"+parm.getName()+"}]/={}) => card("+associationBVariable.getName()+"["+associationBVariable.getName()+"~[{"+parm.getName()+"}]])>"+opposite.lowerBound()+")";
						}
					}

					valueTypingPredicate.setName(addInvars);	

				}






				//Body substitution
				String body=null;		


				if ( relation.getDom().equals(parm.getType()) ){
					body=associationBVariable.getName()+":= ({"+parm.getName()+"}<<|"+associationBVariable.getName()+")\\/ {("+parm.getName()+"|-> "+valueParm.getName()+")}";
				}else{
					body=associationBVariable.getName()+":= ("+associationBVariable.getName()+"|>>{"+parm.getName()+"})\\/{("+valueParm.getName()+"|-> "+parm.getName()+")}";					
				}						
				operation.setBody(body);				

				return operation;		
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : NavigableRole_GenerateMutator_monovaluedSetter!");e.printStackTrace();
			}

		}else{
			System.out.println("WARNING  - at NavigableRole_GenerateMutator_monovaluedSetter("+o+") : the given parameter is not a role ");
		}
		return null;
	}



	static public EObject NavigableRole_GenerateMutator_multivaluedAdder(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && UML_Util.isRole((Property) o)) {
			Property p = (Property) o;

			try {

				//retrieve the variable of the Association		
				if (!UML_Util.isMultivalued(p)){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedAdder("+p.getQualifiedName()+"):  the given role is not multivalued  ");
					return null;
				}


				//skip readOnly & derived roles
				//retrieve the variable of the Association		
				if (!UML_Util.isMutableProperty(p) ){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedAdder("+p.getQualifiedName()+"):  the given role is unmodifiable  ");
					return null;
				}
				
				System.out.println("INFO - NavigableRole_GenerateMutator_multivaluedAdder : "+ p.getName());

				//retrieve the variable of the Association		
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedAdder("+p.getQualifiedName()+"):  unmapped Association  ");
					return null;
				}


				Property opposite=null;
				Class baseClass,referencedClass;
				referencedClass=(Class)p.getType();					
				opposite=UML_Util.getOpposite(p);
				//check if the baseClass is a classifier
				if (!UMLPackage.Literals.CLASS.isInstance(opposite.getType())){
					throw new Exception("ERROR - At "+CopyOfUML2B_Selkis.class.getCanonicalName()+".NavigableRole_GenerateMutator_multivaluedAdder("+p.getQualifiedName()+"): the baseClass is not a class !");
				}
				baseClass=(Class) opposite.getType();

				// retrieve the association  variable
				//				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
				//					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedAdder("+p.getQualifiedName()+"):  unmapped Association  ");
				//					return null;
				//				}


				BVariable baseClassBVariable = UML2BUtil.getClassInstnacesVariable(baseClass, ctx);
				BVariable referencedClassBVariable = UML2BUtil.getClassInstnacesVariable(referencedClass, ctx); 

				// retrieve the association  variable

				BVariable associationBVariable = UML2BUtil
				.getAssociationBVariable(p.getAssociation(), ctx);
				if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(associationBVariable
						.getType())) {
					throw new Exception(
							"ERROR - the variable of the association( "
							+ associationBVariable.getName()
							+ " ) is not a relation!");
				}				
				BComposedType relation = (BComposedType) associationBVariable.getType();













				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedRoleMutatorAdderLabel(p, (Package)ctx.getInputRoot()));					

				//add operation to the machine containing the attribute ariable
				baseClassBVariable.getDatadeclare().getOperations().add(operation);






				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(baseClass,(Package)ctx.getInputRoot()));
				parm.setType(baseClassBVariable);
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);




				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForRole(p,(Package)ctx.getInputRoot()));
				if ( relation.getDom().equals(parm.getType()) ){
					valueParm.setType(relation.getRan());
				}else{
					valueParm.setType(relation.getDom());
				}


				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());
				valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);

				//additional invariants
				String addInvars=null;

				//new value const : (Instance|->value)/: relation
				valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				if ( relation.getDom().equals(parm.getType()) ){
					addInvars="("+parm.getName()+"|-> "+valueParm.getName()+") /:"+ associationBVariable.getName();
				}else{
					addInvars="("+valueParm.getName()+"|-> "+parm.getName()+") /:"+ associationBVariable.getName();
				}
				valueTypingPredicate.setName(addInvars);		




				if (p.upperBound()!=-1){//max card Invar
					//card(AttrVar[{Instance}])<upperBound
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(valueTypingPredicate);
					if ( relation.getDom().equals(parm.getType()) ){
						valueTypingPredicate.setName("card("+associationBVariable.getName()+"[{"+parm.getName()+"}])<"+p.upperBound());	
					}else{
						valueTypingPredicate.setName("card("+associationBVariable.getName()+"~[{"+parm.getName()+"}])<"+p.upperBound());						
					}


				}

				//				if (p.lowerBound()>1){//min card Invar
				//					//AttrVar[{Instance}]/={}
				//					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				//					parm.getTypingPredicate().add(valueTypingPredicate);
				//					if ( relation.getDom().equals(parm.getType()) ){
				//						valueTypingPredicate.setName(associationBVariable.getName()+"[{"+parm.getName()+"}]/={}");
				//					}else{
				//						valueTypingPredicate.setName(associationBVariable.getName()+"~[{"+parm.getName()+"}]/={}");
				//					}
				//										
				//
				//				}









				//new value max card constraint : relation(Instance)/=value 
				if (opposite.upperBound()!=-1){

					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					//					if (opposite.lowerBound()==1){
					//						//#cc.(cc:InstanceType & cc/=Instance & cc: rel~[rel[{Instance}]])
					//						if ( relation.getDom().equals(parm.getType()) ){
					//							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"~["+associationBVariable.getName()+"[{"+parm.getName()+"}]])";
					//						}else{
					//							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"["+associationBVariable.getName()+"~[{"+parm.getName()+"}]])";
					//						}
					//
					//					}else
					if (opposite.upperBound()==1){
						//value/:ran(rel)
						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= valueParm.getName()+"/:ran("+associationBVariable.getName()+")";
						}else{
							addInvars= valueParm.getName()+"/:dom("+associationBVariable.getName()+")";
						}

					}else if (opposite.upperBound()==2){
						//not(#(c1,c2).(c1:InstanceType & c2:InstanceType & c1/=c2 & {c1,c2}<: rel~[{Value}]))

						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "not(#(c1,c2).(c1:"+baseClassBVariable.getName()+" & c2:"+baseClassBVariable.getName()+" & c1/=c2 & {c1,c2}<: "+associationBVariable.getName()+"~[{"+valueParm.getName()+"}]))";
						}else{
							addInvars= "not(#(c1,c2).(c1:"+baseClassBVariable.getName()+" & c2:"+baseClassBVariable.getName()+" & c1/=c2 & {c1,c2}<: "+associationBVariable.getName()+"[{"+valueParm.getName()+"}]))";
						}

					}else{

						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "card("+associationBVariable.getName()+"~[{"+valueParm.getName()+"}])<"+opposite.upperBound();
						}else{
							addInvars= "card("+associationBVariable.getName()+"[{"+valueParm.getName()+"}])<"+opposite.upperBound();
						}
					}

					valueTypingPredicate.setName(addInvars);	

				}



				//				//old value min card constraint 
				//				if (opposite.lowerBound()!=0){
				//
				//					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				//					valueParm.getTypingPredicate().add(valueTypingPredicate);
				//					if (opposite.lowerBound()==1){
				//						//#cc.(cc:InstanceType & cc/=Instance & cc: rel~[rel[{Instance}]])
				//						if ( relation.getDom().equals(parm.getType()) ){
				//							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"~["+associationBVariable.getName()+"[{"+parm.getName()+"}]])";
				//						}else{
				//							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"["+associationBVariable.getName()+"~[{"+parm.getName()+"}]])";
				//						}
				//
				//					}else{//
				//
				//						if ( relation.getDom().equals(parm.getType()) ){
				//							addInvars= "(("+associationBVariable.getName()+"[{"+parm.getName()+"}]/={}) => card("+associationBVariable.getName()+"~["+associationBVariable.getName()+"[{"+parm.getName()+"}]])>"+opposite.lowerBound()+")";
				//						}else{
				//							addInvars= "(("+associationBVariable.getName()+"~[{"+parm.getName()+"}]/={}) => card("+associationBVariable.getName()+"["+associationBVariable.getName()+"~[{"+parm.getName()+"}]])>"+opposite.lowerBound()+")";
				//						}
				//					}
				//
				//					valueTypingPredicate.setName(addInvars);	
				//
				//				}






				//Body substitution
				String body=null;		


				if ( relation.getDom().equals(parm.getType()) ){
					body=associationBVariable.getName()+":= "+associationBVariable.getName()+"\\/ {("+parm.getName()+"|-> "+valueParm.getName()+")}";
				}else{
					body=associationBVariable.getName()+":= "+associationBVariable.getName()+"\\/{("+valueParm.getName()+"|-> "+parm.getName()+")}";					
				}						
				operation.setBody(body);				

				return operation;		
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : NavigableRole_GenerateMutator_multivaluedAdder!");e.printStackTrace();
			}

		}else{
			System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedAdder("+o+") : the given parameter is not a role ");
		}
		return null;
	}





	static public EObject NavigableRole_GenerateMutator_multivaluedRemover(ITransformationContext ctx,
			EObject o) {
		if ((o instanceof Property) && UML_Util.isRole((Property) o)) {
			Property p = (Property) o;

			try {

				//retrieve the variable of the Association		
				if (!UML_Util.isMultivalued(p)){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedRemover("+p.getQualifiedName()+"):  the given role is not multivalued  ");
					return null;
				}

				//skip readOnly & derived roles
				//retrieve the variable of the Association		
				if (!UML_Util.isMutableProperty(p) ){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedRemover("+p.getQualifiedName()+"):  the given role is unmodifiable  ");
					return null;
				}
				
				

				System.out.println("INFO - NavigableRole_GenerateMutator_multivaluedRemover : "+ p.getName());

				//retrieve the variable of the Association		
				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedRemover("+p.getQualifiedName()+"):  unmapped Association  ");
					return null;
				}


				Property opposite=null;
				Class baseClass,referencedClass;
				referencedClass=(Class)p.getType();					
				opposite=UML_Util.getOpposite(p);
				//check if the baseClass is a classifier
				if (!UMLPackage.Literals.CLASS.isInstance(opposite.getType())){
					throw new Exception("ERROR - At "+CopyOfUML2B_Selkis.class.getCanonicalName()+".NavigableRole_GenerateMutator_multivaluedRemover("+p.getQualifiedName()+"): the baseClass is not a class !");
				}
				baseClass=(Class) opposite.getType();

				// retrieve the association  variable
				//				if (UML2BUtil.getFirstMappingTargetElementByType(p.getAssociation(),BPackage.Literals.BVARIABLE, ctx)==null){
				//					System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedRemover("+p.getQualifiedName()+"):  unmapped Association  ");
				//					return null;
				//				}


				BVariable baseClassBVariable = UML2BUtil.getClassInstnacesVariable(baseClass, ctx);
				BVariable referencedClassBVariable = UML2BUtil.getClassInstnacesVariable(referencedClass, ctx); 

				// retrieve the association  variable

				BVariable associationBVariable = UML2BUtil
				.getAssociationBVariable(p.getAssociation(), ctx);
				if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(associationBVariable
						.getType())) {
					throw new Exception(
							"ERROR - the variable of the association( "
							+ associationBVariable.getName()
							+ " ) is not a relation!");
				}				
				BComposedType relation = (BComposedType) associationBVariable.getType();













				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedRoleMutatorRemoverLabel(p, (Package)ctx.getInputRoot()));					

				//add operation to the machine containing the attribute ariable
				baseClassBVariable.getDatadeclare().getOperations().add(operation);






				// declare the new instance as the constructor parameter
				BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(parm);
				parm.setName(UML2B_NamingRules.getClassInstanceLabel(baseClass,(Package)ctx.getInputRoot()));
				parm.setType(baseClassBVariable);
				// Instance : Class
				TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				parm.getTypingPredicate().add(typingPredicate);
				typingPredicate.setType(parm.getType());
				typingPredicate.setOperator(TypingOperator.IN);
				typingPredicate.setTypedElement(parm);




				// Attribute value parameter
				BOpParameter valueParm = BFactory.eINSTANCE.createBOpParameter();
				operation.getParam().add(valueParm);
				valueParm.setName(UML2B_NamingRules.getGeneratedParameterLabelForRole(p,(Package)ctx.getInputRoot()));
				if ( relation.getDom().equals(parm.getType()) ){
					valueParm.setType(relation.getRan());
				}else{
					valueParm.setType(relation.getDom());
				}


				// AttrValue : Type
				TypingPredicate valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				valueTypingPredicate.setType(valueParm.getType());
				valueTypingPredicate.setOperator(TypingOperator.IN);
				valueTypingPredicate.setTypedElement(valueParm);



				//additional invariants
				String addInvars=null;

				//existing link : (Instance|->value) : relation
				valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				valueParm.getTypingPredicate().add(valueTypingPredicate);
				if ( relation.getDom().equals(parm.getType()) ){
					addInvars="("+parm.getName()+"|-> "+valueParm.getName()+") :"+ associationBVariable.getName();
				}else{
					addInvars="("+valueParm.getName()+"|-> "+parm.getName()+") :"+ associationBVariable.getName();
				}
				valueTypingPredicate.setName(addInvars);		




				//				if (p.upperBound()!=-1){//max card Invar
				//					//card(AttrVar[{Instance}])<upperBound
				//					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				//					parm.getTypingPredicate().add(valueTypingPredicate);
				//					if ( relation.getDom().equals(parm.getType()) ){
				//						valueTypingPredicate.setName("card("+associationBVariable.getName()+"[{"+parm.getName()+"}])<"+p.upperBound());	
				//					}else{
				//						valueTypingPredicate.setName("card("+associationBVariable.getName()+"~[{"+parm.getName()+"}])<"+p.upperBound());						
				//					}
				//										
				//
				//				}

				if (p.lowerBound()>0){//min card Invar
					//card(rel[{Instance}])> role.lower
					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					if (p.lowerBound()==1){//#cc.(cc:valueType & cc/=value & (Instance|->cc):rel )
						if ( relation.getDom().equals(parm.getType()) ){
							valueTypingPredicate.setName("#cc.(cc: "+referencedClassBVariable.getName()+"& cc/="+valueParm.getName()+" & ("+parm.getName()+"|-> "+valueParm.getName()+"):"+associationBVariable.getName()+" )");	
						}else{
							valueTypingPredicate.setName("#cc.(cc: "+referencedClassBVariable.getName()+"& cc/="+valueParm.getName()+" & ("+valueParm.getName()+"|-> "+parm.getName()+"):"+associationBVariable.getName()+" )");

						}	
					}else{					
						if ( relation.getDom().equals(parm.getType()) ){
							valueTypingPredicate.setName("card("+associationBVariable.getName()+"[{"+parm.getName()+"}])>"+p.lowerBound());	
						}else{
							valueTypingPredicate.setName("card("+associationBVariable.getName()+"~[{"+parm.getName()+"}])>"+p.lowerBound());						
						}							
					}

				}












				//old value min card constraint 
				if (opposite.lowerBound()!=0){

					valueTypingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					valueParm.getTypingPredicate().add(valueTypingPredicate);
					if (opposite.lowerBound()==1){
						//#cc.(cc:InstanceType & cc/=Instance & cc: rel~[rel[{Instance}]])
						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"~[{"+valueParm.getName()+"}])";
						}else{
							addInvars= "#cc.(cc: "+baseClassBVariable.getName()+" & cc/="+parm.getName()+" & cc: "+associationBVariable.getName()+"[{"+valueParm.getName()+"}])";
						}

					}else{//

						if ( relation.getDom().equals(parm.getType()) ){
							addInvars= " card("+associationBVariable.getName()+"~[{"+valueParm.getName()+"}])>"+opposite.lowerBound();
						}else{
							addInvars= "card("+associationBVariable.getName()+"[{"+valueParm.getName()+"}])>"+opposite.lowerBound();
						}
					}

					valueTypingPredicate.setName(addInvars);	

				}






				//Body substitution
				String body=null;		


				if ( relation.getDom().equals(parm.getType()) ){
					body=associationBVariable.getName()+":= "+associationBVariable.getName()+"-{("+parm.getName()+"|-> "+valueParm.getName()+")}";
				}else{
					body=associationBVariable.getName()+":= "+associationBVariable.getName()+"-{("+valueParm.getName()+"|-> "+parm.getName()+")}";					
				}						
				operation.setBody(body);				

				return operation;		
			} catch (Exception e) {
				System.out.println("EXCEPTION OCCURENCE AT : NavigableRole_GenerateMutator_multivaluedRemover!");e.printStackTrace();
			}

		}else{
			System.out.println("WARNING  - at NavigableRole_GenerateMutator_multivaluedRemover("+o+") : the given parameter is not a role ");
		}
		return null;
	}




	static public EObject GenerateOperationSkeleton(ITransformationContext ctx,
			EObject o) {
		
		if ((o instanceof Operation)) {			
			try {
				Operation umlOperation = (Operation) o;
				
				System.out.println("DEBUG - Method " + umlOperation.getQualifiedName());
				
				
				/**akram********/
				//TODO change to CTM requirement				
/*				if (UML2BUtil.getFirstMappingTargetElementByType(umlOperation.getClass_(),BPackage.Literals.BVARIABLE, ctx)==null){
					System.out.println("WARNING  - at GenerateOperationSkeleton("+umlOperation.getQualifiedName()+"):  unmapped owning Class  ");
					return null;
				}
				BVariable classVariable;
				classVariable = UML2BUtil.getClassInstnacesVariable(umlOperation.getClass_(), ctx);*/
				
				/*******************************************************************/
				/**
				 * @author nguye_tm
				 * Advoid returning null when cannot find a mapped BVariable for the owner class of the considering operation
				 * (It is the case the operation belongs to an AssociationClass).
				 * Not return null but create a BOperation for such an operation. 
				 * Then add this BOperation to the list of the operations of the system machine (B machine named Functional).
				 * */
				/*******************************************************************/
				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedUmlOperationLabel(umlOperation, (Package)ctx.getInputRoot()));
				((BSpec) ctx.getOutputRoot()).getSystemMachine().getOperations().add(operation);
				
				
				BVariable classVariable = null;
				//check if there is a BVariable mapped to the class owning the operation
				//If true, simply display information and do nothing (BVariable = null).
				//Otherwise, print the information of the BVariable (BVariable /= null).
				if(UML2BUtil.getFirstMappingTargetElementByType(umlOperation.getClass_(),
								BPackage.Literals.BVARIABLE, ctx) == null){			
					
					Association c = (Association) umlOperation.getClass_();
					
					classVariable = (BVariable) UML2BUtil
					.getFirstMappingTargetElementByType(c, BPackage.Literals.BVARIABLE, ctx);
					/**why there is no BVar maps to this Association class while in its generate constructor has*/
					System.out.println("Maiiii DEBUG GenerateOperationSkeleton__AssociationClass is: " + c.toString());
					System.out.println("Maiiii DEBUG GenerateOperationSkeleton__BVariable is: " +classVariable);
				}
				else{
					classVariable = UML2BUtil.getClassInstnacesVariable(umlOperation.getClass_(), ctx);
					System.out.println("Maiiii DEBUG GenerateOperationSkeleton__BVariable is: " + classVariable);
				}							
				/*******************************************************************/
				/*END******************************************************************/
				/*******************************************************************/
				
				System.out.println("INFO - GenerateOperationSkeleton("+ umlOperation.getQualifiedName()+")");
				
				// retrieve Annotations
				EAnnotation annotation = UMLUtil.getEAnnotation(umlOperation, "uml2b", false);
				//System.out.println("INFO - at GenerateOperationSkeleton -- uml2b annotation : "+annotation.getDetails());
//				EAnnotation annotation = umlOperation.getEAnnotation("uml2b");
				
				
				if (annotation!=null){
					//skip generated operations
					
					if(annotation.getDetails().containsKey("AutoGenerated")){
						
						return null;
					}
				}
	
				
				
				

/*				// create a new B operation
				BOperation operation = BFactory.eINSTANCE.createBOperation();
				operation.setName(UML2B_NamingRules.getGeneratedUmlOperationLabel(umlOperation, (Package)ctx.getInputRoot()));
				classVariable.getDatadeclare().getOperations().add(operation);
				*/
				
				/************
				 * @author nguye_tm
				 * Skip Instance param in Method Actions (no getter/setter, or constructor/deconstructor)
				 * *************/
				if (!umlOperation.isStatic()){
					//skip Instance parameter
				}else{	
					// declare the new instance as the constructor parameter
					BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
					operation.getParam().add(parm);
					parm.setName(UML2B_NamingRules.getClassInstanceLabel(umlOperation.getClass_(),(Package)ctx.getInputRoot()));
					parm.setType(classVariable);
					// Instance : Class
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setType(parm.getType());
					typingPredicate.setOperator(TypingOperator.IN);
					typingPredicate.setTypedElement(parm);					
				}
				/************
				 * @author nguye_tm
				 * END
				 * ************/
				
				
				/*if (umlOperation.isStatic() 
					*//************
					 * @author nguye_tm
					 * for methods in an association class
					 * ************//*
					||(UML2BUtil.getFirstMappingTargetElementByType(umlOperation.getClass_(),
						BPackage.Literals.BVARIABLE, ctx) == null))
					*//************
					 * @author nguye_tm
					 * END: for methods in an association class
					 * ************//*
				{
					//skip Instance parameter
				}else{	
					// declare the new instance as the constructor parameter
					BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
					operation.getParam().add(parm);
					parm.setName(UML2B_NamingRules.getClassInstanceLabel(umlOperation.getClass_(),(Package)ctx.getInputRoot()));
					parm.setType(classVariable);
					// Instance : Class
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setType(parm.getType());
					typingPredicate.setOperator(TypingOperator.IN);
					typingPredicate.setTypedElement(parm);	
					
					*//************
					 * @author nguye_tm
					 * change the name of parm Instance to ClassInstance
					 * and change the form ClassInstance: Type
					 * ************//*
					BVariable varSet = (BVariable) UML2BUtil
					.getFirstMappingTargetElementByType(umlOperation.getClass_(),
							BPackage.Literals.BVARIABLE, ctx);
					BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
					operation.getParam().add(parm);
					parm.setName(umlOperation.getClass_().getName()+UML2B_NamingRules.getClassInstanceLabel(umlOperation.getClass_(),(Package)ctx.getInputRoot()));
					//parm.setType(classVariable);
					parm.setType(varSet.getType());
					// ClassInstance : Class
					TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					parm.getTypingPredicate().add(typingPredicate);
					typingPredicate.setType(classVariable);
					typingPredicate.setOperator(TypingOperator.IN);
					typingPredicate.setTypedElement(parm);
					*//************
					 * @author nguye_tm
					 * ************//*
				}
				*/
				
				//process input parameters
				Parameter returnParm=null;
				for (Parameter parameter : umlOperation.getOwnedParameters()) {
					//retrieve type
					//System.out.println("INFO - at GenerateOperationSkeleton Parameter: "+ parameter+" ! ");
					if( parameter.getDirection().equals( ParameterDirectionKind.IN_LITERAL) ){		
						
						/******************************************************************************
						 * @author nguye_tm
						 * Find the abstract set for a param according to its type (Class).
						 * 
						 * Use in the precondition to check the type of params
						 * e.g. ch : CHEQUE
						 * The typing predicate defines the type of params (type: belong to the class)
						 * e.g. ch : Cheque
						 * **/						
						BVariable var = UML2BUtil.
						getClassInstnacesVariable((Class) parameter.getType(), ctx);						
						BType abstractSetType = var.getType();

						/*BVariable var = (BVariable) UML2BUtil
						.getFirstMappingTargetElementByType(parameter.getType(),
								BPackage.Literals.BVARIABLE, ctx);
						BType abstractSetType = var.getType();*/
						/*********************************************************************************/
						
						
						BType type;
						type = UML2BUtil.getBType(parameter.getType(), ctx);
						System.out.println("INFO - at GenerateOperationSkeleton Parameter: "+ parameter+" ! ");
						
						
						BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
						operation.getParam().add(parm);
						parm.setName(parameter.getName());					
						parm.setType(abstractSetType);
						// parm : Type
						TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
						parm.getTypingPredicate().add(typingPredicate);
						typingPredicate.setType(type);
						typingPredicate.setOperator(TypingOperator.IN);
						typingPredicate.setTypedElement(parm);
					}else if ( parameter.getDirection().equals( ParameterDirectionKind.RETURN_LITERAL) ){							
						returnParm = parameter;
					}
				}
				
				
				
				if (annotation!=null){
					//insert annoted Precondition
					if(annotation.getDetails().containsKey("Precondition")){
						
						System.out.println("INFO - at GenerateOperationSkeleton : Precondition annotation detected ");
						BSubstitution substitution = BFactory.eINSTANCE.createBSubstitution();
						operation.setSubstitution(substitution);
						
						BPrecondition precondition = BFactory.eINSTANCE.createBPrecondition();
						substitution.setPrecondition(precondition);
						
						TypingPredicate typingPredicate;
						
						typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
						precondition.getTypingPredicate().add(typingPredicate);						
						typingPredicate.setName(annotation.getDetails().get("Precondition")+" /* Precondition generated from annotation*/ ");						
						
						}
				}




				//Body substitution
				String body="skip";		

				if (annotation!=null){
					//insert annoted Precondition					
					
					if(annotation.getDetails().containsKey("Body")){
						System.out.println("INFO - at GenerateOperationSkeleton : Body annotation detected ");
						
						body=annotation.getDetails().get("Body")+" /* Body generated from annotation */";
						
						
						
						}
				}
				
				if (returnParm!=null){
					if (body.indexOf("returnedData")==-1){
						body=body+"||returnedData:={/*TODO implement*/}";
					}
				}
				operation.setBody(body);	

				return operation;
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return null;
	}


	
	//-------------------AssociationClass--------------------------------
	
	
	static public EObject AssociationClass_GenerateConstructor(ITransformationContext ctx,
			EObject o) {
		if (o instanceof AssociationClass) {
			AssociationClass c = (AssociationClass) o;
			
			BOperation bop = null;
			
			if (c.isAbstract() ){				
				System.out.println("INFO  - at AssociationClass_GenerateConstructor("+c.getQualifiedName()+"):  Abstract Class ");
				return null;
			}



			bop = BFactory.eINSTANCE.createBOperation();
			((BSpec) ctx.getOutputRoot()).getSystemMachine().getOperations()
			.add(bop);
			bop.setName(UML2B_NamingRules.getGeneratedConstructorLabel(c,(Package)ctx.getInputRoot()));
			
	//		BVariable var = null;// temp var
			BVariable variable = null;
	

			// retrieve the BVariable representing the set of existing instances		
			variable = (BVariable) UML2BUtil
			.getFirstMappingTargetElementByType(c,
					BPackage.Literals.BVARIABLE, ctx);
			
			//System.out.println("Maiiiiiiiiiii DEBUG AssociationClass_GenerateConstructor__ AssociationClass: " + c.toString());
			
			//System.out.println("Maiiiiiiiiiii DEBUG AssociationClass_GenerateConstructor__ BVar: " + variable);
			
			if (variable == null) {
				System.out
				.println("WARNING - at AssociationClass_GenerateConstructor : no BVariable mapping found for the AssociationClass ("
						+ c.getQualifiedName() + ")");
				return null;
			}
		//	var = variable;
			// retrieve the relation of the AssocClass
			
			
			BComposedType relation;
			if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(variable.getType())){
				System.out.println("WARNING - at AssociationClass_GenerateConstructor : the Variable mapping found for the AssociationClass ("
						+ c.getQualifiedName() + ") is not a relation !");
				return null;
			}
			relation= (BComposedType) variable.getType();
			BVariable domVar,ranVar;
			
			domVar = (BVariable) relation.getDom();			
			ranVar = (BVariable) relation.getRan();
			
			BAbstractSet domSet,ranSet;
			domSet = BUtil.getVariableType(domVar);
			ranSet = BUtil.getVariableType(ranVar);
			
			Property domRole,ranRole;
			domRole=((Association) c).getMemberEnds().get(0);
			ranRole=((Association) c).getMemberEnds().get(1);
			
			Class domClass,ranClass;
			domClass=(Class) domRole.getType();
			ranClass=(Class) ranRole.getType();
			
						
			try {
				if (!UML2BUtil.getClassInstnacesVariable(domClass, ctx).equals(domVar)){//switch
					domRole=ranRole;
					ranRole=c.getMemberEnds().get(0);
					
					domClass=ranClass;
					ranClass=(Class) ranRole.getType();				
				}
			} catch (Exception e1) {	//no exception is expected			
				e1.printStackTrace();
				return null;
			}
			
			
			//declare
			
			// declare the new instance as the constructor parameter
			BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
			bop.getParam().add(parm);
			parm.setName(UML2B_NamingRules.getClassInstanceLabel(c,(Package)ctx.getInputRoot()));
			
			parm.setType(variable);//TODO use the right type (product) if available 
			//Instance : Class1*Class2
			TypingPredicate typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
			typingPredicate.setName(parm.getName() + " : "	+ domVar.getName()+"*"+ranVar.getName() );
			parm.getTypingPredicate().add(typingPredicate);
			//Instance /:AssociationClass
			typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
			typingPredicate.setName(parm.getName() + " /: "	+ variable.getName());
			parm.getTypingPredicate().add(typingPredicate);
			
			
			//--------DomainParmInstance---------			
			BOpParameter domParm = BFactory.eINSTANCE.createBOpParameter();
			bop.getParam().add(domParm);
			domParm.setName(UML2B_NamingRules.getClassInstanceNamedLabel(domClass,(Package)ctx.getInputRoot()));
			domParm.setType(domVar);
			// Instance : domClass
			typingPredicate = BFactory.eINSTANCE
			.createTypingPredicate();
			domParm.getTypingPredicate().add(typingPredicate);
			typingPredicate.setType(domParm.getType());
			typingPredicate.setOperator(TypingOperator.IN);
			typingPredicate.setTypedElement(domParm);

			//--------RangeParmInstance---------			
			BOpParameter ranParm = BFactory.eINSTANCE.createBOpParameter();
			bop.getParam().add(ranParm);
			ranParm.setName(UML2B_NamingRules.getClassInstanceNamedLabel(ranClass,(Package)ctx.getInputRoot()));
			ranParm.setType(ranVar);
			// Instance : ranClass
			typingPredicate = BFactory.eINSTANCE
			.createTypingPredicate();
			ranParm.getTypingPredicate().add(typingPredicate);
			typingPredicate.setType(ranParm.getType());
			typingPredicate.setOperator(TypingOperator.IN);
			typingPredicate.setTypedElement(ranParm);

			// (domInstance|->ranInstance)=Instance
			typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
			typingPredicate.setName("( "+domParm.getName()+"|->"+ranParm.getName()+" )= "+parm.getName());
			ranParm.getTypingPredicate().add(typingPredicate);
			
			//----------Cardinalities constraints---------------
			
			//lowerBounds >1 are unsupproted
			if (ranRole.lowerBound()>1 || ranRole.lowerBound()>1){
				System.out.println("WARNING - at AssociationClass_GenerateConstructor("+c.getQualifiedName()+") :lowerBounds of one or both roles are greater than 1 !");				
			}
			
			if (domRole.upperBound()>0 ){
				//domRole upperBound==1 => ranInstance/:ran(AssocClasVar)
				if (domRole.upperBound()==1){
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(ranParm.getName()+" /: ran("+variable.getName()+")");
					ranParm.getTypingPredicate().add(typingPredicate);				
				}else{// card(AssocClass~[{ranParm}])<domRole.upperBound
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(" card("+variable.getName()+"~[{"+ranParm.getName()+" }])< "+domRole.upperBound());
					ranParm.getTypingPredicate().add(typingPredicate);			
				}
			}
			if (ranRole.upperBound()>0 ){
				//ranRole upperBound==1 => domInstance/:dom(AssocClasVar)
				if (ranRole.upperBound()==1){
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(domParm.getName()+" /: dom("+variable.getName()+")");
					domParm.getTypingPredicate().add(typingPredicate);				
				}else{// card(AssocClass[{domParm}])<ranRole.upperBound
					typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
					typingPredicate.setName(" card("+variable.getName()+"[{"+domParm.getName()+" }])< "+ranRole.upperBound());
					ranParm.getTypingPredicate().add(typingPredicate);			
				}
			}
		
			
			// body substitution
			String body = null;
			
			// add the new instance to the class variable
			// Class:= Class \/ { Instance }
			body = variable.getName() + " := " + variable.getName() + " \\/ {"
			+ parm.getName() + "}";

			//TODO is AssociationClass inheritance (un)supported ?
			
			// super classes
			for (Iterator<Classifier> iterator = c.allParents().iterator(); iterator
			.hasNext();) {
				Classifier classifier = (Classifier) iterator.next();

				if (UMLPackage.Literals.CLASS.isInstance(classifier)) {
					Class superClass = (Class) classifier;
					// retrieve the BVariable representing the set of existing
					// instances
					// System.out.println("INFO - at AssociationClass_GenerateConstructor : retrieve sueprClass ("+superClass.getQualifiedName()+")");

					try {
						variable = UML2BUtil.getClassInstnacesVariable(superClass,
								ctx);
						body = body.concat(" \n || " + variable.getName() + " := "
								+ variable.getName() + " \\/ {" + parm.getName()
								+ "}");
						System.out
						.println("INFO - at AssociationClass_GenerateConstructor : retrieve sueprClass ("
								+ superClass.getQualifiedName() + ")");

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}

			// stBody
			bop.setBody(body);

			// uml constructor
			EList<String> ownedParameterNames = new BasicEList<String>();
			EList<Type> ownedParameterTypes = new BasicEList<Type>();
			Operation op = c.createOwnedOperation(toFirstUpperCase(c.getName())
					+ "_new", ownedParameterNames, ownedParameterTypes);
			op.setName(UML2B_NamingRules
					.getGeneratedConstructorSimplifiedLabel(c,(Package)ctx.getInputRoot()));

			EAnnotation annotation = op.createEAnnotation("uml2b");
			annotation.getDetails().put("autoGenerated", "true");
			annotation.getDetails().put("isAConstructor", "true");

			annotation.getDetails().put("body", body);
			annotation.getDetails().put("precondition",
					"Instance /: " + c.getName());
			// annotation.getDetails().put("precondition"," Instance : "+
			// c.getName().toUpperCase()+ "& Instance /: "+ c.getName());

			System.out.println("INFO - AssociationClass_GenerateConstructor for : "
					+ c.getQualifiedName());

			return bop;
		} else {
			return null;
		}
	}
	
	
	
	
	
	
	static public EObject AssociationClass_GenerateDestructor(ITransformationContext ctx,
			EObject o) {
		if (o instanceof AssociationClass) {// input element must be a package (or a
			// sub-type i.e Model )
			AssociationClass c = (AssociationClass) o;
			BOperation bop = null;
			
			if (c.isAbstract() ){				
				System.out.println("INFO  - at AssociationClass_GenerateDestructor("+c.getQualifiedName()+"):  Abstract Class ");
				return null;
			}

		

			// create a new BOperation
			bop = BFactory.eINSTANCE.createBOperation();
			((BSpec) ctx.getOutputRoot()).getSystemMachine().getOperations()
			.add(bop);
			bop.setName(UML2B_NamingRules.getGeneratedDestructorLabel(c,(Package)ctx.getInputRoot()));

			// retrieve the BVariable representing the set of existing instances
			BVariable variable = (BVariable) UML2BUtil
			.getFirstMappingTargetElementByType(c,
					BPackage.Literals.BVARIABLE, ctx);
			if (variable == null) {
				System.out
				.println("WARNING - at AssociationClass_GenerateDestructor : no BVariable mapping found for the class ("
						+ c.getQualifiedName() + ")");
				return null;
			}
			BVariable var = variable;

			// retrieve the BAbstractSet representing the set of possible

			BComposedType relation;
			if (!BPackage.Literals.BCOMPOSED_TYPE.isInstance(variable.getType())){
				System.out.println("WARNING - at AssociationClass_GenerateConstructor : the Variable mapping found for the AssociationClass ("
						+ c.getQualifiedName() + ") is not a relation !");
				return null;
			}
			relation= (BComposedType) variable.getType();
			BVariable domVar,ranVar;
			
			domVar = (BVariable) relation.getDom();			
			ranVar = (BVariable) relation.getRan();
			
			BAbstractSet domSet,ranSet;
			domSet = BUtil.getVariableType(domVar);
			ranSet = BUtil.getVariableType(ranVar);
			
			Property domRole,ranRole;
			domRole=c.getMemberEnds().get(0);
			ranRole=c.getMemberEnds().get(1);
			
			Class domClass,ranClass;
			domClass=(Class) domRole.getType();
			ranClass=(Class) ranRole.getType();
			
						
			try {
				if (!UML2BUtil.getClassInstnacesVariable(domClass, ctx).equals(domVar)){//switch
					domRole=ranRole;
					ranRole=c.getMemberEnds().get(0);
					
					domClass=ranClass;
					ranClass=(Class) ranRole.getType();				
				}
			} catch (Exception e1) {	//no exception is expected			
				e1.printStackTrace();
				return null;
			}
			
			
			//declare
			
			TypingPredicate typingPredicate ;
			
			
			// declare the new instance as the constructor parameter
			BOpParameter parm = BFactory.eINSTANCE.createBOpParameter();
			bop.getParam().add(parm);
			parm.setName(UML2B_NamingRules.getClassInstanceLabel(c,(Package)ctx.getInputRoot()));
			parm.setType(variable);
//			// Instance : CLASS
//			typingPredicate = BFactory.eINSTANCE
//			.createTypingPredicate();
//			parm.getTypingPredicate().add(typingPredicate);
//			typingPredicate.setType(BUtil.getVariableType(variable));
//			typingPredicate.setOperator(TypingOperator.IN);
//			typingPredicate.setTypedElement(parm);

			// Instance : AssoClass
			typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
			parm.getTypingPredicate().add(typingPredicate);
			typingPredicate.setType(variable);
			typingPredicate.setOperator(TypingOperator.IN);
			typingPredicate.setTypedElement(parm);

			// EObjectImpl obj = (EObjectImpl)model;
			// obj.eAllContents();

			// Instance /: subClassesUnion
			// retrieve sub classes
			EList<Class> subClasses = UML_Util.getSubClasses(c);

			//
			if (!subClasses.isEmpty()) {
				String invar = null;
				try {
					Iterator<Class> iterator = subClasses.iterator();
					var = UML2BUtil.getClassInstnacesVariable(iterator.next(),
							ctx);
					invar = parm.getName() + " /: (" + var.getName();
					for (; iterator.hasNext();) {
						// Class subClass = iterator.next() ;
						var = UML2BUtil.getClassInstnacesVariable(iterator
								.next(), ctx);
						invar = invar.concat(" \\/ " + var.getName());
					}
					invar = invar.concat(" )");
				} catch (Exception e) {
					e.printStackTrace();
				}
				typingPredicate = BFactory.eINSTANCE.createTypingPredicate();
				typingPredicate.setName(invar);
				parm.getTypingPredicate().add(typingPredicate);
			}
			//

			// body substitution
			String body = null;
			// add the new instance to the class variable
			// Class:= Class \/ { Instance }
			body = variable.getName() + " := " + variable.getName() + " - {"
			+ parm.getName() + "}";

			// super classes
			for (Iterator<Classifier> iterator = c.allParents().iterator(); iterator
			.hasNext();) {
				Classifier classifier =  iterator.next();

				if (UMLPackage.Literals.CLASS.isInstance(classifier)) {
					Class superClass = (Class) classifier;
					// retrieve the BVariable representing the set of existing
					// instances
					// System.out.println("INFO - at GenerateConstructor : retrieve sueprClass ("+superClass.getQualifiedName()+")");

					try {
						var = UML2BUtil.getClassInstnacesVariable(superClass,
								ctx);
						body = body
						.concat(" \n || " + var.getName() + " := "
								+ var.getName() + " - {"
								+ parm.getName() + "}");
						System.out
						.println("INFO - at AssociationClass_GenerateDestructor : retrieve sueprClass ("
								+ superClass.getQualifiedName() + ")");

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}

			// stBody
			bop.setBody(body);

			// uml constructor
			EList<String> ownedParameterNames = new BasicEList<String>();
			EList<Type> ownedParameterTypes = new BasicEList<Type>();
			Operation op = c.createOwnedOperation(toFirstUpperCase(c.getName())
					+ "_free", ownedParameterNames, ownedParameterTypes);
			op.setName(UML2B_NamingRules
					.getGeneratedDestructorSimplifiedLabel(c,(Package)ctx.getInputRoot()));

			EAnnotation annotation = op.createEAnnotation("uml2b");
			annotation.getDetails().put("isAConstructor", "true");

			annotation.getDetails().put("body", body);
			annotation.getDetails().put("precondition",
					"Instance /: " + c.getName());
			// annotation.getDetails().put("precondition"," Instance : "+
			// c.getName().toUpperCase()+ "& Instance /: "+ c.getName());
			// update Trace

			((TransformationTrace) ctx.getTraceRoot()).addMap(EcoreUtil.getURI(
					op).toString(), CopyOfUML2B_Selkis.class.getCanonicalName()
					+ ".AssociationClass_GenerateDestructor_Internal", EcoreUtil.getURI(bop)
					.toString());

			System.out.println("INFO - AssociationClass_GenerateDestructor for : "
					+ c.getName());

			return bop;
		} else {
			return null;
		}
	}
	
	
	
	
	
	
	
	static public EObject InsertMachineInvariantsFromPackage(ITransformationContext ctx, EObject o) {
		if (o instanceof Package) {// input element must be a package (or a
			// sub-type i.e Model )
			
			System.out.println("INFO  - at InsertMachineInvariantsFromPackage("+((Package)o).getQualifiedName()+")! ");
			// retrieve Annotations
			EAnnotation annotation = UMLUtil.getEAnnotation((Package)o, "uml2b", false);
			
			
			
			if (annotation!=null){
				System.out.println("		uml2b Annotation Found : "+annotation.getDetails()); 
				//insert annoted Precondition
				if(annotation.getDetails().containsKey("Invariants")){
					System.out.println("		Invariants Entry Found: "+annotation.getDetails().get("Invariants"));	
				BMachine machine= ((BSpec)ctx.getOutputRoot()).getSystemMachine();
				Package p = (Package) o;
				
				BInvariant invariant = BFactory.eINSTANCE.createBInvariant();
				invariant.setBody(annotation.getDetails().get("Invariants"));
				
				machine.getInvariant().add(invariant);
				
				return invariant;
					
				}
			}
			
			
			
				
			
		}	
	return null;
		
	}
	
	
}
