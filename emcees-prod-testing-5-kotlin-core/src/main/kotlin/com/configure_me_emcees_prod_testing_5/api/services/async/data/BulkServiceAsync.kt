// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.data

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.models.data.bulk.BulkUpdateTransactionsParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
interface BulkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BulkServiceAsync

    /** Allows you to update transactions in bulk. */
    suspend fun updateTransactions(
        params: BulkUpdateTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [BulkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BulkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/data/bulk/transactions`, but is otherwise the
         * same as [BulkServiceAsync.updateTransactions].
         */
        @MustBeClosed
        suspend fun updateTransactions(
            params: BulkUpdateTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
