

# OrdersFeeLines


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Item ID. |  [optional]
**name** | **String** | Fee name. |  [optional]
**taxClass** | **String** | Tax class of fee. |  [optional]
**taxStatus** | [**TaxStatusEnum**](#TaxStatusEnum) | Tax status of fee. |  [optional]
**total** | **String** | Line total (after discounts). |  [optional]
**totalTax** | **String** | Line total tax (after discounts). |  [optional]
**taxes** | [**List&lt;OrdersTaxes&gt;**](OrdersTaxes.md) | Line taxes. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]



## Enum: TaxStatusEnum

Name | Value
---- | -----
TAXABLE | &quot;taxable&quot;
NONE | &quot;none&quot;



