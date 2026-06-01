// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.chart

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.chart.account.ChartDataSet
import com.firefly.api.models.chart.balance.BalanceRetrieveBalanceParams
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceServiceAsync

    /** This endpoint returns the data required to generate a chart with balance information. */
    suspend fun retrieveBalance(
        params: BalanceRetrieveBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ChartDataSet>

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/chart/balance/balance`, but is otherwise the
         * same as [BalanceServiceAsync.retrieveBalance].
         */
        @MustBeClosed
        suspend fun retrieveBalance(
            params: BalanceRetrieveBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ChartDataSet>>
    }
}
