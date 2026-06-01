// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.currencies

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencySingleTest {

    @Test
    fun create() {
        val currencySingle =
            CurrencySingle.builder()
                .data(
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
                )
                .build()

        assertThat(currencySingle.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencySingle =
            CurrencySingle.builder()
                .data(
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
                )
                .build()

        val roundtrippedCurrencySingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencySingle),
                jacksonTypeRef<CurrencySingle>(),
            )

        assertThat(roundtrippedCurrencySingle).isEqualTo(currencySingle)
    }
}
