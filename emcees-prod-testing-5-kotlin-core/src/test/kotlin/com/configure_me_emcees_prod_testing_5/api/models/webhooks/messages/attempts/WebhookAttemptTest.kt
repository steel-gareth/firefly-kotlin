// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookAttemptTest {

    @Test
    fun create() {
        val webhookAttempt =
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

        assertThat(webhookAttempt.id()).isEqualTo("2")
        assertThat(webhookAttempt.attributes())
            .isEqualTo(
                WebhookAttempt.Attributes.builder()
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .logs("Page not found")
                    .response("Page not found")
                    .statusCode(404)
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .webhookMessageId("5")
                    .build()
            )
        assertThat(webhookAttempt.type()).isEqualTo("webhook_attempts")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookAttempt =
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

        val roundtrippedWebhookAttempt =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookAttempt),
                jacksonTypeRef<WebhookAttempt>(),
            )

        assertThat(roundtrippedWebhookAttempt).isEqualTo(webhookAttempt)
    }
}
