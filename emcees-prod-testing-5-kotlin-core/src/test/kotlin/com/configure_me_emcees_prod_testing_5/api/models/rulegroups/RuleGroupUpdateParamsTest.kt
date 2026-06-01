// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rulegroups

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleGroupUpdateParamsTest {

    @Test
    fun create() {
        RuleGroupUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .active(true)
            .description("Description of this rule group")
            .order(4)
            .title("Default rule group")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RuleGroupUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            RuleGroupUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .active(true)
                .description("Description of this rule group")
                .order(4)
                .title("Default rule group")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = RuleGroupUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RuleGroupUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .active(true)
                .description("Description of this rule group")
                .order(4)
                .title("Default rule group")
                .build()

        val body = params._body()

        assertThat(body.active()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("Description of this rule group")
        assertThat(body.order()).isEqualTo(4)
        assertThat(body.title()).isEqualTo("Default rule group")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RuleGroupUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
