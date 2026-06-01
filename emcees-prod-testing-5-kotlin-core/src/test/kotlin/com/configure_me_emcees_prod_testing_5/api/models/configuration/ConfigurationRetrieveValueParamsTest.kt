// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.configuration

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationRetrieveValueParamsTest {

    @Test
    fun create() {
        ConfigurationRetrieveValueParams.builder()
            .name(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConfigurationRetrieveValueParams.builder()
                .name(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("configuration.is_demo_site")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ConfigurationRetrieveValueParams.builder()
                .name(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
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
        val params =
            ConfigurationRetrieveValueParams.builder()
                .name(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
