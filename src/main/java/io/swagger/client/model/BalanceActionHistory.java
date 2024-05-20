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
import io.swagger.client.model.ActionStatusType;
import io.swagger.client.model.AdjustType;
import io.swagger.client.model.BucketRef;
import io.swagger.client.model.ChannelRef;
import io.swagger.client.model.CostOwnerType;
import io.swagger.client.model.LogicalResourceRef;
import io.swagger.client.model.Money;
import io.swagger.client.model.PartyAccountRef;
import io.swagger.client.model.PaymentMethodRef;
import io.swagger.client.model.ProductRef;
import io.swagger.client.model.Quantity;
import io.swagger.client.model.RecurringPeriodType;
import io.swagger.client.model.RelatedParty;
import io.swagger.client.model.RelatedTopupBalance;
import io.swagger.client.model.TimePeriod;
import io.swagger.client.model.UsageType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A history of the following operations performed on the bucket: TopupBalance, AdjustBalance and TransferBalance
 */
@Schema(description = "A history of the following operations performed on the bucket: TopupBalance, AdjustBalance and TransferBalance")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-06T18:35:09.617630+01:00[Europe/Dublin]")
public class BalanceActionHistory {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("confirmationDate")
  private OffsetDateTime confirmationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isAutoTopup")
  private Boolean isAutoTopup = null;

  @JsonProperty("numberOfPeriods")
  private Integer numberOfPeriods = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("requestedDate")
  private OffsetDateTime requestedDate = null;

  @JsonProperty("voucher")
  private String voucher = null;

  @JsonProperty("adjustType")
  private AdjustType adjustType = null;

  @JsonProperty("amount")
  private Quantity amount = null;

  @JsonProperty("balanceTopup")
  private RelatedTopupBalance balanceTopup = null;

  @JsonProperty("bucket")
  private BucketRef bucket = null;

  @JsonProperty("channel")
  private ChannelRef channel = null;

  @JsonProperty("costOwner")
  private CostOwnerType costOwner = null;

  @JsonProperty("logicalResource")
  private List<LogicalResourceRef> logicalResource = null;

  @JsonProperty("partyAccount")
  private PartyAccountRef partyAccount = null;

  @JsonProperty("paymentMethod")
  private PaymentMethodRef paymentMethod = null;

  @JsonProperty("product")
  private List<ProductRef> product = null;

  @JsonProperty("receiver")
  private RelatedParty receiver = null;

  @JsonProperty("receiverBucket")
  private BucketRef receiverBucket = null;

  @JsonProperty("receiverBucketUsageType")
  private UsageType receiverBucketUsageType = null;

  @JsonProperty("receiverLogicalResource")
  private LogicalResourceRef receiverLogicalResource = null;

  @JsonProperty("receiverProduct")
  private ProductRef receiverProduct = null;

  @JsonProperty("recurringPeriod")
  private RecurringPeriodType recurringPeriod = null;

  @JsonProperty("relatedParty")
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("requestor")
  private RelatedParty requestor = null;

  @JsonProperty("status")
  private ActionStatusType status = null;

  @JsonProperty("transferCost")
  private Money transferCost = null;

  @JsonProperty("usageType")
  private UsageType usageType = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public BalanceActionHistory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique Identifier for the resource
   * @return id
  **/
  @Schema(description = "Unique Identifier for the resource")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BalanceActionHistory href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A reference to the resource
   * @return href
  **/
  @Schema(description = "A reference to the resource")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BalanceActionHistory confirmationDate(OffsetDateTime confirmationDate) {
    this.confirmationDate = confirmationDate;
    return this;
  }

   /**
   * Date when the deduction was confirmed in the server
   * @return confirmationDate
  **/
  @Schema(description = "Date when the deduction was confirmed in the server")
  public OffsetDateTime getConfirmationDate() {
    return confirmationDate;
  }

  public void setConfirmationDate(OffsetDateTime confirmationDate) {
    this.confirmationDate = confirmationDate;
  }

  public BalanceActionHistory description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the recharge operation
   * @return description
  **/
  @Schema(description = "Description of the recharge operation")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BalanceActionHistory isAutoTopup(Boolean isAutoTopup) {
    this.isAutoTopup = isAutoTopup;
    return this;
  }

   /**
   * Indicates if the topup requested is an autotopup (to be processed periodically)
   * @return isAutoTopup
  **/
  @Schema(description = "Indicates if the topup requested is an autotopup (to be processed periodically)")
  public Boolean isIsAutoTopup() {
    return isAutoTopup;
  }

  public void setIsAutoTopup(Boolean isAutoTopup) {
    this.isAutoTopup = isAutoTopup;
  }

