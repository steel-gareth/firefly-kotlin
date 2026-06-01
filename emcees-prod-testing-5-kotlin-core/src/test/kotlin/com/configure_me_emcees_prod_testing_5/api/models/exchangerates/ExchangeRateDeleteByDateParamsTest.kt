// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateDeleteByDateParamsTest {

    @Test
    fun create() {
        ExchangeRateDeleteByDateParams.builder()
            .from("EUR")
            .to("USD")
            .date("2026-04-01")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExchangeRateDeleteByDateParams.builder()
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
            ExchangeRateDeleteByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
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
            ExchangeRateDeleteByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
