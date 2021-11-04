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

case class Term (
  /* Unieke identificatie voor de gegevensbron. */
  id: Option[Int] = None,
  /* Term naam. */
  name: Option[String] = None,
  /* Op strings gebaseerde id voor de term. */
  slug: Option[String] = None,
  /* Term beschrijving. */
  description: Option[String] = None,
  /* Hoofd term ID, indien van toepassing. */
  parent: Option[Int] = None,
  /* Het aantal objecten (berichten van welk type dan ook) dat aan de term is toegewezen. */
  count: Option[Int] = None
) extends ApiModel

