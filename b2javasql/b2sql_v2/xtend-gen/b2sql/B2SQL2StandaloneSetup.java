/**
 * generated by Xtext 2.10.0
 */
package b2sql;

import b2sql.B2SQL2StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class B2SQL2StandaloneSetup extends B2SQL2StandaloneSetupGenerated {
  public static void doSetup() {
    B2SQL2StandaloneSetup _b2SQL2StandaloneSetup = new B2SQL2StandaloneSetup();
    _b2SQL2StandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
