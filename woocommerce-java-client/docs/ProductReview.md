

# ProductReview


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for the resource. |  [optional]
**dateCreated** | **String** | The date the review was created, in the site&#39;s timezone. |  [optional]
**dateCreatedGmt** | **String** | The date the review was created, as GMT. |  [optional]
**productId** | **Integer** | Unique identifier for the product that the review belongs to. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the review. |  [optional]
**reviewer** | **String** | Reviewer name. |  [optional]
**reviewerEmail** | **String** | Reviewer email. |  [optional]
**review** | **String** | The content of the review. |  [optional]
**rating** | **Integer** | Review rating (0 to 5). |  [optional]
**verified** | **Boolean** | Shows if the reviewer bought the product or not. |  [optional]
**reviewerAvatarUrls** | [**ProductReviewReviewerAvatarUrls**](ProductReviewReviewerAvatarUrls.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
APPROVED | &quot;approved&quot;
HOLD | &quot;hold&quot;
SPAM | &quot;spam&quot;
UNSPAM | &quot;unspam&quot;
TRASH | &quot;trash&quot;
UNTRASH | &quot;untrash&quot;



