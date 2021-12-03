

# ShopOrder


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for the resource. |  [optional]
**parentId** | **Integer** | Parent order ID. |  [optional]
**number** | **String** | Order number. |  [optional]
**orderKey** | **String** | Order key. |  [optional]
**createdVia** | **String** | Shows where the order was created. |  [optional]
**version** | **Integer** | Version of WooCommerce which last updated the order. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order status. |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency the order was created with, in ISO format. |  [optional]
**dateCreated** | **String** | The date the order was created, in the site&#39;s timezone. |  [optional]
**dateCreatedGmt** | **String** | The date the order was created, as GMT. |  [optional]
**dateModified** | **String** | The date the order was last modified, in the site&#39;s timezone. |  [optional]
**dateModifiedGmt** | **String** | The date the order was last modified, as GMT. |  [optional]
**discountTotal** | **String** | Total discount amount for the order. |  [optional]
**discountTax** | **String** | Total discount tax amount for the order. |  [optional]
**shippingTotal** | **String** | Total shipping amount for the order. |  [optional]
**shippingTax** | **String** | Total shipping tax amount for the order. |  [optional]
**cartTax** | **String** | Sum of line item taxes only. |  [optional]
**total** | **String** | Grand total. |  [optional]
**totalTax** | **String** | Sum of all taxes. |  [optional]
**pricesIncludeTax** | **Boolean** | True the prices included tax during checkout. |  [optional]
**customerId** | **Integer** | User ID who owns the order. 0 for guests. |  [optional]
**customerIpAddress** | **String** | Customer&#39;s IP address. |  [optional]
**customerUserAgent** | **String** | User agent of the customer. |  [optional]
**customerNote** | **String** | Note left by customer during checkout. |  [optional]
**billing** | [**OrdersBilling**](OrdersBilling.md) |  |  [optional]
**shipping** | [**OrdersShipping**](OrdersShipping.md) |  |  [optional]
**paymentMethod** | **String** | Payment method ID. |  [optional]
**paymentMethodTitle** | **String** | Payment method title. |  [optional]
**transactionId** | **String** | Unique transaction ID. |  [optional]
**datePaid** | **String** | The date the order was paid, in the site&#39;s timezone. |  [optional]
**datePaidGmt** | **String** | The date the order was paid, as GMT. |  [optional]
**dateCompleted** | **String** | The date the order was completed, in the site&#39;s timezone. |  [optional]
**dateCompletedGmt** | **String** | The date the order was completed, as GMT. |  [optional]
**cartHash** | **String** | MD5 hash of cart items to ensure orders are not modified. |  [optional]
**metaData** | [**List&lt;CouponsMetaData&gt;**](CouponsMetaData.md) | Meta data. |  [optional]
**lineItems** | [**List&lt;OrdersLineItems&gt;**](OrdersLineItems.md) | Line items data. |  [optional]
**taxLines** | [**List&lt;ShopOrderTaxLines&gt;**](ShopOrderTaxLines.md) | Tax lines data. |  [optional]
**shippingLines** | [**List&lt;OrdersShippingLines&gt;**](OrdersShippingLines.md) | Shipping lines data. |  [optional]
**feeLines** | [**List&lt;OrdersFeeLines&gt;**](OrdersFeeLines.md) | Fee lines data. |  [optional]
**couponLines** | [**List&lt;OrdersCouponLines&gt;**](OrdersCouponLines.md) | Coupons line data. |  [optional]
**refunds** | [**List&lt;ShopOrderRefunds&gt;**](ShopOrderRefunds.md) | List of refunds. |  [optional]
**setPaid** | **Boolean** | Define if the order is paid. It will set the status to processing and reduce stock items. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
PROCESSING | &quot;processing&quot;
ON_HOLD | &quot;on-hold&quot;
COMPLETED | &quot;completed&quot;
CANCELLED | &quot;cancelled&quot;
REFUNDED | &quot;refunded&quot;
FAILED | &quot;failed&quot;



## Enum: CurrencyEnum

