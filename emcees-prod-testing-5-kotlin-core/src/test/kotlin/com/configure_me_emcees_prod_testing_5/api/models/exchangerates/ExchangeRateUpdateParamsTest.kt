// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateUpdateParamsTest {

    @Test
    fun create() {
        ExchangeRateUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .date(LocalDate.parse("2026-04-01"))
            .rate("2.3456")
            .from("USD")
            .to("EUR")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExchangeRateUpdateParams.builder()
                .id("123")
                .date(LocalDate.parse("2026-04-01"))
                .rate("2.3456")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ExchangeRateUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .date(LocalDate.parse("2026-04-01"))
                .rate("2.3456")
                .from("USD")
                .to("EUR")
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
            ExchangeRateUpdateParams.builder()
                .id("123")
                .date(LocalDate.parse("2026-04-01"))
                .rate("2.3456")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ExchangeRateUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .date(LocalDate.parse("2026-04-01"))
                .rate("2.3456")
                .from("USD")
                .to("EUR")
                .build()

        val body = params._body()

        assertThat(body.date()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.rate()).isEqualTo("2.3456")
        assertThat(body.from()).isEqualTo("USD")
        assertThat(body.to()).isEqualTo("EUR")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExchangeRateUpdateParams.builder()
                .id("123")
                .date(LocalDate.parse("2026-04-01"))
                .rate("2.3456")
                .build()

        val body = params._body()

        assertThat(body.date()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.rate()).isEqualTo("2.3456")
    }
}
