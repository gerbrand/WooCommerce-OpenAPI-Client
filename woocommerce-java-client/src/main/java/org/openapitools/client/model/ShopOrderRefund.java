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
import org.openapitools.client.model.ShopOrderRefundLineItems;

/**
 * ShopOrderRefund
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ShopOrderRefund {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_CREATED_GMT = "date_created_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_GMT)
  private String dateCreatedGmt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REFUNDED_BY = "refunded_by";
  @SerializedName(SERIALIZED_NAME_REFUNDED_BY)
  private Integer refundedBy;

  public static final String SERIALIZED_NAME_REFUNDED_PAYMENT = "refunded_payment";
  @SerializedName(SERIALIZED_NAME_REFUNDED_PAYMENT)
  private Boolean refundedPayment;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private List<CouponsMetaData> metaData = null;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "line_items";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<ShopOrderRefundLineItems> lineItems = null;

  public static final String SERIALIZED_NAME_API_REFUND = "api_refund";
  @SerializedName(SERIALIZED_NAME_API_REFUND)
  private Boolean apiRefund;

  public static final String SERIALIZED_NAME_API_RESTOCK = "api_restock";
  @SerializedName(SERIALIZED_NAME_API_RESTOCK)
  private Boolean apiRestock;


  public ShopOrderRefund id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the resource.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ShopOrderRefund dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date the order refund was created, in the site&#39;s timezone.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the order refund was created, in the site's timezone.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ShopOrderRefund dateCreatedGmt(String dateCreatedGmt) {
    
    this.dateCreatedGmt = dateCreatedGmt;
    return this;
  }

   /**
   * The date the order refund was created, as GMT.
   * @return dateCreatedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the order refund was created, as GMT.")

  public String getDateCreatedGmt() {
    return dateCreatedGmt;
  }


  public void setDateCreatedGmt(String dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
  }


  public ShopOrderRefund amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Refund amount.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refund amount.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ShopOrderRefund reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason for refund.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason for refund.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ShopOrderRefund refundedBy(Integer refundedBy) {
    
    this.refundedBy = refundedBy;
    return this;
  }

   /**
   * User ID of user who created the refund.
   * @return refundedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User ID of user who created the refund.")

  public Integer getRefundedBy() {
    return refundedBy;
  }


  public void setRefundedBy(Integer refundedBy) {
    this.refundedBy = refundedBy;
  }


  public ShopOrderRefund refundedPayment(Boolean refundedPayment) {
    
    this.refundedPayment = refundedPayment;
    return this;
  }

   /**
   * If the payment was refunded via the API.
   * @return refundedPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the payment was refunded via the API.")

  public Boolean getRefundedPayment() {
    return refundedPayment;
  }


  public void setRefundedPayment(Boolean refundedPayment) {
    this.refundedPayment = refundedPayment;
  }


  public ShopOrderRefund metaData(List<CouponsMetaData> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public ShopOrderRefund addMetaDataItem(CouponsMetaData metaDataItem) {
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


  public ShopOrderRefund lineItems(List<ShopOrderRefundLineItems> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public ShopOrderRefund addLineItemsItem(ShopOrderRefundLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<ShopOrderRefundLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Line items data.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Line items data.")

  public List<ShopOrderRefundLineItems> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<ShopOrderRefundLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  public ShopOrderRefund apiRefund(Boolean apiRefund) {
    
    this.apiRefund = apiRefund;
    return this;
  }

   /**
   * When true, the payment gateway API is used to generate the refund.
   * @return apiRefund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, the payment gateway API is used to generate the refund.")

  public Boolean getApiRefund() {
    return apiRefund;
  }


  public void setApiRefund(Boolean apiRefund) {
    this.apiRefund = apiRefund;
  }


  public ShopOrderRefund apiRestock(Boolean apiRestock) {
    
    this.apiRestock = apiRestock;
    return this;
  }

   /**
   * When true, refunded items are restocked.
   * @return apiRestock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, refunded items are restocked.")

  public Boolean getApiRestock() {
    return apiRestock;
  }


  public void setApiRestock(Boolean apiRestock) {
    this.apiRestock = apiRestock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopOrderRefund shopOrderRefund = (ShopOrderRefund) o;
    return Objects.equals(this.id, shopOrderRefund.id) &&
        Objects.equals(this.dateCreated, shopOrderRefund.dateCreated) &&
        Objects.equals(this.dateCreatedGmt, shopOrderRefund.dateCreatedGmt) &&
        Objects.equals(this.amount, shopOrderRefund.amount) &&
        Objects.equals(this.reason, shopOrderRefund.reason) &&
        Objects.equals(this.refundedBy, shopOrderRefund.refundedBy) &&
        Objects.equals(this.refundedPayment, shopOrderRefund.refundedPayment) &&
        Objects.equals(this.metaData, shopOrderRefund.metaData) &&
        Objects.equals(this.lineItems, shopOrderRefund.lineItems) &&
        Objects.equals(this.apiRefund, shopOrderRefund.apiRefund) &&
        Objects.equals(this.apiRestock, shopOrderRefund.apiRestock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateCreatedGmt, amount, reason, refundedBy, refundedPayment, metaData, lineItems, apiRefund, apiRestock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopOrderRefund {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedGmt: ").append(toIndentedString(dateCreatedGmt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundedBy: ").append(toIndentedString(refundedBy)).append("\n");
    sb.append("    refundedPayment: ").append(toIndentedString(refundedPayment)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    apiRefund: ").append(toIndentedString(apiRefund)).append("\n");
    sb.append("    apiRestock: ").append(toIndentedString(apiRestock)).append("\n");
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

