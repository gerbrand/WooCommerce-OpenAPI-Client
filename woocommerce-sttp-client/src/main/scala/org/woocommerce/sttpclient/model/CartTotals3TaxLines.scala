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


case class CartTotals3TaxLines(
  /* The name of the tax. */
  name: Option[String] = None,
  /* The amount of tax charged. */
  price: Option[String] = None,
  /* The rate at which tax is applied. */
  rate: Option[String] = None
)

