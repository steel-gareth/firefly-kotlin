// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.webhooks.messages

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveParamsTest {

    @Test
    fun create() {
        MessageRetrieveParams.builder()
            .id("123")
            .messageId(1L)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessageRetrieveParams.builder().id("123").messageId(1L).build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        assertThat(params._pathParam(1)).isEqualTo("1")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            MessageRetrieveParams.builder()
                .id("123")
                .messageId(1L)
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
        val params = MessageRetrieveParams.builder().id("123").messageId(1L).build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
