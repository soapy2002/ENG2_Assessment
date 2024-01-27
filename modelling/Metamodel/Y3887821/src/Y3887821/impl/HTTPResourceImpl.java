/**
 */
package Y3887821.impl;

import Y3887821.HTTPMethod;
import Y3887821.HTTPResource;
import Y3887821.Request;
import Y3887821.Response;
import Y3887821.Y3887821Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3887821.impl.HTTPResourceImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link Y3887821.impl.HTTPResourceImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link Y3887821.impl.HTTPResourceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link Y3887821.impl.HTTPResourceImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPResourceImpl extends MinimalEObjectImpl.Container implements HTTPResource {
	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> response;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPMethod METHOD_EDEFAULT = HTTPMethod.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HTTPMethod method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y3887821Package.Literals.HTTP_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<Request>(Request.class, this, Y3887821Package.HTTP_RESOURCE__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponse() {
		if (response == null) {
			response = new EObjectContainmentEList<Response>(Response.class, this, Y3887821Package.HTTP_RESOURCE__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HTTPMethod newMethod) {
		HTTPMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3887821Package.HTTP_RESOURCE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3887821Package.HTTP_RESOURCE__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y3887821Package.HTTP_RESOURCE__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case Y3887821Package.HTTP_RESOURCE__RESPONSE:
				return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Y3887821Package.HTTP_RESOURCE__REQUEST:
				return getRequest();
			case Y3887821Package.HTTP_RESOURCE__RESPONSE:
				return getResponse();
			case Y3887821Package.HTTP_RESOURCE__METHOD:
				return getMethod();
			case Y3887821Package.HTTP_RESOURCE__ENDPOINT:
				return getEndpoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Y3887821Package.HTTP_RESOURCE__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Request>)newValue);
				return;
			case Y3887821Package.HTTP_RESOURCE__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Response>)newValue);
				return;
			case Y3887821Package.HTTP_RESOURCE__METHOD:
				setMethod((HTTPMethod)newValue);
				return;
			case Y3887821Package.HTTP_RESOURCE__ENDPOINT:
				setEndpoint((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Y3887821Package.HTTP_RESOURCE__REQUEST:
				getRequest().clear();
				return;
			case Y3887821Package.HTTP_RESOURCE__RESPONSE:
				getResponse().clear();
				return;
			case Y3887821Package.HTTP_RESOURCE__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case Y3887821Package.HTTP_RESOURCE__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Y3887821Package.HTTP_RESOURCE__REQUEST:
				return request != null && !request.isEmpty();
			case Y3887821Package.HTTP_RESOURCE__RESPONSE:
				return response != null && !response.isEmpty();
			case Y3887821Package.HTTP_RESOURCE__METHOD:
				return method != METHOD_EDEFAULT;
			case Y3887821Package.HTTP_RESOURCE__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (method: ");
		result.append(method);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(')');
		return result.toString();
	}

} //HTTPResourceImpl
