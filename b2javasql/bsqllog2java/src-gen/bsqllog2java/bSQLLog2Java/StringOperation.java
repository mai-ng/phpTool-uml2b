/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.StringOperation#getRes <em>Res</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.StringOperation#getOp_name <em>Op name</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.StringOperation#getPList <em>PList</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.StringOperation#getPTyping <em>PTyping</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.StringOperation#getAnyblock <em>Anyblock</em>}</li>
 * </ul>
 *
 * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getStringOperation()
 * @model
 * @generated
 */
public interface StringOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Res</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Res</em>' attribute.
   * @see #setRes(String)
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getStringOperation_Res()
   * @model
   * @generated
   */
  String getRes();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.StringOperation#getRes <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Res</em>' attribute.
   * @see #getRes()
   * @generated
   */
  void setRes(String value);

  /**
   * Returns the value of the '<em><b>Op name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op name</em>' attribute.
   * @see #setOp_name(String)
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getStringOperation_Op_name()
   * @model
   * @generated
   */
  String getOp_name();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.StringOperation#getOp_name <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op name</em>' attribute.
   * @see #getOp_name()
   * @generated
   */
  void setOp_name(String value);

  /**
   * Returns the value of the '<em><b>PList</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PList</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PList</em>' attribute list.
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getStringOperation_PList()
   * @model unique="false"
   * @generated
   */
  EList<String> getPList();

  /**
   * Returns the value of the '<em><b>PTyping</b></em>' containment reference list.
   * The list contents are of type {@link bsqllog2java.bSQLLog2Java.BParameterTyping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PTyping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PTyping</em>' containment reference list.
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getStringOperation_PTyping()
   * @model containment="true"
   * @generated
   */
  EList<BParameterTyping> getPTyping();

  /**
   * Returns the value of the '<em><b>Anyblock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anyblock</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anyblock</em>' containment reference.
   * @see #setAnyblock(BAnyBlock)
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getStringOperation_Anyblock()
   * @model containment="true"
   * @generated
   */
  BAnyBlock getAnyblock();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.StringOperation#getAnyblock <em>Anyblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anyblock</em>' containment reference.
   * @see #getAnyblock()
   * @generated
   */
  void setAnyblock(BAnyBlock value);

} // StringOperation
