// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.AccountService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.AccountServiceImpl
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.BalanceService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.BalanceServiceImpl
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.BudgetService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.BudgetServiceImpl
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.CategoryService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.chart.CategoryServiceImpl

class ChartServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChartService {

    private val withRawResponse: ChartService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val balance: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val budget: BudgetService by lazy { BudgetServiceImpl(clientOptions) }

    private val category: CategoryService by lazy { CategoryServiceImpl(clientOptions) }

    override fun withRawResponse(): ChartService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChartService =
        ChartServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun account(): AccountService = account

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun balance(): BalanceService = balance

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun budget(): BudgetService = budget

    /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
    override fun category(): CategoryService = category

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChartService.WithRawResponse {

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balance: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val budget: BudgetService.WithRawResponse by lazy {
            BudgetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val category: CategoryService.WithRawResponse by lazy {
            CategoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ChartService.WithRawResponse =
            ChartServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun account(): AccountService.WithRawResponse = account

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun balance(): BalanceService.WithRawResponse = balance

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun budget(): BudgetService.WithRawResponse = budget

        /** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
        override fun category(): CategoryService.WithRawResponse = category
    }
}
