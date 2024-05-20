# TopupBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Identifier for the resource |  [optional]
**href** | **String** | A reference to the resource |  [optional]
**confirmationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deduction was confirmed in the server |  [optional]
**description** | **String** | Description of the recharge operation |  [optional]
**isAutoTopup** | **Boolean** | Indicates if the topup requested is an autotopup (to be processed periodically) |  [optional]
**numberOfPeriods** | **Integer** | For autotopup indicates the number of occurrences of the period the recharge operation must be executed. If not included then no limit is set to stop the executionof the topup every period |  [optional]
**reason** | **String** | Text describing the reason for the action/task |  [optional]
**requestedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deduction request was received in the server |  [optional]
**voucher** | **String** | Identifier for a voucher when the topup can be performed by this means |  [optional]
**amount** | [**Quantity**](Quantity.md) |  |  [optional]
**balanceTopup** | [**RelatedTopupBalance**](RelatedTopupBalance.md) |  |  [optional]
**bucket** | [**BucketRef**](BucketRef.md) |  |  [optional]
**channel** | [**ChannelRef**](ChannelRef.md) |  |  [optional]
**logicalResource** | [**List&lt;LogicalResourceRef&gt;**](LogicalResourceRef.md) |  |  [optional]
**partyAccount** | [**PartyAccountRef**](PartyAccountRef.md) |  |  [optional]
**paymentMethod** | [**PaymentMethodRef**](PaymentMethodRef.md) |  |  [optional]
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) |  |  [optional]
**recurringPeriod** | [**RecurringPeriodType**](RecurringPeriodType.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) | Used to provide information about any other entity with relation to the operation |  [optional]
**requestor** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**status** | [**ActionStatusType**](ActionStatusType.md) |  | 
**usageType** | [**UsageType**](UsageType.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
