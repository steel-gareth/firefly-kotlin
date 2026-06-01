// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.piggybanks

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PiggyBankEventArrayTest {

    @Test
    fun create() {
        val piggyBankEventArray =
            PiggyBankEventArray.builder()
                .addData(
                    PiggyBankEventArray.Data.builder()
                        .id("2")
                        .attributes(
                            PiggyBankEventArray.Data.Attributes.builder()
                                .amount("123.45")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .currencyCode("EUR")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencyName("Euro")
                                .currencySymbol("\$")
                                .objectHasCurrencySetting(true)
                                .pcAmount("123.45")
                                .primaryCurrencyCode("EUR")
                                .primaryCurrencyDecimalPlaces(2)
                                .primaryCurrencyId("5")
                                .primaryCurrencyName("Euro")
                                .primaryCurrencySymbol("\$")
                                .transactionGroupId("4291")
                                .transactionJournalId("4291")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("piggy_bank_events")
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

        assertThat(piggyBankEventArray.data())
            .containsExactly(
                PiggyBankEventArray.Data.builder()
                    .id("2")
                    .attributes(
                        PiggyBankEventArray.Data.Attributes.builder()
                            .amount("123.45")
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .currencyCode("EUR")
                            .currencyDecimalPlaces(2)
                            .currencyId("5")
                            .currencyName("Euro")
                            .currencySymbol("\$")
                            .objectHasCurrencySetting(true)
                            .pcAmount("123.45")
                            .primaryCurrencyCode("EUR")
                            .primaryCurrencyDecimalPlaces(2)
                            .primaryCurrencyId("5")
                            .primaryCurrencyName("Euro")
                            .primaryCurrencySymbol("\$")
                            .transactionGroupId("4291")
                            .transactionJournalId("4291")
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("piggy_bank_events")
                    .build()
            )
        assertThat(piggyBankEventArray.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(piggyBankEventArray.meta())
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
        val piggyBankEventArray =
            PiggyBankEventArray.builder()
                .addData(
                    PiggyBankEventArray.Data.builder()
                        .id("2")
                        .attributes(
                            PiggyBankEventArray.Data.Attributes.builder()
                                .amount("123.45")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .currencyCode("EUR")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencyName("Euro")
                                .currencySymbol("\$")
                                .objectHasCurrencySetting(true)
                                .pcAmount("123.45")
                                .primaryCurrencyCode("EUR")
                                .primaryCurrencyDecimalPlaces(2)
                                .primaryCurrencyId("5")
                                .primaryCurrencyName("Euro")
                                .primaryCurrencySymbol("\$")
                                .transactionGroupId("4291")
                                .transactionJournalId("4291")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("piggy_bank_events")
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

        val roundtrippedPiggyBankEventArray =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(piggyBankEventArray),
                jacksonTypeRef<PiggyBankEventArray>(),
            )

        assertThat(roundtrippedPiggyBankEventArray).isEqualTo(piggyBankEventArray)
    }
}
