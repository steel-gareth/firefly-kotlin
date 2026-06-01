// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.insight.expense

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupEntryTest {

    @Test
    fun create() {
        val insightGroupEntry =
            InsightGroupEntry.builder()
                .id("123")
                .currencyCode("EUR")
                .currencyId("5")
                .difference("-123.45")
                .differenceFloat(-123.45)
                .name("Land lord")
                .build()

        assertThat(insightGroupEntry.id()).isEqualTo("123")
        assertThat(insightGroupEntry.currencyCode()).isEqualTo("EUR")
        assertThat(insightGroupEntry.currencyId()).isEqualTo("5")
        assertThat(insightGroupEntry.difference()).isEqualTo("-123.45")
        assertThat(insightGroupEntry.differenceFloat()).isEqualTo(-123.45)
        assertThat(insightGroupEntry.name()).isEqualTo("Land lord")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightGroupEntry =
            InsightGroupEntry.builder()
                .id("123")
                .currencyCode("EUR")
                .currencyId("5")
                .difference("-123.45")
                .differenceFloat(-123.45)
                .name("Land lord")
                .build()

        val roundtrippedInsightGroupEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightGroupEntry),
                jacksonTypeRef<InsightGroupEntry>(),
            )

        assertThat(roundtrippedInsightGroupEntry).isEqualTo(insightGroupEntry)
    }
}
