/**
 * wc/v3
 * OpenAPI documented, based on generated OpenAPI document of the namespace wc/v3 with some manual fixes.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.woocommerce.akkaclient.model

import org.woocommerce.akkaclient.core.ApiModel

case class Batch9 (
  /* Parent order ID. */
  parentId: Option[Int] = None,
  /* Order status. */
  status: Option[Batch9Enums.Status] = None,
  /* Currency the order was created with, in ISO format. */
  currency: Option[Batch9Enums.Currency] = None,
  /* User ID who owns the order. 0 for guests. */
  customerId: Option[Int] = None,
  /* Note left by customer during checkout. */
  customerNote: Option[String] = None,
  billing: Option[OrdersBilling] = None,
  shipping: Option[OrdersShipping] = None,
  /* Payment method ID. */
  paymentMethod: Option[String] = None,
  /* Payment method title. */
  paymentMethodTitle: Option[String] = None,
  /* Unique transaction ID. */
  transactionId: Option[String] = None,
  /* Meta data. */
  metaData: Option[Seq[CouponsMetaData]] = None,
  /* Line items data. */
  lineItems: Option[Seq[OrdersLineItems]] = None,
  /* Shipping lines data. */
  shippingLines: Option[Seq[OrdersShippingLines]] = None,
  /* Fee lines data. */
  feeLines: Option[Seq[OrdersFeeLines]] = None,
  /* Coupons line data. */
  couponLines: Option[Seq[OrdersCouponLines]] = None,
  /* Define if the order is paid. It will set the status to processing and reduce stock items. */
  setPaid: Option[Boolean] = None
) extends ApiModel

object Batch9Enums {

  type Status = Status.Value
  type Currency = Currency.Value
  object Status extends Enumeration {
    val Pending = Value("pending")
    val Processing = Value("processing")
    val OnHold = Value("on-hold")
    val Completed = Value("completed")
    val Cancelled = Value("cancelled")
    val Refunded = Value("refunded")
    val Failed = Value("failed")
  }

