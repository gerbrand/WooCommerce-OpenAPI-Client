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

case class Batch27 (
  /* Tag name. */
  name: Option[String] = None,
  /* An alphanumeric identifier for the resource unique to its type. */
  slug: Option[String] = None,
  /* HTML description of the resource. */
  description: Option[String] = None
) extends ApiModel

