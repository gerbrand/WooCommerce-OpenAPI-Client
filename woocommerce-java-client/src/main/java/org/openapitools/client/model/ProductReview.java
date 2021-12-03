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
import org.openapitools.client.model.ProductReviewReviewerAvatarUrls;

/**
 * ProductReview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T11:14:37.017890013+01:00[Europe/Amsterdam]")
public class ProductReview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_CREATED_GMT = "date_created_gmt";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED_GMT)
  private String dateCreatedGmt;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  /**
   * Status of the review.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVED("approved"),
    
    HOLD("hold"),
    
    SPAM("spam"),
    
    UNSPAM("unspam"),
    
    TRASH("trash"),
    
    UNTRASH("untrash");

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

  public static final String SERIALIZED_NAME_REVIEWER = "reviewer";
  @SerializedName(SERIALIZED_NAME_REVIEWER)
  private String reviewer;

  public static final String SERIALIZED_NAME_REVIEWER_EMAIL = "reviewer_email";
  @SerializedName(SERIALIZED_NAME_REVIEWER_EMAIL)
  private String reviewerEmail;

  public static final String SERIALIZED_NAME_REVIEW = "review";
  @SerializedName(SERIALIZED_NAME_REVIEW)
  private String review;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Integer rating;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_REVIEWER_AVATAR_URLS = "reviewer_avatar_urls";
  @SerializedName(SERIALIZED_NAME_REVIEWER_AVATAR_URLS)
  private ProductReviewReviewerAvatarUrls reviewerAvatarUrls;


  public ProductReview id(Integer id) {
    
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


  public ProductReview dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date the review was created, in the site&#39;s timezone.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the review was created, in the site's timezone.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ProductReview dateCreatedGmt(String dateCreatedGmt) {
    
    this.dateCreatedGmt = dateCreatedGmt;
    return this;
  }

   /**
   * The date the review was created, as GMT.
   * @return dateCreatedGmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the review was created, as GMT.")

  public String getDateCreatedGmt() {
    return dateCreatedGmt;
  }


  public void setDateCreatedGmt(String dateCreatedGmt) {
    this.dateCreatedGmt = dateCreatedGmt;
  }


  public ProductReview productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Unique identifier for the product that the review belongs to.
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the product that the review belongs to.")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public ProductReview status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the review.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the review.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ProductReview reviewer(String reviewer) {
    
    this.reviewer = reviewer;
    return this;
  }

   /**
   * Reviewer name.
   * @return reviewer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reviewer name.")

  public String getReviewer() {
    return reviewer;
  }


  public void setReviewer(String reviewer) {
    this.reviewer = reviewer;
  }


  public ProductReview reviewerEmail(String reviewerEmail) {
    
    this.reviewerEmail = reviewerEmail;
    return this;
  }

   /**
   * Reviewer email.
   * @return reviewerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reviewer email.")

  public String getReviewerEmail() {
    return reviewerEmail;
  }


  public void setReviewerEmail(String reviewerEmail) {
    this.reviewerEmail = reviewerEmail;
  }


  public ProductReview review(String review) {
    
    this.review = review;
    return this;
  }

   /**
   * The content of the review.
   * @return review
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the review.")

  public String getReview() {
    return review;
  }


  public void setReview(String review) {
    this.review = review;
  }


  public ProductReview rating(Integer rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Review rating (0 to 5).
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Review rating (0 to 5).")

  public Integer getRating() {
    return rating;
  }


  public void setRating(Integer rating) {
    this.rating = rating;
  }


  public ProductReview verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Shows if the reviewer bought the product or not.
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows if the reviewer bought the product or not.")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public ProductReview reviewerAvatarUrls(ProductReviewReviewerAvatarUrls reviewerAvatarUrls) {
    
    this.reviewerAvatarUrls = reviewerAvatarUrls;
    return this;
  }

   /**
   * Get reviewerAvatarUrls
   * @return reviewerAvatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductReviewReviewerAvatarUrls getReviewerAvatarUrls() {
    return reviewerAvatarUrls;
  }


  public void setReviewerAvatarUrls(ProductReviewReviewerAvatarUrls reviewerAvatarUrls) {
    this.reviewerAvatarUrls = reviewerAvatarUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReview productReview = (ProductReview) o;
    return Objects.equals(this.id, productReview.id) &&
        Objects.equals(this.dateCreated, productReview.dateCreated) &&
        Objects.equals(this.dateCreatedGmt, productReview.dateCreatedGmt) &&
        Objects.equals(this.productId, productReview.productId) &&
        Objects.equals(this.status, productReview.status) &&
        Objects.equals(this.reviewer, productReview.reviewer) &&
        Objects.equals(this.reviewerEmail, productReview.reviewerEmail) &&
        Objects.equals(this.review, productReview.review) &&
        Objects.equals(this.rating, productReview.rating) &&
        Objects.equals(this.verified, productReview.verified) &&
        Objects.equals(this.reviewerAvatarUrls, productReview.reviewerAvatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateCreatedGmt, productId, status, reviewer, reviewerEmail, review, rating, verified, reviewerAvatarUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCreatedGmt: ").append(toIndentedString(dateCreatedGmt)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    reviewerEmail: ").append(toIndentedString(reviewerEmail)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    reviewerAvatarUrls: ").append(toIndentedString(reviewerAvatarUrls)).append("\n");
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

