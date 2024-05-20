# TransferBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Identifier for the resource | 
**href** | **String** | A reference to the resource | 
**confirmationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deduction was confirmed in the server |  [optional]
**description** | **String** | Description of the recharge operation |  [optional]
**reason** | **String** | Text describing the reason for the action/task | 
**requestedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deduction request was received in the server |  [optional]
**amount** | [**Quantity**](Quantity.md) |  |  [optional]
**bucket** | [**BucketRef**](BucketRef.md) |  |  [optional]
**channel** | [**ChannelRef**](ChannelRef.md) |  | 
**costOwner** | [**CostOwnerType**](CostOwnerType.md) |  |  [optional]
**logicalResource** | [**List&lt;LogicalResourceRef&gt;**](LogicalResourceRef.md) |  | 
**partyAccount** | [**PartyAccountRef**](PartyAccountRef.md) |  |  [optional]
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) |  |  [optional]
**receiver** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**receiverBucket** | [**BucketRef**](BucketRef.md) |  |  [optional]
**receiverBucketUsageType** | [**UsageType**](UsageType.md) |  |  [optional]
**receiverLogicalResource** | [**LogicalResourceRef**](LogicalResourceRef.md) |  | 
**receiverProduct** | [**ProductRef**](ProductRef.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) | Used to provide information about any other entity with relation to the operation |  [optional]
**requestor** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**status** | [**ActionStatusType**](ActionStatusType.md) |  | 
**transferCost** | [**Money**](Money.md) |  |  [optional]
**usageType** | [**UsageType**](UsageType.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
