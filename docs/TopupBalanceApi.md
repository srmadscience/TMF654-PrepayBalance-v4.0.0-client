# TopupBalanceApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTopupBalance**](TopupBalanceApi.md#createTopupBalance) | **POST** /topupBalance | Creates a TopupBalance
[**deleteTopupBalance**](TopupBalanceApi.md#deleteTopupBalance) | **DELETE** /topupBalance/{id} | Deletes a TopupBalance
[**listTopupBalance**](TopupBalanceApi.md#listTopupBalance) | **GET** /topupBalance | List or find TopupBalance objects
[**patchTopupBalance**](TopupBalanceApi.md#patchTopupBalance) | **PATCH** /topupBalance/{id} | Updates partially a TopupBalance
[**retrieveTopupBalance**](TopupBalanceApi.md#retrieveTopupBalance) | **GET** /topupBalance/{id} | Retrieves a TopupBalance by ID

<a name="createTopupBalance"></a>
# **createTopupBalance**
> TopupBalance createTopupBalance(body)

Creates a TopupBalance

This operation creates a TopupBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TopupBalanceApi;


TopupBalanceApi apiInstance = new TopupBalanceApi();
TopupBalanceCreate body = new TopupBalanceCreate(); // TopupBalanceCreate | The TopupBalance to be created
try {
    TopupBalance result = apiInstance.createTopupBalance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopupBalanceApi#createTopupBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TopupBalanceCreate**](TopupBalanceCreate.md)| The TopupBalance to be created |

### Return type

[**TopupBalance**](TopupBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteTopupBalance"></a>
# **deleteTopupBalance**
> deleteTopupBalance(id)

Deletes a TopupBalance

This operation deletes a TopupBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TopupBalanceApi;


TopupBalanceApi apiInstance = new TopupBalanceApi();
String id = "id_example"; // String | Identifier of the TopupBalance
try {
    apiInstance.deleteTopupBalance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TopupBalanceApi#deleteTopupBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the TopupBalance |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listTopupBalance"></a>
# **listTopupBalance**
> List&lt;TopupBalance&gt; listTopupBalance(fields, offset, limit)

List or find TopupBalance objects

This operation list or find TopupBalance entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TopupBalanceApi;


TopupBalanceApi apiInstance = new TopupBalanceApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<TopupBalance> result = apiInstance.listTopupBalance(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopupBalanceApi#listTopupBalance");
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

[**List&lt;TopupBalance&gt;**](TopupBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchTopupBalance"></a>
# **patchTopupBalance**
> TopupBalance patchTopupBalance(body, id)

Updates partially a TopupBalance

This operation updates partially a TopupBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TopupBalanceApi;


TopupBalanceApi apiInstance = new TopupBalanceApi();
TopupBalanceUpdate body = new TopupBalanceUpdate(); // TopupBalanceUpdate | The TopupBalance to be updated
String id = "id_example"; // String | Identifier of the TopupBalance
try {
    TopupBalance result = apiInstance.patchTopupBalance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopupBalanceApi#patchTopupBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TopupBalanceUpdate**](TopupBalanceUpdate.md)| The TopupBalance to be updated |
 **id** | **String**| Identifier of the TopupBalance |

### Return type

[**TopupBalance**](TopupBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveTopupBalance"></a>
# **retrieveTopupBalance**
> TopupBalance retrieveTopupBalance(id, fields)

Retrieves a TopupBalance by ID

This operation retrieves a TopupBalance entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TopupBalanceApi;


TopupBalanceApi apiInstance = new TopupBalanceApi();
String id = "id_example"; // String | Identifier of the TopupBalance
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    TopupBalance result = apiInstance.retrieveTopupBalance(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TopupBalanceApi#retrieveTopupBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the TopupBalance |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**TopupBalance**](TopupBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

