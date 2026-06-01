// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleCreateParamsTest {

    @Test
    fun create() {
        RuleCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .addAction(
                RuleCreateParams.Action.builder()
                    .type(RuleActionKeyword.SET_CATEGORY)
                    .value("Daily groceries")
                    .active(true)
                    .order(5)
                    .stopProcessing(false)
                    .build()
            )
            .ruleGroupId("81")
            .title("First rule title.")
            .trigger(RuleTriggerType.STORE_JOURNAL)
            .addTrigger(
                RuleCreateParams.Trigger.builder()
                    .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                    .value("tag1")
                    .active(true)
                    .order(5)
                    .prohibited(false)
                    .stopProcessing(false)
                    .build()
            )
            .active(true)
            .description("First rule description")
            .order(5)
            .ruleGroupTitle("New rule group")
            .stopProcessing(false)
            .strict(true)
            .build()
    }

    @Test
    fun headers() {
        val params =
            RuleCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .addAction(
                    RuleCreateParams.Action.builder()
                        .type(RuleActionKeyword.SET_CATEGORY)
                        .value("Daily groceries")
                        .active(true)
                        .order(5)
                        .stopProcessing(false)
                        .build()
                )
                .ruleGroupId("81")
                .title("First rule title.")
                .trigger(RuleTriggerType.STORE_JOURNAL)
                .addTrigger(
                    RuleCreateParams.Trigger.builder()
                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                        .value("tag1")
                        .active(true)
                        .order(5)
                        .prohibited(false)
                        .stopProcessing(false)
                        .build()
                )
                .active(true)
                .description("First rule description")
                .order(5)
                .ruleGroupTitle("New rule group")
                .stopProcessing(false)
                .strict(true)
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
            RuleCreateParams.builder()
                .addAction(
                    RuleCreateParams.Action.builder()
                        .type(RuleActionKeyword.SET_CATEGORY)
                        .value("Daily groceries")
                        .build()
                )
                .ruleGroupId("81")
                .title("First rule title.")
                .trigger(RuleTriggerType.STORE_JOURNAL)
                .addTrigger(
                    RuleCreateParams.Trigger.builder()
                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                        .value("tag1")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RuleCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .addAction(
                    RuleCreateParams.Action.builder()
                        .type(RuleActionKeyword.SET_CATEGORY)
                        .value("Daily groceries")
                        .active(true)
                        .order(5)
                        .stopProcessing(false)
                        .build()
                )
                .ruleGroupId("81")
                .title("First rule title.")
                .trigger(RuleTriggerType.STORE_JOURNAL)
                .addTrigger(
                    RuleCreateParams.Trigger.builder()
                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                        .value("tag1")
                        .active(true)
                        .order(5)
                        .prohibited(false)
                        .stopProcessing(false)
                        .build()
                )
                .active(true)
                .description("First rule description")
                .order(5)
                .ruleGroupTitle("New rule group")
                .stopProcessing(false)
                .strict(true)
                .build()

        val body = params._body()

        assertThat(body.actions())
            .containsExactly(
                RuleCreateParams.Action.builder()
                    .type(RuleActionKeyword.SET_CATEGORY)
                    .value("Daily groceries")
                    .active(true)
                    .order(5)
                    .stopProcessing(false)
                    .build()
            )
        assertThat(body.ruleGroupId()).isEqualTo("81")
        assertThat(body.title()).isEqualTo("First rule title.")
        assertThat(body.trigger()).isEqualTo(RuleTriggerType.STORE_JOURNAL)
        assertThat(body.triggers())
            .containsExactly(
                RuleCreateParams.Trigger.builder()
                    .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                    .value("tag1")
                    .active(true)
                    .order(5)
                    .prohibited(false)
                    .stopProcessing(false)
                    .build()
            )
        assertThat(body.active()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("First rule description")
        assertThat(body.order()).isEqualTo(5)
        assertThat(body.ruleGroupTitle()).isEqualTo("New rule group")
        assertThat(body.stopProcessing()).isEqualTo(false)
        assertThat(body.strict()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuleCreateParams.builder()
                .addAction(
                    RuleCreateParams.Action.builder()
                        .type(RuleActionKeyword.SET_CATEGORY)
                        .value("Daily groceries")
                        .build()
                )
                .ruleGroupId("81")
                .title("First rule title.")
                .trigger(RuleTriggerType.STORE_JOURNAL)
                .addTrigger(
                    RuleCreateParams.Trigger.builder()
                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                        .value("tag1")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.actions())
            .containsExactly(
                RuleCreateParams.Action.builder()
                    .type(RuleActionKeyword.SET_CATEGORY)
                    .value("Daily groceries")
                    .build()
            )
        assertThat(body.ruleGroupId()).isEqualTo("81")
        assertThat(body.title()).isEqualTo("First rule title.")
        assertThat(body.trigger()).isEqualTo(RuleTriggerType.STORE_JOURNAL)
        assertThat(body.triggers())
            .containsExactly(
                RuleCreateParams.Trigger.builder()
                    .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                    .value("tag1")
                    .build()
            )
    }
}
