// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTest {

    @Test
    fun create() {
        val webhook =
            Webhook.builder()
                .id("2")
                .attributes(
                    Webhook.Attributes.builder()
                        .delivery(JsonValue.from(mapOf<String, Any>()))
                        .response(JsonValue.from(mapOf<String, Any>()))
                        .title("Update magic mirror on new transaction")
                        .trigger(JsonValue.from(mapOf<String, Any>()))
                        .url("https://example.com")
                        .active(false)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .addDelivery(WebhookDelivery.JSON)
                        .addResponse(WebhookResponse.TRANSACTIONS)
                        .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
                        .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                        .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("webhooks")
                .build()

        assertThat(webhook.id()).isEqualTo("2")
        assertThat(webhook.attributes())
            .isEqualTo(
                Webhook.Attributes.builder()
                    .delivery(JsonValue.from(mapOf<String, Any>()))
                    .response(JsonValue.from(mapOf<String, Any>()))
                    .title("Update magic mirror on new transaction")
                    .trigger(JsonValue.from(mapOf<String, Any>()))
                    .url("https://example.com")
                    .active(false)
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .addDelivery(WebhookDelivery.JSON)
                    .addResponse(WebhookResponse.TRANSACTIONS)
                    .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
                    .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                    .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(webhook.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(webhook.type()).isEqualTo("webhooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhook =
            Webhook.builder()
                .id("2")
                .attributes(
                    Webhook.Attributes.builder()
                        .delivery(JsonValue.from(mapOf<String, Any>()))
                        .response(JsonValue.from(mapOf<String, Any>()))
                        .title("Update magic mirror on new transaction")
                        .trigger(JsonValue.from(mapOf<String, Any>()))
                        .url("https://example.com")
                        .active(false)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .addDelivery(WebhookDelivery.JSON)
                        .addResponse(WebhookResponse.TRANSACTIONS)
                        .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
                        .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                        .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("webhooks")
                .build()

        val roundtrippedWebhook =
            jsonMapper.readValue(jsonMapper.writeValueAsString(webhook), jacksonTypeRef<Webhook>())

        assertThat(roundtrippedWebhook).isEqualTo(webhook)
    }
}
