/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition XHTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionXHTML()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-XHTML' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ATTRIBUTE-DEFINITION-XHTML'"
 * @generated
 */
public interface AttributeDefinitionXHTML extends AttributeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(DatatypeDefinitionXHTML)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionXHTML_Type()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TYPE' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='true' classifierNameSuffix='-REF'"
	 * @generated
	 */
	DatatypeDefinitionXHTML getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionXHTML value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionXHTML)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionXHTML)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(AttributeValueXHTML)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionXHTML_DefaultValue()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='DEFAULT-VALUE' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DEFAULT-VALUE' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	AttributeValueXHTML getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueXHTML value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueXHTML)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML#getDefaultValue <em>Default Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' containment reference is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueXHTML)
	 * @generated
	 */
	boolean isSetDefaultValue();

} // AttributeDefinitionXHTML
