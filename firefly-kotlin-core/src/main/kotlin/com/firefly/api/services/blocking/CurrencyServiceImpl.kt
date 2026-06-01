// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

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
import com.firefly.api.models.accounts.AccountArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.availablebudgets.AvailableBudgetArray
import com.firefly.api.models.bills.BillArray
import com.firefly.api.models.bills.RuleArray
import com.firefly.api.models.budgets.limits.BudgetLimitArray
import com.firefly.api.models.currencies.CurrencyCreateParams
import com.firefly.api.models.currencies.CurrencyDeleteParams
import com.firefly.api.models.currencies.CurrencyDisableParams
import com.firefly.api.models.currencies.CurrencyEnableParams
import com.firefly.api.models.currencies.CurrencyListAccountsParams
import com.firefly.api.models.currencies.CurrencyListAvailableBudgetsParams
import com.firefly.api.models.currencies.CurrencyListBillsParams
import com.firefly.api.models.currencies.CurrencyListBudgetLimitsParams
import com.firefly.api.models.currencies.CurrencyListParams
import com.firefly.api.models.currencies.CurrencyListRecurrencesParams
import com.firefly.api.models.currencies.CurrencyListResponse
import com.firefly.api.models.currencies.CurrencyListRulesParams
import com.firefly.api.models.currencies.CurrencyListTransactionsParams
import com.firefly.api.models.currencies.CurrencyRetrieveParams
import com.firefly.api.models.currencies.CurrencySingle
import com.firefly.api.models.currencies.CurrencyUpdateParams
import com.firefly.api.models.recurrences.RecurrenceArray
import com.firefly.api.services.blocking.currencies.PrimaryService
import com.firefly.api.services.blocking.currencies.PrimaryServiceImpl

/**
 * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can also
 * disable and enable them, or add new ones.
 */
class CurrencyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrencyService {

    private val withRawResponse: CurrencyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val primary: PrimaryService by lazy { PrimaryServiceImpl(clientOptions) }

    override fun withRawResponse(): CurrencyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CurrencyService =
        CurrencyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can
     * also disable and enable them, or add new ones.
     */
    override fun primary(): PrimaryService = primary

    override fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // post /v1/currencies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // get /v1/currencies/{code}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // put /v1/currencies/{code}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CurrencyListParams,
        requestOptions: RequestOptions,
    ): CurrencyListResponse =
        // get /v1/currencies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CurrencyDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/currencies/{code}
        withRawResponse().delete(params, requestOptions)
    }

    override fun disable(
        params: CurrencyDisableParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // post /v1/currencies/{code}/disable
        withRawResponse().disable(params, requestOptions).parse()

    override fun enable(
        params: CurrencyEnableParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // post /v1/currencies/{code}/enable
        withRawResponse().enable(params, requestOptions).parse()

    override fun listAccounts(
        params: CurrencyListAccountsParams,
        requestOptions: RequestOptions,
    ): AccountArray =
        // get /v1/currencies/{code}/accounts
        withRawResponse().listAccounts(params, requestOptions).parse()

    override fun listAvailableBudgets(
        params: CurrencyListAvailableBudgetsParams,
        requestOptions: RequestOptions,
    ): AvailableBudgetArray =
        // get /v1/currencies/{code}/available-budgets
        withRawResponse().listAvailableBudgets(params, requestOptions).parse()

    override fun listBills(
        params: CurrencyListBillsParams,
        requestOptions: RequestOptions,
    ): BillArray =
        // get /v1/currencies/{code}/bills
        withRawResponse().listBills(params, requestOptions).parse()

    override fun listBudgetLimits(
        params: CurrencyListBudgetLimitsParams,
        requestOptions: RequestOptions,
    ): BudgetLimitArray =
        // get /v1/currencies/{code}/budget-limits
        withRawResponse().listBudgetLimits(params, requestOptions).parse()

    override fun listRecurrences(
        params: CurrencyListRecurrencesParams,
        requestOptions: RequestOptions,
    ): RecurrenceArray =
        // get /v1/currencies/{code}/recurrences
        withRawResponse().listRecurrences(params, requestOptions).parse()

    override fun listRules(
        params: CurrencyListRulesParams,
        requestOptions: RequestOptions,
    ): RuleArray =
        // get /v1/currencies/{code}/rules
        withRawResponse().listRules(params, requestOptions).parse()

    override fun listTransactions(
        params: CurrencyListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/currencies/{code}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrencyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val primary: PrimaryService.WithRawResponse by lazy {
            PrimaryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CurrencyService.WithRawResponse =
            CurrencyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you
         * can also disable and enable them, or add new ones.
         */
        override fun primary(): PrimaryService.WithRawResponse = primary

        private val createHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun create(
            params: CurrencyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies")
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

        private val retrieveHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CurrencyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0))
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

        private val updateHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun update(
            params: CurrencyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathCode", params.pathCode())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0))
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

        private val listHandler: Handler<CurrencyListResponse> =
            jsonHandler<CurrencyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CurrencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies")
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
            params: CurrencyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val disableHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun disable(
            params: CurrencyDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "disable")
                    .putHeader("Accept", "application/vnd.api+json")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { disableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun enable(
            params: CurrencyEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "enable")
                    .putHeader("Accept", "application/vnd.api+json")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAccountsHandler: Handler<AccountArray> =
            jsonHandler<AccountArray>(clientOptions.jsonMapper)

        override fun listAccounts(
            params: CurrencyListAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "accounts")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAvailableBudgetsHandler: Handler<AvailableBudgetArray> =
            jsonHandler<AvailableBudgetArray>(clientOptions.jsonMapper)

        override fun listAvailableBudgets(
            params: CurrencyListAvailableBudgetsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailableBudgetArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "available-budgets")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAvailableBudgetsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBillsHandler: Handler<BillArray> =
            jsonHandler<BillArray>(clientOptions.jsonMapper)

        override fun listBills(
            params: CurrencyListBillsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "bills")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBillsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBudgetLimitsHandler: Handler<BudgetLimitArray> =
            jsonHandler<BudgetLimitArray>(clientOptions.jsonMapper)

        override fun listBudgetLimits(
            params: CurrencyListBudgetLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "budget-limits")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBudgetLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRecurrencesHandler: Handler<RecurrenceArray> =
            jsonHandler<RecurrenceArray>(clientOptions.jsonMapper)

        override fun listRecurrences(
            params: CurrencyListRecurrencesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "recurrences")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRecurrencesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRulesHandler: Handler<RuleArray> =
            jsonHandler<RuleArray>(clientOptions.jsonMapper)

        override fun listRules(
            params: CurrencyListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "rules")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRulesHandler.handle(it) }
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
            params: CurrencyListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "transactions")
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
