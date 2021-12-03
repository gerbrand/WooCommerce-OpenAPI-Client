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
 * Batch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class Batch {
  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private List<Object> create = null;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private List<Object> update = null;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private List<Integer> delete = null;


  public Batch create(List<Object> create) {
    
    this.create = create;
    return this;
  }

  public Batch addCreateItem(Object createItem) {
    if (this.create == null) {
      this.create = new ArrayList<Object>();
    }
    this.create.add(createItem);
    return this;
  }

   /**
   * List of created resources.
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of created resources.")

  public List<Object> getCreate() {
    return create;
  }


  public void setCreate(List<Object> create) {
    this.create = create;
  }


  public Batch update(List<Object> update) {
    
    this.update = update;
    return this;
  }

  public Batch addUpdateItem(Object updateItem) {
    if (this.update == null) {
      this.update = new ArrayList<Object>();
    }
    this.update.add(updateItem);
    return this;
  }

   /**
   * List of updated resources.
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of updated resources.")

  public List<Object> getUpdate() {
    return update;
  }


  public void setUpdate(List<Object> update) {
    this.update = update;
  }


  public Batch delete(List<Integer> delete) {
    
    this.delete = delete;
    return this;
  }

  public Batch addDeleteItem(Integer deleteItem) {
    if (this.delete == null) {
      this.delete = new ArrayList<Integer>();
    }
    this.delete.add(deleteItem);
    return this;
  }

   /**
   * List of delete resources.
   * @return delete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of delete resources.")

  public List<Integer> getDelete() {
    return delete;
  }


  public void setDelete(List<Integer> delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.create, batch.create) &&
        Objects.equals(this.update, batch.update) &&
        Objects.equals(this.delete, batch.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, update, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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
