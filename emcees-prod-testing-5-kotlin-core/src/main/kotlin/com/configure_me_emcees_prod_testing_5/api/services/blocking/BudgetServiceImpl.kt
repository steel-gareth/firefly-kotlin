// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

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
import com.configure_me_emcees_prod_testing_5.api.core.prepare
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListResponse
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListTransactionsWithoutBudgetParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetSingle
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetUpdateParams
import com.configure_me_emcees_prod_testing_5.api.services.blocking.budgets.LimitService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.budgets.LimitServiceImpl

/** Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits. */
class BudgetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BudgetService {

    private val withRawResponse: BudgetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val limits: LimitService by lazy { LimitServiceImpl(clientOptions) }

    override fun withRawResponse(): BudgetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetService =
        BudgetServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    override fun limits(): LimitService = limits

    override fun create(params: BudgetCreateParams, requestOptions: RequestOptions): BudgetSingle =
        // post /v1/budgets
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BudgetRetrieveParams,
        requestOptions: RequestOptions,
    ): BudgetSingle =
        // get /v1/budgets/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BudgetUpdateParams, requestOptions: RequestOptions): BudgetSingle =
        // put /v1/budgets/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BudgetListParams,
        requestOptions: RequestOptions,
    ): BudgetListResponse =
        // get /v1/budgets
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BudgetDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/budgets/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listAttachments(
        params: BudgetListAttachmentsParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/budgets/{id}/attachments
        withRawResponse().listAttachments(params, requestOptions).parse()

    override fun listTransactions(
        params: BudgetListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/budgets/{id}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    override fun listTransactionsWithoutBudget(
        params: BudgetListTransactionsWithoutBudgetParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/budgets/transactions-without-budget
        withRawResponse().listTransactionsWithoutBudget(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BudgetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val limits: LimitService.WithRawResponse by lazy {
            LimitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BudgetService.WithRawResponse =
            BudgetServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        override fun limits(): LimitService.WithRawResponse = limits

        private val createHandler: Handler<BudgetSingle> =
            jsonHandler<BudgetSingle>(clientOptions.jsonMapper)

        override fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets")
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<BudgetSingle> =
            jsonHandler<BudgetSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BudgetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<BudgetSingle> =
            jsonHandler<BudgetSingle>(clientOptions.jsonMapper)

        override fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<BudgetListResponse> =
            jsonHandler<BudgetListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BudgetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listAttachmentsHandler: Handler<AttachmentArray> =
            jsonHandler<AttachmentArray>(clientOptions.jsonMapper)

        override fun listAttachments(
            params: BudgetListAttachmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0), "attachments")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun listTransactions(
            params: BudgetListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0), "transactions")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listTransactionsWithoutBudgetHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override fun listTransactionsWithoutBudget(
            params: BudgetListTransactionsWithoutBudgetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", "transactions-without-budget")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionsWithoutBudgetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
