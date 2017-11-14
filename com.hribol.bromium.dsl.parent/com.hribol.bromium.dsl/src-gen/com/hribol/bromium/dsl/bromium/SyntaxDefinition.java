/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.SyntaxDefinition#getContent <em>Content</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.SyntaxDefinition#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getSyntaxDefinition()
 * @model
 * @generated
 */
public interface SyntaxDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getSyntaxDefinition_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.SyntaxDefinition#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(ExposedParameter)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getSyntaxDefinition_Parameter()
   * @model containment="true"
   * @generated
   */
  ExposedParameter getParameter();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.SyntaxDefinition#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(ExposedParameter value);

} // SyntaxDefinition
