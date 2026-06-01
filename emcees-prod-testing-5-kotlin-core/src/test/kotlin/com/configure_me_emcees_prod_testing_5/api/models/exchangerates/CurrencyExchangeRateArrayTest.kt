// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyExchangeRateArrayTest {

    @Test
    fun create() {
        val currencyExchangeRateArray =
            CurrencyExchangeRateArray.builder()
                .addData(
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
                )
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pagination(
                            Meta.Pagination.builder()
                                .count(20L)
                                .currentPage(1L)
                                .perPage(100L)
                                .total(3L)
                                .totalPages(1L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(currencyExchangeRateArray.data())
            .containsExactly(
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
            )
        assertThat(currencyExchangeRateArray.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(currencyExchangeRateArray.meta())
            .isEqualTo(
                Meta.builder()
                    .pagination(
                        Meta.Pagination.builder()
                            .count(20L)
                            .currentPage(1L)
                            .perPage(100L)
                            .total(3L)
                            .totalPages(1L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyExchangeRateArray =
            CurrencyExchangeRateArray.builder()
                .addData(
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
                )
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pagination(
                            Meta.Pagination.builder()
                                .count(20L)
                                .currentPage(1L)
                                .perPage(100L)
                                .total(3L)
                                .totalPages(1L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCurrencyExchangeRateArray =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyExchangeRateArray),
                jacksonTypeRef<CurrencyExchangeRateArray>(),
            )

        assertThat(roundtrippedCurrencyExchangeRateArray).isEqualTo(currencyExchangeRateArray)
    }
}
