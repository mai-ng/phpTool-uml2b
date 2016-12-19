package fr.lig.vasco.selkis.ctm.example.uml2b;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.uml2.uml.Package;

import fr.lig.vasco.models.b.BSpec;
import fr.lig.vasco.selkis.ctm.InstanceProvider;
import fr.lig.vasco.selkis.ctm.context.TransformationContext;
import fr.lig.vasco.selkis.ctm.engine.TransformationEngineImpl;
import fr.lig.vasco.selkis.ctm.impl.InstanceTypeDefinition;
import fr.lig.vasco.selkis.ctm.impl.RegistryBasedInstanceProvider;
import fr.lig.vasco.selkis.ctm.impl.RegistryBasedUMLInstanceProvider;
import fr.lig.vasco.selkis.ctm.invoker.IRuleInvoker;
import fr.lig.vasco.selkis.ctm.invoker.impl.JavaExternalRuleInvoker;
import fr.lig.vasco.selkis.ctm.invoker.impl.RegistryBasedExternalRuleInvokerDelegator;
import fr.lig.vasco.selkis.ctm.invoker.impl.XtendExternalRuleInvoker;
import fr.lig.vasco.selkis.ctm.trace.TransformationTrace;
import fr.lig.vasco.selkis.ctm.transformationconfig.Config;

public class UML2B_transformation  {
//	private TransformationTrace trace = null; // Trace model
//	private Config config = null;// config model
//	private Package pkg = null;// uml model
//	private BSpec bSpec = null;// B model
//	private String extendFile = null;
	

	private TransformationContext context = null;
	
	private InstanceProvider instanceProvider;
	private IRuleInvoker invoker;
	
	
	public UML2B_transformation(TransformationTrace trace, Config config, Package pkg,
			BSpec bSpec, String extendFile) {
		super();
		init(trace,  config,  pkg, bSpec,  extendFile);
	}
	
	protected void init(TransformationTrace trace, Config config, Package pkg,
			BSpec bSpec, String extendFile) {
	
		
		
		//allow to create the trace content
		//TODO try to resolve the problem from the related GenModel  
		trace.getSrcElements();

		//TODO turn to a transformation operation
		bSpec.setName(pkg.getName());

		
		//instanceProvider = new UML2BInstanceProvider(isExploreSubPackages());			
		instanceProvider = RegistryBasedUMLInstanceProvider.getInstance();
		// add the root package as a special type refered dy "THIS"
		((RegistryBasedInstanceProvider) instanceProvider).put("THIS", new InstanceTypeDefinition(pkg));	
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add(extendFile);
				
		
	
		invoker=new RegistryBasedExternalRuleInvokerDelegator();
		
		context =new TransformationContext(trace,config,pkg,bSpec,instanceProvider,invoker);
		
		((RegistryBasedExternalRuleInvokerDelegator)invoker).put("JAVA",  new JavaExternalRuleInvoker(context,Collections.EMPTY_LIST));
		((RegistryBasedExternalRuleInvokerDelegator)invoker).put("XTEND",  new XtendExternalRuleInvoker(context,lst));
		
	}
	
	
	
	public void runConfig() throws Exception {
		TransformationEngineImpl engine = new TransformationEngineImpl(context);
		engine.executeTransformation();
	}

//	public String getExtendFile() {
//		return extendFile;
//	}
//
//	public void setExtendFile(String extendFile) {
//		this.extendFile = extendFile;
//	}

//	public boolean checkConfig() {
//		return ((trace != null) && (config != null) && (pkg != null)
//				&& (bSpec != null) && (extendFile != null)&& (invoker!= null)&& (instanceProvider!= null));
//	}


//	private boolean isExploreSubPackages() {
//		for (StaticConfigElement c : config.getStaticConfigBloc().getElements()) {
//			if ("SubPackages".toLowerCase().equals(c.getRef().toLowerCase()))
//				return c.isValue();
//		}
//		return false;
//	}



//	private Element getElementParent(Element e) {
//
//		return UMLNavigationHelper.getElementDirectDependency(e);
//	}

