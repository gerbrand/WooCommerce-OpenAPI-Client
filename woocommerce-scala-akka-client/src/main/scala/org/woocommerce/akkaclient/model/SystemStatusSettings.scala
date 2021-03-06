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

case class SystemStatusSettings (
  /* REST API enabled? */
  apiEnabled: Option[Boolean] = None,
  /* SSL forced? */
  forceSsl: Option[Boolean] = None,
  /* Currency. */
  currency: Option[String] = None,
  /* Currency symbol. */
  currencySymbol: Option[String] = None,
  /* Currency position. */
  currencyPosition: Option[String] = None,
  /* Thousand separator. */
  thousandSeparator: Option[String] = None,
  /* Decimal separator. */
  decimalSeparator: Option[String] = None,
  /* Number of decimals. */
  numberOfDecimals: Option[Int] = None,
  /* Geolocation enabled? */
  geolocationEnabled: Option[Boolean] = None,
  /* Taxonomy terms for product/order statuses. */
  taxonomies: Option[Seq[String]] = None,
  /* Terms in the product visibility taxonomy. */
  productVisibilityTerms: Option[Seq[String]] = None
) extends ApiModel

