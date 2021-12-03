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

case class ProductAttribute3 (
  /* Attribute name. */
  name: Option[String] = None,
  /* An alphanumeric identifier for the resource unique to its type. */
  slug: Option[String] = None,
  /* Type of attribute. */
  `type`: Option[ProductAttribute3Enums.`Type`] = None,
  /* Default sort order. */
  orderBy: Option[ProductAttribute3Enums.OrderBy] = None,
  /* Enable/Disable attribute archives. */
  hasArchives: Option[Boolean] = None
) extends ApiModel

object ProductAttribute3Enums {

  type `Type` = `Type`.Value
  type OrderBy = OrderBy.Value
  object `Type` extends Enumeration {
    val Select = Value("select")
  }

  object OrderBy extends Enumeration {
    val MenuOrder = Value("menu_order")
    val Name = Value("name")
    val NameNum = Value("name_num")
    val Id = Value("id")
  }

}
