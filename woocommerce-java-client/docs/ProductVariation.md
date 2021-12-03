

# ProductVariation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for the resource. |  [optional]
**dateCreated** | **String** | The date the variation was created, in the site&#39;s timezone. |  [optional]
**dateModified** | **String** | The date the variation was last modified, in the site&#39;s timezone. |  [optional]
**description** | **String** | Variation description. |  [optional]
**permalink** | **URI** | Variation URL. |  [optional]
**sku** | **String** | Unique identifier. |  [optional]
**price** | **String** | Current variation price. |  [optional]
**regularPrice** | **String** | Variation regular price. |  [optional]
**salePrice** | **String** | Variation sale price. |  [optional]
**dateOnSaleFrom** | **String** | Start date of sale price, in the site&#39;s timezone. |  [optional]
**dateOnSaleFromGmt** | **String** | Start date of sale price, as GMT. |  [optional]
**dateOnSaleTo** | **String** | End date of sale price, in the site&#39;s timezone. |  [optional]
**dateOnSaleToGmt** | **String** | End date of sale price, in the site&#39;s timezone. |  [optional]
**onSale** | **Boolean** | Shows if the variation is on sale. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Variation status. |  [optional]
**purchasable** | **Boolean** | Shows if the variation can be bought. |  [optional]
**virtual** | **Boolean** | If the variation is virtual. |  [optional]
**downloadable** | **Boolean** | If the variation is downloadable. |  [optional]
**downloads** | [**List&lt;ProductsDownloads&gt;**](ProductsDownloads.md) | List of downloadable files. |  [optional]
**downloadLimit** | **Integer** | Number of times downloadable files can be downloaded after purchase. |  [optional]
**downloadExpiry** | **Integer** | Number of days until access to downloadable files expires. |  [optional]
**taxStatus** | [**TaxStatusEnum**](#TaxStatusEnum) | Tax status. |  [optional]
**taxClass** | **String** | Tax class. |  [optional]
**manageStock** | **Boolean** | Stock management at variation level. |  [optional]
**stockQuantity** | **Integer** | Stock quantity. |  [optional]
**stockStatus** | [**StockStatusEnum**](#StockStatusEnum) | Controls the stock status of the product. |  [optional]
**backorders** | [**BackordersEnum**](#BackordersEnum) | If managing stock, this controls if backorders are allowed. |  [optional]
**backordersAllowed** | **Boolean** | Shows if backorders are allowed. |  [optional]
**backordered** | **Boolean** | Shows if the variation is on backordered. |  [optional]
**lowStockAmount** | **Integer** | Low Stock amount for the variation. |  [optional]
**weight** | **String** | Variation weight (kg). |  [optional]
**dimensions** | [**ProductsProductIdVariationsDimensions**](ProductsProductIdVariationsDimensions.md) |  |  [optional]
**shippingClass** | **String** | Shipping class slug. |  [optional]
**shippingClassId** | **String** | Shipping class ID. |  [optional]
**image** | [**ProductsProductIdVariationsImage**](ProductsProductIdVariationsImage.md) |  |  [optional]
**attributes** | [**List&lt;ProductsDefaultAttributes&gt;**](ProductsDefaultAttributes.md) | List of attributes. |  [optional]
**menuOrder** | **Integer** | Menu order, used to custom sort products. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
PENDING | &quot;pending&quot;
PRIVATE | &quot;private&quot;
PUBLISH | &quot;publish&quot;



## Enum: TaxStatusEnum

Name | Value
---- | -----
TAXABLE | &quot;taxable&quot;
SHIPPING | &quot;shipping&quot;
NONE | &quot;none&quot;



## Enum: StockStatusEnum

Name | Value
---- | -----
INSTOCK | &quot;instock&quot;
OUTOFSTOCK | &quot;outofstock&quot;
ONBACKORDER | &quot;onbackorder&quot;



## Enum: BackordersEnum

Name | Value
---- | -----
NO | &quot;no&quot;
NOTIFY | &quot;notify&quot;
YES | &quot;yes&quot;



