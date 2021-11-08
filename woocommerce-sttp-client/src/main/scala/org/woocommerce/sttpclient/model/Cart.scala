/**
 * wc/store
 * Generated OpenAPI document of the namespace wc/store on Software-Creation.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.woocommerce.sttpclient.model


case class Cart(
  /* List of applied cart coupons. */
  coupons: Option[Seq[CartCoupons]] = None,
  /* List of available shipping rates for the cart. */
  shippingRates: Option[Seq[CartShippingRates1]] = None,
  shippingAddress: Option[CartShippingAddress] = None,
  billingAddress: Option[CartBillingAddress] = None,
  /* List of cart items. */
  items: Option[Seq[CartItems1]] = None,
  /* Number of items in the cart. */
  itemsCount: Option[Int] = None,
  /* Total weight (in grams) of all products in the cart. */
  itemsWeight: Option[Double] = None,
  /* True if the cart needs payment. False for carts with only free products and no shipping costs. */
  needsPayment: Option[Boolean] = None,
  /* True if the cart needs shipping. False for carts with only digital goods or stores with no shipping methods set-up. */
  needsShipping: Option[Boolean] = None,
  /* True if the cart meets the criteria for showing shipping costs, and rates have been calculated and included in the totals. */
  hasCalculatedShipping: Option[Boolean] = None,
  /* List of cart fees. */
  fees: Option[Seq[CartFees]] = None,
  totals: Option[CartTotals3] = None,
  /* List of cart item errors, for example, items in the cart which are out of stock. */
  errors: Option[Seq[CartErrors]] = None,
  /* List of required payment gateway features to process the order. */
  paymentRequirements: Option[Seq[String]] = None,
  /* The time at which this cart data was prepared */
  generatedTimestamp: Option[Double] = None,
  extensions: Option[Any] = None
)

