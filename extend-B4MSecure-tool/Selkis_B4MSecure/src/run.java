import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTree;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVarDef;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.typesystem.emf.XmiReader;
import org.eclipse.xtend.typesystem.uml2.UML2MetaModel;

import fr.lig.vasco.models.b.BFactory;
import fr.lig.vasco.models.b.BPackage;
import fr.lig.vasco.models.b.BSpec;
import fr.lig.vasco.selkis.ctm.emf.util.EMFHelper;
import fr.lig.vasco.selkis.ctm.example.uml2b.UML2B_transformation;
import fr.lig.vasco.selkis.ctm.trace.TraceFactory;
import fr.lig.vasco.selkis.ctm.trace.TracePackage;
import fr.lig.vasco.selkis.ctm.trace.TransformationTrace;
import fr.lig.vasco.selkis.ctm.transformationconfig.Config;
import fr.lig.vasco.selkis.ctm.transformationconfig.TransformationconfigPackage;


public class run {	
	static String umlModelName 	= "PurchaseOrder" ;
	static String subPackage 	= "PurchaseOrderModel::PurchaseOrder::Functional";
	static String resourcesPath	= "../TopcasedPurchaseOrder/Models/";
	
/*	static String umlModelName 	= "B4MSecureModel" ;
	static String subPackage 	= "B4MSecureModel::B4MSecureModel::Functional";
	static String resourcesPath	= "../YvesProject/Models/";*/
	
	public static void main(String[] args) {
		
		File folder = new File ("../"); 
        File[] listofFiles = folder.listFiles();
        for(int i=0; i < listofFiles.length; i++)
            System.out.println(listofFiles[i]);
        
		String[] SecureFunc = {"Translate functional model", "Translate security model", "Annuler"};		
		int choix = JOptionPane.showOptionDialog( null, 
		                                          "Choose a model to translate !", 
		                                          "Translation", 
		                                          JOptionPane.OK_CANCEL_OPTION, 
		                                          JOptionPane.QUESTION_MESSAGE, 
		                                          null, 
		                                          SecureFunc, 
		                                          null );		

		if(choix == 0)
		{
			runMFunctional() ;
			JOptionPane.showMessageDialog(null, "Translation fo the functional model completed\n Execute the QVTo transformation and then run this program again !");
		}else if(choix == 1){
			runMSecure() ;
			JOptionPane.showMessageDialog(null, "Translation of the security model completed.");
		}else{
			System.out.println("Translation cancelled") ;
		}
	}

