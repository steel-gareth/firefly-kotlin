// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.AccountService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.BalanceService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.BudgetService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.CategoryService

interface ChartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChartService

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun account(): AccountService

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun balance(): BalanceService

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun budget(): BudgetService

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    fun category(): CategoryService

    /** A view of [ChartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChartService.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun account(): AccountService.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun balance(): BalanceService.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun budget(): BudgetService.WithRawResponse

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        fun category(): CategoryService.WithRawResponse
    }
}
