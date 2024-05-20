# BucketApi

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listBucket**](BucketApi.md#listBucket) | **GET** /bucket | List or find Bucket objects
[**retrieveBucket**](BucketApi.md#retrieveBucket) | **GET** /bucket/{id} | Retrieves a Bucket by ID

<a name="listBucket"></a>
# **listBucket**
> List&lt;Bucket&gt; listBucket(fields, offset, limit)

List or find Bucket objects

This operation list or find Bucket entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketApi;


BucketApi apiInstance = new BucketApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<Bucket> result = apiInstance.listBucket(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketApi#listBucket");
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

[**List&lt;Bucket&gt;**](Bucket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="retrieveBucket"></a>
# **retrieveBucket**
> Bucket retrieveBucket(id, fields)

Retrieves a Bucket by ID

This operation retrieves a Bucket entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BucketApi;


BucketApi apiInstance = new BucketApi();
String id = "id_example"; // String | Identifier of the Bucket
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    Bucket result = apiInstance.retrieveBucket(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BucketApi#retrieveBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the Bucket |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**Bucket**](Bucket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