	private static void runMFunctional(){
		//transformation I/O
		String configFile = "config/UML2B_AC.transformationconfig" ;
		String umlFile= resourcesPath + umlModelName + ".uml";
		System.out.println("");
		String bFile= resourcesPath + umlModelName + ".b";
		//String bTextFile= resourcesPath + umlModelName+".mch";
		String traceFile= resourcesPath + umlModelName + ".trace";
		
		//external rules file
		String extendFile = "UML2B";	
		
		try {
			EList<EObject> eList = new BasicEList<EObject>();

			//load models into one resourceSet 
			
			EMFHelper helper = new EMFHelper();			
			
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
						//bFile = resourcesPath +umlModelName+"__"+ pkg.getQualifiedName().replace(':','_')+".b";
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
			
			UML2B_transformation transfo = new UML2B_transformation(trace, config, pkg, bSpec, extendFile);
			transfo.runConfig();
			
			bSpec.eResource().save(Collections.EMPTY_MAP);
			trace.eResource().save(Collections.EMPTY_MAP);
			
			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", bFile);
			//params.put("outputFile", bTextFile);				
			params.put("BModelPath", resourcesPath);
			//params.put("output", "file.txt");
			new WorkflowRunner().run("B2Text.oaw", new NullProgressMonitor(),params, Collections.EMPTY_MAP);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void runMSecure(){
		try {
			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", resourcesPath + umlModelName + ".b");
			params.put("UMLModel", resourcesPath + umlModelName + ".uml");
			params.put("TraceModel", resourcesPath + umlModelName + ".trace");
			params.put("ORBAC2Model", resourcesPath + umlModelName + ".uml.ORBAC2");
			params.put("BModelPath", resourcesPath);
			
			WorkflowRunner frRun = new WorkflowRunner() ;
			frRun.prepare("FireTemplate.oaw", new NullProgressMonitor(), params);
			IssuesImpl issues = new IssuesImpl();
			frRun.executeWorkflow(new HashMap<String, String>(), issues);
			//System.out.println(issues.toString());//e.g. print them to the console*/
			
			new WorkflowRunner().run("FireTemplate.oaw", new NullProgressMonitor(), params, Collections.EMPTY_MAP);
		}catch (Exception e) {e.printStackTrace();}
	}
	
	private static void runMSecureProg(){
		try {
			/*HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", resourcesPath + umlModelName + ".b");
			params.put("UMLModel", resourcesPath + umlModelName + ".uml");
			params.put("TraceModel", resourcesPath + umlModelName + ".trace");
			params.put("ORBAC2Model", resourcesPath + umlModelName + ".uml.ORBAC2");
			params.put("BModelPath", resourcesPath);*/
			
			EmfMetaModel bMetaModel = new EmfMetaModel(fr.lig.vasco.models.b.BPackage.eINSTANCE);
			UML2MetaModel umlMetaModel = new UML2MetaModel() ;
			EmfMetaModel orbac2MetaModel = new EmfMetaModel(fr.lig.vasco.selkis.security.model.ORBAC2.ORBAC2Package.eINSTANCE);
			EmfMetaModel traceMetaModel = new EmfMetaModel(fr.lig.vasco.selkis.ctm.trace.TracePackage.eINSTANCE);
			
			XmiReader bModelReader = new XmiReader();
			bModelReader.setModelFile(resourcesPath + umlModelName + ".b");
			bModelReader.setOutputSlot("bSlot");
			
			XmiReader umlModelReader = new XmiReader();
			umlModelReader.setModelFile(resourcesPath + umlModelName + ".uml");
			umlModelReader.setOutputSlot("umlSlot");
			
			XmiReader traceModelReader = new XmiReader();
			traceModelReader.setModelFile(resourcesPath + umlModelName + ".trace");
			traceModelReader.setOutputSlot("traceSlot");
			
			XmiReader orbac2ModelReader = new XmiReader();
			orbac2ModelReader.setModelFile(resourcesPath + umlModelName + ".uml.ORBAC2");			
			orbac2ModelReader.setOutputSlot("orbac2Slot");
			
			Generator generator = new Generator();
			generator.addMetaModel(bMetaModel);
			generator.addMetaModel(umlMetaModel);
			generator.addMetaModel(orbac2MetaModel);
			generator.addMetaModel(traceMetaModel);
			
			/*<globalVarDef name="TRACE" value="traceSlot"/>
	    	<globalVarDef name="BSPEC" value="bSlot"/>
	    	<globalVarDef name="UML" value="umlSlot"/>*/
			GlobalVarDef varTrace = new GlobalVarDef();
			varTrace.setName("TRACE"); varTrace.setValue("traceSlot"); 
			generator.addGlobalVarDef(varTrace);
			
			GlobalVarDef varBSpec = new GlobalVarDef();
			varBSpec.setName("BSPEC"); varBSpec.setValue("bSlot"); 
			generator.addGlobalVarDef(varBSpec);
			
			GlobalVarDef varUML = new GlobalVarDef();
			varUML.setName("UML"); varUML.setValue("umlSlot"); 
			generator.addGlobalVarDef(varUML);
	    	
	    	
			/*<outlet path="${BModelPath}"></outlet>*/
			Outlet outlet = new Outlet();
			outlet.setPath(resourcesPath);
			generator.addOutlet(outlet);
			
			generator.setExpand("BSecureSpec_RBAC::file FOR orbac2Slot");
			
			// workflow
			Workflow workflow = new Workflow();
			WorkflowContext wfx = new WorkflowContextDefaultImpl();
			Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
			NullProgressMonitor monitor = new NullProgressMonitor();
			
			workflow.addComponent(bModelReader);
			workflow.addComponent(umlModelReader);
			workflow.addComponent(traceModelReader);
			workflow.addComponent(orbac2ModelReader);
			
			workflow.addComponent(generator);
			workflow.invoke(wfx, monitor, issues);
			
		}catch (Exception e) {e.printStackTrace();}
	}

}
