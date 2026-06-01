// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.summary.SummaryRetrieveBasicParams
import com.firefly.api.models.summary.SummaryRetrieveBasicResponse
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints deliver summaries, like sums, lists of numbers and other processed information.
 * Mainly used for the main dashboard and pretty specific for Firefly III itself.
 */
interface SummaryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SummaryServiceAsync

    /**
     * Returns basic sums of the users data, like the net worth, spent and earned amounts. It is
     * multi-currency, and is used in Firefly III to populate the dashboard.
     */
    suspend fun retrieveBasic(
        params: SummaryRetrieveBasicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummaryRetrieveBasicResponse

    /**
     * A view of [SummaryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SummaryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/summary/basic`, but is otherwise the same as
         * [SummaryServiceAsync.retrieveBasic].
         */
        @MustBeClosed
        suspend fun retrieveBasic(
            params: SummaryRetrieveBasicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummaryRetrieveBasicResponse>
    }
}
