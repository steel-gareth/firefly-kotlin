// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.services.blocking.insight.ExpenseService
import com.firefly.api.services.blocking.insight.ExpenseServiceImpl
import com.firefly.api.services.blocking.insight.IncomeService
import com.firefly.api.services.blocking.insight.IncomeServiceImpl
import com.firefly.api.services.blocking.insight.TransferService
import com.firefly.api.services.blocking.insight.TransferServiceImpl

class InsightServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightService {

    private val withRawResponse: InsightService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val expense: ExpenseService by lazy { ExpenseServiceImpl(clientOptions) }

    private val income: IncomeService by lazy { IncomeServiceImpl(clientOptions) }

    private val transfer: TransferService by lazy { TransferServiceImpl(clientOptions) }

    override fun withRawResponse(): InsightService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InsightService =
        InsightServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    override fun expense(): ExpenseService = expense

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    override fun income(): IncomeService = income

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    override fun transfer(): TransferService = transfer

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightService.WithRawResponse {

        private val expense: ExpenseService.WithRawResponse by lazy {
            ExpenseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val income: IncomeService.WithRawResponse by lazy {
            IncomeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfer: TransferService.WithRawResponse by lazy {
            TransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InsightService.WithRawResponse =
            InsightServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        override fun expense(): ExpenseService.WithRawResponse = expense

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        override fun income(): IncomeService.WithRawResponse = income

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        override fun transfer(): TransferService.WithRawResponse = transfer
    }
}
