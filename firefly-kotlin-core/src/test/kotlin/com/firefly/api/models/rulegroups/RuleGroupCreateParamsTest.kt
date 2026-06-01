// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rulegroups

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleGroupCreateParamsTest {

    @Test
    fun create() {
        RuleGroupCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .title("Default rule group")
            .active(true)
            .description("Description of this rule group")
            .order(4)
            .build()
    }

    @Test
    fun headers() {
        val params =
            RuleGroupCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .title("Default rule group")
                .active(true)
                .description("Description of this rule group")
                .order(4)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = RuleGroupCreateParams.builder().title("Default rule group").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RuleGroupCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .title("Default rule group")
                .active(true)
                .description("Description of this rule group")
                .order(4)
                .build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("Default rule group")
        assertThat(body.active()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("Description of this rule group")
        assertThat(body.order()).isEqualTo(4)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RuleGroupCreateParams.builder().title("Default rule group").build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("Default rule group")
    }
}
