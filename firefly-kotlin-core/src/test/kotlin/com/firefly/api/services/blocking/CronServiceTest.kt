// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.cron.CronRunParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CronServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun run() {
        val client = FireflyOkHttpClient.fromEnv()
        val cronService = client.cron()

        val response =
            cronService.run(
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
