// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.accounts

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListParamsTest {

    @Test
    fun create() {
        AccountListParams.builder()
            .date(LocalDate.parse("2019-12-27"))
            .end(LocalDate.parse("2019-12-27"))
            .limit(10)
            .page(1)
            .start(LocalDate.parse("2019-12-27"))
            .type(AccountTypeFilter.ALL)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun headers() {
        val params =
            AccountListParams.builder()
                .date(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .limit(10)
                .page(1)
                .start(LocalDate.parse("2019-12-27"))
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
        val params = AccountListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            AccountListParams.builder()
                .date(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .limit(10)
                .page(1)
                .start(LocalDate.parse("2019-12-27"))
                .type(AccountTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("date", "2019-12-27")
                    .put("end", "2019-12-27")
                    .put("limit", "10")
                    .put("page", "1")
                    .put("start", "2019-12-27")
                    .put("type", "all")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
