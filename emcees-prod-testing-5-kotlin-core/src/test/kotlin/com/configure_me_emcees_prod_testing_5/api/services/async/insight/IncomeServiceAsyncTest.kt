// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.insight

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeGetTotalParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByAssetAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByRevenueAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListWithoutCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListWithoutTagParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IncomeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getTotal() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightTotalEntries =
            incomeServiceAsync.getTotal(
                IncomeGetTotalParams.builder()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightGroupEntries =
            incomeServiceAsync.listByAssetAccount(
                IncomeListByAssetAccountParams.builder()
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
    suspend fun listByCategory() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightGroupEntries =
            incomeServiceAsync.listByCategory(
                IncomeListByCategoryParams.builder()
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
    suspend fun listByRevenueAccount() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightGroupEntries =
            incomeServiceAsync.listByRevenueAccount(
                IncomeListByRevenueAccountParams.builder()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightGroupEntries =
            incomeServiceAsync.listByTag(
                IncomeListByTagParams.builder()
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
    suspend fun listWithoutCategory() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightTotalEntries =
            incomeServiceAsync.listWithoutCategory(
                IncomeListWithoutCategoryParams.builder()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val incomeServiceAsync = client.insight().income()

        val insightTotalEntries =
            incomeServiceAsync.listWithoutTag(
                IncomeListWithoutTagParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }
}
