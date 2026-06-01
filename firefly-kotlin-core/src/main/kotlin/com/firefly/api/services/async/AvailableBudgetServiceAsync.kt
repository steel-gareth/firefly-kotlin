// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

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
interface AvailableBudgetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AvailableBudgetServiceAsync

    /** Get a single available budget, by ID. */
    suspend fun retrieve(
        id: String,
        params: AvailableBudgetRetrieveParams = AvailableBudgetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AvailableBudgetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): AvailableBudgetRetrieveResponse =
        retrieve(id, AvailableBudgetRetrieveParams.none(), requestOptions)

    /**
     * Firefly III calculates the total amount of money budgeted in so-called "available budgets".
     * This endpoint returns all of these amounts and the periods for which they are calculated.
     */
    suspend fun list(
        params: AvailableBudgetListParams = AvailableBudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AvailableBudgetArray =
        list(AvailableBudgetListParams.none(), requestOptions)

    /**
     * A view of [AvailableBudgetServiceAsync] that provides access to raw HTTP responses for each
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
        ): AvailableBudgetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/available-budgets/{id}`, but is otherwise the
         * same as [AvailableBudgetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AvailableBudgetRetrieveParams = AvailableBudgetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AvailableBudgetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailableBudgetRetrieveResponse> =
            retrieve(id, AvailableBudgetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/available-budgets`, but is otherwise the same as
         * [AvailableBudgetServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AvailableBudgetListParams = AvailableBudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AvailableBudgetArray> =
            list(AvailableBudgetListParams.none(), requestOptions)
    }
}
