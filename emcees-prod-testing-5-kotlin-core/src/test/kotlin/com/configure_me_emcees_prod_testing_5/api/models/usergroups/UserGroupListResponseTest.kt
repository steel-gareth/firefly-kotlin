// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.usergroups

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGroupListResponseTest {

    @Test
    fun create() {
        val userGroupListResponse =
            UserGroupListResponse.builder()
                .addData(
                    UserGroupRead.builder()
                        .id("2")
                        .attributes(
                            UserGroupRead.Attributes.builder()
                                .canSeeMembers(true)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .inUse(false)
                                .addMember(
                                    UserGroupRead.Attributes.Member.builder()
                                        .addRole(UserGroupRead.Attributes.Member.Role.RO)
                                        .userEmail("james@firefly-iii.org")
                                        .userId("5")
                                        .you(false)
                                        .build()
                                )
                                .primaryCurrencyCode("EUR")
                                .primaryCurrencyDecimalPlaces(2)
                                .primaryCurrencyId("12")
                                .primaryCurrencySymbol("\$")
                                .title("demo@firefly")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("user_groups")
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

        assertThat(userGroupListResponse.data())
            .containsExactly(
                UserGroupRead.builder()
                    .id("2")
                    .attributes(
                        UserGroupRead.Attributes.builder()
                            .canSeeMembers(true)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .inUse(false)
                            .addMember(
                                UserGroupRead.Attributes.Member.builder()
                                    .addRole(UserGroupRead.Attributes.Member.Role.RO)
                                    .userEmail("james@firefly-iii.org")
                                    .userId("5")
                                    .you(false)
                                    .build()
                            )
                            .primaryCurrencyCode("EUR")
                            .primaryCurrencyDecimalPlaces(2)
                            .primaryCurrencyId("12")
                            .primaryCurrencySymbol("\$")
                            .title("demo@firefly")
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("user_groups")
                    .build()
            )
        assertThat(userGroupListResponse.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(userGroupListResponse.meta())
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
        val userGroupListResponse =
            UserGroupListResponse.builder()
                .addData(
                    UserGroupRead.builder()
                        .id("2")
                        .attributes(
                            UserGroupRead.Attributes.builder()
                                .canSeeMembers(true)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .inUse(false)
                                .addMember(
                                    UserGroupRead.Attributes.Member.builder()
                                        .addRole(UserGroupRead.Attributes.Member.Role.RO)
                                        .userEmail("james@firefly-iii.org")
                                        .userId("5")
                                        .you(false)
                                        .build()
                                )
                                .primaryCurrencyCode("EUR")
                                .primaryCurrencyDecimalPlaces(2)
                                .primaryCurrencyId("12")
                                .primaryCurrencySymbol("\$")
                                .title("demo@firefly")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("user_groups")
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

        val roundtrippedUserGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userGroupListResponse),
                jacksonTypeRef<UserGroupListResponse>(),
            )

        assertThat(roundtrippedUserGroupListResponse).isEqualTo(userGroupListResponse)
    }
}
