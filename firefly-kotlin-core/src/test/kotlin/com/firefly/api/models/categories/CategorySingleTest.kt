// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.categories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategorySingleTest {

    @Test
    fun create() {
        val categorySingle =
            CategorySingle.builder()
                .data(
                    CategoryRead.builder()
                        .id("2")
                        .attributes(
                            CategoryRead.Attributes.builder()
                                .name("Lunch")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .addEarned(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .notes("Some example notes")
                                .objectHasCurrencySetting(false)
                                .addPcEarned(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .addPcSpent(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .addPcTransferred(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .primaryCurrencyCode("EUR")
                                .primaryCurrencyDecimalPlaces(2)
                                .primaryCurrencyId("5")
                                .primaryCurrencyName("Euro")
                                .primaryCurrencySymbol("\$")
                                .addSpent(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .addTransferred(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .type("categories")
                        .build()
                )
                .build()

        assertThat(categorySingle.data())
            .isEqualTo(
                CategoryRead.builder()
                    .id("2")
                    .attributes(
                        CategoryRead.Attributes.builder()
                            .name("Lunch")
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .addEarned(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .notes("Some example notes")
                            .objectHasCurrencySetting(false)
                            .addPcEarned(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .addPcSpent(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .addPcTransferred(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .primaryCurrencyCode("EUR")
                            .primaryCurrencyDecimalPlaces(2)
                            .primaryCurrencyId("5")
                            .primaryCurrencyName("Euro")
                            .primaryCurrencySymbol("\$")
                            .addSpent(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .addTransferred(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .type("categories")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categorySingle =
            CategorySingle.builder()
                .data(
                    CategoryRead.builder()
                        .id("2")
                        .attributes(
                            CategoryRead.Attributes.builder()
                                .name("Lunch")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .addEarned(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .notes("Some example notes")
                                .objectHasCurrencySetting(false)
                                .addPcEarned(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .addPcSpent(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .addPcTransferred(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .primaryCurrencyCode("EUR")
                                .primaryCurrencyDecimalPlaces(2)
                                .primaryCurrencyId("5")
                                .primaryCurrencyName("Euro")
                                .primaryCurrencySymbol("\$")
                                .addSpent(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .addTransferred(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .type("categories")
                        .build()
                )
                .build()

        val roundtrippedCategorySingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categorySingle),
                jacksonTypeRef<CategorySingle>(),
            )

        assertThat(roundtrippedCategorySingle).isEqualTo(categorySingle)
    }
}
