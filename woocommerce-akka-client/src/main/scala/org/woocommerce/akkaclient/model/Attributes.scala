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

case class Attributes (
  /* Attribuut taxonomie naam. */
  attribute: Option[String] = None,
  /* Lijst van attribuut term ID's. */
  termId: Option[Seq[Int]] = None,
  /* Lijst met eigenschap-slug(s). Als een term ID is opgegeven, wordt dit genegeerd. */
  slug: Option[Seq[String]] = None,
  /* Operator om termen van productattribuut te vergelijken. */
  operator: Option[AttributesEnums.Operator] = None
) extends ApiModel

object AttributesEnums {

  type Operator = Operator.Value
  object Operator extends Enumeration {
    val In = Value("in")
    val NotIn = Value("not in")
    val And = Value("and")
  }

}
