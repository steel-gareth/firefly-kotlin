// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetListResponseTest {

    @Test
    fun create() {
        val budgetListResponse =
            BudgetListResponse.builder()
                .addData(
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

        assertThat(budgetListResponse.data())
            .containsExactly(
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
            )
        assertThat(budgetListResponse.meta())
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
        val budgetListResponse =
            BudgetListResponse.builder()
                .addData(
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

        val roundtrippedBudgetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetListResponse),
                jacksonTypeRef<BudgetListResponse>(),
            )

        assertThat(roundtrippedBudgetListResponse).isEqualTo(budgetListResponse)
    }
}
