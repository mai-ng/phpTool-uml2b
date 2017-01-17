/**
 * generated by Xtext 2.10.0
 */
package b2sql.b2SQL2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link b2sql.b2SQL2.SQLCall#getSLeft <em>SLeft</em>}</li>
 *   <li>{@link b2sql.b2SQL2.SQLCall#getSRight <em>SRight</em>}</li>
 * </ul>
 *
 * @see b2sql.b2SQL2.B2SQL2Package#getSQLCall()
 * @model
 * @generated
 */
public interface SQLCall extends EObject
{
  /**
   * Returns the value of the '<em><b>SLeft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SLeft</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SLeft</em>' attribute.
   * @see #setSLeft(String)
   * @see b2sql.b2SQL2.B2SQL2Package#getSQLCall_SLeft()
   * @model
   * @generated
   */
  String getSLeft();

  /**
   * Sets the value of the '{@link b2sql.b2SQL2.SQLCall#getSLeft <em>SLeft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SLeft</em>' attribute.
   * @see #getSLeft()
   * @generated
   */
  void setSLeft(String value);

  /**
   * Returns the value of the '<em><b>SRight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SRight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SRight</em>' attribute.
   * @see #setSRight(String)
   * @see b2sql.b2SQL2.B2SQL2Package#getSQLCall_SRight()
   * @model
   * @generated
   */
  String getSRight();

  /**
   * Sets the value of the '{@link b2sql.b2SQL2.SQLCall#getSRight <em>SRight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SRight</em>' attribute.
   * @see #getSRight()
   * @generated
   */
  void setSRight(String value);

} // SQLCall
