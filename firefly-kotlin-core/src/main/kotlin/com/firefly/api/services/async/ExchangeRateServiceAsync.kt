// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.exchangerates.CurrencyExchangeRateArray
import com.firefly.api.models.exchangerates.CurrencyExchangeRateSingle
import com.firefly.api.models.exchangerates.ExchangeRateCreateByCurrenciesParams
import com.firefly.api.models.exchangerates.ExchangeRateCreateByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateCreateParams
import com.firefly.api.models.exchangerates.ExchangeRateDeleteAllByCurrenciesParams
import com.firefly.api.models.exchangerates.ExchangeRateDeleteByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateDeleteParams
import com.firefly.api.models.exchangerates.ExchangeRateListByCurrenciesParams
import com.firefly.api.models.exchangerates.ExchangeRateListParams
import com.firefly.api.models.exchangerates.ExchangeRateRetrieveByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateRetrieveParams
import com.firefly.api.models.exchangerates.ExchangeRateUpdateByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** All currency exchange rates. */
interface ExchangeRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExchangeRateServiceAsync

    /**
     * Stores a new exchange rate. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: ExchangeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /** List a single specific exchange rate by its ID. */
    suspend fun retrieve(
        id: String,
        params: ExchangeRateRetrieveParams = ExchangeRateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ExchangeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): CurrencyExchangeRateSingle =
        retrieve(id, ExchangeRateRetrieveParams.none(), requestOptions)

    /**
     * Used to update a single currency exchange rate by its ID. Including the from/to currency is
     * optional.
     */
    suspend fun update(
        id: String,
        params: ExchangeRateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ExchangeRateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /** List exchange rates that Firefly III knows. */
    suspend fun list(
        params: ExchangeRateListParams = ExchangeRateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CurrencyExchangeRateArray =
        list(ExchangeRateListParams.none(), requestOptions)

    /** Delete a specific currency exchange rate by its internal ID. */
    suspend fun delete(
        id: String,
        params: ExchangeRateDeleteParams = ExchangeRateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ExchangeRateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ExchangeRateDeleteParams.none(), requestOptions)

    /**
     * Stores a new set of exchange rates for this pair. The date is variable, and the data required
     * can be submitted as a JSON body.
     */
    suspend fun createByCurrencies(
        to: String,
        params: ExchangeRateCreateByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        createByCurrencies(params.toBuilder().to(to).build(), requestOptions)

    /** @see createByCurrencies */
    suspend fun createByCurrencies(
        params: ExchangeRateCreateByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /**
     * Stores a new set of exchange rates. The date is fixed (in the URL parameter) and the data
     * required can be submitted as a JSON body.
     */
    suspend fun createByDate(
        pathDate: String,
        params: ExchangeRateCreateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        createByDate(params.toBuilder().pathDate(pathDate).build(), requestOptions)

    /** @see createByDate */
    suspend fun createByDate(
        params: ExchangeRateCreateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /**
     * Deletes ALL currency exchange rates from 'from' to 'to'. It's important to know that the
     * reverse exchange rates (from 'to' to 'from') will not be deleted and Firefly III will still
     * be able to infer the correct exchange rate from the reverse one.
     */
    suspend fun deleteAllByCurrencies(
        to: String,
        params: ExchangeRateDeleteAllByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAllByCurrencies(params.toBuilder().to(to).build(), requestOptions)

    /** @see deleteAllByCurrencies */
    suspend fun deleteAllByCurrencies(
        params: ExchangeRateDeleteAllByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Delete the currency exchange rate from 'from' to 'to' on the specified date. It's important
     * to know that the reverse exchange rate (from 'to' to 'from') will not be deleted and Firefly
     * III will still be able to infer the correct exchange rate from the reverse one.
     */
    suspend fun deleteByDate(
        date: String,
        params: ExchangeRateDeleteByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByDate(params.toBuilder().date(date).build(), requestOptions)

    /** @see deleteByDate */
    suspend fun deleteByDate(
        params: ExchangeRateDeleteByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all exchange rates from/to the mentioned currencies. */
    suspend fun listByCurrencies(
        to: String,
        params: ExchangeRateListByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        listByCurrencies(params.toBuilder().to(to).build(), requestOptions)

    /** @see listByCurrencies */
    suspend fun listByCurrencies(
        params: ExchangeRateListByCurrenciesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /** List the exchange rate for the from and to-currency on the requested date. */
    suspend fun retrieveByDate(
        date: String,
        params: ExchangeRateRetrieveByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray =
        retrieveByDate(params.toBuilder().date(date).build(), requestOptions)

    /** @see retrieveByDate */
    suspend fun retrieveByDate(
        params: ExchangeRateRetrieveByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateArray

    /** Used to update a single currency exchange rate by its currency codes and date */
    suspend fun updateByDate(
        date: String,
        params: ExchangeRateUpdateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle =
        updateByDate(params.toBuilder().date(date).build(), requestOptions)

    /** @see updateByDate */
    suspend fun updateByDate(
        params: ExchangeRateUpdateByDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyExchangeRateSingle

    /**
     * A view of [ExchangeRateServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExchangeRateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/exchange-rates`, but is otherwise the same as
         * [ExchangeRateServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExchangeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates/{id}`, but is otherwise the same
         * as [ExchangeRateServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ExchangeRateRetrieveParams = ExchangeRateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ExchangeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            retrieve(id, ExchangeRateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/exchange-rates/{id}`, but is otherwise the same
         * as [ExchangeRateServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: ExchangeRateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ExchangeRateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates`, but is otherwise the same as
         * [ExchangeRateServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExchangeRateListParams = ExchangeRateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            list(ExchangeRateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/exchange-rates/{id}`, but is otherwise the
         * same as [ExchangeRateServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: ExchangeRateDeleteParams = ExchangeRateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ExchangeRateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ExchangeRateDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/exchange-rates/by-currencies/{from}/{to}`, but
         * is otherwise the same as [ExchangeRateServiceAsync.createByCurrencies].
         */
        @MustBeClosed
        suspend fun createByCurrencies(
            to: String,
            params: ExchangeRateCreateByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            createByCurrencies(params.toBuilder().to(to).build(), requestOptions)

        /** @see createByCurrencies */
        @MustBeClosed
        suspend fun createByCurrencies(
            params: ExchangeRateCreateByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `post /v1/exchange-rates/by-date/{date}`, but is
         * otherwise the same as [ExchangeRateServiceAsync.createByDate].
         */
        @MustBeClosed
        suspend fun createByDate(
            pathDate: String,
            params: ExchangeRateCreateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            createByDate(params.toBuilder().pathDate(pathDate).build(), requestOptions)

        /** @see createByDate */
        @MustBeClosed
        suspend fun createByDate(
            params: ExchangeRateCreateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `delete /v1/exchange-rates/{from}/{to}`, but is otherwise
         * the same as [ExchangeRateServiceAsync.deleteAllByCurrencies].
         */
        @MustBeClosed
        suspend fun deleteAllByCurrencies(
            to: String,
            params: ExchangeRateDeleteAllByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteAllByCurrencies(params.toBuilder().to(to).build(), requestOptions)

        /** @see deleteAllByCurrencies */
        @MustBeClosed
        suspend fun deleteAllByCurrencies(
            params: ExchangeRateDeleteAllByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/exchange-rates/{from}/{to}/{date}`, but is
         * otherwise the same as [ExchangeRateServiceAsync.deleteByDate].
         */
        @MustBeClosed
        suspend fun deleteByDate(
            date: String,
            params: ExchangeRateDeleteByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteByDate(params.toBuilder().date(date).build(), requestOptions)

        /** @see deleteByDate */
        @MustBeClosed
        suspend fun deleteByDate(
            params: ExchangeRateDeleteByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates/{from}/{to}`, but is otherwise
         * the same as [ExchangeRateServiceAsync.listByCurrencies].
         */
        @MustBeClosed
        suspend fun listByCurrencies(
            to: String,
            params: ExchangeRateListByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            listByCurrencies(params.toBuilder().to(to).build(), requestOptions)

        /** @see listByCurrencies */
        @MustBeClosed
        suspend fun listByCurrencies(
            params: ExchangeRateListByCurrenciesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `get /v1/exchange-rates/{from}/{to}/{date}`, but is
         * otherwise the same as [ExchangeRateServiceAsync.retrieveByDate].
         */
        @MustBeClosed
        suspend fun retrieveByDate(
            date: String,
            params: ExchangeRateRetrieveByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray> =
            retrieveByDate(params.toBuilder().date(date).build(), requestOptions)

        /** @see retrieveByDate */
        @MustBeClosed
        suspend fun retrieveByDate(
            params: ExchangeRateRetrieveByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateArray>

        /**
         * Returns a raw HTTP response for `put /v1/exchange-rates/{from}/{to}/{date}`, but is
         * otherwise the same as [ExchangeRateServiceAsync.updateByDate].
         */
        @MustBeClosed
        suspend fun updateByDate(
            date: String,
            params: ExchangeRateUpdateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle> =
            updateByDate(params.toBuilder().date(date).build(), requestOptions)

        /** @see updateByDate */
        @MustBeClosed
        suspend fun updateByDate(
            params: ExchangeRateUpdateByDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyExchangeRateSingle>
    }
}
