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

case class DataContinentsCountries (
  /* ISO3166 alpha-2 country code. */
  code: Option[String] = None,
  /* Default ISO4127 alpha-3 currency code for the country. */
  currencyCode: Option[String] = None,
  /* Currency symbol position for this country. */
  currencyPos: Option[String] = None,
  /* Decimal separator for displayed prices for this country. */
  decimalSep: Option[String] = None,
  /* The unit lengths are defined in for this country. */
  dimensionUnit: Option[String] = None,
  /* Full name of country. */
  name: Option[String] = None,
  /* Number of decimal points shown in displayed prices for this country. */
  numDecimals: Option[Int] = None,
  /* List of states in this country. */
  states: Option[Seq[DataContinentsStates]] = None,
  /* Thousands separator for displayed prices in this country. */
  thousandSep: Option[String] = None,
  /* The unit weights are defined in for this country. */
  weightUnit: Option[String] = None
) extends ApiModel

