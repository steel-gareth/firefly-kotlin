// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.data

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.data.bulk.BulkUpdateTransactionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateTransactions() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val bulkServiceAsync = client.data().bulk()

        bulkServiceAsync.updateTransactions(
            BulkUpdateTransactionsParams.builder()
                .query("query")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
