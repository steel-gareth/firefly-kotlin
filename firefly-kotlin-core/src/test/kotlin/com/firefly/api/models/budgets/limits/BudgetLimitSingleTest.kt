// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.budgets.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetLimitSingleTest {

    @Test
    fun create() {
        val budgetLimitSingle =
            BudgetLimitSingle.builder()
                .data(
                    BudgetLimitRead.builder()
                        .id("2")
                        .attributes(
                            BudgetLimitRead.Attributes.builder()
                                .amount("123.45")
                                .budgetId("23")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .currencyCode("EUR")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencyName("Euro")
                                .currencySymbol("\$")
                                .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                                .notes("Some example notes")
                                .objectHasCurrencySetting(true)
                                .pcAmount("123.45")
                                .addPcSpent(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .period("monthly")
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
                                .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .type("budget_limits")
                        .build()
                )
                .build()

        assertThat(budgetLimitSingle.data())
            .isEqualTo(
                BudgetLimitRead.builder()
                    .id("2")
                    .attributes(
                        BudgetLimitRead.Attributes.builder()
                            .amount("123.45")
                            .budgetId("23")
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .currencyCode("EUR")
                            .currencyDecimalPlaces(2)
                            .currencyId("5")
                            .currencyName("Euro")
                            .currencySymbol("\$")
                            .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                            .notes("Some example notes")
                            .objectHasCurrencySetting(true)
                            .pcAmount("123.45")
                            .addPcSpent(
                                ArrayEntryWithCurrencyAndSum.builder()
                                    .currencyCode("USD")
                                    .currencyDecimalPlaces(2)
                                    .currencyId("5")
                                    .currencySymbol("\$")
                                    .sum("123.45")
                                    .build()
                            )
                            .period("monthly")
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
                            .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .type("budget_limits")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetLimitSingle =
            BudgetLimitSingle.builder()
                .data(
                    BudgetLimitRead.builder()
                        .id("2")
                        .attributes(
                            BudgetLimitRead.Attributes.builder()
                                .amount("123.45")
                                .budgetId("23")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .currencyCode("EUR")
                                .currencyDecimalPlaces(2)
                                .currencyId("5")
                                .currencyName("Euro")
                                .currencySymbol("\$")
                                .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                                .notes("Some example notes")
                                .objectHasCurrencySetting(true)
                                .pcAmount("123.45")
                                .addPcSpent(
                                    ArrayEntryWithCurrencyAndSum.builder()
                                        .currencyCode("USD")
                                        .currencyDecimalPlaces(2)
                                        .currencyId("5")
                                        .currencySymbol("\$")
                                        .sum("123.45")
                                        .build()
                                )
                                .period("monthly")
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
                                .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .type("budget_limits")
                        .build()
                )
                .build()

        val roundtrippedBudgetLimitSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetLimitSingle),
                jacksonTypeRef<BudgetLimitSingle>(),
            )

        assertThat(roundtrippedBudgetLimitSingle).isEqualTo(budgetLimitSingle)
    }
}
