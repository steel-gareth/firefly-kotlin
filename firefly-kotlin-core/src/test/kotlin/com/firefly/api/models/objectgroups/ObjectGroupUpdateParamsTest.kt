// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.objectgroups

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGroupUpdateParamsTest {

    @Test
    fun create() {
        ObjectGroupUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .title("My object group")
            .order(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ObjectGroupUpdateParams.builder().id("123").title("My object group").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ObjectGroupUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .title("My object group")
                .order(1)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = ObjectGroupUpdateParams.builder().id("123").title("My object group").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ObjectGroupUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .title("My object group")
                .order(1)
                .build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("My object group")
        assertThat(body.order()).isEqualTo(1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ObjectGroupUpdateParams.builder().id("123").title("My object group").build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("My object group")
    }
}
