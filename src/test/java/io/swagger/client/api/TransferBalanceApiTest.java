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

package io.swagger.client.api;

import io.swagger.client.model.Error;
import io.swagger.client.model.TransferBalance;
import io.swagger.client.model.TransferBalanceCreate;
import io.swagger.client.model.TransferBalanceUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TransferBalanceApi
 */
@Ignore
public class TransferBalanceApiTest {

    private final TransferBalanceApi api = new TransferBalanceApi();

    /**
     * Creates a TransferBalance
     *
     * This operation creates a TransferBalance entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTransferBalanceTest() throws Exception {
        TransferBalanceCreate body = null;
        TransferBalance response = api.createTransferBalance(body);

        // TODO: test validations
    }
    /**
     * Deletes a TransferBalance
     *
     * This operation deletes a TransferBalance entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteTransferBalanceTest() throws Exception {
        String id = null;
        api.deleteTransferBalance(id);

        // TODO: test validations
    }
    /**
     * List or find TransferBalance objects
     *
     * This operation list or find TransferBalance entities
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listTransferBalanceTest() throws Exception {
        String fields = null;
        Integer offset = null;
        Integer limit = null;
        List<TransferBalance> response = api.listTransferBalance(fields, offset, limit);

        // TODO: test validations
    }
    /**
     * Updates partially a TransferBalance
     *
     * This operation updates partially a TransferBalance entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchTransferBalanceTest() throws Exception {
        TransferBalanceUpdate body = null;
        String id = null;
        TransferBalance response = api.patchTransferBalance(body, id);

        // TODO: test validations
    }
    /**
     * Retrieves a TransferBalance by ID
     *
     * This operation retrieves a TransferBalance entity. Attribute selection is enabled for all first level attributes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void retrieveTransferBalanceTest() throws Exception {
        String id = null;
        String fields = null;
        TransferBalance response = api.retrieveTransferBalance(id, fields);

        // TODO: test validations
    }
}
