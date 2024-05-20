# Bucket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Identifier within the server for the bucket |  [optional]
**href** | **String** | A resource URI pointing to the resource in the OB that stores the detailed information for the bucket |  [optional]
**confirmationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deduction was confirmed in the server |  [optional]
**description** | **String** | Text describing the contents of the balance managed by the bucket |  [optional]
**isShared** | **Boolean** | True if the bucket is shared between several devices or users |  [optional]
**name** | **String** | Friendly name to identify the bucket |  [optional]
**remainingValueName** | **String** | Remaining amount in a formatted string for the bucket given in the balance unit (for example 1.9 Gb). This formatted string could be used for display needs for example |  [optional]
**requestedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deduction request was received in the server |  [optional]
**logicalResource** | [**List&lt;LogicalResourceRef&gt;**](LogicalResourceRef.md) |  |  [optional]
**partyAccount** | [**PartyAccountRef**](PartyAccountRef.md) |  |  [optional]
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) | Used to provide information about any other entity with relation to the balance, for instance to define customer hierarchy for the balance (e.g.: customerId, userId, ) |  [optional]
**remainingValue** | [**Quantity**](Quantity.md) |  |  [optional]
**reservedValue** | [**Quantity**](Quantity.md) |  |  [optional]
**status** | [**BucketStatusType**](BucketStatusType.md) |  |  [optional]
**usageType** | [**UsageType**](UsageType.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
