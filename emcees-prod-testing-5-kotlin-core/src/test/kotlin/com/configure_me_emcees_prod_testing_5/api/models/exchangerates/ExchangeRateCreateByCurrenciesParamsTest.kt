// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateCreateByCurrenciesParamsTest {

    @Test
    fun create() {
        ExchangeRateCreateByCurrenciesParams.builder()
            .from("EUR")
            .to("USD")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .body(
                ExchangeRateCreateByCurrenciesParams.Body.builder()
                    .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                    .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExchangeRateCreateByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
                .body(
                    ExchangeRateCreateByCurrenciesParams.Body.builder()
                        .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                        .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("EUR")
        assertThat(params._pathParam(1)).isEqualTo("USD")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ExchangeRateCreateByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .body(
                    ExchangeRateCreateByCurrenciesParams.Body.builder()
                        .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                        .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
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
            ExchangeRateCreateByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
                .body(
                    ExchangeRateCreateByCurrenciesParams.Body.builder()
                        .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                        .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ExchangeRateCreateByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .body(
                    ExchangeRateCreateByCurrenciesParams.Body.builder()
                        .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                        .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExchangeRateCreateByCurrenciesParams.Body.builder()
                    .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                    .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExchangeRateCreateByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
                .body(
                    ExchangeRateCreateByCurrenciesParams.Body.builder()
                        .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                        .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExchangeRateCreateByCurrenciesParams.Body.builder()
                    .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                    .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                    .build()
            )
    }
}
