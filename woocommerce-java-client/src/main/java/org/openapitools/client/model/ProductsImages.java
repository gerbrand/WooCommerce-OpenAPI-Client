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
 * ProductsImages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ProductsImages {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

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

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private URI src;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALT = "alt";
  @SerializedName(SERIALIZED_NAME_ALT)
  private String alt;


  public ProductsImages id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Image ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image ID.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProductsImages dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date the image was created, in the site&#39;s timezone.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the image was created, in the site's timezone.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ProductsImages dateCreatedGmt(String dateCreatedGmt) {
    
    this.dateCreatedGmt = dateCreatedGmt;
    return this;
  }

   /**
   * The date the image was created, as GMT.
   * @return dateCreatedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the image was created, as GMT.")

  public String getDateCreatedGmt() {
    return dateCreatedGmt;
  }


  public void setDateCreatedGmt(String dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
  }


  public ProductsImages dateModified(String dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The date the image was last modified, in the site&#39;s timezone.
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the image was last modified, in the site's timezone.")

  public String getDateModified() {
    return dateModified;
  }


  public void setDateModified(String dateModified) {
    this.dateModified = dateModified;
  }


  public ProductsImages dateModifiedGmt(String dateModifiedGmt) {
    
    this.dateModifiedGmt = dateModifiedGmt;
    return this;
  }

   /**
   * The date the image was last modified, as GMT.
   * @return dateModifiedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the image was last modified, as GMT.")

  public String getDateModifiedGmt() {
    return dateModifiedGmt;
  }


  public void setDateModifiedGmt(String dateModifiedGmt) {
    this.dateModifiedGmt = dateModifiedGmt;
  }


  public ProductsImages src(URI src) {
    
    this.src = src;
    return this;
  }

   /**
   * Image URL.
   * @return src
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image URL.")

  public URI getSrc() {
    return src;
  }


  public void setSrc(URI src) {
    this.src = src;
  }


  public ProductsImages name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Image name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductsImages alt(String alt) {
    
    this.alt = alt;
    return this;
  }

   /**
   * Image alternative text.
   * @return alt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image alternative text.")

  public String getAlt() {
    return alt;
  }


  public void setAlt(String alt) {
    this.alt = alt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsImages productsImages = (ProductsImages) o;
    return Objects.equals(this.id, productsImages.id) &&
        Objects.equals(this.dateCreated, productsImages.dateCreated) &&
        Objects.equals(this.dateCreatedGmt, productsImages.dateCreatedGmt) &&
        Objects.equals(this.dateModified, productsImages.dateModified) &&
        Objects.equals(this.dateModifiedGmt, productsImages.dateModifiedGmt) &&
        Objects.equals(this.src, productsImages.src) &&
        Objects.equals(this.name, productsImages.name) &&
        Objects.equals(this.alt, productsImages.alt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateCreatedGmt, dateModified, dateModifiedGmt, src, name, alt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsImages {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedGmt: ").append(toIndentedString(dateCreatedGmt)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateModifiedGmt: ").append(toIndentedString(dateModifiedGmt)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
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
