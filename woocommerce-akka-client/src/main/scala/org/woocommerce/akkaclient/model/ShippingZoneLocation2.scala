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

case class ShippingZoneLocation2 (
  /* Shipping zone location code. */
  code: Option[String] = None,
  /* Shipping zone location type. */
  `type`: Option[ShippingZoneLocation2Enums.`Type`] = None
) extends ApiModel

object ShippingZoneLocation2Enums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Postcode = Value("postcode")
    val State = Value("state")
    val Country = Value("country")
    val Continent = Value("continent")
  }

}
