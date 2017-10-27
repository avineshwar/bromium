/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium.util;

import com.hribol.bromium.dsl.bromium.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage
 * @generated
 */
public class BromiumAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BromiumPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BromiumPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BromiumSwitch<Adapter> modelSwitch =
    new BromiumSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseApplicationAction(ApplicationAction object)
      {
        return createApplicationActionAdapter();
      }
      @Override
      public Adapter caseWebDriverAction(WebDriverAction object)
      {
        return createWebDriverActionAdapter();
      }
      @Override
      public Adapter caseElementWithIdIsPresent(ElementWithIdIsPresent object)
      {
        return createElementWithIdIsPresentAdapter();
      }
      @Override
      public Adapter caseClickOnElementWithId(ClickOnElementWithId object)
      {
        return createClickOnElementWithIdAdapter();
      }
      @Override
      public Adapter casePageLoad(PageLoad object)
      {
        return createPageLoadAdapter();
      }
      @Override
      public Adapter caseTypeTextInElementFoundByCssSelector(TypeTextInElementFoundByCssSelector object)
      {
        return createTypeTextInElementFoundByCssSelectorAdapter();
      }
      @Override
      public Adapter caseThreeDottedVersion(ThreeDottedVersion object)
      {
        return createThreeDottedVersionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.ApplicationAction <em>Application Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.ApplicationAction
   * @generated
   */
  public Adapter createApplicationActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.WebDriverAction <em>Web Driver Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.WebDriverAction
   * @generated
   */
  public Adapter createWebDriverActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent <em>Element With Id Is Present</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent
   * @generated
   */
  public Adapter createElementWithIdIsPresentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.ClickOnElementWithId <em>Click On Element With Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.ClickOnElementWithId
   * @generated
   */
  public Adapter createClickOnElementWithIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.PageLoad <em>Page Load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.PageLoad
   * @generated
   */
  public Adapter createPageLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector <em>Type Text In Element Found By Css Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector
   * @generated
   */
  public Adapter createTypeTextInElementFoundByCssSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.hribol.bromium.dsl.bromium.ThreeDottedVersion <em>Three Dotted Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.hribol.bromium.dsl.bromium.ThreeDottedVersion
   * @generated
   */
  public Adapter createThreeDottedVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BromiumAdapterFactory
