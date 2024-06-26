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
import io.swagger.client.model.ReserveBalance;
import io.swagger.client.model.ReserveBalanceCreate;
import io.swagger.client.model.ReserveBalanceUpdate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ReserveBalanceApi
 */
@Ignore
public class ReserveBalanceApiTest {

    private final ReserveBalanceApi api = new ReserveBalanceApi();

    /**
     * Creates a ReserveBalance
     *
     * This operation creates a ReserveBalance entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createReserveBalanceTest() throws Exception {
        ReserveBalanceCreate body = null;
        ReserveBalance response = api.createReserveBalance(body);

        // TODO: test validations
    }
    /**
     * Deletes a ReserveBalance
     *
     * This operation deletes a ReserveBalance entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteReserveBalanceTest() throws Exception {
        String id = null;
        api.deleteReserveBalance(id);

        // TODO: test validations
    }
    /**
     * List or find ReserveBalance objects
     *
     * This operation list or find ReserveBalance entities
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listReserveBalanceTest() throws Exception {
        String fields = null;
        Integer offset = null;
        Integer limit = null;
        List<ReserveBalance> response = api.listReserveBalance(fields, offset, limit);

        // TODO: test validations
    }
    /**
     * Updates partially a ReserveBalance
     *
     * This operation updates partially a ReserveBalance entity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchReserveBalanceTest() throws Exception {
        ReserveBalanceUpdate body = null;
        String id = null;
        ReserveBalance response = api.patchReserveBalance(body, id);

        // TODO: test validations
    }
    /**
     * Retrieves a ReserveBalance by ID
     *
     * This operation retrieves a ReserveBalance entity. Attribute selection is enabled for all first level attributes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void retrieveReserveBalanceTest() throws Exception {
        String id = null;
        String fields = null;
        ReserveBalance response = api.retrieveReserveBalance(id, fields);

        // TODO: test validations
    }
}
