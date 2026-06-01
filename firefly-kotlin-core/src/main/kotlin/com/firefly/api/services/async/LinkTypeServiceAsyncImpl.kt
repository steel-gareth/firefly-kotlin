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
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.linktypes.LinkTypeCreateParams
import com.firefly.api.models.linktypes.LinkTypeDeleteParams
import com.firefly.api.models.linktypes.LinkTypeListParams
import com.firefly.api.models.linktypes.LinkTypeListResponse
import com.firefly.api.models.linktypes.LinkTypeListTransactionsParams
import com.firefly.api.models.linktypes.LinkTypeRetrieveParams
import com.firefly.api.models.linktypes.LinkTypeSingle
import com.firefly.api.models.linktypes.LinkTypeUpdateParams

/** Endpoints to manage links between transactions, and manage the type of links available. */
class LinkTypeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LinkTypeServiceAsync {

    private val withRawResponse: LinkTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LinkTypeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LinkTypeServiceAsync =
        LinkTypeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LinkTypeCreateParams,
        requestOptions: RequestOptions,
    ): LinkTypeSingle =
        // post /v1/link-types
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LinkTypeRetrieveParams,
        requestOptions: RequestOptions,
    ): LinkTypeSingle =
        // get /v1/link-types/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LinkTypeUpdateParams,
        requestOptions: RequestOptions,
    ): LinkTypeSingle =
        // put /v1/link-types/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LinkTypeListParams,
        requestOptions: RequestOptions,
    ): LinkTypeListResponse =
        // get /v1/link-types
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: LinkTypeDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/link-types/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listTransactions(
        params: LinkTypeListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/link-types/{id}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LinkTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LinkTypeServiceAsync.WithRawResponse =
            LinkTypeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LinkTypeSingle> =
            jsonHandler<LinkTypeSingle>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LinkTypeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkTypeSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "link-types")
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

        private val retrieveHandler: Handler<LinkTypeSingle> =
            jsonHandler<LinkTypeSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LinkTypeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkTypeSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "link-types", params._pathParam(0))
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

        private val updateHandler: Handler<LinkTypeSingle> =
            jsonHandler<LinkTypeSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: LinkTypeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkTypeSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "link-types", params._pathParam(0))
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

        private val listHandler: Handler<LinkTypeListResponse> =
            jsonHandler<LinkTypeListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LinkTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkTypeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "link-types")
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
            params: LinkTypeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "link-types", params._pathParam(0))
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
            params: LinkTypeListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "link-types", params._pathParam(0), "transactions")
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
    }
}
