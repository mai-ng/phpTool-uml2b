package fr.lig.vasco.selkis.ctm.example.uml2b;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.lig.vasco.models.b.BFactory;
import fr.lig.vasco.models.b.BPackage;
import fr.lig.vasco.models.b.BSpec;
import fr.lig.vasco.selkis.ctm.emf.util.EMFHelper;
import fr.lig.vasco.selkis.ctm.trace.TraceFactory;
import fr.lig.vasco.selkis.ctm.trace.TracePackage;
import fr.lig.vasco.selkis.ctm.trace.TransformationTrace;
import fr.lig.vasco.selkis.ctm.transformationconfig.Config;
import fr.lig.vasco.selkis.ctm.transformationconfig.TransformationconfigPackage;

public class UML2B_SecureProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//transformation I/O
		String configFile="config/UML2B_AC.transformationconfig";
//		String configFile="config/UML2B_CTM.transformationconfig";
//		String configFile="config/exps.transformationconfig";


		
		/*qualified name of the targeted Package of the UML model */
		String subPackage=null;
//		subPackage="VideoClub::SubPackage";
//		UML_ClassDiagram::UML_ClassDiagram::Class
//		UML_ClassDiagram::UML_ClassDiagram::Association
//		UML_ClassDiagram::UML_ClassDiagram::Heritage::Heritage_multiple2
		
//		subPackage="UML_ClassDiagram::UML_ClassDiagram::Association::AssociationClass::Assoc_Class_02_0n";
		
		
//		subPackage="sample::Sample";
//		subPackage="Selkis_VASCO_ORBAC::Selkis_VASCO_ORBAC";
		
		if (args.length==1){
			subPackage =args[0];
		}
		

		String umlModelName="TestModel";
		subPackage="Model::FunctionalModel";
		

		String resourcesPath="C:/DevTools/Topcased-3.4.1/WS/fr.lig.vasco.selkis.security.SecureBmodelGenerator/resources/";
		String umlFile= resourcesPath+umlModelName+".uml";
		String bFile= resourcesPath + umlModelName+".b";
		String traceFile= resourcesPath + umlModelName+".trace";
		
		//external rules file
		String extendFile="UML2B";	
		
		try {
			EList<EObject> eList = new BasicEList<EObject>();

//			load models into one resourceSet 
			
			EMFHelper helper=new EMFHelper();			
			
			
			//config model
			 eList=helper.loadRessourcefromXMI(TransformationconfigPackage.eINSTANCE,configFile);
			Config config=(Config) eList.get(0);	
			//uml model
			eList=helper.loadRessourcefromXMI(UMLPackage.eINSTANCE,umlFile);
			Package pkg=(Package) eList.get(0);
			System.out.println(eList+"\n ************");
			
			
			
			
			//retrieve the subPackage to be transformed 
			if (subPackage!=null && subPackage!=""){
				Collection<NamedElement> neCollection = UMLUtil.findNamedElements(pkg.eResource(), subPackage);
				if(!neCollection.isEmpty()){
					Collection<Object> pkgColl = EcoreUtil.getObjectsByType(neCollection,UMLPackage.Literals.PACKAGE);
					if (pkgColl.iterator().hasNext()){
						pkg= (Package) pkgColl.iterator().next();
						//System.out.println("Trageted Package : "+pkg.getQualifiedName());
						bFile=resourcesPath +umlModelName+"__"+ pkg.getQualifiedName().replace(':','_')+".b";
					}			
				}
			}
			
			
			System.out.println("Trageted Package : "+pkg.getQualifiedName());
						
			//B model
			BSpec bSpec=BFactory.eINSTANCE.createBSpec();
			helper.newXMIResource(BPackage.eINSTANCE, bSpec,bFile);
			
			//Trace model
			TransformationTrace trace=TraceFactory.eINSTANCE.createTransformationTrace(); 
			helper.newXMIResource(TracePackage.eINSTANCE, trace,traceFile);
			
						
			
			UML2B_transformation transfo=new UML2B_transformation(trace, config, pkg, bSpec, extendFile);
			transfo.runConfig();
			
			
			
			
			
			bSpec.eResource().save(Collections.EMPTY_MAP);
			trace.eResource().save(Collections.EMPTY_MAP);

			
			
			
			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", bFile);
			params.put("BModelPath", resourcesPath);
			//params.put("output", "B/VideoClub.txt");
			new WorkflowRunner().run("UML2BExtensions/B2Text.oaw", new NullProgressMonitor(),params, Collections.EMPTY_MAP);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	

}
