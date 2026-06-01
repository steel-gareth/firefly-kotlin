// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.ExpenseServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.ExpenseServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.IncomeServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.IncomeServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.TransferServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.TransferServiceAsyncImpl

class InsightServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightServiceAsync {

    private val withRawResponse: InsightServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val expense: ExpenseServiceAsync by lazy { ExpenseServiceAsyncImpl(clientOptions) }

    private val income: IncomeServiceAsync by lazy { IncomeServiceAsyncImpl(clientOptions) }

    private val transfer: TransferServiceAsync by lazy { TransferServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InsightServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InsightServiceAsync =
        InsightServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    override fun expense(): ExpenseServiceAsync = expense

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    override fun income(): IncomeServiceAsync = income

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    override fun transfer(): TransferServiceAsync = transfer

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightServiceAsync.WithRawResponse {

        private val expense: ExpenseServiceAsync.WithRawResponse by lazy {
            ExpenseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val income: IncomeServiceAsync.WithRawResponse by lazy {
            IncomeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfer: TransferServiceAsync.WithRawResponse by lazy {
            TransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InsightServiceAsync.WithRawResponse =
            InsightServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        override fun expense(): ExpenseServiceAsync.WithRawResponse = expense

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        override fun income(): IncomeServiceAsync.WithRawResponse = income

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        override fun transfer(): TransferServiceAsync.WithRawResponse = transfer
    }
}
