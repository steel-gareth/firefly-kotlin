// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.preferences

import com.firefly.api.core.http.Headers
import com.firefly.api.models.configuration.PolymorphicProperty
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceUpdateParamsTest {

    @Test
    fun create() {
        PreferenceUpdateParams.builder()
            .name("currencyPreference")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .data(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PreferenceUpdateParams.builder().name("currencyPreference").data(true).build()

        assertThat(params._pathParam(0)).isEqualTo("currencyPreference")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            PreferenceUpdateParams.builder()
                .name("currencyPreference")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .data(true)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = PreferenceUpdateParams.builder().name("currencyPreference").data(true).build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            PreferenceUpdateParams.builder()
                .name("currencyPreference")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .data(true)
                .build()

        val body = params._body()

        assertThat(body.data()).isEqualTo(PolymorphicProperty.ofBoolean(true))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PreferenceUpdateParams.builder().name("currencyPreference").data(true).build()

        val body = params._body()

        assertThat(body.data()).isEqualTo(PolymorphicProperty.ofBoolean(true))
    }
}
