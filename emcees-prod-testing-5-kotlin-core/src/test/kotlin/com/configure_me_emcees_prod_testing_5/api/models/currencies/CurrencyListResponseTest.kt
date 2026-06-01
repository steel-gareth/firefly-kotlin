// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.currencies

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyListResponseTest {

    @Test
    fun create() {
        val currencyListResponse =
            CurrencyListResponse.builder()
                .addData(
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

        assertThat(currencyListResponse.data())
            .containsExactly(
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
        assertThat(currencyListResponse.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(currencyListResponse.meta())
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
        val currencyListResponse =
            CurrencyListResponse.builder()
                .addData(
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

        val roundtrippedCurrencyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyListResponse),
                jacksonTypeRef<CurrencyListResponse>(),
            )

        assertThat(roundtrippedCurrencyListResponse).isEqualTo(currencyListResponse)
    }
}
