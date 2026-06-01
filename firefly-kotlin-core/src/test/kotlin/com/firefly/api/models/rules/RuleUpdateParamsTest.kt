// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleUpdateParamsTest {

    @Test
    fun create() {
        RuleUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .addAction(
                RuleUpdateParams.Action.builder()
                    .active(true)
                    .order(5)
                    .stopProcessing(false)
                    .type(RuleActionKeyword.SET_CATEGORY)
                    .value("Daily groceries")
                    .build()
            )
            .active(true)
            .description("First rule description")
            .order(5)
            .ruleGroupId("81")
            .stopProcessing(false)
            .strict(true)
            .title("First rule title.")
            .trigger(RuleTriggerType.STORE_JOURNAL)
            .addTrigger(
                RuleUpdateParams.Trigger.builder()
                    .active(true)
                    .order(5)
                    .stopProcessing(false)
                    .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                    .value("tag1")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = RuleUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            RuleUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .addAction(
                    RuleUpdateParams.Action.builder()
                        .active(true)
                        .order(5)
                        .stopProcessing(false)
                        .type(RuleActionKeyword.SET_CATEGORY)
                        .value("Daily groceries")
                        .build()
                )
                .active(true)
                .description("First rule description")
                .order(5)
                .ruleGroupId("81")
                .stopProcessing(false)
                .strict(true)
                .title("First rule title.")
                .trigger(RuleTriggerType.STORE_JOURNAL)
                .addTrigger(
                    RuleUpdateParams.Trigger.builder()
                        .active(true)
                        .order(5)
                        .stopProcessing(false)
                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                        .value("tag1")
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
        val params = RuleUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RuleUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .addAction(
                    RuleUpdateParams.Action.builder()
                        .active(true)
                        .order(5)
                        .stopProcessing(false)
                        .type(RuleActionKeyword.SET_CATEGORY)
                        .value("Daily groceries")
                        .build()
                )
                .active(true)
                .description("First rule description")
                .order(5)
                .ruleGroupId("81")
                .stopProcessing(false)
                .strict(true)
                .title("First rule title.")
                .trigger(RuleTriggerType.STORE_JOURNAL)
                .addTrigger(
                    RuleUpdateParams.Trigger.builder()
                        .active(true)
                        .order(5)
                        .stopProcessing(false)
                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                        .value("tag1")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.actions())
            .containsExactly(
                RuleUpdateParams.Action.builder()
                    .active(true)
                    .order(5)
                    .stopProcessing(false)
                    .type(RuleActionKeyword.SET_CATEGORY)
                    .value("Daily groceries")
                    .build()
            )
        assertThat(body.active()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("First rule description")
        assertThat(body.order()).isEqualTo(5)
        assertThat(body.ruleGroupId()).isEqualTo("81")
        assertThat(body.stopProcessing()).isEqualTo(false)
        assertThat(body.strict()).isEqualTo(true)
        assertThat(body.title()).isEqualTo("First rule title.")
        assertThat(body.trigger()).isEqualTo(RuleTriggerType.STORE_JOURNAL)
        assertThat(body.triggers())
            .containsExactly(
                RuleUpdateParams.Trigger.builder()
                    .active(true)
                    .order(5)
                    .stopProcessing(false)
                    .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                    .value("tag1")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RuleUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
