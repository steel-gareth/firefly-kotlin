// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.handlers.emptyHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorBodyHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.jsonHandler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpMethod
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpRequest
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse.Handler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.core.http.json
import com.configure_me_emcees_prod_testing_5.api.core.http.parseable
import com.configure_me_emcees_prod_testing_5.api.core.prepareAsync
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

/** All currency exchange rates. */
class ExchangeRateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExchangeRateServiceAsync {

    private val withRawResponse: ExchangeRateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExchangeRateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExchangeRateServiceAsync =
        ExchangeRateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: ExchangeRateCreateParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateSingle =
        // post /v1/exchange-rates
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ExchangeRateRetrieveParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateSingle =
        // get /v1/exchange-rates/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: ExchangeRateUpdateParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateSingle =
        // put /v1/exchange-rates/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: ExchangeRateListParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateArray =
        // get /v1/exchange-rates
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: ExchangeRateDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/exchange-rates/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun createByCurrencies(
        params: ExchangeRateCreateByCurrenciesParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateArray =
        // post /v1/exchange-rates/by-currencies/{from}/{to}
        withRawResponse().createByCurrencies(params, requestOptions).parse()

    override suspend fun createByDate(
        params: ExchangeRateCreateByDateParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateArray =
        // post /v1/exchange-rates/by-date/{date}
        withRawResponse().createByDate(params, requestOptions).parse()

    override suspend fun deleteAllByCurrencies(
        params: ExchangeRateDeleteAllByCurrenciesParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/exchange-rates/{from}/{to}
        withRawResponse().deleteAllByCurrencies(params, requestOptions)
    }

    override suspend fun deleteByDate(
        params: ExchangeRateDeleteByDateParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/exchange-rates/{from}/{to}/{date}
        withRawResponse().deleteByDate(params, requestOptions)
    }

    override suspend fun listByCurrencies(
        params: ExchangeRateListByCurrenciesParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateArray =
        // get /v1/exchange-rates/{from}/{to}
        withRawResponse().listByCurrencies(params, requestOptions).parse()

    override suspend fun retrieveByDate(
        params: ExchangeRateRetrieveByDateParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateArray =
        // get /v1/exchange-rates/{from}/{to}/{date}
        withRawResponse().retrieveByDate(params, requestOptions).parse()

    override suspend fun updateByDate(
        params: ExchangeRateUpdateByDateParams,
        requestOptions: RequestOptions,
    ): CurrencyExchangeRateSingle =
        // put /v1/exchange-rates/{from}/{to}/{date}
        withRawResponse().updateByDate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExchangeRateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExchangeRateServiceAsync.WithRawResponse =
            ExchangeRateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CurrencyExchangeRateSingle> =
            jsonHandler<CurrencyExchangeRateSingle>(clientOptions.jsonMapper)

        override suspend fun create(
            params: ExchangeRateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "exchange-rates")
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CurrencyExchangeRateSingle> =
            jsonHandler<CurrencyExchangeRateSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ExchangeRateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "exchange-rates", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<CurrencyExchangeRateSingle> =
            jsonHandler<CurrencyExchangeRateSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: ExchangeRateUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "exchange-rates", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CurrencyExchangeRateArray> =
            jsonHandler<CurrencyExchangeRateArray>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ExchangeRateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "exchange-rates")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: ExchangeRateDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "exchange-rates", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createByCurrenciesHandler: Handler<CurrencyExchangeRateArray> =
            jsonHandler<CurrencyExchangeRateArray>(clientOptions.jsonMapper)

        override suspend fun createByCurrencies(
            params: ExchangeRateCreateByCurrenciesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("to", params.to())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "exchange-rates",
                        "by-currencies",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createByCurrenciesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createByDateHandler: Handler<CurrencyExchangeRateArray> =
            jsonHandler<CurrencyExchangeRateArray>(clientOptions.jsonMapper)

        override suspend fun createByDate(
            params: ExchangeRateCreateByDateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathDate", params.pathDate())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "exchange-rates", "by-date", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createByDateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAllByCurrenciesHandler: Handler<Void?> = emptyHandler()

        override suspend fun deleteAllByCurrencies(
            params: ExchangeRateDeleteAllByCurrenciesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("to", params.to())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "exchange-rates",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteAllByCurrenciesHandler.handle(it) }
            }
        }

        private val deleteByDateHandler: Handler<Void?> = emptyHandler()

        override suspend fun deleteByDate(
            params: ExchangeRateDeleteByDateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("date", params.date())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "exchange-rates",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteByDateHandler.handle(it) }
            }
        }

        private val listByCurrenciesHandler: Handler<CurrencyExchangeRateArray> =
            jsonHandler<CurrencyExchangeRateArray>(clientOptions.jsonMapper)

        override suspend fun listByCurrencies(
            params: ExchangeRateListByCurrenciesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("to", params.to())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "exchange-rates",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByCurrenciesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByDateHandler: Handler<CurrencyExchangeRateArray> =
            jsonHandler<CurrencyExchangeRateArray>(clientOptions.jsonMapper)

        override suspend fun retrieveByDate(
            params: ExchangeRateRetrieveByDateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("date", params.date())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "exchange-rates",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByDateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateByDateHandler: Handler<CurrencyExchangeRateSingle> =
            jsonHandler<CurrencyExchangeRateSingle>(clientOptions.jsonMapper)

        override suspend fun updateByDate(
            params: ExchangeRateUpdateByDateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyExchangeRateSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("date", params.date())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "exchange-rates",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateByDateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
