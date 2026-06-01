// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.insight.expense

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightTotalEntryTest {

    @Test
    fun create() {
        val insightTotalEntry =
            InsightTotalEntry.builder()
                .currencyCode("EUR")
                .currencyId("5")
                .difference("123.45")
                .differenceFloat(123.45)
                .build()

        assertThat(insightTotalEntry.currencyCode()).isEqualTo("EUR")
        assertThat(insightTotalEntry.currencyId()).isEqualTo("5")
        assertThat(insightTotalEntry.difference()).isEqualTo("123.45")
        assertThat(insightTotalEntry.differenceFloat()).isEqualTo(123.45)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightTotalEntry =
            InsightTotalEntry.builder()
                .currencyCode("EUR")
                .currencyId("5")
                .difference("123.45")
                .differenceFloat(123.45)
                .build()

        val roundtrippedInsightTotalEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightTotalEntry),
                jacksonTypeRef<InsightTotalEntry>(),
            )

        assertThat(roundtrippedInsightTotalEntry).isEqualTo(insightTotalEntry)
    }
}
