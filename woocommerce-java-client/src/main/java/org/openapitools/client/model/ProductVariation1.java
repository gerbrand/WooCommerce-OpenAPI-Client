/*
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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CouponsMetaData;
import org.openapitools.client.model.ProductsDefaultAttributes;
import org.openapitools.client.model.ProductsDownloads;
import org.openapitools.client.model.ProductsProductIdVariationsDimensions;
import org.openapitools.client.model.ProductsProductIdVariationsImage;

/**
 * ProductVariation1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ProductVariation1 {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_REGULAR_PRICE = "regular_price";
  @SerializedName(SERIALIZED_NAME_REGULAR_PRICE)
  private String regularPrice;

  public static final String SERIALIZED_NAME_SALE_PRICE = "sale_price";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private String salePrice;

  public static final String SERIALIZED_NAME_DATE_ON_SALE_FROM = "date_on_sale_from";
  @SerializedName(SERIALIZED_NAME_DATE_ON_SALE_FROM)
  private String dateOnSaleFrom;

  public static final String SERIALIZED_NAME_DATE_ON_SALE_FROM_GMT = "date_on_sale_from_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_ON_SALE_FROM_GMT)
  private String dateOnSaleFromGmt;

  public static final String SERIALIZED_NAME_DATE_ON_SALE_TO = "date_on_sale_to";
  @SerializedName(SERIALIZED_NAME_DATE_ON_SALE_TO)
  private String dateOnSaleTo;

  public static final String SERIALIZED_NAME_DATE_ON_SALE_TO_GMT = "date_on_sale_to_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_ON_SALE_TO_GMT)
  private String dateOnSaleToGmt;

  /**
   * Variation status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    PENDING("pending"),
    
    PRIVATE("private"),
    
    PUBLISH("publish");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_VIRTUAL = "virtual";
  @SerializedName(SERIALIZED_NAME_VIRTUAL)
  private Boolean virtual;

  public static final String SERIALIZED_NAME_DOWNLOADABLE = "downloadable";
  @SerializedName(SERIALIZED_NAME_DOWNLOADABLE)
  private Boolean downloadable;

  public static final String SERIALIZED_NAME_DOWNLOADS = "downloads";
  @SerializedName(SERIALIZED_NAME_DOWNLOADS)
  private List<ProductsDownloads> downloads = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_LIMIT = "download_limit";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_LIMIT)
  private Integer downloadLimit;

  public static final String SERIALIZED_NAME_DOWNLOAD_EXPIRY = "download_expiry";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_EXPIRY)
  private Integer downloadExpiry;

  /**
   * Tax status.
   */
  @JsonAdapter(TaxStatusEnum.Adapter.class)
  public enum TaxStatusEnum {
    TAXABLE("taxable"),
    
    SHIPPING("shipping"),
    
    NONE("none");

    private String value;

    TaxStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxStatusEnum fromValue(String value) {
      for (TaxStatusEnum b : TaxStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TAX_STATUS = "tax_status";
  @SerializedName(SERIALIZED_NAME_TAX_STATUS)
  private TaxStatusEnum taxStatus;

  public static final String SERIALIZED_NAME_TAX_CLASS = "tax_class";
  @SerializedName(SERIALIZED_NAME_TAX_CLASS)
  private String taxClass;

  public static final String SERIALIZED_NAME_MANAGE_STOCK = "manage_stock";
  @SerializedName(SERIALIZED_NAME_MANAGE_STOCK)
  private Boolean manageStock;

  public static final String SERIALIZED_NAME_STOCK_QUANTITY = "stock_quantity";
  @SerializedName(SERIALIZED_NAME_STOCK_QUANTITY)
  private Integer stockQuantity;

  /**
   * Controls the stock status of the product.
   */
  @JsonAdapter(StockStatusEnum.Adapter.class)
  public enum StockStatusEnum {
    INSTOCK("instock"),
    
    OUTOFSTOCK("outofstock"),
    
    ONBACKORDER("onbackorder");

    private String value;

    StockStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StockStatusEnum fromValue(String value) {
      for (StockStatusEnum b : StockStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StockStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StockStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StockStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StockStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STOCK_STATUS = "stock_status";
  @SerializedName(SERIALIZED_NAME_STOCK_STATUS)
  private StockStatusEnum stockStatus;

  /**
   * If managing stock, this controls if backorders are allowed.
   */
  @JsonAdapter(BackordersEnum.Adapter.class)
  public enum BackordersEnum {
    NO("no"),
    
    NOTIFY("notify"),
    
    YES("yes");

    private String value;

    BackordersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackordersEnum fromValue(String value) {
      for (BackordersEnum b : BackordersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BackordersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackordersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackordersEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BackordersEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BACKORDERS = "backorders";
  @SerializedName(SERIALIZED_NAME_BACKORDERS)
  private BackordersEnum backorders;

  public static final String SERIALIZED_NAME_LOW_STOCK_AMOUNT = "low_stock_amount";
  @SerializedName(SERIALIZED_NAME_LOW_STOCK_AMOUNT)
  private Integer lowStockAmount;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private String weight;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private ProductsProductIdVariationsDimensions dimensions;

  public static final String SERIALIZED_NAME_SHIPPING_CLASS = "shipping_class";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CLASS)
  private String shippingClass;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ProductsProductIdVariationsImage image;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<ProductsDefaultAttributes> attributes = null;

  public static final String SERIALIZED_NAME_MENU_ORDER = "menu_order";
  @SerializedName(SERIALIZED_NAME_MENU_ORDER)
  private Integer menuOrder;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private List<CouponsMetaData> metaData = null;


  public ProductVariation1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Variation description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductVariation1 sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Unique identifier.
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public ProductVariation1 regularPrice(String regularPrice) {
    
    this.regularPrice = regularPrice;
    return this;
  }

   /**
   * Variation regular price.
   * @return regularPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation regular price.")

  public String getRegularPrice() {
    return regularPrice;
  }


  public void setRegularPrice(String regularPrice) {
    this.regularPrice = regularPrice;
  }


  public ProductVariation1 salePrice(String salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Variation sale price.
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation sale price.")

  public String getSalePrice() {
    return salePrice;
  }


  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }


  public ProductVariation1 dateOnSaleFrom(String dateOnSaleFrom) {
    
    this.dateOnSaleFrom = dateOnSaleFrom;
    return this;
  }

   /**
   * Start date of sale price, in the site&#39;s timezone.
   * @return dateOnSaleFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date of sale price, in the site's timezone.")

  public String getDateOnSaleFrom() {
    return dateOnSaleFrom;
  }


  public void setDateOnSaleFrom(String dateOnSaleFrom) {
    this.dateOnSaleFrom = dateOnSaleFrom;
  }


  public ProductVariation1 dateOnSaleFromGmt(String dateOnSaleFromGmt) {
    
    this.dateOnSaleFromGmt = dateOnSaleFromGmt;
    return this;
  }

   /**
   * Start date of sale price, as GMT.
   * @return dateOnSaleFromGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date of sale price, as GMT.")

  public String getDateOnSaleFromGmt() {
    return dateOnSaleFromGmt;
  }


  public void setDateOnSaleFromGmt(String dateOnSaleFromGmt) {
    this.dateOnSaleFromGmt = dateOnSaleFromGmt;
  }


  public ProductVariation1 dateOnSaleTo(String dateOnSaleTo) {
    
    this.dateOnSaleTo = dateOnSaleTo;
    return this;
  }

   /**
   * End date of sale price, in the site&#39;s timezone.
   * @return dateOnSaleTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date of sale price, in the site's timezone.")

  public String getDateOnSaleTo() {
    return dateOnSaleTo;
  }


  public void setDateOnSaleTo(String dateOnSaleTo) {
    this.dateOnSaleTo = dateOnSaleTo;
  }


  public ProductVariation1 dateOnSaleToGmt(String dateOnSaleToGmt) {
    
    this.dateOnSaleToGmt = dateOnSaleToGmt;
    return this;
  }

   /**
   * End date of sale price, in the site&#39;s timezone.
   * @return dateOnSaleToGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date of sale price, in the site's timezone.")

  public String getDateOnSaleToGmt() {
    return dateOnSaleToGmt;
  }


  public void setDateOnSaleToGmt(String dateOnSaleToGmt) {
    this.dateOnSaleToGmt = dateOnSaleToGmt;
  }


  public ProductVariation1 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Variation status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation status.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ProductVariation1 virtual(Boolean virtual) {
    
    this.virtual = virtual;
    return this;
  }

   /**
   * If the variation is virtual.
   * @return virtual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the variation is virtual.")

  public Boolean getVirtual() {
    return virtual;
  }


  public void setVirtual(Boolean virtual) {
    this.virtual = virtual;
  }


  public ProductVariation1 downloadable(Boolean downloadable) {
    
    this.downloadable = downloadable;
    return this;
  }

   /**
   * If the variation is downloadable.
   * @return downloadable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the variation is downloadable.")

  public Boolean getDownloadable() {
    return downloadable;
  }


  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }


  public ProductVariation1 downloads(List<ProductsDownloads> downloads) {
    
    this.downloads = downloads;
    return this;
  }

  public ProductVariation1 addDownloadsItem(ProductsDownloads downloadsItem) {
    if (this.downloads == null) {
      this.downloads = new ArrayList<ProductsDownloads>();
    }
    this.downloads.add(downloadsItem);
    return this;
  }

   /**
   * List of downloadable files.
   * @return downloads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of downloadable files.")

  public List<ProductsDownloads> getDownloads() {
    return downloads;
  }


  public void setDownloads(List<ProductsDownloads> downloads) {
    this.downloads = downloads;
  }


  public ProductVariation1 downloadLimit(Integer downloadLimit) {
    
    this.downloadLimit = downloadLimit;
    return this;
  }

   /**
   * Number of times downloadable files can be downloaded after purchase.
   * @return downloadLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times downloadable files can be downloaded after purchase.")

  public Integer getDownloadLimit() {
    return downloadLimit;
  }


  public void setDownloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
  }


  public ProductVariation1 downloadExpiry(Integer downloadExpiry) {
    
    this.downloadExpiry = downloadExpiry;
    return this;
  }

   /**
   * Number of days until access to downloadable files expires.
   * @return downloadExpiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days until access to downloadable files expires.")

  public Integer getDownloadExpiry() {
    return downloadExpiry;
  }


  public void setDownloadExpiry(Integer downloadExpiry) {
    this.downloadExpiry = downloadExpiry;
  }


  public ProductVariation1 taxStatus(TaxStatusEnum taxStatus) {
    
    this.taxStatus = taxStatus;
    return this;
  }

   /**
   * Tax status.
   * @return taxStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax status.")

  public TaxStatusEnum getTaxStatus() {
    return taxStatus;
  }


  public void setTaxStatus(TaxStatusEnum taxStatus) {
    this.taxStatus = taxStatus;
  }


  public ProductVariation1 taxClass(String taxClass) {
    
    this.taxClass = taxClass;
    return this;
  }

   /**
   * Tax class.
   * @return taxClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax class.")

  public String getTaxClass() {
    return taxClass;
  }


  public void setTaxClass(String taxClass) {
    this.taxClass = taxClass;
  }


  public ProductVariation1 manageStock(Boolean manageStock) {
    
    this.manageStock = manageStock;
    return this;
  }

   /**
   * Stock management at variation level.
   * @return manageStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stock management at variation level.")

  public Boolean getManageStock() {
    return manageStock;
  }


  public void setManageStock(Boolean manageStock) {
    this.manageStock = manageStock;
  }


  public ProductVariation1 stockQuantity(Integer stockQuantity) {
    
    this.stockQuantity = stockQuantity;
    return this;
  }

   /**
   * Stock quantity.
   * @return stockQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stock quantity.")

  public Integer getStockQuantity() {
    return stockQuantity;
  }


  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }


  public ProductVariation1 stockStatus(StockStatusEnum stockStatus) {
    
    this.stockStatus = stockStatus;
    return this;
  }

   /**
   * Controls the stock status of the product.
   * @return stockStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls the stock status of the product.")

  public StockStatusEnum getStockStatus() {
    return stockStatus;
  }


  public void setStockStatus(StockStatusEnum stockStatus) {
    this.stockStatus = stockStatus;
  }


  public ProductVariation1 backorders(BackordersEnum backorders) {
    
    this.backorders = backorders;
    return this;
  }

   /**
   * If managing stock, this controls if backorders are allowed.
   * @return backorders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If managing stock, this controls if backorders are allowed.")

  public BackordersEnum getBackorders() {
    return backorders;
  }


  public void setBackorders(BackordersEnum backorders) {
    this.backorders = backorders;
  }


  public ProductVariation1 lowStockAmount(Integer lowStockAmount) {
    
    this.lowStockAmount = lowStockAmount;
    return this;
  }

   /**
   * Low Stock amount for the variation.
   * @return lowStockAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Low Stock amount for the variation.")

  public Integer getLowStockAmount() {
    return lowStockAmount;
  }


  public void setLowStockAmount(Integer lowStockAmount) {
    this.lowStockAmount = lowStockAmount;
  }


  public ProductVariation1 weight(String weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Variation weight (kg).
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation weight (kg).")

  public String getWeight() {
    return weight;
  }


  public void setWeight(String weight) {
    this.weight = weight;
  }


  public ProductVariation1 dimensions(ProductsProductIdVariationsDimensions dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductsProductIdVariationsDimensions getDimensions() {
    return dimensions;
  }


  public void setDimensions(ProductsProductIdVariationsDimensions dimensions) {
    this.dimensions = dimensions;
  }


  public ProductVariation1 shippingClass(String shippingClass) {
    
    this.shippingClass = shippingClass;
    return this;
  }

   /**
   * Shipping class slug.
   * @return shippingClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping class slug.")

  public String getShippingClass() {
    return shippingClass;
  }


  public void setShippingClass(String shippingClass) {
    this.shippingClass = shippingClass;
  }


  public ProductVariation1 image(ProductsProductIdVariationsImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductsProductIdVariationsImage getImage() {
    return image;
  }


  public void setImage(ProductsProductIdVariationsImage image) {
    this.image = image;
  }


  public ProductVariation1 attributes(List<ProductsDefaultAttributes> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ProductVariation1 addAttributesItem(ProductsDefaultAttributes attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ProductsDefaultAttributes>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of attributes.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attributes.")

  public List<ProductsDefaultAttributes> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<ProductsDefaultAttributes> attributes) {
    this.attributes = attributes;
  }


  public ProductVariation1 menuOrder(Integer menuOrder) {
    
    this.menuOrder = menuOrder;
    return this;
  }

   /**
   * Menu order, used to custom sort products.
   * @return menuOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Menu order, used to custom sort products.")

  public Integer getMenuOrder() {
    return menuOrder;
  }


  public void setMenuOrder(Integer menuOrder) {
    this.menuOrder = menuOrder;
  }


  public ProductVariation1 metaData(List<CouponsMetaData> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public ProductVariation1 addMetaDataItem(CouponsMetaData metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new ArrayList<CouponsMetaData>();
    }
    this.metaData.add(metaDataItem);
    return this;
  }

   /**
   * Meta data.
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Meta data.")

  public List<CouponsMetaData> getMetaData() {
    return metaData;
  }


  public void setMetaData(List<CouponsMetaData> metaData) {
    this.metaData = metaData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariation1 productVariation1 = (ProductVariation1) o;
    return Objects.equals(this.description, productVariation1.description) &&
        Objects.equals(this.sku, productVariation1.sku) &&
        Objects.equals(this.regularPrice, productVariation1.regularPrice) &&
        Objects.equals(this.salePrice, productVariation1.salePrice) &&
        Objects.equals(this.dateOnSaleFrom, productVariation1.dateOnSaleFrom) &&
        Objects.equals(this.dateOnSaleFromGmt, productVariation1.dateOnSaleFromGmt) &&
        Objects.equals(this.dateOnSaleTo, productVariation1.dateOnSaleTo) &&
        Objects.equals(this.dateOnSaleToGmt, productVariation1.dateOnSaleToGmt) &&
        Objects.equals(this.status, productVariation1.status) &&
        Objects.equals(this.virtual, productVariation1.virtual) &&
        Objects.equals(this.downloadable, productVariation1.downloadable) &&
        Objects.equals(this.downloads, productVariation1.downloads) &&
        Objects.equals(this.downloadLimit, productVariation1.downloadLimit) &&
        Objects.equals(this.downloadExpiry, productVariation1.downloadExpiry) &&
        Objects.equals(this.taxStatus, productVariation1.taxStatus) &&
        Objects.equals(this.taxClass, productVariation1.taxClass) &&
        Objects.equals(this.manageStock, productVariation1.manageStock) &&
        Objects.equals(this.stockQuantity, productVariation1.stockQuantity) &&
        Objects.equals(this.stockStatus, productVariation1.stockStatus) &&
        Objects.equals(this.backorders, productVariation1.backorders) &&
        Objects.equals(this.lowStockAmount, productVariation1.lowStockAmount) &&
        Objects.equals(this.weight, productVariation1.weight) &&
        Objects.equals(this.dimensions, productVariation1.dimensions) &&
        Objects.equals(this.shippingClass, productVariation1.shippingClass) &&
        Objects.equals(this.image, productVariation1.image) &&
        Objects.equals(this.attributes, productVariation1.attributes) &&
        Objects.equals(this.menuOrder, productVariation1.menuOrder) &&
        Objects.equals(this.metaData, productVariation1.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, sku, regularPrice, salePrice, dateOnSaleFrom, dateOnSaleFromGmt, dateOnSaleTo, dateOnSaleToGmt, status, virtual, downloadable, downloads, downloadLimit, downloadExpiry, taxStatus, taxClass, manageStock, stockQuantity, stockStatus, backorders, lowStockAmount, weight, dimensions, shippingClass, image, attributes, menuOrder, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariation1 {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    regularPrice: ").append(toIndentedString(regularPrice)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    dateOnSaleFrom: ").append(toIndentedString(dateOnSaleFrom)).append("\n");
    sb.append("    dateOnSaleFromGmt: ").append(toIndentedString(dateOnSaleFromGmt)).append("\n");
    sb.append("    dateOnSaleTo: ").append(toIndentedString(dateOnSaleTo)).append("\n");
    sb.append("    dateOnSaleToGmt: ").append(toIndentedString(dateOnSaleToGmt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    virtual: ").append(toIndentedString(virtual)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
    sb.append("    downloadLimit: ").append(toIndentedString(downloadLimit)).append("\n");
    sb.append("    downloadExpiry: ").append(toIndentedString(downloadExpiry)).append("\n");
    sb.append("    taxStatus: ").append(toIndentedString(taxStatus)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    manageStock: ").append(toIndentedString(manageStock)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    backorders: ").append(toIndentedString(backorders)).append("\n");
    sb.append("    lowStockAmount: ").append(toIndentedString(lowStockAmount)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    shippingClass: ").append(toIndentedString(shippingClass)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    menuOrder: ").append(toIndentedString(menuOrder)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

