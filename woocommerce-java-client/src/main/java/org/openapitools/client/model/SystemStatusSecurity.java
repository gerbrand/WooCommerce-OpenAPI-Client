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
 * Security.
 */
@ApiModel(description = "Security.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class SystemStatusSecurity {
  public static final String SERIALIZED_NAME_SECURE_CONNECTION = "secure_connection";
  @SerializedName(SERIALIZED_NAME_SECURE_CONNECTION)
  private Boolean secureConnection;

  public static final String SERIALIZED_NAME_HIDE_ERRORS = "hide_errors";
  @SerializedName(SERIALIZED_NAME_HIDE_ERRORS)
  private Boolean hideErrors;


  public SystemStatusSecurity secureConnection(Boolean secureConnection) {
    
    this.secureConnection = secureConnection;
    return this;
  }

   /**
   * Is the connection to your store secure?
   * @return secureConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the connection to your store secure?")

  public Boolean getSecureConnection() {
    return secureConnection;
  }


  public void setSecureConnection(Boolean secureConnection) {
    this.secureConnection = secureConnection;
  }


  public SystemStatusSecurity hideErrors(Boolean hideErrors) {
    
    this.hideErrors = hideErrors;
    return this;
  }

   /**
   * Hide errors from visitors?
   * @return hideErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hide errors from visitors?")

  public Boolean getHideErrors() {
    return hideErrors;
  }


  public void setHideErrors(Boolean hideErrors) {
    this.hideErrors = hideErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemStatusSecurity systemStatusSecurity = (SystemStatusSecurity) o;
    return Objects.equals(this.secureConnection, systemStatusSecurity.secureConnection) &&
        Objects.equals(this.hideErrors, systemStatusSecurity.hideErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secureConnection, hideErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStatusSecurity {\n");
    sb.append("    secureConnection: ").append(toIndentedString(secureConnection)).append("\n");
    sb.append("    hideErrors: ").append(toIndentedString(hideErrors)).append("\n");
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
