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


case class CartShippingRates1(
  /* The ID of the package the shipping rates belong to. */
  packageId: Option[String] = None,
  /* Name of the package. */
  name: Option[String] = None,
  destination: Option[CartDestination] = None,
  /* List of cart items the returned shipping rates apply to. */
  items: Option[Seq[CartItems]] = None,
  /* List of shipping rates. */
  shippingRates: Option[Seq[CartShippingRates]] = None
)

