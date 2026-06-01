// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookDelivery
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookResponse
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookSubmitParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookTrigger
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookTriggerTransactionParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        val webhookSingle =
            webhookService.create(
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
            )

        webhookSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        val webhookSingle =
            webhookService.retrieve(
                WebhookRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        webhookSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        val webhookSingle =
            webhookService.update(
                WebhookUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .active(false)
                    .addDelivery(WebhookDelivery.JSON)
                    .addResponse(WebhookResponse.TRANSACTIONS)
                    .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
                    .title("Update magic mirror on new transaction")
                    .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                    .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                    .url("https://example.com")
                    .build()
            )

        webhookSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        val webhooks =
            webhookService.list(
                WebhookListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        webhookService.delete(
            WebhookDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        webhookService.submit(
            WebhookSubmitParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun triggerTransaction() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val webhookService = client.webhooks()

        webhookService.triggerTransaction(
            WebhookTriggerTransactionParams.builder()
                .id("123")
                .transactionId("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
