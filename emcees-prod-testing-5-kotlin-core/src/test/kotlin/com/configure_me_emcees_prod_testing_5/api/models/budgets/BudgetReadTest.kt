// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetReadTest {

    @Test
    fun create() {
        val budgetRead =
            BudgetRead.builder()
                .id("2")
                .attributes(
                    BudgetRead.Attributes.builder()
                        .name("Bills")
                        .active(false)
                        .autoBudgetAmount("-1012.12")
                        .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                        .autoBudgetType(AutoBudgetType.RESET)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .currencyCode("EUR")
                        .currencyDecimalPlaces(2)
                        .currencyId("5")
                        .currencyName("Euro")
                        .currencySymbol("\$")
                        .notes("Some notes")
                        .objectGroupId("5")
                        .objectGroupOrder(5)
                        .objectGroupTitle("Example Group")
                        .objectHasCurrencySetting(true)
                        .order(5)
                        .pcAutoBudgetAmount("-1012.12")
                        .addPcSpent(
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
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("budgets")
                .build()

        assertThat(budgetRead.id()).isEqualTo("2")
        assertThat(budgetRead.attributes())
            .isEqualTo(
                BudgetRead.Attributes.builder()
                    .name("Bills")
                    .active(false)
                    .autoBudgetAmount("-1012.12")
                    .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                    .autoBudgetType(AutoBudgetType.RESET)
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .currencyCode("EUR")
                    .currencyDecimalPlaces(2)
                    .currencyId("5")
                    .currencyName("Euro")
                    .currencySymbol("\$")
                    .notes("Some notes")
                    .objectGroupId("5")
                    .objectGroupOrder(5)
                    .objectGroupTitle("Example Group")
                    .objectHasCurrencySetting(true)
                    .order(5)
                    .pcAutoBudgetAmount("-1012.12")
                    .addPcSpent(
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
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(budgetRead.type()).isEqualTo("budgets")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetRead =
            BudgetRead.builder()
                .id("2")
                .attributes(
                    BudgetRead.Attributes.builder()
                        .name("Bills")
                        .active(false)
                        .autoBudgetAmount("-1012.12")
                        .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                        .autoBudgetType(AutoBudgetType.RESET)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .currencyCode("EUR")
                        .currencyDecimalPlaces(2)
                        .currencyId("5")
                        .currencyName("Euro")
                        .currencySymbol("\$")
                        .notes("Some notes")
                        .objectGroupId("5")
                        .objectGroupOrder(5)
                        .objectGroupTitle("Example Group")
                        .objectHasCurrencySetting(true)
                        .order(5)
                        .pcAutoBudgetAmount("-1012.12")
                        .addPcSpent(
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
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("budgets")
                .build()

        val roundtrippedBudgetRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetRead),
                jacksonTypeRef<BudgetRead>(),
            )

        assertThat(roundtrippedBudgetRead).isEqualTo(budgetRead)
    }
}
