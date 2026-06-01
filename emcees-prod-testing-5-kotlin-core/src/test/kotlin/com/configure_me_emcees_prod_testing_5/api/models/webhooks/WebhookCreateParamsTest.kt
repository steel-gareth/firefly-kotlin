// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .delivery(JsonValue.from(mapOf<String, Any>()))
            .response(JsonValue.from(mapOf<String, Any>()))
            .title("Update magic mirror on new transaction")
            .trigger(JsonValue.from(mapOf<String, Any>()))
            .url("https://example.com")
            .active(false)
            .addDelivery(WebhookDelivery.JSON)
            .addResponse(WebhookResponse.TRANSACTIONS)
            .addTrigger(WebhookTrigger.STORE_TRANSACTION)
            .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
            .build()
    }

    @Test
    fun headers() {
        val params =
            WebhookCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .delivery(JsonValue.from(mapOf<String, Any>()))
                .response(JsonValue.from(mapOf<String, Any>()))
                .title("Update magic mirror on new transaction")
                .trigger(JsonValue.from(mapOf<String, Any>()))
                .url("https://example.com")
                .active(false)
                .addDelivery(WebhookDelivery.JSON)
                .addResponse(WebhookResponse.TRANSACTIONS)
                .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
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
            WebhookCreateParams.builder()
                .delivery(JsonValue.from(mapOf<String, Any>()))
                .response(JsonValue.from(mapOf<String, Any>()))
                .title("Update magic mirror on new transaction")
                .trigger(JsonValue.from(mapOf<String, Any>()))
                .url("https://example.com")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .delivery(JsonValue.from(mapOf<String, Any>()))
                .response(JsonValue.from(mapOf<String, Any>()))
                .title("Update magic mirror on new transaction")
                .trigger(JsonValue.from(mapOf<String, Any>()))
                .url("https://example.com")
                .active(false)
                .addDelivery(WebhookDelivery.JSON)
                .addResponse(WebhookResponse.TRANSACTIONS)
                .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                .build()

        val body = params._body()

        assertThat(body._delivery()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._response()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.title()).isEqualTo("Update magic mirror on new transaction")
        assertThat(body._trigger()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.active()).isEqualTo(false)
        assertThat(body.deliveries()).containsExactly(WebhookDelivery.JSON)
        assertThat(body.responses()).containsExactly(WebhookResponse.TRANSACTIONS)
        assertThat(body.triggers())
            .containsExactly(WebhookTrigger.STORE_TRANSACTION, WebhookTrigger.UPDATE_TRANSACTION)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookCreateParams.builder()
                .delivery(JsonValue.from(mapOf<String, Any>()))
                .response(JsonValue.from(mapOf<String, Any>()))
                .title("Update magic mirror on new transaction")
                .trigger(JsonValue.from(mapOf<String, Any>()))
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body._delivery()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._response()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.title()).isEqualTo("Update magic mirror on new transaction")
        assertThat(body._trigger()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
