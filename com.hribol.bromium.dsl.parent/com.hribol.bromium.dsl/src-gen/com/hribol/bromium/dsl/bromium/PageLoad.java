/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.PageLoad#getSubpath <em>Subpath</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getPageLoad()
 * @model
 * @generated
 */
public interface PageLoad extends WebDriverAction
{
  /**
   * Returns the value of the '<em><b>Subpath</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subpath</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subpath</em>' containment reference.
   * @see #setSubpath(ParameterValue)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getPageLoad_Subpath()
   * @model containment="true"
   * @generated
   */
  ParameterValue getSubpath();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.PageLoad#getSubpath <em>Subpath</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subpath</em>' containment reference.
   * @see #getSubpath()
   * @generated
   */
  void setSubpath(ParameterValue value);

} // PageLoad
