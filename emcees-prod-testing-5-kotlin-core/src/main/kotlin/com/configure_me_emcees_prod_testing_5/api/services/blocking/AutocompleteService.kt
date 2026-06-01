// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteBill
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListAccountsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListAccountsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListBillsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListBudgetsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListBudgetsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCategoriesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCategoriesResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCurrenciesResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCurrenciesWithCodeParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCurrenciesWithCodeResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListObjectGroupsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListObjectGroupsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListPiggyBanksResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListPiggyBanksWithBalanceParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListPiggyBanksWithBalanceResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRecurringTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRecurringTransactionsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRuleGroupsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRuleGroupsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRulesResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListSubscriptionsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTagsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTagsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionTypesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionTypesResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionsResponse
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionsWithIdParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionsWithIdResponse
import com.google.errorprone.annotations.MustBeClosed

/**
 * Auto-complete endpoints show basic information about Firefly III models, like the name and maybe
 * some amounts. They all support a search query and can be used to autocomplete data in forms.
 * Autocomplete return values always have a &quot;name&quot;-field.
 */
interface AutocompleteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AutocompleteService

    /** Returns all accounts of the user returned in a basic auto-complete array. */
    fun listAccounts(
        params: AutocompleteListAccountsParams = AutocompleteListAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListAccountsResponse>

    /** @see listAccounts */
    fun listAccounts(requestOptions: RequestOptions): List<AutocompleteListAccountsResponse> =
        listAccounts(AutocompleteListAccountsParams.none(), requestOptions)

    /** Returns all bills of the user returned in a basic auto-complete array. */
    fun listBills(
        params: AutocompleteListBillsParams = AutocompleteListBillsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteBill>

    /** @see listBills */
    fun listBills(requestOptions: RequestOptions): List<AutocompleteBill> =
        listBills(AutocompleteListBillsParams.none(), requestOptions)

    /** Returns all budgets of the user returned in a basic auto-complete array. */
    fun listBudgets(
        params: AutocompleteListBudgetsParams = AutocompleteListBudgetsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListBudgetsResponse>

    /** @see listBudgets */
    fun listBudgets(requestOptions: RequestOptions): List<AutocompleteListBudgetsResponse> =
        listBudgets(AutocompleteListBudgetsParams.none(), requestOptions)

    /** Returns all categories of the user returned in a basic auto-complete array. */
    fun listCategories(
        params: AutocompleteListCategoriesParams = AutocompleteListCategoriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListCategoriesResponse>

    /** @see listCategories */
    fun listCategories(requestOptions: RequestOptions): List<AutocompleteListCategoriesResponse> =
        listCategories(AutocompleteListCategoriesParams.none(), requestOptions)

    /** Returns all currencies of the user returned in a basic auto-complete array. */
    fun listCurrencies(
        params: AutocompleteListCurrenciesParams = AutocompleteListCurrenciesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListCurrenciesResponse>

    /** @see listCurrencies */
    fun listCurrencies(requestOptions: RequestOptions): List<AutocompleteListCurrenciesResponse> =
        listCurrencies(AutocompleteListCurrenciesParams.none(), requestOptions)

    /**
     * Returns all currencies of the user returned in a basic auto-complete array. This endpoint is
     * DEPRECATED and I suggest you DO NOT use it.
     */
    fun listCurrenciesWithCode(
        params: AutocompleteListCurrenciesWithCodeParams =
            AutocompleteListCurrenciesWithCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListCurrenciesWithCodeResponse>

    /** @see listCurrenciesWithCode */
    fun listCurrenciesWithCode(
        requestOptions: RequestOptions
    ): List<AutocompleteListCurrenciesWithCodeResponse> =
        listCurrenciesWithCode(AutocompleteListCurrenciesWithCodeParams.none(), requestOptions)

    /** Returns all object groups of the user returned in a basic auto-complete array. */
    fun listObjectGroups(
        params: AutocompleteListObjectGroupsParams = AutocompleteListObjectGroupsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListObjectGroupsResponse>

    /** @see listObjectGroups */
    fun listObjectGroups(
        requestOptions: RequestOptions
    ): List<AutocompleteListObjectGroupsResponse> =
        listObjectGroups(AutocompleteListObjectGroupsParams.none(), requestOptions)

    /** Returns all piggy banks of the user returned in a basic auto-complete array. */
    fun listPiggyBanks(
        params: AutocompleteListPiggyBanksParams = AutocompleteListPiggyBanksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListPiggyBanksResponse>

    /** @see listPiggyBanks */
    fun listPiggyBanks(requestOptions: RequestOptions): List<AutocompleteListPiggyBanksResponse> =
        listPiggyBanks(AutocompleteListPiggyBanksParams.none(), requestOptions)

    /** Returns all piggy banks of the user returned in a basic auto-complete array. */
    fun listPiggyBanksWithBalance(
        params: AutocompleteListPiggyBanksWithBalanceParams =
            AutocompleteListPiggyBanksWithBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListPiggyBanksWithBalanceResponse>

    /** @see listPiggyBanksWithBalance */
    fun listPiggyBanksWithBalance(
        requestOptions: RequestOptions
    ): List<AutocompleteListPiggyBanksWithBalanceResponse> =
        listPiggyBanksWithBalance(
            AutocompleteListPiggyBanksWithBalanceParams.none(),
            requestOptions,
        )

    /** Returns all recurring transactions of the user returned in a basic auto-complete array. */
    fun listRecurringTransactions(
        params: AutocompleteListRecurringTransactionsParams =
            AutocompleteListRecurringTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListRecurringTransactionsResponse>

    /** @see listRecurringTransactions */
    fun listRecurringTransactions(
        requestOptions: RequestOptions
    ): List<AutocompleteListRecurringTransactionsResponse> =
        listRecurringTransactions(
            AutocompleteListRecurringTransactionsParams.none(),
            requestOptions,
        )

    /** Returns all rule groups of the user returned in a basic auto-complete array. */
    fun listRuleGroups(
        params: AutocompleteListRuleGroupsParams = AutocompleteListRuleGroupsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListRuleGroupsResponse>

    /** @see listRuleGroups */
    fun listRuleGroups(requestOptions: RequestOptions): List<AutocompleteListRuleGroupsResponse> =
        listRuleGroups(AutocompleteListRuleGroupsParams.none(), requestOptions)

    /** Returns all rules of the user returned in a basic auto-complete array. */
    fun listRules(
        params: AutocompleteListRulesParams = AutocompleteListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListRulesResponse>

    /** @see listRules */
    fun listRules(requestOptions: RequestOptions): List<AutocompleteListRulesResponse> =
        listRules(AutocompleteListRulesParams.none(), requestOptions)

    /** Returns all subscriptions of the user returned in a basic auto-complete array. */
    fun listSubscriptions(
        params: AutocompleteListSubscriptionsParams = AutocompleteListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteBill>

    /** @see listSubscriptions */
    fun listSubscriptions(requestOptions: RequestOptions): List<AutocompleteBill> =
        listSubscriptions(AutocompleteListSubscriptionsParams.none(), requestOptions)

    /** Returns all tags of the user returned in a basic auto-complete array. */
    fun listTags(
        params: AutocompleteListTagsParams = AutocompleteListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTagsResponse>

    /** @see listTags */
    fun listTags(requestOptions: RequestOptions): List<AutocompleteListTagsResponse> =
        listTags(AutocompleteListTagsParams.none(), requestOptions)

    /** Returns all transaction types returned in a basic auto-complete array. English only. */
    fun listTransactionTypes(
        params: AutocompleteListTransactionTypesParams =
            AutocompleteListTransactionTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTransactionTypesResponse>

    /** @see listTransactionTypes */
    fun listTransactionTypes(
        requestOptions: RequestOptions
    ): List<AutocompleteListTransactionTypesResponse> =
        listTransactionTypes(AutocompleteListTransactionTypesParams.none(), requestOptions)

    /** Returns all transaction descriptions of the user returned in a basic auto-complete array. */
    fun listTransactions(
        params: AutocompleteListTransactionsParams = AutocompleteListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTransactionsResponse>

    /** @see listTransactions */
    fun listTransactions(
        requestOptions: RequestOptions
    ): List<AutocompleteListTransactionsResponse> =
        listTransactions(AutocompleteListTransactionsParams.none(), requestOptions)

    /**
     * Returns all transactions, complemented with their ID, of the user returned in a basic
     * auto-complete array. This endpoint is DEPRECATED and I suggest you DO NOT use it.
     */
    fun listTransactionsWithId(
        params: AutocompleteListTransactionsWithIdParams =
            AutocompleteListTransactionsWithIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AutocompleteListTransactionsWithIdResponse>

    /** @see listTransactionsWithId */
    fun listTransactionsWithId(
        requestOptions: RequestOptions
    ): List<AutocompleteListTransactionsWithIdResponse> =
        listTransactionsWithId(AutocompleteListTransactionsWithIdParams.none(), requestOptions)

    /**
     * A view of [AutocompleteService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AutocompleteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/accounts`, but is otherwise the
         * same as [AutocompleteService.listAccounts].
         */
        @MustBeClosed
        fun listAccounts(
            params: AutocompleteListAccountsParams = AutocompleteListAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListAccountsResponse>>

        /** @see listAccounts */
        @MustBeClosed
        fun listAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListAccountsResponse>> =
            listAccounts(AutocompleteListAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/bills`, but is otherwise the same
         * as [AutocompleteService.listBills].
         */
        @MustBeClosed
        fun listBills(
            params: AutocompleteListBillsParams = AutocompleteListBillsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteBill>>

        /** @see listBills */
        @MustBeClosed
        fun listBills(requestOptions: RequestOptions): HttpResponseFor<List<AutocompleteBill>> =
            listBills(AutocompleteListBillsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/budgets`, but is otherwise the same
         * as [AutocompleteService.listBudgets].
         */
        @MustBeClosed
        fun listBudgets(
            params: AutocompleteListBudgetsParams = AutocompleteListBudgetsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListBudgetsResponse>>

        /** @see listBudgets */
        @MustBeClosed
        fun listBudgets(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListBudgetsResponse>> =
            listBudgets(AutocompleteListBudgetsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/categories`, but is otherwise the
         * same as [AutocompleteService.listCategories].
         */
        @MustBeClosed
        fun listCategories(
            params: AutocompleteListCategoriesParams = AutocompleteListCategoriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListCategoriesResponse>>

        /** @see listCategories */
        @MustBeClosed
        fun listCategories(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListCategoriesResponse>> =
            listCategories(AutocompleteListCategoriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/currencies`, but is otherwise the
         * same as [AutocompleteService.listCurrencies].
         */
        @MustBeClosed
        fun listCurrencies(
            params: AutocompleteListCurrenciesParams = AutocompleteListCurrenciesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListCurrenciesResponse>>

        /** @see listCurrencies */
        @MustBeClosed
        fun listCurrencies(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListCurrenciesResponse>> =
            listCurrencies(AutocompleteListCurrenciesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/currencies-with-code`, but is
         * otherwise the same as [AutocompleteService.listCurrenciesWithCode].
         */
        @MustBeClosed
        fun listCurrenciesWithCode(
            params: AutocompleteListCurrenciesWithCodeParams =
                AutocompleteListCurrenciesWithCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListCurrenciesWithCodeResponse>>

        /** @see listCurrenciesWithCode */
        @MustBeClosed
        fun listCurrenciesWithCode(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListCurrenciesWithCodeResponse>> =
            listCurrenciesWithCode(AutocompleteListCurrenciesWithCodeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/object-groups`, but is otherwise
         * the same as [AutocompleteService.listObjectGroups].
         */
        @MustBeClosed
        fun listObjectGroups(
            params: AutocompleteListObjectGroupsParams = AutocompleteListObjectGroupsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListObjectGroupsResponse>>

        /** @see listObjectGroups */
        @MustBeClosed
        fun listObjectGroups(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListObjectGroupsResponse>> =
            listObjectGroups(AutocompleteListObjectGroupsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/piggy-banks`, but is otherwise the
         * same as [AutocompleteService.listPiggyBanks].
         */
        @MustBeClosed
        fun listPiggyBanks(
            params: AutocompleteListPiggyBanksParams = AutocompleteListPiggyBanksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListPiggyBanksResponse>>

        /** @see listPiggyBanks */
        @MustBeClosed
        fun listPiggyBanks(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListPiggyBanksResponse>> =
            listPiggyBanks(AutocompleteListPiggyBanksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/piggy-banks-with-balance`, but is
         * otherwise the same as [AutocompleteService.listPiggyBanksWithBalance].
         */
        @MustBeClosed
        fun listPiggyBanksWithBalance(
            params: AutocompleteListPiggyBanksWithBalanceParams =
                AutocompleteListPiggyBanksWithBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListPiggyBanksWithBalanceResponse>>

        /** @see listPiggyBanksWithBalance */
        @MustBeClosed
        fun listPiggyBanksWithBalance(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListPiggyBanksWithBalanceResponse>> =
            listPiggyBanksWithBalance(
                AutocompleteListPiggyBanksWithBalanceParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/recurring`, but is otherwise the
         * same as [AutocompleteService.listRecurringTransactions].
         */
        @MustBeClosed
        fun listRecurringTransactions(
            params: AutocompleteListRecurringTransactionsParams =
                AutocompleteListRecurringTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListRecurringTransactionsResponse>>

        /** @see listRecurringTransactions */
        @MustBeClosed
        fun listRecurringTransactions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListRecurringTransactionsResponse>> =
            listRecurringTransactions(
                AutocompleteListRecurringTransactionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/rule-groups`, but is otherwise the
         * same as [AutocompleteService.listRuleGroups].
         */
        @MustBeClosed
        fun listRuleGroups(
            params: AutocompleteListRuleGroupsParams = AutocompleteListRuleGroupsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListRuleGroupsResponse>>

        /** @see listRuleGroups */
        @MustBeClosed
        fun listRuleGroups(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListRuleGroupsResponse>> =
            listRuleGroups(AutocompleteListRuleGroupsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/rules`, but is otherwise the same
         * as [AutocompleteService.listRules].
         */
        @MustBeClosed
        fun listRules(
            params: AutocompleteListRulesParams = AutocompleteListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListRulesResponse>>

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListRulesResponse>> =
            listRules(AutocompleteListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/subscriptions`, but is otherwise
         * the same as [AutocompleteService.listSubscriptions].
         */
        @MustBeClosed
        fun listSubscriptions(
            params: AutocompleteListSubscriptionsParams =
                AutocompleteListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteBill>>

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteBill>> =
            listSubscriptions(AutocompleteListSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/tags`, but is otherwise the same as
         * [AutocompleteService.listTags].
         */
        @MustBeClosed
        fun listTags(
            params: AutocompleteListTagsParams = AutocompleteListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTagsResponse>>

        /** @see listTags */
        @MustBeClosed
        fun listTags(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTagsResponse>> =
            listTags(AutocompleteListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/transaction-types`, but is
         * otherwise the same as [AutocompleteService.listTransactionTypes].
         */
        @MustBeClosed
        fun listTransactionTypes(
            params: AutocompleteListTransactionTypesParams =
                AutocompleteListTransactionTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTransactionTypesResponse>>

        /** @see listTransactionTypes */
        @MustBeClosed
        fun listTransactionTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTransactionTypesResponse>> =
            listTransactionTypes(AutocompleteListTransactionTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/transactions`, but is otherwise the
         * same as [AutocompleteService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            params: AutocompleteListTransactionsParams = AutocompleteListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTransactionsResponse>>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTransactionsResponse>> =
            listTransactions(AutocompleteListTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autocomplete/transactions-with-id`, but is
         * otherwise the same as [AutocompleteService.listTransactionsWithId].
         */
        @MustBeClosed
        fun listTransactionsWithId(
            params: AutocompleteListTransactionsWithIdParams =
                AutocompleteListTransactionsWithIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AutocompleteListTransactionsWithIdResponse>>

        /** @see listTransactionsWithId */
        @MustBeClosed
        fun listTransactionsWithId(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AutocompleteListTransactionsWithIdResponse>> =
            listTransactionsWithId(AutocompleteListTransactionsWithIdParams.none(), requestOptions)
    }
}
