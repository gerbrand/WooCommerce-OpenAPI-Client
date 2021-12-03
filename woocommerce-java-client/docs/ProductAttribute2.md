

# ProductAttribute2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Attribute name. |  [optional]
**slug** | **String** | An alphanumeric identifier for the resource unique to its type. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of attribute. |  [optional]
**orderBy** | [**OrderByEnum**](#OrderByEnum) | Default sort order. |  [optional]
**hasArchives** | **Boolean** | Enable/Disable attribute archives. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SELECT | &quot;select&quot;



## Enum: OrderByEnum

Name | Value
---- | -----
MENU_ORDER | &quot;menu_order&quot;
NAME | &quot;name&quot;
NAME_NUM | &quot;name_num&quot;
ID | &quot;id&quot;



