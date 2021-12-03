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

case class ReportCustomerTotal (
  /* An alphanumeric identifier for the resource. */
  slug: Option[String] = None,
  /* Customer type name. */
  name: Option[String] = None,
  /* Amount of customers. */
  total: Option[String] = None
) extends ApiModel

