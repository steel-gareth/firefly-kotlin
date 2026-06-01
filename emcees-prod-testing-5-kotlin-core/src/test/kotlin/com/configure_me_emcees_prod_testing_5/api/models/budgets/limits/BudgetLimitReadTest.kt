// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets.limits

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetLimitReadTest {

    @Test
    fun create() {
        val budgetLimitRead =
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

        assertThat(budgetLimitRead.id()).isEqualTo("2")
        assertThat(budgetLimitRead.attributes())
            .isEqualTo(
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
        assertThat(budgetLimitRead.type()).isEqualTo("budget_limits")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetLimitRead =
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

        val roundtrippedBudgetLimitRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetLimitRead),
                jacksonTypeRef<BudgetLimitRead>(),
            )

        assertThat(roundtrippedBudgetLimitRead).isEqualTo(budgetLimitRead)
    }
}
