// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

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
import com.firefly.api.core.prepareAsync
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
class AutocompleteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutocompleteServiceAsync {

    private val withRawResponse: AutocompleteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutocompleteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AutocompleteServiceAsync =
        AutocompleteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun listAccounts(
        params: AutocompleteListAccountsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListAccountsResponse> =
        // get /v1/autocomplete/accounts
        withRawResponse().listAccounts(params, requestOptions).parse()

    override suspend fun listBills(
        params: AutocompleteListBillsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteBill> =
        // get /v1/autocomplete/bills
        withRawResponse().listBills(params, requestOptions).parse()

    override suspend fun listBudgets(
        params: AutocompleteListBudgetsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListBudgetsResponse> =
        // get /v1/autocomplete/budgets
        withRawResponse().listBudgets(params, requestOptions).parse()

    override suspend fun listCategories(
        params: AutocompleteListCategoriesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListCategoriesResponse> =
        // get /v1/autocomplete/categories
        withRawResponse().listCategories(params, requestOptions).parse()

    override suspend fun listCurrencies(
        params: AutocompleteListCurrenciesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListCurrenciesResponse> =
        // get /v1/autocomplete/currencies
        withRawResponse().listCurrencies(params, requestOptions).parse()

    override suspend fun listCurrenciesWithCode(
        params: AutocompleteListCurrenciesWithCodeParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListCurrenciesWithCodeResponse> =
        // get /v1/autocomplete/currencies-with-code
        withRawResponse().listCurrenciesWithCode(params, requestOptions).parse()

    override suspend fun listObjectGroups(
        params: AutocompleteListObjectGroupsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListObjectGroupsResponse> =
        // get /v1/autocomplete/object-groups
        withRawResponse().listObjectGroups(params, requestOptions).parse()

    override suspend fun listPiggyBanks(
        params: AutocompleteListPiggyBanksParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListPiggyBanksResponse> =
        // get /v1/autocomplete/piggy-banks
        withRawResponse().listPiggyBanks(params, requestOptions).parse()

    override suspend fun listPiggyBanksWithBalance(
        params: AutocompleteListPiggyBanksWithBalanceParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListPiggyBanksWithBalanceResponse> =
        // get /v1/autocomplete/piggy-banks-with-balance
        withRawResponse().listPiggyBanksWithBalance(params, requestOptions).parse()

    override suspend fun listRecurringTransactions(
        params: AutocompleteListRecurringTransactionsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListRecurringTransactionsResponse> =
        // get /v1/autocomplete/recurring
        withRawResponse().listRecurringTransactions(params, requestOptions).parse()

    override suspend fun listRuleGroups(
        params: AutocompleteListRuleGroupsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListRuleGroupsResponse> =
        // get /v1/autocomplete/rule-groups
        withRawResponse().listRuleGroups(params, requestOptions).parse()

    override suspend fun listRules(
        params: AutocompleteListRulesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListRulesResponse> =
        // get /v1/autocomplete/rules
        withRawResponse().listRules(params, requestOptions).parse()

    override suspend fun listSubscriptions(
        params: AutocompleteListSubscriptionsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteBill> =
        // get /v1/autocomplete/subscriptions
        withRawResponse().listSubscriptions(params, requestOptions).parse()

    override suspend fun listTags(
        params: AutocompleteListTagsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTagsResponse> =
        // get /v1/autocomplete/tags
        withRawResponse().listTags(params, requestOptions).parse()

    override suspend fun listTransactionTypes(
        params: AutocompleteListTransactionTypesParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTransactionTypesResponse> =
        // get /v1/autocomplete/transaction-types
        withRawResponse().listTransactionTypes(params, requestOptions).parse()

    override suspend fun listTransactions(
        params: AutocompleteListTransactionsParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTransactionsResponse> =
        // get /v1/autocomplete/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    override suspend fun listTransactionsWithId(
        params: AutocompleteListTransactionsWithIdParams,
        requestOptions: RequestOptions,
    ): List<AutocompleteListTransactionsWithIdResponse> =
        // get /v1/autocomplete/transactions-with-id
        withRawResponse().listTransactionsWithId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutocompleteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AutocompleteServiceAsync.WithRawResponse =
            AutocompleteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listAccountsHandler: Handler<List<AutocompleteListAccountsResponse>> =
            jsonHandler<List<AutocompleteListAccountsResponse>>(clientOptions.jsonMapper)

        override suspend fun listAccounts(
            params: AutocompleteListAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListAccountsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listBills(
            params: AutocompleteListBillsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteBill>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "bills")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listBudgets(
            params: AutocompleteListBudgetsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListBudgetsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "budgets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listCategories(
            params: AutocompleteListCategoriesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListCategoriesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "categories")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listCurrencies(
            params: AutocompleteListCurrenciesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListCurrenciesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "currencies")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listCurrenciesWithCode(
            params: AutocompleteListCurrenciesWithCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListCurrenciesWithCodeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "currencies-with-code")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listObjectGroups(
            params: AutocompleteListObjectGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListObjectGroupsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "object-groups")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listPiggyBanks(
            params: AutocompleteListPiggyBanksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListPiggyBanksResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "piggy-banks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listPiggyBanksWithBalance(
            params: AutocompleteListPiggyBanksWithBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListPiggyBanksWithBalanceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "piggy-banks-with-balance")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listRecurringTransactions(
            params: AutocompleteListRecurringTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListRecurringTransactionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "recurring")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listRuleGroups(
            params: AutocompleteListRuleGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListRuleGroupsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "rule-groups")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listRules(
            params: AutocompleteListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListRulesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "rules")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listSubscriptions(
            params: AutocompleteListSubscriptionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteBill>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "subscriptions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listTags(
            params: AutocompleteListTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTagsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "tags")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listTransactionTypes(
            params: AutocompleteListTransactionTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTransactionTypesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "transaction-types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listTransactions(
            params: AutocompleteListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTransactionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listTransactionsWithId(
            params: AutocompleteListTransactionsWithIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AutocompleteListTransactionsWithIdResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autocomplete", "transactions-with-id")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
