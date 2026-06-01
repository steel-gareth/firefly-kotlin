// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleSingleTest {

    @Test
    fun create() {
        val ruleSingle =
            RuleSingle.builder()
                .data(
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
                .build()

        assertThat(ruleSingle.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleSingle =
            RuleSingle.builder()
                .data(
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
                .build()

        val roundtrippedRuleSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleSingle),
                jacksonTypeRef<RuleSingle>(),
            )

        assertThat(roundtrippedRuleSingle).isEqualTo(ruleSingle)
    }
}
