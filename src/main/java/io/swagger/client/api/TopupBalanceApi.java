package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.Error;
import io.swagger.client.model.TopupBalance;
import io.swagger.client.model.TopupBalanceCreate;
import io.swagger.client.model.TopupBalanceUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-06T18:35:09.617630+01:00[Europe/Dublin]")public class TopupBalanceApi {
  private ApiClient apiClient;

  public TopupBalanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TopupBalanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a TopupBalance
   * This operation creates a TopupBalance entity.
   * @param body The TopupBalance to be created (required)
   * @return TopupBalance
   * @throws ApiException if fails to make API call
   */
  public TopupBalance createTopupBalance(TopupBalanceCreate body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTopupBalance");
    }
    // create path and map variables
    String localVarPath = "/topupBalance";

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

    GenericType<TopupBalance> localVarReturnType = new GenericType<TopupBalance>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Deletes a TopupBalance
   * This operation deletes a TopupBalance entity.
   * @param id Identifier of the TopupBalance (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTopupBalance(String id) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTopupBalance");
    }
    // create path and map variables
    String localVarPath = "/topupBalance/{id}"
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
   * List or find TopupBalance objects
   * This operation list or find TopupBalance entities
   * @param fields Comma-separated properties to be provided in response (optional)
   * @param offset Requested index for start of resources to be provided in response (optional)
   * @param limit Requested number of resources to be provided in response (optional)
   * @return List&lt;TopupBalance&gt;
   * @throws ApiException if fails to make API call
   */
  public List<TopupBalance> listTopupBalance(String fields, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/topupBalance";

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

    GenericType<List<TopupBalance>> localVarReturnType = new GenericType<List<TopupBalance>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Updates partially a TopupBalance
   * This operation updates partially a TopupBalance entity.
   * @param body The TopupBalance to be updated (required)
   * @param id Identifier of the TopupBalance (required)
   * @return TopupBalance
   * @throws ApiException if fails to make API call
   */
  public TopupBalance patchTopupBalance(TopupBalanceUpdate body, String id) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchTopupBalance");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchTopupBalance");
    }
    // create path and map variables
    String localVarPath = "/topupBalance/{id}"
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

    GenericType<TopupBalance> localVarReturnType = new GenericType<TopupBalance>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Retrieves a TopupBalance by ID
   * This operation retrieves a TopupBalance entity. Attribute selection is enabled for all first level attributes.
   * @param id Identifier of the TopupBalance (required)
   * @param fields Comma-separated properties to provide in response (optional)
   * @return TopupBalance
   * @throws ApiException if fails to make API call
   */
  public TopupBalance retrieveTopupBalance(String id, String fields) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveTopupBalance");
    }
    // create path and map variables
    String localVarPath = "/topupBalance/{id}"
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

    GenericType<TopupBalance> localVarReturnType = new GenericType<TopupBalance>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
