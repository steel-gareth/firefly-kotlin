// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.insight

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.insight.expense.ExpenseGetTotalParams
import com.firefly.api.models.insight.expense.ExpenseListByAssetAccountParams
import com.firefly.api.models.insight.expense.ExpenseListByBillParams
import com.firefly.api.models.insight.expense.ExpenseListByBudgetParams
import com.firefly.api.models.insight.expense.ExpenseListByCategoryParams
import com.firefly.api.models.insight.expense.ExpenseListByExpenseAccountParams
import com.firefly.api.models.insight.expense.ExpenseListByTagParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutBillParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutBudgetParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutCategoryParams
import com.firefly.api.models.insight.expense.ExpenseListWithoutTagParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExpenseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getTotal() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightTotalEntries =
            expenseServiceAsync.getTotal(
                ExpenseGetTotalParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByAssetAccount() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightGroupEntries =
            expenseServiceAsync.listByAssetAccount(
                ExpenseListByAssetAccountParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightGroupEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByBill() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightGroupEntries =
            expenseServiceAsync.listByBill(
                ExpenseListByBillParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .bills(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightGroupEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByBudget() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightGroupEntries =
            expenseServiceAsync.listByBudget(
                ExpenseListByBudgetParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .budgets(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightGroupEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByCategory() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightGroupEntries =
            expenseServiceAsync.listByCategory(
                ExpenseListByCategoryParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .categories(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightGroupEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByExpenseAccount() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightGroupEntries =
            expenseServiceAsync.listByExpenseAccount(
                ExpenseListByExpenseAccountParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightGroupEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByTag() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightGroupEntries =
            expenseServiceAsync.listByTag(
                ExpenseListByTagParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .tags(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightGroupEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listWithoutBill() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightTotalEntries =
            expenseServiceAsync.listWithoutBill(
                ExpenseListWithoutBillParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listWithoutBudget() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightTotalEntries =
            expenseServiceAsync.listWithoutBudget(
                ExpenseListWithoutBudgetParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listWithoutCategory() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightTotalEntries =
            expenseServiceAsync.listWithoutCategory(
                ExpenseListWithoutCategoryParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listWithoutTag() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val expenseServiceAsync = client.insight().expense()

        val insightTotalEntries =
            expenseServiceAsync.listWithoutTag(
                ExpenseListWithoutTagParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }
}
