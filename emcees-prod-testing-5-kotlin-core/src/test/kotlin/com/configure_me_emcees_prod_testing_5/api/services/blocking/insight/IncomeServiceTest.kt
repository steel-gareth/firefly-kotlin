// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.insight

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
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

internal class IncomeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTotal() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightTotalEntries =
            incomeService.getTotal(
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
    fun listByAssetAccount() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightGroupEntries =
            incomeService.listByAssetAccount(
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
    fun listByCategory() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightGroupEntries =
            incomeService.listByCategory(
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
    fun listByRevenueAccount() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightGroupEntries =
            incomeService.listByRevenueAccount(
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
    fun listByTag() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightGroupEntries =
            incomeService.listByTag(
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
    fun listWithoutCategory() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightTotalEntries =
            incomeService.listWithoutCategory(
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
    fun listWithoutTag() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val incomeService = client.insight().income()

        val insightTotalEntries =
            incomeService.listWithoutTag(
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
