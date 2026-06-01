// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.webhooks

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.webhooks.messages.MessageDeleteParams
import com.firefly.api.models.webhooks.messages.MessageListParams
import com.firefly.api.models.webhooks.messages.MessageRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val messageServiceAsync = client.webhooks().messages()

        val message =
            messageServiceAsync.retrieve(
                MessageRetrieveParams.builder()
                    .id("123")
                    .messageId(1L)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val messageServiceAsync = client.webhooks().messages()

        val messages =
            messageServiceAsync.list(
                MessageListParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        messages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val messageServiceAsync = client.webhooks().messages()

        messageServiceAsync.delete(
            MessageDeleteParams.builder()
                .id("123")
                .messageId(1L)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
