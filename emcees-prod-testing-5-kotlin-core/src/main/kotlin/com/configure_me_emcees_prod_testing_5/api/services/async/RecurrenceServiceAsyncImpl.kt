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
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceArray
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceListParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceSingle
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceTriggerTransactionParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceUpdateParams

/**
 * Use these endpoints to manage the user&#039;s recurring transactions, trigger the creation of
 * transactions and manage the settings.
 */
class RecurrenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RecurrenceServiceAsync {

    private val withRawResponse: RecurrenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecurrenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RecurrenceServiceAsync =
        RecurrenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: RecurrenceCreateParams,
        requestOptions: RequestOptions,
    ): RecurrenceSingle =
        // post /v1/recurrences
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: RecurrenceRetrieveParams,
        requestOptions: RequestOptions,
    ): RecurrenceSingle =
        // get /v1/recurrences/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: RecurrenceUpdateParams,
        requestOptions: RequestOptions,
    ): RecurrenceSingle =
        // put /v1/recurrences/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: RecurrenceListParams,
        requestOptions: RequestOptions,
    ): RecurrenceArray =
        // get /v1/recurrences
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: RecurrenceDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/recurrences/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listTransactions(
        params: RecurrenceListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/recurrences/{id}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    override suspend fun triggerTransaction(
        params: RecurrenceTriggerTransactionParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // post /v1/recurrences/{id}/trigger
        withRawResponse().triggerTransaction(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecurrenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RecurrenceServiceAsync.WithRawResponse =
            RecurrenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<RecurrenceSingle> =
            jsonHandler<RecurrenceSingle>(clientOptions.jsonMapper)

        override suspend fun create(
            params: RecurrenceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences")
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

        private val retrieveHandler: Handler<RecurrenceSingle> =
            jsonHandler<RecurrenceSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: RecurrenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences", params._pathParam(0))
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

        private val updateHandler: Handler<RecurrenceSingle> =
            jsonHandler<RecurrenceSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: RecurrenceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences", params._pathParam(0))
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

        private val listHandler: Handler<RecurrenceArray> =
            jsonHandler<RecurrenceArray>(clientOptions.jsonMapper)

        override suspend fun list(
            params: RecurrenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences")
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
            params: RecurrenceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listTransactionsHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override suspend fun listTransactions(
            params: RecurrenceListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences", params._pathParam(0), "transactions")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerTransactionHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override suspend fun triggerTransaction(
            params: RecurrenceTriggerTransactionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "recurrences", params._pathParam(0), "trigger")
                    .putHeader("Accept", "application/vnd.api+json")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { triggerTransactionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
