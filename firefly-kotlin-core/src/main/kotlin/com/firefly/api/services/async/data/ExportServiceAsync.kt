// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.data

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.models.data.export.ExportExportAccountsParams
import com.firefly.api.models.data.export.ExportExportBillsParams
import com.firefly.api.models.data.export.ExportExportBudgetsParams
import com.firefly.api.models.data.export.ExportExportCategoriesParams
import com.firefly.api.models.data.export.ExportExportPiggyBanksParams
import com.firefly.api.models.data.export.ExportExportRecurringParams
import com.firefly.api.models.data.export.ExportExportRulesParams
import com.firefly.api.models.data.export.ExportExportTagsParams
import com.firefly.api.models.data.export.ExportExportTransactionsParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
interface ExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportServiceAsync

    /**
     * This endpoint allows you to export your accounts from Firefly III into a file. Currently
     * supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportAccounts(
        params: ExportExportAccountsParams = ExportExportAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportAccounts */
    @MustBeClosed
    suspend fun exportAccounts(requestOptions: RequestOptions): HttpResponse =
        exportAccounts(ExportExportAccountsParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your bills from Firefly III into a file. Currently
     * supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportBills(
        params: ExportExportBillsParams = ExportExportBillsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportBills */
    @MustBeClosed
    suspend fun exportBills(requestOptions: RequestOptions): HttpResponse =
        exportBills(ExportExportBillsParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your budgets and associated budget data from Firefly III
     * into a file. Currently supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportBudgets(
        params: ExportExportBudgetsParams = ExportExportBudgetsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportBudgets */
    @MustBeClosed
    suspend fun exportBudgets(requestOptions: RequestOptions): HttpResponse =
        exportBudgets(ExportExportBudgetsParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your categories from Firefly III into a file. Currently
     * supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportCategories(
        params: ExportExportCategoriesParams = ExportExportCategoriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportCategories */
    @MustBeClosed
    suspend fun exportCategories(requestOptions: RequestOptions): HttpResponse =
        exportCategories(ExportExportCategoriesParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your piggy banks from Firefly III into a file. Currently
     * supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportPiggyBanks(
        params: ExportExportPiggyBanksParams = ExportExportPiggyBanksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportPiggyBanks */
    @MustBeClosed
    suspend fun exportPiggyBanks(requestOptions: RequestOptions): HttpResponse =
        exportPiggyBanks(ExportExportPiggyBanksParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your recurring transactions from Firefly III into a file.
     * Currently supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportRecurring(
        params: ExportExportRecurringParams = ExportExportRecurringParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportRecurring */
    @MustBeClosed
    suspend fun exportRecurring(requestOptions: RequestOptions): HttpResponse =
        exportRecurring(ExportExportRecurringParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your rules and rule groups from Firefly III into a file.
     * Currently supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportRules(
        params: ExportExportRulesParams = ExportExportRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportRules */
    @MustBeClosed
    suspend fun exportRules(requestOptions: RequestOptions): HttpResponse =
        exportRules(ExportExportRulesParams.none(), requestOptions)

    /**
     * This endpoint allows you to export your tags from Firefly III into a file. Currently supports
     * CSV exports only.
     */
    @MustBeClosed
    suspend fun exportTags(
        params: ExportExportTagsParams = ExportExportTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportTags */
    @MustBeClosed
    suspend fun exportTags(requestOptions: RequestOptions): HttpResponse =
        exportTags(ExportExportTagsParams.none(), requestOptions)

    /**
     * This endpoint allows you to export transactions from Firefly III into a file. Currently
     * supports CSV exports only.
     */
    @MustBeClosed
    suspend fun exportTransactions(
        params: ExportExportTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * A view of [ExportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/data/export/accounts`, but is otherwise the same
         * as [ExportServiceAsync.exportAccounts].
         */
        @MustBeClosed
        suspend fun exportAccounts(
            params: ExportExportAccountsParams = ExportExportAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportAccounts */
        @MustBeClosed
        suspend fun exportAccounts(requestOptions: RequestOptions): HttpResponse =
            exportAccounts(ExportExportAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/bills`, but is otherwise the same as
         * [ExportServiceAsync.exportBills].
         */
        @MustBeClosed
        suspend fun exportBills(
            params: ExportExportBillsParams = ExportExportBillsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportBills */
        @MustBeClosed
        suspend fun exportBills(requestOptions: RequestOptions): HttpResponse =
            exportBills(ExportExportBillsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/budgets`, but is otherwise the same
         * as [ExportServiceAsync.exportBudgets].
         */
        @MustBeClosed
        suspend fun exportBudgets(
            params: ExportExportBudgetsParams = ExportExportBudgetsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportBudgets */
        @MustBeClosed
        suspend fun exportBudgets(requestOptions: RequestOptions): HttpResponse =
            exportBudgets(ExportExportBudgetsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/categories`, but is otherwise the
         * same as [ExportServiceAsync.exportCategories].
         */
        @MustBeClosed
        suspend fun exportCategories(
            params: ExportExportCategoriesParams = ExportExportCategoriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportCategories */
        @MustBeClosed
        suspend fun exportCategories(requestOptions: RequestOptions): HttpResponse =
            exportCategories(ExportExportCategoriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/piggy-banks`, but is otherwise the
         * same as [ExportServiceAsync.exportPiggyBanks].
         */
        @MustBeClosed
        suspend fun exportPiggyBanks(
            params: ExportExportPiggyBanksParams = ExportExportPiggyBanksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportPiggyBanks */
        @MustBeClosed
        suspend fun exportPiggyBanks(requestOptions: RequestOptions): HttpResponse =
            exportPiggyBanks(ExportExportPiggyBanksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/recurring`, but is otherwise the
         * same as [ExportServiceAsync.exportRecurring].
         */
        @MustBeClosed
        suspend fun exportRecurring(
            params: ExportExportRecurringParams = ExportExportRecurringParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportRecurring */
        @MustBeClosed
        suspend fun exportRecurring(requestOptions: RequestOptions): HttpResponse =
            exportRecurring(ExportExportRecurringParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/rules`, but is otherwise the same as
         * [ExportServiceAsync.exportRules].
         */
        @MustBeClosed
        suspend fun exportRules(
            params: ExportExportRulesParams = ExportExportRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportRules */
        @MustBeClosed
        suspend fun exportRules(requestOptions: RequestOptions): HttpResponse =
            exportRules(ExportExportRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/tags`, but is otherwise the same as
         * [ExportServiceAsync.exportTags].
         */
        @MustBeClosed
        suspend fun exportTags(
            params: ExportExportTagsParams = ExportExportTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportTags */
        @MustBeClosed
        suspend fun exportTags(requestOptions: RequestOptions): HttpResponse =
            exportTags(ExportExportTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/data/export/transactions`, but is otherwise the
         * same as [ExportServiceAsync.exportTransactions].
         */
        @MustBeClosed
        suspend fun exportTransactions(
            params: ExportExportTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
