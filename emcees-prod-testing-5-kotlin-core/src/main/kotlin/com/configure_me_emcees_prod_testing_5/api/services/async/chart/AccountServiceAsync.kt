// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.chart

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.AccountRetrieveOverviewParams
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.ChartDataSet
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync

    /**
     * This endpoint returns the data required to generate a chart with basic asset account balance
     * information. This is used on the dashboard.
     */
    suspend fun retrieveOverview(
        params: AccountRetrieveOverviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ChartDataSet>

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/chart/account/overview`, but is otherwise the
         * same as [AccountServiceAsync.retrieveOverview].
         */
        @MustBeClosed
        suspend fun retrieveOverview(
            params: AccountRetrieveOverviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ChartDataSet>>
    }
}
