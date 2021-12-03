

# Batch35


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | Country ISO 3166 code. |  [optional]
**state** | **String** | State code. |  [optional]
**postcode** | **String** | Postcode/ZIP, it doesn&#39;t support multiple values. Deprecated as of WooCommerce 5.3, &#39;postcodes&#39; should be used instead. |  [optional]
**city** | **String** | City name, it doesn&#39;t support multiple values. Deprecated as of WooCommerce 5.3, &#39;cities&#39; should be used instead. |  [optional]
**rate** | **String** | Tax rate. |  [optional]
**name** | **String** | Tax rate name. |  [optional]
**priority** | **Integer** | Tax priority. |  [optional]
**compound** | **Boolean** | Whether or not this is a compound rate. |  [optional]
**shipping** | **Boolean** | Whether or not this tax rate also gets applied to shipping. |  [optional]
**order** | **Integer** | Indicates the order that will appear in queries. |  [optional]
**propertyClass** | [**PropertyClassEnum**](#PropertyClassEnum) | Tax class. |  [optional]
**postcodes** | **List&lt;String&gt;** | List of postcodes / ZIPs. Introduced in WooCommerce 5.3. |  [optional]
**cities** | **List&lt;String&gt;** | List of city names. Introduced in WooCommerce 5.3. |  [optional]



## Enum: PropertyClassEnum

Name | Value
---- | -----
STANDARD | &quot;standard&quot;
REDUCED_RATE | &quot;reduced-rate&quot;
ZERO_RATE | &quot;zero-rate&quot;



