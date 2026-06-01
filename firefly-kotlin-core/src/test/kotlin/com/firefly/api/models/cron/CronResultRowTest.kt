// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.cron

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronResultRowTest {

    @Test
    fun create() {
        val cronResultRow =
            CronResultRow.builder()
                .jobErrored(false)
                .jobFired(true)
                .jobSucceeded(true)
                .message("Cron result message")
                .build()

        assertThat(cronResultRow.jobErrored()).isEqualTo(false)
        assertThat(cronResultRow.jobFired()).isEqualTo(true)
        assertThat(cronResultRow.jobSucceeded()).isEqualTo(true)
        assertThat(cronResultRow.message()).isEqualTo("Cron result message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cronResultRow =
            CronResultRow.builder()
                .jobErrored(false)
                .jobFired(true)
                .jobSucceeded(true)
                .message("Cron result message")
                .build()

        val roundtrippedCronResultRow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cronResultRow),
                jacksonTypeRef<CronResultRow>(),
            )

        assertThat(roundtrippedCronResultRow).isEqualTo(cronResultRow)
    }
}
