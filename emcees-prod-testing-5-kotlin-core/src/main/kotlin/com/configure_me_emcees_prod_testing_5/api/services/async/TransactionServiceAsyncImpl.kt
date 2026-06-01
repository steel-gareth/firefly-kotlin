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
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankEventArray
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionSingle
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListPiggyBankEventsParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionUpdateParams

/**
 * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
 * transactions.
 */
class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync =
        TransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions,
    ): TransactionSingle =
        // post /v1/transactions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionSingle =
        // get /v1/transactions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions,
    ): TransactionSingle =
        // put /v1/transactions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/transactions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: TransactionDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/transactions/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listAttachments(
        params: TransactionListAttachmentsParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/transactions/{id}/attachments
        withRawResponse().listAttachments(params, requestOptions).parse()

    override suspend fun listPiggyBankEvents(
        params: TransactionListPiggyBankEventsParams,
        requestOptions: RequestOptions,
    ): PiggyBankEventArray =
        // get /v1/transactions/{id}/piggy-bank-events
        withRawResponse().listPiggyBankEvents(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionServiceAsync.WithRawResponse =
            TransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<TransactionSingle> =
            jsonHandler<TransactionSingle>(clientOptions.jsonMapper)

        override suspend fun create(
            params: TransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transactions")
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

        private val retrieveHandler: Handler<TransactionSingle> =
            jsonHandler<TransactionSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transactions", params._pathParam(0))
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

        private val updateHandler: Handler<TransactionSingle> =
            jsonHandler<TransactionSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TransactionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transactions", params._pathParam(0))
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

        private val listHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transactions")
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
            params: TransactionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transactions", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listAttachmentsHandler: Handler<AttachmentArray> =
            jsonHandler<AttachmentArray>(clientOptions.jsonMapper)

        override suspend fun listAttachments(
            params: TransactionListAttachmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transactions", params._pathParam(0), "attachments")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAttachmentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPiggyBankEventsHandler: Handler<PiggyBankEventArray> =
            jsonHandler<PiggyBankEventArray>(clientOptions.jsonMapper)

        override suspend fun listPiggyBankEvents(
            params: TransactionListPiggyBankEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankEventArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transactions",
                        params._pathParam(0),
                        "piggy-bank-events",
                    )
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPiggyBankEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