  public BalanceActionHistory numberOfPeriods(Integer numberOfPeriods) {
    this.numberOfPeriods = numberOfPeriods;
    return this;
  }

   /**
   * For autotopup indicates the number of occurrences of the period the recharge operation must be executed. If not included then no limit is set to stop the executionof the topup every period
   * @return numberOfPeriods
  **/
  @Schema(description = "For autotopup indicates the number of occurrences of the period the recharge operation must be executed. If not included then no limit is set to stop the executionof the topup every period")
  public Integer getNumberOfPeriods() {
    return numberOfPeriods;
  }

  public void setNumberOfPeriods(Integer numberOfPeriods) {
    this.numberOfPeriods = numberOfPeriods;
  }

  public BalanceActionHistory reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Text describing the reason for the action/task
   * @return reason
  **/
  @Schema(description = "Text describing the reason for the action/task")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public BalanceActionHistory requestedDate(OffsetDateTime requestedDate) {
    this.requestedDate = requestedDate;
    return this;
  }

   /**
   * Date when the deduction request was received in the server
   * @return requestedDate
  **/
  @Schema(description = "Date when the deduction request was received in the server")
  public OffsetDateTime getRequestedDate() {
    return requestedDate;
  }

  public void setRequestedDate(OffsetDateTime requestedDate) {
    this.requestedDate = requestedDate;
  }

  public BalanceActionHistory voucher(String voucher) {
    this.voucher = voucher;
    return this;
  }

   /**
   * Identifier for a voucher when the topup can be performed by this means
   * @return voucher
  **/
  @Schema(description = "Identifier for a voucher when the topup can be performed by this means")
  public String getVoucher() {
    return voucher;
  }

  public void setVoucher(String voucher) {
    this.voucher = voucher;
  }

  public BalanceActionHistory adjustType(AdjustType adjustType) {
    this.adjustType = adjustType;
    return this;
  }

   /**
   * Get adjustType
   * @return adjustType
  **/
  @Schema(description = "")
  public AdjustType getAdjustType() {
    return adjustType;
  }

  public void setAdjustType(AdjustType adjustType) {
    this.adjustType = adjustType;
  }

