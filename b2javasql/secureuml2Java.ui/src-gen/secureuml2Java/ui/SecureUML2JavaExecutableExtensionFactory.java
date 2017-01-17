/*
 * generated by Xtext 2.10.0
 */
package secureuml2Java.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import secureuml2Java.ui.internal.Secureuml2JavaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SecureUML2JavaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Secureuml2JavaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Secureuml2JavaActivator.getInstance().getInjector(Secureuml2JavaActivator.SECUREUML2JAVA_SECUREUML2JAVA);
	}
	
}
