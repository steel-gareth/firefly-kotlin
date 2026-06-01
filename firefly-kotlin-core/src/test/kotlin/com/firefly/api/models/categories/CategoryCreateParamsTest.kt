// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.categories

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryCreateParamsTest {

    @Test
    fun create() {
        CategoryCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .name("Lunch")
            .notes("Some example notes")
            .build()
    }

    @Test
    fun headers() {
        val params =
            CategoryCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("Lunch")
                .notes("Some example notes")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CategoryCreateParams.builder().name("Lunch").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CategoryCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("Lunch")
                .notes("Some example notes")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Lunch")
        assertThat(body.notes()).isEqualTo("Some example notes")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CategoryCreateParams.builder().name("Lunch").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Lunch")
    }
}
