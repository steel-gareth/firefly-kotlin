// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.search.SearchAccountsParams
import com.firefly.api.models.search.SearchTransactionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SearchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun accounts() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val searchServiceAsync = client.search()

        val accountArray =
            searchServiceAsync.accounts(
                SearchAccountsParams.builder()
                    .field(SearchAccountsParams.Field.ALL)
                    .query("checking")
                    .limit(10)
                    .page(1)
                    .type(AccountTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        accountArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun transactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val searchServiceAsync = client.search()

        val transactionArray =
            searchServiceAsync.transactions(
                SearchTransactionsParams.builder()
                    .query("groceries")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
