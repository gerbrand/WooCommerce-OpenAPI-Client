/**
 * wc/store
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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

case class CheckoutPaymentResult (
  /* Status van de betaling die wordt teruggezonden door de gateway. Succes, in behandeling, mislukt of fout. */
  paymentStatus: Option[String] = None,
  /* Een reeks gegevens die worden teruggezonden door de betalingsgateway. */
  paymentDetails: Option[Seq[CheckoutPaymentResultPaymentDetails]] = None,
  /* Een URL om de klant om te leiden na het afrekenen. Dit kan bijvoorbeeld een link naar de site van de betalingsverwerker zijn. */
  redirectUrl: Option[String] = None
) extends ApiModel

