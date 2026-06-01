// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.currencies

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountTypeFilter
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyListAccountsParamsTest {

    @Test
    fun create() {
        CurrencyListAccountsParams.builder()
            .code("USD")
            .date(LocalDate.parse("2019-12-27"))
            .limit(10)
            .page(1)
            .type(AccountTypeFilter.ALL)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CurrencyListAccountsParams.builder().code("USD").build()

        assertThat(params._pathParam(0)).isEqualTo("USD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CurrencyListAccountsParams.builder()
                .code("USD")
                .date(LocalDate.parse("2019-12-27"))
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
        val params = CurrencyListAccountsParams.builder().code("USD").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CurrencyListAccountsParams.builder()
                .code("USD")
                .date(LocalDate.parse("2019-12-27"))
                .limit(10)
                .page(1)
                .type(AccountTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("date", "2019-12-27")
                    .put("limit", "10")
                    .put("page", "1")
                    .put("type", "all")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CurrencyListAccountsParams.builder().code("USD").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
