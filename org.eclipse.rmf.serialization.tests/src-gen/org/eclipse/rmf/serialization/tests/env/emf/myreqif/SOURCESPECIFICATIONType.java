/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOURCESPECIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.SOURCESPECIFICATIONType#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSOURCESPECIFICATIONType()
 * @model extendedMetaData="name='SOURCE-SPECIFICATION_._type' kind='elementOnly'"
 * @generated
 */
public interface SOURCESPECIFICATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECIFICATIONREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECIFICATIONREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECIFICATIONREF</em>' attribute.
	 * @see #setSPECIFICATIONREF(String)
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSOURCESPECIFICATIONType_SPECIFICATIONREF()
	 * @model dataType="org.eclipse.rmf.serialization.tests.env.emf.myreqif.GLOBALREF"
	 *        extendedMetaData="kind='element' name='SPECIFICATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSPECIFICATIONREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.SOURCESPECIFICATIONType#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECIFICATIONREF</em>' attribute.
	 * @see #getSPECIFICATIONREF()
	 * @generated
	 */
	void setSPECIFICATIONREF(String value);

} // SOURCESPECIFICATIONType
