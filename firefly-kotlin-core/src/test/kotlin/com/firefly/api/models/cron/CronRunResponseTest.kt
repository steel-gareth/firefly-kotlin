// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.cron

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronRunResponseTest {

    @Test
    fun create() {
        val cronRunResponse =
            CronRunResponse.builder()
                .autoBudgets(
                    CronResultRow.builder()
                        .jobErrored(false)
                        .jobFired(true)
                        .jobSucceeded(true)
                        .message("Cron result message")
                        .build()
                )
                .recurringTransactions(
                    CronResultRow.builder()
                        .jobErrored(false)
                        .jobFired(true)
                        .jobSucceeded(true)
                        .message("Cron result message")
                        .build()
                )
                .telemetry(
                    CronResultRow.builder()
                        .jobErrored(false)
                        .jobFired(true)
                        .jobSucceeded(true)
                        .message("Cron result message")
                        .build()
                )
                .build()

        assertThat(cronRunResponse.autoBudgets())
            .isEqualTo(
                CronResultRow.builder()
                    .jobErrored(false)
                    .jobFired(true)
                    .jobSucceeded(true)
                    .message("Cron result message")
                    .build()
            )
        assertThat(cronRunResponse.recurringTransactions())
            .isEqualTo(
                CronResultRow.builder()
                    .jobErrored(false)
                    .jobFired(true)
                    .jobSucceeded(true)
                    .message("Cron result message")
                    .build()
            )
        assertThat(cronRunResponse.telemetry())
            .isEqualTo(
                CronResultRow.builder()
                    .jobErrored(false)
                    .jobFired(true)
                    .jobSucceeded(true)
                    .message("Cron result message")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cronRunResponse =
            CronRunResponse.builder()
                .autoBudgets(
                    CronResultRow.builder()
                        .jobErrored(false)
                        .jobFired(true)
                        .jobSucceeded(true)
                        .message("Cron result message")
                        .build()
                )
                .recurringTransactions(
                    CronResultRow.builder()
                        .jobErrored(false)
                        .jobFired(true)
                        .jobSucceeded(true)
                        .message("Cron result message")
                        .build()
                )
                .telemetry(
                    CronResultRow.builder()
                        .jobErrored(false)
                        .jobFired(true)
                        .jobSucceeded(true)
                        .message("Cron result message")
                        .build()
                )
                .build()

        val roundtrippedCronRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cronRunResponse),
                jacksonTypeRef<CronRunResponse>(),
            )

        assertThat(roundtrippedCronRunResponse).isEqualTo(cronRunResponse)
    }
}
