// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.data

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.data.bulk.BulkUpdateTransactionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val bulkServiceAsync = client.data().bulk()

        bulkServiceAsync.updateTransactions(
            BulkUpdateTransactionsParams.builder()
                .query("query")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
