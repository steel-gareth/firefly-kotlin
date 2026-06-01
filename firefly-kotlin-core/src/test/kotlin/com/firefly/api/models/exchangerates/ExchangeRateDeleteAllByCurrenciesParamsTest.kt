// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.exchangerates

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateDeleteAllByCurrenciesParamsTest {

    @Test
    fun create() {
        ExchangeRateDeleteAllByCurrenciesParams.builder()
            .from("EUR")
            .to("USD")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExchangeRateDeleteAllByCurrenciesParams.builder().from("EUR").to("USD").build()

        assertThat(params._pathParam(0)).isEqualTo("EUR")
        assertThat(params._pathParam(1)).isEqualTo("USD")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ExchangeRateDeleteAllByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
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
        val params = ExchangeRateDeleteAllByCurrenciesParams.builder().from("EUR").to("USD").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
