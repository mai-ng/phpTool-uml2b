/*
 * generated by Xtext 2.10.0
 */
package bsql2sql.ui.tests;

import bsql2sql.ui.internal.Bsql2sqlActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class BSQL2SQLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Bsql2sqlActivator.getInstance().getInjector("bsql2sql.BSQL2SQL");
	}

}
