// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.bills

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleActionKeyword
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleRead
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleTriggerKeyword
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleTriggerType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleArrayTest {

    @Test
    fun create() {
        val ruleArray =
            RuleArray.builder()
                .addData(
                    RuleRead.builder()
                        .id("2")
                        .attributes(
                            RuleRead.Attributes.builder()
                                .addAction(
                                    RuleRead.Attributes.Action.builder()
                                        .type(RuleActionKeyword.SET_CATEGORY)
                                        .value("Daily groceries")
                                        .id("2")
                                        .active(true)
                                        .createdAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .order(5)
                                        .stopProcessing(false)
                                        .updatedAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .build()
                                )
                                .ruleGroupId("81")
                                .title("First rule title.")
                                .trigger(RuleTriggerType.STORE_JOURNAL)
                                .addTrigger(
                                    RuleRead.Attributes.Trigger.builder()
                                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                                        .value("tag1")
                                        .id("2")
                                        .active(true)
                                        .createdAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .order(5)
                                        .prohibited(false)
                                        .stopProcessing(false)
                                        .updatedAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .build()
                                )
                                .active(true)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .description("First rule description")
                                .order(5)
                                .ruleGroupTitle("New rule group")
                                .stopProcessing(false)
                                .strict(true)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("rules")
                        .build()
                )
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pagination(
                            Meta.Pagination.builder()
                                .count(20L)
                                .currentPage(1L)
                                .perPage(100L)
                                .total(3L)
                                .totalPages(1L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(ruleArray.data())
            .containsExactly(
                RuleRead.builder()
                    .id("2")
                    .attributes(
                        RuleRead.Attributes.builder()
                            .addAction(
                                RuleRead.Attributes.Action.builder()
                                    .type(RuleActionKeyword.SET_CATEGORY)
                                    .value("Daily groceries")
                                    .id("2")
                                    .active(true)
                                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                    .order(5)
                                    .stopProcessing(false)
                                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                    .build()
                            )
                            .ruleGroupId("81")
                            .title("First rule title.")
                            .trigger(RuleTriggerType.STORE_JOURNAL)
                            .addTrigger(
                                RuleRead.Attributes.Trigger.builder()
                                    .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                                    .value("tag1")
                                    .id("2")
                                    .active(true)
                                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                    .order(5)
                                    .prohibited(false)
                                    .stopProcessing(false)
                                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                    .build()
                            )
                            .active(true)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .description("First rule description")
                            .order(5)
                            .ruleGroupTitle("New rule group")
                            .stopProcessing(false)
                            .strict(true)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("rules")
                    .build()
            )
        assertThat(ruleArray.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(ruleArray.meta())
            .isEqualTo(
                Meta.builder()
                    .pagination(
                        Meta.Pagination.builder()
                            .count(20L)
                            .currentPage(1L)
                            .perPage(100L)
                            .total(3L)
                            .totalPages(1L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleArray =
            RuleArray.builder()
                .addData(
                    RuleRead.builder()
                        .id("2")
                        .attributes(
                            RuleRead.Attributes.builder()
                                .addAction(
                                    RuleRead.Attributes.Action.builder()
                                        .type(RuleActionKeyword.SET_CATEGORY)
                                        .value("Daily groceries")
                                        .id("2")
                                        .active(true)
                                        .createdAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .order(5)
                                        .stopProcessing(false)
                                        .updatedAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .build()
                                )
                                .ruleGroupId("81")
                                .title("First rule title.")
                                .trigger(RuleTriggerType.STORE_JOURNAL)
                                .addTrigger(
                                    RuleRead.Attributes.Trigger.builder()
                                        .type(RuleTriggerKeyword.FROM_ACCOUNT_STARTS)
                                        .value("tag1")
                                        .id("2")
                                        .active(true)
                                        .createdAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .order(5)
                                        .prohibited(false)
                                        .stopProcessing(false)
                                        .updatedAt(
                                            OffsetDateTime.parse("2026-04-01T00:00:00+00:00")
                                        )
                                        .build()
                                )
                                .active(true)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .description("First rule description")
                                .order(5)
                                .ruleGroupTitle("New rule group")
                                .stopProcessing(false)
                                .strict(true)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("rules")
                        .build()
                )
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pagination(
                            Meta.Pagination.builder()
                                .count(20L)
                                .currentPage(1L)
                                .perPage(100L)
                                .total(3L)
                                .totalPages(1L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedRuleArray =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleArray),
                jacksonTypeRef<RuleArray>(),
            )

        assertThat(roundtrippedRuleArray).isEqualTo(ruleArray)
    }
}
