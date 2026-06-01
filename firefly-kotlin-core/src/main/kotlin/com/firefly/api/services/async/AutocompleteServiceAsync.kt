// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
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
import com.google.errorprone.annotations.MustBeClosed

/**
 * Auto-complete endpoints show basic information about Firefly III models, like the name and maybe
 * some amounts. They all support a search query and can be used to autocomplete data in forms.
 * Autocomplete return values always have a &quot;name&quot;-field.
 */
interface AutocompleteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AutocompleteServiceAsync

    /** Returns all accounts of the user returned in a basic auto-complete array. */
    suspend fun listAccounts(
        params: AutocompleteListAccountsParams = AutocompleteListAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListAccountsResponse>

    /** @see listAccounts */
    suspend fun listAccounts(
        requestOptions: RequestOptions
    ): List<AutocompleteListAccountsResponse> =
        listAccounts(AutocompleteListAccountsParams.none(), requestOptions)

    /** Returns all bills of the user returned in a basic auto-complete array. */
    suspend fun listBills(
        params: AutocompleteListBillsParams = AutocompleteListBillsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteBill>

    /** @see listBills */
    suspend fun listBills(requestOptions: RequestOptions): List<AutocompleteBill> =
        listBills(AutocompleteListBillsParams.none(), requestOptions)

    /** Returns all budgets of the user returned in a basic auto-complete array. */
    suspend fun listBudgets(
        params: AutocompleteListBudgetsParams = AutocompleteListBudgetsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListBudgetsResponse>

    /** @see listBudgets */
    suspend fun listBudgets(requestOptions: RequestOptions): List<AutocompleteListBudgetsResponse> =
        listBudgets(AutocompleteListBudgetsParams.none(), requestOptions)

    /** Returns all categories of the user returned in a basic auto-complete array. */
    suspend fun listCategories(
        params: AutocompleteListCategoriesParams = AutocompleteListCategoriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListCategoriesResponse>

    /** @see listCategories */
    suspend fun listCategories(
        requestOptions: RequestOptions
    ): List<AutocompleteListCategoriesResponse> =
        listCategories(AutocompleteListCategoriesParams.none(), requestOptions)

    /** Returns all currencies of the user returned in a basic auto-complete array. */
    suspend fun listCurrencies(
        params: AutocompleteListCurrenciesParams = AutocompleteListCurrenciesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListCurrenciesResponse>

    /** @see listCurrencies */
    suspend fun listCurrencies(
        requestOptions: RequestOptions
    ): List<AutocompleteListCurrenciesResponse> =
        listCurrencies(AutocompleteListCurrenciesParams.none(), requestOptions)

    /**
     * Returns all currencies of the user returned in a basic auto-complete array. This endpoint is
     * DEPRECATED and I suggest you DO NOT use it.
     */
    suspend fun listCurrenciesWithCode(
        params: AutocompleteListCurrenciesWithCodeParams =
            AutocompleteListCurrenciesWithCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListCurrenciesWithCodeResponse>

    /** @see listCurrenciesWithCode */
    suspend fun listCurrenciesWithCode(
        requestOptions: RequestOptions
    ): List<AutocompleteListCurrenciesWithCodeResponse> =
        listCurrenciesWithCode(AutocompleteListCurrenciesWithCodeParams.none(), requestOptions)

    /** Returns all object groups of the user returned in a basic auto-complete array. */
    suspend fun listObjectGroups(
        params: AutocompleteListObjectGroupsParams = AutocompleteListObjectGroupsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListObjectGroupsResponse>

    /** @see listObjectGroups */
    suspend fun listObjectGroups(
        requestOptions: RequestOptions
    ): List<AutocompleteListObjectGroupsResponse> =
        listObjectGroups(AutocompleteListObjectGroupsParams.none(), requestOptions)

    /** Returns all piggy banks of the user returned in a basic auto-complete array. */
    suspend fun listPiggyBanks(
        params: AutocompleteListPiggyBanksParams = AutocompleteListPiggyBanksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListPiggyBanksResponse>

    /** @see listPiggyBanks */
    suspend fun listPiggyBanks(
        requestOptions: RequestOptions
    ): List<AutocompleteListPiggyBanksResponse> =
        listPiggyBanks(AutocompleteListPiggyBanksParams.none(), requestOptions)

    /** Returns all piggy banks of the user returned in a basic auto-complete array. */
    suspend fun listPiggyBanksWithBalance(
        params: AutocompleteListPiggyBanksWithBalanceParams =
            AutocompleteListPiggyBanksWithBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListPiggyBanksWithBalanceResponse>

    /** @see listPiggyBanksWithBalance */
    suspend fun listPiggyBanksWithBalance(
        requestOptions: RequestOptions
    ): List<AutocompleteListPiggyBanksWithBalanceResponse> =
        listPiggyBanksWithBalance(
            AutocompleteListPiggyBanksWithBalanceParams.none(),
            requestOptions,
        )

    /** Returns all recurring transactions of the user returned in a basic auto-complete array. */
    suspend fun listRecurringTransactions(
        params: AutocompleteListRecurringTransactionsParams =
            AutocompleteListRecurringTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListRecurringTransactionsResponse>

    /** @see listRecurringTransactions */
    suspend fun listRecurringTransactions(
        requestOptions: RequestOptions
    ): List<AutocompleteListRecurringTransactionsResponse> =
        listRecurringTransactions(
            AutocompleteListRecurringTransactionsParams.none(),
            requestOptions,
        )

    /** Returns all rule groups of the user returned in a basic auto-complete array. */
    suspend fun listRuleGroups(
        params: AutocompleteListRuleGroupsParams = AutocompleteListRuleGroupsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListRuleGroupsResponse>

    /** @see listRuleGroups */
    suspend fun listRuleGroups(
        requestOptions: RequestOptions
    ): List<AutocompleteListRuleGroupsResponse> =
        listRuleGroups(AutocompleteListRuleGroupsParams.none(), requestOptions)

    /** Returns all rules of the user returned in a basic auto-complete array. */
    suspend fun listRules(
        params: AutocompleteListRulesParams = AutocompleteListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListRulesResponse>

    /** @see listRules */
    suspend fun listRules(requestOptions: RequestOptions): List<AutocompleteListRulesResponse> =
        listRules(AutocompleteListRulesParams.none(), requestOptions)

    /** Returns all subscriptions of the user returned in a basic auto-complete array. */
    suspend fun listSubscriptions(
        params: AutocompleteListSubscriptionsParams = AutocompleteListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteBill>

    /** @see listSubscriptions */
    suspend fun listSubscriptions(requestOptions: RequestOptions): List<AutocompleteBill> =
        listSubscriptions(AutocompleteListSubscriptionsParams.none(), requestOptions)

    /** Returns all tags of the user returned in a basic auto-complete array. */
    suspend fun listTags(
        params: AutocompleteListTagsParams = AutocompleteListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTagsResponse>

    /** @see listTags */
    suspend fun listTags(requestOptions: RequestOptions): List<AutocompleteListTagsResponse> =
        listTags(AutocompleteListTagsParams.none(), requestOptions)

    /** Returns all transaction types returned in a basic auto-complete array. English only. */
    suspend fun listTransactionTypes(
        params: AutocompleteListTransactionTypesParams =
            AutocompleteListTransactionTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTransactionTypesResponse>

    /** @see listTransactionTypes */
    suspend fun listTransactionTypes(
        requestOptions: RequestOptions
    ): List<AutocompleteListTransactionTypesResponse> =
        listTransactionTypes(AutocompleteListTransactionTypesParams.none(), requestOptions)

    /** Returns all transaction descriptions of the user returned in a basic auto-complete array. */
    suspend fun listTransactions(
        params: AutocompleteListTransactionsParams = AutocompleteListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTransactionsResponse>

    /** @see listTransactions */
    suspend fun listTransactions(
        requestOptions: RequestOptions
    ): List<AutocompleteListTransactionsResponse> =
        listTransactions(AutocompleteListTransactionsParams.none(), requestOptions)

    /**
     * Returns all transactions, complemented with their ID, of the user returned in a basic
     * auto-complete array. This endpoint is DEPRECATED and I suggest you DO NOT use it.
     */
    suspend fun listTransactionsWithId(
        params: AutocompleteListTransactionsWithIdParams =
            AutocompleteListTransactionsWithIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTransactionsWithIdResponse>

    /** @see listTransactionsWithId */
    suspend fun listTransactionsWithId(
        requestOptions: RequestOptions
    ): List<AutocompleteListTransactionsWithIdResponse> =
        listTransactionsWithId(AutocompleteListTransactionsWithIdParams.none(), requestOptions)

    /**
     * A view of [AutocompleteServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AutocompleteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/accounts`, but is otherwise the
         * same as [AutocompleteServiceAsync.listAccounts].
         */
        @MustBeClosed
        suspend fun listAccounts(
            params: AutocompleteListAccountsParams = AutocompleteListAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListAccountsResponse>>

        /** @see listAccounts */
        @MustBeClosed
        suspend fun listAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListAccountsResponse>> =
            listAccounts(AutocompleteListAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/bills`, but is otherwise the same
         * as [AutocompleteServiceAsync.listBills].
         */
        @MustBeClosed
        suspend fun listBills(
            params: AutocompleteListBillsParams = AutocompleteListBillsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteBill>>

        /** @see listBills */
        @MustBeClosed
        suspend fun listBills(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteBill>> =
            listBills(AutocompleteListBillsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/budgets`, but is otherwise the same
         * as [AutocompleteServiceAsync.listBudgets].
         */
        @MustBeClosed
        suspend fun listBudgets(
            params: AutocompleteListBudgetsParams = AutocompleteListBudgetsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListBudgetsResponse>>

        /** @see listBudgets */
        @MustBeClosed
        suspend fun listBudgets(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListBudgetsResponse>> =
            listBudgets(AutocompleteListBudgetsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/categories`, but is otherwise the
         * same as [AutocompleteServiceAsync.listCategories].
         */
        @MustBeClosed
        suspend fun listCategories(
            params: AutocompleteListCategoriesParams = AutocompleteListCategoriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListCategoriesResponse>>

        /** @see listCategories */
        @MustBeClosed
        suspend fun listCategories(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListCategoriesResponse>> =
            listCategories(AutocompleteListCategoriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/currencies`, but is otherwise the
         * same as [AutocompleteServiceAsync.listCurrencies].
         */
        @MustBeClosed
        suspend fun listCurrencies(
            params: AutocompleteListCurrenciesParams = AutocompleteListCurrenciesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListCurrenciesResponse>>

        /** @see listCurrencies */
        @MustBeClosed
        suspend fun listCurrencies(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListCurrenciesResponse>> =
            listCurrencies(AutocompleteListCurrenciesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/currencies-with-code`, but is
         * otherwise the same as [AutocompleteServiceAsync.listCurrenciesWithCode].
         */
        @MustBeClosed
        suspend fun listCurrenciesWithCode(
            params: AutocompleteListCurrenciesWithCodeParams =
                AutocompleteListCurrenciesWithCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListCurrenciesWithCodeResponse>>

        /** @see listCurrenciesWithCode */
        @MustBeClosed
        suspend fun listCurrenciesWithCode(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListCurrenciesWithCodeResponse>> =
            listCurrenciesWithCode(AutocompleteListCurrenciesWithCodeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/object-groups`, but is otherwise
         * the same as [AutocompleteServiceAsync.listObjectGroups].
         */
        @MustBeClosed
        suspend fun listObjectGroups(
            params: AutocompleteListObjectGroupsParams = AutocompleteListObjectGroupsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListObjectGroupsResponse>>

        /** @see listObjectGroups */
        @MustBeClosed
        suspend fun listObjectGroups(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListObjectGroupsResponse>> =
            listObjectGroups(AutocompleteListObjectGroupsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/piggy-banks`, but is otherwise the
         * same as [AutocompleteServiceAsync.listPiggyBanks].
         */
        @MustBeClosed
        suspend fun listPiggyBanks(
            params: AutocompleteListPiggyBanksParams = AutocompleteListPiggyBanksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListPiggyBanksResponse>>

        /** @see listPiggyBanks */
        @MustBeClosed
        suspend fun listPiggyBanks(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListPiggyBanksResponse>> =
            listPiggyBanks(AutocompleteListPiggyBanksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/piggy-banks-with-balance`, but is
         * otherwise the same as [AutocompleteServiceAsync.listPiggyBanksWithBalance].
         */
        @MustBeClosed
        suspend fun listPiggyBanksWithBalance(
            params: AutocompleteListPiggyBanksWithBalanceParams =
                AutocompleteListPiggyBanksWithBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListPiggyBanksWithBalanceResponse>>

        /** @see listPiggyBanksWithBalance */
        @MustBeClosed
        suspend fun listPiggyBanksWithBalance(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListPiggyBanksWithBalanceResponse>> =
            listPiggyBanksWithBalance(
                AutocompleteListPiggyBanksWithBalanceParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/recurring`, but is otherwise the
         * same as [AutocompleteServiceAsync.listRecurringTransactions].
         */
        @MustBeClosed
        suspend fun listRecurringTransactions(
            params: AutocompleteListRecurringTransactionsParams =
                AutocompleteListRecurringTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListRecurringTransactionsResponse>>

        /** @see listRecurringTransactions */
        @MustBeClosed
        suspend fun listRecurringTransactions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListRecurringTransactionsResponse>> =
            listRecurringTransactions(
                AutocompleteListRecurringTransactionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/rule-groups`, but is otherwise the
         * same as [AutocompleteServiceAsync.listRuleGroups].
         */
        @MustBeClosed
        suspend fun listRuleGroups(
            params: AutocompleteListRuleGroupsParams = AutocompleteListRuleGroupsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListRuleGroupsResponse>>

        /** @see listRuleGroups */
        @MustBeClosed
        suspend fun listRuleGroups(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListRuleGroupsResponse>> =
            listRuleGroups(AutocompleteListRuleGroupsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/rules`, but is otherwise the same
         * as [AutocompleteServiceAsync.listRules].
         */
        @MustBeClosed
        suspend fun listRules(
            params: AutocompleteListRulesParams = AutocompleteListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListRulesResponse>>

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListRulesResponse>> =
            listRules(AutocompleteListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/subscriptions`, but is otherwise
         * the same as [AutocompleteServiceAsync.listSubscriptions].
         */
        @MustBeClosed
        suspend fun listSubscriptions(
            params: AutocompleteListSubscriptionsParams =
                AutocompleteListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteBill>>

        /** @see listSubscriptions */
        @MustBeClosed
        suspend fun listSubscriptions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteBill>> =
            listSubscriptions(AutocompleteListSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/tags`, but is otherwise the same as
         * [AutocompleteServiceAsync.listTags].
         */
        @MustBeClosed
        suspend fun listTags(
            params: AutocompleteListTagsParams = AutocompleteListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTagsResponse>>

        /** @see listTags */
        @MustBeClosed
        suspend fun listTags(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTagsResponse>> =
            listTags(AutocompleteListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/transaction-types`, but is
         * otherwise the same as [AutocompleteServiceAsync.listTransactionTypes].
         */
        @MustBeClosed
        suspend fun listTransactionTypes(
            params: AutocompleteListTransactionTypesParams =
                AutocompleteListTransactionTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTransactionTypesResponse>>

        /** @see listTransactionTypes */
        @MustBeClosed
        suspend fun listTransactionTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTransactionTypesResponse>> =
            listTransactionTypes(AutocompleteListTransactionTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/transactions`, but is otherwise the
         * same as [AutocompleteServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            params: AutocompleteListTransactionsParams = AutocompleteListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTransactionsResponse>>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTransactionsResponse>> =
            listTransactions(AutocompleteListTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/transactions-with-id`, but is
         * otherwise the same as [AutocompleteServiceAsync.listTransactionsWithId].
         */
        @MustBeClosed
        suspend fun listTransactionsWithId(
            params: AutocompleteListTransactionsWithIdParams =
                AutocompleteListTransactionsWithIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTransactionsWithIdResponse>>

        /** @see listTransactionsWithId */
        @MustBeClosed
        suspend fun listTransactionsWithId(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTransactionsWithIdResponse>> =
            listTransactionsWithId(AutocompleteListTransactionsWithIdParams.none(), requestOptions)
    }
}
