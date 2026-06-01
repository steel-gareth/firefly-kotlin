// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.cron.CronRunParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CronServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun run() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val cronServiceAsync = client.cron()

        val response =
            cronServiceAsync.run(
                CronRunParams.builder()
                    .cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c")
                    .date(LocalDate.parse("2026-04-01"))
                    .force(false)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.validate()
    }
}
