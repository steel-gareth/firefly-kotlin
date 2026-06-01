// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.availablebudgets

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailableBudgetReadTest {

    @Test
    fun create() {
        val availableBudgetRead =
            AvailableBudgetRead.builder()
                .id("2")
                .attributes(
                    AvailableBudgetRead.Attributes.builder()
                        .amount("123.45")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .currencyCode("EUR")
                        .currencyDecimalPlaces(2)
                        .currencyId("5")
                        .currencyName("Euro")
                        .currencySymbol("\$")
                        .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                        .objectHasCurrencySetting(true)
                        .pcAmount("123.45")
                        .addPcSpentInBudget(
                            ArrayEntryWithCurrencyAndSum.builder()
                                .currencyCode("USD")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencySymbol("\$")
                                .sum("123.45")
                                .build()
                        )
                        .addPcSpentOutsideBudget(
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
                        .addSpentInBudget(
                            ArrayEntryWithCurrencyAndSum.builder()
                                .currencyCode("USD")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencySymbol("\$")
                                .sum("123.45")
                                .build()
                        )
                        .addSpentOutsideBudget(
                            ArrayEntryWithCurrencyAndSum.builder()
                                .currencyCode("USD")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencySymbol("\$")
                                .sum("123.45")
                                .build()
                        )
                        .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("available_budgets")
                .build()

        assertThat(availableBudgetRead.id()).isEqualTo("2")
        assertThat(availableBudgetRead.attributes())
            .isEqualTo(
                AvailableBudgetRead.Attributes.builder()
                    .amount("123.45")
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .currencyCode("EUR")
                    .currencyDecimalPlaces(2)
                    .currencyId("5")
                    .currencyName("Euro")
                    .currencySymbol("\$")
                    .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                    .objectHasCurrencySetting(true)
                    .pcAmount("123.45")
                    .addPcSpentInBudget(
                        ArrayEntryWithCurrencyAndSum.builder()
                            .currencyCode("USD")
                            .currencyDecimalPlaces(2)
                            .currencyId("5")
                            .currencySymbol("\$")
                            .sum("123.45")
                            .build()
                    )
                    .addPcSpentOutsideBudget(
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
                    .addSpentInBudget(
                        ArrayEntryWithCurrencyAndSum.builder()
                            .currencyCode("USD")
                            .currencyDecimalPlaces(2)
                            .currencyId("5")
                            .currencySymbol("\$")
                            .sum("123.45")
                            .build()
                    )
                    .addSpentOutsideBudget(
                        ArrayEntryWithCurrencyAndSum.builder()
                            .currencyCode("USD")
                            .currencyDecimalPlaces(2)
                            .currencyId("5")
                            .currencySymbol("\$")
                            .sum("123.45")
                            .build()
                    )
                    .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(availableBudgetRead.type()).isEqualTo("available_budgets")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val availableBudgetRead =
            AvailableBudgetRead.builder()
                .id("2")
                .attributes(
                    AvailableBudgetRead.Attributes.builder()
                        .amount("123.45")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .currencyCode("EUR")
                        .currencyDecimalPlaces(2)
                        .currencyId("5")
                        .currencyName("Euro")
                        .currencySymbol("\$")
                        .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                        .objectHasCurrencySetting(true)
                        .pcAmount("123.45")
                        .addPcSpentInBudget(
                            ArrayEntryWithCurrencyAndSum.builder()
                                .currencyCode("USD")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencySymbol("\$")
                                .sum("123.45")
                                .build()
                        )
                        .addPcSpentOutsideBudget(
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
                        .addSpentInBudget(
                            ArrayEntryWithCurrencyAndSum.builder()
                                .currencyCode("USD")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencySymbol("\$")
                                .sum("123.45")
                                .build()
                        )
                        .addSpentOutsideBudget(
                            ArrayEntryWithCurrencyAndSum.builder()
                                .currencyCode("USD")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencySymbol("\$")
                                .sum("123.45")
                                .build()
                        )
                        .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("available_budgets")
                .build()

        val roundtrippedAvailableBudgetRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(availableBudgetRead),
                jacksonTypeRef<AvailableBudgetRead>(),
            )

        assertThat(roundtrippedAvailableBudgetRead).isEqualTo(availableBudgetRead)
    }
}
