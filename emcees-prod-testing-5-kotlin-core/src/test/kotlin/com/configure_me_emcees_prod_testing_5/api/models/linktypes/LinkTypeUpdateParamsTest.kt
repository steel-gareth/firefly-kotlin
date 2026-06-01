// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.linktypes

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkTypeUpdateParamsTest {

    @Test
    fun create() {
        LinkTypeUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .inward("is (partially) paid for by")
            .name("Paid")
            .outward("(partially) pays for")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LinkTypeUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            LinkTypeUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .inward("is (partially) paid for by")
                .name("Paid")
                .outward("(partially) pays for")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = LinkTypeUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            LinkTypeUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .inward("is (partially) paid for by")
                .name("Paid")
                .outward("(partially) pays for")
                .build()

        val body = params._body()

        assertThat(body.inward()).isEqualTo("is (partially) paid for by")
        assertThat(body.name()).isEqualTo("Paid")
        assertThat(body.outward()).isEqualTo("(partially) pays for")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LinkTypeUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
