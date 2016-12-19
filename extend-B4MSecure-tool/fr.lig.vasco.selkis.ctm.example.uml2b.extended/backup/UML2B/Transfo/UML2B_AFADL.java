package UML2B.Transfo;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Package;

import fr.lig.vasco.models.b.BFactory;
import fr.lig.vasco.models.b.BMachine;
import fr.lig.vasco.models.b.BSpec;
import fr.lig.vasco.selkis.ctm.ITransformationContext;
//org.eclipse.uml2.uml.Package
	/**
	 * @param ctx Transformation context : contain the source, the target, the trace, and the configuration models
	 * @param o the input object must be a sub type of EObject ("Package" or "Model" for this rule  )
	 * @return the B system machine 
	 */
public class UML2B_AFADL {
	static public EObject createSysMachine(ITransformationContext ctx,EObject o){
		if (o instanceof Package ){//input element must be a package (or a sub-type i.e Model )			
		Package p = (Package)o;
		BMachine m=BFactory.eINSTANCE.createBMachine();//create a new B Machine using the factory
		m.setName(p.getName());//assign the name of the model to the machine 
		m.setSpec((BSpec)ctx.getOutputRoot());//add the machine to the collection of the B specification's machines    
		m.getSpec().setSystemMachine(m);// identify the machine as the system machine
		return m;
		} else{return null;}		
	}
}
