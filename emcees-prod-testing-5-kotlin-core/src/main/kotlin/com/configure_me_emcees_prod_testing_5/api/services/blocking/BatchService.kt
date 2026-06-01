// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.models.batch.BatchFinishParams
import com.google.errorprone.annotations.MustBeClosed

/** These endpoints deliver general system information, version- and meta information. */
interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BatchService

    /** summary: Finish a batch of unprocessed transactions. */
    fun finish(
        params: BatchFinishParams = BatchFinishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see finish */
    fun finish(requestOptions: RequestOptions) = finish(BatchFinishParams.none(), requestOptions)

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/batch/finish`, but is otherwise the same as
         * [BatchService.finish].
         */
        @MustBeClosed
        fun finish(
            params: BatchFinishParams = BatchFinishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see finish */
        @MustBeClosed
        fun finish(requestOptions: RequestOptions): HttpResponse =
            finish(BatchFinishParams.none(), requestOptions)
    }
}
