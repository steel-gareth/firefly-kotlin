// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.exchangerates

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateRetrieveByDateParamsTest {

    @Test
    fun create() {
        ExchangeRateRetrieveByDateParams.builder()
            .from("EUR")
            .to("USD")
            .date("2026-04-01")
            .limit(10)
            .page(1)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExchangeRateRetrieveByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("EUR")
        assertThat(params._pathParam(1)).isEqualTo("USD")
        assertThat(params._pathParam(2)).isEqualTo("2026-04-01")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ExchangeRateRetrieveByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
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
        val params =
            ExchangeRateRetrieveByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            ExchangeRateRetrieveByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
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
        val params =
            ExchangeRateRetrieveByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
