// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
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

internal class RuleGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        val ruleGroupSingle =
            ruleGroupServiceAsync.create(
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
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        val ruleGroupSingle =
            ruleGroupServiceAsync.retrieve(
                RuleGroupRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        val ruleGroupSingle =
            ruleGroupServiceAsync.update(
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
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        ruleGroupServiceAsync.delete(
            RuleGroupDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAll() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        val response =
            ruleGroupServiceAsync.listAll(
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
    suspend fun listRules() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        val ruleArray =
            ruleGroupServiceAsync.listRules(
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
    suspend fun testTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        val transactionArray =
            ruleGroupServiceAsync.testTransactions(
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
    suspend fun triggerRules() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val ruleGroupServiceAsync = client.ruleGroups()

        ruleGroupServiceAsync.triggerRules(
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
