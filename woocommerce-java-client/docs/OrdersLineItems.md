

# OrdersLineItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Item ID. |  [optional]
**name** | **String** | Product name. |  [optional]
**parentName** | **String** | Parent product name if the product is a variation. |  [optional]
**productId** | **String** | Product ID. |  [optional]
**variationId** | **Integer** | Variation ID, if applicable. |  [optional]
**quantity** | **Integer** | Quantity ordered. |  [optional]
**taxClass** | **String** | Tax class of product. |  [optional]
**subtotal** | **String** | Line subtotal (before discounts). |  [optional]
**subtotalTax** | **String** | Line subtotal tax (before discounts). |  [optional]
**total** | **String** | Line total (after discounts). |  [optional]
**totalTax** | **String** | Line total tax (after discounts). |  [optional]
**taxes** | [**List&lt;OrdersTaxes&gt;**](OrdersTaxes.md) | Line taxes. |  [optional]
**metaData** | [**List&lt;OrdersMetaData&gt;**](OrdersMetaData.md) | Meta data. |  [optional]
**sku** | **String** | Product SKU. |  [optional]
**price** | **BigDecimal** | Product price. |  [optional]



