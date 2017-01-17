/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java2.impl;

import bsql2java.bSQL2Java2.BElementStructure;
import bsql2java.bSQL2Java2.BSQL2Java2Package;
import bsql2java.bSQL2Java2.BSet;
import bsql2java.bSQL2Java2.BUnion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUnion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BUnionImpl#getSet <em>Set</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BUnionImpl#getAddedSet <em>Added Set</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BUnionImpl#getAddedE <em>Added E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUnionImpl extends MinimalEObjectImpl.Container implements BUnion
{
  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected BSet set;

  /**
   * The cached value of the '{@link #getAddedSet() <em>Added Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedSet()
   * @generated
   * @ordered
   */
  protected BSet addedSet;

  /**
   * The cached value of the '{@link #getAddedE() <em>Added E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedE()
   * @generated
   * @ordered
   */
  protected BElementStructure addedE;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BUnionImpl()
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
    return BSQL2Java2Package.Literals.BUNION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSet getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(BSet newSet, NotificationChain msgs)
  {
    BSet oldSet = set;
    set = newSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BUNION__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(BSet newSet)
  {
    if (newSet != set)
    {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BUNION__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BUNION__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BUNION__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSet getAddedSet()
  {
    return addedSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddedSet(BSet newAddedSet, NotificationChain msgs)
  {
    BSet oldAddedSet = addedSet;
    addedSet = newAddedSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BUNION__ADDED_SET, oldAddedSet, newAddedSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddedSet(BSet newAddedSet)
  {
    if (newAddedSet != addedSet)
    {
      NotificationChain msgs = null;
      if (addedSet != null)
        msgs = ((InternalEObject)addedSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BUNION__ADDED_SET, null, msgs);
      if (newAddedSet != null)
        msgs = ((InternalEObject)newAddedSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BUNION__ADDED_SET, null, msgs);
      msgs = basicSetAddedSet(newAddedSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BUNION__ADDED_SET, newAddedSet, newAddedSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BElementStructure getAddedE()
  {
    return addedE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddedE(BElementStructure newAddedE, NotificationChain msgs)
  {
    BElementStructure oldAddedE = addedE;
    addedE = newAddedE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BUNION__ADDED_E, oldAddedE, newAddedE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddedE(BElementStructure newAddedE)
  {
    if (newAddedE != addedE)
    {
      NotificationChain msgs = null;
      if (addedE != null)
        msgs = ((InternalEObject)addedE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BUNION__ADDED_E, null, msgs);
      if (newAddedE != null)
        msgs = ((InternalEObject)newAddedE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQL2Java2Package.BUNION__ADDED_E, null, msgs);
      msgs = basicSetAddedE(newAddedE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQL2Java2Package.BUNION__ADDED_E, newAddedE, newAddedE));
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
      case BSQL2Java2Package.BUNION__SET:
        return basicSetSet(null, msgs);
      case BSQL2Java2Package.BUNION__ADDED_SET:
        return basicSetAddedSet(null, msgs);
      case BSQL2Java2Package.BUNION__ADDED_E:
        return basicSetAddedE(null, msgs);
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
      case BSQL2Java2Package.BUNION__SET:
        return getSet();
      case BSQL2Java2Package.BUNION__ADDED_SET:
        return getAddedSet();
      case BSQL2Java2Package.BUNION__ADDED_E:
        return getAddedE();
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
      case BSQL2Java2Package.BUNION__SET:
        setSet((BSet)newValue);
        return;
      case BSQL2Java2Package.BUNION__ADDED_SET:
        setAddedSet((BSet)newValue);
        return;
      case BSQL2Java2Package.BUNION__ADDED_E:
        setAddedE((BElementStructure)newValue);
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
      case BSQL2Java2Package.BUNION__SET:
        setSet((BSet)null);
        return;
      case BSQL2Java2Package.BUNION__ADDED_SET:
        setAddedSet((BSet)null);
        return;
      case BSQL2Java2Package.BUNION__ADDED_E:
        setAddedE((BElementStructure)null);
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
      case BSQL2Java2Package.BUNION__SET:
        return set != null;
      case BSQL2Java2Package.BUNION__ADDED_SET:
        return addedSet != null;
      case BSQL2Java2Package.BUNION__ADDED_E:
        return addedE != null;
    }
    return super.eIsSet(featureID);
  }

} //BUnionImpl
