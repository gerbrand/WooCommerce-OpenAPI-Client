

# Webhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for the resource. |  [optional]
**name** | **String** | A friendly name for the webhook. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Webhook status. |  [optional]
**topic** | **String** | Webhook topic. |  [optional]
**resource** | **String** | Webhook resource. |  [optional]
**event** | **String** | Webhook event. |  [optional]
**hooks** | **List&lt;String&gt;** | WooCommerce action names associated with the webhook. |  [optional]
**deliveryUrl** | **URI** | The URL where the webhook payload is delivered. |  [optional]
**secret** | **String** | Secret key used to generate a hash of the delivered webhook and provided in the request headers. This will default to a MD5 hash from the current user&#39;s ID|username if not provided. |  [optional]
**dateCreated** | **String** | The date the webhook was created, in the site&#39;s timezone. |  [optional]
**dateCreatedGmt** | **String** | The date the webhook was created, as GMT. |  [optional]
**dateModified** | **String** | The date the webhook was last modified, in the site&#39;s timezone. |  [optional]
**dateModifiedGmt** | **String** | The date the webhook was last modified, as GMT. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
PAUSED | &quot;paused&quot;
DISABLED | &quot;disabled&quot;



