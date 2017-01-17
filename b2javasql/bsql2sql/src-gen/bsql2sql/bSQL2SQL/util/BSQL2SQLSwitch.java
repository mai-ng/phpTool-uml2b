/**
 * generated by Xtext 2.10.0
 */
package bsql2sql.bSQL2SQL.util;

import bsql2sql.bSQL2SQL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see bsql2sql.bSQL2SQL.BSQL2SQLPackage
 * @generated
 */
public class BSQL2SQLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BSQL2SQLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSQL2SQLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BSQL2SQLPackage.eINSTANCE;
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
      case BSQL2SQLPackage.BSQL2SQL:
      {
        BSQL2SQL bsql2SQL = (BSQL2SQL)theEObject;
        T result = caseBSQL2SQL(bsql2SQL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BSQL_MACHINE:
      {
        BSQLMachine bsqlMachine = (BSQLMachine)theEObject;
        T result = caseBSQLMachine(bsqlMachine);
        if (result == null) result = caseBSQL2SQL(bsqlMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BTABLE:
      {
        BTable bTable = (BTable)theEObject;
        T result = caseBTable(bTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BTYPE:
      {
        BType bType = (BType)theEObject;
        T result = caseBType(bType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BS_OPERATION:
      {
        BSOperation bsOperation = (BSOperation)theEObject;
        T result = caseBSOperation(bsOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BOOL_OPERATION:
      {
        BoolOperation boolOperation = (BoolOperation)theEObject;
        T result = caseBoolOperation(boolOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.VOID_OPERATION:
      {
        VoidOperation voidOperation = (VoidOperation)theEObject;
        T result = caseVoidOperation(voidOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BPREDICATE:
      {
        BPredicate bPredicate = (BPredicate)theEObject;
        T result = caseBPredicate(bPredicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.SQL_CALL:
      {
        SQLCall sqlCall = (SQLCall)theEObject;
        T result = caseSQLCall(sqlCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.TABLE_INSTANCE:
      {
        TableInstance tableInstance = (TableInstance)theEObject;
        T result = caseTableInstance(tableInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.TI_ASSIGNMENT:
      {
        TIAssignment tiAssignment = (TIAssignment)theEObject;
        T result = caseTIAssignment(tiAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BPARAMETER:
      {
        BParameter bParameter = (BParameter)theEObject;
        T result = caseBParameter(bParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BSQL2SQLPackage.BSUBSTITUTION:
      {
        BSubstitution bSubstitution = (BSubstitution)theEObject;
        T result = caseBSubstitution(bSubstitution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BSQL2SQL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BSQL2SQL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSQL2SQL(BSQL2SQL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BSQL Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BSQL Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSQLMachine(BSQLMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BTable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BTable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBTable(BTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BType</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBType(BType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSOperation(BSOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolOperation(BoolOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoidOperation(VoidOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BPredicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BPredicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBPredicate(BPredicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SQL Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SQL Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSQLCall(SQLCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableInstance(TableInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TI Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TI Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTIAssignment(TIAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BParameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BParameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBParameter(BParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BSubstitution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BSubstitution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSubstitution(BSubstitution object)
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

} //BSQL2SQLSwitch
