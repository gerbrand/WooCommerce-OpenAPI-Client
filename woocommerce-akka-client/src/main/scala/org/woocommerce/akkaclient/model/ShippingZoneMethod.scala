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

case class ShippingZoneMethod (
  /* Shipping method instance ID. */
  id: Option[Int] = None,
  /* Shipping method instance ID. */
  instanceId: Option[Int] = None,
  /* Shipping method customer facing title. */
  title: Option[String] = None,
  /* Shipping method sort order. */
  order: Option[Int] = None,
  /* Shipping method enabled status. */
  enabled: Option[Boolean] = None,
  /* Shipping method ID. */
  methodId: Option[String] = None,
  /* Shipping method title. */
  methodTitle: Option[String] = None,
  /* Shipping method description. */
  methodDescription: Option[String] = None,
  settings: Option[ShippingZonesZoneIdMethodsSettings] = None
) extends ApiModel
