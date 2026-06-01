// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
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

internal class BudgetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val budgetSingle =
            budgetServiceAsync.create(
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
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val budgetSingle =
            budgetServiceAsync.retrieve(
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
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val budgetSingle =
            budgetServiceAsync.update(
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
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val budgets =
            budgetServiceAsync.list(
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
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        budgetServiceAsync.delete(
            BudgetDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAttachments() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val attachmentArray =
            budgetServiceAsync.listAttachments(
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
    suspend fun listTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val transactionArray =
            budgetServiceAsync.listTransactions(
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
    suspend fun listTransactionsWithoutBudget() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val budgetServiceAsync = client.budgets()

        val transactionArray =
            budgetServiceAsync.listTransactionsWithoutBudget(
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
