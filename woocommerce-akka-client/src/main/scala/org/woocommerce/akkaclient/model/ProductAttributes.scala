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

case class ProductAttributes (
  /* Het attribuut ID, of 0 als het attribuut niet op taxonomie is gebaseerd. */
  id: Option[Int] = None,
  /* De attribuut naam. */
  name: Option[String] = None,
  /* De attribuuttaxonomie, of nul als het attribuut niet op taxonomie is gebaseerd. */
  taxonomy: Option[String] = None,
  /* Waar als dit attribuut wordt gebruikt voor productvariaties. */
  hasVariations: Option[Boolean] = None,
  /* Lijst met toegewezen attribuuttermen. */
  terms: Option[Seq[ProductTerms]] = None
) extends ApiModel
