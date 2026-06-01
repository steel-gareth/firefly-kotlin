// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.webhooks.messages.attempts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.accounts.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttemptListResponseTest {

    @Test
    fun create() {
        val attemptListResponse =
            AttemptListResponse.builder()
                .addData(
                    WebhookAttempt.builder()
                        .id("2")
                        .attributes(
                            WebhookAttempt.Attributes.builder()
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .logs("Page not found")
                                .response("Page not found")
                                .statusCode(404)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .webhookMessageId("5")
                                .build()
                        )
                        .type("webhook_attempts")
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

        assertThat(attemptListResponse.data())
            .containsExactly(
                WebhookAttempt.builder()
                    .id("2")
                    .attributes(
                        WebhookAttempt.Attributes.builder()
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .logs("Page not found")
                            .response("Page not found")
                            .statusCode(404)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .webhookMessageId("5")
                            .build()
                    )
                    .type("webhook_attempts")
                    .build()
            )
        assertThat(attemptListResponse.meta())
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
        val attemptListResponse =
            AttemptListResponse.builder()
                .addData(
                    WebhookAttempt.builder()
                        .id("2")
                        .attributes(
                            WebhookAttempt.Attributes.builder()
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .logs("Page not found")
                                .response("Page not found")
                                .statusCode(404)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .webhookMessageId("5")
                                .build()
                        )
                        .type("webhook_attempts")
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

        val roundtrippedAttemptListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attemptListResponse),
                jacksonTypeRef<AttemptListResponse>(),
            )

        assertThat(roundtrippedAttemptListResponse).isEqualTo(attemptListResponse)
    }
}
