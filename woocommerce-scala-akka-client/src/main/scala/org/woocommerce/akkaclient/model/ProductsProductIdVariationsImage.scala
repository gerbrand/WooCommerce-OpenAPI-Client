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

import java.net.URI
import org.woocommerce.akkaclient.core.ApiModel

case class ProductsProductIdVariationsImage (
  /* Image ID. */
  id: Option[Int] = None,
  /* The date the image was created, in the site's timezone. */
  dateCreated: Option[String] = None,
  /* The date the image was created, as GMT. */
  dateCreatedGmt: Option[String] = None,
  /* The date the image was last modified, in the site's timezone. */
  dateModified: Option[String] = None,
  /* The date the image was last modified, as GMT. */
  dateModifiedGmt: Option[String] = None,
  /* Image URL. */
  src: Option[URI] = None,
  /* Image name. */
  name: Option[String] = None,
  /* Image alternative text. */
  alt: Option[String] = None
) extends ApiModel

