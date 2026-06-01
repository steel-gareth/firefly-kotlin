// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.chart

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.AccountRetrieveOverviewParams
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.ChartDataSet
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountService

    /**
     * This endpoint returns the data required to generate a chart with basic asset account balance
     * information. This is used on the dashboard.
     */
    fun retrieveOverview(
        params: AccountRetrieveOverviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ChartDataSet>

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/chart/account/overview`, but is otherwise the
         * same as [AccountService.retrieveOverview].
         */
        @MustBeClosed
        fun retrieveOverview(
            params: AccountRetrieveOverviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ChartDataSet>>
    }
}
