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

case class CartTotals3TaxLines (
  /* Naam van de belasting. */
  name: Option[String] = None,
  /* Belastingtarief dat in rekening wordt gebracht. */
  price: Option[String] = None,
  /* Het tarief waartegen belasting wordt toegepast. */
  rate: Option[String] = None
) extends ApiModel
