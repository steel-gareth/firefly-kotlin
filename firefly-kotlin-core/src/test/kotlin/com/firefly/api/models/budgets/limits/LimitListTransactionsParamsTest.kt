// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.budgets.limits

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.models.accounts.TransactionTypeFilter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitListTransactionsParamsTest {

    @Test
    fun create() {
        LimitListTransactionsParams.builder()
            .id("123")
            .limitId("123")
            .limit(10)
            .page(1)
            .type(TransactionTypeFilter.ALL)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LimitListTransactionsParams.builder().id("123").limitId("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        assertThat(params._pathParam(1)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            LimitListTransactionsParams.builder()
                .id("123")
                .limitId("123")
                .limit(10)
                .page(1)
                .type(TransactionTypeFilter.ALL)
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
        val params = LimitListTransactionsParams.builder().id("123").limitId("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            LimitListTransactionsParams.builder()
                .id("123")
                .limitId("123")
                .limit(10)
                .page(1)
                .type(TransactionTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "10").put("page", "1").put("type", "all").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LimitListTransactionsParams.builder().id("123").limitId("123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
