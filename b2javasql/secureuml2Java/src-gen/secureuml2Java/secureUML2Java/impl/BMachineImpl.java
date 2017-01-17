/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.secureUML2Java.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import secureuml2Java.secureUML2Java.BInit;
import secureuml2Java.secureUML2Java.BInvariant;
import secureuml2Java.secureUML2Java.BMachine;
import secureuml2Java.secureUML2Java.BSees;
import secureuml2Java.secureUML2Java.BVariable;
import secureuml2Java.secureUML2Java.SecureUML2JavaPackage;
import secureuml2Java.secureUML2Java.StringOperation;
import secureuml2Java.secureUML2Java.VoidOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BMachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getM_name <em>Mname</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getSees <em>Sees</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getInvs <em>Invs</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getInits <em>Inits</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getVops <em>Vops</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BMachineImpl#getSops <em>Sops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BMachineImpl extends SecureUML2JavaImpl implements BMachine
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
   * The cached value of the '{@link #getSees() <em>Sees</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSees()
   * @generated
   * @ordered
   */
  protected EList<BSees> sees;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<BVariable> vars;

  /**
   * The cached value of the '{@link #getInvs() <em>Invs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvs()
   * @generated
   * @ordered
   */
  protected EList<BInvariant> invs;

  /**
   * The cached value of the '{@link #getInits() <em>Inits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInits()
   * @generated
   * @ordered
   */
  protected EList<BInit> inits;

  /**
   * The cached value of the '{@link #getVops() <em>Vops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVops()
   * @generated
   * @ordered
   */
  protected EList<VoidOperation> vops;

  /**
   * The cached value of the '{@link #getSops() <em>Sops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSops()
   * @generated
   * @ordered
   */
  protected EList<StringOperation> sops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BMachineImpl()
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
    return SecureUML2JavaPackage.Literals.BMACHINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BMACHINE__MNAME, oldM_name, m_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BSees> getSees()
  {
    if (sees == null)
    {
      sees = new EObjectContainmentEList<BSees>(BSees.class, this, SecureUML2JavaPackage.BMACHINE__SEES);
    }
    return sees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BVariable> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<BVariable>(BVariable.class, this, SecureUML2JavaPackage.BMACHINE__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BInvariant> getInvs()
  {
    if (invs == null)
    {
      invs = new EObjectContainmentEList<BInvariant>(BInvariant.class, this, SecureUML2JavaPackage.BMACHINE__INVS);
    }
    return invs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BInit> getInits()
  {
    if (inits == null)
    {
      inits = new EObjectContainmentEList<BInit>(BInit.class, this, SecureUML2JavaPackage.BMACHINE__INITS);
    }
    return inits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VoidOperation> getVops()
  {
    if (vops == null)
    {
      vops = new EObjectContainmentEList<VoidOperation>(VoidOperation.class, this, SecureUML2JavaPackage.BMACHINE__VOPS);
    }
    return vops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StringOperation> getSops()
  {
    if (sops == null)
    {
      sops = new EObjectContainmentEList<StringOperation>(StringOperation.class, this, SecureUML2JavaPackage.BMACHINE__SOPS);
    }
    return sops;
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
      case SecureUML2JavaPackage.BMACHINE__SEES:
        return ((InternalEList<?>)getSees()).basicRemove(otherEnd, msgs);
      case SecureUML2JavaPackage.BMACHINE__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
      case SecureUML2JavaPackage.BMACHINE__INVS:
        return ((InternalEList<?>)getInvs()).basicRemove(otherEnd, msgs);
      case SecureUML2JavaPackage.BMACHINE__INITS:
        return ((InternalEList<?>)getInits()).basicRemove(otherEnd, msgs);
      case SecureUML2JavaPackage.BMACHINE__VOPS:
        return ((InternalEList<?>)getVops()).basicRemove(otherEnd, msgs);
      case SecureUML2JavaPackage.BMACHINE__SOPS:
        return ((InternalEList<?>)getSops()).basicRemove(otherEnd, msgs);
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
      case SecureUML2JavaPackage.BMACHINE__MNAME:
        return getM_name();
      case SecureUML2JavaPackage.BMACHINE__SEES:
        return getSees();
      case SecureUML2JavaPackage.BMACHINE__VARS:
        return getVars();
      case SecureUML2JavaPackage.BMACHINE__INVS:
        return getInvs();
      case SecureUML2JavaPackage.BMACHINE__INITS:
        return getInits();
      case SecureUML2JavaPackage.BMACHINE__VOPS:
        return getVops();
      case SecureUML2JavaPackage.BMACHINE__SOPS:
        return getSops();
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
      case SecureUML2JavaPackage.BMACHINE__MNAME:
        setM_name((String)newValue);
        return;
      case SecureUML2JavaPackage.BMACHINE__SEES:
        getSees().clear();
        getSees().addAll((Collection<? extends BSees>)newValue);
        return;
      case SecureUML2JavaPackage.BMACHINE__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends BVariable>)newValue);
        return;
      case SecureUML2JavaPackage.BMACHINE__INVS:
        getInvs().clear();
        getInvs().addAll((Collection<? extends BInvariant>)newValue);
        return;
      case SecureUML2JavaPackage.BMACHINE__INITS:
        getInits().clear();
        getInits().addAll((Collection<? extends BInit>)newValue);
        return;
      case SecureUML2JavaPackage.BMACHINE__VOPS:
        getVops().clear();
        getVops().addAll((Collection<? extends VoidOperation>)newValue);
        return;
      case SecureUML2JavaPackage.BMACHINE__SOPS:
        getSops().clear();
        getSops().addAll((Collection<? extends StringOperation>)newValue);
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
      case SecureUML2JavaPackage.BMACHINE__MNAME:
        setM_name(MNAME_EDEFAULT);
        return;
      case SecureUML2JavaPackage.BMACHINE__SEES:
        getSees().clear();
        return;
      case SecureUML2JavaPackage.BMACHINE__VARS:
        getVars().clear();
        return;
      case SecureUML2JavaPackage.BMACHINE__INVS:
        getInvs().clear();
        return;
      case SecureUML2JavaPackage.BMACHINE__INITS:
        getInits().clear();
        return;
      case SecureUML2JavaPackage.BMACHINE__VOPS:
        getVops().clear();
        return;
      case SecureUML2JavaPackage.BMACHINE__SOPS:
        getSops().clear();
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
      case SecureUML2JavaPackage.BMACHINE__MNAME:
        return MNAME_EDEFAULT == null ? m_name != null : !MNAME_EDEFAULT.equals(m_name);
      case SecureUML2JavaPackage.BMACHINE__SEES:
        return sees != null && !sees.isEmpty();
      case SecureUML2JavaPackage.BMACHINE__VARS:
        return vars != null && !vars.isEmpty();
      case SecureUML2JavaPackage.BMACHINE__INVS:
        return invs != null && !invs.isEmpty();
      case SecureUML2JavaPackage.BMACHINE__INITS:
        return inits != null && !inits.isEmpty();
      case SecureUML2JavaPackage.BMACHINE__VOPS:
        return vops != null && !vops.isEmpty();
      case SecureUML2JavaPackage.BMACHINE__SOPS:
        return sops != null && !sops.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //BMachineImpl
