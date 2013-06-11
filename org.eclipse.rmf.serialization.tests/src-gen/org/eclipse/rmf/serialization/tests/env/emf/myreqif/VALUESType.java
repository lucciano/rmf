/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VALUES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.VALUESType#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType()
 * @model extendedMetaData="name='VALUES_._type' kind='elementOnly'"
 * @generated
 */
public interface VALUESType extends EObject {
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
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEBOOLEAN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEBOOLEAN</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUEBOOLEAN()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-BOOLEAN' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEBOOLEAN> getATTRIBUTEVALUEBOOLEAN();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUEDATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEDATE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEDATE</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUEDATE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-DATE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEDATE> getATTRIBUTEVALUEDATE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEENUMERATION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEENUMERATION</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUEENUMERATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEINTEGER</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUEINTEGER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEINTEGER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEINTEGER</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUEINTEGER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-INTEGER' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEINTEGER> getATTRIBUTEVALUEINTEGER();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEREAL</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUEREAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEREAL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEREAL</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUEREAL()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-REAL' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEREAL> getATTRIBUTEVALUEREAL();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUESTRING</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUESTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUESTRING</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUESTRING</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUESTRING()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-STRING' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUESTRING> getATTRIBUTEVALUESTRING();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEXHTML</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.ATTRIBUTEVALUEXHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEXHTML</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEXHTML</em>' containment reference list.
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getVALUESType_ATTRIBUTEVALUEXHTML()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-XHTML' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEXHTML> getATTRIBUTEVALUEXHTML();

} // VALUESType
