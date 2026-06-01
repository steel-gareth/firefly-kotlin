// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.budgets.limits

import com.firefly.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitUpdateParamsTest {

    @Test
    fun create() {
        LimitUpdateParams.builder()
            .id("123")
            .limitId("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .amount("123.45")
            .currencyCode("EUR")
            .currencyId("5")
            .currencyName("Euro")
            .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
            .fireWebhooks(true)
            .notes("Some example notes")
            .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = LimitUpdateParams.builder().id("123").limitId("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        assertThat(params._pathParam(1)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            LimitUpdateParams.builder()
                .id("123")
                .limitId("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .amount("123.45")
                .currencyCode("EUR")
                .currencyId("5")
                .currencyName("Euro")
                .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .fireWebhooks(true)
                .notes("Some example notes")
                .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = LimitUpdateParams.builder().id("123").limitId("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            LimitUpdateParams.builder()
                .id("123")
                .limitId("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .amount("123.45")
                .currencyCode("EUR")
                .currencyId("5")
                .currencyName("Euro")
                .end(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .fireWebhooks(true)
                .notes("Some example notes")
                .start(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("123.45")
        assertThat(body.currencyCode()).isEqualTo("EUR")
        assertThat(body.currencyId()).isEqualTo("5")
        assertThat(body.currencyName()).isEqualTo("Euro")
        assertThat(body.end()).isEqualTo(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
        assertThat(body.fireWebhooks()).isEqualTo(true)
        assertThat(body.notes()).isEqualTo("Some example notes")
        assertThat(body.start()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LimitUpdateParams.builder().id("123").limitId("123").build()

        val body = params._body()
    }
}
