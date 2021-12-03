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
 * ReportReviewTotal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ReportReviewTotal {
  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;


  public ReportReviewTotal slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the resource.
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An alphanumeric identifier for the resource.")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public ReportReviewTotal name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Review type name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Review type name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReportReviewTotal total(String total) {
    
    this.total = total;
    return this;
  }

   /**
   * Amount of reviews.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of reviews.")

  public String getTotal() {
    return total;
  }


  public void setTotal(String total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReviewTotal reportReviewTotal = (ReportReviewTotal) o;
    return Objects.equals(this.slug, reportReviewTotal.slug) &&
        Objects.equals(this.name, reportReviewTotal.name) &&
        Objects.equals(this.total, reportReviewTotal.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReviewTotal {\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

