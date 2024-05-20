# swagger-java-client

Prepay Balance Management
- API version: 4.0.0
  - Build date: 2023-10-06T18:35:09.617630+01:00[Europe/Dublin]

## TMF API Reference: TMF654 - Prepay Balance Management  ### Draft : 19.5 - January 2020  The Prepay Balance Management API enables consumers to manage the balance, recharge (top-up), transfer, reserve, unreserve, deduct and balance adjustments of a  bucket. A bucket is understood in the context of this API to be an entity that keeps track of the balance available to use services. Every bucket will measure balance in different units, it can be monetary or non-monetary (e.g.: number of sms that are available, number of GB of data available, …)  ### Resources - Bucket - TopupBalance - AdjustBalance - TransferBalance - ReserveBalance - AccumulatedBalance - BalanceActionHistory  ### Operations - Retrieve the balance information on a bucket for a given product (individual or aggregated). - Retrieve the list of balance-related operations performed over a given product - Retrieve information about all the top-up operations stored in the server filtered by some criteria. - Perform a new top up operation (recharge) - Retrieve detailed information about a top-up operation previously processed by the server. - Retrieve the current and historic status information about a top-up operation previously processed by the server. - Perform a new transfer operation - Retrieve information about all the transfer operations stored in the server filtered by some criteria - Retrieve detailed information about a transfer operation previously processed by the server - Retrieve the current and historic status information about a transfer operation previously processed by the server. - Retrieve information about all the adjustments stored in the server filtered by some criteria. - Perform a new adjustment operation - Retrieve detailed information about a balance adjustment operation previously processed by the server - Reserve a balance on a bucket. - Unreserve a balance on a bucket. - Retrieve aggregated (accumulative) balances for a bucket.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccumulatedBalanceApi;

import java.io.File;
import java.util.*;

public class AccumulatedBalanceApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccumulatedBalanceApi;

import java.io.File;
import java.util.*;

public class AccumulatedBalanceApiExample {

