/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPECIFIEDVALUES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.SPECIFIEDVALUESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.SPECIFIEDVALUESType#getENUMVALUE <em>ENUMVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSPECIFIEDVALUESType()
 * @model extendedMetaData="name='SPECIFIED-VALUES_._type' kind='elementOnly'"
 * @generated
 */
public interface SPECIFIEDVALUESType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSPECIFIEDVALUESType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ENUMVALUE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ENUMVALUE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ENUMVALUE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ENUMVALUE</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSPECIFIEDVALUESType_ENUMVALUE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ENUM-VALUE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ENUMVALUE> getENUMVALUE();

} // SPECIFIEDVALUESType
