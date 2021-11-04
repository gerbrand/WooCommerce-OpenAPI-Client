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

case class CalculateAttributeCounts (
  /* Taxonomienaam. */
  taxonomy: Option[String] = None,
  /* Uitgevoerd query type dat de aantallen kan beïnvloeden. Geldige waarden zijn onder andere 'en' en 'of'. */
  queryType: Option[CalculateAttributeCountsEnums.QueryType] = None
) extends ApiModel

object CalculateAttributeCountsEnums {

  type QueryType = QueryType.Value
  object QueryType extends Enumeration {
    val And = Value("and")
    val Or = Value("or")
  }

}