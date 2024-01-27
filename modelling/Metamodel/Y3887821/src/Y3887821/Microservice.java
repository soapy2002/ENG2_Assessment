/**
 */
package Y3887821;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3887821.Microservice#getEvents <em>Events</em>}</li>
 *   <li>{@link Y3887821.Microservice#getSubscribesTo <em>Subscribes To</em>}</li>
 *   <li>{@link Y3887821.Microservice#getPublishesTo <em>Publishes To</em>}</li>
 *   <li>{@link Y3887821.Microservice#getHttpResources <em>Http Resources</em>}</li>
 *   <li>{@link Y3887821.Microservice#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Y3887821.Y3887821Package#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getMicroservice_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Subscribes To</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.EventStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribes To</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getMicroservice_SubscribesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventStream> getSubscribesTo();

	/**
	 * Returns the value of the '<em><b>Publishes To</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.EventStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishes To</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getMicroservice_PublishesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventStream> getPublishesTo();

	/**
	 * Returns the value of the '<em><b>Http Resources</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.HTTPResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Resources</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getMicroservice_HttpResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTTPResource> getHttpResources();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Y3887821.Y3887821Package#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Y3887821.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Microservice
