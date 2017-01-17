/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java.impl;

import bsqllog2java.bSQLLog2Java.BPredicate;
import bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage;
import bsqllog2java.bSQLLog2Java.BSubFalse;
import bsqllog2java.bSQLLog2Java.TableInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSub False</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BSubFalseImpl#getRes <em>Res</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BSubFalseImpl#getObjTable <em>Obj Table</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.BSubFalseImpl#getPres <em>Pres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSubFalseImpl extends MinimalEObjectImpl.Container implements BSubFalse
{
  /**
   * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected static final String RES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected String res = RES_EDEFAULT;

  /**
   * The cached value of the '{@link #getObjTable() <em>Obj Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjTable()
   * @generated
   * @ordered
   */
  protected TableInstance objTable;

  /**
   * The cached value of the '{@link #getPres() <em>Pres</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPres()
   * @generated
   * @ordered
   */
  protected EList<BPredicate> pres;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSubFalseImpl()
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
    return BSQLLog2JavaPackage.Literals.BSUB_FALSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRes()
  {
    return res;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRes(String newRes)
  {
    String oldRes = res;
    res = newRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BSUB_FALSE__RES, oldRes, res));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableInstance getObjTable()
  {
    return objTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjTable(TableInstance newObjTable, NotificationChain msgs)
  {
    TableInstance oldObjTable = objTable;
    objTable = newObjTable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE, oldObjTable, newObjTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjTable(TableInstance newObjTable)
  {
    if (newObjTable != objTable)
    {
      NotificationChain msgs = null;
      if (objTable != null)
        msgs = ((InternalEObject)objTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE, null, msgs);
      if (newObjTable != null)
        msgs = ((InternalEObject)newObjTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE, null, msgs);
      msgs = basicSetObjTable(newObjTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE, newObjTable, newObjTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BPredicate> getPres()
  {
    if (pres == null)
    {
      pres = new EObjectContainmentEList<BPredicate>(BPredicate.class, this, BSQLLog2JavaPackage.BSUB_FALSE__PRES);
    }
    return pres;
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
      case BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE:
        return basicSetObjTable(null, msgs);
      case BSQLLog2JavaPackage.BSUB_FALSE__PRES:
        return ((InternalEList<?>)getPres()).basicRemove(otherEnd, msgs);
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
      case BSQLLog2JavaPackage.BSUB_FALSE__RES:
        return getRes();
      case BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE:
        return getObjTable();
      case BSQLLog2JavaPackage.BSUB_FALSE__PRES:
        return getPres();
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
      case BSQLLog2JavaPackage.BSUB_FALSE__RES:
        setRes((String)newValue);
        return;
      case BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE:
        setObjTable((TableInstance)newValue);
        return;
      case BSQLLog2JavaPackage.BSUB_FALSE__PRES:
        getPres().clear();
        getPres().addAll((Collection<? extends BPredicate>)newValue);
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
      case BSQLLog2JavaPackage.BSUB_FALSE__RES:
        setRes(RES_EDEFAULT);
        return;
      case BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE:
        setObjTable((TableInstance)null);
        return;
      case BSQLLog2JavaPackage.BSUB_FALSE__PRES:
        getPres().clear();
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
      case BSQLLog2JavaPackage.BSUB_FALSE__RES:
        return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
      case BSQLLog2JavaPackage.BSUB_FALSE__OBJ_TABLE:
        return objTable != null;
      case BSQLLog2JavaPackage.BSUB_FALSE__PRES:
        return pres != null && !pres.isEmpty();
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
    result.append(" (res: ");
    result.append(res);
    result.append(')');
    return result.toString();
  }

} //BSubFalseImpl
