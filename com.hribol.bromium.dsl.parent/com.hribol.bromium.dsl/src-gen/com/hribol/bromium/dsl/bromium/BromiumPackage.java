/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.hribol.bromium.dsl.bromium.BromiumFactory
 * @model kind="package"
 * @generated
 */
public interface BromiumPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bromium";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hribol.com/bromium/dsl/Bromium";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bromium";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BromiumPackage eINSTANCE = com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl.init();

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.ModelImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VERSION = 1;

  /**
   * The feature id for the '<em><b>Base Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BASE_VERSION = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTIONS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl <em>Application Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getApplicationAction()
   * @generated
   */
  int APPLICATION_ACTION = 1;

  /**
   * The feature id for the '<em><b>Action Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ACTION__ACTION_ID = 0;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ACTION__PRECONDITION = 1;

  /**
   * The feature id for the '<em><b>Web Driver Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ACTION__WEB_DRIVER_ACTION = 2;

  /**
   * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ACTION__POSTCONDITION = 3;

  /**
   * The number of structural features of the '<em>Application Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.WebDriverActionImpl <em>Web Driver Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.WebDriverActionImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getWebDriverAction()
   * @generated
   */
  int WEB_DRIVER_ACTION = 2;

  /**
   * The number of structural features of the '<em>Web Driver Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_DRIVER_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.ElementWithIdIsPresentImpl <em>Element With Id Is Present</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.ElementWithIdIsPresentImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getElementWithIdIsPresent()
   * @generated
   */
  int ELEMENT_WITH_ID_IS_PRESENT = 3;

  /**
   * The feature id for the '<em><b>Css Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WITH_ID_IS_PRESENT__CSS_SELECTOR = WEB_DRIVER_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element With Id Is Present</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_WITH_ID_IS_PRESENT_FEATURE_COUNT = WEB_DRIVER_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.ClickOnElementWithIdImpl <em>Click On Element With Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.ClickOnElementWithIdImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getClickOnElementWithId()
   * @generated
   */
  int CLICK_ON_ELEMENT_WITH_ID = 4;

  /**
   * The feature id for the '<em><b>Css Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_ON_ELEMENT_WITH_ID__CSS_SELECTOR = WEB_DRIVER_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Click On Element With Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_ON_ELEMENT_WITH_ID_FEATURE_COUNT = WEB_DRIVER_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.PageLoadImpl <em>Page Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.PageLoadImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getPageLoad()
   * @generated
   */
  int PAGE_LOAD = 5;

  /**
   * The feature id for the '<em><b>Subpath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_LOAD__SUBPATH = WEB_DRIVER_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Page Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_LOAD_FEATURE_COUNT = WEB_DRIVER_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.TypeTextInElementFoundByCssSelectorImpl <em>Type Text In Element Found By Css Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.TypeTextInElementFoundByCssSelectorImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getTypeTextInElementFoundByCssSelector()
   * @generated
   */
  int TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR = 6;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__TEXT = WEB_DRIVER_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Css Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__CSS_SELECTOR = WEB_DRIVER_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Text In Element Found By Css Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR_FEATURE_COUNT = WEB_DRIVER_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl <em>Three Dotted Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl
   * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getThreeDottedVersion()
   * @generated
   */
  int THREE_DOTTED_VERSION = 7;

  /**
   * The feature id for the '<em><b>Big</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREE_DOTTED_VERSION__BIG = 0;

  /**
   * The feature id for the '<em><b>Medium</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREE_DOTTED_VERSION__MEDIUM = 1;

  /**
   * The feature id for the '<em><b>Small</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREE_DOTTED_VERSION__SMALL = 2;

  /**
   * The number of structural features of the '<em>Three Dotted Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREE_DOTTED_VERSION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.hribol.bromium.dsl.bromium.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.hribol.bromium.dsl.bromium.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.Model#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.hribol.bromium.dsl.bromium.Model#getVersion()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Version();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.Model#getBaseVersion <em>Base Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Version</em>'.
   * @see com.hribol.bromium.dsl.bromium.Model#getBaseVersion()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_BaseVersion();

  /**
   * Returns the meta object for the containment reference list '{@link com.hribol.bromium.dsl.bromium.Model#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.hribol.bromium.dsl.bromium.Model#getActions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Actions();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.ApplicationAction <em>Application Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Action</em>'.
   * @see com.hribol.bromium.dsl.bromium.ApplicationAction
   * @generated
   */
  EClass getApplicationAction();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getActionId <em>Action Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action Id</em>'.
   * @see com.hribol.bromium.dsl.bromium.ApplicationAction#getActionId()
   * @see #getApplicationAction()
   * @generated
   */
  EAttribute getApplicationAction_ActionId();

  /**
   * Returns the meta object for the containment reference '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Precondition</em>'.
   * @see com.hribol.bromium.dsl.bromium.ApplicationAction#getPrecondition()
   * @see #getApplicationAction()
   * @generated
   */
  EReference getApplicationAction_Precondition();

  /**
   * Returns the meta object for the containment reference '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getWebDriverAction <em>Web Driver Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Web Driver Action</em>'.
   * @see com.hribol.bromium.dsl.bromium.ApplicationAction#getWebDriverAction()
   * @see #getApplicationAction()
   * @generated
   */
  EReference getApplicationAction_WebDriverAction();

  /**
   * Returns the meta object for the containment reference '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getPostcondition <em>Postcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postcondition</em>'.
   * @see com.hribol.bromium.dsl.bromium.ApplicationAction#getPostcondition()
   * @see #getApplicationAction()
   * @generated
   */
  EReference getApplicationAction_Postcondition();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.WebDriverAction <em>Web Driver Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Driver Action</em>'.
   * @see com.hribol.bromium.dsl.bromium.WebDriverAction
   * @generated
   */
  EClass getWebDriverAction();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent <em>Element With Id Is Present</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element With Id Is Present</em>'.
   * @see com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent
   * @generated
   */
  EClass getElementWithIdIsPresent();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent#getCssSelector <em>Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Css Selector</em>'.
   * @see com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent#getCssSelector()
   * @see #getElementWithIdIsPresent()
   * @generated
   */
  EAttribute getElementWithIdIsPresent_CssSelector();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.ClickOnElementWithId <em>Click On Element With Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click On Element With Id</em>'.
   * @see com.hribol.bromium.dsl.bromium.ClickOnElementWithId
   * @generated
   */
  EClass getClickOnElementWithId();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.ClickOnElementWithId#getCssSelector <em>Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Css Selector</em>'.
   * @see com.hribol.bromium.dsl.bromium.ClickOnElementWithId#getCssSelector()
   * @see #getClickOnElementWithId()
   * @generated
   */
  EAttribute getClickOnElementWithId_CssSelector();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.PageLoad <em>Page Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Load</em>'.
   * @see com.hribol.bromium.dsl.bromium.PageLoad
   * @generated
   */
  EClass getPageLoad();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.PageLoad#getSubpath <em>Subpath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subpath</em>'.
   * @see com.hribol.bromium.dsl.bromium.PageLoad#getSubpath()
   * @see #getPageLoad()
   * @generated
   */
  EAttribute getPageLoad_Subpath();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector <em>Type Text In Element Found By Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Text In Element Found By Css Selector</em>'.
   * @see com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector
   * @generated
   */
  EClass getTypeTextInElementFoundByCssSelector();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getText()
   * @see #getTypeTextInElementFoundByCssSelector()
   * @generated
   */
  EAttribute getTypeTextInElementFoundByCssSelector_Text();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getCssSelector <em>Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Css Selector</em>'.
   * @see com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getCssSelector()
   * @see #getTypeTextInElementFoundByCssSelector()
   * @generated
   */
  EAttribute getTypeTextInElementFoundByCssSelector_CssSelector();

  /**
   * Returns the meta object for class '{@link com.hribol.bromium.dsl.bromium.ThreeDottedVersion <em>Three Dotted Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Three Dotted Version</em>'.
   * @see com.hribol.bromium.dsl.bromium.ThreeDottedVersion
   * @generated
   */
  EClass getThreeDottedVersion();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.ThreeDottedVersion#getBig <em>Big</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Big</em>'.
   * @see com.hribol.bromium.dsl.bromium.ThreeDottedVersion#getBig()
   * @see #getThreeDottedVersion()
   * @generated
   */
  EAttribute getThreeDottedVersion_Big();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.ThreeDottedVersion#getMedium <em>Medium</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Medium</em>'.
   * @see com.hribol.bromium.dsl.bromium.ThreeDottedVersion#getMedium()
   * @see #getThreeDottedVersion()
   * @generated
   */
  EAttribute getThreeDottedVersion_Medium();

  /**
   * Returns the meta object for the attribute '{@link com.hribol.bromium.dsl.bromium.ThreeDottedVersion#getSmall <em>Small</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Small</em>'.
   * @see com.hribol.bromium.dsl.bromium.ThreeDottedVersion#getSmall()
   * @see #getThreeDottedVersion()
   * @generated
   */
  EAttribute getThreeDottedVersion_Small();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BromiumFactory getBromiumFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.ModelImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__VERSION = eINSTANCE.getModel_Version();

    /**
     * The meta object literal for the '<em><b>Base Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__BASE_VERSION = eINSTANCE.getModel_BaseVersion();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACTIONS = eINSTANCE.getModel_Actions();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl <em>Application Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.ApplicationActionImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getApplicationAction()
     * @generated
     */
    EClass APPLICATION_ACTION = eINSTANCE.getApplicationAction();

    /**
     * The meta object literal for the '<em><b>Action Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ACTION__ACTION_ID = eINSTANCE.getApplicationAction_ActionId();

    /**
     * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_ACTION__PRECONDITION = eINSTANCE.getApplicationAction_Precondition();

    /**
     * The meta object literal for the '<em><b>Web Driver Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_ACTION__WEB_DRIVER_ACTION = eINSTANCE.getApplicationAction_WebDriverAction();

    /**
     * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_ACTION__POSTCONDITION = eINSTANCE.getApplicationAction_Postcondition();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.WebDriverActionImpl <em>Web Driver Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.WebDriverActionImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getWebDriverAction()
     * @generated
     */
    EClass WEB_DRIVER_ACTION = eINSTANCE.getWebDriverAction();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.ElementWithIdIsPresentImpl <em>Element With Id Is Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.ElementWithIdIsPresentImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getElementWithIdIsPresent()
     * @generated
     */
    EClass ELEMENT_WITH_ID_IS_PRESENT = eINSTANCE.getElementWithIdIsPresent();

    /**
     * The meta object literal for the '<em><b>Css Selector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_WITH_ID_IS_PRESENT__CSS_SELECTOR = eINSTANCE.getElementWithIdIsPresent_CssSelector();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.ClickOnElementWithIdImpl <em>Click On Element With Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.ClickOnElementWithIdImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getClickOnElementWithId()
     * @generated
     */
    EClass CLICK_ON_ELEMENT_WITH_ID = eINSTANCE.getClickOnElementWithId();

    /**
     * The meta object literal for the '<em><b>Css Selector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLICK_ON_ELEMENT_WITH_ID__CSS_SELECTOR = eINSTANCE.getClickOnElementWithId_CssSelector();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.PageLoadImpl <em>Page Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.PageLoadImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getPageLoad()
     * @generated
     */
    EClass PAGE_LOAD = eINSTANCE.getPageLoad();

    /**
     * The meta object literal for the '<em><b>Subpath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_LOAD__SUBPATH = eINSTANCE.getPageLoad_Subpath();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.TypeTextInElementFoundByCssSelectorImpl <em>Type Text In Element Found By Css Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.TypeTextInElementFoundByCssSelectorImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getTypeTextInElementFoundByCssSelector()
     * @generated
     */
    EClass TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR = eINSTANCE.getTypeTextInElementFoundByCssSelector();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__TEXT = eINSTANCE.getTypeTextInElementFoundByCssSelector_Text();

    /**
     * The meta object literal for the '<em><b>Css Selector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__CSS_SELECTOR = eINSTANCE.getTypeTextInElementFoundByCssSelector_CssSelector();

    /**
     * The meta object literal for the '{@link com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl <em>Three Dotted Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hribol.bromium.dsl.bromium.impl.ThreeDottedVersionImpl
     * @see com.hribol.bromium.dsl.bromium.impl.BromiumPackageImpl#getThreeDottedVersion()
     * @generated
     */
    EClass THREE_DOTTED_VERSION = eINSTANCE.getThreeDottedVersion();

    /**
     * The meta object literal for the '<em><b>Big</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THREE_DOTTED_VERSION__BIG = eINSTANCE.getThreeDottedVersion_Big();

    /**
     * The meta object literal for the '<em><b>Medium</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THREE_DOTTED_VERSION__MEDIUM = eINSTANCE.getThreeDottedVersion_Medium();

    /**
     * The meta object literal for the '<em><b>Small</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THREE_DOTTED_VERSION__SMALL = eINSTANCE.getThreeDottedVersion_Small();

  }

} //BromiumPackage
