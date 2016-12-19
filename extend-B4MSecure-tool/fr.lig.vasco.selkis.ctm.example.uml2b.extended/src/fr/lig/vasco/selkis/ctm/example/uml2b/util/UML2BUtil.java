package fr.lig.vasco.selkis.ctm.example.uml2b.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import UML2B.Transfo.UML2B_NamingRules;

import fr.lig.vasco.models.b.BOperation;
import fr.lig.vasco.models.b.BPackage;
import fr.lig.vasco.models.b.BType;
import fr.lig.vasco.models.b.BVariable;
import fr.lig.vasco.selkis.ctm.ITransformationContext;
import fr.lig.vasco.selkis.ctm.trace.DestModelElement;
import fr.lig.vasco.selkis.ctm.trace.Mapping;
import fr.lig.vasco.selkis.ctm.trace.SrcModelElement;
import fr.lig.vasco.selkis.ctm.trace.TransformationTrace;

public class UML2BUtil {

	private ITransformationContext ctx = null;

	// return BElement list
	public static EList<EObject> getAllMappingTargetElements(Element element,
			ITransformationContext ctx) {
		TransformationTrace trace = (TransformationTrace) ctx.getTraceRoot();
		SrcModelElement src = trace.resolve(EcoreUtil.getURI(element)
				.toString());
		EList<EObject> list = new BasicEList<EObject>();
		if (src != null) {
			
			for (Iterator iterator = src.getMapping().iterator(); iterator
					.hasNext();) {
				Mapping mapping = (Mapping) iterator.next();
				for (Iterator iterator2 = mapping.getDest().iterator(); iterator2
						.hasNext();) {
					DestModelElement dest = (DestModelElement) iterator2.next();
					if (dest.getRef() != null && dest.getRef() != "") {
						EObject obj = ctx.getOutputRoot().eResource()
								.getResourceSet().getEObject(
										URI.createURI(dest.getRef()), false);
						if (obj != null)
							list.add(obj);
					}

				}

			}
			return list;
		}
		return list;
	}

	// return BElement list
	public static EList<EObject> getAllMappingSourceElements(EObject element,
			ITransformationContext ctx) {
		TransformationTrace trace = (TransformationTrace) ctx.getTraceRoot();

		EList<EObject> list = new BasicEList<EObject>();

		for (Iterator iterator = trace.getMaps().iterator(); iterator.hasNext();) {
			Mapping map = (Mapping) iterator.next();
			for (Iterator iterator2 = map.getDest().iterator(); iterator2
					.hasNext();) {
				DestModelElement dest = (DestModelElement) iterator2.next();
				if (dest.getRef().equals(EcoreUtil.getURI(element).toString())) {
					list.add(ctx.getInputRoot().eResource().getResourceSet()
							.getEObject(URI.createURI(map.getSrc().getRef()),
									false));
				}

			}

		}
		return list;

	}

	public static Collection<EObject> getMappingTargetElementsByType(
			Element element, EClass type, ITransformationContext ctx) {
		return EcoreUtil.getObjectsByType(getAllMappingTargetElements(element,
				ctx), type);
	}

/*	public static EObject getFirstMappingTargetElementByType(Element element,
			EClass type, ITransformationContext ctx) {
		return (EObject) EcoreUtil.getObjectByType(getAllMappingTargetElements(
				element, ctx), type);
	}*/
	
	/**
	 * @author nguye_tm
	 * aim to take into account not only EClass but all EObject
	 */
	public static EObject getFirstMappingTargetElementByType(Element element,
			EObject type, ITransformationContext ctx) {
		return (EObject) EcoreUtil.getObjectByType(getAllMappingTargetElements(
				element, ctx), (EClassifier) type);
	}