Name | Value
---- | -----
AED | &quot;AED&quot;
AFN | &quot;AFN&quot;
ALL | &quot;ALL&quot;
AMD | &quot;AMD&quot;
ANG | &quot;ANG&quot;
AOA | &quot;AOA&quot;
ARS | &quot;ARS&quot;
AUD | &quot;AUD&quot;
AWG | &quot;AWG&quot;
AZN | &quot;AZN&quot;
BAM | &quot;BAM&quot;
BBD | &quot;BBD&quot;
BDT | &quot;BDT&quot;
BGN | &quot;BGN&quot;
BHD | &quot;BHD&quot;
BIF | &quot;BIF&quot;
BMD | &quot;BMD&quot;
BND | &quot;BND&quot;
BOB | &quot;BOB&quot;
BRL | &quot;BRL&quot;
BSD | &quot;BSD&quot;
BTC | &quot;BTC&quot;
BTN | &quot;BTN&quot;
BWP | &quot;BWP&quot;
BYR | &quot;BYR&quot;
BYN | &quot;BYN&quot;
BZD | &quot;BZD&quot;
CAD | &quot;CAD&quot;
CDF | &quot;CDF&quot;
CHF | &quot;CHF&quot;
CLP | &quot;CLP&quot;
CNY | &quot;CNY&quot;
COP | &quot;COP&quot;
CRC | &quot;CRC&quot;
CUC | &quot;CUC&quot;
CUP | &quot;CUP&quot;
CVE | &quot;CVE&quot;
CZK | &quot;CZK&quot;
DJF | &quot;DJF&quot;
DKK | &quot;DKK&quot;
DOP | &quot;DOP&quot;
DZD | &quot;DZD&quot;
EGP | &quot;EGP&quot;
ERN | &quot;ERN&quot;
ETB | &quot;ETB&quot;
EUR | &quot;EUR&quot;
FJD | &quot;FJD&quot;
FKP | &quot;FKP&quot;
GBP | &quot;GBP&quot;
GEL | &quot;GEL&quot;
GGP | &quot;GGP&quot;
GHS | &quot;GHS&quot;
GIP | &quot;GIP&quot;
GMD | &quot;GMD&quot;
GNF | &quot;GNF&quot;
GTQ | &quot;GTQ&quot;
GYD | &quot;GYD&quot;
HKD | &quot;HKD&quot;
HNL | &quot;HNL&quot;
HRK | &quot;HRK&quot;
HTG | &quot;HTG&quot;
HUF | &quot;HUF&quot;
IDR | &quot;IDR&quot;
ILS | &quot;ILS&quot;
IMP | &quot;IMP&quot;
INR | &quot;INR&quot;
IQD | &quot;IQD&quot;
IRR | &quot;IRR&quot;
IRT | &quot;IRT&quot;
ISK | &quot;ISK&quot;
JEP | &quot;JEP&quot;
JMD | &quot;JMD&quot;
JOD | &quot;JOD&quot;
JPY | &quot;JPY&quot;
KES | &quot;KES&quot;
KGS | &quot;KGS&quot;
KHR | &quot;KHR&quot;
KMF | &quot;KMF&quot;
KPW | &quot;KPW&quot;
KRW | &quot;KRW&quot;
KWD | &quot;KWD&quot;
KYD | &quot;KYD&quot;
KZT | &quot;KZT&quot;
LAK | &quot;LAK&quot;
LBP | &quot;LBP&quot;
LKR | &quot;LKR&quot;
LRD | &quot;LRD&quot;
LSL | &quot;LSL&quot;
LYD | &quot;LYD&quot;
MAD | &quot;MAD&quot;
MDL | &quot;MDL&quot;
MGA | &quot;MGA&quot;
MKD | &quot;MKD&quot;
MMK | &quot;MMK&quot;
MNT | &quot;MNT&quot;
MOP | &quot;MOP&quot;
MRU | &quot;MRU&quot;
MUR | &quot;MUR&quot;
MVR | &quot;MVR&quot;
MWK | &quot;MWK&quot;
MXN | &quot;MXN&quot;
MYR | &quot;MYR&quot;
MZN | &quot;MZN&quot;
NAD | &quot;NAD&quot;
NGN | &quot;NGN&quot;
NIO | &quot;NIO&quot;
NOK | &quot;NOK&quot;
NPR | &quot;NPR&quot;
NZD | &quot;NZD&quot;
OMR | &quot;OMR&quot;
PAB | &quot;PAB&quot;
PEN | &quot;PEN&quot;
PGK | &quot;PGK&quot;
PHP | &quot;PHP&quot;
PKR | &quot;PKR&quot;
PLN | &quot;PLN&quot;
PRB | &quot;PRB&quot;
PYG | &quot;PYG&quot;
QAR | &quot;QAR&quot;
RON | &quot;RON&quot;
RSD | &quot;RSD&quot;
RUB | &quot;RUB&quot;
RWF | &quot;RWF&quot;
SAR | &quot;SAR&quot;
SBD | &quot;SBD&quot;
SCR | &quot;SCR&quot;
SDG | &quot;SDG&quot;
SEK | &quot;SEK&quot;
SGD | &quot;SGD&quot;
SHP | &quot;SHP&quot;
SLL | &quot;SLL&quot;
SOS | &quot;SOS&quot;
SRD | &quot;SRD&quot;
SSP | &quot;SSP&quot;
STN | &quot;STN&quot;
SYP | &quot;SYP&quot;
SZL | &quot;SZL&quot;
THB | &quot;THB&quot;
TJS | &quot;TJS&quot;
TMT | &quot;TMT&quot;
TND | &quot;TND&quot;
TOP | &quot;TOP&quot;
TRY | &quot;TRY&quot;
TTD | &quot;TTD&quot;
TWD | &quot;TWD&quot;
TZS | &quot;TZS&quot;
UAH | &quot;UAH&quot;
UGX | &quot;UGX&quot;
USD | &quot;USD&quot;
UYU | &quot;UYU&quot;
UZS | &quot;UZS&quot;
VEF | &quot;VEF&quot;
VES | &quot;VES&quot;
VND | &quot;VND&quot;
VUV | &quot;VUV&quot;
WST | &quot;WST&quot;
XAF | &quot;XAF&quot;
XCD | &quot;XCD&quot;
XOF | &quot;XOF&quot;
XPF | &quot;XPF&quot;
YER | &quot;YER&quot;
ZAR | &quot;ZAR&quot;
ZMW | &quot;ZMW&quot;



