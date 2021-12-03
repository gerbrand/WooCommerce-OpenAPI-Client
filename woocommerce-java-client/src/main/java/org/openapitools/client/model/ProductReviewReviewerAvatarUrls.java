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
import java.net.URI;

/**
 * Avatar URLs for the object reviewer.
 */
@ApiModel(description = "Avatar URLs for the object reviewer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ProductReviewReviewerAvatarUrls {
  public static final String SERIALIZED_NAME_24 = "24";
  @SerializedName(SERIALIZED_NAME_24)
  private URI _24;

  public static final String SERIALIZED_NAME_48 = "48";
  @SerializedName(SERIALIZED_NAME_48)
  private URI _48;

  public static final String SERIALIZED_NAME_96 = "96";
  @SerializedName(SERIALIZED_NAME_96)
  private URI _96;


  public ProductReviewReviewerAvatarUrls _24(URI _24) {
    
    this._24 = _24;
    return this;
  }

   /**
   * Avatar URL with image size of 24 pixels.
   * @return _24
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Avatar URL with image size of 24 pixels.")

  public URI get24() {
    return _24;
  }


  public void set24(URI _24) {
    this._24 = _24;
  }


  public ProductReviewReviewerAvatarUrls _48(URI _48) {
    
    this._48 = _48;
    return this;
  }

   /**
   * Avatar URL with image size of 48 pixels.
   * @return _48
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Avatar URL with image size of 48 pixels.")

  public URI get48() {
    return _48;
  }


  public void set48(URI _48) {
    this._48 = _48;
  }


  public ProductReviewReviewerAvatarUrls _96(URI _96) {
    
    this._96 = _96;
    return this;
  }

   /**
   * Avatar URL with image size of 96 pixels.
   * @return _96
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Avatar URL with image size of 96 pixels.")

  public URI get96() {
    return _96;
  }


  public void set96(URI _96) {
    this._96 = _96;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReviewReviewerAvatarUrls productReviewReviewerAvatarUrls = (ProductReviewReviewerAvatarUrls) o;
    return Objects.equals(this._24, productReviewReviewerAvatarUrls._24) &&
        Objects.equals(this._48, productReviewReviewerAvatarUrls._48) &&
        Objects.equals(this._96, productReviewReviewerAvatarUrls._96);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_24, _48, _96);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewReviewerAvatarUrls {\n");
    sb.append("    _24: ").append(toIndentedString(_24)).append("\n");
    sb.append("    _48: ").append(toIndentedString(_48)).append("\n");
    sb.append("    _96: ").append(toIndentedString(_96)).append("\n");
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

