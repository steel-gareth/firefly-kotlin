// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.availablebudgets.AvailableBudgetArray
import com.firefly.api.models.availablebudgets.AvailableBudgetListParams
import com.firefly.api.models.availablebudgets.AvailableBudgetRetrieveParams
import com.firefly.api.models.availablebudgets.AvailableBudgetRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage the total available amount that the user has made available to themselves.
 * Used in periodic budgeting.
 */
interface AvailableBudgetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AvailableBudgetService

    /** Get a single available budget, by ID. */
    fun retrieve(
        id: String,
        params: AvailableBudgetRetrieveParams = AvailableBudgetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AvailableBudgetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AvailableBudgetRetrieveResponse =
        retrieve(id, AvailableBudgetRetrieveParams.none(), requestOptions)

    /**
     * Firefly III calculates the total amount of money budgeted in so-called "available budgets".
     * This endpoint returns all of these amounts and the periods for which they are calculated.
     */
    fun list(
        params: AvailableBudgetListParams = AvailableBudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetArray

    /** @see list */
    fun list(requestOptions: RequestOptions): AvailableBudgetArray =
        list(AvailableBudgetListParams.none(), requestOptions)

    /**
     * A view of [AvailableBudgetService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AvailableBudgetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/available-budgets/{id}`, but is otherwise the
         * same as [AvailableBudgetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AvailableBudgetRetrieveParams = AvailableBudgetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AvailableBudgetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailableBudgetRetrieveResponse> =
            retrieve(id, AvailableBudgetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/available-budgets`, but is otherwise the same as
         * [AvailableBudgetService.list].
         */
        @MustBeClosed
        fun list(
            params: AvailableBudgetListParams = AvailableBudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AvailableBudgetArray> =
            list(AvailableBudgetListParams.none(), requestOptions)
    }
}
