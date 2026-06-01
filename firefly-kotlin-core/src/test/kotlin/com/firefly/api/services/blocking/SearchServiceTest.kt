// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.search.SearchAccountsParams
import com.firefly.api.models.search.SearchTransactionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SearchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun accounts() {
        val client = FireflyOkHttpClient.fromEnv()
        val searchService = client.search()

        val accountArray =
            searchService.accounts(
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
    fun transactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val searchService = client.search()

        val transactionArray =
            searchService.transactions(
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
