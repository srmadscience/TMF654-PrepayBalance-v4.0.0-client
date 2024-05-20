# AccumulatedBalanceApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAccumulatedBalance**](AccumulatedBalanceApi.md#listAccumulatedBalance) | **GET** /accumulatedBalance | List or find AccumulatedBalance objects
[**retrieveAccumulatedBalance**](AccumulatedBalanceApi.md#retrieveAccumulatedBalance) | **GET** /accumulatedBalance/{id} | Retrieves a AccumulatedBalance by ID

<a name="listAccumulatedBalance"></a>
# **listAccumulatedBalance**
> List&lt;AccumulatedBalance&gt; listAccumulatedBalance(fields, offset, limit)

List or find AccumulatedBalance objects

This operation list or find AccumulatedBalance entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccumulatedBalanceApi;


AccumulatedBalanceApi apiInstance = new AccumulatedBalanceApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<AccumulatedBalance> result = apiInstance.listAccumulatedBalance(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccumulatedBalanceApi#listAccumulatedBalance");
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

[**List&lt;AccumulatedBalance&gt;**](AccumulatedBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveAccumulatedBalance"></a>
# **retrieveAccumulatedBalance**
> AccumulatedBalance retrieveAccumulatedBalance(id, fields)

Retrieves a AccumulatedBalance by ID

This operation retrieves a AccumulatedBalance entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccumulatedBalanceApi;


AccumulatedBalanceApi apiInstance = new AccumulatedBalanceApi();
String id = "id_example"; // String | Identifier of the AccumulatedBalance
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    AccumulatedBalance result = apiInstance.retrieveAccumulatedBalance(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccumulatedBalanceApi#retrieveAccumulatedBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the AccumulatedBalance |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**AccumulatedBalance**](AccumulatedBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

