// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.ExpenseServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.IncomeServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.insight.TransferServiceAsync

interface InsightServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InsightServiceAsync

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    fun expense(): ExpenseServiceAsync

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    fun income(): IncomeServiceAsync

    /**
     * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in
     * the broadest sense of the word.
     */
    fun transfer(): TransferServiceAsync

    /**
     * A view of [InsightServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InsightServiceAsync.WithRawResponse

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        fun expense(): ExpenseServiceAsync.WithRawResponse

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        fun income(): IncomeServiceAsync.WithRawResponse

        /**
         * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful
         * information in the broadest sense of the word.
         */
        fun transfer(): TransferServiceAsync.WithRawResponse
    }
}
