// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttemptRetrieveResponseTest {

    @Test
    fun create() {
        val attemptRetrieveResponse =
            AttemptRetrieveResponse.builder()
                .data(
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
                .build()

        assertThat(attemptRetrieveResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attemptRetrieveResponse =
            AttemptRetrieveResponse.builder()
                .data(
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
                .build()

        val roundtrippedAttemptRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attemptRetrieveResponse),
                jacksonTypeRef<AttemptRetrieveResponse>(),
            )

        assertThat(roundtrippedAttemptRetrieveResponse).isEqualTo(attemptRetrieveResponse)
    }
}
