

# Customer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for the resource. |  [optional]
**dateCreated** | **String** | The date the customer was created, in the site&#39;s timezone. |  [optional]
**dateCreatedGmt** | **String** | The date the customer was created, as GMT. |  [optional]
**dateModified** | **String** | The date the customer was last modified, in the site&#39;s timezone. |  [optional]
**dateModifiedGmt** | **String** | The date the customer was last modified, as GMT. |  [optional]
**email** | **String** | The email address for the customer. |  [optional]
**firstName** | **String** | Customer first name. |  [optional]
**lastName** | **String** | Customer last name. |  [optional]
**role** | **String** | Customer role. |  [optional]
**username** | **String** | Customer login name. |  [optional]
**password** | **String** | Customer password. |  [optional]
**billing** | [**CustomersBilling**](CustomersBilling.md) |  |  [optional]
**shipping** | [**CustomersShipping**](CustomersShipping.md) |  |  [optional]
**isPayingCustomer** | **Boolean** | Is the customer a paying customer? |  [optional]
**avatarUrl** | **String** | Avatar URL. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]



