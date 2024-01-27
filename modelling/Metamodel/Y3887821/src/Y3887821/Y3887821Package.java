/**
 */
package Y3887821;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Y3887821.Y3887821Factory
 * @model kind="package"
 * @generated
 */
public interface Y3887821Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Y3887821";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Y3887821";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Y3887821Package eINSTANCE = Y3887821.impl.Y3887821PackageImpl.init();

	/**
	 * The meta object id for the '{@link Y3887821.impl.SocialImpl <em>Social</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.SocialImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getSocial()
	 * @generated
	 */
	int SOCIAL = 0;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__MICROSERVICES = 0;

	/**
	 * The number of structural features of the '<em>Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.MicroserviceImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Subscribes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SUBSCRIBES_TO = 1;

	/**
	 * The feature id for the '<em><b>Publishes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PUBLISHES_TO = 2;

	/**
	 * The feature id for the '<em><b>Http Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__HTTP_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.EventImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.EventFieldImpl <em>Event Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.EventFieldImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getEventField()
	 * @generated
	 */
	int EVENT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Event Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.EventStreamImpl <em>Event Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.EventStreamImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getEventStream()
	 * @generated
	 */
	int EVENT_STREAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Event Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.HTTPResourceImpl <em>HTTP Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.HTTPResourceImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getHTTPResource()
	 * @generated
	 */
	int HTTP_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE__ENDPOINT = 3;

	/**
	 * The number of structural features of the '<em>HTTP Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>HTTP Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.RequestImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.impl.ResponseImpl
	 * @see Y3887821.impl.Y3887821PackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Y3887821.HTTPMethod <em>HTTP Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Y3887821.HTTPMethod
	 * @see Y3887821.impl.Y3887821PackageImpl#getHTTPMethod()
	 * @generated
	 */
	int HTTP_METHOD = 8;


	/**
	 * Returns the meta object for class '{@link Y3887821.Social <em>Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social</em>'.
	 * @see Y3887821.Social
	 * @generated
	 */
	EClass getSocial();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.Social#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see Y3887821.Social#getMicroservices()
	 * @see #getSocial()
	 * @generated
	 */
	EReference getSocial_Microservices();

	/**
	 * Returns the meta object for class '{@link Y3887821.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see Y3887821.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.Microservice#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see Y3887821.Microservice#getEvents()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.Microservice#getSubscribesTo <em>Subscribes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribes To</em>'.
	 * @see Y3887821.Microservice#getSubscribesTo()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_SubscribesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.Microservice#getPublishesTo <em>Publishes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishes To</em>'.
	 * @see Y3887821.Microservice#getPublishesTo()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_PublishesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.Microservice#getHttpResources <em>Http Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Resources</em>'.
	 * @see Y3887821.Microservice#getHttpResources()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_HttpResources();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3887821.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for class '{@link Y3887821.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see Y3887821.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.Event#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see Y3887821.Event#getFields()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Fields();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3887821.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link Y3887821.EventField <em>Event Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Field</em>'.
	 * @see Y3887821.EventField
	 * @generated
	 */
	EClass getEventField();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.EventField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3887821.EventField#getName()
	 * @see #getEventField()
	 * @generated
	 */
	EAttribute getEventField_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.EventField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3887821.EventField#getType()
	 * @see #getEventField()
	 * @generated
	 */
	EAttribute getEventField_Type();

	/**
	 * Returns the meta object for class '{@link Y3887821.EventStream <em>Event Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Stream</em>'.
	 * @see Y3887821.EventStream
	 * @generated
	 */
	EClass getEventStream();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.EventStream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3887821.EventStream#getName()
	 * @see #getEventStream()
	 * @generated
	 */
	EAttribute getEventStream_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Y3887821.EventStream#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Y3887821.EventStream#getType()
	 * @see #getEventStream()
	 * @generated
	 */
	EReference getEventStream_Type();

	/**
	 * Returns the meta object for class '{@link Y3887821.HTTPResource <em>HTTP Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Resource</em>'.
	 * @see Y3887821.HTTPResource
	 * @generated
	 */
	EClass getHTTPResource();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.HTTPResource#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see Y3887821.HTTPResource#getRequest()
	 * @see #getHTTPResource()
	 * @generated
	 */
	EReference getHTTPResource_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link Y3887821.HTTPResource#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response</em>'.
	 * @see Y3887821.HTTPResource#getResponse()
	 * @see #getHTTPResource()
	 * @generated
	 */
	EReference getHTTPResource_Response();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.HTTPResource#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see Y3887821.HTTPResource#getMethod()
	 * @see #getHTTPResource()
	 * @generated
	 */
	EAttribute getHTTPResource_Method();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.HTTPResource#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see Y3887821.HTTPResource#getEndpoint()
	 * @see #getHTTPResource()
	 * @generated
	 */
	EAttribute getHTTPResource_Endpoint();

	/**
	 * Returns the meta object for class '{@link Y3887821.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see Y3887821.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Request#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3887821.Request#getName()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Request#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3887821.Request#getType()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Request#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3887821.Request#getDescription()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Description();

	/**
	 * Returns the meta object for class '{@link Y3887821.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see Y3887821.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Response#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Y3887821.Response#getName()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Name();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Response#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Y3887821.Response#getType()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Type();

	/**
	 * Returns the meta object for the attribute '{@link Y3887821.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Y3887821.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for enum '{@link Y3887821.HTTPMethod <em>HTTP Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Method</em>'.
	 * @see Y3887821.HTTPMethod
	 * @generated
	 */
	EEnum getHTTPMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Y3887821Factory getY3887821Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Y3887821.impl.SocialImpl <em>Social</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.SocialImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getSocial()
		 * @generated
		 */
		EClass SOCIAL = eINSTANCE.getSocial();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL__MICROSERVICES = eINSTANCE.getSocial_Microservices();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.MicroserviceImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__EVENTS = eINSTANCE.getMicroservice_Events();

		/**
		 * The meta object literal for the '<em><b>Subscribes To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__SUBSCRIBES_TO = eINSTANCE.getMicroservice_SubscribesTo();

		/**
		 * The meta object literal for the '<em><b>Publishes To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__PUBLISHES_TO = eINSTANCE.getMicroservice_PublishesTo();

		/**
		 * The meta object literal for the '<em><b>Http Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__HTTP_RESOURCES = eINSTANCE.getMicroservice_HttpResources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.EventImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__FIELDS = eINSTANCE.getEvent_Fields();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.EventFieldImpl <em>Event Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.EventFieldImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getEventField()
		 * @generated
		 */
		EClass EVENT_FIELD = eINSTANCE.getEventField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_FIELD__NAME = eINSTANCE.getEventField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_FIELD__TYPE = eINSTANCE.getEventField_Type();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.EventStreamImpl <em>Event Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.EventStreamImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getEventStream()
		 * @generated
		 */
		EClass EVENT_STREAM = eINSTANCE.getEventStream();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_STREAM__NAME = eINSTANCE.getEventStream_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_STREAM__TYPE = eINSTANCE.getEventStream_Type();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.HTTPResourceImpl <em>HTTP Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.HTTPResourceImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getHTTPResource()
		 * @generated
		 */
		EClass HTTP_RESOURCE = eINSTANCE.getHTTPResource();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_RESOURCE__REQUEST = eINSTANCE.getHTTPResource_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_RESOURCE__RESPONSE = eINSTANCE.getHTTPResource_Response();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESOURCE__METHOD = eINSTANCE.getHTTPResource_Method();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESOURCE__ENDPOINT = eINSTANCE.getHTTPResource_Endpoint();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.RequestImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__NAME = eINSTANCE.getRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__TYPE = eINSTANCE.getRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__DESCRIPTION = eINSTANCE.getRequest_Description();

		/**
		 * The meta object literal for the '{@link Y3887821.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.impl.ResponseImpl
		 * @see Y3887821.impl.Y3887821PackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__NAME = eINSTANCE.getResponse_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__TYPE = eINSTANCE.getResponse_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '{@link Y3887821.HTTPMethod <em>HTTP Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Y3887821.HTTPMethod
		 * @see Y3887821.impl.Y3887821PackageImpl#getHTTPMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHTTPMethod();

	}

} //Y3887821Package
