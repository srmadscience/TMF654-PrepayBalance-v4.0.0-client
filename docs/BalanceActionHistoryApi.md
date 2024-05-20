# BalanceActionHistoryApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listBalanceActionHistory**](BalanceActionHistoryApi.md#listBalanceActionHistory) | **GET** /balanceActionHistory | List or find BalanceActionHistory objects
[**retrieveBalanceActionHistory**](BalanceActionHistoryApi.md#retrieveBalanceActionHistory) | **GET** /balanceActionHistory/{id} | Retrieves a BalanceActionHistory by ID

<a name="listBalanceActionHistory"></a>
# **listBalanceActionHistory**
> List&lt;BalanceActionHistory&gt; listBalanceActionHistory(fields, offset, limit)

List or find BalanceActionHistory objects

This operation list or find BalanceActionHistory entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BalanceActionHistoryApi;


BalanceActionHistoryApi apiInstance = new BalanceActionHistoryApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<BalanceActionHistory> result = apiInstance.listBalanceActionHistory(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceActionHistoryApi#listBalanceActionHistory");
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

[**List&lt;BalanceActionHistory&gt;**](BalanceActionHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveBalanceActionHistory"></a>
# **retrieveBalanceActionHistory**
> BalanceActionHistory retrieveBalanceActionHistory(id, fields)

Retrieves a BalanceActionHistory by ID

This operation retrieves a BalanceActionHistory entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BalanceActionHistoryApi;


BalanceActionHistoryApi apiInstance = new BalanceActionHistoryApi();
String id = "id_example"; // String | Identifier of the BalanceActionHistory
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    BalanceActionHistory result = apiInstance.retrieveBalanceActionHistory(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceActionHistoryApi#retrieveBalanceActionHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BalanceActionHistory |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**BalanceActionHistory**](BalanceActionHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

