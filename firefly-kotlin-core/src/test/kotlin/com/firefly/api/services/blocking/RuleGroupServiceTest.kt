// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.rulegroups.RuleGroupCreateParams
import com.firefly.api.models.rulegroups.RuleGroupDeleteParams
import com.firefly.api.models.rulegroups.RuleGroupListAllParams
import com.firefly.api.models.rulegroups.RuleGroupListRulesParams
import com.firefly.api.models.rulegroups.RuleGroupRetrieveParams
import com.firefly.api.models.rulegroups.RuleGroupTestTransactionsParams
import com.firefly.api.models.rulegroups.RuleGroupTriggerRulesParams
import com.firefly.api.models.rulegroups.RuleGroupUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RuleGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        val ruleGroupSingle =
            ruleGroupService.create(
                RuleGroupCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .title("Default rule group")
                    .active(true)
                    .description("Description of this rule group")
                    .order(4)
                    .build()
            )

        ruleGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        val ruleGroupSingle =
            ruleGroupService.retrieve(
                RuleGroupRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        val ruleGroupSingle =
            ruleGroupService.update(
                RuleGroupUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .active(true)
                    .description("Description of this rule group")
                    .order(4)
                    .title("Default rule group")
                    .build()
            )

        ruleGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        ruleGroupService.delete(
            RuleGroupDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAll() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        val response =
            ruleGroupService.listAll(
                RuleGroupListAllParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRules() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        val ruleArray =
            ruleGroupService.listRules(
                RuleGroupListRulesParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun testTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        val transactionArray =
            ruleGroupService.testTransactions(
                RuleGroupTestTransactionsParams.builder()
                    .id("123")
                    .accounts(listOf(1L, 2L, 3L))
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .searchLimit(0L)
                    .start(LocalDate.parse("2026-04-01"))
                    .triggeredLimit(0L)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun triggerRules() {
        val client = FireflyOkHttpClient.fromEnv()
        val ruleGroupService = client.ruleGroups()

        ruleGroupService.triggerRules(
            RuleGroupTriggerRulesParams.builder()
                .id("123")
                .accounts(listOf(1L, 2L, 3L))
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
