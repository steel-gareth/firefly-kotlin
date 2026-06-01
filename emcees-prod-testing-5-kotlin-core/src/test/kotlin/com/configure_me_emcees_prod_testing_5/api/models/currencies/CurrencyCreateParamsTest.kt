// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.currencies

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyCreateParamsTest {

    @Test
    fun create() {
        CurrencyCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .code("AMS")
            .name("Ankh-Morpork dollar")
            .symbol("AM\$")
            .decimalPlaces(2)
            .enabled(true)
            .primary(true)
            .build()
    }

    @Test
    fun headers() {
        val params =
            CurrencyCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .code("AMS")
                .name("Ankh-Morpork dollar")
                .symbol("AM\$")
                .decimalPlaces(2)
                .enabled(true)
                .primary(true)
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
            CurrencyCreateParams.builder()
                .code("AMS")
                .name("Ankh-Morpork dollar")
                .symbol("AM\$")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CurrencyCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .code("AMS")
                .name("Ankh-Morpork dollar")
                .symbol("AM\$")
                .decimalPlaces(2)
                .enabled(true)
                .primary(true)
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("AMS")
        assertThat(body.name()).isEqualTo("Ankh-Morpork dollar")
        assertThat(body.symbol()).isEqualTo("AM\$")
        assertThat(body.decimalPlaces()).isEqualTo(2)
        assertThat(body.enabled()).isEqualTo(true)
        assertThat(body.primary()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CurrencyCreateParams.builder()
                .code("AMS")
                .name("Ankh-Morpork dollar")
                .symbol("AM\$")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("AMS")
        assertThat(body.name()).isEqualTo("Ankh-Morpork dollar")
        assertThat(body.symbol()).isEqualTo("AM\$")
    }
}
