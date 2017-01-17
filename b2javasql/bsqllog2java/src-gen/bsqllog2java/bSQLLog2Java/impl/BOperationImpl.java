/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java.impl;

import bsqllog2java.bSQLLog2Java.BOperation;
import bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage;
import bsqllog2java.bSQLLog2Java.BoolOperation;
import bsqllog2java.bSQLLog2Java.StringOperation;
import bsqllog2java.bSQLLog2Java.VoidOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BOperationImpl#getBops <em>Bops</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BOperationImpl#getVops <em>Vops</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BOperationImpl#getSops <em>Sops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOperationImpl extends MinimalEObjectImpl.Container implements BOperation
{
  /**
   * The cached value of the '{@link #getBops() <em>Bops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBops()
   * @generated
   * @ordered
   */
  protected BoolOperation bops;

  /**
   * The cached value of the '{@link #getVops() <em>Vops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVops()
   * @generated
   * @ordered
   */
  protected VoidOperation vops;

  /**
   * The cached value of the '{@link #getSops() <em>Sops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSops()
   * @generated
   * @ordered
   */
  protected StringOperation sops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BOperationImpl()
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
    return BSQLLog2JavaPackage.Literals.BOPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolOperation getBops()
  {
    return bops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBops(BoolOperation newBops, NotificationChain msgs)
  {
    BoolOperation oldBops = bops;
    bops = newBops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BOPERATION__BOPS, oldBops, newBops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBops(BoolOperation newBops)
  {
    if (newBops != bops)
    {
      NotificationChain msgs = null;
      if (bops != null)
        msgs = ((InternalEObject)bops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BOPERATION__BOPS, null, msgs);
      if (newBops != null)
        msgs = ((InternalEObject)newBops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BOPERATION__BOPS, null, msgs);
      msgs = basicSetBops(newBops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BOPERATION__BOPS, newBops, newBops));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidOperation getVops()
  {
    return vops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVops(VoidOperation newVops, NotificationChain msgs)
  {
    VoidOperation oldVops = vops;
    vops = newVops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BOPERATION__VOPS, oldVops, newVops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVops(VoidOperation newVops)
  {
    if (newVops != vops)
    {
      NotificationChain msgs = null;
      if (vops != null)
        msgs = ((InternalEObject)vops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BOPERATION__VOPS, null, msgs);
      if (newVops != null)
        msgs = ((InternalEObject)newVops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BOPERATION__VOPS, null, msgs);
      msgs = basicSetVops(newVops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BOPERATION__VOPS, newVops, newVops));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringOperation getSops()
  {
    return sops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSops(StringOperation newSops, NotificationChain msgs)
  {
    StringOperation oldSops = sops;
    sops = newSops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BOPERATION__SOPS, oldSops, newSops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSops(StringOperation newSops)
  {
    if (newSops != sops)
    {
      NotificationChain msgs = null;
      if (sops != null)
        msgs = ((InternalEObject)sops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BOPERATION__SOPS, null, msgs);
      if (newSops != null)
        msgs = ((InternalEObject)newSops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BOPERATION__SOPS, null, msgs);
      msgs = basicSetSops(newSops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BOPERATION__SOPS, newSops, newSops));
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
      case BSQLLog2JavaPackage.BOPERATION__BOPS:
        return basicSetBops(null, msgs);
      case BSQLLog2JavaPackage.BOPERATION__VOPS:
        return basicSetVops(null, msgs);
      case BSQLLog2JavaPackage.BOPERATION__SOPS:
        return basicSetSops(null, msgs);
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
      case BSQLLog2JavaPackage.BOPERATION__BOPS:
        return getBops();
      case BSQLLog2JavaPackage.BOPERATION__VOPS:
        return getVops();
      case BSQLLog2JavaPackage.BOPERATION__SOPS:
        return getSops();
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
      case BSQLLog2JavaPackage.BOPERATION__BOPS:
        setBops((BoolOperation)newValue);
        return;
      case BSQLLog2JavaPackage.BOPERATION__VOPS:
        setVops((VoidOperation)newValue);
        return;
      case BSQLLog2JavaPackage.BOPERATION__SOPS:
        setSops((StringOperation)newValue);
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
      case BSQLLog2JavaPackage.BOPERATION__BOPS:
        setBops((BoolOperation)null);
        return;
      case BSQLLog2JavaPackage.BOPERATION__VOPS:
        setVops((VoidOperation)null);
        return;
      case BSQLLog2JavaPackage.BOPERATION__SOPS:
        setSops((StringOperation)null);
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
      case BSQLLog2JavaPackage.BOPERATION__BOPS:
        return bops != null;
      case BSQLLog2JavaPackage.BOPERATION__VOPS:
        return vops != null;
      case BSQLLog2JavaPackage.BOPERATION__SOPS:
        return sops != null;
    }
    return super.eIsSet(featureID);
  }

} //BOperationImpl
