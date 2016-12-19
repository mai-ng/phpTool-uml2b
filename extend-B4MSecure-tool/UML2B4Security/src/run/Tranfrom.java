package run;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

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

public class Tranfrom {
	
	  static String umlModelName = "PurchaseOrder" ; 
	  static String subPackage =  "PurchaseOrderModel::PurchaseOrder::Functional"; 
	  static String resourcesPath = "../TopcasedPurchaseOrder/Models/";
	 

/*	static String umlModelName = "ChequeDeposit";
	static String subPackage = "B4MSecureModel::ChequeDeposit::Functional";
	static String resourcesPath = "../TopcasedChequeDeposit/Models/";*/

	
/*	  static String umlModelName = "Hospital" ; 
	  static String subPackage =  "B4MSecureModel::B4MSecureModel::Functional"; 
	  static String resourcesPath  = "../Hospital/Models/";*/
	 

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		
		JButton runM2TextFunctionBtn = new JButton("Translate Functional Model");
		JButton runM2TextStaticSecurityBtn = new JButton("Translate Static Security Model");
		JButton runM2TextDynamicSecurityBtn = new JButton("Translate Dynamic Security Model");
		JButton runM2TextFilterBtn = new JButton("Translate Security Filter");

		jFrame.setLayout(new GridLayout(4,1));
		jFrame.add(runM2TextFunctionBtn);
		jFrame.add(runM2TextStaticSecurityBtn);
		jFrame.add(runM2TextDynamicSecurityBtn);
		jFrame.add(runM2TextFilterBtn);
		//jFrame.setSize(600, 800);
		jFrame.setPreferredSize(new Dimension(400,200));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.setTitle("Choose one model to translate!");
		
		runM2TextFunctionBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				runM2Text_func();
				System.exit(0);
			}
		});
		
		runM2TextStaticSecurityBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				runM2Text_func();
				runM2Text_staticSecurty();
				System.exit(0);
			}
		});
		
		runM2TextDynamicSecurityBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				runM2Text_func();
				runM2Text_dynamicSecurity();	
				System.exit(0);
			}
		});
		
		runM2TextFilterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				runM2Text_func();
				runM2Text_staticSecurty();
				runM2Text_dynamicSecurity();
				runM2Text_filter();
				System.exit(0);
			}
		});
		//		
		 File folder = new File ("../");
		 File[] listofFiles = folder.listFiles();
		 for(int i=0; i < listofFiles.length; i++)
		 System.out.println(listofFiles[i]);
		//        
		// runM2Text_func();
		// runM2Text_staticSecurty();
		// runM2Text_dynamicSecurity();
		// runM2Text_filter() ;
		jFrame.pack();
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}

	private static void runM2Text_func() {
		// transformation I/O
		String configFile = "config/UML2B_AC.transformationconfig";
		String umlFile = resourcesPath + umlModelName + ".uml";
		System.out.println("");
		String bFile = resourcesPath + umlModelName + ".b";
		// String bTextFile= resourcesPath + umlModelName+".mch";
		String traceFile = resourcesPath + umlModelName + ".trace";

		// external rules file
		String extendFile = "UML2B";

		try {
			EList<EObject> eList = new BasicEList<EObject>();

			// load models into one resourceSet

			EMFHelper helper = new EMFHelper();

			// config model
			eList = helper.loadRessourcefromXMI(
					TransformationconfigPackage.eINSTANCE, configFile);
			Config config = (Config) eList.get(0);
			// uml model
			eList = helper.loadRessourcefromXMI(UMLPackage.eINSTANCE, umlFile);
			Package pkg = (Package) eList.get(0);
			System.out.println(eList + "\n ************");

			// retrieve the subPackage to be transformed
			if (subPackage != null && subPackage != "") {
				Collection<NamedElement> neCollection = UMLUtil
						.findNamedElements(pkg.eResource(), subPackage);
				if (!neCollection.isEmpty()) {
					Collection<Object> pkgColl = EcoreUtil.getObjectsByType(
							neCollection, UMLPackage.Literals.PACKAGE);
					if (pkgColl.iterator().hasNext()) {
						pkg = (Package) pkgColl.iterator().next();
					}
				}
			}

			System.out.println("Trageted Package : " + pkg.getQualifiedName());

			// B model
			BSpec bSpec = BFactory.eINSTANCE.createBSpec();
			helper.newXMIResource(BPackage.eINSTANCE, bSpec, bFile);

			// Trace model
			TransformationTrace trace = TraceFactory.eINSTANCE
					.createTransformationTrace();
			helper.newXMIResource(TracePackage.eINSTANCE, trace, traceFile);

			UML2B_transformation transfo = new UML2B_transformation(trace,
					config, pkg, bSpec, extendFile);
			transfo.runConfig();

			bSpec.eResource().save(Collections.EMPTY_MAP);
			trace.eResource().save(Collections.EMPTY_MAP);

			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", bFile);
			// params.put("outputFile", bTextFile);
			params.put("BModelPath", resourcesPath);
			// params.put("output", "file.txt");
			new WorkflowRunner().run("B2TextWorkflow.oaw",
					new NullProgressMonitor(), params, Collections.EMPTY_MAP);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void runM2Text_staticSecurty() {
		try {
			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", resourcesPath + umlModelName + ".b");
			params.put("UMLModel", resourcesPath + umlModelName + ".uml");
			params.put("TraceModel", resourcesPath + umlModelName + ".trace");
			params.put("ORBAC2Model", resourcesPath + umlModelName
					+ ".uml.ORBAC2");
			params.put("BModelPath", resourcesPath);

			WorkflowRunner frRun = new WorkflowRunner();
			frRun.prepare("RBAC2TextWorkflow.oaw", new NullProgressMonitor(),
					params);
			IssuesImpl issues = new IssuesImpl();
			frRun.executeWorkflow(new HashMap<String, String>(), issues);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void runM2Text_dynamicSecurity() {
		try {
			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", resourcesPath + umlModelName + ".b");
			params.put("UMLModel", resourcesPath + umlModelName + ".uml");
			params.put("TraceModel", resourcesPath + umlModelName + ".trace");
			params.put("ADsecModel", resourcesPath + umlModelName
					+ ".adsec.uml");
			params.put("BModelPath", resourcesPath);

			WorkflowRunner frRun = new WorkflowRunner();
			frRun.prepare("ADsec2TextWorkflow.oaw", new NullProgressMonitor(),
					params);
			IssuesImpl issues = new IssuesImpl();
			frRun.executeWorkflow(new HashMap<String, String>(), issues);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void runM2Text_filter() {
		try {
			HashMap<String, String> params = new HashMap<String, String>();
			params.put("BModel", resourcesPath + umlModelName + ".b");
			params.put("UMLModel", resourcesPath + umlModelName + ".uml");
			params.put("TraceModel", resourcesPath + umlModelName + ".trace");
			params.put("ADsecModel", resourcesPath + umlModelName
					+ ".adsec.uml");
			params.put("BModelPath", resourcesPath);

			WorkflowRunner frRun = new WorkflowRunner();
			frRun.prepare("ADsec2Text_filterWorkflow.oaw",
					new NullProgressMonitor(), params);
			IssuesImpl issues = new IssuesImpl();
			frRun.executeWorkflow(new HashMap<String, String>(), issues);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
