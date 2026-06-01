// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.handlers.jsonHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepare
import com.firefly.api.models.autocomplete.AutocompleteBill
import com.firefly.api.models.autocomplete.AutocompleteListAccountsParams
import com.firefly.api.models.autocomplete.AutocompleteListAccountsResponse
import com.firefly.api.models.autocomplete.AutocompleteListBillsParams
import com.firefly.api.models.autocomplete.AutocompleteListBudgetsParams
import com.firefly.api.models.autocomplete.AutocompleteListBudgetsResponse
import com.firefly.api.models.autocomplete.AutocompleteListCategoriesParams
import com.firefly.api.models.autocomplete.AutocompleteListCategoriesResponse
import com.firefly.api.models.autocomplete.AutocompleteListCurrenciesParams
import com.firefly.api.models.autocomplete.AutocompleteListCurrenciesResponse
import com.firefly.api.models.autocomplete.AutocompleteListCurrenciesWithCodeParams
import com.firefly.api.models.autocomplete.AutocompleteListCurrenciesWithCodeResponse
import com.firefly.api.models.autocomplete.AutocompleteListObjectGroupsParams
import com.firefly.api.models.autocomplete.AutocompleteListObjectGroupsResponse
import com.firefly.api.models.autocomplete.AutocompleteListPiggyBanksParams
import com.firefly.api.models.autocomplete.AutocompleteListPiggyBanksResponse
import com.firefly.api.models.autocomplete.AutocompleteListPiggyBanksWithBalanceParams
import com.firefly.api.models.autocomplete.AutocompleteListPiggyBanksWithBalanceResponse
import com.firefly.api.models.autocomplete.AutocompleteListRecurringTransactionsParams
import com.firefly.api.models.autocomplete.AutocompleteListRecurringTransactionsResponse
import com.firefly.api.models.autocomplete.AutocompleteListRuleGroupsParams
import com.firefly.api.models.autocomplete.AutocompleteListRuleGroupsResponse
import com.firefly.api.models.autocomplete.AutocompleteListRulesParams
import com.firefly.api.models.autocomplete.AutocompleteListRulesResponse
import com.firefly.api.models.autocomplete.AutocompleteListSubscriptionsParams
import com.firefly.api.models.autocomplete.AutocompleteListTagsParams
import com.firefly.api.models.autocomplete.AutocompleteListTagsResponse
import com.firefly.api.models.autocomplete.AutocompleteListTransactionTypesParams
import com.firefly.api.models.autocomplete.AutocompleteListTransactionTypesResponse
import com.firefly.api.models.autocomplete.AutocompleteListTransactionsParams
import com.firefly.api.models.autocomplete.AutocompleteListTransactionsResponse
import com.firefly.api.models.autocomplete.AutocompleteListTransactionsWithIdParams
import com.firefly.api.models.autocomplete.AutocompleteListTransactionsWithIdResponse

/**
 * Auto-complete endpoints show basic information about Firefly III models, like the name and maybe
 * some amounts. They all support a search query and can be used to autocomplete data in forms.
 * Autocomplete return values always have a &quot;name&quot;-field.
 */
class AutocompleteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutocompleteService {

