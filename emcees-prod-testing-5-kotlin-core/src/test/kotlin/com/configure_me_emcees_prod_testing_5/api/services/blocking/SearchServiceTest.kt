// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.search.SearchAccountsParams
import com.configure_me_emcees_prod_testing_5.api.models.search.SearchTransactionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SearchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun accounts() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
