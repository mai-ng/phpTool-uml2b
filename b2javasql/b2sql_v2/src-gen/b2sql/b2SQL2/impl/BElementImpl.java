/**
 * generated by Xtext 2.10.0
 */
package b2sql.b2SQL2.impl;

import b2sql.b2SQL2.B2SQL2Package;
import b2sql.b2SQL2.BElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BElement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link b2sql.b2SQL2.impl.BElementImpl#getEname <em>Ename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BElementImpl extends MinimalEObjectImpl.Container implements BElement
{
  /**
   * The default value of the '{@link #getEname() <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected static final String ENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEname() <em>Ename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEname()
   * @generated
   * @ordered
   */
  protected String ename = ENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BElementImpl()
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
    return B2SQL2Package.Literals.BELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEname()
  {
    return ename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEname(String newEname)
  {
    String oldEname = ename;
    ename = newEname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, B2SQL2Package.BELEMENT__ENAME, oldEname, ename));
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
      case B2SQL2Package.BELEMENT__ENAME:
        return getEname();
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
      case B2SQL2Package.BELEMENT__ENAME:
        setEname((String)newValue);
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
      case B2SQL2Package.BELEMENT__ENAME:
        setEname(ENAME_EDEFAULT);
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
      case B2SQL2Package.BELEMENT__ENAME:
        return ENAME_EDEFAULT == null ? ename != null : !ENAME_EDEFAULT.equals(ename);
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
    result.append(" (ename: ");
    result.append(ename);
    result.append(')');
    return result.toString();
  }

} //BElementImpl