// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.preferences

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceRetrieveParamsTest {

    @Test
    fun create() {
        PreferenceRetrieveParams.builder()
            .name("currencyPreference")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PreferenceRetrieveParams.builder().name("currencyPreference").build()

        assertThat(params._pathParam(0)).isEqualTo("currencyPreference")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            PreferenceRetrieveParams.builder()
                .name("currencyPreference")
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
        val params = PreferenceRetrieveParams.builder().name("currencyPreference").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
