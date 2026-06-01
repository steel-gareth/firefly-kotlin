// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.data

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportAccountsParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportBillsParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportBudgetsParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportCategoriesParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportRecurringParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportTagsParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportExportTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.data.export.ExportFileFilter
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ExportServiceAsyncTest {

    @Test
    suspend fun exportAccounts(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportAccounts(
                ExportExportAccountsParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportBills(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportBills(
                ExportExportBillsParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportBudgets(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportBudgets(
                ExportExportBudgetsParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportCategories(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportCategories(
                ExportExportCategoriesParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportPiggyBanks(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportPiggyBanks(
                ExportExportPiggyBanksParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportRecurring(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportRecurring(
                ExportExportRecurringParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportRules(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportRules(
                ExportExportRulesParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportTags(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportTags(
                ExportExportTagsParams.builder()
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun exportTransactions(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val exportServiceAsync = client.data().export()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            exportServiceAsync.exportTransactions(
                ExportExportTransactionsParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts("accounts")
                    .type(ExportFileFilter.CSV)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
