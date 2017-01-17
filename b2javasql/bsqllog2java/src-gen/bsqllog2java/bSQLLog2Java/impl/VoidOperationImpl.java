/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java.impl;

import bsqllog2java.bSQLLog2Java.BParameterTyping;
import bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage;
import bsqllog2java.bSQLLog2Java.BSubstitution;
import bsqllog2java.bSQLLog2Java.VoidOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Void Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.VoidOperationImpl#getOp_name <em>Op name</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.VoidOperationImpl#getPList <em>PList</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.VoidOperationImpl#getPTyping <em>PTyping</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.VoidOperationImpl#getSubs <em>Subs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoidOperationImpl extends MinimalEObjectImpl.Container implements VoidOperation
{
  /**
   * The default value of the '{@link #getOp_name() <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp_name()
   * @generated
   * @ordered
   */
  protected static final String OP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp_name() <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp_name()
   * @generated
   * @ordered
   */
  protected String op_name = OP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPList() <em>PList</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPList()
   * @generated
   * @ordered
   */
  protected EList<String> pList;

  /**
   * The cached value of the '{@link #getPTyping() <em>PTyping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPTyping()
   * @generated
   * @ordered
   */
  protected EList<BParameterTyping> pTyping;

  /**
   * The cached value of the '{@link #getSubs() <em>Subs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubs()
   * @generated
   * @ordered
   */
  protected EList<BSubstitution> subs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VoidOperationImpl()
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
    return BSQLLog2JavaPackage.Literals.VOID_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp_name()
  {
    return op_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp_name(String newOp_name)
  {
    String oldOp_name = op_name;
    op_name = newOp_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.VOID_OPERATION__OP_NAME, oldOp_name, op_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPList()
  {
    if (pList == null)
    {
      pList = new EDataTypeEList<String>(String.class, this, BSQLLog2JavaPackage.VOID_OPERATION__PLIST);
    }
    return pList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BParameterTyping> getPTyping()
  {
    if (pTyping == null)
    {
      pTyping = new EObjectContainmentEList<BParameterTyping>(BParameterTyping.class, this, BSQLLog2JavaPackage.VOID_OPERATION__PTYPING);
    }
    return pTyping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BSubstitution> getSubs()
  {
    if (subs == null)
    {
      subs = new EObjectContainmentEList<BSubstitution>(BSubstitution.class, this, BSQLLog2JavaPackage.VOID_OPERATION__SUBS);
    }
    return subs;
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
      case BSQLLog2JavaPackage.VOID_OPERATION__PTYPING:
        return ((InternalEList<?>)getPTyping()).basicRemove(otherEnd, msgs);
      case BSQLLog2JavaPackage.VOID_OPERATION__SUBS:
        return ((InternalEList<?>)getSubs()).basicRemove(otherEnd, msgs);
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
      case BSQLLog2JavaPackage.VOID_OPERATION__OP_NAME:
        return getOp_name();
      case BSQLLog2JavaPackage.VOID_OPERATION__PLIST:
        return getPList();
      case BSQLLog2JavaPackage.VOID_OPERATION__PTYPING:
        return getPTyping();
      case BSQLLog2JavaPackage.VOID_OPERATION__SUBS:
        return getSubs();
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
      case BSQLLog2JavaPackage.VOID_OPERATION__OP_NAME:
        setOp_name((String)newValue);
        return;
      case BSQLLog2JavaPackage.VOID_OPERATION__PLIST:
        getPList().clear();
        getPList().addAll((Collection<? extends String>)newValue);
        return;
      case BSQLLog2JavaPackage.VOID_OPERATION__PTYPING:
        getPTyping().clear();
        getPTyping().addAll((Collection<? extends BParameterTyping>)newValue);
        return;
      case BSQLLog2JavaPackage.VOID_OPERATION__SUBS:
        getSubs().clear();
        getSubs().addAll((Collection<? extends BSubstitution>)newValue);
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
      case BSQLLog2JavaPackage.VOID_OPERATION__OP_NAME:
        setOp_name(OP_NAME_EDEFAULT);
        return;
      case BSQLLog2JavaPackage.VOID_OPERATION__PLIST:
        getPList().clear();
        return;
      case BSQLLog2JavaPackage.VOID_OPERATION__PTYPING:
        getPTyping().clear();
        return;
      case BSQLLog2JavaPackage.VOID_OPERATION__SUBS:
        getSubs().clear();
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
      case BSQLLog2JavaPackage.VOID_OPERATION__OP_NAME:
        return OP_NAME_EDEFAULT == null ? op_name != null : !OP_NAME_EDEFAULT.equals(op_name);
      case BSQLLog2JavaPackage.VOID_OPERATION__PLIST:
        return pList != null && !pList.isEmpty();
      case BSQLLog2JavaPackage.VOID_OPERATION__PTYPING:
        return pTyping != null && !pTyping.isEmpty();
      case BSQLLog2JavaPackage.VOID_OPERATION__SUBS:
        return subs != null && !subs.isEmpty();
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
    result.append(" (op_name: ");
    result.append(op_name);
    result.append(", pList: ");
    result.append(pList);
    result.append(')');
    return result.toString();
  }

} //VoidOperationImpl
