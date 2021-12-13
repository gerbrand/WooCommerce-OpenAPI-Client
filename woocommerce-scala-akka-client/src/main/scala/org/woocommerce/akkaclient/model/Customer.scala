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

case class Customer (
  /* Unique identifier for the resource. */
  id: Option[Int] = None,
  /* The date the customer was created, in the site's timezone. */
  dateCreated: Option[String] = None,
  /* The date the customer was created, as GMT. */
  dateCreatedGmt: Option[String] = None,
  /* The date the customer was last modified, in the site's timezone. */
  dateModified: Option[String] = None,
  /* The date the customer was last modified, as GMT. */
  dateModifiedGmt: Option[String] = None,
  /* The email address for the customer. */
  email: Option[String] = None,
  /* Customer first name. */
  firstName: Option[String] = None,
  /* Customer last name. */
  lastName: Option[String] = None,
  /* Customer role. */
  role: Option[String] = None,
  /* Customer login name. */
  username: Option[String] = None,
  /* Customer password. */
  password: Option[String] = None,
  billing: Option[CustomersBilling] = None,
  shipping: Option[CustomersShipping] = None,
  /* Is the customer a paying customer? */
  isPayingCustomer: Option[Boolean] = None,
  /* Avatar URL. */
  avatarUrl: Option[String] = None,
  /* Meta data. */
  metaData: Option[Seq[CouponsMetaData]] = None
) extends ApiModel
