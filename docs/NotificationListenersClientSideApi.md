# NotificationListenersClientSideApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listenToAdjustBalanceCancelEvent**](NotificationListenersClientSideApi.md#listenToAdjustBalanceCancelEvent) | **POST** /listener/adjustBalanceCancelEvent | Client listener for entity AdjustBalanceCancelEvent
[**listenToAdjustBalanceCreateEvent**](NotificationListenersClientSideApi.md#listenToAdjustBalanceCreateEvent) | **POST** /listener/adjustBalanceCreateEvent | Client listener for entity AdjustBalanceCreateEvent
[**listenToAdjustBalanceFailureEvent**](NotificationListenersClientSideApi.md#listenToAdjustBalanceFailureEvent) | **POST** /listener/adjustBalanceFailureEvent | Client listener for entity AdjustBalanceFailureEvent
[**listenToReserveBalanceCancelEvent**](NotificationListenersClientSideApi.md#listenToReserveBalanceCancelEvent) | **POST** /listener/reserveBalanceCancelEvent | Client listener for entity ReserveBalanceCancelEvent
[**listenToReserveBalanceCreateEvent**](NotificationListenersClientSideApi.md#listenToReserveBalanceCreateEvent) | **POST** /listener/reserveBalanceCreateEvent | Client listener for entity ReserveBalanceCreateEvent
[**listenToReserveBalanceFailureEvent**](NotificationListenersClientSideApi.md#listenToReserveBalanceFailureEvent) | **POST** /listener/reserveBalanceFailureEvent | Client listener for entity ReserveBalanceFailureEvent
[**listenToTopupBalanceCancelEvent**](NotificationListenersClientSideApi.md#listenToTopupBalanceCancelEvent) | **POST** /listener/topupBalanceCancelEvent | Client listener for entity TopupBalanceCancelEvent
[**listenToTopupBalanceCreateEvent**](NotificationListenersClientSideApi.md#listenToTopupBalanceCreateEvent) | **POST** /listener/topupBalanceCreateEvent | Client listener for entity TopupBalanceCreateEvent
[**listenToTopupBalanceFailureEvent**](NotificationListenersClientSideApi.md#listenToTopupBalanceFailureEvent) | **POST** /listener/topupBalanceFailureEvent | Client listener for entity TopupBalanceFailureEvent
[**listenToTransferBalanceCancelEvent**](NotificationListenersClientSideApi.md#listenToTransferBalanceCancelEvent) | **POST** /listener/transferBalanceCancelEvent | Client listener for entity TransferBalanceCancelEvent
[**listenToTransferBalanceCreateEvent**](NotificationListenersClientSideApi.md#listenToTransferBalanceCreateEvent) | **POST** /listener/transferBalanceCreateEvent | Client listener for entity TransferBalanceCreateEvent
[**listenToTransferBalanceFailureEvent**](NotificationListenersClientSideApi.md#listenToTransferBalanceFailureEvent) | **POST** /listener/transferBalanceFailureEvent | Client listener for entity TransferBalanceFailureEvent

<a name="listenToAdjustBalanceCancelEvent"></a>
# **listenToAdjustBalanceCancelEvent**
> EventSubscription listenToAdjustBalanceCancelEvent(body)

Client listener for entity AdjustBalanceCancelEvent

Example of a client listener for receiving the notification AdjustBalanceCancelEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
AdjustBalanceCancelEvent body = new AdjustBalanceCancelEvent(); // AdjustBalanceCancelEvent | The event data
try {
    EventSubscription result = apiInstance.listenToAdjustBalanceCancelEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToAdjustBalanceCancelEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdjustBalanceCancelEvent**](AdjustBalanceCancelEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToAdjustBalanceCreateEvent"></a>
# **listenToAdjustBalanceCreateEvent**
> EventSubscription listenToAdjustBalanceCreateEvent(body)

Client listener for entity AdjustBalanceCreateEvent

Example of a client listener for receiving the notification AdjustBalanceCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
AdjustBalanceCreateEvent body = new AdjustBalanceCreateEvent(); // AdjustBalanceCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToAdjustBalanceCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToAdjustBalanceCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdjustBalanceCreateEvent**](AdjustBalanceCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToAdjustBalanceFailureEvent"></a>
# **listenToAdjustBalanceFailureEvent**
> EventSubscription listenToAdjustBalanceFailureEvent(body)

Client listener for entity AdjustBalanceFailureEvent

Example of a client listener for receiving the notification AdjustBalanceFailureEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
AdjustBalanceFailureEvent body = new AdjustBalanceFailureEvent(); // AdjustBalanceFailureEvent | The event data
try {
    EventSubscription result = apiInstance.listenToAdjustBalanceFailureEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToAdjustBalanceFailureEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdjustBalanceFailureEvent**](AdjustBalanceFailureEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToReserveBalanceCancelEvent"></a>
# **listenToReserveBalanceCancelEvent**
> EventSubscription listenToReserveBalanceCancelEvent(body)

Client listener for entity ReserveBalanceCancelEvent

Example of a client listener for receiving the notification ReserveBalanceCancelEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
ReserveBalanceCancelEvent body = new ReserveBalanceCancelEvent(); // ReserveBalanceCancelEvent | The event data
try {
    EventSubscription result = apiInstance.listenToReserveBalanceCancelEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToReserveBalanceCancelEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReserveBalanceCancelEvent**](ReserveBalanceCancelEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToReserveBalanceCreateEvent"></a>
# **listenToReserveBalanceCreateEvent**
> EventSubscription listenToReserveBalanceCreateEvent(body)

Client listener for entity ReserveBalanceCreateEvent

Example of a client listener for receiving the notification ReserveBalanceCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
ReserveBalanceCreateEvent body = new ReserveBalanceCreateEvent(); // ReserveBalanceCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToReserveBalanceCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToReserveBalanceCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReserveBalanceCreateEvent**](ReserveBalanceCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToReserveBalanceFailureEvent"></a>
# **listenToReserveBalanceFailureEvent**
> EventSubscription listenToReserveBalanceFailureEvent(body)

Client listener for entity ReserveBalanceFailureEvent

Example of a client listener for receiving the notification ReserveBalanceFailureEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
ReserveBalanceFailureEvent body = new ReserveBalanceFailureEvent(); // ReserveBalanceFailureEvent | The event data
try {
    EventSubscription result = apiInstance.listenToReserveBalanceFailureEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToReserveBalanceFailureEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReserveBalanceFailureEvent**](ReserveBalanceFailureEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToTopupBalanceCancelEvent"></a>
# **listenToTopupBalanceCancelEvent**
> EventSubscription listenToTopupBalanceCancelEvent(body)

Client listener for entity TopupBalanceCancelEvent

Example of a client listener for receiving the notification TopupBalanceCancelEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
TopupBalanceCancelEvent body = new TopupBalanceCancelEvent(); // TopupBalanceCancelEvent | The event data
try {
    EventSubscription result = apiInstance.listenToTopupBalanceCancelEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToTopupBalanceCancelEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TopupBalanceCancelEvent**](TopupBalanceCancelEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToTopupBalanceCreateEvent"></a>
# **listenToTopupBalanceCreateEvent**
> EventSubscription listenToTopupBalanceCreateEvent(body)

Client listener for entity TopupBalanceCreateEvent

Example of a client listener for receiving the notification TopupBalanceCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
TopupBalanceCreateEvent body = new TopupBalanceCreateEvent(); // TopupBalanceCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToTopupBalanceCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToTopupBalanceCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TopupBalanceCreateEvent**](TopupBalanceCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToTopupBalanceFailureEvent"></a>
# **listenToTopupBalanceFailureEvent**
> EventSubscription listenToTopupBalanceFailureEvent(body)

Client listener for entity TopupBalanceFailureEvent

Example of a client listener for receiving the notification TopupBalanceFailureEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
TopupBalanceFailureEvent body = new TopupBalanceFailureEvent(); // TopupBalanceFailureEvent | The event data
try {
    EventSubscription result = apiInstance.listenToTopupBalanceFailureEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToTopupBalanceFailureEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TopupBalanceFailureEvent**](TopupBalanceFailureEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToTransferBalanceCancelEvent"></a>
# **listenToTransferBalanceCancelEvent**
> EventSubscription listenToTransferBalanceCancelEvent(body)

Client listener for entity TransferBalanceCancelEvent

Example of a client listener for receiving the notification TransferBalanceCancelEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
TransferBalanceCancelEvent body = new TransferBalanceCancelEvent(); // TransferBalanceCancelEvent | The event data
try {
    EventSubscription result = apiInstance.listenToTransferBalanceCancelEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToTransferBalanceCancelEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferBalanceCancelEvent**](TransferBalanceCancelEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToTransferBalanceCreateEvent"></a>
# **listenToTransferBalanceCreateEvent**
> EventSubscription listenToTransferBalanceCreateEvent(body)

Client listener for entity TransferBalanceCreateEvent

Example of a client listener for receiving the notification TransferBalanceCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
TransferBalanceCreateEvent body = new TransferBalanceCreateEvent(); // TransferBalanceCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToTransferBalanceCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToTransferBalanceCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferBalanceCreateEvent**](TransferBalanceCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToTransferBalanceFailureEvent"></a>
# **listenToTransferBalanceFailureEvent**
> EventSubscription listenToTransferBalanceFailureEvent(body)

Client listener for entity TransferBalanceFailureEvent

Example of a client listener for receiving the notification TransferBalanceFailureEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
TransferBalanceFailureEvent body = new TransferBalanceFailureEvent(); // TransferBalanceFailureEvent | The event data
try {
    EventSubscription result = apiInstance.listenToTransferBalanceFailureEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToTransferBalanceFailureEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferBalanceFailureEvent**](TransferBalanceFailureEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

