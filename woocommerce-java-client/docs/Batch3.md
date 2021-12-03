

# Batch3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Coupon code. |  [optional]
**amount** | **String** | The amount of discount. Should always be numeric, even if setting a percentage. |  [optional]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | Determines the type of discount that will be applied. |  [optional]
**description** | **String** | Coupon description. |  [optional]
**dateExpires** | **String** | The date the coupon expires, in the site&#39;s timezone. |  [optional]
**dateExpiresGmt** | **String** | The date the coupon expires, as GMT. |  [optional]
**individualUse** | **Boolean** | If true, the coupon can only be used individually. Other applied coupons will be removed from the cart. |  [optional]
**productIds** | **List&lt;Integer&gt;** | List of product IDs the coupon can be used on. |  [optional]
**excludedProductIds** | **List&lt;Integer&gt;** | List of product IDs the coupon cannot be used on. |  [optional]
**usageLimit** | **Integer** | How many times the coupon can be used in total. |  [optional]
**usageLimitPerUser** | **Integer** | How many times the coupon can be used per customer. |  [optional]
**limitUsageToXItems** | **Integer** | Max number of items in the cart the coupon can be applied to. |  [optional]
**freeShipping** | **Boolean** | If true and if the free shipping method requires a coupon, this coupon will enable free shipping. |  [optional]
**productCategories** | **List&lt;Integer&gt;** | List of category IDs the coupon applies to. |  [optional]
**excludedProductCategories** | **List&lt;Integer&gt;** | List of category IDs the coupon does not apply to. |  [optional]
**excludeSaleItems** | **Boolean** | If true, this coupon will not be applied to items that have sale prices. |  [optional]
**minimumAmount** | **String** | Minimum order amount that needs to be in the cart before coupon applies. |  [optional]
**maximumAmount** | **String** | Maximum order amount allowed when using the coupon. |  [optional]
**emailRestrictions** | **List&lt;String&gt;** | List of email addresses that can use this coupon. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]



## Enum: DiscountTypeEnum

Name | Value
---- | -----
PERCENT | &quot;percent&quot;
FIXED_CART | &quot;fixed_cart&quot;
FIXED_PRODUCT | &quot;fixed_product&quot;



