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

package org.eclipse.rmf.reqif10.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEFINITION Type5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType5#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDEFINITIONType5()
 * @model extendedMetaData="name='DEFINITION_._5_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType5 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' reference.
	 * @see #setATTRIBUTEDEFINITIONINTEGERREF(ATTRIBUTEDEFINITIONINTEGER)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDEFINITIONType5_ATTRIBUTEDEFINITIONINTEGERREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-INTEGER-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONINTEGER getATTRIBUTEDEFINITIONINTEGERREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType5#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' reference.
	 * @see #getATTRIBUTEDEFINITIONINTEGERREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONINTEGERREF(ATTRIBUTEDEFINITIONINTEGER value);

} // DEFINITIONType5
