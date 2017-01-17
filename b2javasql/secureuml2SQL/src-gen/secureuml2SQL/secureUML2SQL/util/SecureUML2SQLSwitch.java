/**
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.secureUML2SQL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import secureuml2SQL.secureUML2SQL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see secureuml2SQL.secureUML2SQL.SecureUML2SQLPackage
 * @generated
 */
public class SecureUML2SQLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SecureUML2SQLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecureUML2SQLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SecureUML2SQLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SecureUML2SQLPackage.SECURE_UML2SQL:
      {
        SecureUML2SQL secureUML2SQL = (SecureUML2SQL)theEObject;
        T result = caseSecureUML2SQL(secureUML2SQL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BMACHINE:
      {
        BMachine bMachine = (BMachine)theEObject;
        T result = caseBMachine(bMachine);
        if (result == null) result = caseSecureUML2SQL(bMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BPROPERTIES:
      {
        BProperties bProperties = (BProperties)theEObject;
        T result = caseBProperties(bProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BTUPLE:
      {
        BTuple bTuple = (BTuple)theEObject;
        T result = caseBTuple(bTuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BSET:
      {
        BSet bSet = (BSet)theEObject;
        T result = caseBSet(bSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BE_SET:
      {
        BESet beSet = (BESet)theEObject;
        T result = caseBESet(beSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BSET_VALUE:
      {
        BSetValue bSetValue = (BSetValue)theEObject;
        T result = caseBSetValue(bSetValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecureUML2SQLPackage.BCONSTANT:
      {
        BConstant bConstant = (BConstant)theEObject;
        T result = caseBConstant(bConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Secure UML2SQL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Secure UML2SQL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecureUML2SQL(SecureUML2SQL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BMachine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BMachine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBMachine(BMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BProperties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BProperties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBProperties(BProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BTuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BTuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBTuple(BTuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BSet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BSet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSet(BSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BE Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BE Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBESet(BESet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BSet Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BSet Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSetValue(BSetValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BConstant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BConstant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBConstant(BConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SecureUML2SQLSwitch
