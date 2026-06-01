// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.webhooks.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveResponseTest {

    @Test
    fun create() {
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .data(
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
                .build()

        assertThat(messageRetrieveResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .data(
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
                .build()

        val roundtrippedMessageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRetrieveResponse),
                jacksonTypeRef<MessageRetrieveResponse>(),
            )

        assertThat(roundtrippedMessageRetrieveResponse).isEqualTo(messageRetrieveResponse)
    }
}
