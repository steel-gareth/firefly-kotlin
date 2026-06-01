// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services

import com.firefly.api.client.FireflyClient
import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.autocomplete.AutocompleteListAccountsParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: FireflyClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = FireflyOkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAccounts() {
        val autocompleteService = client.autocomplete()
        stubFor(get(anyUrl()).willReturn(ok("[]")))

        autocompleteService.listAccounts(
            AutocompleteListAccountsParams.builder()
                .date("date")
                .limit(0)
                .query("query")
                .addType(AccountTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
