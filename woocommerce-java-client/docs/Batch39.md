

# Batch39


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A friendly name for the webhook. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Webhook status. |  [optional]
**topic** | **String** | Webhook topic. |  [optional]
**secret** | **String** | Secret key used to generate a hash of the delivered webhook and provided in the request headers. This will default to a MD5 hash from the current user&#39;s ID|username if not provided. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
PAUSED | &quot;paused&quot;
DISABLED | &quot;disabled&quot;



