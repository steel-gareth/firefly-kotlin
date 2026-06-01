// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.currencies

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyListRulesParamsTest {

    @Test
    fun create() {
        CurrencyListRulesParams.builder()
            .code("USD")
            .limit(10)
            .page(1)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CurrencyListRulesParams.builder().code("USD").build()

        assertThat(params._pathParam(0)).isEqualTo("USD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CurrencyListRulesParams.builder()
                .code("USD")
                .limit(10)
                .page(1)
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
        val params = CurrencyListRulesParams.builder().code("USD").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CurrencyListRulesParams.builder()
                .code("USD")
                .limit(10)
                .page(1)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("page", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CurrencyListRulesParams.builder().code("USD").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
