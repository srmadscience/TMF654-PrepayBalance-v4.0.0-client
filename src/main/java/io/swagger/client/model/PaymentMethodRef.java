/*
 * Prepay Balance Management
 * ## TMF API Reference: TMF654 - Prepay Balance Management  ### Draft : 19.5 - January 2020  The Prepay Balance Management API enables consumers to manage the balance, recharge (top-up), transfer, reserve, unreserve, deduct and balance adjustments of a  bucket. A bucket is understood in the context of this API to be an entity that keeps track of the balance available to use services. Every bucket will measure balance in different units, it can be monetary or non-monetary (e.g.: number of sms that are available, number of GB of data available, …)  ### Resources - Bucket - TopupBalance - AdjustBalance - TransferBalance - ReserveBalance - AccumulatedBalance - BalanceActionHistory  ### Operations - Retrieve the balance information on a bucket for a given product (individual or aggregated). - Retrieve the list of balance-related operations performed over a given product - Retrieve information about all the top-up operations stored in the server filtered by some criteria. - Perform a new top up operation (recharge) - Retrieve detailed information about a top-up operation previously processed by the server. - Retrieve the current and historic status information about a top-up operation previously processed by the server. - Perform a new transfer operation - Retrieve information about all the transfer operations stored in the server filtered by some criteria - Retrieve detailed information about a transfer operation previously processed by the server - Retrieve the current and historic status information about a transfer operation previously processed by the server. - Retrieve information about all the adjustments stored in the server filtered by some criteria. - Perform a new adjustment operation - Retrieve detailed information about a balance adjustment operation previously processed by the server - Reserve a balance on a bucket. - Unreserve a balance on a bucket. - Retrieve aggregated (accumulative) balances for a bucket.
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PaymentMethod reference. A payment method defines a specific mean of payment (e.g direct debit).
 */
@Schema(description = "PaymentMethod reference. A payment method defines a specific mean of payment (e.g direct debit).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-06T18:35:09.617630+01:00[Europe/Dublin]")
public class PaymentMethodRef {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  @JsonProperty("@referredType")
  private String _atReferredType = null;

  public PaymentMethodRef id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unique identifier
   * @return id
  **/
  @Schema(required = true, description = "unique identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentMethodRef href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Hyperlink reference
   * @return href
  **/
  @Schema(description = "Hyperlink reference")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PaymentMethodRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the related entity.
   * @return name
  **/
  @Schema(description = "Name of the related entity.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMethodRef _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
  **/
  @Schema(example = "ResourceSpecification", description = "When sub-classing, this defines the super-class")
  public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public PaymentMethodRef _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
  **/
  @Schema(example = "https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json", description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public PaymentMethodRef _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return _atType
  **/
  @Schema(example = "LogicalResourceSpecification", description = "When sub-classing, this defines the sub-class Extensible name")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public PaymentMethodRef _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

   /**
   * The actual type of the target instance when needed for disambiguation.
   * @return _atReferredType
  **/
  @Schema(description = "The actual type of the target instance when needed for disambiguation.")
  public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodRef paymentMethodRef = (PaymentMethodRef) o;
    return Objects.equals(this.id, paymentMethodRef.id) &&
        Objects.equals(this.href, paymentMethodRef.href) &&
        Objects.equals(this.name, paymentMethodRef.name) &&
        Objects.equals(this._atBaseType, paymentMethodRef._atBaseType) &&
        Objects.equals(this._atSchemaLocation, paymentMethodRef._atSchemaLocation) &&
        Objects.equals(this._atType, paymentMethodRef._atType) &&
        Objects.equals(this._atReferredType, paymentMethodRef._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
