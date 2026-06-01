// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.models.batch.BatchFinishParams
import com.google.errorprone.annotations.MustBeClosed

/** These endpoints deliver general system information, version- and meta information. */
interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BatchServiceAsync

    /** summary: Finish a batch of unprocessed transactions. */
    suspend fun finish(
        params: BatchFinishParams = BatchFinishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see finish */
    suspend fun finish(requestOptions: RequestOptions) =
        finish(BatchFinishParams.none(), requestOptions)

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/batch/finish`, but is otherwise the same as
         * [BatchServiceAsync.finish].
         */
        @MustBeClosed
        suspend fun finish(
            params: BatchFinishParams = BatchFinishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see finish */
        @MustBeClosed
        suspend fun finish(requestOptions: RequestOptions): HttpResponse =
            finish(BatchFinishParams.none(), requestOptions)
    }
}
