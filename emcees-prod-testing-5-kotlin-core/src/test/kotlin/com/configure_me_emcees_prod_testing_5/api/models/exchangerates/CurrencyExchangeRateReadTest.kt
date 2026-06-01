// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyExchangeRateReadTest {

    @Test
    fun create() {
        val currencyExchangeRateRead =
            CurrencyExchangeRateRead.builder()
                .id("2")
                .attributes(
                    CurrencyExchangeRateRead.Attributes.builder()
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .fromCurrencyCode("EUR")
                        .fromCurrencyDecimalPlaces(2)
                        .fromCurrencyId("12")
                        .fromCurrencyName("Euro")
                        .fromCurrencySymbol("\$")
                        .rate("1.10340")
                        .toCurrencyCode("EUR")
                        .toCurrencyDecimalPlaces(2)
                        .toCurrencyId("12")
                        .toCurrencyName("EUR")
                        .toCurrencySymbol("\$")
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("currency_exchange_rates")
                .build()

        assertThat(currencyExchangeRateRead.id()).isEqualTo("2")
        assertThat(currencyExchangeRateRead.attributes())
            .isEqualTo(
                CurrencyExchangeRateRead.Attributes.builder()
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .fromCurrencyCode("EUR")
                    .fromCurrencyDecimalPlaces(2)
                    .fromCurrencyId("12")
                    .fromCurrencyName("Euro")
                    .fromCurrencySymbol("\$")
                    .rate("1.10340")
                    .toCurrencyCode("EUR")
                    .toCurrencyDecimalPlaces(2)
                    .toCurrencyId("12")
                    .toCurrencyName("EUR")
                    .toCurrencySymbol("\$")
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(currencyExchangeRateRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(currencyExchangeRateRead.type()).isEqualTo("currency_exchange_rates")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyExchangeRateRead =
            CurrencyExchangeRateRead.builder()
                .id("2")
                .attributes(
                    CurrencyExchangeRateRead.Attributes.builder()
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .fromCurrencyCode("EUR")
                        .fromCurrencyDecimalPlaces(2)
                        .fromCurrencyId("12")
                        .fromCurrencyName("Euro")
                        .fromCurrencySymbol("\$")
                        .rate("1.10340")
                        .toCurrencyCode("EUR")
                        .toCurrencyDecimalPlaces(2)
                        .toCurrencyId("12")
                        .toCurrencyName("EUR")
                        .toCurrencySymbol("\$")
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("currency_exchange_rates")
                .build()

        val roundtrippedCurrencyExchangeRateRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyExchangeRateRead),
                jacksonTypeRef<CurrencyExchangeRateRead>(),
            )

        assertThat(roundtrippedCurrencyExchangeRateRead).isEqualTo(currencyExchangeRateRead)
    }
}
