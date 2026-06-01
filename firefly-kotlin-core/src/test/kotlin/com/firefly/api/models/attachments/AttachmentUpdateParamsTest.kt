// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.attachments

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentUpdateParamsTest {

    @Test
    fun create() {
        AttachmentUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .filename("file.pdf")
            .notes("Some notes")
            .title("Some PDF file")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AttachmentUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            AttachmentUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .filename("file.pdf")
                .notes("Some notes")
                .title("Some PDF file")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = AttachmentUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AttachmentUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .filename("file.pdf")
                .notes("Some notes")
                .title("Some PDF file")
                .build()

        val body = params._body()

        assertThat(body.filename()).isEqualTo("file.pdf")
        assertThat(body.notes()).isEqualTo("Some notes")
        assertThat(body.title()).isEqualTo("Some PDF file")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AttachmentUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
