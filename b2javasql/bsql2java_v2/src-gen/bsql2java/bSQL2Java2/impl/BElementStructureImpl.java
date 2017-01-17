/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java2.impl;

import bsql2java.bSQL2Java2.BElement;
import bsql2java.bSQL2Java2.BElementStructure;
import bsql2java.bSQL2Java2.BSQL2Java2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BElement Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java2.impl.BElementStructureImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BElementStructureImpl extends MinimalEObjectImpl.Container implements BElementStructure
{
  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<BElement> e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BElementStructureImpl()
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
    return BSQL2Java2Package.Literals.BELEMENT_STRUCTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BElement> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<BElement>(BElement.class, this, BSQL2Java2Package.BELEMENT_STRUCTURE__E);
    }
    return e;
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
      case BSQL2Java2Package.BELEMENT_STRUCTURE__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
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
      case BSQL2Java2Package.BELEMENT_STRUCTURE__E:
        return getE();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BSQL2Java2Package.BELEMENT_STRUCTURE__E:
        getE().clear();
        getE().addAll((Collection<? extends BElement>)newValue);
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
      case BSQL2Java2Package.BELEMENT_STRUCTURE__E:
        getE().clear();
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
      case BSQL2Java2Package.BELEMENT_STRUCTURE__E:
        return e != null && !e.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BElementStructureImpl
