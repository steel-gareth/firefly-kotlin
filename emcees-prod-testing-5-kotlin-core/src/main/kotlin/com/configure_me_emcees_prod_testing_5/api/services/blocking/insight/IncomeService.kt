// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.insight

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightGroupEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightTotalEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeGetTotalParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByAssetAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByRevenueAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListWithoutCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListWithoutTagParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
interface IncomeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IncomeService

    /** This endpoint gives a sum of the total income received by the user. */
    fun getTotal(
        params: IncomeGetTotalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the income received by the user, grouped by asset account.
     */
    fun listByAssetAccount(
        params: IncomeListByAssetAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the income received by the user, grouped by (any) category.
     */
    fun listByCategory(
        params: IncomeListByCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the income received by the user, grouped by revenue account.
     */
    fun listByRevenueAccount(
        params: IncomeListByRevenueAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /** This endpoint gives a summary of the income received by the user, grouped by (any) tag. */
    fun listByTag(
        params: IncomeListByTagParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the income received by the user, including only income with
     * no category.
     */
    fun listWithoutCategory(
        params: IncomeListWithoutCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the income received by the user, including only income with
     * no tag.
     */
    fun listWithoutTag(
        params: IncomeListWithoutTagParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /** A view of [IncomeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IncomeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/total`, but is otherwise the same
         * as [IncomeService.getTotal].
         */
        @MustBeClosed
        fun getTotal(
            params: IncomeGetTotalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/asset`, but is otherwise the same
         * as [IncomeService.listByAssetAccount].
         */
        @MustBeClosed
        fun listByAssetAccount(
            params: IncomeListByAssetAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/category`, but is otherwise the
         * same as [IncomeService.listByCategory].
         */
        @MustBeClosed
        fun listByCategory(
            params: IncomeListByCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/revenue`, but is otherwise the
         * same as [IncomeService.listByRevenueAccount].
         */
        @MustBeClosed
        fun listByRevenueAccount(
            params: IncomeListByRevenueAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/tag`, but is otherwise the same
         * as [IncomeService.listByTag].
         */
        @MustBeClosed
        fun listByTag(
            params: IncomeListByTagParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/no-category`, but is otherwise
         * the same as [IncomeService.listWithoutCategory].
         */
        @MustBeClosed
        fun listWithoutCategory(
            params: IncomeListWithoutCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/income/no-tag`, but is otherwise the
         * same as [IncomeService.listWithoutTag].
         */
        @MustBeClosed
        fun listWithoutTag(
            params: IncomeListWithoutTagParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>
    }
}
