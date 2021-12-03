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

case class Batch39 (
  /* A friendly name for the webhook. */
  name: Option[String] = None,
  /* Webhook status. */
  status: Option[Batch39Enums.Status] = None,
  /* Webhook topic. */
  topic: Option[String] = None,
  /* Secret key used to generate a hash of the delivered webhook and provided in the request headers. This will default to a MD5 hash from the current user's ID|username if not provided. */
  secret: Option[String] = None
) extends ApiModel

object Batch39Enums {

  type Status = Status.Value
  object Status extends Enumeration {
    val Active = Value("active")
    val Paused = Value("paused")
    val Disabled = Value("disabled")
  }

}
