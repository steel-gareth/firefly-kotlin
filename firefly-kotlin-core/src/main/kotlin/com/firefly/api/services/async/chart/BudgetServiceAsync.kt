// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.chart

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.chart.account.ChartDataSet
import com.firefly.api.models.chart.budget.BudgetRetrieveOverviewParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
interface BudgetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetServiceAsync

    /**
     * This endpoint returns the data required to generate a chart with basic budget information.
     */
    suspend fun retrieveOverview(
        params: BudgetRetrieveOverviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ChartDataSet>

    /**
     * A view of [BudgetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BudgetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/chart/budget/overview`, but is otherwise the
         * same as [BudgetServiceAsync.retrieveOverview].
         */
        @MustBeClosed
        suspend fun retrieveOverview(
            params: BudgetRetrieveOverviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ChartDataSet>>
    }
}
