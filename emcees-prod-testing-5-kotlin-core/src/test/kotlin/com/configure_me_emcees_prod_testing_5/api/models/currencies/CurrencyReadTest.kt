// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.currencies

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyReadTest {

    @Test
    fun create() {
        val currencyRead =
            CurrencyRead.builder()
                .id("2")
                .attributes(
                    CurrencyRead.Attributes.builder()
                        .code("AMS")
                        .name("Ankh-Morpork dollar")
                        .symbol("AM\$")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .decimalPlaces(2)
                        .enabled(true)
                        .primary(false)
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("currencies")
                .build()

        assertThat(currencyRead.id()).isEqualTo("2")
        assertThat(currencyRead.attributes())
            .isEqualTo(
                CurrencyRead.Attributes.builder()
                    .code("AMS")
                    .name("Ankh-Morpork dollar")
                    .symbol("AM\$")
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .decimalPlaces(2)
                    .enabled(true)
                    .primary(false)
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(currencyRead.type()).isEqualTo("currencies")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyRead =
            CurrencyRead.builder()
                .id("2")
                .attributes(
                    CurrencyRead.Attributes.builder()
                        .code("AMS")
                        .name("Ankh-Morpork dollar")
                        .symbol("AM\$")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .decimalPlaces(2)
                        .enabled(true)
                        .primary(false)
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("currencies")
                .build()

        val roundtrippedCurrencyRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyRead),
                jacksonTypeRef<CurrencyRead>(),
            )

        assertThat(roundtrippedCurrencyRead).isEqualTo(currencyRead)
    }
}
