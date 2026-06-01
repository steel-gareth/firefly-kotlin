// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.data

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.models.data.bulk.BulkUpdateTransactionsParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
interface BulkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BulkService

    /** Allows you to update transactions in bulk. */
    fun updateTransactions(
        params: BulkUpdateTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [BulkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BulkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/data/bulk/transactions`, but is otherwise the
         * same as [BulkService.updateTransactions].
         */
        @MustBeClosed
        fun updateTransactions(
            params: BulkUpdateTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
