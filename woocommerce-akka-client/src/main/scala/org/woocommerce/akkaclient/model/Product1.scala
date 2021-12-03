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

import java.net.URI
import org.woocommerce.akkaclient.core.ApiModel

case class Product1 (
  /* Product name. */
  name: Option[String] = None,
  /* Product slug. */
  slug: Option[String] = None,
  /* The date the product was created, in the site's timezone. */
  dateCreated: Option[String] = None,
  /* The date the product was created, as GMT. */
  dateCreatedGmt: Option[String] = None,
  /* Product type. */
  `type`: Option[Product1Enums.`Type`] = None,
  /* Product status (post status). */
  status: Option[Product1Enums.Status] = None,
  /* Featured product. */
  featured: Option[Boolean] = None,
  /* Catalog visibility. */
  catalogVisibility: Option[Product1Enums.CatalogVisibility] = None,
  /* Product description. */
  description: Option[String] = None,
  /* Product short description. */
  shortDescription: Option[String] = None,
  /* Unique identifier. */
  sku: Option[String] = None,
  /* Product regular price. */
  regularPrice: Option[String] = None,
  /* Product sale price. */
  salePrice: Option[String] = None,
  /* Start date of sale price, in the site's timezone. */
  dateOnSaleFrom: Option[String] = None,
  /* Start date of sale price, as GMT. */
  dateOnSaleFromGmt: Option[String] = None,
  /* End date of sale price, in the site's timezone. */
  dateOnSaleTo: Option[String] = None,
  /* End date of sale price, in the site's timezone. */
  dateOnSaleToGmt: Option[String] = None,
  /* If the product is virtual. */
  virtual: Option[Boolean] = None,
  /* If the product is downloadable. */
  downloadable: Option[Boolean] = None,
  /* List of downloadable files. */
  downloads: Option[Seq[ProductsDownloads]] = None,
  /* Number of times downloadable files can be downloaded after purchase. */
  downloadLimit: Option[Int] = None,
  /* Number of days until access to downloadable files expires. */
  downloadExpiry: Option[Int] = None,
  /* Product external URL. Only for external products. */
  externalUrl: Option[URI] = None,
  /* Product external button text. Only for external products. */
  buttonText: Option[String] = None,
  /* Tax status. */
  taxStatus: Option[Product1Enums.TaxStatus] = None,
  /* Tax class. */
  taxClass: Option[String] = None,
  /* Stock management at product level. */
  manageStock: Option[Boolean] = None,
  /* Stock quantity. */
  stockQuantity: Option[Int] = None,
  /* Controls the stock status of the product. */
  stockStatus: Option[Product1Enums.StockStatus] = None,
  /* If managing stock, this controls if backorders are allowed. */
  backorders: Option[Product1Enums.Backorders] = None,
  /* Low Stock amount for the product. */
  lowStockAmount: Option[Int] = None,
  /* Allow one item to be bought in a single order. */
  soldIndividually: Option[Boolean] = None,
  /* Product weight (kg). */
  weight: Option[String] = None,
  dimensions: Option[ProductsDimensions] = None,
  /* Shipping class slug. */
  shippingClass: Option[String] = None,
  /* Allow reviews. */
  reviewsAllowed: Option[Boolean] = None,
  /* List of up-sell products IDs. */
  upsellIds: Option[Seq[Int]] = None,
  /* List of cross-sell products IDs. */
  crossSellIds: Option[Seq[Int]] = None,
  /* Product parent ID. */
  parentId: Option[Int] = None,
  /* Optional note to send the customer after purchase. */
  purchaseNote: Option[String] = None,
  /* List of categories. */
  categories: Option[Seq[ProductsCategories]] = None,
  /* List of tags. */
  tags: Option[Seq[ProductsTags]] = None,
  /* List of images. */
  images: Option[Seq[ProductsImages]] = None,
  /* List of attributes. */
  attributes: Option[Seq[ProductsAttributes]] = None,
  /* Defaults variation attributes. */
  defaultAttributes: Option[Seq[ProductsDefaultAttributes]] = None,
  /* Menu order, used to custom sort products. */
  menuOrder: Option[Int] = None,
  /* Meta data. */
  metaData: Option[Seq[CouponsMetaData]] = None
) extends ApiModel

object Product1Enums {

  type `Type` = `Type`.Value
  type Status = Status.Value
  type CatalogVisibility = CatalogVisibility.Value
  type TaxStatus = TaxStatus.Value
  type StockStatus = StockStatus.Value
  type Backorders = Backorders.Value
  object `Type` extends Enumeration {
    val Simple = Value("simple")
    val Grouped = Value("grouped")
    val External = Value("external")
    val Variable = Value("variable")
  }

  object Status extends Enumeration {
    val Draft = Value("draft")
    val Pending = Value("pending")
    val `Private` = Value("private")
    val Publish = Value("publish")
    val Future = Value("future")
  }

  object CatalogVisibility extends Enumeration {
    val Visible = Value("visible")
    val Catalog = Value("catalog")
    val Search = Value("search")
    val Hidden = Value("hidden")
  }

  object TaxStatus extends Enumeration {
    val Taxable = Value("taxable")
    val Shipping = Value("shipping")
    val None = Value("none")
  }

  object StockStatus extends Enumeration {
    val Instock = Value("instock")
    val Outofstock = Value("outofstock")
    val Onbackorder = Value("onbackorder")
  }

  object Backorders extends Enumeration {
    val No = Value("no")
    val Notify = Value("notify")
    val Yes = Value("yes")
  }

}
