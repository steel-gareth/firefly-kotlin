// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.rules.RuleActionKeyword
import com.firefly.api.models.rules.RuleCreateParams
import com.firefly.api.models.rules.RuleDeleteParams
import com.firefly.api.models.rules.RuleListParams
import com.firefly.api.models.rules.RuleRetrieveParams
import com.firefly.api.models.rules.RuleTestParams
import com.firefly.api.models.rules.RuleTriggerKeyword
import com.firefly.api.models.rules.RuleTriggerParams
import com.firefly.api.models.rules.RuleTriggerType
import com.firefly.api.models.rules.RuleUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RuleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        val ruleSingle =
            ruleService.create(
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
            )

        ruleSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        val ruleSingle =
            ruleService.retrieve(
                RuleRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        val ruleSingle =
            ruleService.update(
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
            )

        ruleSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        val ruleArray =
            ruleService.list(
                RuleListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        ruleService.delete(
            RuleDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        val transactionArray =
            ruleService.test(
                RuleTestParams.builder()
                    .id("123")
                    .accounts(listOf(1L, 2L, 3L))
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun trigger() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleService = client.rules()

        ruleService.trigger(
            RuleTriggerParams.builder()
                .id("123")
                .accounts(listOf(1L, 2L, 3L))
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
