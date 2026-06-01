// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.attachments

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentCreateParamsTest {

    @Test
    fun create() {
        AttachmentCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .attachableId("134")
            .attachableType(AttachableType.BILL)
            .filename("file.pdf")
            .notes("Some notes")
            .title("Some PDF file")
            .build()
    }

    @Test
    fun headers() {
        val params =
            AttachmentCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .attachableId("134")
                .attachableType(AttachableType.BILL)
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
        val params =
            AttachmentCreateParams.builder()
                .attachableId("134")
                .attachableType(AttachableType.BILL)
                .filename("file.pdf")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AttachmentCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .attachableId("134")
                .attachableType(AttachableType.BILL)
                .filename("file.pdf")
                .notes("Some notes")
                .title("Some PDF file")
                .build()

        val body = params._body()

        assertThat(body.attachableId()).isEqualTo("134")
        assertThat(body.attachableType()).isEqualTo(AttachableType.BILL)
        assertThat(body.filename()).isEqualTo("file.pdf")
        assertThat(body.notes()).isEqualTo("Some notes")
        assertThat(body.title()).isEqualTo("Some PDF file")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AttachmentCreateParams.builder()
                .attachableId("134")
                .attachableType(AttachableType.BILL)
                .filename("file.pdf")
                .build()

        val body = params._body()

        assertThat(body.attachableId()).isEqualTo("134")
        assertThat(body.attachableType()).isEqualTo(AttachableType.BILL)
        assertThat(body.filename()).isEqualTo("file.pdf")
    }
}
