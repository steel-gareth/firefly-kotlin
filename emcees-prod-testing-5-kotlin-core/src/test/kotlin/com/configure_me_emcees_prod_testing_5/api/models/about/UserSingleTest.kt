// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.about

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.configure_me_emcees_prod_testing_5.api.models.users.User
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserSingleTest {

    @Test
    fun create() {
        val userSingle =
            UserSingle.builder()
                .data(
                    UserRead.builder()
                        .id("2")
                        .attributes(
                            User.builder()
                                .email("james@firefly-iii.org")
                                .blocked(false)
                                .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .role(User.Role.OWNER)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("users")
                        .build()
                )
                .build()

        assertThat(userSingle.data())
            .isEqualTo(
                UserRead.builder()
                    .id("2")
                    .attributes(
                        User.builder()
                            .email("james@firefly-iii.org")
                            .blocked(false)
                            .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .role(User.Role.OWNER)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("users")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userSingle =
            UserSingle.builder()
                .data(
                    UserRead.builder()
                        .id("2")
                        .attributes(
                            User.builder()
                                .email("james@firefly-iii.org")
                                .blocked(false)
                                .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .role(User.Role.OWNER)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("users")
                        .build()
                )
                .build()

        val roundtrippedUserSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userSingle),
                jacksonTypeRef<UserSingle>(),
            )

        assertThat(roundtrippedUserSingle).isEqualTo(userSingle)
    }
}
