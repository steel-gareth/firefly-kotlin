// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.currencies.primary

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrimaryRetrieveParamsTest {

    @Test
    fun create() {
        PrimaryRetrieveParams.builder().xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
    }

    @Test
    fun headers() {
        val params =
            PrimaryRetrieveParams.builder().xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = PrimaryRetrieveParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
