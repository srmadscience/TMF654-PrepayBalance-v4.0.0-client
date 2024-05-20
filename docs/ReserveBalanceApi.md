# ReserveBalanceApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReserveBalance**](ReserveBalanceApi.md#createReserveBalance) | **POST** /reserveBalance | Creates a ReserveBalance
[**deleteReserveBalance**](ReserveBalanceApi.md#deleteReserveBalance) | **DELETE** /reserveBalance/{id} | Deletes a ReserveBalance
[**listReserveBalance**](ReserveBalanceApi.md#listReserveBalance) | **GET** /reserveBalance | List or find ReserveBalance objects
[**patchReserveBalance**](ReserveBalanceApi.md#patchReserveBalance) | **PATCH** /reserveBalance/{id} | Updates partially a ReserveBalance
[**retrieveReserveBalance**](ReserveBalanceApi.md#retrieveReserveBalance) | **GET** /reserveBalance/{id} | Retrieves a ReserveBalance by ID

<a name="createReserveBalance"></a>
# **createReserveBalance**
> ReserveBalance createReserveBalance(body)

Creates a ReserveBalance

This operation creates a ReserveBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReserveBalanceApi;


ReserveBalanceApi apiInstance = new ReserveBalanceApi();
ReserveBalanceCreate body = new ReserveBalanceCreate(); // ReserveBalanceCreate | The ReserveBalance to be created
try {
    ReserveBalance result = apiInstance.createReserveBalance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReserveBalanceApi#createReserveBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReserveBalanceCreate**](ReserveBalanceCreate.md)| The ReserveBalance to be created |

### Return type

[**ReserveBalance**](ReserveBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteReserveBalance"></a>
# **deleteReserveBalance**
> deleteReserveBalance(id)

Deletes a ReserveBalance

This operation deletes a ReserveBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReserveBalanceApi;


ReserveBalanceApi apiInstance = new ReserveBalanceApi();
String id = "id_example"; // String | Identifier of the ReserveBalance
try {
    apiInstance.deleteReserveBalance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ReserveBalanceApi#deleteReserveBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ReserveBalance |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listReserveBalance"></a>
# **listReserveBalance**
> List&lt;ReserveBalance&gt; listReserveBalance(fields, offset, limit)

List or find ReserveBalance objects

This operation list or find ReserveBalance entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReserveBalanceApi;


ReserveBalanceApi apiInstance = new ReserveBalanceApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<ReserveBalance> result = apiInstance.listReserveBalance(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReserveBalanceApi#listReserveBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;ReserveBalance&gt;**](ReserveBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchReserveBalance"></a>
# **patchReserveBalance**
> ReserveBalance patchReserveBalance(body, id)

Updates partially a ReserveBalance

This operation updates partially a ReserveBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReserveBalanceApi;


ReserveBalanceApi apiInstance = new ReserveBalanceApi();
ReserveBalanceUpdate body = new ReserveBalanceUpdate(); // ReserveBalanceUpdate | The ReserveBalance to be updated
String id = "id_example"; // String | Identifier of the ReserveBalance
try {
    ReserveBalance result = apiInstance.patchReserveBalance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReserveBalanceApi#patchReserveBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReserveBalanceUpdate**](ReserveBalanceUpdate.md)| The ReserveBalance to be updated |
 **id** | **String**| Identifier of the ReserveBalance |

### Return type

[**ReserveBalance**](ReserveBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveReserveBalance"></a>
# **retrieveReserveBalance**
> ReserveBalance retrieveReserveBalance(id, fields)

Retrieves a ReserveBalance by ID

This operation retrieves a ReserveBalance entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReserveBalanceApi;


ReserveBalanceApi apiInstance = new ReserveBalanceApi();
String id = "id_example"; // String | Identifier of the ReserveBalance
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    ReserveBalance result = apiInstance.retrieveReserveBalance(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReserveBalanceApi#retrieveReserveBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ReserveBalance |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**ReserveBalance**](ReserveBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

