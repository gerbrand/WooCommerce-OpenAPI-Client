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
 * Batch11
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class Batch11 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MENU_ORDER = "menu_order";
  @SerializedName(SERIALIZED_NAME_MENU_ORDER)
  private Integer menuOrder;


  public Batch11 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Term name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Term name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Batch11 slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the resource unique to its type.
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An alphanumeric identifier for the resource unique to its type.")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Batch11 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * HTML description of the resource.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTML description of the resource.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Batch11 menuOrder(Integer menuOrder) {
    
    this.menuOrder = menuOrder;
    return this;
  }

   /**
   * Menu order, used to custom sort the resource.
   * @return menuOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Menu order, used to custom sort the resource.")

  public Integer getMenuOrder() {
    return menuOrder;
  }


  public void setMenuOrder(Integer menuOrder) {
    this.menuOrder = menuOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch11 batch11 = (Batch11) o;
    return Objects.equals(this.name, batch11.name) &&
        Objects.equals(this.slug, batch11.slug) &&
        Objects.equals(this.description, batch11.description) &&
        Objects.equals(this.menuOrder, batch11.menuOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, description, menuOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch11 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    menuOrder: ").append(toIndentedString(menuOrder)).append("\n");
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

