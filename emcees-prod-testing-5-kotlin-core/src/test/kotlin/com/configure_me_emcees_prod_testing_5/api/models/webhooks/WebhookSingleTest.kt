// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSingleTest {

    @Test
    fun create() {
        val webhookSingle =
            WebhookSingle.builder()
                .data(
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
                )
                .build()

        assertThat(webhookSingle.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookSingle =
            WebhookSingle.builder()
                .data(
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
                )
                .build()

        val roundtrippedWebhookSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookSingle),
                jacksonTypeRef<WebhookSingle>(),
            )

        assertThat(roundtrippedWebhookSingle).isEqualTo(webhookSingle)
    }
}
