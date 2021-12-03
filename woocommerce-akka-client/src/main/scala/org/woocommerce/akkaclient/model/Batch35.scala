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

case class Batch35 (
  /* Country ISO 3166 code. */
  country: Option[String] = None,
  /* State code. */
  state: Option[String] = None,
  /* Postcode/ZIP, it doesn't support multiple values. Deprecated as of WooCommerce 5.3, 'postcodes' should be used instead. */
  postcode: Option[String] = None,
  /* City name, it doesn't support multiple values. Deprecated as of WooCommerce 5.3, 'cities' should be used instead. */
  city: Option[String] = None,
  /* Tax rate. */
  rate: Option[String] = None,
  /* Tax rate name. */
  name: Option[String] = None,
  /* Tax priority. */
  priority: Option[Int] = None,
  /* Whether or not this is a compound rate. */
  compound: Option[Boolean] = None,
  /* Whether or not this tax rate also gets applied to shipping. */
  shipping: Option[Boolean] = None,
  /* Indicates the order that will appear in queries. */
  order: Option[Int] = None,
  /* Tax class. */
  `class`: Option[Batch35Enums.`Class`] = None,
  /* List of postcodes / ZIPs. Introduced in WooCommerce 5.3. */
  postcodes: Option[Seq[String]] = None,
  /* List of city names. Introduced in WooCommerce 5.3. */
  cities: Option[Seq[String]] = None
) extends ApiModel

object Batch35Enums {

  type `Class` = `Class`.Value
  object `Class` extends Enumeration {
    val Standard = Value("standard")
    val ReducedRate = Value("reduced-rate")
    val ZeroRate = Value("zero-rate")
  }

}
