package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.Error;
import io.swagger.client.model.ReserveBalance;
import io.swagger.client.model.ReserveBalanceCreate;
import io.swagger.client.model.ReserveBalanceUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-06T18:35:09.617630+01:00[Europe/Dublin]")public class ReserveBalanceApi {
  private ApiClient apiClient;

  public ReserveBalanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReserveBalanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a ReserveBalance
   * This operation creates a ReserveBalance entity.
   * @param body The ReserveBalance to be created (required)
   * @return ReserveBalance
   * @throws ApiException if fails to make API call
   */
  public ReserveBalance createReserveBalance(ReserveBalanceCreate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createReserveBalance");
    }
    // create path and map variables
    String localVarPath = "/reserveBalance";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReserveBalance> localVarReturnType = new GenericType<ReserveBalance>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a ReserveBalance
   * This operation deletes a ReserveBalance entity.
   * @param id Identifier of the ReserveBalance (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReserveBalance(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteReserveBalance");
    }
    // create path and map variables
    String localVarPath = "/reserveBalance/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * List or find ReserveBalance objects
   * This operation list or find ReserveBalance entities
   * @param fields Comma-separated properties to be provided in response (optional)
   * @param offset Requested index for start of resources to be provided in response (optional)
   * @param limit Requested number of resources to be provided in response (optional)
   * @return List&lt;ReserveBalance&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ReserveBalance> listReserveBalance(String fields, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/reserveBalance";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));


    final String[] localVarAccepts = {
      "application/json;charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ReserveBalance>> localVarReturnType = new GenericType<List<ReserveBalance>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Updates partially a ReserveBalance
   * This operation updates partially a ReserveBalance entity.
   * @param body The ReserveBalance to be updated (required)
   * @param id Identifier of the ReserveBalance (required)
   * @return ReserveBalance
   * @throws ApiException if fails to make API call
   */
  public ReserveBalance patchReserveBalance(ReserveBalanceUpdate body, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchReserveBalance");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchReserveBalance");
    }
    // create path and map variables
    String localVarPath = "/reserveBalance/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();



    final String[] localVarAccepts = {
      "application/json;charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReserveBalance> localVarReturnType = new GenericType<ReserveBalance>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves a ReserveBalance by ID
   * This operation retrieves a ReserveBalance entity. Attribute selection is enabled for all first level attributes.
   * @param id Identifier of the ReserveBalance (required)
   * @param fields Comma-separated properties to provide in response (optional)
   * @return ReserveBalance
   * @throws ApiException if fails to make API call
   */
  public ReserveBalance retrieveReserveBalance(String id, String fields) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveReserveBalance");
    }
    // create path and map variables
    String localVarPath = "/reserveBalance/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));


    final String[] localVarAccepts = {
      "application/json;charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReserveBalance> localVarReturnType = new GenericType<ReserveBalance>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
