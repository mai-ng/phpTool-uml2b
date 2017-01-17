/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSQL Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java2.BSQLMachine#getM_name <em>Mname</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.BSQLMachine#getSeename <em>Seename</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.BSQLMachine#getVars <em>Vars</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.BSQLMachine#getInv <em>Inv</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.BSQLMachine#getInit <em>Init</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.BSQLMachine#getBops <em>Bops</em>}</li>
 * </ul>
 *
 * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine()
 * @model
 * @generated
 */
public interface BSQLMachine extends BSQL2Java2
{
  /**
   * Returns the value of the '<em><b>Mname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mname</em>' attribute.
   * @see #setM_name(String)
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine_M_name()
   * @model
   * @generated
   */
  String getM_name();

  /**
   * Sets the value of the '{@link bsql2java.bSQL2Java2.BSQLMachine#getM_name <em>Mname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mname</em>' attribute.
   * @see #getM_name()
   * @generated
   */
  void setM_name(String value);

  /**
   * Returns the value of the '<em><b>Seename</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seename</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seename</em>' attribute list.
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine_Seename()
   * @model unique="false"
   * @generated
   */
  EList<String> getSeename();

  /**
   * Returns the value of the '<em><b>Vars</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' attribute.
   * @see #setVars(String)
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine_Vars()
   * @model
   * @generated
   */
  String getVars();

  /**
   * Sets the value of the '{@link bsql2java.bSQL2Java2.BSQLMachine#getVars <em>Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' attribute.
   * @see #getVars()
   * @generated
   */
  void setVars(String value);

  /**
   * Returns the value of the '<em><b>Inv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inv</em>' containment reference.
   * @see #setInv(BTable)
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine_Inv()
   * @model containment="true"
   * @generated
   */
  BTable getInv();

  /**
   * Sets the value of the '{@link bsql2java.bSQL2Java2.BSQLMachine#getInv <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inv</em>' containment reference.
   * @see #getInv()
   * @generated
   */
  void setInv(BTable value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' attribute.
   * @see #setInit(String)
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine_Init()
   * @model
   * @generated
   */
  String getInit();

  /**
   * Sets the value of the '{@link bsql2java.bSQL2Java2.BSQLMachine#getInit <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' attribute.
   * @see #getInit()
   * @generated
   */
  void setInit(String value);

  /**
   * Returns the value of the '<em><b>Bops</b></em>' containment reference list.
   * The list contents are of type {@link bsql2java.bSQL2Java2.BOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bops</em>' containment reference list.
   * @see bsql2java.bSQL2Java2.BSQL2Java2Package#getBSQLMachine_Bops()
   * @model containment="true"
   * @generated
   */
  EList<BOperation> getBops();

} // BSQLMachine