    public static void main(String[] args) {
        
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://serverRoot/tmf-api/prepayBalanceManagement/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccumulatedBalanceApi* | [**listAccumulatedBalance**](docs/AccumulatedBalanceApi.md#listAccumulatedBalance) | **GET** /accumulatedBalance | List or find AccumulatedBalance objects
*AccumulatedBalanceApi* | [**retrieveAccumulatedBalance**](docs/AccumulatedBalanceApi.md#retrieveAccumulatedBalance) | **GET** /accumulatedBalance/{id} | Retrieves a AccumulatedBalance by ID
*AdjustBalanceApi* | [**createAdjustBalance**](docs/AdjustBalanceApi.md#createAdjustBalance) | **POST** /adjustBalance | Creates a AdjustBalance
*AdjustBalanceApi* | [**deleteAdjustBalance**](docs/AdjustBalanceApi.md#deleteAdjustBalance) | **DELETE** /adjustBalance/{id} | Deletes a AdjustBalance
*AdjustBalanceApi* | [**listAdjustBalance**](docs/AdjustBalanceApi.md#listAdjustBalance) | **GET** /adjustBalance | List or find AdjustBalance objects
*AdjustBalanceApi* | [**patchAdjustBalance**](docs/AdjustBalanceApi.md#patchAdjustBalance) | **PATCH** /adjustBalance/{id} | Updates partially a AdjustBalance
*AdjustBalanceApi* | [**retrieveAdjustBalance**](docs/AdjustBalanceApi.md#retrieveAdjustBalance) | **GET** /adjustBalance/{id} | Retrieves a AdjustBalance by ID
*BalanceActionHistoryApi* | [**listBalanceActionHistory**](docs/BalanceActionHistoryApi.md#listBalanceActionHistory) | **GET** /balanceActionHistory | List or find BalanceActionHistory objects
*BalanceActionHistoryApi* | [**retrieveBalanceActionHistory**](docs/BalanceActionHistoryApi.md#retrieveBalanceActionHistory) | **GET** /balanceActionHistory/{id} | Retrieves a BalanceActionHistory by ID
*BucketApi* | [**listBucket**](docs/BucketApi.md#listBucket) | **GET** /bucket | List or find Bucket objects
*BucketApi* | [**retrieveBucket**](docs/BucketApi.md#retrieveBucket) | **GET** /bucket/{id} | Retrieves a Bucket by ID
*EventsSubscriptionApi* | [**registerListener**](docs/EventsSubscriptionApi.md#registerListener) | **POST** /hub | Register a listener
*EventsSubscriptionApi* | [**unregisterListener**](docs/EventsSubscriptionApi.md#unregisterListener) | **DELETE** /hub/{id} | Unregister a listener
*NotificationListenersClientSideApi* | [**listenToAdjustBalanceCancelEvent**](docs/NotificationListenersClientSideApi.md#listenToAdjustBalanceCancelEvent) | **POST** /listener/adjustBalanceCancelEvent | Client listener for entity AdjustBalanceCancelEvent
*NotificationListenersClientSideApi* | [**listenToAdjustBalanceCreateEvent**](docs/NotificationListenersClientSideApi.md#listenToAdjustBalanceCreateEvent) | **POST** /listener/adjustBalanceCreateEvent | Client listener for entity AdjustBalanceCreateEvent
*NotificationListenersClientSideApi* | [**listenToAdjustBalanceFailureEvent**](docs/NotificationListenersClientSideApi.md#listenToAdjustBalanceFailureEvent) | **POST** /listener/adjustBalanceFailureEvent | Client listener for entity AdjustBalanceFailureEvent
*NotificationListenersClientSideApi* | [**listenToReserveBalanceCancelEvent**](docs/NotificationListenersClientSideApi.md#listenToReserveBalanceCancelEvent) | **POST** /listener/reserveBalanceCancelEvent | Client listener for entity ReserveBalanceCancelEvent
*NotificationListenersClientSideApi* | [**listenToReserveBalanceCreateEvent**](docs/NotificationListenersClientSideApi.md#listenToReserveBalanceCreateEvent) | **POST** /listener/reserveBalanceCreateEvent | Client listener for entity ReserveBalanceCreateEvent
*NotificationListenersClientSideApi* | [**listenToReserveBalanceFailureEvent**](docs/NotificationListenersClientSideApi.md#listenToReserveBalanceFailureEvent) | **POST** /listener/reserveBalanceFailureEvent | Client listener for entity ReserveBalanceFailureEvent
*NotificationListenersClientSideApi* | [**listenToTopupBalanceCancelEvent**](docs/NotificationListenersClientSideApi.md#listenToTopupBalanceCancelEvent) | **POST** /listener/topupBalanceCancelEvent | Client listener for entity TopupBalanceCancelEvent
*NotificationListenersClientSideApi* | [**listenToTopupBalanceCreateEvent**](docs/NotificationListenersClientSideApi.md#listenToTopupBalanceCreateEvent) | **POST** /listener/topupBalanceCreateEvent | Client listener for entity TopupBalanceCreateEvent
*NotificationListenersClientSideApi* | [**listenToTopupBalanceFailureEvent**](docs/NotificationListenersClientSideApi.md#listenToTopupBalanceFailureEvent) | **POST** /listener/topupBalanceFailureEvent | Client listener for entity TopupBalanceFailureEvent
*NotificationListenersClientSideApi* | [**listenToTransferBalanceCancelEvent**](docs/NotificationListenersClientSideApi.md#listenToTransferBalanceCancelEvent) | **POST** /listener/transferBalanceCancelEvent | Client listener for entity TransferBalanceCancelEvent
*NotificationListenersClientSideApi* | [**listenToTransferBalanceCreateEvent**](docs/NotificationListenersClientSideApi.md#listenToTransferBalanceCreateEvent) | **POST** /listener/transferBalanceCreateEvent | Client listener for entity TransferBalanceCreateEvent
*NotificationListenersClientSideApi* | [**listenToTransferBalanceFailureEvent**](docs/NotificationListenersClientSideApi.md#listenToTransferBalanceFailureEvent) | **POST** /listener/transferBalanceFailureEvent | Client listener for entity TransferBalanceFailureEvent
*ReserveBalanceApi* | [**createReserveBalance**](docs/ReserveBalanceApi.md#createReserveBalance) | **POST** /reserveBalance | Creates a ReserveBalance
*ReserveBalanceApi* | [**deleteReserveBalance**](docs/ReserveBalanceApi.md#deleteReserveBalance) | **DELETE** /reserveBalance/{id} | Deletes a ReserveBalance
*ReserveBalanceApi* | [**listReserveBalance**](docs/ReserveBalanceApi.md#listReserveBalance) | **GET** /reserveBalance | List or find ReserveBalance objects
*ReserveBalanceApi* | [**patchReserveBalance**](docs/ReserveBalanceApi.md#patchReserveBalance) | **PATCH** /reserveBalance/{id} | Updates partially a ReserveBalance
*ReserveBalanceApi* | [**retrieveReserveBalance**](docs/ReserveBalanceApi.md#retrieveReserveBalance) | **GET** /reserveBalance/{id} | Retrieves a ReserveBalance by ID
*TopupBalanceApi* | [**createTopupBalance**](docs/TopupBalanceApi.md#createTopupBalance) | **POST** /topupBalance | Creates a TopupBalance
*TopupBalanceApi* | [**deleteTopupBalance**](docs/TopupBalanceApi.md#deleteTopupBalance) | **DELETE** /topupBalance/{id} | Deletes a TopupBalance
*TopupBalanceApi* | [**listTopupBalance**](docs/TopupBalanceApi.md#listTopupBalance) | **GET** /topupBalance | List or find TopupBalance objects
*TopupBalanceApi* | [**patchTopupBalance**](docs/TopupBalanceApi.md#patchTopupBalance) | **PATCH** /topupBalance/{id} | Updates partially a TopupBalance
*TopupBalanceApi* | [**retrieveTopupBalance**](docs/TopupBalanceApi.md#retrieveTopupBalance) | **GET** /topupBalance/{id} | Retrieves a TopupBalance by ID
*TransferBalanceApi* | [**createTransferBalance**](docs/TransferBalanceApi.md#createTransferBalance) | **POST** /transferBalance | Creates a TransferBalance
*TransferBalanceApi* | [**deleteTransferBalance**](docs/TransferBalanceApi.md#deleteTransferBalance) | **DELETE** /transferBalance/{id} | Deletes a TransferBalance
*TransferBalanceApi* | [**listTransferBalance**](docs/TransferBalanceApi.md#listTransferBalance) | **GET** /transferBalance | List or find TransferBalance objects
*TransferBalanceApi* | [**patchTransferBalance**](docs/TransferBalanceApi.md#patchTransferBalance) | **PATCH** /transferBalance/{id} | Updates partially a TransferBalance
*TransferBalanceApi* | [**retrieveTransferBalance**](docs/TransferBalanceApi.md#retrieveTransferBalance) | **GET** /transferBalance/{id} | Retrieves a TransferBalance by ID

## Documentation for Models

 - [AccumulatedBalance](docs/AccumulatedBalance.md)
 - [Action](docs/Action.md)
 - [ActionStatusType](docs/ActionStatusType.md)
 - [Addressable](docs/Addressable.md)
 - [AdjustBalance](docs/AdjustBalance.md)
 - [AdjustBalanceCancelEvent](docs/AdjustBalanceCancelEvent.md)
 - [AdjustBalanceCancelEventPayload](docs/AdjustBalanceCancelEventPayload.md)
 - [AdjustBalanceCreate](docs/AdjustBalanceCreate.md)
 - [AdjustBalanceCreateEvent](docs/AdjustBalanceCreateEvent.md)
 - [AdjustBalanceCreateEventPayload](docs/AdjustBalanceCreateEventPayload.md)
 - [AdjustBalanceFailureEvent](docs/AdjustBalanceFailureEvent.md)
 - [AdjustBalanceFailureEventPayload](docs/AdjustBalanceFailureEventPayload.md)
 - [AdjustBalanceUpdate](docs/AdjustBalanceUpdate.md)
 - [AdjustType](docs/AdjustType.md)
 - [BalanceActionHistory](docs/BalanceActionHistory.md)
 - [Bucket](docs/Bucket.md)
 - [BucketRef](docs/BucketRef.md)
 - [BucketStatusType](docs/BucketStatusType.md)
 - [ChannelRef](docs/ChannelRef.md)
 - [CostOwnerType](docs/CostOwnerType.md)
 - [EntityRef](docs/EntityRef.md)
 - [Error](docs/Error.md)
 - [EventSubscription](docs/EventSubscription.md)
 - [EventSubscriptionInput](docs/EventSubscriptionInput.md)
 - [Extensible](docs/Extensible.md)
 - [LogicalResourceRef](docs/LogicalResourceRef.md)
 - [Money](docs/Money.md)
 - [PartyAccountRef](docs/PartyAccountRef.md)
 - [PaymentMethodRef](docs/PaymentMethodRef.md)
 - [ProductRef](docs/ProductRef.md)
 - [Quantity](docs/Quantity.md)
 - [RecurringPeriodType](docs/RecurringPeriodType.md)
 - [RelatedParty](docs/RelatedParty.md)
 - [RelatedTopupBalance](docs/RelatedTopupBalance.md)
 - [ReserveBalance](docs/ReserveBalance.md)
 - [ReserveBalanceCancelEvent](docs/ReserveBalanceCancelEvent.md)
 - [ReserveBalanceCancelEventPayload](docs/ReserveBalanceCancelEventPayload.md)
 - [ReserveBalanceCreate](docs/ReserveBalanceCreate.md)
 - [ReserveBalanceCreateEvent](docs/ReserveBalanceCreateEvent.md)
 - [ReserveBalanceCreateEventPayload](docs/ReserveBalanceCreateEventPayload.md)
 - [ReserveBalanceFailureEvent](docs/ReserveBalanceFailureEvent.md)
 - [ReserveBalanceFailureEventPayload](docs/ReserveBalanceFailureEventPayload.md)
 - [ReserveBalanceUpdate](docs/ReserveBalanceUpdate.md)
 - [TimePeriod](docs/TimePeriod.md)
 - [TopupBalance](docs/TopupBalance.md)
 - [TopupBalanceCancelEvent](docs/TopupBalanceCancelEvent.md)
 - [TopupBalanceCancelEventPayload](docs/TopupBalanceCancelEventPayload.md)
 - [TopupBalanceCreate](docs/TopupBalanceCreate.md)
 - [TopupBalanceCreateEvent](docs/TopupBalanceCreateEvent.md)
 - [TopupBalanceCreateEventPayload](docs/TopupBalanceCreateEventPayload.md)
 - [TopupBalanceFailureEvent](docs/TopupBalanceFailureEvent.md)
 - [TopupBalanceFailureEventPayload](docs/TopupBalanceFailureEventPayload.md)
 - [TopupBalanceUpdate](docs/TopupBalanceUpdate.md)
 - [TransferBalance](docs/TransferBalance.md)
 - [TransferBalanceCancelEvent](docs/TransferBalanceCancelEvent.md)
 - [TransferBalanceCancelEventPayload](docs/TransferBalanceCancelEventPayload.md)
 - [TransferBalanceCreate](docs/TransferBalanceCreate.md)
 - [TransferBalanceCreateEvent](docs/TransferBalanceCreateEvent.md)
 - [TransferBalanceCreateEventPayload](docs/TransferBalanceCreateEventPayload.md)
 - [TransferBalanceFailureEvent](docs/TransferBalanceFailureEvent.md)
 - [TransferBalanceFailureEventPayload](docs/TransferBalanceFailureEventPayload.md)
 - [TransferBalanceUpdate](docs/TransferBalanceUpdate.md)
 - [UsageType](docs/UsageType.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

