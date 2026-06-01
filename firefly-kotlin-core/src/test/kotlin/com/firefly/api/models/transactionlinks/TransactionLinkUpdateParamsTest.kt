// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.transactionlinks

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLinkUpdateParamsTest {

    @Test
    fun create() {
        TransactionLinkUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .inwardId("131")
            .linkTypeId("5")
            .linkTypeName("Is paid by")
            .notes("Some example notes")
            .outwardId("131")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TransactionLinkUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TransactionLinkUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .inwardId("131")
                .linkTypeId("5")
                .linkTypeName("Is paid by")
                .notes("Some example notes")
                .outwardId("131")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TransactionLinkUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TransactionLinkUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .inwardId("131")
                .linkTypeId("5")
                .linkTypeName("Is paid by")
                .notes("Some example notes")
                .outwardId("131")
                .build()

        val body = params._body()

        assertThat(body.inwardId()).isEqualTo("131")
        assertThat(body.linkTypeId()).isEqualTo("5")
        assertThat(body.linkTypeName()).isEqualTo("Is paid by")
        assertThat(body.notes()).isEqualTo("Some example notes")
        assertThat(body.outwardId()).isEqualTo("131")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TransactionLinkUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
