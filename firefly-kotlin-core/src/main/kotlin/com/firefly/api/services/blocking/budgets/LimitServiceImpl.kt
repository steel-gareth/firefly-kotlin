// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.budgets

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
import com.firefly.api.core.prepare
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.budgets.limits.BudgetLimitArray
import com.firefly.api.models.budgets.limits.BudgetLimitSingle
import com.firefly.api.models.budgets.limits.LimitCreateParams
import com.firefly.api.models.budgets.limits.LimitDeleteParams
import com.firefly.api.models.budgets.limits.LimitList0Params
import com.firefly.api.models.budgets.limits.LimitList1Params
import com.firefly.api.models.budgets.limits.LimitListTransactionsParams
import com.firefly.api.models.budgets.limits.LimitRetrieveParams
import com.firefly.api.models.budgets.limits.LimitUpdateParams

/** Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits. */
class LimitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LimitService {

    private val withRawResponse: LimitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LimitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LimitService =
        LimitServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: LimitCreateParams,
        requestOptions: RequestOptions,
    ): BudgetLimitSingle =
        // post /v1/budgets/{id}/limits
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LimitRetrieveParams,
        requestOptions: RequestOptions,
    ): BudgetLimitSingle =
        // get /v1/budgets/{id}/limits/{limitId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LimitUpdateParams,
        requestOptions: RequestOptions,
    ): BudgetLimitSingle =
        // put /v1/budgets/{id}/limits/{limitId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: LimitDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/budgets/{id}/limits/{limitId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun list0(params: LimitList0Params, requestOptions: RequestOptions): BudgetLimitArray =
        // get /v1/budgets/{id}/limits
        withRawResponse().list0(params, requestOptions).parse()

    override fun list1(params: LimitList1Params, requestOptions: RequestOptions): BudgetLimitArray =
        // get /v1/budget-limits
        withRawResponse().list1(params, requestOptions).parse()

    override fun listTransactions(
        params: LimitListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/budgets/{id}/limits/{limitId}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LimitService.WithRawResponse =
            LimitServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<BudgetLimitSingle> =
            jsonHandler<BudgetLimitSingle>(clientOptions.jsonMapper)

        override fun create(
            params: LimitCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0), "limits")
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

        private val retrieveHandler: Handler<BudgetLimitSingle> =
            jsonHandler<BudgetLimitSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LimitRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("limitId", params.limitId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "budgets",
                        params._pathParam(0),
                        "limits",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<BudgetLimitSingle> =
            jsonHandler<BudgetLimitSingle>(clientOptions.jsonMapper)

        override fun update(
            params: LimitUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("limitId", params.limitId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "budgets",
                        params._pathParam(0),
                        "limits",
                        params._pathParam(1),
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LimitDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("limitId", params.limitId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "budgets",
                        params._pathParam(0),
                        "limits",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val list0Handler: Handler<BudgetLimitArray> =
            jsonHandler<BudgetLimitArray>(clientOptions.jsonMapper)

        override fun list0(
            params: LimitList0Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budgets", params._pathParam(0), "limits")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { list0Handler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val list1Handler: Handler<BudgetLimitArray> =
            jsonHandler<BudgetLimitArray>(clientOptions.jsonMapper)

        override fun list1(
            params: LimitList1Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "budget-limits")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { list1Handler.handle(it) }
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
            params: LimitListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("limitId", params.limitId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "budgets",
                        params._pathParam(0),
                        "limits",
                        params._pathParam(1),
                        "transactions",
                    )
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
    }
}
