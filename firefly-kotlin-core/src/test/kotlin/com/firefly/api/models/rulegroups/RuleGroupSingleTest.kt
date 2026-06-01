// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rulegroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleGroupSingleTest {

    @Test
    fun create() {
        val ruleGroupSingle =
            RuleGroupSingle.builder()
                .data(
                    RuleGroupRead.builder()
                        .id("2")
                        .attributes(
                            RuleGroupRead.Attributes.builder()
                                .title("Default rule group")
                                .active(true)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .description("Description of this rule group")
                                .order(4)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("rules_group")
                        .build()
                )
                .build()

        assertThat(ruleGroupSingle.data())
            .isEqualTo(
                RuleGroupRead.builder()
                    .id("2")
                    .attributes(
                        RuleGroupRead.Attributes.builder()
                            .title("Default rule group")
                            .active(true)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .description("Description of this rule group")
                            .order(4)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("rules_group")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleGroupSingle =
            RuleGroupSingle.builder()
                .data(
                    RuleGroupRead.builder()
                        .id("2")
                        .attributes(
                            RuleGroupRead.Attributes.builder()
                                .title("Default rule group")
                                .active(true)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .description("Description of this rule group")
                                .order(4)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("rules_group")
                        .build()
                )
                .build()

        val roundtrippedRuleGroupSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleGroupSingle),
                jacksonTypeRef<RuleGroupSingle>(),
            )

        assertThat(roundtrippedRuleGroupSingle).isEqualTo(ruleGroupSingle)
    }
}
