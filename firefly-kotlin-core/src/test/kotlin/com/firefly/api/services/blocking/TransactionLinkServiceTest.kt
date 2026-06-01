// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.transactionlinks.TransactionLinkCreateParams
import com.firefly.api.models.transactionlinks.TransactionLinkDeleteParams
import com.firefly.api.models.transactionlinks.TransactionLinkListParams
import com.firefly.api.models.transactionlinks.TransactionLinkRetrieveParams
import com.firefly.api.models.transactionlinks.TransactionLinkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionLinkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionLinkService = client.transactionLinks()

        val transactionLinkSingle =
            transactionLinkService.create(
                TransactionLinkCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .inwardId("131")
                    .linkTypeId("5")
                    .outwardId("131")
                    .linkTypeName("Is paid by")
                    .notes("Some example notes")
                    .build()
            )

        transactionLinkSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionLinkService = client.transactionLinks()

        val transactionLinkSingle =
            transactionLinkService.retrieve(
                TransactionLinkRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionLinkSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionLinkService = client.transactionLinks()

        val transactionLinkSingle =
            transactionLinkService.update(
                TransactionLinkUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .inwardId("131")
                    .linkTypeId("5")
                    .linkTypeName("Is paid by")
                    .notes("Some example notes")
                    .outwardId("131")
                    .build()
            )

        transactionLinkSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionLinkService = client.transactionLinks()

        val transactionLinkArray =
            transactionLinkService.list(
                TransactionLinkListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionLinkArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionLinkService = client.transactionLinks()

        transactionLinkService.delete(
            TransactionLinkDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