  object Currency extends Enumeration {
    val AED = Value("AED")
    val AFN = Value("AFN")
    val ALL = Value("ALL")
    val AMD = Value("AMD")
    val ANG = Value("ANG")
    val AOA = Value("AOA")
    val ARS = Value("ARS")
    val AUD = Value("AUD")
    val AWG = Value("AWG")
    val AZN = Value("AZN")
    val BAM = Value("BAM")
    val BBD = Value("BBD")
    val BDT = Value("BDT")
    val BGN = Value("BGN")
    val BHD = Value("BHD")
    val BIF = Value("BIF")
    val BMD = Value("BMD")
    val BND = Value("BND")
    val BOB = Value("BOB")
    val BRL = Value("BRL")
    val BSD = Value("BSD")
    val BTC = Value("BTC")
    val BTN = Value("BTN")
    val BWP = Value("BWP")
    val BYR = Value("BYR")
    val BYN = Value("BYN")
    val BZD = Value("BZD")
    val CAD = Value("CAD")
    val CDF = Value("CDF")
    val CHF = Value("CHF")
    val CLP = Value("CLP")
    val CNY = Value("CNY")
    val COP = Value("COP")
    val CRC = Value("CRC")
    val CUC = Value("CUC")
    val CUP = Value("CUP")
    val CVE = Value("CVE")
    val CZK = Value("CZK")
    val DJF = Value("DJF")
    val DKK = Value("DKK")
    val DOP = Value("DOP")
    val DZD = Value("DZD")
    val EGP = Value("EGP")
    val ERN = Value("ERN")
    val ETB = Value("ETB")
    val EUR = Value("EUR")
    val FJD = Value("FJD")
    val FKP = Value("FKP")
    val GBP = Value("GBP")
    val GEL = Value("GEL")
    val GGP = Value("GGP")
    val GHS = Value("GHS")
    val GIP = Value("GIP")
    val GMD = Value("GMD")
    val GNF = Value("GNF")
    val GTQ = Value("GTQ")
    val GYD = Value("GYD")
    val HKD = Value("HKD")
    val HNL = Value("HNL")
    val HRK = Value("HRK")
    val HTG = Value("HTG")
    val HUF = Value("HUF")
    val IDR = Value("IDR")
    val ILS = Value("ILS")
    val IMP = Value("IMP")
    val INR = Value("INR")
    val IQD = Value("IQD")
    val IRR = Value("IRR")
    val IRT = Value("IRT")
    val ISK = Value("ISK")
    val JEP = Value("JEP")
    val JMD = Value("JMD")
    val JOD = Value("JOD")
    val JPY = Value("JPY")
    val KES = Value("KES")
    val KGS = Value("KGS")
    val KHR = Value("KHR")
    val KMF = Value("KMF")
    val KPW = Value("KPW")
    val KRW = Value("KRW")
    val KWD = Value("KWD")
    val KYD = Value("KYD")
    val KZT = Value("KZT")
    val LAK = Value("LAK")
    val LBP = Value("LBP")
    val LKR = Value("LKR")
    val LRD = Value("LRD")
    val LSL = Value("LSL")
    val LYD = Value("LYD")
    val MAD = Value("MAD")
    val MDL = Value("MDL")
    val MGA = Value("MGA")
    val MKD = Value("MKD")
    val MMK = Value("MMK")
    val MNT = Value("MNT")
    val MOP = Value("MOP")
    val MRU = Value("MRU")
    val MUR = Value("MUR")
    val MVR = Value("MVR")
    val MWK = Value("MWK")
    val MXN = Value("MXN")
    val MYR = Value("MYR")
    val MZN = Value("MZN")
    val NAD = Value("NAD")
    val NGN = Value("NGN")
    val NIO = Value("NIO")
    val NOK = Value("NOK")
    val NPR = Value("NPR")
    val NZD = Value("NZD")
    val OMR = Value("OMR")
    val PAB = Value("PAB")
    val PEN = Value("PEN")
    val PGK = Value("PGK")
    val PHP = Value("PHP")
    val PKR = Value("PKR")
    val PLN = Value("PLN")
    val PRB = Value("PRB")
    val PYG = Value("PYG")
    val QAR = Value("QAR")
    val RON = Value("RON")
    val RSD = Value("RSD")
    val RUB = Value("RUB")
    val RWF = Value("RWF")
    val SAR = Value("SAR")
    val SBD = Value("SBD")
    val SCR = Value("SCR")
    val SDG = Value("SDG")
    val SEK = Value("SEK")
    val SGD = Value("SGD")
    val SHP = Value("SHP")
    val SLL = Value("SLL")
    val SOS = Value("SOS")
    val SRD = Value("SRD")
    val SSP = Value("SSP")
    val STN = Value("STN")
    val SYP = Value("SYP")
    val SZL = Value("SZL")
    val THB = Value("THB")
    val TJS = Value("TJS")
    val TMT = Value("TMT")
    val TND = Value("TND")
    val TOP = Value("TOP")
    val `TRY` = Value("TRY")
    val TTD = Value("TTD")
    val TWD = Value("TWD")
    val TZS = Value("TZS")
    val UAH = Value("UAH")
    val UGX = Value("UGX")
    val USD = Value("USD")
    val UYU = Value("UYU")
    val UZS = Value("UZS")
    val VEF = Value("VEF")
    val VES = Value("VES")
    val VND = Value("VND")
    val VUV = Value("VUV")
    val WST = Value("WST")
    val XAF = Value("XAF")
    val XCD = Value("XCD")
    val XOF = Value("XOF")
    val XPF = Value("XPF")
    val YER = Value("YER")
    val ZAR = Value("ZAR")
    val ZMW = Value("ZMW")
  }

}
