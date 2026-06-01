// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.users.User
import com.firefly.api.models.users.UserCreateParams
import com.firefly.api.models.users.UserDeleteParams
import com.firefly.api.models.users.UserListParams
import com.firefly.api.models.users.UserRetrieveParams
import com.firefly.api.models.users.UserUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val userService = client.users()

        val userSingle =
            userService.create(
                UserCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .user(
                        User.builder()
                            .email("james@firefly-iii.org")
                            .blocked(false)
                            .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .role(User.Role.OWNER)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .build()
            )

        userSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val userService = client.users()

        val userSingle =
            userService.retrieve(
                UserRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val userService = client.users()

        val userSingle =
            userService.update(
                UserUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .user(
                        User.builder()
                            .email("james@firefly-iii.org")
                            .blocked(false)
                            .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .role(User.Role.OWNER)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .build()
            )

        userSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val userService = client.users()

        val users =
            userService.list(
                UserListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        users.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val userService = client.users()

        userService.delete(
            UserDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
