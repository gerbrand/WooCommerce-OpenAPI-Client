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

/**
 * ShopCoupon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ShopCoupon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_CREATED_GMT = "date_created_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_GMT)
  private String dateCreatedGmt;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private String dateModified;

  public static final String SERIALIZED_NAME_DATE_MODIFIED_GMT = "date_modified_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED_GMT)
  private String dateModifiedGmt;

  /**
   * Determines the type of discount that will be applied.
   */
  @JsonAdapter(DiscountTypeEnum.Adapter.class)
  public enum DiscountTypeEnum {
    PERCENT("percent"),
    
    FIXED_CART("fixed_cart"),
    
    FIXED_PRODUCT("fixed_product");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiscountTypeEnum fromValue(String value) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DiscountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DiscountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discount_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private DiscountTypeEnum discountType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATE_EXPIRES = "date_expires";
  @SerializedName(SERIALIZED_NAME_DATE_EXPIRES)
  private String dateExpires;

  public static final String SERIALIZED_NAME_DATE_EXPIRES_GMT = "date_expires_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_EXPIRES_GMT)
  private String dateExpiresGmt;

  public static final String SERIALIZED_NAME_USAGE_COUNT = "usage_count";
  @SerializedName(SERIALIZED_NAME_USAGE_COUNT)
  private Integer usageCount;

  public static final String SERIALIZED_NAME_INDIVIDUAL_USE = "individual_use";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_USE)
  private Boolean individualUse;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Integer> productIds = null;

  public static final String SERIALIZED_NAME_EXCLUDED_PRODUCT_IDS = "excluded_product_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_PRODUCT_IDS)
  private List<Integer> excludedProductIds = null;

  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usage_limit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_USAGE_LIMIT_PER_USER = "usage_limit_per_user";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT_PER_USER)
  private Integer usageLimitPerUser;

  public static final String SERIALIZED_NAME_LIMIT_USAGE_TO_X_ITEMS = "limit_usage_to_x_items";
  @SerializedName(SERIALIZED_NAME_LIMIT_USAGE_TO_X_ITEMS)
  private Integer limitUsageToXItems;

  public static final String SERIALIZED_NAME_FREE_SHIPPING = "free_shipping";
  @SerializedName(SERIALIZED_NAME_FREE_SHIPPING)
  private Boolean freeShipping;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORIES = "product_categories";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORIES)
  private List<Integer> productCategories = null;

  public static final String SERIALIZED_NAME_EXCLUDED_PRODUCT_CATEGORIES = "excluded_product_categories";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_PRODUCT_CATEGORIES)
  private List<Integer> excludedProductCategories = null;

  public static final String SERIALIZED_NAME_EXCLUDE_SALE_ITEMS = "exclude_sale_items";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SALE_ITEMS)
  private Boolean excludeSaleItems;

  public static final String SERIALIZED_NAME_MINIMUM_AMOUNT = "minimum_amount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_AMOUNT)
  private String minimumAmount;

  public static final String SERIALIZED_NAME_MAXIMUM_AMOUNT = "maximum_amount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_AMOUNT)
  private String maximumAmount;

  public static final String SERIALIZED_NAME_EMAIL_RESTRICTIONS = "email_restrictions";
  @SerializedName(SERIALIZED_NAME_EMAIL_RESTRICTIONS)
  private List<String> emailRestrictions = null;

  public static final String SERIALIZED_NAME_USED_BY = "used_by";
  @SerializedName(SERIALIZED_NAME_USED_BY)
  private List<Integer> usedBy = null;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private List<CouponsMetaData> metaData = null;


  public ShopCoupon id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the object.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ShopCoupon code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Coupon code.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Coupon code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ShopCoupon amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of discount. Should always be numeric, even if setting a percentage.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of discount. Should always be numeric, even if setting a percentage.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ShopCoupon dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date the coupon was created, in the site&#39;s timezone.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the coupon was created, in the site's timezone.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ShopCoupon dateCreatedGmt(String dateCreatedGmt) {
    
    this.dateCreatedGmt = dateCreatedGmt;
    return this;
  }

   /**
   * The date the coupon was created, as GMT.
   * @return dateCreatedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the coupon was created, as GMT.")

  public String getDateCreatedGmt() {
    return dateCreatedGmt;
  }


  public void setDateCreatedGmt(String dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
  }


  public ShopCoupon dateModified(String dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The date the coupon was last modified, in the site&#39;s timezone.
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the coupon was last modified, in the site's timezone.")

  public String getDateModified() {
    return dateModified;
  }


  public void setDateModified(String dateModified) {
    this.dateModified = dateModified;
  }


  public ShopCoupon dateModifiedGmt(String dateModifiedGmt) {
    
    this.dateModifiedGmt = dateModifiedGmt;
    return this;
  }

   /**
   * The date the coupon was last modified, as GMT.
   * @return dateModifiedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the coupon was last modified, as GMT.")

  public String getDateModifiedGmt() {
    return dateModifiedGmt;
  }


  public void setDateModifiedGmt(String dateModifiedGmt) {
    this.dateModifiedGmt = dateModifiedGmt;
  }


  public ShopCoupon discountType(DiscountTypeEnum discountType) {
    
    this.discountType = discountType;
    return this;
  }

   /**
   * Determines the type of discount that will be applied.
   * @return discountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines the type of discount that will be applied.")

  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }


  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }


  public ShopCoupon description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Coupon description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Coupon description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ShopCoupon dateExpires(String dateExpires) {
    
    this.dateExpires = dateExpires;
    return this;
  }

   /**
   * The date the coupon expires, in the site&#39;s timezone.
   * @return dateExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the coupon expires, in the site's timezone.")

  public String getDateExpires() {
    return dateExpires;
  }


  public void setDateExpires(String dateExpires) {
    this.dateExpires = dateExpires;
  }


  public ShopCoupon dateExpiresGmt(String dateExpiresGmt) {
    
    this.dateExpiresGmt = dateExpiresGmt;
    return this;
  }

   /**
   * The date the coupon expires, as GMT.
   * @return dateExpiresGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the coupon expires, as GMT.")

  public String getDateExpiresGmt() {
    return dateExpiresGmt;
  }


  public void setDateExpiresGmt(String dateExpiresGmt) {
    this.dateExpiresGmt = dateExpiresGmt;
  }


  public ShopCoupon usageCount(Integer usageCount) {
    
    this.usageCount = usageCount;
    return this;
  }

   /**
   * Number of times the coupon has been used already.
   * @return usageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times the coupon has been used already.")

  public Integer getUsageCount() {
    return usageCount;
  }


  public void setUsageCount(Integer usageCount) {
    this.usageCount = usageCount;
  }


  public ShopCoupon individualUse(Boolean individualUse) {
    
    this.individualUse = individualUse;
    return this;
  }

   /**
   * If true, the coupon can only be used individually. Other applied coupons will be removed from the cart.
   * @return individualUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the coupon can only be used individually. Other applied coupons will be removed from the cart.")

  public Boolean getIndividualUse() {
    return individualUse;
  }


  public void setIndividualUse(Boolean individualUse) {
    this.individualUse = individualUse;
  }


  public ShopCoupon productIds(List<Integer> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public ShopCoupon addProductIdsItem(Integer productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<Integer>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * List of product IDs the coupon can be used on.
   * @return productIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of product IDs the coupon can be used on.")

  public List<Integer> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Integer> productIds) {
    this.productIds = productIds;
  }


  public ShopCoupon excludedProductIds(List<Integer> excludedProductIds) {
    
    this.excludedProductIds = excludedProductIds;
    return this;
  }

  public ShopCoupon addExcludedProductIdsItem(Integer excludedProductIdsItem) {
    if (this.excludedProductIds == null) {
      this.excludedProductIds = new ArrayList<Integer>();
    }
    this.excludedProductIds.add(excludedProductIdsItem);
    return this;
  }

   /**
   * List of product IDs the coupon cannot be used on.
   * @return excludedProductIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of product IDs the coupon cannot be used on.")

  public List<Integer> getExcludedProductIds() {
    return excludedProductIds;
  }


  public void setExcludedProductIds(List<Integer> excludedProductIds) {
    this.excludedProductIds = excludedProductIds;
  }


  public ShopCoupon usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * How many times the coupon can be used in total.
   * @return usageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many times the coupon can be used in total.")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public ShopCoupon usageLimitPerUser(Integer usageLimitPerUser) {
    
    this.usageLimitPerUser = usageLimitPerUser;
    return this;
  }

   /**
   * How many times the coupon can be used per customer.
   * @return usageLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many times the coupon can be used per customer.")

  public Integer getUsageLimitPerUser() {
    return usageLimitPerUser;
  }


  public void setUsageLimitPerUser(Integer usageLimitPerUser) {
    this.usageLimitPerUser = usageLimitPerUser;
  }


  public ShopCoupon limitUsageToXItems(Integer limitUsageToXItems) {
    
    this.limitUsageToXItems = limitUsageToXItems;
    return this;
  }

   /**
   * Max number of items in the cart the coupon can be applied to.
   * @return limitUsageToXItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max number of items in the cart the coupon can be applied to.")

  public Integer getLimitUsageToXItems() {
    return limitUsageToXItems;
  }


  public void setLimitUsageToXItems(Integer limitUsageToXItems) {
    this.limitUsageToXItems = limitUsageToXItems;
  }


  public ShopCoupon freeShipping(Boolean freeShipping) {
    
    this.freeShipping = freeShipping;
    return this;
  }

   /**
   * If true and if the free shipping method requires a coupon, this coupon will enable free shipping.
   * @return freeShipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true and if the free shipping method requires a coupon, this coupon will enable free shipping.")

  public Boolean getFreeShipping() {
    return freeShipping;
  }


  public void setFreeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
  }


  public ShopCoupon productCategories(List<Integer> productCategories) {
    
    this.productCategories = productCategories;
    return this;
  }

  public ShopCoupon addProductCategoriesItem(Integer productCategoriesItem) {
    if (this.productCategories == null) {
      this.productCategories = new ArrayList<Integer>();
    }
    this.productCategories.add(productCategoriesItem);
    return this;
  }

   /**
   * List of category IDs the coupon applies to.
   * @return productCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of category IDs the coupon applies to.")

  public List<Integer> getProductCategories() {
    return productCategories;
  }


  public void setProductCategories(List<Integer> productCategories) {
    this.productCategories = productCategories;
  }


  public ShopCoupon excludedProductCategories(List<Integer> excludedProductCategories) {
    
    this.excludedProductCategories = excludedProductCategories;
    return this;
  }

  public ShopCoupon addExcludedProductCategoriesItem(Integer excludedProductCategoriesItem) {
    if (this.excludedProductCategories == null) {
      this.excludedProductCategories = new ArrayList<Integer>();
    }
    this.excludedProductCategories.add(excludedProductCategoriesItem);
    return this;
  }

   /**
   * List of category IDs the coupon does not apply to.
   * @return excludedProductCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of category IDs the coupon does not apply to.")

  public List<Integer> getExcludedProductCategories() {
    return excludedProductCategories;
  }


  public void setExcludedProductCategories(List<Integer> excludedProductCategories) {
    this.excludedProductCategories = excludedProductCategories;
  }


  public ShopCoupon excludeSaleItems(Boolean excludeSaleItems) {
    
    this.excludeSaleItems = excludeSaleItems;
    return this;
  }

   /**
   * If true, this coupon will not be applied to items that have sale prices.
   * @return excludeSaleItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this coupon will not be applied to items that have sale prices.")

  public Boolean getExcludeSaleItems() {
    return excludeSaleItems;
  }


  public void setExcludeSaleItems(Boolean excludeSaleItems) {
    this.excludeSaleItems = excludeSaleItems;
  }


  public ShopCoupon minimumAmount(String minimumAmount) {
    
    this.minimumAmount = minimumAmount;
    return this;
  }

   /**
   * Minimum order amount that needs to be in the cart before coupon applies.
   * @return minimumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum order amount that needs to be in the cart before coupon applies.")

  public String getMinimumAmount() {
    return minimumAmount;
  }


  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }


  public ShopCoupon maximumAmount(String maximumAmount) {
    
    this.maximumAmount = maximumAmount;
    return this;
  }

   /**
   * Maximum order amount allowed when using the coupon.
   * @return maximumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum order amount allowed when using the coupon.")

  public String getMaximumAmount() {
    return maximumAmount;
  }


  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }


  public ShopCoupon emailRestrictions(List<String> emailRestrictions) {
    
    this.emailRestrictions = emailRestrictions;
    return this;
  }

  public ShopCoupon addEmailRestrictionsItem(String emailRestrictionsItem) {
    if (this.emailRestrictions == null) {
      this.emailRestrictions = new ArrayList<String>();
    }
    this.emailRestrictions.add(emailRestrictionsItem);
    return this;
  }

   /**
   * List of email addresses that can use this coupon.
   * @return emailRestrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of email addresses that can use this coupon.")

  public List<String> getEmailRestrictions() {
    return emailRestrictions;
  }


  public void setEmailRestrictions(List<String> emailRestrictions) {
    this.emailRestrictions = emailRestrictions;
  }


  public ShopCoupon usedBy(List<Integer> usedBy) {
    
    this.usedBy = usedBy;
    return this;
  }

  public ShopCoupon addUsedByItem(Integer usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<Integer>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * List of user IDs (or guest email addresses) that have used the coupon.
   * @return usedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of user IDs (or guest email addresses) that have used the coupon.")

  public List<Integer> getUsedBy() {
    return usedBy;
  }


  public void setUsedBy(List<Integer> usedBy) {
    this.usedBy = usedBy;
  }


  public ShopCoupon metaData(List<CouponsMetaData> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public ShopCoupon addMetaDataItem(CouponsMetaData metaDataItem) {
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
    ShopCoupon shopCoupon = (ShopCoupon) o;
    return Objects.equals(this.id, shopCoupon.id) &&
        Objects.equals(this.code, shopCoupon.code) &&
        Objects.equals(this.amount, shopCoupon.amount) &&
        Objects.equals(this.dateCreated, shopCoupon.dateCreated) &&
        Objects.equals(this.dateCreatedGmt, shopCoupon.dateCreatedGmt) &&
        Objects.equals(this.dateModified, shopCoupon.dateModified) &&
        Objects.equals(this.dateModifiedGmt, shopCoupon.dateModifiedGmt) &&
        Objects.equals(this.discountType, shopCoupon.discountType) &&
        Objects.equals(this.description, shopCoupon.description) &&
        Objects.equals(this.dateExpires, shopCoupon.dateExpires) &&
        Objects.equals(this.dateExpiresGmt, shopCoupon.dateExpiresGmt) &&
        Objects.equals(this.usageCount, shopCoupon.usageCount) &&
        Objects.equals(this.individualUse, shopCoupon.individualUse) &&
        Objects.equals(this.productIds, shopCoupon.productIds) &&
        Objects.equals(this.excludedProductIds, shopCoupon.excludedProductIds) &&
        Objects.equals(this.usageLimit, shopCoupon.usageLimit) &&
        Objects.equals(this.usageLimitPerUser, shopCoupon.usageLimitPerUser) &&
        Objects.equals(this.limitUsageToXItems, shopCoupon.limitUsageToXItems) &&
        Objects.equals(this.freeShipping, shopCoupon.freeShipping) &&
        Objects.equals(this.productCategories, shopCoupon.productCategories) &&
        Objects.equals(this.excludedProductCategories, shopCoupon.excludedProductCategories) &&
        Objects.equals(this.excludeSaleItems, shopCoupon.excludeSaleItems) &&
        Objects.equals(this.minimumAmount, shopCoupon.minimumAmount) &&
        Objects.equals(this.maximumAmount, shopCoupon.maximumAmount) &&
        Objects.equals(this.emailRestrictions, shopCoupon.emailRestrictions) &&
        Objects.equals(this.usedBy, shopCoupon.usedBy) &&
        Objects.equals(this.metaData, shopCoupon.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, amount, dateCreated, dateCreatedGmt, dateModified, dateModifiedGmt, discountType, description, dateExpires, dateExpiresGmt, usageCount, individualUse, productIds, excludedProductIds, usageLimit, usageLimitPerUser, limitUsageToXItems, freeShipping, productCategories, excludedProductCategories, excludeSaleItems, minimumAmount, maximumAmount, emailRestrictions, usedBy, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopCoupon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedGmt: ").append(toIndentedString(dateCreatedGmt)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateModifiedGmt: ").append(toIndentedString(dateModifiedGmt)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
    sb.append("    dateExpiresGmt: ").append(toIndentedString(dateExpiresGmt)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
    sb.append("    individualUse: ").append(toIndentedString(individualUse)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    excludedProductIds: ").append(toIndentedString(excludedProductIds)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    usageLimitPerUser: ").append(toIndentedString(usageLimitPerUser)).append("\n");
    sb.append("    limitUsageToXItems: ").append(toIndentedString(limitUsageToXItems)).append("\n");
    sb.append("    freeShipping: ").append(toIndentedString(freeShipping)).append("\n");
    sb.append("    productCategories: ").append(toIndentedString(productCategories)).append("\n");
    sb.append("    excludedProductCategories: ").append(toIndentedString(excludedProductCategories)).append("\n");
    sb.append("    excludeSaleItems: ").append(toIndentedString(excludeSaleItems)).append("\n");
    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    emailRestrictions: ").append(toIndentedString(emailRestrictions)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
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

