

# Batch18


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Category name. |  [optional]
**slug** | **String** | An alphanumeric identifier for the resource unique to its type. |  [optional]
**parent** | **Integer** | The ID for the parent of the resource. |  [optional]
**description** | **String** | HTML description of the resource. |  [optional]
**display** | [**DisplayEnum**](#DisplayEnum) | Category archive display type. |  [optional]
**image** | [**ProductsCategoriesImage**](ProductsCategoriesImage.md) |  |  [optional]
**menuOrder** | **Integer** | Menu order, used to custom sort the resource. |  [optional]



## Enum: DisplayEnum

Name | Value
---- | -----
DEFAULT | &quot;default&quot;
PRODUCTS | &quot;products&quot;
SUBCATEGORIES | &quot;subcategories&quot;
BOTH | &quot;both&quot;



