// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.services.async.chart.AccountServiceAsync
import com.firefly.api.services.async.chart.BalanceServiceAsync
import com.firefly.api.services.async.chart.BudgetServiceAsync
import com.firefly.api.services.async.chart.CategoryServiceAsync

interface ChartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChartServiceAsync

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun account(): AccountServiceAsync

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun balance(): BalanceServiceAsync

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun budget(): BudgetServiceAsync

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun category(): CategoryServiceAsync

    /** A view of [ChartServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChartServiceAsync.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun account(): AccountServiceAsync.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun balance(): BalanceServiceAsync.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun budget(): BudgetServiceAsync.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun category(): CategoryServiceAsync.WithRawResponse
    }
}