  public BalanceActionHistory amount(Quantity amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public Quantity getAmount() {
    return amount;
  }

  public void setAmount(Quantity amount) {
    this.amount = amount;
  }

  public BalanceActionHistory balanceTopup(RelatedTopupBalance balanceTopup) {
    this.balanceTopup = balanceTopup;
    return this;
  }

   /**
   * Get balanceTopup
   * @return balanceTopup
  **/
  @Schema(description = "")
  public RelatedTopupBalance getBalanceTopup() {
    return balanceTopup;
  }

  public void setBalanceTopup(RelatedTopupBalance balanceTopup) {
    this.balanceTopup = balanceTopup;
  }

  public BalanceActionHistory bucket(BucketRef bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @Schema(description = "")
  public BucketRef getBucket() {
    return bucket;
  }

  public void setBucket(BucketRef bucket) {
    this.bucket = bucket;
  }

  public BalanceActionHistory channel(ChannelRef channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @Schema(description = "")
  public ChannelRef getChannel() {
    return channel;
  }

  public void setChannel(ChannelRef channel) {
    this.channel = channel;
  }

  public BalanceActionHistory costOwner(CostOwnerType costOwner) {
    this.costOwner = costOwner;
    return this;
  }

   /**
   * Get costOwner
   * @return costOwner
  **/
  @Schema(description = "")
  public CostOwnerType getCostOwner() {
    return costOwner;
  }

  public void setCostOwner(CostOwnerType costOwner) {
    this.costOwner = costOwner;
  }

  public BalanceActionHistory logicalResource(List<LogicalResourceRef> logicalResource) {
    this.logicalResource = logicalResource;
    return this;
  }

  public BalanceActionHistory addLogicalResourceItem(LogicalResourceRef logicalResourceItem) {
    if (this.logicalResource == null) {
      this.logicalResource = new ArrayList<LogicalResourceRef>();
    }
    this.logicalResource.add(logicalResourceItem);
    return this;
  }

   /**
   * Get logicalResource
   * @return logicalResource
  **/
  @Schema(description = "")
  public List<LogicalResourceRef> getLogicalResource() {
    return logicalResource;
  }

  public void setLogicalResource(List<LogicalResourceRef> logicalResource) {
    this.logicalResource = logicalResource;
  }

  public BalanceActionHistory partyAccount(PartyAccountRef partyAccount) {
    this.partyAccount = partyAccount;
    return this;
  }

   /**
   * Get partyAccount
   * @return partyAccount
  **/
  @Schema(description = "")
  public PartyAccountRef getPartyAccount() {
    return partyAccount;
  }

  public void setPartyAccount(PartyAccountRef partyAccount) {
    this.partyAccount = partyAccount;
  }

  public BalanceActionHistory paymentMethod(PaymentMethodRef paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @Schema(description = "")
  public PaymentMethodRef getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodRef paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public BalanceActionHistory product(List<ProductRef> product) {
    this.product = product;
    return this;
  }

  public BalanceActionHistory addProductItem(ProductRef productItem) {
    if (this.product == null) {
      this.product = new ArrayList<ProductRef>();
    }
    this.product.add(productItem);
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public List<ProductRef> getProduct() {
    return product;
  }

  public void setProduct(List<ProductRef> product) {
    this.product = product;
  }

  public BalanceActionHistory receiver(RelatedParty receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @Schema(description = "")
  public RelatedParty getReceiver() {
    return receiver;
  }

  public void setReceiver(RelatedParty receiver) {
    this.receiver = receiver;
  }

  public BalanceActionHistory receiverBucket(BucketRef receiverBucket) {
    this.receiverBucket = receiverBucket;
    return this;
  }

   /**
   * Get receiverBucket
   * @return receiverBucket
  **/
  @Schema(description = "")
  public BucketRef getReceiverBucket() {
    return receiverBucket;
  }

  public void setReceiverBucket(BucketRef receiverBucket) {
    this.receiverBucket = receiverBucket;
  }

  public BalanceActionHistory receiverBucketUsageType(UsageType receiverBucketUsageType) {
    this.receiverBucketUsageType = receiverBucketUsageType;
    return this;
  }

   /**
   * Get receiverBucketUsageType
   * @return receiverBucketUsageType
  **/
  @Schema(description = "")
  public UsageType getReceiverBucketUsageType() {
    return receiverBucketUsageType;
  }

  public void setReceiverBucketUsageType(UsageType receiverBucketUsageType) {
    this.receiverBucketUsageType = receiverBucketUsageType;
  }

  public BalanceActionHistory receiverLogicalResource(LogicalResourceRef receiverLogicalResource) {
    this.receiverLogicalResource = receiverLogicalResource;
    return this;
  }

   /**
   * Get receiverLogicalResource
   * @return receiverLogicalResource
  **/
  @Schema(required = true, description = "")
  public LogicalResourceRef getReceiverLogicalResource() {
    return receiverLogicalResource;
  }

  public void setReceiverLogicalResource(LogicalResourceRef receiverLogicalResource) {
    this.receiverLogicalResource = receiverLogicalResource;
  }

  public BalanceActionHistory receiverProduct(ProductRef receiverProduct) {
    this.receiverProduct = receiverProduct;
    return this;
  }

   /**
   * Get receiverProduct
   * @return receiverProduct
  **/
  @Schema(description = "")
  public ProductRef getReceiverProduct() {
    return receiverProduct;
  }

  public void setReceiverProduct(ProductRef receiverProduct) {
    this.receiverProduct = receiverProduct;
  }

  public BalanceActionHistory recurringPeriod(RecurringPeriodType recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
    return this;
  }

   /**
   * Get recurringPeriod
   * @return recurringPeriod
  **/
  @Schema(description = "")
  public RecurringPeriodType getRecurringPeriod() {
    return recurringPeriod;
  }

  public void setRecurringPeriod(RecurringPeriodType recurringPeriod) {
    this.recurringPeriod = recurringPeriod;
  }

  public BalanceActionHistory relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public BalanceActionHistory addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Used to provide information about any other entity with relation to the operation
   * @return relatedParty
  **/
  @Schema(description = "Used to provide information about any other entity with relation to the operation")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public BalanceActionHistory requestor(RelatedParty requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Get requestor
   * @return requestor
  **/
  @Schema(description = "")
  public RelatedParty getRequestor() {
    return requestor;
  }

  public void setRequestor(RelatedParty requestor) {
    this.requestor = requestor;
  }

  public BalanceActionHistory status(ActionStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public ActionStatusType getStatus() {
    return status;
  }

  public void setStatus(ActionStatusType status) {
    this.status = status;
  }

  public BalanceActionHistory transferCost(Money transferCost) {
    this.transferCost = transferCost;
    return this;
  }

   /**
   * Get transferCost
   * @return transferCost
  **/
  @Schema(description = "")
  public Money getTransferCost() {
    return transferCost;
  }

  public void setTransferCost(Money transferCost) {
    this.transferCost = transferCost;
  }

  public BalanceActionHistory usageType(UsageType usageType) {
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @Schema(description = "")
  public UsageType getUsageType() {
    return usageType;
  }

  public void setUsageType(UsageType usageType) {
    this.usageType = usageType;
  }

  public BalanceActionHistory validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

   /**
   * Get validFor
   * @return validFor
  **/
  @Schema(description = "")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public BalanceActionHistory _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
  **/
  @Schema(description = "When sub-classing, this defines the super-class")
  public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public BalanceActionHistory _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
  **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public BalanceActionHistory _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
  **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceActionHistory balanceActionHistory = (BalanceActionHistory) o;
    return Objects.equals(this.id, balanceActionHistory.id) &&
        Objects.equals(this.href, balanceActionHistory.href) &&
        Objects.equals(this.confirmationDate, balanceActionHistory.confirmationDate) &&
        Objects.equals(this.description, balanceActionHistory.description) &&
        Objects.equals(this.isAutoTopup, balanceActionHistory.isAutoTopup) &&
        Objects.equals(this.numberOfPeriods, balanceActionHistory.numberOfPeriods) &&
        Objects.equals(this.reason, balanceActionHistory.reason) &&
        Objects.equals(this.requestedDate, balanceActionHistory.requestedDate) &&
        Objects.equals(this.voucher, balanceActionHistory.voucher) &&
        Objects.equals(this.adjustType, balanceActionHistory.adjustType) &&
        Objects.equals(this.amount, balanceActionHistory.amount) &&
        Objects.equals(this.balanceTopup, balanceActionHistory.balanceTopup) &&
        Objects.equals(this.bucket, balanceActionHistory.bucket) &&
        Objects.equals(this.channel, balanceActionHistory.channel) &&
        Objects.equals(this.costOwner, balanceActionHistory.costOwner) &&
        Objects.equals(this.logicalResource, balanceActionHistory.logicalResource) &&
        Objects.equals(this.partyAccount, balanceActionHistory.partyAccount) &&
        Objects.equals(this.paymentMethod, balanceActionHistory.paymentMethod) &&
        Objects.equals(this.product, balanceActionHistory.product) &&
        Objects.equals(this.receiver, balanceActionHistory.receiver) &&
        Objects.equals(this.receiverBucket, balanceActionHistory.receiverBucket) &&
        Objects.equals(this.receiverBucketUsageType, balanceActionHistory.receiverBucketUsageType) &&
        Objects.equals(this.receiverLogicalResource, balanceActionHistory.receiverLogicalResource) &&
        Objects.equals(this.receiverProduct, balanceActionHistory.receiverProduct) &&
        Objects.equals(this.recurringPeriod, balanceActionHistory.recurringPeriod) &&
        Objects.equals(this.relatedParty, balanceActionHistory.relatedParty) &&
        Objects.equals(this.requestor, balanceActionHistory.requestor) &&
        Objects.equals(this.status, balanceActionHistory.status) &&
        Objects.equals(this.transferCost, balanceActionHistory.transferCost) &&
        Objects.equals(this.usageType, balanceActionHistory.usageType) &&
        Objects.equals(this.validFor, balanceActionHistory.validFor) &&
        Objects.equals(this._atBaseType, balanceActionHistory._atBaseType) &&
        Objects.equals(this._atSchemaLocation, balanceActionHistory._atSchemaLocation) &&
        Objects.equals(this._atType, balanceActionHistory._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, confirmationDate, description, isAutoTopup, numberOfPeriods, reason, requestedDate, voucher, adjustType, amount, balanceTopup, bucket, channel, costOwner, logicalResource, partyAccount, paymentMethod, product, receiver, receiverBucket, receiverBucketUsageType, receiverLogicalResource, receiverProduct, recurringPeriod, relatedParty, requestor, status, transferCost, usageType, validFor, _atBaseType, _atSchemaLocation, _atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceActionHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    confirmationDate: ").append(toIndentedString(confirmationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isAutoTopup: ").append(toIndentedString(isAutoTopup)).append("\n");
    sb.append("    numberOfPeriods: ").append(toIndentedString(numberOfPeriods)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    requestedDate: ").append(toIndentedString(requestedDate)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    adjustType: ").append(toIndentedString(adjustType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceTopup: ").append(toIndentedString(balanceTopup)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    costOwner: ").append(toIndentedString(costOwner)).append("\n");
    sb.append("    logicalResource: ").append(toIndentedString(logicalResource)).append("\n");
    sb.append("    partyAccount: ").append(toIndentedString(partyAccount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    receiverBucket: ").append(toIndentedString(receiverBucket)).append("\n");
    sb.append("    receiverBucketUsageType: ").append(toIndentedString(receiverBucketUsageType)).append("\n");
    sb.append("    receiverLogicalResource: ").append(toIndentedString(receiverLogicalResource)).append("\n");
    sb.append("    receiverProduct: ").append(toIndentedString(receiverProduct)).append("\n");
    sb.append("    recurringPeriod: ").append(toIndentedString(recurringPeriod)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferCost: ").append(toIndentedString(transferCost)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
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