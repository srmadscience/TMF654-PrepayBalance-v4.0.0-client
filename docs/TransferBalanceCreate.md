# TransferBalanceCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the recharge operation |  [optional]
**reason** | **String** | Text describing the reason for the action/task | 
**amount** | [**Quantity**](Quantity.md) |  | 
**bucket** | [**BucketRef**](BucketRef.md) |  | 
**channel** | [**ChannelRef**](ChannelRef.md) |  | 
**costOwner** | [**CostOwnerType**](CostOwnerType.md) |  |  [optional]
**logicalResource** | [**List&lt;LogicalResourceRef&gt;**](LogicalResourceRef.md) |  | 
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) |  |  [optional]
**receiver** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**receiverBucket** | [**BucketRef**](BucketRef.md) |  | 
**receiverBucketUsageType** | [**UsageType**](UsageType.md) |  | 
**receiverLogicalResource** | [**LogicalResourceRef**](LogicalResourceRef.md) |  | 
**receiverProduct** | [**ProductRef**](ProductRef.md) |  |  [optional]
**requestor** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**transferCost** | [**Money**](Money.md) |  |  [optional]
**usageType** | [**UsageType**](UsageType.md) |  | 
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
