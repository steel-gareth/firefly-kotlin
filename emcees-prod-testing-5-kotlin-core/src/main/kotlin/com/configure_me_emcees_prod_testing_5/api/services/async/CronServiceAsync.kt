// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.cron.CronRunParams
import com.configure_me_emcees_prod_testing_5.api.models.cron.CronRunResponse
import com.google.errorprone.annotations.MustBeClosed

/** These endpoints deliver general system information, version- and meta information. */
interface CronServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CronServiceAsync

    /**
     * Firefly III has one endpoint for its various cron related tasks. Send a GET to this endpoint
     * to run the cron. The cron requires the CLI token to be present. The cron job will fire for
     * all users.
     */
    suspend fun run(
        cliToken: String,
        params: CronRunParams = CronRunParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CronRunResponse = run(params.toBuilder().cliToken(cliToken).build(), requestOptions)

    /** @see run */
    suspend fun run(
        params: CronRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CronRunResponse

    /** @see run */
    suspend fun run(cliToken: String, requestOptions: RequestOptions): CronRunResponse =
        run(cliToken, CronRunParams.none(), requestOptions)

    /** A view of [CronServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CronServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/cron/{cliToken}`, but is otherwise the same as
         * [CronServiceAsync.run].
         */
        @MustBeClosed
        suspend fun run(
            cliToken: String,
            params: CronRunParams = CronRunParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CronRunResponse> =
            run(params.toBuilder().cliToken(cliToken).build(), requestOptions)

        /** @see run */
        @MustBeClosed
        suspend fun run(
            params: CronRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CronRunResponse>

        /** @see run */
        @MustBeClosed
        suspend fun run(
            cliToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CronRunResponse> = run(cliToken, CronRunParams.none(), requestOptions)
    }
}
