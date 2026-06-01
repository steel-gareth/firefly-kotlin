// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.users.User
import com.configure_me_emcees_prod_testing_5.api.models.users.UserCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserListParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val userServiceAsync = client.users()

        val userSingle =
            userServiceAsync.create(
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
    suspend fun retrieve() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val userServiceAsync = client.users()

        val userSingle =
            userServiceAsync.retrieve(
                UserRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val userServiceAsync = client.users()

        val userSingle =
            userServiceAsync.update(
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
    suspend fun list() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val userServiceAsync = client.users()

        val users =
            userServiceAsync.list(
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
    suspend fun delete() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val userServiceAsync = client.users()

        userServiceAsync.delete(
            UserDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
