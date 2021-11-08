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


case class Checkout(
  /* The order ID to process during checkout. */
  orderId: Option[Int] = None,
  /* Order status. Payment providers will update this value after payment. */
  status: Option[String] = None,
  /* Order key used to check validity or protect access to certain order data. */
  orderKey: Option[String] = None,
  /* Note added to the order by the customer during checkout. */
  customerNote: Option[String] = None,
  /* Customer ID if registered. Will return 0 for guests. */
  customerId: Option[Int] = None,
  billingAddress: BillingAddress3,
  shippingAddress: ShippingAddress3,
  /* The ID of the payment method being used to process the payment. */
  paymentMethod: Option[CheckoutEnums.PaymentMethod] = None,
  /* Whether to create a new user account as part of order processing. */
  createAccount: Option[Boolean] = None,
  paymentResult: Option[CheckoutPaymentResult] = None,
  extensions: Option[Any] = None
)

object CheckoutEnums {

  type PaymentMethod = PaymentMethod.Value
  object PaymentMethod extends Enumeration {
    val WoocommercePayments = Value("woocommerce_payments")
    val Bacs = Value("bacs")
    val Cheque = Value("cheque")
    val Cod = Value("cod")
  }

}
