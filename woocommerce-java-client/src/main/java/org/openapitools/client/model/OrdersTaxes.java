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

/**
 * OrdersTaxes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class OrdersTaxes {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private String subtotal;


  public OrdersTaxes id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tax rate ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax rate ID.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public OrdersTaxes total(String total) {
    
    this.total = total;
    return this;
  }

   /**
   * Tax total.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax total.")

  public String getTotal() {
    return total;
  }


  public void setTotal(String total) {
    this.total = total;
  }


  public OrdersTaxes subtotal(String subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Tax subtotal.
   * @return subtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax subtotal.")

  public String getSubtotal() {
    return subtotal;
  }


  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersTaxes ordersTaxes = (OrdersTaxes) o;
    return Objects.equals(this.id, ordersTaxes.id) &&
        Objects.equals(this.total, ordersTaxes.total) &&
        Objects.equals(this.subtotal, ordersTaxes.subtotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, total, subtotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersTaxes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
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
