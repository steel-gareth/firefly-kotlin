// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.AccountServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.AccountServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.BalanceServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.BalanceServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.BudgetServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.BudgetServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.CategoryServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.chart.CategoryServiceAsyncImpl

class ChartServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChartServiceAsync {

    private val withRawResponse: ChartServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val balance: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val budget: BudgetServiceAsync by lazy { BudgetServiceAsyncImpl(clientOptions) }

    private val category: CategoryServiceAsync by lazy { CategoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ChartServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChartServiceAsync =
        ChartServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun account(): AccountServiceAsync = account

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun balance(): BalanceServiceAsync = balance

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun budget(): BudgetServiceAsync = budget

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun category(): CategoryServiceAsync = category

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChartServiceAsync.WithRawResponse {

        private val account: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balance: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val budget: BudgetServiceAsync.WithRawResponse by lazy {
            BudgetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val category: CategoryServiceAsync.WithRawResponse by lazy {
            CategoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChartServiceAsync.WithRawResponse =
            ChartServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun account(): AccountServiceAsync.WithRawResponse = account

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun balance(): BalanceServiceAsync.WithRawResponse = balance

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun budget(): BudgetServiceAsync.WithRawResponse = budget

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun category(): CategoryServiceAsync.WithRawResponse = category
    }
}
