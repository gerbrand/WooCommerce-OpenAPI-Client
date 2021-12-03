

# Setting


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the setting. |  [optional]
**groupId** | **String** | An identifier for the group this setting belongs to. |  [optional]
**label** | **String** | A human readable label for the setting used in interfaces. |  [optional]
**description** | **String** | A human readable description for the setting used in interfaces. |  [optional]
**value** | **String** | Setting value. |  [optional]
**_default** | **String** | Default value for the setting. |  [optional]
**tip** | **String** | Additional help text shown to the user about the setting. |  [optional]
**placeholder** | **String** | Placeholder text to be displayed in text inputs. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of setting. |  [optional]
**options** | **Object** | Array of options (key value pairs) for inputs such as select, multiselect, and radio buttons. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TEXT | &quot;text&quot;
EMAIL | &quot;email&quot;
NUMBER | &quot;number&quot;
COLOR | &quot;color&quot;
PASSWORD | &quot;password&quot;
TEXTAREA | &quot;textarea&quot;
SELECT | &quot;select&quot;
MULTISELECT | &quot;multiselect&quot;
RADIO | &quot;radio&quot;
IMAGE_WIDTH | &quot;image_width&quot;
CHECKBOX | &quot;checkbox&quot;



