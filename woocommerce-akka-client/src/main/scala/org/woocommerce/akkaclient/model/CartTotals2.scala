/**
 * wc/store
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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

case class CartTotals2 (
  /* Valutacode (in ISO format) voor de teruggegeven prijzen. */
  currencyCode: Option[String] = None,
  /* Valutateken voor de valuta dat kan worden gebruikt voor het formatteren van teruggegeven prijzen. */
  currencySymbol: Option[String] = None,
  /* Valuta kleine eenheid (aantal cijfers na het decimaalteken) voor teruggegeven prijzen. */
  currencyMinorUnit: Option[Int] = None,
  /* Decimaal scheidingsteken voor de valuta die kan worden gebruikt voor het formatteren van teruggegeven prijzen. */
  currencyDecimalSeparator: Option[String] = None,
  /* Scheidingsteken van duizendtallen voor de valuta die kan worden gebruikt voor het formatteren van teruggegeven prijzen. */
  currencyThousandSeparator: Option[String] = None,
  /* Voorvoegsel van de prijs voor de valuta welke kan worden gebruikt voor het formatteren van teruggegeven prijzen. */
  currencyPrefix: Option[String] = None,
  /* Voorvoegsel van de prijs voor de valuta welke kan worden gebruikt voor het formatteren van teruggegeven prijzen. */
  currencySuffix: Option[String] = None,
  /* Totaalbedrag voor dit tarief. */
  total: Option[String] = None,
  /* Totale belasting voor deze kosten. */
  totalTax: Option[String] = None
) extends ApiModel
