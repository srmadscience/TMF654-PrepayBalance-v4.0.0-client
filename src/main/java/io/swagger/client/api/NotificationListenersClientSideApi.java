package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.AdjustBalanceCancelEvent;
import io.swagger.client.model.AdjustBalanceCreateEvent;
import io.swagger.client.model.AdjustBalanceFailureEvent;
import io.swagger.client.model.Error;
import io.swagger.client.model.EventSubscription;
import io.swagger.client.model.ReserveBalanceCancelEvent;
import io.swagger.client.model.ReserveBalanceCreateEvent;
import io.swagger.client.model.ReserveBalanceFailureEvent;
import io.swagger.client.model.TopupBalanceCancelEvent;
import io.swagger.client.model.TopupBalanceCreateEvent;
import io.swagger.client.model.TopupBalanceFailureEvent;
import io.swagger.client.model.TransferBalanceCancelEvent;
import io.swagger.client.model.TransferBalanceCreateEvent;
import io.swagger.client.model.TransferBalanceFailureEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-06T18:35:09.617630+01:00[Europe/Dublin]")public class NotificationListenersClientSideApi {
  private ApiClient apiClient;

  public NotificationListenersClientSideApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationListenersClientSideApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Client listener for entity AdjustBalanceCancelEvent
   * Example of a client listener for receiving the notification AdjustBalanceCancelEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToAdjustBalanceCancelEvent(AdjustBalanceCancelEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToAdjustBalanceCancelEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/adjustBalanceCancelEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity AdjustBalanceCreateEvent
   * Example of a client listener for receiving the notification AdjustBalanceCreateEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToAdjustBalanceCreateEvent(AdjustBalanceCreateEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToAdjustBalanceCreateEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/adjustBalanceCreateEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity AdjustBalanceFailureEvent
   * Example of a client listener for receiving the notification AdjustBalanceFailureEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToAdjustBalanceFailureEvent(AdjustBalanceFailureEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToAdjustBalanceFailureEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/adjustBalanceFailureEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity ReserveBalanceCancelEvent
   * Example of a client listener for receiving the notification ReserveBalanceCancelEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToReserveBalanceCancelEvent(ReserveBalanceCancelEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToReserveBalanceCancelEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/reserveBalanceCancelEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity ReserveBalanceCreateEvent
   * Example of a client listener for receiving the notification ReserveBalanceCreateEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToReserveBalanceCreateEvent(ReserveBalanceCreateEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToReserveBalanceCreateEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/reserveBalanceCreateEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity ReserveBalanceFailureEvent
   * Example of a client listener for receiving the notification ReserveBalanceFailureEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToReserveBalanceFailureEvent(ReserveBalanceFailureEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToReserveBalanceFailureEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/reserveBalanceFailureEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity TopupBalanceCancelEvent
   * Example of a client listener for receiving the notification TopupBalanceCancelEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToTopupBalanceCancelEvent(TopupBalanceCancelEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToTopupBalanceCancelEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/topupBalanceCancelEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity TopupBalanceCreateEvent
   * Example of a client listener for receiving the notification TopupBalanceCreateEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToTopupBalanceCreateEvent(TopupBalanceCreateEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToTopupBalanceCreateEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/topupBalanceCreateEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity TopupBalanceFailureEvent
   * Example of a client listener for receiving the notification TopupBalanceFailureEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToTopupBalanceFailureEvent(TopupBalanceFailureEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToTopupBalanceFailureEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/topupBalanceFailureEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity TransferBalanceCancelEvent
   * Example of a client listener for receiving the notification TransferBalanceCancelEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToTransferBalanceCancelEvent(TransferBalanceCancelEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToTransferBalanceCancelEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/transferBalanceCancelEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity TransferBalanceCreateEvent
   * Example of a client listener for receiving the notification TransferBalanceCreateEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToTransferBalanceCreateEvent(TransferBalanceCreateEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToTransferBalanceCreateEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/transferBalanceCreateEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Client listener for entity TransferBalanceFailureEvent
   * Example of a client listener for receiving the notification TransferBalanceFailureEvent
   * @param body The event data (required)
   * @return EventSubscription
   * @throws ApiException if fails to make API call
   */
  public EventSubscription listenToTransferBalanceFailureEvent(TransferBalanceFailureEvent body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling listenToTransferBalanceFailureEvent");
    }
    // create path and map variables
    String localVarPath = "/listener/transferBalanceFailureEvent";

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

    GenericType<EventSubscription> localVarReturnType = new GenericType<EventSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
