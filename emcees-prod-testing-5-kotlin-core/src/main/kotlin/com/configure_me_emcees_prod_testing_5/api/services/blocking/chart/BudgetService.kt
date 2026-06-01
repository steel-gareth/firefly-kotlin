// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.chart

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.ChartDataSet
import com.configure_me_emcees_prod_testing_5.api.models.chart.budget.BudgetRetrieveOverviewParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
interface BudgetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetService

    /**
     * This endpoint returns the data required to generate a chart with basic budget information.
     */
    fun retrieveOverview(
        params: BudgetRetrieveOverviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ChartDataSet>

    /** A view of [BudgetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/chart/budget/overview`, but is otherwise the
         * same as [BudgetService.retrieveOverview].
         */
        @MustBeClosed
        fun retrieveOverview(
            params: BudgetRetrieveOverviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ChartDataSet>>
    }
}
