// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.linktypes

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkTypeCreateParamsTest {

    @Test
    fun create() {
        LinkTypeCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .linkType(
                LinkType.builder()
                    .inward("is (partially) paid for by")
                    .name("Paid")
                    .outward("(partially) pays for")
                    .editable(false)
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            LinkTypeCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .linkType(
                    LinkType.builder()
                        .inward("is (partially) paid for by")
                        .name("Paid")
                        .outward("(partially) pays for")
                        .editable(false)
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
            LinkTypeCreateParams.builder()
                .linkType(
                    LinkType.builder()
                        .inward("is (partially) paid for by")
                        .name("Paid")
                        .outward("(partially) pays for")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            LinkTypeCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .linkType(
                    LinkType.builder()
                        .inward("is (partially) paid for by")
                        .name("Paid")
                        .outward("(partially) pays for")
                        .editable(false)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LinkType.builder()
                    .inward("is (partially) paid for by")
                    .name("Paid")
                    .outward("(partially) pays for")
                    .editable(false)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LinkTypeCreateParams.builder()
                .linkType(
                    LinkType.builder()
                        .inward("is (partially) paid for by")
                        .name("Paid")
                        .outward("(partially) pays for")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LinkType.builder()
                    .inward("is (partially) paid for by")
                    .name("Paid")
                    .outward("(partially) pays for")
                    .build()
            )
    }
}
