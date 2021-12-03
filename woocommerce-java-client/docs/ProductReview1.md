

# ProductReview1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **Integer** | Unique identifier for the product. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the review. |  [optional]
**reviewer** | **String** | Name of the reviewer. |  [optional]
**reviewerEmail** | **String** | Email of the reviewer. |  [optional]
**review** | **String** | Review content. |  [optional]
**rating** | **Integer** | Review rating (0 to 5). |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
APPROVED | &quot;approved&quot;
HOLD | &quot;hold&quot;
SPAM | &quot;spam&quot;
UNSPAM | &quot;unspam&quot;
TRASH | &quot;trash&quot;
UNTRASH | &quot;untrash&quot;



