# TransferBalanceUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | Text describing the reason for the action/task | 
**amount** | [**Quantity**](Quantity.md) |  |  [optional]
**bucket** | [**BucketRef**](BucketRef.md) |  |  [optional]
**channel** | [**ChannelRef**](ChannelRef.md) |  | 
**costOwner** | [**CostOwnerType**](CostOwnerType.md) |  |  [optional]
**logicalResource** | [**List&lt;LogicalResourceRef&gt;**](LogicalResourceRef.md) |  | 
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) |  |  [optional]
**receiver** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**receiverBucket** | [**BucketRef**](BucketRef.md) |  |  [optional]
**receiverBucketUsageType** | [**UsageType**](UsageType.md) |  |  [optional]
**receiverLogicalResource** | [**LogicalResourceRef**](LogicalResourceRef.md) |  | 
**receiverProduct** | [**ProductRef**](ProductRef.md) |  |  [optional]
**requestor** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**transferCost** | [**Money**](Money.md) |  |  [optional]
**usageType** | [**UsageType**](UsageType.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
