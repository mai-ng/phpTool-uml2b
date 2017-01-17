/**
 * generated by Xtext 2.10.0
 */
package b2sql.b2SQL2.impl;

import b2sql.b2SQL2.B2SQL2Package;
import b2sql.b2SQL2.BOperation;
import b2sql.b2SQL2.BSQLMachine;
import b2sql.b2SQL2.BTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSQL Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link b2sql.b2SQL2.impl.BSQLMachineImpl#getM_name <em>Mname</em>}</li>
 *   <li>{@link b2sql.b2SQL2.impl.BSQLMachineImpl#getSeename <em>Seename</em>}</li>
 *   <li>{@link b2sql.b2SQL2.impl.BSQLMachineImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link b2sql.b2SQL2.impl.BSQLMachineImpl#getInv <em>Inv</em>}</li>
 *   <li>{@link b2sql.b2SQL2.impl.BSQLMachineImpl#getInit <em>Init</em>}</li>
 *   <li>{@link b2sql.b2SQL2.impl.BSQLMachineImpl#getBops <em>Bops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSQLMachineImpl extends B2SQL2Impl implements BSQLMachine
{
  /**
   * The default value of the '{@link #getM_name() <em>Mname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM_name()
   * @generated
   * @ordered
   */
  protected static final String MNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getM_name() <em>Mname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM_name()
   * @generated
   * @ordered
   */
  protected String m_name = MNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSeename() <em>Seename</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeename()
   * @generated
   * @ordered
   */
  protected EList<String> seename;

  /**
   * The default value of the '{@link #getVars() <em>Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected static final String VARS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected String vars = VARS_EDEFAULT;

  /**
   * The cached value of the '{@link #getInv() <em>Inv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInv()
   * @generated
   * @ordered
   */
  protected BTable inv;

  /**
   * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected static final String INIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected String init = INIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBops() <em>Bops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBops()
   * @generated
   * @ordered
   */
  protected EList<BOperation> bops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSQLMachineImpl()
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
    return B2SQL2Package.Literals.BSQL_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getM_name()
  {
    return m_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM_name(String newM_name)
  {
    String oldM_name = m_name;
    m_name = newM_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, B2SQL2Package.BSQL_MACHINE__MNAME, oldM_name, m_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSeename()
  {
    if (seename == null)
    {
      seename = new EDataTypeEList<String>(String.class, this, B2SQL2Package.BSQL_MACHINE__SEENAME);
    }
    return seename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVars()
  {
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVars(String newVars)
  {
    String oldVars = vars;
    vars = newVars;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, B2SQL2Package.BSQL_MACHINE__VARS, oldVars, vars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BTable getInv()
  {
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInv(BTable newInv, NotificationChain msgs)
  {
    BTable oldInv = inv;
    inv = newInv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B2SQL2Package.BSQL_MACHINE__INV, oldInv, newInv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInv(BTable newInv)
  {
    if (newInv != inv)
    {
      NotificationChain msgs = null;
      if (inv != null)
        msgs = ((InternalEObject)inv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B2SQL2Package.BSQL_MACHINE__INV, null, msgs);
      if (newInv != null)
        msgs = ((InternalEObject)newInv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B2SQL2Package.BSQL_MACHINE__INV, null, msgs);
      msgs = basicSetInv(newInv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, B2SQL2Package.BSQL_MACHINE__INV, newInv, newInv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(String newInit)
  {
    String oldInit = init;
    init = newInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, B2SQL2Package.BSQL_MACHINE__INIT, oldInit, init));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BOperation> getBops()
  {
    if (bops == null)
    {
      bops = new EObjectContainmentEList<BOperation>(BOperation.class, this, B2SQL2Package.BSQL_MACHINE__BOPS);
    }
    return bops;
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
      case B2SQL2Package.BSQL_MACHINE__INV:
        return basicSetInv(null, msgs);
      case B2SQL2Package.BSQL_MACHINE__BOPS:
        return ((InternalEList<?>)getBops()).basicRemove(otherEnd, msgs);
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
      case B2SQL2Package.BSQL_MACHINE__MNAME:
        return getM_name();
      case B2SQL2Package.BSQL_MACHINE__SEENAME:
        return getSeename();
      case B2SQL2Package.BSQL_MACHINE__VARS:
        return getVars();
      case B2SQL2Package.BSQL_MACHINE__INV:
        return getInv();
      case B2SQL2Package.BSQL_MACHINE__INIT:
        return getInit();
      case B2SQL2Package.BSQL_MACHINE__BOPS:
        return getBops();
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
      case B2SQL2Package.BSQL_MACHINE__MNAME:
        setM_name((String)newValue);
        return;
      case B2SQL2Package.BSQL_MACHINE__SEENAME:
        getSeename().clear();
        getSeename().addAll((Collection<? extends String>)newValue);
        return;
      case B2SQL2Package.BSQL_MACHINE__VARS:
        setVars((String)newValue);
        return;
      case B2SQL2Package.BSQL_MACHINE__INV:
        setInv((BTable)newValue);
        return;
      case B2SQL2Package.BSQL_MACHINE__INIT:
        setInit((String)newValue);
        return;
      case B2SQL2Package.BSQL_MACHINE__BOPS:
        getBops().clear();
        getBops().addAll((Collection<? extends BOperation>)newValue);
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
      case B2SQL2Package.BSQL_MACHINE__MNAME:
        setM_name(MNAME_EDEFAULT);
        return;
      case B2SQL2Package.BSQL_MACHINE__SEENAME:
        getSeename().clear();
        return;
      case B2SQL2Package.BSQL_MACHINE__VARS:
        setVars(VARS_EDEFAULT);
        return;
      case B2SQL2Package.BSQL_MACHINE__INV:
        setInv((BTable)null);
        return;
      case B2SQL2Package.BSQL_MACHINE__INIT:
        setInit(INIT_EDEFAULT);
        return;
      case B2SQL2Package.BSQL_MACHINE__BOPS:
        getBops().clear();
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
      case B2SQL2Package.BSQL_MACHINE__MNAME:
        return MNAME_EDEFAULT == null ? m_name != null : !MNAME_EDEFAULT.equals(m_name);
      case B2SQL2Package.BSQL_MACHINE__SEENAME:
        return seename != null && !seename.isEmpty();
      case B2SQL2Package.BSQL_MACHINE__VARS:
        return VARS_EDEFAULT == null ? vars != null : !VARS_EDEFAULT.equals(vars);
      case B2SQL2Package.BSQL_MACHINE__INV:
        return inv != null;
      case B2SQL2Package.BSQL_MACHINE__INIT:
        return INIT_EDEFAULT == null ? init != null : !INIT_EDEFAULT.equals(init);
      case B2SQL2Package.BSQL_MACHINE__BOPS:
        return bops != null && !bops.isEmpty();
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
    result.append(" (m_name: ");
    result.append(m_name);
    result.append(", seename: ");
    result.append(seename);
    result.append(", vars: ");
    result.append(vars);
    result.append(", init: ");
    result.append(init);
    result.append(')');
    return result.toString();
  }

} //BSQLMachineImpl
