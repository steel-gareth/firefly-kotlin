// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.usergroups

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGroupReadTest {

    @Test
    fun create() {
        val userGroupRead =
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

        assertThat(userGroupRead.id()).isEqualTo("2")
        assertThat(userGroupRead.attributes())
            .isEqualTo(
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
        assertThat(userGroupRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(userGroupRead.type()).isEqualTo("user_groups")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userGroupRead =
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

        val roundtrippedUserGroupRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userGroupRead),
                jacksonTypeRef<UserGroupRead>(),
            )

        assertThat(roundtrippedUserGroupRead).isEqualTo(userGroupRead)
    }
}
