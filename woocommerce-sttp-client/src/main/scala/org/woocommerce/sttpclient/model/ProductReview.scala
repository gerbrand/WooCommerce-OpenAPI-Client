/**
 * wc/store
 * Generated OpenAPI document of the namespace wc/store on Software-Creation.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.woocommerce.sttpclient.model

import java.time.OffsetDateTime

case class ProductReview(
  /* Unique identifier for the resource. */
  id: Option[Int] = None,
  /* The date the review was created, in the site's timezone. */
  dateCreated: Option[OffsetDateTime] = None,
  /* The date the review was created, in the site's timezone in human-readable format. */
  formattedDateCreated: Option[String] = None,
  /* The date the review was created, as GMT. */
  dateCreatedGmt: Option[OffsetDateTime] = None,
  /* Unique identifier for the product that the review belongs to. */
  productId: Option[Int] = None,
  /* Name of the product that the review belongs to. */
  productName: Option[String] = None,
  /* Permalink of the product that the review belongs to. */
  productPermalink: Option[String] = None,
  productImage: Option[ProductReviewProductImage] = None,
  /* Reviewer name. */
  reviewer: Option[String] = None,
  /* The content of the review. */
  review: Option[String] = None,
  /* Review rating (0 to 5). */
  rating: Option[Int] = None,
  /* Shows if the reviewer bought the product or not. */
  verified: Option[Boolean] = None,
  reviewerAvatarUrls: Option[ProductReviewReviewerAvatarUrls] = None
)
