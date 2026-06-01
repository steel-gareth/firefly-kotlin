// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.webhooks.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.accounts.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListResponseTest {

    @Test
    fun create() {
        val messageListResponse =
            MessageListResponse.builder()
                .addData(
                    WebhookMessage.builder()
                        .id("2")
                        .attributes(
                            WebhookMessage.Attributes.builder()
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .errored(false)
                                .message("{some:message}")
                                .sent(false)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .uuid("7a344c02-5b52-46b1-90e6-a437431dcf07")
                                .webhookId("5")
                                .build()
                        )
                        .type("webhook_messages")
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

        assertThat(messageListResponse.data())
            .containsExactly(
                WebhookMessage.builder()
                    .id("2")
                    .attributes(
                        WebhookMessage.Attributes.builder()
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .errored(false)
                            .message("{some:message}")
                            .sent(false)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .uuid("7a344c02-5b52-46b1-90e6-a437431dcf07")
                            .webhookId("5")
                            .build()
                    )
                    .type("webhook_messages")
                    .build()
            )
        assertThat(messageListResponse.meta())
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
        val messageListResponse =
            MessageListResponse.builder()
                .addData(
                    WebhookMessage.builder()
                        .id("2")
                        .attributes(
                            WebhookMessage.Attributes.builder()
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .errored(false)
                                .message("{some:message}")
                                .sent(false)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .uuid("7a344c02-5b52-46b1-90e6-a437431dcf07")
                                .webhookId("5")
                                .build()
                        )
                        .type("webhook_messages")
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

        val roundtrippedMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListResponse),
                jacksonTypeRef<MessageListResponse>(),
            )

        assertThat(roundtrippedMessageListResponse).isEqualTo(messageListResponse)
    }
}
