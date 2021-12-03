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
import org.openapitools.client.model.PaymentGatewaysIdSettings;

/**
 * PaymentGateway3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class PaymentGateway3 {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private PaymentGatewaysIdSettings settings;


  public PaymentGateway3 title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Payment gateway title on checkout.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment gateway title on checkout.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PaymentGateway3 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Payment gateway description on checkout.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment gateway description on checkout.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentGateway3 order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Payment gateway sort order.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment gateway sort order.")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public PaymentGateway3 enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Payment gateway enabled status.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment gateway enabled status.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PaymentGateway3 settings(PaymentGatewaysIdSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentGatewaysIdSettings getSettings() {
    return settings;
  }


  public void setSettings(PaymentGatewaysIdSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentGateway3 paymentGateway3 = (PaymentGateway3) o;
    return Objects.equals(this.title, paymentGateway3.title) &&
        Objects.equals(this.description, paymentGateway3.description) &&
        Objects.equals(this.order, paymentGateway3.order) &&
        Objects.equals(this.enabled, paymentGateway3.enabled) &&
        Objects.equals(this.settings, paymentGateway3.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, order, enabled, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGateway3 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

