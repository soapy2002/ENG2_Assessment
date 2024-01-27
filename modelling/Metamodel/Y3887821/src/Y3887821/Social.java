/**
 */
package Y3887821;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3887821.Social#getMicroservices <em>Microservices</em>}</li>
 * </ul>
 *
 * @see Y3887821.Y3887821Package#getSocial()
 * @model
 * @generated
 */
public interface Social extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getSocial_Microservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

} // Social
