/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.secureUML2Java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secureuml2Java.secureUML2Java.BTuple;
import secureuml2Java.secureUML2Java.SecureUML2JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BTupleImpl#getRan <em>Ran</em>}</li>
 *   <li>{@link secureuml2Java.secureUML2Java.impl.BTupleImpl#getDom <em>Dom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BTupleImpl extends MinimalEObjectImpl.Container implements BTuple
{
  /**
   * The cached value of the '{@link #getRan() <em>Ran</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRan()
   * @generated
   * @ordered
   */
  protected EObject ran;

  /**
   * The default value of the '{@link #getDom() <em>Dom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDom()
   * @generated
   * @ordered
   */
  protected static final String DOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDom() <em>Dom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDom()
   * @generated
   * @ordered
   */
  protected String dom = DOM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BTupleImpl()
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
    return SecureUML2JavaPackage.Literals.BTUPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getRan()
  {
    return ran;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRan(EObject newRan, NotificationChain msgs)
  {
    EObject oldRan = ran;
    ran = newRan;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BTUPLE__RAN, oldRan, newRan);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRan(EObject newRan)
  {
    if (newRan != ran)
    {
      NotificationChain msgs = null;
      if (ran != null)
        msgs = ((InternalEObject)ran).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecureUML2JavaPackage.BTUPLE__RAN, null, msgs);
      if (newRan != null)
        msgs = ((InternalEObject)newRan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecureUML2JavaPackage.BTUPLE__RAN, null, msgs);
      msgs = basicSetRan(newRan, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BTUPLE__RAN, newRan, newRan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDom()
  {
    return dom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDom(String newDom)
  {
    String oldDom = dom;
    dom = newDom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecureUML2JavaPackage.BTUPLE__DOM, oldDom, dom));
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
      case SecureUML2JavaPackage.BTUPLE__RAN:
        return basicSetRan(null, msgs);
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
      case SecureUML2JavaPackage.BTUPLE__RAN:
        return getRan();
      case SecureUML2JavaPackage.BTUPLE__DOM:
        return getDom();
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
      case SecureUML2JavaPackage.BTUPLE__RAN:
        setRan((EObject)newValue);
        return;
      case SecureUML2JavaPackage.BTUPLE__DOM:
        setDom((String)newValue);
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
      case SecureUML2JavaPackage.BTUPLE__RAN:
        setRan((EObject)null);
        return;
      case SecureUML2JavaPackage.BTUPLE__DOM:
        setDom(DOM_EDEFAULT);
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
      case SecureUML2JavaPackage.BTUPLE__RAN:
        return ran != null;
      case SecureUML2JavaPackage.BTUPLE__DOM:
        return DOM_EDEFAULT == null ? dom != null : !DOM_EDEFAULT.equals(dom);
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
    result.append(" (dom: ");
    result.append(dom);
    result.append(')');
    return result.toString();
  }

} //BTupleImpl
