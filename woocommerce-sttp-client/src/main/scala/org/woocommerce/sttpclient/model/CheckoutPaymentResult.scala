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


  /**
   * Result of payment processing, or false if not yet processed.
   */
case class CheckoutPaymentResult(
  /* Status of the payment returned by the gateway. One of success, pending, failure, error. */
  paymentStatus: Option[String] = None,
  /* An array of data being returned from the payment gateway. */
  paymentDetails: Option[Seq[CheckoutPaymentResultPaymentDetails]] = None,
  /* A URL to redirect the customer after checkout. This could be, for example, a link to the payment processors website. */
  redirectUrl: Option[String] = None
)
