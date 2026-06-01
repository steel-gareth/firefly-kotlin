// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.budgets

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.budgets.limits.LimitCreateParams
import com.firefly.api.models.budgets.limits.LimitDeleteParams
import com.firefly.api.models.budgets.limits.LimitList0Params
import com.firefly.api.models.budgets.limits.LimitList1Params
import com.firefly.api.models.budgets.limits.LimitListTransactionsParams
import com.firefly.api.models.budgets.limits.LimitRetrieveParams
import com.firefly.api.models.budgets.limits.LimitUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LimitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        val budgetLimitSingle =
            limitService.create(
                LimitCreateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .amount("123.45")
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .currencyCode("EUR")
                    .currencyId("5")
                    .fireWebhooks(true)
                    .notes("Some example notes")
                    .build()
            )

        budgetLimitSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        val budgetLimitSingle =
            limitService.retrieve(
                LimitRetrieveParams.builder()
                    .id("123")
                    .limitId(1L)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        budgetLimitSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        val budgetLimitSingle =
            limitService.update(
                LimitUpdateParams.builder()
                    .id("123")
                    .limitId("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .amount("123.45")
                    .currencyCode("EUR")
                    .currencyId("5")
                    .currencyName("Euro")
                    .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                    .fireWebhooks(true)
                    .notes("Some example notes")
                    .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )

        budgetLimitSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        limitService.delete(
            LimitDeleteParams.builder()
                .id("123")
                .limitId("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list0() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        val budgetLimitArray =
            limitService.list0(
                LimitList0Params.builder()
                    .id("123")
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        budgetLimitArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list1() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        val budgetLimitArray =
            limitService.list1(
                LimitList1Params.builder()
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        budgetLimitArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val limitService = client.budgets().limits()

        val transactionArray =
            limitService.listTransactions(
                LimitListTransactionsParams.builder()
                    .id("123")
                    .limitId("123")
                    .limit(10)
                    .page(1)
                    .type(TransactionTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
