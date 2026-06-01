// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.webhooks.messages

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AttemptServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attemptService = client.webhooks().messages().attempts()

        val attempt =
            attemptService.retrieve(
                AttemptRetrieveParams.builder()
                    .id("123")
                    .messageId(1L)
                    .attemptId(1L)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attempt.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attemptService = client.webhooks().messages().attempts()

        val attempts =
            attemptService.list(
                AttemptListParams.builder()
                    .id("123")
                    .messageId(1L)
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attempts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attemptService = client.webhooks().messages().attempts()

        attemptService.delete(
            AttemptDeleteParams.builder()
                .id("123")
                .messageId(1L)
                .attemptId(1L)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
