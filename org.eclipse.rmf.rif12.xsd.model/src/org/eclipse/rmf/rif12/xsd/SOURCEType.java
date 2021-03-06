/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif12.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOURCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SOURCEType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSOURCEType()
 * @model extendedMetaData="name='SOURCE_._type' kind='elementOnly'"
 * @generated
 */
public interface SOURCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECOBJECTREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTREF</em>' reference.
	 * @see #setSPECOBJECTREF(SPECOBJECT)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSOURCEType_SPECOBJECTREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECT-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECOBJECT getSPECOBJECTREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SOURCEType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTREF</em>' reference.
	 * @see #getSPECOBJECTREF()
	 * @generated
	 */
	void setSPECOBJECTREF(SPECOBJECT value);

} // SOURCEType
