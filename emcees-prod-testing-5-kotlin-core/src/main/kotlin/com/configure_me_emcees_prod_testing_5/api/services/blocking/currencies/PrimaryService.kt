// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.currencies

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencySingle
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can also
 * disable and enable them, or add new ones.
 */
interface PrimaryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PrimaryService

    /**
     * Get the primary currency of the current administration. This replaces what was called "the
     * user's default currency" although they are essentially the same.
     */
    fun retrieve(
        params: PrimaryRetrieveParams = PrimaryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CurrencySingle =
        retrieve(PrimaryRetrieveParams.none(), requestOptions)

    /**
     * Make this currency the primary currency for the current financial administration. If the
     * currency is not enabled, it will be enabled as well.
     */
    fun makePrimary(
        code: String,
        params: PrimaryMakePrimaryParams = PrimaryMakePrimaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle = makePrimary(params.toBuilder().code(code).build(), requestOptions)

    /** @see makePrimary */
    fun makePrimary(
        params: PrimaryMakePrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** @see makePrimary */
    fun makePrimary(code: String, requestOptions: RequestOptions): CurrencySingle =
        makePrimary(code, PrimaryMakePrimaryParams.none(), requestOptions)

    /** A view of [PrimaryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PrimaryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/currencies/primary`, but is otherwise the same
         * as [PrimaryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PrimaryRetrieveParams = PrimaryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<CurrencySingle> =
            retrieve(PrimaryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/currencies/{code}/primary`, but is otherwise
         * the same as [PrimaryService.makePrimary].
         */
        @MustBeClosed
        fun makePrimary(
            code: String,
            params: PrimaryMakePrimaryParams = PrimaryMakePrimaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle> =
            makePrimary(params.toBuilder().code(code).build(), requestOptions)

        /** @see makePrimary */
        @MustBeClosed
        fun makePrimary(
            params: PrimaryMakePrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /** @see makePrimary */
        @MustBeClosed
        fun makePrimary(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> =
            makePrimary(code, PrimaryMakePrimaryParams.none(), requestOptions)
    }
}
