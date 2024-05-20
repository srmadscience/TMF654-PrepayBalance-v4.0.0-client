# AccumulatedBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Identifier within the server for the recharge operation request |  [optional]
**href** | **String** | A resource URI pointing to the resource in the OB that stores the detailed information. |  [optional]
**description** | **String** | Text describing the contents of the aggregated balance |  [optional]
**name** | **String** | Friendly name to identify the aggregated balance | 
**bucket** | [**List&lt;BucketRef&gt;**](BucketRef.md) | A reference to the buckets involved in the aggregation | 
**logicalResource** | [**LogicalResourceRef**](LogicalResourceRef.md) |  |  [optional]
**partyAccount** | [**PartyAccountRef**](PartyAccountRef.md) |  |  [optional]
**product** | [**List&lt;ProductRef&gt;**](ProductRef.md) | A reference to the product whose consumption is managed by the bucket . This is an array to allow scenarios where a buckets are shared between different products |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) | Used to provide information about any other entity with relation to the balance, for instance to define customer hierarchy for the balance (e.g.: customerId, userId, ) |  [optional]
**totalBalance** | [**Quantity**](Quantity.md) |  | 
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
