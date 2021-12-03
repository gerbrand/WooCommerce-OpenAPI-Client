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
 * OrderNote
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class OrderNote {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_CREATED_GMT = "date_created_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_GMT)
  private String dateCreatedGmt;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_CUSTOMER_NOTE = "customer_note";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NOTE)
  private Boolean customerNote;

  public static final String SERIALIZED_NAME_ADDED_BY_USER = "added_by_user";
  @SerializedName(SERIALIZED_NAME_ADDED_BY_USER)
  private Boolean addedByUser;


  public OrderNote id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the resource.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public OrderNote author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Order note author.
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order note author.")

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public OrderNote dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date the order note was created, in the site&#39;s timezone.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the order note was created, in the site's timezone.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public OrderNote dateCreatedGmt(String dateCreatedGmt) {
    
    this.dateCreatedGmt = dateCreatedGmt;
    return this;
  }

   /**
   * The date the order note was created, as GMT.
   * @return dateCreatedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the order note was created, as GMT.")

  public String getDateCreatedGmt() {
    return dateCreatedGmt;
  }


  public void setDateCreatedGmt(String dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
  }


  public OrderNote note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Order note content.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order note content.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public OrderNote customerNote(Boolean customerNote) {
    
    this.customerNote = customerNote;
    return this;
  }

   /**
   * If true, the note will be shown to customers and they will be notified. If false, the note will be for admin reference only.
   * @return customerNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the note will be shown to customers and they will be notified. If false, the note will be for admin reference only.")

  public Boolean getCustomerNote() {
    return customerNote;
  }


  public void setCustomerNote(Boolean customerNote) {
    this.customerNote = customerNote;
  }


  public OrderNote addedByUser(Boolean addedByUser) {
    
    this.addedByUser = addedByUser;
    return this;
  }

   /**
   * If true, this note will be attributed to the current user. If false, the note will be attributed to the system.
   * @return addedByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this note will be attributed to the current user. If false, the note will be attributed to the system.")

  public Boolean getAddedByUser() {
    return addedByUser;
  }


  public void setAddedByUser(Boolean addedByUser) {
    this.addedByUser = addedByUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderNote orderNote = (OrderNote) o;
    return Objects.equals(this.id, orderNote.id) &&
        Objects.equals(this.author, orderNote.author) &&
        Objects.equals(this.dateCreated, orderNote.dateCreated) &&
        Objects.equals(this.dateCreatedGmt, orderNote.dateCreatedGmt) &&
        Objects.equals(this.note, orderNote.note) &&
        Objects.equals(this.customerNote, orderNote.customerNote) &&
        Objects.equals(this.addedByUser, orderNote.addedByUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, dateCreated, dateCreatedGmt, note, customerNote, addedByUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderNote {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedGmt: ").append(toIndentedString(dateCreatedGmt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    customerNote: ").append(toIndentedString(customerNote)).append("\n");
    sb.append("    addedByUser: ").append(toIndentedString(addedByUser)).append("\n");
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

