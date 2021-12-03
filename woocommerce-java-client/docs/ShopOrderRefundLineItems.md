

# ShopOrderRefundLineItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Item ID. |  [optional]
**name** | **String** | Product name. |  [optional]
**productId** | **String** | Product ID. |  [optional]
**variationId** | **Integer** | Variation ID, if applicable. |  [optional]
**quantity** | **Integer** | Quantity ordered. |  [optional]
**taxClass** | **String** | Tax class of product. |  [optional]
**subtotal** | **String** | Line subtotal (before discounts). |  [optional]
**subtotalTax** | **String** | Line subtotal tax (before discounts). |  [optional]
**total** | **String** | Line total (after discounts). |  [optional]
**totalTax** | **String** | Line total tax (after discounts). |  [optional]
**taxes** | [**List&lt;ShopOrderRefundTaxes&gt;**](ShopOrderRefundTaxes.md) | Line taxes. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]
**sku** | **String** | Product SKU. |  [optional]
**price** | **BigDecimal** | Product price. |  [optional]
**refundTotal** | **BigDecimal** | Amount that will be refunded for this line item (excluding taxes). |  [optional]



