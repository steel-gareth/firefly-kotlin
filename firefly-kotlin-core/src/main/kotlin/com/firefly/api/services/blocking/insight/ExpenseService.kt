// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.insight

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.insight.expense.ExpenseGetTotalParams
import com.firefly.api.models.insight.expense.ExpenseListByAssetAccountParams
import com.firefly.api.models.insight.expense.ExpenseListByBillParams
import com.firefly.api.models.insight.expense.ExpenseListByBudgetParams
import com.firefly.api.models.insight.expense.ExpenseListByCategoryParams
import com.firefly.api.models.insight.expense.ExpenseListByExpenseAccountParams
import com.firefly.api.models.insight.expense.ExpenseListByTagParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutBillParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutBudgetParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutCategoryParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutTagParams
import com.firefly.api.models.insight.expense.InsightGroupEntry
import com.firefly.api.models.insight.expense.InsightTotalEntry
import com.google.errorprone.annotations.MustBeClosed

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
interface ExpenseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExpenseService

    /** This endpoint gives a sum of the total expenses made by the user. */
    fun getTotal(
        params: ExpenseGetTotalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /** This endpoint gives a summary of the expenses made by the user, grouped by asset account. */
    fun listByAssetAccount(
        params: ExpenseListByAssetAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /** This endpoint gives a summary of the expenses made by the user, grouped by (any) bill. */
    fun listByBill(
        params: ExpenseListByBillParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /** This endpoint gives a summary of the expenses made by the user, grouped by (any) budget. */
    fun listByBudget(
        params: ExpenseListByBudgetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the expenses made by the user, grouped by (any) category.
     */
    fun listByCategory(
        params: ExpenseListByCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the expenses made by the user, grouped by expense account.
     */
    fun listByExpenseAccount(
        params: ExpenseListByExpenseAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /** This endpoint gives a summary of the expenses made by the user, grouped by (any) tag. */
    fun listByTag(
        params: ExpenseListByTagParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the expenses made by the user, including only expenses with
     * no bill.
     */
    fun listWithoutBill(
        params: ExpenseListWithoutBillParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the expenses made by the user, including only expenses with
     * no budget.
     */
    fun listWithoutBudget(
        params: ExpenseListWithoutBudgetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the expenses made by the user, including only expenses with
     * no category.
     */
    fun listWithoutCategory(
        params: ExpenseListWithoutCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the expenses made by the user, including only expenses with
     * no tag.
     */
    fun listWithoutTag(
        params: ExpenseListWithoutTagParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /** A view of [ExpenseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExpenseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/total`, but is otherwise the
         * same as [ExpenseService.getTotal].
         */
        @MustBeClosed
        fun getTotal(
            params: ExpenseGetTotalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/asset`, but is otherwise the
         * same as [ExpenseService.listByAssetAccount].
         */
        @MustBeClosed
        fun listByAssetAccount(
            params: ExpenseListByAssetAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/bill`, but is otherwise the same
         * as [ExpenseService.listByBill].
         */
        @MustBeClosed
        fun listByBill(
            params: ExpenseListByBillParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/budget`, but is otherwise the
         * same as [ExpenseService.listByBudget].
         */
        @MustBeClosed
        fun listByBudget(
            params: ExpenseListByBudgetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/category`, but is otherwise the
         * same as [ExpenseService.listByCategory].
         */
        @MustBeClosed
        fun listByCategory(
            params: ExpenseListByCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/expense`, but is otherwise the
         * same as [ExpenseService.listByExpenseAccount].
         */
        @MustBeClosed
        fun listByExpenseAccount(
            params: ExpenseListByExpenseAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/tag`, but is otherwise the same
         * as [ExpenseService.listByTag].
         */
        @MustBeClosed
        fun listByTag(
            params: ExpenseListByTagParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/no-bill`, but is otherwise the
         * same as [ExpenseService.listWithoutBill].
         */
        @MustBeClosed
        fun listWithoutBill(
            params: ExpenseListWithoutBillParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/no-budget`, but is otherwise the
         * same as [ExpenseService.listWithoutBudget].
         */
        @MustBeClosed
        fun listWithoutBudget(
            params: ExpenseListWithoutBudgetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/no-category`, but is otherwise
         * the same as [ExpenseService.listWithoutCategory].
         */
        @MustBeClosed
        fun listWithoutCategory(
            params: ExpenseListWithoutCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/expense/no-tag`, but is otherwise the
         * same as [ExpenseService.listWithoutTag].
         */
        @MustBeClosed
        fun listWithoutTag(
            params: ExpenseListWithoutTagParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>
    }
}
