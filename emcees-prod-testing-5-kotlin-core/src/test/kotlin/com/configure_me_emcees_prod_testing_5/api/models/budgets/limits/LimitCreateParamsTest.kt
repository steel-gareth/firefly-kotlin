// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets.limits

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitCreateParamsTest {

    @Test
    fun create() {
        LimitCreateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .amount("123.45")
            .end(LocalDate.parse("2026-04-30"))
            .start(LocalDate.parse("2026-04-01"))
            .currencyCode("EUR")
            .currencyId("5")
            .fireWebhooks(true)
            .notes("Some example notes")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LimitCreateParams.builder()
                .id("123")
                .amount("123.45")
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            LimitCreateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .amount("123.45")
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .currencyCode("EUR")
                .currencyId("5")
                .fireWebhooks(true)
                .notes("Some example notes")
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
            LimitCreateParams.builder()
                .id("123")
                .amount("123.45")
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            LimitCreateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .amount("123.45")
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .currencyCode("EUR")
                .currencyId("5")
                .fireWebhooks(true)
                .notes("Some example notes")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("123.45")
        assertThat(body.end()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.start()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.currencyCode()).isEqualTo("EUR")
        assertThat(body.currencyId()).isEqualTo("5")
        assertThat(body.fireWebhooks()).isEqualTo(true)
        assertThat(body.notes()).isEqualTo("Some example notes")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LimitCreateParams.builder()
                .id("123")
                .amount("123.45")
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("123.45")
        assertThat(body.end()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.start()).isEqualTo(LocalDate.parse("2026-04-01"))
    }
}
