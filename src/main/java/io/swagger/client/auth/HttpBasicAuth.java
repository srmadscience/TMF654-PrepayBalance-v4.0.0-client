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

package io.swagger.client.auth;

import io.swagger.client.Pair;

import com.migcomponents.migbase64.Base64;

import java.util.Map;
import java.util.List;

import java.io.UnsupportedEncodingException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-06T18:35:09.617630+01:00[Europe/Dublin]")public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    try {
      headerParams.put("Authorization", "Basic " + Base64.encodeToString(str.getBytes("UTF-8"), false));
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }
}
