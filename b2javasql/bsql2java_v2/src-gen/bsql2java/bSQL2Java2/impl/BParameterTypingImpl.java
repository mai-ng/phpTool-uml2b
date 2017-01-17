/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java2.impl;

import bsql2java.bSQL2Java2.BParameterTyping;
import bsql2java.bSQL2Java2.BSQL2Java2Package;
import bsql2java.bSQL2Java2.BType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BParameter Typing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BParameterTypingImpl#getP_name <em>Pname</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BParameterTypingImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BParameterTypingImpl extends MinimalEObjectImpl.Container implements BParameterTyping
{
  /**
   * The default value of the '{@link #getP_name() <em>Pname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP_name()
   * @generated
   * @ordered
   */
  protected static final String PNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getP_name() <em>Pname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP_name()
   * @generated
   * @ordered
   */
  protected String p_name = PNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BParameterTypingImpl()
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
    return BSQL2Java2Package.Literals.BPARAMETER_TYPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getP_name()
  {
    return p_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP_name(String newP_name)
  {
    String oldP_name = p_name;
    p_name = newP_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BPARAMETER_TYPING__PNAME, oldP_name, p_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(BType newType, NotificationChain msgs)
  {
    BType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BPARAMETER_TYPING__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BPARAMETER_TYPING__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BPARAMETER_TYPING__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BPARAMETER_TYPING__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BSQL2Java2Package.BPARAMETER_TYPING__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BSQL2Java2Package.BPARAMETER_TYPING__PNAME:
        return getP_name();
      case BSQL2Java2Package.BPARAMETER_TYPING__TYPE:
        return getType();
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
      case BSQL2Java2Package.BPARAMETER_TYPING__PNAME:
        setP_name((String)newValue);
        return;
      case BSQL2Java2Package.BPARAMETER_TYPING__TYPE:
        setType((BType)newValue);
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
      case BSQL2Java2Package.BPARAMETER_TYPING__PNAME:
        setP_name(PNAME_EDEFAULT);
        return;
      case BSQL2Java2Package.BPARAMETER_TYPING__TYPE:
        setType((BType)null);
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
      case BSQL2Java2Package.BPARAMETER_TYPING__PNAME:
        return PNAME_EDEFAULT == null ? p_name != null : !PNAME_EDEFAULT.equals(p_name);
      case BSQL2Java2Package.BPARAMETER_TYPING__TYPE:
        return type != null;
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
    result.append(" (p_name: ");
    result.append(p_name);
    result.append(')');
    return result.toString();
  }

} //BParameterTypingImpl
