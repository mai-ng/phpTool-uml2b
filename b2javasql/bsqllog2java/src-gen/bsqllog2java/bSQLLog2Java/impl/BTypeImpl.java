/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java.impl;

import bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage;
import bsqllog2java.bSQLLog2Java.BType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BTypeImpl#getType_name <em>Type name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BTypeImpl extends MinimalEObjectImpl.Container implements BType
{
  /**
   * The default value of the '{@link #getType_name() <em>Type name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_name()
   * @generated
   * @ordered
   */
  protected static final String TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType_name() <em>Type name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_name()
   * @generated
   * @ordered
   */
  protected String type_name = TYPE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BSQLLog2JavaPackage.Literals.BTYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType_name()
  {
    return type_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_name(String newType_name)
  {
    String oldType_name = type_name;
    type_name = newType_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BTYPE__TYPE_NAME, oldType_name, type_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BSQLLog2JavaPackage.BTYPE__TYPE_NAME:
        return getType_name();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BSQLLog2JavaPackage.BTYPE__TYPE_NAME:
        setType_name((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BSQLLog2JavaPackage.BTYPE__TYPE_NAME:
        setType_name(TYPE_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BSQLLog2JavaPackage.BTYPE__TYPE_NAME:
        return TYPE_NAME_EDEFAULT == null ? type_name != null : !TYPE_NAME_EDEFAULT.equals(type_name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type_name: ");
    result.append(type_name);
    result.append(')');
    return result.toString();
  }

} //BTypeImpl