	// private EList<Element> getElementDirectParents(Element e){
	// //if (e==pkg)return null;
	// EList<Element> lst=null;
	// if (e instanceof Class){
	// if(((Class)e).getSuperClasses().size()>0){
	// lst = new BasicEList<Element>();
	// lst.addAll(((Class)e).getSuperClasses());
	// }
	//
	// }else if (e instanceof Association){
	// lst = new BasicEList<Element>();
	// for(Property p:((Association)e).getOwnedEnds() ){
	// lst.add(p.getType());
	// }
	//
	//
	//
	// }
	// else if(e.getOwner()!=null){
	// lst = new BasicEList<Element>();
	// lst.add(e.getOwner());
	// }
	// return lst;
	// }

//	private Object runRule(String ruleRef, EObject src) {
//		Object o=null;		
//		o = invoker.Invoke(new ExternalRule(ruleRef), src);
//
//		try {
//			if (o == null) {
//				TransformationTraceHelper.addMap(trace, EcoreUtil.getURI(src)
//						.toString(), ruleRef,// o.toString());
//						null);
//			} else if (o instanceof EList) {
//				// //Multiple destination elements not yet implemented in
//				// traceMM
//				// TransformationTraceHelper.addMap(trace,
//				// EcoreUtil.getURI(src).toString(),
//				// ruleRef,
//				// (EList)o);
//			} else if (o instanceof EObject) {
//
//				TransformationTraceHelper.addMap(trace, EcoreUtil.getURI(src)
//						.toString(), ruleRef,// o.toString());
//						EcoreUtil.getURI((EObject) o).toString());
//			}
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//
//		return o;
//
//	}
//	
//	
//
//	private String getRef(EObject o) {
//		return EMFHelper.getURI(o).toString();
//	}
//
//	private boolean execRule(SubRule rule, Element i) {
//		/**
//		 * check dep apply
//		 */
//		if (config.getLevel() == ExecutionLevel.M1)
//			if (!checkM1Dependencies(rule, i)) {
//				System.out
//						.println("DEBUG execSubRule : Dependencies check M1 failed for Element '"
//								+ EMFHelper.GetForcedQualifiedName(i)
//								+ "' on rule '" + rule.getRef() + "' .");
//				return false;
//			}
//		if ((config.getLevel() == ExecutionLevel.M2)
//				&& (!rule.checkDependencies())) {
//			System.out
//					.println("DEBUG execSubRule : Dependencies M2 check failed for Element '"
//							+ EMFHelper.GetForcedQualifiedName(i)
//							+ "' on rule '" + rule.getRef() + "' .");
//			return false;
//
//			// if (!rule.checkDependencies())
//			// try {
//			// throw new
//			// Exception("unsatisfied Dependencies on SubRule \""+rule.getRef()+" \" ");
//			// } catch (Exception e) {
//			// e.printStackTrace();
//			// }
//		} else
//
//			// call rule
//			return runRule(rule.getRef(), i) != null;
//
//		// return false;
//
//	}
//
//	private boolean checkM1Dependencies(Rule srcRule, Element i) {
//		System.out.println("INFO checkM1Dependencies start for rule :"+srcRule.getRef()+" on element "+EMFHelper.GetName(i));
//		
//		boolean res, result = true;
//		
//		
//		if (getElementParent(i) == null){
//			System.out.println("INFO checkM1Dependencies : no parent ");
//			return true;
//		}
//		com.lig.vasco.models.trace.SrcModelElement src = trace
//				.resolve(getRef(getElementParent(i)));
//		if (src == null) {
//			System.out.println("INFO checkM1Dependencies : enable to resolve '"
//					+ EMFHelper.GetForcedQualifiedName(getElementParent(i))
//					+ "'  required by '" + EMFHelper.GetForcedQualifiedName(i)
//					+ "' ");
//			return false;
//		}
//
//		for (Dependency d : srcRule.getDependencies()) {// and dependencies
//			res = false;
//	
//			if (d instanceof RuleDependency) {
//				res = false;
//
//				search: for (Rule r : ((RuleDependency) d).getOrRules()) {
//					
//					 res=false;
//					if (r instanceof SubRule) {
//						System.out.println("INFO \t Dep Rule :"+r.getRef());
//						// for (Mapping m:src.getMapping())
//						// if((r.getRef().equals(m.getRule().getRef()))){
//						// res=true;
//						// break search;
//						// }
//
//						String typeName = ((SubRule) r).getParentRule()
//								.getSrc().getRef();
//						if (((RegistryBasedInstanceProvider)instanceProvider).getTypeDef(typeName).isInstance(getElementParent(i))) {
//							// the direct parent is the constrained element
//							for (Mapping m : src.getMapping())
//								if ((r.getRef().equals(m.getRule().getRef()))) {
//									System.out
//									.println("CheckM1Dep : rule found");
//							System.out.println("\t Element :"
//									+ i);
//							System.out.println("\t Rule :"
//									+ r.getRef());
//							System.out.println("\t Parent :"
//									+ getElementParent(i));
//									res = true;
//									break search;
//								}
//							break search;
//
//						} else {// Search in parents hierarchy to find the
//								// constrained Element
//							AbstractTreeIterator<Element> it = UMLNavigationHelper
//									.getElementDependenciesHierarchy(i);
//							Element e;
//							while (it.hasNext()) {
//								e = it.next();
//								if (((RegistryBasedInstanceProvider)instanceProvider).getTypeDef(typeName).isInstance(e)) {
//									src = trace.resolve(getRef(e));
//									for (Mapping m : src.getMapping())
//										if ((r.getRef().equals(m.getRule()
//												.getRef()))) {
//											System.out
//													.println("CheckM1Dep : rule found");
//											System.out.println("\t Element :"
//													+ i);
//											System.out.println("\t Rule :"
//													+ r.getRef());
//											System.out.println("\t Parent :"
//													+ e);
//											res = true;
//											break search;
//										}
//									break;
//								}
//							}
//						}
//
//					} else if (r instanceof SrcElementRule) {// srcRule
//						// search for applied sub rule
//						for (SubRule sr : ((SrcElementRule) r).getRules()) {
//							for (Mapping m : src.getMapping())
//								if ((sr.getRef().equals(m.getRule().getRef()))) {
//									System.out
//									.println("CheckM1Dep : rule found");
//							System.out.println("\t Element :"
//									+ i);
//							System.out.println("\t Rule :"
//									+ r.getRef());
//							System.out.println("\t Parent :"
//									+ m.getSrc().getRef());
//									res = true;
//									break search;
//								}
//						}
//					}
//				}
//
//			} else if (d instanceof StaticConfigDependency) {
//				if (getStaticConfigValue(((StaticConfigDependency) d)
//						.getStaticConfigElement(), i) == ((StaticConfigDependency) d)
//						.isValue()) {
//					res = true;
//				}
//			}
//
//			result = result && res;
//		}
//		return result;
//	}
//
//	private boolean getStaticConfigValue(StaticConfigElement sce, Element e) {
//		Stereotype s = e
//				.getAppliedStereotype("UML2B_Profile::UML2B_StaticConfigElement");
//		if ((s != null) && (sce.getRef().equals(e.getValue(s, "name")))) {
//			return ((Boolean) e.getValue(s, "value")).booleanValue();
//		} else {
//			EAnnotation annot = e.getEAnnotation("uml2b");
//			if (annot != null)
//				return "true".equals(annot.getDetails().get(sce.getRef()));
//
//		}
//
//		return sce.isValue();
//	}
//	
//	
//
//	private boolean execRule(SrcElementRule rule ,Element i) throws Exception{
//		SrcModelElement src = trace.resolve(getRef(i));
//
//		if (src !=null){
//			for (Mapping m :src.getMapping()){
//				for (SubRule r: rule.getRules()){
//					if(m.getRule().getRef().equals(r.getRef())){
//						//transformed by a sub rule
//						System.out.println("element '"+getRef(i)+"' already transformed by SrcElementRule  "+rule.getRef());
//						return false;
//					}
//				}
//
//			}
//
//		}
//		//not yet transformed
//
//		if(config.getLevel()==ExecutionLevel.M2){			
//
//			if (config.getChoiceBased()==ChoiceBase.ADVISED_RULE){
//				if (rule.getAdvisedRule()==null) throw new Exception("no advised rule specified on \""+rule.getRef()+" SrcElementRule ! \"");
//				else{					
//					execRule(rule.getAdvisedRule() ,i);					
//				}
//			}else{//Method based choice
//				if (config.getDefaultMethod()==null) throw new Exception("no default method specified on Config ! ");
//				boolean found = false;
//				for(SubRule r : rule.getRules()){
//					if (r.getComplyWith().contains(config.getDefaultMethod())){
//						//if (execRule(r,i)){
//						execRule(r,i);	
//						found=true;
//						break;
//						//}
//					}
//				}
//				if(!found){
//					System.out.println("INFO : no sub rule found in '"+rule.getRef()+"' complying with '"
//							+config.getDefaultMethod().getRef()+"'");
//					//					apply advisedrule or the first which dependencies are checked
//
//					if (rule.getAdvisedRule()==null) 
//						throw new Exception("	no advised rule specified on \""+rule.getRef()+" SrcElementRule ! \"");
//					else{					
//						execRule(rule.getAdvisedRule() ,i);	
//						found=true;
//					}
//					//						if (execRule(rule.getAdvisedRule(),i)){
//					//							found=true;
//					//						}else{
//					//							for(SubRule r : rule.getRules()){
//					//								if (execRule(r,i)){								
//					//									found=true;
//					//									break;
//					//								}											
//					//							}
//					//						}
//					if(!found){
//						throw new Exception("Enable to find rule for "+rule.getRef()+"("+
//								getRef(i)+")");
//					}
//
//				}
//
//			}
//		}
//		else{//M1 stereotype based rules
//
//			if (!checkM1Dependencies(rule,i)){
//				System.out.println("DEBUG execSrcRule: Dependencies check failed for Element '"+EMFHelper.GetForcedQualifiedName(i)
//						+"' on rule '"+rule.getRef()+"' .");
//				return false;
//			}
//
//			boolean found=false;
//			Stereotype st=i.getAppliedStereotype("UML2B_Profile::UML2B_Rule");
//			if(st!=null){
//
//				String ruleName=i.getValue(st, "rule").toString();
//				//	System.out.println("Stereotype :"+ruleName);
//
//				if((ruleName==null)||("".equals(ruleName))){
//					throw new Exception("unsetted ruleName on "+EMFHelper.GetForcedQualifiedName(i)+"UML2B_Rule stereotype!");
//				}
//
//
//
//
//
//				if ("none".equals(ruleName.toLowerCase()))
//					found=true;//no rule ll be executed
//				else
//				{ if("default".equals(ruleName.toLowerCase()))
//					found=false; //default disable stereotype
//				else
//					for (SubRule r:rule.getRules()){
//						if(r.getRef().equals(ruleName)){
//							execRule(r, i);
//							found=true;
//							break;
//						}
//					}
//				}
//
//
//			}
//
//
//			if (!found){//no stereotype found
//				if (i.getEAnnotation("uml2b")!=null){
//					//						System.out.println("Fetch Annotation");
//					EMap<String, String> a = i.getEAnnotation("uml2b").getDetails();
//					String s;
//					for (SubRule r:rule.getRules()){
//						s=a.get(r.getRef());
//						if(s!=null){
//							execRule(r, i);
//							found=true;
//							break ;
//						}
//					}
//				}
//			}
//				if (!found){//no stereotype or Annotation found
//
//					//						if (config.getChoiceBased()==ChoiceBase.ADVISED_RULE){
//					//							if (rule.getAdvisedRule()==null) 
//					//							{}//throw new Exception("no advised rule specified on \""+rule.getRef()+" SrcElementRule ! \"");
//					//							else{					
//					//								execRule(rule.getAdvisedRule() ,i);					
//					//							}
//					//						}
//					//						
//
//					if (config.getChoiceBased()==ChoiceBase.ADVISED_RULE){
//						if (rule.getAdvisedRule()==null) throw new Exception("no advised rule specified on \""+rule.getRef()+" SrcElementRule ! \"");
//						else{					
//							return execRule(rule.getAdvisedRule() ,i);					
//						}
//					}else{//Method based choice
//						if (config.getDefaultMethod()==null) throw new Exception("no default method specified on Config ! ");
//
//						for(SubRule r : rule.getRules()){
//							if (r.getComplyWith().contains(config.getDefaultMethod())){
//								//if (execRule(r,i)){
//								return execRule(r,i);
//								//}
//							}
//						}
//
//
//					}
//
//					throw new Exception("no rule found for "+rule.getRef()+" : '"+i+"' ");
//				}
//
//			}
//
//
//
//
//
//
//		
//			return true;
//		}
//	
//	
//	
//	
//	
//	private void execRule(SrcElementRule rule) throws Exception {
//		if (rule == null)
//			throw new Exception("null rule passed to execSrcElementRule");
//		if (rule.isActive()) {// the rule is enabled
//			/**
//			 * check common dependencies run rule on element
//			 * 
//			 */
//
//			if (!rule.checkDependencies()) {
//				// throw new
//				// Exception("unsatisfied Dependencies on SrcElementRule \""+rule.getRef()+" \" ");
//			} else
//				// applyRules for each model element
//				for (EObject i : instanceProvider.getAllInstance(pkg,rule.getSrc().getRef())) {
//					execRule(rule, (Element)i);
//
//				}
//
//		}
//
//	}

//	public void runConfig() throws Exception {
//		TransformationEngineImpl engine = new TransformationEngineImpl(context);
//		engine.executeTransformation();
//		
//		{		
//		
////		if (!checkConfig())
////			throw new Exception("error in config context!! :"+ pkg+"\n"+config+"\n"+bSpec+"\n"+trace+"\n"+extendFile);
////		
//// init external rule invokers
//		
//		//Xtend
//		
//			
//		
//		
//		// UMLValidator umlVal= new UMLValidator();
//		// IValidator
//		// validator=ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
//		//		
//		// System.out.println("Validation result :"+ validator.validate(pkg) );
//		//	
//		// DiagnosticChain diagnostics = null;
//		// System.out.println("UML Validation result :"+umlVal.validatePackage(pkg,
//		// diagnostics, null));
//		// Object res=null;
//
//
//	
//		
//		
////		System.out.println("START");
////		for (SrcElementRule e : config.getRules()) {
////			execRule(e);
////		}
////
////		System.out.println("END");
//		
//		// for(SrcModelElement e: config.getSrcModelElements()){
//		// execRule(e.getRule());
//		// }
//		}
//
//	}

//	public TransformationTrace getTrace() {
//		return trace;
//	}
//
//	public void setTrace(TransformationTrace trace) {
//		this.trace = trace;
//	}
//
//	public Config getConfig() {
//		return config;
//	}
//
//	public void setConfig(Config config) {
//		this.config = config;
//	}
//
//	public Package getPkg() {
//		return pkg;
//	}
//
//	public void setPkg(Package pkg) {
//		this.pkg = pkg;
//	}
//
//	public BSpec getBSpec() {
//		return bSpec;
//	}
//
//	public void setBSpec(BSpec spec) {
//		bSpec = spec;
//	}
//
//	public EObject getCtmRoot() {
//		return config;
//	}
//
//	public EObject getInputRoot() {
//		return pkg;
//	}
//
//	public EObject getOutputRoot() {
//		return bSpec;
//	}
//
//	public EObject getTraceRoot() {
//		return trace;
//	}

}
