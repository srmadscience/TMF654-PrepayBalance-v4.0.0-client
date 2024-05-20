# AdjustBalanceCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the recharge operation |  [optional]
**reason** | **String** | Text describing the reason for the action/task |  [optional]
**adjustType** | [**AdjustType**](AdjustType.md) |  |  [optional]
**amount** | [**Quantity**](Quantity.md) |  | 
**bucket** | [**BucketRef**](BucketRef.md) |  | 
**channel** | [**ChannelRef**](ChannelRef.md) |  |  [optional]
**logicalResource** | [**List&lt;LogicalResourceRef&gt;**](LogicalResourceRef.md) |  |  [optional]
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) |  |  [optional]
**requestor** | [**RelatedParty**](RelatedParty.md) |  |  [optional]
**usageType** | [**UsageType**](UsageType.md) |  | 
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