    private val withRawResponse: AutocompleteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutocompleteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AutocompleteService =
        AutocompleteServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun listAccounts(
        params: AutocompleteListAccountsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListAccountsResponse> =
        // get /v1/autocomplete/accounts
        withRawResponse().listAccounts(params, requestOptions).parse()

    override fun listBills(
        params: AutocompleteListBillsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteBill> =
        // get /v1/autocomplete/bills
        withRawResponse().listBills(params, requestOptions).parse()

    override fun listBudgets(
        params: AutocompleteListBudgetsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListBudgetsResponse> =
        // get /v1/autocomplete/budgets
        withRawResponse().listBudgets(params, requestOptions).parse()

    override fun listCategories(
        params: AutocompleteListCategoriesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListCategoriesResponse> =
        // get /v1/autocomplete/categories
        withRawResponse().listCategories(params, requestOptions).parse()

    override fun listCurrencies(
        params: AutocompleteListCurrenciesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListCurrenciesResponse> =
        // get /v1/autocomplete/currencies
        withRawResponse().listCurrencies(params, requestOptions).parse()

    override fun listCurrenciesWithCode(
        params: AutocompleteListCurrenciesWithCodeParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListCurrenciesWithCodeResponse> =
        // get /v1/autocomplete/currencies-with-code
        withRawResponse().listCurrenciesWithCode(params, requestOptions).parse()

    override fun listObjectGroups(
        params: AutocompleteListObjectGroupsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListObjectGroupsResponse> =
        // get /v1/autocomplete/object-groups
        withRawResponse().listObjectGroups(params, requestOptions).parse()

    override fun listPiggyBanks(
        params: AutocompleteListPiggyBanksParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListPiggyBanksResponse> =
        // get /v1/autocomplete/piggy-banks
        withRawResponse().listPiggyBanks(params, requestOptions).parse()

    override fun listPiggyBanksWithBalance(
        params: AutocompleteListPiggyBanksWithBalanceParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListPiggyBanksWithBalanceResponse> =
        // get /v1/autocomplete/piggy-banks-with-balance
        withRawResponse().listPiggyBanksWithBalance(params, requestOptions).parse()

    override fun listRecurringTransactions(
        params: AutocompleteListRecurringTransactionsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListRecurringTransactionsResponse> =
        // get /v1/autocomplete/recurring
        withRawResponse().listRecurringTransactions(params, requestOptions).parse()

    override fun listRuleGroups(
        params: AutocompleteListRuleGroupsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListRuleGroupsResponse> =
        // get /v1/autocomplete/rule-groups
        withRawResponse().listRuleGroups(params, requestOptions).parse()

    override fun listRules(
        params: AutocompleteListRulesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListRulesResponse> =
        // get /v1/autocomplete/rules
        withRawResponse().listRules(params, requestOptions).parse()

    override fun listSubscriptions(
        params: AutocompleteListSubscriptionsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteBill> =
        // get /v1/autocomplete/subscriptions
        withRawResponse().listSubscriptions(params, requestOptions).parse()

    override fun listTags(
        params: AutocompleteListTagsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTagsResponse> =
        // get /v1/autocomplete/tags
        withRawResponse().listTags(params, requestOptions).parse()

    override fun listTransactionTypes(
        params: AutocompleteListTransactionTypesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTransactionTypesResponse> =
        // get /v1/autocomplete/transaction-types
        withRawResponse().listTransactionTypes(params, requestOptions).parse()

    override fun listTransactions(
        params: AutocompleteListTransactionsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTransactionsResponse> =
        // get /v1/autocomplete/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    override fun listTransactionsWithId(
        params: AutocompleteListTransactionsWithIdParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTransactionsWithIdResponse> =
        // get /v1/autocomplete/transactions-with-id
        withRawResponse().listTransactionsWithId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutocompleteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AutocompleteService.WithRawResponse =
            AutocompleteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listAccountsHandler: Handler<List<AutocompleteListAccountsResponse>> =
            jsonHandler<List<AutocompleteListAccountsResponse>>(clientOptions.jsonMapper)

        override fun listAccounts(
            params: AutocompleteListAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListAccountsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listBillsHandler: Handler<List<AutocompleteBill>> =
            jsonHandler<List<AutocompleteBill>>(clientOptions.jsonMapper)

        override fun listBills(
            params: AutocompleteListBillsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteBill>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "bills")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBillsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listBudgetsHandler: Handler<List<AutocompleteListBudgetsResponse>> =
            jsonHandler<List<AutocompleteListBudgetsResponse>>(clientOptions.jsonMapper)

        override fun listBudgets(
            params: AutocompleteListBudgetsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListBudgetsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "budgets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBudgetsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listCategoriesHandler: Handler<List<AutocompleteListCategoriesResponse>> =
            jsonHandler<List<AutocompleteListCategoriesResponse>>(clientOptions.jsonMapper)

        override fun listCategories(
            params: AutocompleteListCategoriesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListCategoriesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "categories")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCategoriesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listCurrenciesHandler: Handler<List<AutocompleteListCurrenciesResponse>> =
            jsonHandler<List<AutocompleteListCurrenciesResponse>>(clientOptions.jsonMapper)

        override fun listCurrencies(
            params: AutocompleteListCurrenciesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListCurrenciesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "currencies")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCurrenciesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listCurrenciesWithCodeHandler:
            Handler<List<AutocompleteListCurrenciesWithCodeResponse>> =
            jsonHandler<List<AutocompleteListCurrenciesWithCodeResponse>>(clientOptions.jsonMapper)

        override fun listCurrenciesWithCode(
            params: AutocompleteListCurrenciesWithCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListCurrenciesWithCodeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "currencies-with-code")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listCurrenciesWithCodeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listObjectGroupsHandler: Handler<List<AutocompleteListObjectGroupsResponse>> =
            jsonHandler<List<AutocompleteListObjectGroupsResponse>>(clientOptions.jsonMapper)

        override fun listObjectGroups(
            params: AutocompleteListObjectGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListObjectGroupsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "object-groups")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listObjectGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listPiggyBanksHandler: Handler<List<AutocompleteListPiggyBanksResponse>> =
            jsonHandler<List<AutocompleteListPiggyBanksResponse>>(clientOptions.jsonMapper)

        override fun listPiggyBanks(
            params: AutocompleteListPiggyBanksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListPiggyBanksResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "piggy-banks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPiggyBanksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listPiggyBanksWithBalanceHandler:
            Handler<List<AutocompleteListPiggyBanksWithBalanceResponse>> =
            jsonHandler<List<AutocompleteListPiggyBanksWithBalanceResponse>>(
                clientOptions.jsonMapper
            )

        override fun listPiggyBanksWithBalance(
            params: AutocompleteListPiggyBanksWithBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListPiggyBanksWithBalanceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "piggy-banks-with-balance")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPiggyBanksWithBalanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listRecurringTransactionsHandler:
            Handler<List<AutocompleteListRecurringTransactionsResponse>> =
            jsonHandler<List<AutocompleteListRecurringTransactionsResponse>>(
                clientOptions.jsonMapper
            )

        override fun listRecurringTransactions(
            params: AutocompleteListRecurringTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListRecurringTransactionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "recurring")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRecurringTransactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listRuleGroupsHandler: Handler<List<AutocompleteListRuleGroupsResponse>> =
            jsonHandler<List<AutocompleteListRuleGroupsResponse>>(clientOptions.jsonMapper)

        override fun listRuleGroups(
            params: AutocompleteListRuleGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListRuleGroupsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "rule-groups")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRuleGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listRulesHandler: Handler<List<AutocompleteListRulesResponse>> =
            jsonHandler<List<AutocompleteListRulesResponse>>(clientOptions.jsonMapper)

        override fun listRules(
            params: AutocompleteListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListRulesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "rules")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRulesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listSubscriptionsHandler: Handler<List<AutocompleteBill>> =
            jsonHandler<List<AutocompleteBill>>(clientOptions.jsonMapper)

        override fun listSubscriptions(
            params: AutocompleteListSubscriptionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteBill>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "subscriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSubscriptionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listTagsHandler: Handler<List<AutocompleteListTagsResponse>> =
            jsonHandler<List<AutocompleteListTagsResponse>>(clientOptions.jsonMapper)

        override fun listTags(
            params: AutocompleteListTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTagsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "tags")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTagsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listTransactionTypesHandler:
            Handler<List<AutocompleteListTransactionTypesResponse>> =
            jsonHandler<List<AutocompleteListTransactionTypesResponse>>(clientOptions.jsonMapper)

        override fun listTransactionTypes(
            params: AutocompleteListTransactionTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTransactionTypesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "transaction-types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listTransactionsHandler: Handler<List<AutocompleteListTransactionsResponse>> =
            jsonHandler<List<AutocompleteListTransactionsResponse>>(clientOptions.jsonMapper)

        override fun listTransactions(
            params: AutocompleteListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTransactionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "transactions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listTransactionsWithIdHandler:
            Handler<List<AutocompleteListTransactionsWithIdResponse>> =
            jsonHandler<List<AutocompleteListTransactionsWithIdResponse>>(clientOptions.jsonMapper)

        override fun listTransactionsWithId(
            params: AutocompleteListTransactionsWithIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTransactionsWithIdResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "transactions-with-id")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionsWithIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
