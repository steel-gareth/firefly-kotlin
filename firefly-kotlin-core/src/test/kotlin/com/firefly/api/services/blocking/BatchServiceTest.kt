// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.batch.BatchFinishParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun finish() {
        val client = FireflyOkHttpClient.fromEnv()
        val batchService = client.batch()

        batchService.finish(
            BatchFinishParams.builder().xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
        )
    }
}
