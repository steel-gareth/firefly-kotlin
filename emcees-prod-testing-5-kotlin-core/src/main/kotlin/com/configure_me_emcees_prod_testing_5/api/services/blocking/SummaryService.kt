// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.summary.SummaryRetrieveBasicParams
import com.configure_me_emcees_prod_testing_5.api.models.summary.SummaryRetrieveBasicResponse
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints deliver summaries, like sums, lists of numbers and other processed information.
 * Mainly used for the main dashboard and pretty specific for Firefly III itself.
 */
interface SummaryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SummaryService

    /**
     * Returns basic sums of the users data, like the net worth, spent and earned amounts. It is
     * multi-currency, and is used in Firefly III to populate the dashboard.
     */
    fun retrieveBasic(
        params: SummaryRetrieveBasicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummaryRetrieveBasicResponse

    /** A view of [SummaryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SummaryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/summary/basic`, but is otherwise the same as
         * [SummaryService.retrieveBasic].
         */
        @MustBeClosed
        fun retrieveBasic(
            params: SummaryRetrieveBasicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummaryRetrieveBasicResponse>
    }
}
