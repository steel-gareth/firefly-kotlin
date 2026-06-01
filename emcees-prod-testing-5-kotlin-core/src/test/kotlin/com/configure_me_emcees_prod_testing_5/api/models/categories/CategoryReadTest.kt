// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.categories

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryReadTest {

    @Test
    fun create() {
        val categoryRead =
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

        assertThat(categoryRead.id()).isEqualTo("2")
        assertThat(categoryRead.attributes())
            .isEqualTo(
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
        assertThat(categoryRead.type()).isEqualTo("categories")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryRead =
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

        val roundtrippedCategoryRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryRead),
                jacksonTypeRef<CategoryRead>(),
            )

        assertThat(roundtrippedCategoryRead).isEqualTo(categoryRead)
    }
}
