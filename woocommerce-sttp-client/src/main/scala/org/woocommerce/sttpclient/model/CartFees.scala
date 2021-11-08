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


case class CartFees(
  /* Unique identifier for the fee within the cart. */
  id: Option[String] = None,
  /* Fee name. */
  name: Option[String] = None,
  totals: Option[CartTotals2] = None
)

