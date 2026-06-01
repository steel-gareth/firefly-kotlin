// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
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
import com.firefly.api.services.async.currencies.PrimaryServiceAsync
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can also
 * disable and enable them, or add new ones.
 */
interface CurrencyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CurrencyServiceAsync

    /**
     * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can
     * also disable and enable them, or add new ones.
     */
    fun primary(): PrimaryServiceAsync

    /**
     * Creates a new currency. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** Get a single currency. */
    suspend fun retrieve(
        code: String,
        params: CurrencyRetrieveParams = CurrencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle = retrieve(params.toBuilder().code(code).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** @see retrieve */
    suspend fun retrieve(code: String, requestOptions: RequestOptions): CurrencySingle =
        retrieve(code, CurrencyRetrieveParams.none(), requestOptions)

    /** Update existing currency. */
    suspend fun update(
        pathCode: String,
        params: CurrencyUpdateParams = CurrencyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle = update(params.toBuilder().pathCode(pathCode).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** @see update */
    suspend fun update(pathCode: String, requestOptions: RequestOptions): CurrencySingle =
        update(pathCode, CurrencyUpdateParams.none(), requestOptions)

    /** List all currencies. */
    suspend fun list(
        params: CurrencyListParams = CurrencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CurrencyListResponse =
        list(CurrencyListParams.none(), requestOptions)

    /** Delete a currency. */
    suspend fun delete(
        code: String,
        params: CurrencyDeleteParams = CurrencyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().code(code).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: CurrencyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(code: String, requestOptions: RequestOptions) =
        delete(code, CurrencyDeleteParams.none(), requestOptions)

    /** Disable a currency. */
    suspend fun disable(
        code: String,
        params: CurrencyDisableParams = CurrencyDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle = disable(params.toBuilder().code(code).build(), requestOptions)

    /** @see disable */
    suspend fun disable(
        params: CurrencyDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** @see disable */
    suspend fun disable(code: String, requestOptions: RequestOptions): CurrencySingle =
        disable(code, CurrencyDisableParams.none(), requestOptions)

    /** Enable a single currency. */
    suspend fun enable(
        code: String,
        params: CurrencyEnableParams = CurrencyEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle = enable(params.toBuilder().code(code).build(), requestOptions)

    /** @see enable */
    suspend fun enable(
        params: CurrencyEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencySingle

    /** @see enable */
    suspend fun enable(code: String, requestOptions: RequestOptions): CurrencySingle =
        enable(code, CurrencyEnableParams.none(), requestOptions)

    /** List all accounts with this currency. */
    suspend fun listAccounts(
        code: String,
        params: CurrencyListAccountsParams = CurrencyListAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountArray = listAccounts(params.toBuilder().code(code).build(), requestOptions)

    /** @see listAccounts */
    suspend fun listAccounts(
        params: CurrencyListAccountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountArray

    /** @see listAccounts */
    suspend fun listAccounts(code: String, requestOptions: RequestOptions): AccountArray =
        listAccounts(code, CurrencyListAccountsParams.none(), requestOptions)

    /** List all available budgets with this currency. */
    suspend fun listAvailableBudgets(
        code: String,
        params: CurrencyListAvailableBudgetsParams = CurrencyListAvailableBudgetsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetArray =
        listAvailableBudgets(params.toBuilder().code(code).build(), requestOptions)

    /** @see listAvailableBudgets */
    suspend fun listAvailableBudgets(
        params: CurrencyListAvailableBudgetsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvailableBudgetArray

    /** @see listAvailableBudgets */
    suspend fun listAvailableBudgets(
        code: String,
        requestOptions: RequestOptions,
    ): AvailableBudgetArray =
        listAvailableBudgets(code, CurrencyListAvailableBudgetsParams.none(), requestOptions)

    /** List all bills with this currency. */
    suspend fun listBills(
        code: String,
        params: CurrencyListBillsParams = CurrencyListBillsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray = listBills(params.toBuilder().code(code).build(), requestOptions)

    /** @see listBills */
    suspend fun listBills(
        params: CurrencyListBillsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray

    /** @see listBills */
    suspend fun listBills(code: String, requestOptions: RequestOptions): BillArray =
        listBills(code, CurrencyListBillsParams.none(), requestOptions)

    /** List all budget limits with this currency */
    suspend fun listBudgetLimits(
        code: String,
        params: CurrencyListBudgetLimitsParams = CurrencyListBudgetLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray = listBudgetLimits(params.toBuilder().code(code).build(), requestOptions)

    /** @see listBudgetLimits */
    suspend fun listBudgetLimits(
        params: CurrencyListBudgetLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray

    /** @see listBudgetLimits */
    suspend fun listBudgetLimits(code: String, requestOptions: RequestOptions): BudgetLimitArray =
        listBudgetLimits(code, CurrencyListBudgetLimitsParams.none(), requestOptions)

    /** List all recurring transactions with this currency. */
    suspend fun listRecurrences(
        code: String,
        params: CurrencyListRecurrencesParams = CurrencyListRecurrencesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceArray = listRecurrences(params.toBuilder().code(code).build(), requestOptions)

    /** @see listRecurrences */
    suspend fun listRecurrences(
        params: CurrencyListRecurrencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceArray

    /** @see listRecurrences */
    suspend fun listRecurrences(code: String, requestOptions: RequestOptions): RecurrenceArray =
        listRecurrences(code, CurrencyListRecurrencesParams.none(), requestOptions)

    /** List all rules with this currency. */
    suspend fun listRules(
        code: String,
        params: CurrencyListRulesParams = CurrencyListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray = listRules(params.toBuilder().code(code).build(), requestOptions)

    /** @see listRules */
    suspend fun listRules(
        params: CurrencyListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see listRules */
    suspend fun listRules(code: String, requestOptions: RequestOptions): RuleArray =
        listRules(code, CurrencyListRulesParams.none(), requestOptions)

    /** List all transactions with this currency. */
    suspend fun listTransactions(
        code: String,
        params: CurrencyListTransactionsParams = CurrencyListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().code(code).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: CurrencyListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(code: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(code, CurrencyListTransactionsParams.none(), requestOptions)

    /**
     * A view of [CurrencyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CurrencyServiceAsync.WithRawResponse

        /**
         * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you
         * can also disable and enable them, or add new ones.
         */
        fun primary(): PrimaryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/currencies`, but is otherwise the same as
         * [CurrencyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CurrencyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}`, but is otherwise the same as
         * [CurrencyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            code: String,
            params: CurrencyRetrieveParams = CurrencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle> =
            retrieve(params.toBuilder().code(code).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CurrencyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> =
            retrieve(code, CurrencyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/currencies/{code}`, but is otherwise the same as
         * [CurrencyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            pathCode: String,
            params: CurrencyUpdateParams = CurrencyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle> =
            update(params.toBuilder().pathCode(pathCode).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CurrencyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            pathCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> =
            update(pathCode, CurrencyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies`, but is otherwise the same as
         * [CurrencyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CurrencyListParams = CurrencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CurrencyListResponse> =
            list(CurrencyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/currencies/{code}`, but is otherwise the same
         * as [CurrencyServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            code: String,
            params: CurrencyDeleteParams = CurrencyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().code(code).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: CurrencyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(code: String, requestOptions: RequestOptions): HttpResponse =
            delete(code, CurrencyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/currencies/{code}/disable`, but is otherwise
         * the same as [CurrencyServiceAsync.disable].
         */
        @MustBeClosed
        suspend fun disable(
            code: String,
            params: CurrencyDisableParams = CurrencyDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle> =
            disable(params.toBuilder().code(code).build(), requestOptions)

        /** @see disable */
        @MustBeClosed
        suspend fun disable(
            params: CurrencyDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /** @see disable */
        @MustBeClosed
        suspend fun disable(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> =
            disable(code, CurrencyDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/currencies/{code}/enable`, but is otherwise the
         * same as [CurrencyServiceAsync.enable].
         */
        @MustBeClosed
        suspend fun enable(
            code: String,
            params: CurrencyEnableParams = CurrencyEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle> =
            enable(params.toBuilder().code(code).build(), requestOptions)

        /** @see enable */
        @MustBeClosed
        suspend fun enable(
            params: CurrencyEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencySingle>

        /** @see enable */
        @MustBeClosed
        suspend fun enable(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> =
            enable(code, CurrencyEnableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/accounts`, but is otherwise
         * the same as [CurrencyServiceAsync.listAccounts].
         */
        @MustBeClosed
        suspend fun listAccounts(
            code: String,
            params: CurrencyListAccountsParams = CurrencyListAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountArray> =
            listAccounts(params.toBuilder().code(code).build(), requestOptions)

        /** @see listAccounts */
        @MustBeClosed
        suspend fun listAccounts(
            params: CurrencyListAccountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountArray>

        /** @see listAccounts */
        @MustBeClosed
        suspend fun listAccounts(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountArray> =
            listAccounts(code, CurrencyListAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/available-budgets`, but is
         * otherwise the same as [CurrencyServiceAsync.listAvailableBudgets].
         */
        @MustBeClosed
        suspend fun listAvailableBudgets(
            code: String,
            params: CurrencyListAvailableBudgetsParams = CurrencyListAvailableBudgetsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetArray> =
            listAvailableBudgets(params.toBuilder().code(code).build(), requestOptions)

        /** @see listAvailableBudgets */
        @MustBeClosed
        suspend fun listAvailableBudgets(
            params: CurrencyListAvailableBudgetsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvailableBudgetArray>

        /** @see listAvailableBudgets */
        @MustBeClosed
        suspend fun listAvailableBudgets(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailableBudgetArray> =
            listAvailableBudgets(code, CurrencyListAvailableBudgetsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/bills`, but is otherwise the
         * same as [CurrencyServiceAsync.listBills].
         */
        @MustBeClosed
        suspend fun listBills(
            code: String,
            params: CurrencyListBillsParams = CurrencyListBillsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray> =
            listBills(params.toBuilder().code(code).build(), requestOptions)

        /** @see listBills */
        @MustBeClosed
        suspend fun listBills(
            params: CurrencyListBillsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray>

        /** @see listBills */
        @MustBeClosed
        suspend fun listBills(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillArray> =
            listBills(code, CurrencyListBillsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/budget-limits`, but is
         * otherwise the same as [CurrencyServiceAsync.listBudgetLimits].
         */
        @MustBeClosed
        suspend fun listBudgetLimits(
            code: String,
            params: CurrencyListBudgetLimitsParams = CurrencyListBudgetLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray> =
            listBudgetLimits(params.toBuilder().code(code).build(), requestOptions)

        /** @see listBudgetLimits */
        @MustBeClosed
        suspend fun listBudgetLimits(
            params: CurrencyListBudgetLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray>

        /** @see listBudgetLimits */
        @MustBeClosed
        suspend fun listBudgetLimits(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitArray> =
            listBudgetLimits(code, CurrencyListBudgetLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/recurrences`, but is otherwise
         * the same as [CurrencyServiceAsync.listRecurrences].
         */
        @MustBeClosed
        suspend fun listRecurrences(
            code: String,
            params: CurrencyListRecurrencesParams = CurrencyListRecurrencesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceArray> =
            listRecurrences(params.toBuilder().code(code).build(), requestOptions)

        /** @see listRecurrences */
        @MustBeClosed
        suspend fun listRecurrences(
            params: CurrencyListRecurrencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceArray>

        /** @see listRecurrences */
        @MustBeClosed
        suspend fun listRecurrences(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceArray> =
            listRecurrences(code, CurrencyListRecurrencesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/rules`, but is otherwise the
         * same as [CurrencyServiceAsync.listRules].
         */
        @MustBeClosed
        suspend fun listRules(
            code: String,
            params: CurrencyListRulesParams = CurrencyListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray> =
            listRules(params.toBuilder().code(code).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            params: CurrencyListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> =
            listRules(code, CurrencyListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/currencies/{code}/transactions`, but is
         * otherwise the same as [CurrencyServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            code: String,
            params: CurrencyListTransactionsParams = CurrencyListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().code(code).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: CurrencyListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            code: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(code, CurrencyListTransactionsParams.none(), requestOptions)
    }
}
