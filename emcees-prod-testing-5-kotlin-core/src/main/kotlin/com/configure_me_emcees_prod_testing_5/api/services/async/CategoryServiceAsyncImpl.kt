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
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListResponse
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategorySingle
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryUpdateParams

/**
 * Endpoints to manage a user&#039;s categories and get information on transactions and other
 * related objects.
 */
class CategoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CategoryServiceAsync {

    private val withRawResponse: CategoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CategoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryServiceAsync =
        CategoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CategoryCreateParams,
        requestOptions: RequestOptions,
    ): CategorySingle =
        // post /v1/categories
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CategoryRetrieveParams,
        requestOptions: RequestOptions,
    ): CategorySingle =
        // get /v1/categories/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: CategoryUpdateParams,
        requestOptions: RequestOptions,
    ): CategorySingle =
        // put /v1/categories/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CategoryListParams,
        requestOptions: RequestOptions,
    ): CategoryListResponse =
        // get /v1/categories
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: CategoryDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/categories/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listAttachments(
        params: CategoryListAttachmentsParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/categories/{id}/attachments
        withRawResponse().listAttachments(params, requestOptions).parse()

    override suspend fun listTransactions(
        params: CategoryListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/categories/{id}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CategoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CategoryServiceAsync.WithRawResponse =
            CategoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CategorySingle> =
            jsonHandler<CategorySingle>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CategoryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategorySingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories")
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

        private val retrieveHandler: Handler<CategorySingle> =
            jsonHandler<CategorySingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CategoryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategorySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories", params._pathParam(0))
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

        private val updateHandler: Handler<CategorySingle> =
            jsonHandler<CategorySingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: CategoryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategorySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories", params._pathParam(0))
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

        private val listHandler: Handler<CategoryListResponse> =
            jsonHandler<CategoryListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CategoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategoryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories")
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
            params: CategoryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories", params._pathParam(0))
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
            params: CategoryListAttachmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories", params._pathParam(0), "attachments")
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

        private val listTransactionsHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override suspend fun listTransactions(
            params: CategoryListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "categories", params._pathParam(0), "transactions")
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
    }
}
