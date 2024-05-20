# TransferBalanceApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransferBalance**](TransferBalanceApi.md#createTransferBalance) | **POST** /transferBalance | Creates a TransferBalance
[**deleteTransferBalance**](TransferBalanceApi.md#deleteTransferBalance) | **DELETE** /transferBalance/{id} | Deletes a TransferBalance
[**listTransferBalance**](TransferBalanceApi.md#listTransferBalance) | **GET** /transferBalance | List or find TransferBalance objects
[**patchTransferBalance**](TransferBalanceApi.md#patchTransferBalance) | **PATCH** /transferBalance/{id} | Updates partially a TransferBalance
[**retrieveTransferBalance**](TransferBalanceApi.md#retrieveTransferBalance) | **GET** /transferBalance/{id} | Retrieves a TransferBalance by ID

<a name="createTransferBalance"></a>
# **createTransferBalance**
> TransferBalance createTransferBalance(body)

Creates a TransferBalance

This operation creates a TransferBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransferBalanceApi;


TransferBalanceApi apiInstance = new TransferBalanceApi();
TransferBalanceCreate body = new TransferBalanceCreate(); // TransferBalanceCreate | The TransferBalance to be created
try {
    TransferBalance result = apiInstance.createTransferBalance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferBalanceApi#createTransferBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferBalanceCreate**](TransferBalanceCreate.md)| The TransferBalance to be created |

### Return type

[**TransferBalance**](TransferBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteTransferBalance"></a>
# **deleteTransferBalance**
> deleteTransferBalance(id)

Deletes a TransferBalance

This operation deletes a TransferBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransferBalanceApi;


TransferBalanceApi apiInstance = new TransferBalanceApi();
String id = "id_example"; // String | Identifier of the TransferBalance
try {
    apiInstance.deleteTransferBalance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferBalanceApi#deleteTransferBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the TransferBalance |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listTransferBalance"></a>
# **listTransferBalance**
> List&lt;TransferBalance&gt; listTransferBalance(fields, offset, limit)

List or find TransferBalance objects

This operation list or find TransferBalance entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransferBalanceApi;


TransferBalanceApi apiInstance = new TransferBalanceApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<TransferBalance> result = apiInstance.listTransferBalance(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferBalanceApi#listTransferBalance");
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

[**List&lt;TransferBalance&gt;**](TransferBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchTransferBalance"></a>
# **patchTransferBalance**
> TransferBalance patchTransferBalance(body, id)

Updates partially a TransferBalance

This operation updates partially a TransferBalance entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransferBalanceApi;


TransferBalanceApi apiInstance = new TransferBalanceApi();
TransferBalanceUpdate body = new TransferBalanceUpdate(); // TransferBalanceUpdate | The TransferBalance to be updated
String id = "id_example"; // String | Identifier of the TransferBalance
try {
    TransferBalance result = apiInstance.patchTransferBalance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferBalanceApi#patchTransferBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferBalanceUpdate**](TransferBalanceUpdate.md)| The TransferBalance to be updated |
 **id** | **String**| Identifier of the TransferBalance |

### Return type

[**TransferBalance**](TransferBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveTransferBalance"></a>
# **retrieveTransferBalance**
> TransferBalance retrieveTransferBalance(id, fields)

Retrieves a TransferBalance by ID

This operation retrieves a TransferBalance entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransferBalanceApi;


TransferBalanceApi apiInstance = new TransferBalanceApi();
String id = "id_example"; // String | Identifier of the TransferBalance
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    TransferBalance result = apiInstance.retrieveTransferBalance(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferBalanceApi#retrieveTransferBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the TransferBalance |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**TransferBalance**](TransferBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