	public static BVariable getClassInstnacesVariable(Class c,
			ITransformationContext ctx) throws Exception {
		BVariable var = (BVariable) getFirstMappingTargetElementByType(c,
				BPackage.Literals.BVARIABLE, ctx);
		if (var == null) {
			// System.out.println("WARNING - at GenerateConstructor : no BVariable mapping found for the class ("+
			// c.getQualifiedName() + ")");
			throw new Exception("ERROR - at getClassInstnacesVariable : no BVariable mapping found for the class ("
							+ c.getQualifiedName() + ")");
		}
		return var;
	}


/*	*//**
	 * @author nguye_tm
	 * aim to get the corresponding BVariable of an association (actually is association class) 
	 *//*
	public static BVariable getAssociationInstnacesVariable(Association c,
			ITransformationContext ctx) throws Exception {
		BVariable var = (BVariable) getAssociationBVariable(c, ctx);
		if (var == null) {
			// System.out.println("WARNING - at GenerateConstructor : no BVariable mapping found for the class ("+
			// c.getQualifiedName() + ")");
			throw new Exception("ERROR - at getAssociationInstnacesVariable : no BVariable mapping found for the class ("
							+ c.getClass() + ")");
		}
		return var;
	}*/
	
	/***************************************/
	
	
	public static BOperation getBConstructor(Class c, ITransformationContext ctx)
			throws Exception {
		Collection<EObject> operations = UML2BUtil
				.getMappingTargetElementsByType(c,
						BPackage.Literals.BOPERATION, ctx);
		if (!operations.isEmpty()) {
			for (Iterator iterator = operations.iterator(); iterator.hasNext();) {
				BOperation op = (BOperation) iterator.next();
				if (op.getName().equals(
						UML2B_NamingRules.getGeneratedConstructorLabel(c,(Package)ctx.getInputRoot()))) {
					return op;
				}
			}
		}
		throw new Exception(
				"Error - enable to find the BConstructor related to the class ( "
						+ c.getQualifiedName() + " )");
	}

	public static BOperation getBDestructor(Class c, ITransformationContext ctx)
			throws Exception {
		Collection<EObject> operations = UML2BUtil
				.getMappingTargetElementsByType(c,
						BPackage.Literals.BOPERATION, ctx);
		if (!operations.isEmpty()) {
			for (Iterator iterator = operations.iterator(); iterator.hasNext();) {
				BOperation op = (BOperation) iterator.next();
				if (op.getName().equals(
						UML2B_NamingRules.getGeneratedDestructorLabel(c,(Package)ctx.getInputRoot()))) {
					return op;
				}
			}
		}
		throw new Exception(
				"Error - enable to find the BDestructor related to the class ( "
						+ c.getQualifiedName() + " )");
	}

	public static BVariable getAttributeBVariable(Property p,
			ITransformationContext ctx) throws Exception {
		BVariable relation = (BVariable) UML2BUtil
				.getFirstMappingTargetElementByType(p,
						BPackage.Literals.BVARIABLE, ctx);
		if (relation == null) {
			throw new Exception(
					"Error - enable to find the BVariable related to the attribute ( "
							+ p.getQualifiedName() + " )");
		}
		return relation;
	}
	
	
	
	public static BVariable getAssociationBVariable(Association a,
			ITransformationContext ctx) throws Exception {
		BVariable relation = (BVariable) UML2BUtil
				.getFirstMappingTargetElementByType(a,
						BPackage.Literals.BVARIABLE, ctx);
		if (relation == null) {
			throw new Exception(
					"Error - enable to find the BVariable related to the attribute ( "
							+ a.getQualifiedName() + " )");
		}
		return relation;
	}
	
	
	
	public static BType getBType(Type umlType, ITransformationContext ctx) throws Exception{
		BType bType=null;
		bType =(BType) UML2BUtil.getFirstMappingTargetElementByType(umlType,BPackage.Literals.BTYPE, ctx);
		if (bType == null) {
			throw new Exception("Error - enable to find the BType related to the UML type( "+ umlType+" )");
		}
		
		return bType;
		
	}
	
	

}
