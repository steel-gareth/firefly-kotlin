// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.insight

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.insight.transfer.TransferGetTotalParams
import com.firefly.api.models.insight.transfer.TransferListByAssetAccountParams
import com.firefly.api.models.insight.transfer.TransferListByCategoryParams
import com.firefly.api.models.insight.transfer.TransferListByTagParams
import com.firefly.api.models.insight.transfer.TransferListWithoutCategoryParams
import com.firefly.api.models.insight.transfer.TransferListWithoutTagParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getTotal() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transferServiceAsync = client.insight().transfer()

        val insightTotalEntries =
            transferServiceAsync.getTotal(
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
    suspend fun listByAssetAccount() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transferServiceAsync = client.insight().transfer()

        val response =
            transferServiceAsync.listByAssetAccount(
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
    suspend fun listByCategory() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transferServiceAsync = client.insight().transfer()

        val insightGroupEntries =
            transferServiceAsync.listByCategory(
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
    suspend fun listByTag() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transferServiceAsync = client.insight().transfer()

        val insightGroupEntries =
            transferServiceAsync.listByTag(
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
    suspend fun listWithoutCategory() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transferServiceAsync = client.insight().transfer()

        val insightTotalEntries =
            transferServiceAsync.listWithoutCategory(
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
    suspend fun listWithoutTag() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transferServiceAsync = client.insight().transfer()

        val insightTotalEntries =
            transferServiceAsync.listWithoutTag(
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
