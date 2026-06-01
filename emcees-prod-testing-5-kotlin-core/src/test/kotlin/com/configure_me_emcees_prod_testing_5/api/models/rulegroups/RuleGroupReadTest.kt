// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rulegroups

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleGroupReadTest {

    @Test
    fun create() {
        val ruleGroupRead =
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

        assertThat(ruleGroupRead.id()).isEqualTo("2")
        assertThat(ruleGroupRead.attributes())
            .isEqualTo(
                RuleGroupRead.Attributes.builder()
                    .title("Default rule group")
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .description("Description of this rule group")
                    .order(4)
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(ruleGroupRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(ruleGroupRead.type()).isEqualTo("rules_group")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleGroupRead =
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

        val roundtrippedRuleGroupRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleGroupRead),
                jacksonTypeRef<RuleGroupRead>(),
            )

        assertThat(roundtrippedRuleGroupRead).isEqualTo(ruleGroupRead)
    }
}
