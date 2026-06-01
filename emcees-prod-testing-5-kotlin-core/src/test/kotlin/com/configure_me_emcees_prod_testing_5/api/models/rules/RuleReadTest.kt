// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rules

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleReadTest {

    @Test
    fun create() {
        val ruleRead =
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

        assertThat(ruleRead.id()).isEqualTo("2")
        assertThat(ruleRead.attributes())
            .isEqualTo(
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
        assertThat(ruleRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(ruleRead.type()).isEqualTo("rules")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleRead =
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

        val roundtrippedRuleRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleRead),
                jacksonTypeRef<RuleRead>(),
            )

        assertThat(roundtrippedRuleRead).isEqualTo(ruleRead)
    }
}
