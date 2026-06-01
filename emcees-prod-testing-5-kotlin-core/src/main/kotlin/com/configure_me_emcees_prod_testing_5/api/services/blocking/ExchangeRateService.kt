// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.CurrencyExchangeRateArray
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.CurrencyExchangeRateSingle
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateCreateByCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateCreateByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateDeleteAllByCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateDeleteByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateListByCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateListParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateRetrieveByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateUpdateByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** All currency exchange rates. */
interface ExchangeRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExchangeRateService

    /**
     * Stores a new exchange rate. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: ExchangeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /** List a single specific exchange rate by its ID. */
    fun retrieve(
        id: String,
        params: ExchangeRateRetrieveParams = ExchangeRateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ExchangeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CurrencyExchangeRateSingle =
        retrieve(id, ExchangeRateRetrieveParams.none(), requestOptions)

    /**
     * Used to update a single currency exchange rate by its ID. Including the from/to currency is
     * optional.
     */
    fun update(
        id: String,
        params: ExchangeRateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ExchangeRateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /** List exchange rates that Firefly III knows. */
    fun list(
        params: ExchangeRateListParams = ExchangeRateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /** @see list */
    fun list(requestOptions: RequestOptions): CurrencyExchangeRateArray =
        list(ExchangeRateListParams.none(), requestOptions)

    /** Delete a specific currency exchange rate by its internal ID. */
    fun delete(
        id: String,
        params: ExchangeRateDeleteParams = ExchangeRateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ExchangeRateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ExchangeRateDeleteParams.none(), requestOptions)

    /**
     * Stores a new set of exchange rates for this pair. The date is variable, and the data required
     * can be submitted as a JSON body.
     */
    fun createByCurrencies(
        to: String,
        params: ExchangeRateCreateByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        createByCurrencies(params.toBuilder().to(to).build(), requestOptions)

    /** @see createByCurrencies */
    fun createByCurrencies(
        params: ExchangeRateCreateByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /**
     * Stores a new set of exchange rates. The date is fixed (in the URL parameter) and the data
     * required can be submitted as a JSON body.
     */
    fun createByDate(
        pathDate: String,
        params: ExchangeRateCreateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        createByDate(params.toBuilder().pathDate(pathDate).build(), requestOptions)

    /** @see createByDate */
    fun createByDate(
        params: ExchangeRateCreateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /**
     * Deletes ALL currency exchange rates from 'from' to 'to'. It's important to know that the
     * reverse exchange rates (from 'to' to 'from') will not be deleted and Firefly III will still
     * be able to infer the correct exchange rate from the reverse one.
     */
    fun deleteAllByCurrencies(
        to: String,
        params: ExchangeRateDeleteAllByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAllByCurrencies(params.toBuilder().to(to).build(), requestOptions)

    /** @see deleteAllByCurrencies */
    fun deleteAllByCurrencies(
        params: ExchangeRateDeleteAllByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Delete the currency exchange rate from 'from' to 'to' on the specified date. It's important
     * to know that the reverse exchange rate (from 'to' to 'from') will not be deleted and Firefly
     * III will still be able to infer the correct exchange rate from the reverse one.
     */
    fun deleteByDate(
        date: String,
        params: ExchangeRateDeleteByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByDate(params.toBuilder().date(date).build(), requestOptions)

    /** @see deleteByDate */
    fun deleteByDate(
        params: ExchangeRateDeleteByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all exchange rates from/to the mentioned currencies. */
    fun listByCurrencies(
        to: String,
        params: ExchangeRateListByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        listByCurrencies(params.toBuilder().to(to).build(), requestOptions)

    /** @see listByCurrencies */
    fun listByCurrencies(
        params: ExchangeRateListByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /** List the exchange rate for the from and to-currency on the requested date. */
    fun retrieveByDate(
        date: String,
        params: ExchangeRateRetrieveByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        retrieveByDate(params.toBuilder().date(date).build(), requestOptions)

    /** @see retrieveByDate */
    fun retrieveByDate(
        params: ExchangeRateRetrieveByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /** Used to update a single currency exchange rate by its currency codes and date */
    fun updateByDate(
        date: String,
        params: ExchangeRateUpdateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle =
        updateByDate(params.toBuilder().date(date).build(), requestOptions)

    /** @see updateByDate */
    fun updateByDate(
        params: ExchangeRateUpdateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /**
     * A view of [ExchangeRateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExchangeRateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/exchange-rates`, but is otherwise the same as
         * [ExchangeRateService.create].
         */
        @MustBeClosed
        fun create(
            params: ExchangeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates/{id}`, but is otherwise the same
         * as [ExchangeRateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExchangeRateRetrieveParams = ExchangeRateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ExchangeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            retrieve(id, ExchangeRateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/exchange-rates/{id}`, but is otherwise the same
         * as [ExchangeRateService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ExchangeRateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExchangeRateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates`, but is otherwise the same as
         * [ExchangeRateService.list].
         */
        @MustBeClosed
        fun list(
            params: ExchangeRateListParams = ExchangeRateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CurrencyExchangeRateArray> =
            list(ExchangeRateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/exchange-rates/{id}`, but is otherwise the
         * same as [ExchangeRateService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExchangeRateDeleteParams = ExchangeRateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExchangeRateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ExchangeRateDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/exchange-rates/by-currencies/{from}/{to}`, but
         * is otherwise the same as [ExchangeRateService.createByCurrencies].
         */
        @MustBeClosed
        fun createByCurrencies(
            to: String,
            params: ExchangeRateCreateByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            createByCurrencies(params.toBuilder().to(to).build(), requestOptions)

        /** @see createByCurrencies */
        @MustBeClosed
        fun createByCurrencies(
            params: ExchangeRateCreateByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `post /v1/exchange-rates/by-date/{date}`, but is
         * otherwise the same as [ExchangeRateService.createByDate].
         */
        @MustBeClosed
        fun createByDate(
            pathDate: String,
            params: ExchangeRateCreateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            createByDate(params.toBuilder().pathDate(pathDate).build(), requestOptions)

        /** @see createByDate */
        @MustBeClosed
        fun createByDate(
            params: ExchangeRateCreateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `delete /v1/exchange-rates/{from}/{to}`, but is otherwise
         * the same as [ExchangeRateService.deleteAllByCurrencies].
         */
        @MustBeClosed
        fun deleteAllByCurrencies(
            to: String,
            params: ExchangeRateDeleteAllByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteAllByCurrencies(params.toBuilder().to(to).build(), requestOptions)

        /** @see deleteAllByCurrencies */
        @MustBeClosed
        fun deleteAllByCurrencies(
            params: ExchangeRateDeleteAllByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/exchange-rates/{from}/{to}/{date}`, but is
         * otherwise the same as [ExchangeRateService.deleteByDate].
         */
        @MustBeClosed
        fun deleteByDate(
            date: String,
            params: ExchangeRateDeleteByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteByDate(params.toBuilder().date(date).build(), requestOptions)

        /** @see deleteByDate */
        @MustBeClosed
        fun deleteByDate(
            params: ExchangeRateDeleteByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates/{from}/{to}`, but is otherwise
         * the same as [ExchangeRateService.listByCurrencies].
         */
        @MustBeClosed
        fun listByCurrencies(
            to: String,
            params: ExchangeRateListByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            listByCurrencies(params.toBuilder().to(to).build(), requestOptions)

        /** @see listByCurrencies */
        @MustBeClosed
        fun listByCurrencies(
            params: ExchangeRateListByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates/{from}/{to}/{date}`, but is
         * otherwise the same as [ExchangeRateService.retrieveByDate].
         */
        @MustBeClosed
        fun retrieveByDate(
            date: String,
            params: ExchangeRateRetrieveByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            retrieveByDate(params.toBuilder().date(date).build(), requestOptions)

        /** @see retrieveByDate */
        @MustBeClosed
        fun retrieveByDate(
            params: ExchangeRateRetrieveByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `put /v1/exchange-rates/{from}/{to}/{date}`, but is
         * otherwise the same as [ExchangeRateService.updateByDate].
         */
        @MustBeClosed
        fun updateByDate(
            date: String,
            params: ExchangeRateUpdateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            updateByDate(params.toBuilder().date(date).build(), requestOptions)

        /** @see updateByDate */
        @MustBeClosed
        fun updateByDate(
            params: ExchangeRateUpdateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>
    }
}
