// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.exchangerates

import com.firefly.api.core.JsonValue
import com.firefly.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateCreateParamsTest {

    @Test
    fun create() {
        ExchangeRateCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .date(LocalDate.parse("2026-04-01"))
            .from("USD")
            .rates(JsonValue.from(mapOf<String, Any>()))
            .to("EUR")
            .rate("2.3456")
            .build()
    }

    @Test
    fun headers() {
        val params =
            ExchangeRateCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .date(LocalDate.parse("2026-04-01"))
                .from("USD")
                .rates(JsonValue.from(mapOf<String, Any>()))
                .to("EUR")
                .rate("2.3456")
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
            ExchangeRateCreateParams.builder()
                .date(LocalDate.parse("2026-04-01"))
                .from("USD")
                .rates(JsonValue.from(mapOf<String, Any>()))
                .to("EUR")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ExchangeRateCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .date(LocalDate.parse("2026-04-01"))
                .from("USD")
                .rates(JsonValue.from(mapOf<String, Any>()))
                .to("EUR")
                .rate("2.3456")
                .build()

        val body = params._body()

        assertThat(body.date()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.from()).isEqualTo("USD")
        assertThat(body._rates()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.to()).isEqualTo("EUR")
        assertThat(body.rate()).isEqualTo("2.3456")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExchangeRateCreateParams.builder()
                .date(LocalDate.parse("2026-04-01"))
                .from("USD")
                .rates(JsonValue.from(mapOf<String, Any>()))
                .to("EUR")
                .build()

        val body = params._body()

        assertThat(body.date()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.from()).isEqualTo("USD")
        assertThat(body._rates()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.to()).isEqualTo("EUR")
    }
}
