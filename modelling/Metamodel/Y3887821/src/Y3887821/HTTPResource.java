/**
 */
package Y3887821;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3887821.HTTPResource#getRequest <em>Request</em>}</li>
 *   <li>{@link Y3887821.HTTPResource#getResponse <em>Response</em>}</li>
 *   <li>{@link Y3887821.HTTPResource#getMethod <em>Method</em>}</li>
 *   <li>{@link Y3887821.HTTPResource#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see Y3887821.Y3887821Package#getHTTPResource()
 * @model
 * @generated
 */
public interface HTTPResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getHTTPResource_Request()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequest();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link Y3887821.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see Y3887821.Y3887821Package#getHTTPResource_Response()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponse();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link Y3887821.HTTPMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see Y3887821.HTTPMethod
	 * @see #setMethod(HTTPMethod)
	 * @see Y3887821.Y3887821Package#getHTTPResource_Method()
	 * @model
	 * @generated
	 */
	HTTPMethod getMethod();

	/**
	 * Sets the value of the '{@link Y3887821.HTTPResource#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see Y3887821.HTTPMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HTTPMethod value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see Y3887821.Y3887821Package#getHTTPResource_Endpoint()
	 * @model
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link Y3887821.HTTPResource#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

} // HTTPResource
