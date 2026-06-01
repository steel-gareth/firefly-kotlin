// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.JsonValue
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.accounts.Meta
import com.firefly.api.models.accounts.PageLink
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListResponseTest {

    @Test
    fun create() {
        val webhookListResponse =
            WebhookListResponse.builder()
                .addData(
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
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
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

        assertThat(webhookListResponse.data())
            .containsExactly(
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
        assertThat(webhookListResponse.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(webhookListResponse.meta())
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
        val webhookListResponse =
            WebhookListResponse.builder()
                .addData(
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
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
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

        val roundtrippedWebhookListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListResponse),
                jacksonTypeRef<WebhookListResponse>(),
            )

        assertThat(roundtrippedWebhookListResponse).isEqualTo(webhookListResponse)
    }
}
