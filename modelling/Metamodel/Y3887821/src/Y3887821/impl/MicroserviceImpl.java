/**
 */
package Y3887821.impl;

import Y3887821.Event;
import Y3887821.EventStream;
import Y3887821.HTTPResource;
import Y3887821.Microservice;
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
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Y3887821.impl.MicroserviceImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link Y3887821.impl.MicroserviceImpl#getSubscribesTo <em>Subscribes To</em>}</li>
 *   <li>{@link Y3887821.impl.MicroserviceImpl#getPublishesTo <em>Publishes To</em>}</li>
 *   <li>{@link Y3887821.impl.MicroserviceImpl#getHttpResources <em>Http Resources</em>}</li>
 *   <li>{@link Y3887821.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getSubscribesTo() <em>Subscribes To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EventStream> subscribesTo;

	/**
	 * The cached value of the '{@link #getPublishesTo() <em>Publishes To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EventStream> publishesTo;

	/**
	 * The cached value of the '{@link #getHttpResources() <em>Http Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpResources()
	 * @generated
	 * @ordered
	 */
	protected EList<HTTPResource> httpResources;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Y3887821Package.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, Y3887821Package.MICROSERVICE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventStream> getSubscribesTo() {
		if (subscribesTo == null) {
			subscribesTo = new EObjectContainmentEList<EventStream>(EventStream.class, this, Y3887821Package.MICROSERVICE__SUBSCRIBES_TO);
		}
		return subscribesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventStream> getPublishesTo() {
		if (publishesTo == null) {
			publishesTo = new EObjectContainmentEList<EventStream>(EventStream.class, this, Y3887821Package.MICROSERVICE__PUBLISHES_TO);
		}
		return publishesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HTTPResource> getHttpResources() {
		if (httpResources == null) {
			httpResources = new EObjectContainmentEList<HTTPResource>(HTTPResource.class, this, Y3887821Package.MICROSERVICE__HTTP_RESOURCES);
		}
		return httpResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Y3887821Package.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Y3887821Package.MICROSERVICE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case Y3887821Package.MICROSERVICE__SUBSCRIBES_TO:
				return ((InternalEList<?>)getSubscribesTo()).basicRemove(otherEnd, msgs);
			case Y3887821Package.MICROSERVICE__PUBLISHES_TO:
				return ((InternalEList<?>)getPublishesTo()).basicRemove(otherEnd, msgs);
			case Y3887821Package.MICROSERVICE__HTTP_RESOURCES:
				return ((InternalEList<?>)getHttpResources()).basicRemove(otherEnd, msgs);
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
			case Y3887821Package.MICROSERVICE__EVENTS:
				return getEvents();
			case Y3887821Package.MICROSERVICE__SUBSCRIBES_TO:
				return getSubscribesTo();
			case Y3887821Package.MICROSERVICE__PUBLISHES_TO:
				return getPublishesTo();
			case Y3887821Package.MICROSERVICE__HTTP_RESOURCES:
				return getHttpResources();
			case Y3887821Package.MICROSERVICE__NAME:
				return getName();
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
			case Y3887821Package.MICROSERVICE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case Y3887821Package.MICROSERVICE__SUBSCRIBES_TO:
				getSubscribesTo().clear();
				getSubscribesTo().addAll((Collection<? extends EventStream>)newValue);
				return;
			case Y3887821Package.MICROSERVICE__PUBLISHES_TO:
				getPublishesTo().clear();
				getPublishesTo().addAll((Collection<? extends EventStream>)newValue);
				return;
			case Y3887821Package.MICROSERVICE__HTTP_RESOURCES:
				getHttpResources().clear();
				getHttpResources().addAll((Collection<? extends HTTPResource>)newValue);
				return;
			case Y3887821Package.MICROSERVICE__NAME:
				setName((String)newValue);
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
			case Y3887821Package.MICROSERVICE__EVENTS:
				getEvents().clear();
				return;
			case Y3887821Package.MICROSERVICE__SUBSCRIBES_TO:
				getSubscribesTo().clear();
				return;
			case Y3887821Package.MICROSERVICE__PUBLISHES_TO:
				getPublishesTo().clear();
				return;
			case Y3887821Package.MICROSERVICE__HTTP_RESOURCES:
				getHttpResources().clear();
				return;
			case Y3887821Package.MICROSERVICE__NAME:
				setName(NAME_EDEFAULT);
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
			case Y3887821Package.MICROSERVICE__EVENTS:
				return events != null && !events.isEmpty();
			case Y3887821Package.MICROSERVICE__SUBSCRIBES_TO:
				return subscribesTo != null && !subscribesTo.isEmpty();
			case Y3887821Package.MICROSERVICE__PUBLISHES_TO:
				return publishesTo != null && !publishesTo.isEmpty();
			case Y3887821Package.MICROSERVICE__HTTP_RESOURCES:
				return httpResources != null && !httpResources.isEmpty();
			case Y3887821Package.MICROSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
