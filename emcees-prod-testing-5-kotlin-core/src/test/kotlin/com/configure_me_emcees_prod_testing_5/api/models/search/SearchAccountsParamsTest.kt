// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.search

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountTypeFilter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchAccountsParamsTest {

    @Test
    fun create() {
        SearchAccountsParams.builder()
            .field(SearchAccountsParams.Field.ALL)
            .query("checking")
            .limit(10)
            .page(1)
            .type(AccountTypeFilter.ALL)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun headers() {
        val params =
            SearchAccountsParams.builder()
                .field(SearchAccountsParams.Field.ALL)
                .query("checking")
                .limit(10)
                .page(1)
                .type(AccountTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SearchAccountsParams.builder()
                .field(SearchAccountsParams.Field.ALL)
                .query("checking")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            SearchAccountsParams.builder()
                .field(SearchAccountsParams.Field.ALL)
                .query("checking")
                .limit(10)
                .page(1)
                .type(AccountTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("field", "all")
                    .put("query", "checking")
                    .put("limit", "10")
                    .put("page", "1")
                    .put("type", "all")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SearchAccountsParams.builder()
                .field(SearchAccountsParams.Field.ALL)
                .query("checking")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("field", "all").put("query", "checking").build())
    }
}
