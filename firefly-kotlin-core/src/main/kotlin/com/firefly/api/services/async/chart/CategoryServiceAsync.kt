// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.chart

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.chart.account.ChartDataSet
import com.firefly.api.models.chart.category.CategoryRetrieveOverviewParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
interface CategoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryServiceAsync

    /**
     * This endpoint returns the data required to generate a chart with basic category information.
     */
    suspend fun retrieveOverview(
        params: CategoryRetrieveOverviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ChartDataSet>

    /**
     * A view of [CategoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CategoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/chart/category/overview`, but is otherwise the
         * same as [CategoryServiceAsync.retrieveOverview].
         */
        @MustBeClosed
        suspend fun retrieveOverview(
            params: CategoryRetrieveOverviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ChartDataSet>>
    }
}
