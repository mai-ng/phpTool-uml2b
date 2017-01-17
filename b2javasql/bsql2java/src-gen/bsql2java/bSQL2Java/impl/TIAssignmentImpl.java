/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java.impl;

import bsql2java.bSQL2Java.BSQL2JavaPackage;
import bsql2java.bSQL2Java.TIAssignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TI Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java.impl.TIAssignmentImpl#getInstance_name <em>Instance name</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java.impl.TIAssignmentImpl#getInstance_type <em>Instance type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TIAssignmentImpl extends MinimalEObjectImpl.Container implements TIAssignment
{
  /**
   * The default value of the '{@link #getInstance_name() <em>Instance name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance_name()
   * @generated
   * @ordered
   */
  protected static final String INSTANCE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstance_name() <em>Instance name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance_name()
   * @generated
   * @ordered
   */
  protected String instance_name = INSTANCE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInstance_type() <em>Instance type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance_type()
   * @generated
   * @ordered
   */
  protected static final String INSTANCE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstance_type() <em>Instance type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance_type()
   * @generated
   * @ordered
   */
  protected String instance_type = INSTANCE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TIAssignmentImpl()
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
    return BSQL2JavaPackage.Literals.TI_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstance_name()
  {
    return instance_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance_name(String newInstance_name)
  {
    String oldInstance_name = instance_name;
    instance_name = newInstance_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_NAME, oldInstance_name, instance_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstance_type()
  {
    return instance_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance_type(String newInstance_type)
  {
    String oldInstance_type = instance_type;
    instance_type = newInstance_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_TYPE, oldInstance_type, instance_type));
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
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_NAME:
        return getInstance_name();
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_TYPE:
        return getInstance_type();
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
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_NAME:
        setInstance_name((String)newValue);
        return;
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_TYPE:
        setInstance_type((String)newValue);
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
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_NAME:
        setInstance_name(INSTANCE_NAME_EDEFAULT);
        return;
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_TYPE:
        setInstance_type(INSTANCE_TYPE_EDEFAULT);
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
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_NAME:
        return INSTANCE_NAME_EDEFAULT == null ? instance_name != null : !INSTANCE_NAME_EDEFAULT.equals(instance_name);
      case BSQL2JavaPackage.TI_ASSIGNMENT__INSTANCE_TYPE:
        return INSTANCE_TYPE_EDEFAULT == null ? instance_type != null : !INSTANCE_TYPE_EDEFAULT.equals(instance_type);
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
    result.append(" (instance_name: ");
    result.append(instance_name);
    result.append(", instance_type: ");
    result.append(instance_type);
    result.append(')');
    return result.toString();
  }

} //TIAssignmentImpl
