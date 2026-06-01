// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rulegroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.accounts.Meta
import com.firefly.api.models.accounts.PageLink
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleGroupListAllResponseTest {

    @Test
    fun create() {
        val ruleGroupListAllResponse =
            RuleGroupListAllResponse.builder()
                .addData(
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

        assertThat(ruleGroupListAllResponse.data())
            .containsExactly(
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
        assertThat(ruleGroupListAllResponse.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(ruleGroupListAllResponse.meta())
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
        val ruleGroupListAllResponse =
            RuleGroupListAllResponse.builder()
                .addData(
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

        val roundtrippedRuleGroupListAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleGroupListAllResponse),
                jacksonTypeRef<RuleGroupListAllResponse>(),
            )

        assertThat(roundtrippedRuleGroupListAllResponse).isEqualTo(ruleGroupListAllResponse)
    }
}
