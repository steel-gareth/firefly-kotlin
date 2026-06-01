// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.data

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.data.bulk.BulkUpdateTransactionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val bulkService = client.data().bulk()

        bulkService.updateTransactions(
            BulkUpdateTransactionsParams.builder()
                .query("query")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
