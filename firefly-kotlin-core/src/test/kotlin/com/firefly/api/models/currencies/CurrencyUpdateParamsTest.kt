// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.currencies

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyUpdateParamsTest {

    @Test
    fun create() {
        CurrencyUpdateParams.builder()
            .pathCode("EUR")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .bodyCode("AMS")
            .decimalPlaces(2)
            .enabled(true)
            .name("Ankh-Morpork dollar")
            .primary(CurrencyUpdateParams.Primary.TRUE)
            .symbol("AM\$")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CurrencyUpdateParams.builder().pathCode("EUR").build()

        assertThat(params._pathParam(0)).isEqualTo("EUR")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CurrencyUpdateParams.builder()
                .pathCode("EUR")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .bodyCode("AMS")
                .decimalPlaces(2)
                .enabled(true)
                .name("Ankh-Morpork dollar")
                .primary(CurrencyUpdateParams.Primary.TRUE)
                .symbol("AM\$")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CurrencyUpdateParams.builder().pathCode("EUR").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CurrencyUpdateParams.builder()
                .pathCode("EUR")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .bodyCode("AMS")
                .decimalPlaces(2)
                .enabled(true)
                .name("Ankh-Morpork dollar")
                .primary(CurrencyUpdateParams.Primary.TRUE)
                .symbol("AM\$")
                .build()

        val body = params._body()

        assertThat(body.bodyCode()).isEqualTo("AMS")
        assertThat(body.decimalPlaces()).isEqualTo(2)
        assertThat(body.enabled()).isEqualTo(true)
        assertThat(body.name()).isEqualTo("Ankh-Morpork dollar")
        assertThat(body.primary()).isEqualTo(CurrencyUpdateParams.Primary.TRUE)
        assertThat(body.symbol()).isEqualTo("AM\$")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CurrencyUpdateParams.builder().pathCode("EUR").build()

        val body = params._body()
    }
}
