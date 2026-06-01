// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookMessageTest {

    @Test
    fun create() {
        val webhookMessage =
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

        assertThat(webhookMessage.id()).isEqualTo("2")
        assertThat(webhookMessage.attributes())
            .isEqualTo(
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
        assertThat(webhookMessage.type()).isEqualTo("webhook_messages")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookMessage =
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

        val roundtrippedWebhookMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookMessage),
                jacksonTypeRef<WebhookMessage>(),
            )

        assertThat(roundtrippedWebhookMessage).isEqualTo(webhookMessage)
    }
}
