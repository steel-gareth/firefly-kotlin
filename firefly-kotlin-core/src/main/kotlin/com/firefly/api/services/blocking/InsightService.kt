// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.services.blocking.insight.ExpenseService
import com.firefly.api.services.blocking.insight.IncomeService
import com.firefly.api.services.blocking.insight.TransferService

interface InsightService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InsightService

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    fun expense(): ExpenseService

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    fun income(): IncomeService

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    fun transfer(): TransferService

    /** A view of [InsightService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InsightService.WithRawResponse

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        fun expense(): ExpenseService.WithRawResponse

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        fun income(): IncomeService.WithRawResponse

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        fun transfer(): TransferService.WithRawResponse
    }
}
