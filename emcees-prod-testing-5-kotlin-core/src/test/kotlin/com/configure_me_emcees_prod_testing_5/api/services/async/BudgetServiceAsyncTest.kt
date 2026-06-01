// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.budgets.AutoBudgetPeriod
import com.configure_me_emcees_prod_testing_5.api.models.budgets.AutoBudgetType
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetListTransactionsWithoutBudgetParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.BudgetUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
