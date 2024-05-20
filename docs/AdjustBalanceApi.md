# AdjustBalanceApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdjustBalance**](AdjustBalanceApi.md#createAdjustBalance) | **POST** /adjustBalance | Creates a AdjustBalance
[**deleteAdjustBalance**](AdjustBalanceApi.md#deleteAdjustBalance) | **DELETE** /adjustBalance/{id} | Deletes a AdjustBalance
[**listAdjustBalance**](AdjustBalanceApi.md#listAdjustBalance) | **GET** /adjustBalance | List or find AdjustBalance objects
[**patchAdjustBalance**](AdjustBalanceApi.md#patchAdjustBalance) | **PATCH** /adjustBalance/{id} | Updates partially a AdjustBalance
[**retrieveAdjustBalance**](AdjustBalanceApi.md#retrieveAdjustBalance) | **GET** /adjustBalance/{id} | Retrieves a AdjustBalance by ID

<a name="createAdjustBalance"></a>
# **createAdjustBalance**
> AdjustBalance createAdjustBalance(body)

Creates a AdjustBalance

This operation creates a AdjustBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdjustBalanceApi;


AdjustBalanceApi apiInstance = new AdjustBalanceApi();
AdjustBalanceCreate body = new AdjustBalanceCreate(); // AdjustBalanceCreate | The AdjustBalance to be created
try {
    AdjustBalance result = apiInstance.createAdjustBalance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustBalanceApi#createAdjustBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdjustBalanceCreate**](AdjustBalanceCreate.md)| The AdjustBalance to be created |

### Return type

[**AdjustBalance**](AdjustBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteAdjustBalance"></a>
# **deleteAdjustBalance**
> deleteAdjustBalance(id)

Deletes a AdjustBalance

This operation deletes a AdjustBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdjustBalanceApi;


AdjustBalanceApi apiInstance = new AdjustBalanceApi();
String id = "id_example"; // String | Identifier of the AdjustBalance
try {
    apiInstance.deleteAdjustBalance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustBalanceApi#deleteAdjustBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the AdjustBalance |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listAdjustBalance"></a>
# **listAdjustBalance**
> List&lt;AdjustBalance&gt; listAdjustBalance(fields, offset, limit)

List or find AdjustBalance objects

This operation list or find AdjustBalance entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdjustBalanceApi;


AdjustBalanceApi apiInstance = new AdjustBalanceApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<AdjustBalance> result = apiInstance.listAdjustBalance(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustBalanceApi#listAdjustBalance");
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

[**List&lt;AdjustBalance&gt;**](AdjustBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchAdjustBalance"></a>
# **patchAdjustBalance**
> AdjustBalance patchAdjustBalance(body, id)

Updates partially a AdjustBalance

This operation updates partially a AdjustBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdjustBalanceApi;


AdjustBalanceApi apiInstance = new AdjustBalanceApi();
AdjustBalanceUpdate body = new AdjustBalanceUpdate(); // AdjustBalanceUpdate | The AdjustBalance to be updated
String id = "id_example"; // String | Identifier of the AdjustBalance
try {
    AdjustBalance result = apiInstance.patchAdjustBalance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustBalanceApi#patchAdjustBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdjustBalanceUpdate**](AdjustBalanceUpdate.md)| The AdjustBalance to be updated |
 **id** | **String**| Identifier of the AdjustBalance |

### Return type

[**AdjustBalance**](AdjustBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveAdjustBalance"></a>
# **retrieveAdjustBalance**
> AdjustBalance retrieveAdjustBalance(id, fields)

Retrieves a AdjustBalance by ID

This operation retrieves a AdjustBalance entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdjustBalanceApi;


AdjustBalanceApi apiInstance = new AdjustBalanceApi();
String id = "id_example"; // String | Identifier of the AdjustBalance
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    AdjustBalance result = apiInstance.retrieveAdjustBalance(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustBalanceApi#retrieveAdjustBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the AdjustBalance |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**AdjustBalance**](AdjustBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

