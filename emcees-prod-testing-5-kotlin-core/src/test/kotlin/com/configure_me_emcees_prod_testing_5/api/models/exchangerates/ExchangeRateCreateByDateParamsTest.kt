// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateCreateByDateParamsTest {

    @Test
    fun create() {
        ExchangeRateCreateByDateParams.builder()
            .pathDate("2026-04-01")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .bodyDate(JsonValue.from(mapOf<String, Any>()))
            .from("EUR")
            .rates(
                ExchangeRateCreateByDateParams.Rates.builder()
                    .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                    .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExchangeRateCreateByDateParams.builder()
                .pathDate("2026-04-01")
                .bodyDate(JsonValue.from(mapOf<String, Any>()))
                .from("EUR")
                .rates(
                    ExchangeRateCreateByDateParams.Rates.builder()
                        .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                        .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("2026-04-01")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ExchangeRateCreateByDateParams.builder()
                .pathDate("2026-04-01")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .bodyDate(JsonValue.from(mapOf<String, Any>()))
                .from("EUR")
                .rates(
                    ExchangeRateCreateByDateParams.Rates.builder()
                        .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                        .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                        .build()
                )
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
            ExchangeRateCreateByDateParams.builder()
                .pathDate("2026-04-01")
                .bodyDate(JsonValue.from(mapOf<String, Any>()))
                .from("EUR")
                .rates(
                    ExchangeRateCreateByDateParams.Rates.builder()
                        .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                        .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ExchangeRateCreateByDateParams.builder()
                .pathDate("2026-04-01")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .bodyDate(JsonValue.from(mapOf<String, Any>()))
                .from("EUR")
                .rates(
                    ExchangeRateCreateByDateParams.Rates.builder()
                        .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                        .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body._bodyDate()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.from()).isEqualTo("EUR")
        assertThat(body.rates())
            .isEqualTo(
                ExchangeRateCreateByDateParams.Rates.builder()
                    .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                    .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExchangeRateCreateByDateParams.builder()
                .pathDate("2026-04-01")
                .bodyDate(JsonValue.from(mapOf<String, Any>()))
                .from("EUR")
                .rates(
                    ExchangeRateCreateByDateParams.Rates.builder()
                        .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                        .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body._bodyDate()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.from()).isEqualTo("EUR")
        assertThat(body.rates())
            .isEqualTo(
                ExchangeRateCreateByDateParams.Rates.builder()
                    .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                    .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                    .build()
            )
    }
}
