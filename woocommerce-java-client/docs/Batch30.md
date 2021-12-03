

# Batch30


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Product name. |  [optional]
**slug** | **String** | Product slug. |  [optional]
**dateCreated** | **String** | The date the product was created, in the site&#39;s timezone. |  [optional]
**dateCreatedGmt** | **String** | The date the product was created, as GMT. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Product type. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Product status (post status). |  [optional]
**featured** | **Boolean** | Featured product. |  [optional]
**catalogVisibility** | [**CatalogVisibilityEnum**](#CatalogVisibilityEnum) | Catalog visibility. |  [optional]
**description** | **String** | Product description. |  [optional]
**shortDescription** | **String** | Product short description. |  [optional]
**sku** | **String** | Unique identifier. |  [optional]
**regularPrice** | **String** | Product regular price. |  [optional]
**salePrice** | **String** | Product sale price. |  [optional]
**dateOnSaleFrom** | **String** | Start date of sale price, in the site&#39;s timezone. |  [optional]
**dateOnSaleFromGmt** | **String** | Start date of sale price, as GMT. |  [optional]
**dateOnSaleTo** | **String** | End date of sale price, in the site&#39;s timezone. |  [optional]
**dateOnSaleToGmt** | **String** | End date of sale price, in the site&#39;s timezone. |  [optional]
**virtual** | **Boolean** | If the product is virtual. |  [optional]
**downloadable** | **Boolean** | If the product is downloadable. |  [optional]
**downloads** | [**List&lt;ProductsDownloads&gt;**](ProductsDownloads.md) | List of downloadable files. |  [optional]
**downloadLimit** | **Integer** | Number of times downloadable files can be downloaded after purchase. |  [optional]
**downloadExpiry** | **Integer** | Number of days until access to downloadable files expires. |  [optional]
**externalUrl** | **URI** | Product external URL. Only for external products. |  [optional]
**buttonText** | **String** | Product external button text. Only for external products. |  [optional]
**taxStatus** | [**TaxStatusEnum**](#TaxStatusEnum) | Tax status. |  [optional]
**taxClass** | **String** | Tax class. |  [optional]
**manageStock** | **Boolean** | Stock management at product level. |  [optional]
**stockQuantity** | **Integer** | Stock quantity. |  [optional]
**stockStatus** | [**StockStatusEnum**](#StockStatusEnum) | Controls the stock status of the product. |  [optional]
**backorders** | [**BackordersEnum**](#BackordersEnum) | If managing stock, this controls if backorders are allowed. |  [optional]
**lowStockAmount** | **Integer** | Low Stock amount for the product. |  [optional]
**soldIndividually** | **Boolean** | Allow one item to be bought in a single order. |  [optional]
**weight** | **String** | Product weight (kg). |  [optional]
**dimensions** | [**ProductsDimensions**](ProductsDimensions.md) |  |  [optional]
**shippingClass** | **String** | Shipping class slug. |  [optional]
**reviewsAllowed** | **Boolean** | Allow reviews. |  [optional]
**upsellIds** | **List&lt;Integer&gt;** | List of up-sell products IDs. |  [optional]
**crossSellIds** | **List&lt;Integer&gt;** | List of cross-sell products IDs. |  [optional]
**parentId** | **Integer** | Product parent ID. |  [optional]
**purchaseNote** | **String** | Optional note to send the customer after purchase. |  [optional]
**categories** | [**List&lt;ProductsCategories&gt;**](ProductsCategories.md) | List of categories. |  [optional]
**tags** | [**List&lt;ProductsTags&gt;**](ProductsTags.md) | List of tags. |  [optional]
**images** | [**List&lt;ProductsImages&gt;**](ProductsImages.md) | List of images. |  [optional]
**attributes** | [**List&lt;ProductsAttributes&gt;**](ProductsAttributes.md) | List of attributes. |  [optional]
**defaultAttributes** | [**List&lt;ProductsDefaultAttributes&gt;**](ProductsDefaultAttributes.md) | Defaults variation attributes. |  [optional]
**menuOrder** | **Integer** | Menu order, used to custom sort products. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SIMPLE | &quot;simple&quot;
GROUPED | &quot;grouped&quot;
EXTERNAL | &quot;external&quot;
VARIABLE | &quot;variable&quot;



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
PENDING | &quot;pending&quot;
PRIVATE | &quot;private&quot;
PUBLISH | &quot;publish&quot;
FUTURE | &quot;future&quot;



## Enum: CatalogVisibilityEnum

Name | Value
---- | -----
VISIBLE | &quot;visible&quot;
CATALOG | &quot;catalog&quot;
SEARCH | &quot;search&quot;
HIDDEN | &quot;hidden&quot;



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



