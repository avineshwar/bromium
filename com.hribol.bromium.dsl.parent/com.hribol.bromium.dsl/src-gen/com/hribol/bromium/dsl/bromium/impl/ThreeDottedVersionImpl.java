/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import com.hribol.bromium.dsl.bromium.BromiumPackage;
import com.hribol.bromium.dsl.bromium.ThreeDottedVersion;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Three Dotted Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl#getBig <em>Big</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl#getSmall <em>Small</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreeDottedVersionImpl extends MinimalEObjectImpl.Container implements ThreeDottedVersion
{
  /**
   * The default value of the '{@link #getBig() <em>Big</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBig()
   * @generated
   * @ordered
   */
  protected static final int BIG_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBig() <em>Big</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBig()
   * @generated
   * @ordered
   */
  protected int big = BIG_EDEFAULT;

  /**
   * The default value of the '{@link #getMedium() <em>Medium</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedium()
   * @generated
   * @ordered
   */
  protected static final int MEDIUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMedium() <em>Medium</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedium()
   * @generated
   * @ordered
   */
  protected int medium = MEDIUM_EDEFAULT;

  /**
   * The default value of the '{@link #getSmall() <em>Small</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmall()
   * @generated
   * @ordered
   */
  protected static final int SMALL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSmall() <em>Small</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmall()
   * @generated
   * @ordered
   */
  protected int small = SMALL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThreeDottedVersionImpl()
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
    return BromiumPackage.Literals.THREE_DOTTED_VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBig()
  {
    return big;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBig(int newBig)
  {
    int oldBig = big;
    big = newBig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.THREE_DOTTED_VERSION__BIG, oldBig, big));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMedium()
  {
    return medium;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMedium(int newMedium)
  {
    int oldMedium = medium;
    medium = newMedium;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.THREE_DOTTED_VERSION__MEDIUM, oldMedium, medium));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSmall()
  {
    return small;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmall(int newSmall)
  {
    int oldSmall = small;
    small = newSmall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BromiumPackage.THREE_DOTTED_VERSION__SMALL, oldSmall, small));
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
      case BromiumPackage.THREE_DOTTED_VERSION__BIG:
        return getBig();
      case BromiumPackage.THREE_DOTTED_VERSION__MEDIUM:
        return getMedium();
      case BromiumPackage.THREE_DOTTED_VERSION__SMALL:
        return getSmall();
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
      case BromiumPackage.THREE_DOTTED_VERSION__BIG:
        setBig((Integer)newValue);
        return;
      case BromiumPackage.THREE_DOTTED_VERSION__MEDIUM:
        setMedium((Integer)newValue);
        return;
      case BromiumPackage.THREE_DOTTED_VERSION__SMALL:
        setSmall((Integer)newValue);
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
      case BromiumPackage.THREE_DOTTED_VERSION__BIG:
        setBig(BIG_EDEFAULT);
        return;
      case BromiumPackage.THREE_DOTTED_VERSION__MEDIUM:
        setMedium(MEDIUM_EDEFAULT);
        return;
      case BromiumPackage.THREE_DOTTED_VERSION__SMALL:
        setSmall(SMALL_EDEFAULT);
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
      case BromiumPackage.THREE_DOTTED_VERSION__BIG:
        return big != BIG_EDEFAULT;
      case BromiumPackage.THREE_DOTTED_VERSION__MEDIUM:
        return medium != MEDIUM_EDEFAULT;
      case BromiumPackage.THREE_DOTTED_VERSION__SMALL:
        return small != SMALL_EDEFAULT;
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
    result.append(" (big: ");
    result.append(big);
    result.append(", medium: ");
    result.append(medium);
    result.append(", small: ");
    result.append(small);
    result.append(')');
    return result.toString();
  }

} //ThreeDottedVersionImpl
