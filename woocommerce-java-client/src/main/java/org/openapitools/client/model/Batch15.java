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
 * Batch15
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class Batch15 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  /**
   * Type of attribute.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SELECT("select");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Default sort order.
   */
  @JsonAdapter(OrderByEnum.Adapter.class)
  public enum OrderByEnum {
    MENU_ORDER("menu_order"),
    
    NAME("name"),
    
    NAME_NUM("name_num"),
    
    ID("id");

    private String value;

    OrderByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderByEnum fromValue(String value) {
      for (OrderByEnum b : OrderByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderByEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private OrderByEnum orderBy;

  public static final String SERIALIZED_NAME_HAS_ARCHIVES = "has_archives";
  @SerializedName(SERIALIZED_NAME_HAS_ARCHIVES)
  private Boolean hasArchives;


  public Batch15 name(String name) {
    
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


  public Batch15 slug(String slug) {
    
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


  public Batch15 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of attribute.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of attribute.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Batch15 orderBy(OrderByEnum orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Default sort order.
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default sort order.")

  public OrderByEnum getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(OrderByEnum orderBy) {
    this.orderBy = orderBy;
  }


  public Batch15 hasArchives(Boolean hasArchives) {
    
    this.hasArchives = hasArchives;
    return this;
  }

   /**
   * Enable/Disable attribute archives.
   * @return hasArchives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable/Disable attribute archives.")

  public Boolean getHasArchives() {
    return hasArchives;
  }


  public void setHasArchives(Boolean hasArchives) {
    this.hasArchives = hasArchives;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch15 batch15 = (Batch15) o;
    return Objects.equals(this.name, batch15.name) &&
        Objects.equals(this.slug, batch15.slug) &&
        Objects.equals(this.type, batch15.type) &&
        Objects.equals(this.orderBy, batch15.orderBy) &&
        Objects.equals(this.hasArchives, batch15.hasArchives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, type, orderBy, hasArchives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch15 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    hasArchives: ").append(toIndentedString(hasArchives)).append("\n");
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

