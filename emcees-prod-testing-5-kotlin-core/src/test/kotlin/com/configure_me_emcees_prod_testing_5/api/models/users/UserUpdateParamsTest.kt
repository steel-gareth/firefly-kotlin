// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.users

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            UserUpdateParams.builder()
                .id("123")
                .user(User.builder().email("james@firefly-iii.org").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder()
                .id("123")
                .user(User.builder().email("james@firefly-iii.org").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                User.builder()
                    .email("james@firefly-iii.org")
                    .blocked(false)
                    .blockedCode(User.BlockedCode.EMAIL_CHANGED)
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .role(User.Role.OWNER)
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder()
                .id("123")
                .user(User.builder().email("james@firefly-iii.org").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(User.builder().email("james@firefly-iii.org").build())
    }
}
