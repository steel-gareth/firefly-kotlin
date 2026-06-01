// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.usergroups

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGroupUpdateParamsTest {

    @Test
    fun create() {
        UserGroupUpdateParams.builder()
            .id("1")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .title("New user group title")
            .primaryCurrencyCode("EUR")
            .primaryCurrencyId("1")
            .build()
    }

    @Test
    fun pathParams() {
        val params = UserGroupUpdateParams.builder().id("1").title("New user group title").build()

        assertThat(params._pathParam(0)).isEqualTo("1")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            UserGroupUpdateParams.builder()
                .id("1")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .title("New user group title")
                .primaryCurrencyCode("EUR")
                .primaryCurrencyId("1")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = UserGroupUpdateParams.builder().id("1").title("New user group title").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            UserGroupUpdateParams.builder()
                .id("1")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .title("New user group title")
                .primaryCurrencyCode("EUR")
                .primaryCurrencyId("1")
                .build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("New user group title")
        assertThat(body.primaryCurrencyCode()).isEqualTo("EUR")
        assertThat(body.primaryCurrencyId()).isEqualTo("1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserGroupUpdateParams.builder().id("1").title("New user group title").build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("New user group title")
    }
}
