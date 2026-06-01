// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.insight

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferGetTotalParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByAssetAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListWithoutCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListWithoutTagParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTotal() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transferService = client.insight().transfer()

        val insightTotalEntries =
            transferService.getTotal(
                TransferGetTotalParams.builder()
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
        val transferService = client.insight().transfer()

        val response =
            transferService.listByAssetAccount(
                TransferListByAssetAccountParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByCategory() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transferService = client.insight().transfer()

        val insightGroupEntries =
            transferService.listByCategory(
                TransferListByCategoryParams.builder()
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
    fun listByTag() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transferService = client.insight().transfer()

        val insightGroupEntries =
            transferService.listByTag(
                TransferListByTagParams.builder()
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
        val transferService = client.insight().transfer()

        val insightTotalEntries =
            transferService.listWithoutCategory(
                TransferListWithoutCategoryParams.builder()
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
        val transferService = client.insight().transfer()

        val insightTotalEntries =
            transferService.listWithoutTag(
                TransferListWithoutTagParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        insightTotalEntries.forEach { it.validate() }
    }
}
