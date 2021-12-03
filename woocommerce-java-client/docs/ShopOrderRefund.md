

# ShopOrderRefund


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for the resource. |  [optional]
**dateCreated** | **String** | The date the order refund was created, in the site&#39;s timezone. |  [optional]
**dateCreatedGmt** | **String** | The date the order refund was created, as GMT. |  [optional]
**amount** | **String** | Refund amount. |  [optional]
**reason** | **String** | Reason for refund. |  [optional]
**refundedBy** | **Integer** | User ID of user who created the refund. |  [optional]
**refundedPayment** | **Boolean** | If the payment was refunded via the API. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]
**lineItems** | [**List&lt;ShopOrderRefundLineItems&gt;**](ShopOrderRefundLineItems.md) | Line items data. |  [optional]
**apiRefund** | **Boolean** | When true, the payment gateway API is used to generate the refund. |  [optional]
**apiRestock** | **Boolean** | When true, refunded items are restocked. |  [optional]



