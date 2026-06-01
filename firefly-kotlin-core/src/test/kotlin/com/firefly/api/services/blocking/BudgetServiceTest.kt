// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.budgets.AutoBudgetPeriod
import com.firefly.api.models.budgets.AutoBudgetType
import com.firefly.api.models.budgets.BudgetCreateParams
import com.firefly.api.models.budgets.BudgetDeleteParams
import com.firefly.api.models.budgets.BudgetListAttachmentsParams
import com.firefly.api.models.budgets.BudgetListParams
import com.firefly.api.models.budgets.BudgetListTransactionsParams
import com.firefly.api.models.budgets.BudgetListTransactionsWithoutBudgetParams
import com.firefly.api.models.budgets.BudgetRetrieveParams
import com.firefly.api.models.budgets.BudgetUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val budgetSingle =
            budgetService.create(
                BudgetCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .name("Bills")
                    .active(false)
                    .autoBudgetAmount("-1012.12")
                    .autoBudgetCurrencyCode("EUR")
                    .autoBudgetCurrencyId("12")
                    .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                    .autoBudgetType(AutoBudgetType.RESET)
                    .fireWebhooks(true)
                    .notes("Some notes")
                    .build()
            )

        budgetSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val budgetSingle =
            budgetService.retrieve(
                BudgetRetrieveParams.builder()
                    .id("123")
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        budgetSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val budgetSingle =
            budgetService.update(
                BudgetUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .name("Bills")
                    .active(false)
                    .autoBudgetAmount("-1012.12")
                    .autoBudgetCurrencyCode("EUR")
                    .autoBudgetCurrencyId("12")
                    .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                    .autoBudgetType(AutoBudgetType.RESET)
                    .fireWebhooks(true)
                    .notes("Some notes")
                    .order(5)
                    .build()
            )

        budgetSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val budgets =
            budgetService.list(
                BudgetListParams.builder()
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        budgets.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        budgetService.delete(
            BudgetDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val attachmentArray =
            budgetService.listAttachments(
                BudgetListAttachmentsParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attachmentArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val transactionArray =
            budgetService.listTransactions(
                BudgetListTransactionsParams.builder()
                    .id("123")
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .type(TransactionTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactionsWithoutBudget() {
        val client = FireflyOkHttpClient.fromEnv()
        val budgetService = client.budgets()

        val transactionArray =
            budgetService.listTransactionsWithoutBudget(
                BudgetListTransactionsWithoutBudgetParams.builder()
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
