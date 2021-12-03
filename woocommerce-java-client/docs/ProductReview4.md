

# ProductReview4


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **Integer** | Unique identifier for the product that the review belongs to. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the review. |  [optional]
**reviewer** | **String** | Reviewer name. |  [optional]
**reviewerEmail** | **String** | Reviewer email. |  [optional]
**review** | **String** | The content of the review. |  [optional]
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



