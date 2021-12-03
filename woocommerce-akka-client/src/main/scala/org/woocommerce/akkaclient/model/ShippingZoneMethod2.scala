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

case class ShippingZoneMethod2 (
  /* Shipping method sort order. */
  order: Option[Int] = None,
  /* Shipping method enabled status. */
  enabled: Option[Boolean] = None,
  settings: Option[ShippingZonesZoneIdMethodsSettings] = None
) extends ApiModel

