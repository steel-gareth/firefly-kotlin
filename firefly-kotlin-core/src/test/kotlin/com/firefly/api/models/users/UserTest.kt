// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun create() {
        val user =
            User.builder()
                .email("james@firefly-iii.org")
                .blocked(false)
                .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .role(User.Role.OWNER)
                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .build()

        assertThat(user.email()).isEqualTo("james@firefly-iii.org")
        assertThat(user.blocked()).isEqualTo(false)
        assertThat(user.blockedCode()).isEqualTo(User.BlockedCode.EMAIL_CHANGED)
        assertThat(user.createdAt()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(user.role()).isEqualTo(User.Role.OWNER)
        assertThat(user.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
            User.builder()
                .email("james@firefly-iii.org")
                .blocked(false)
                .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .role(User.Role.OWNER)
                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
