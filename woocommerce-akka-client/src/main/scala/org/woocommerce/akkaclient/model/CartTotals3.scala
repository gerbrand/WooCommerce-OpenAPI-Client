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

case class CartTotals3 (
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
  /* Totaalbedrag van alle artikelen in de winkelwagen. */
  totalItems: Option[String] = None,
  /* Totale belasting op alle artikelen in de winkelwagen. */
  totalItemsTax: Option[String] = None,
  /* Totaalbedrag van alle toegepaste kosten. */
  totalFees: Option[String] = None,
  /* Totale belasting op kosten. */
  totalFeesTax: Option[String] = None,
  /* Totale korting via toegepaste waardebonnen. */
  totalDiscount: Option[String] = None,
  /* Totale verwijderde belasting vanwege korting via toegepaste waardebonnen. */
  totalDiscountTax: Option[String] = None,
  /* Totaalbedrag van verzending. Als de verzending niet is berekend, wordt er een nul-respons verzonden. */
  totalShipping: Option[String] = None,
  /* Totale belasting op verzendkosten. Als de verzending niet is berekend, wordt er een nul-respons verzonden. */
  totalShippingTax: Option[String] = None,
  /* Totaalbedrag dat de klant moet betalen. */
  totalPrice: Option[String] = None,
  /* Totale belasting toegepast op artikelen en verzending. */
  totalTax: Option[String] = None,
  /* Regels met belastingen toegepast op artikelen en verzending. */
  taxLines: Option[Seq[CartTotals3TaxLines]] = None
) extends ApiModel

