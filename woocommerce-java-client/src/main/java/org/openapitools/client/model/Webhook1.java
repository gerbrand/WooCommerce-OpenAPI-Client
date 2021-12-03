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
 * Webhook1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class Webhook1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Webhook status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    PAUSED("paused"),
    
    DISABLED("disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_DELIVERY_URL = "delivery_url";
  @SerializedName(SERIALIZED_NAME_DELIVERY_URL)
  private String deliveryUrl;


  public Webhook1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A friendly name for the webhook.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A friendly name for the webhook.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Webhook1 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Webhook status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook status.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Webhook1 topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Webhook topic.
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook topic.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public Webhook1 secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Secret key used to generate a hash of the delivered webhook and provided in the request headers. This will default to a MD5 hash from the current user&#39;s ID|username if not provided.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret key used to generate a hash of the delivered webhook and provided in the request headers. This will default to a MD5 hash from the current user's ID|username if not provided.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Webhook1 deliveryUrl(String deliveryUrl) {
    
    this.deliveryUrl = deliveryUrl;
    return this;
  }

   /**
   * Webhook delivery URL.
   * @return deliveryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook delivery URL.")

  public String getDeliveryUrl() {
    return deliveryUrl;
  }


  public void setDeliveryUrl(String deliveryUrl) {
    this.deliveryUrl = deliveryUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook1 webhook1 = (Webhook1) o;
    return Objects.equals(this.name, webhook1.name) &&
        Objects.equals(this.status, webhook1.status) &&
        Objects.equals(this.topic, webhook1.topic) &&
        Objects.equals(this.secret, webhook1.secret) &&
        Objects.equals(this.deliveryUrl, webhook1.deliveryUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, topic, secret, deliveryUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    deliveryUrl: ").append(toIndentedString(deliveryUrl)).append("\n");
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

