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

/**
 * ProductsAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ProductsAttributes {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_VARIATION = "variation";
  @SerializedName(SERIALIZED_NAME_VARIATION)
  private Boolean variation;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = null;


  public ProductsAttributes id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Attribute ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute ID.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProductsAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Attribute name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductsAttributes position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Attribute position.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attribute position.")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public ProductsAttributes visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Define if the attribute is visible on the \&quot;Additional information\&quot; tab in the product&#39;s page.
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the attribute is visible on the \"Additional information\" tab in the product's page.")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public ProductsAttributes variation(Boolean variation) {
    
    this.variation = variation;
    return this;
  }

   /**
   * Define if the attribute can be used as variation.
   * @return variation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define if the attribute can be used as variation.")

  public Boolean getVariation() {
    return variation;
  }


  public void setVariation(Boolean variation) {
    this.variation = variation;
  }


  public ProductsAttributes options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public ProductsAttributes addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * List of available term names of the attribute.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of available term names of the attribute.")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsAttributes productsAttributes = (ProductsAttributes) o;
    return Objects.equals(this.id, productsAttributes.id) &&
        Objects.equals(this.name, productsAttributes.name) &&
        Objects.equals(this.position, productsAttributes.position) &&
        Objects.equals(this.visible, productsAttributes.visible) &&
        Objects.equals(this.variation, productsAttributes.variation) &&
        Objects.equals(this.options, productsAttributes.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, position, visible, variation, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsAttributes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
