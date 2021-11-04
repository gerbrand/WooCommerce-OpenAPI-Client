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

case class ProductAttribute (
  /* Unieke identificatie voor de gegevensbron. */
  id: Option[Int] = None,
  /* Naam eigenschap. */
  name: Option[String] = None,
  /* De taxonomienaam van het attribuut. */
  taxonomy: Option[String] = None,
  /* Attribuut type. */
  `type`: Option[String] = None,
  /* Hoe termen in dit attribuut standaard worden gesorteerd. */
  order: Option[String] = None,
  /* Of dit attribuut term archiefpagina's heeft. */
  hasArchives: Option[Boolean] = None,
  /* Aantal termen in de attribuut taxonomie. */
  count: Option[Int] = None
) extends ApiModel

