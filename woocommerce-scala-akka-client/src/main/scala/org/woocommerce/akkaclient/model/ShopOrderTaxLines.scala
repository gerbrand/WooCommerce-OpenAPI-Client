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

case class ShopOrderTaxLines (
  /* Item ID. */
  id: Option[Int] = None,
  /* Tax rate code. */
  rateCode: Option[String] = None,
  /* Tax rate ID. */
  rateId: Option[String] = None,
  /* Tax rate label. */
  label: Option[String] = None,
  /* Show if is a compound tax rate. */
  compound: Option[Boolean] = None,
  /* Tax total (not including shipping taxes). */
  taxTotal: Option[String] = None,
  /* Shipping tax total. */
  shippingTaxTotal: Option[String] = None,
  /* Meta data. */
  metaData: Option[Seq[CouponsMetaData]] = None
) extends ApiModel
