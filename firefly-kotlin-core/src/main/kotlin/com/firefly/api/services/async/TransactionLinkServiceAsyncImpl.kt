// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.checkRequired
import com.firefly.api.core.handlers.emptyHandler
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.handlers.jsonHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.core.http.json
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepareAsync
import com.firefly.api.models.transactionlinks.TransactionLinkArray
import com.firefly.api.models.transactionlinks.TransactionLinkCreateParams
import com.firefly.api.models.transactionlinks.TransactionLinkDeleteParams
import com.firefly.api.models.transactionlinks.TransactionLinkListParams
import com.firefly.api.models.transactionlinks.TransactionLinkRetrieveParams
import com.firefly.api.models.transactionlinks.TransactionLinkSingle
import com.firefly.api.models.transactionlinks.TransactionLinkUpdateParams

/** Endpoints to manage links between transactions, and manage the type of links available. */
class TransactionLinkServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionLinkServiceAsync {

    private val withRawResponse: TransactionLinkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionLinkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): TransactionLinkServiceAsync =
        TransactionLinkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: TransactionLinkCreateParams,
        requestOptions: RequestOptions,
    ): TransactionLinkSingle =
        // post /v1/transaction-links
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: TransactionLinkRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionLinkSingle =
        // get /v1/transaction-links/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: TransactionLinkUpdateParams,
        requestOptions: RequestOptions,
    ): TransactionLinkSingle =
        // put /v1/transaction-links/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: TransactionLinkListParams,
        requestOptions: RequestOptions,
    ): TransactionLinkArray =
        // get /v1/transaction-links
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: TransactionLinkDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/transaction-links/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionLinkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionLinkServiceAsync.WithRawResponse =
            TransactionLinkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<TransactionLinkSingle> =
            jsonHandler<TransactionLinkSingle>(clientOptions.jsonMapper)

        override suspend fun create(
            params: TransactionLinkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-links")
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

        private val retrieveHandler: Handler<TransactionLinkSingle> =
            jsonHandler<TransactionLinkSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionLinkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-links", params._pathParam(0))
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

        private val updateHandler: Handler<TransactionLinkSingle> =
            jsonHandler<TransactionLinkSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TransactionLinkUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-links", params._pathParam(0))
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

        private val listHandler: Handler<TransactionLinkArray> =
            jsonHandler<TransactionLinkArray>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TransactionLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-links")
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
            params: TransactionLinkDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-links", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
