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
 * SystemStatusTool1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class SystemStatusTool1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public SystemStatusTool1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Tool name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tool name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SystemStatusTool1 action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * What running the tool will do.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What running the tool will do.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public SystemStatusTool1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Tool description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tool description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SystemStatusTool1 success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Did the tool run successfully?
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Did the tool run successfully?")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public SystemStatusTool1 message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Tool return message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tool return message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemStatusTool1 systemStatusTool1 = (SystemStatusTool1) o;
    return Objects.equals(this.name, systemStatusTool1.name) &&
        Objects.equals(this.action, systemStatusTool1.action) &&
        Objects.equals(this.description, systemStatusTool1.description) &&
        Objects.equals(this.success, systemStatusTool1.success) &&
        Objects.equals(this.message, systemStatusTool1.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, action, description, success, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStatusTool1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

