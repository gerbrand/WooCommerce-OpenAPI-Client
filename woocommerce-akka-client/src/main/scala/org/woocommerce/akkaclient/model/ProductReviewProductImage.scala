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

import java.net.URI
import org.woocommerce.akkaclient.core.ApiModel

case class ProductReviewProductImage (
  /* Afbeelding ID. */
  id: Option[Int] = None,
  /* Volledige grootte afbeelding URL. */
  src: Option[URI] = None,
  /* URL van thumbnail. */
  thumbnail: Option[URI] = None,
  /* Srcset van thumbnail voor responsive afbeeldingen. */
  srcset: Option[String] = None,
  /* Grootte van thumbnail voor responsive afbeeldingen. */
  sizes: Option[String] = None,
  /* Naam afbeelding. */
  name: Option[String] = None,
  /* Alternatieve tekst afbeelding. */
  alt: Option[String] = None
) extends ApiModel

