// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.transactionlinks.TransactionLinkCreateParams
import com.firefly.api.models.transactionlinks.TransactionLinkDeleteParams
import com.firefly.api.models.transactionlinks.TransactionLinkListParams
import com.firefly.api.models.transactionlinks.TransactionLinkRetrieveParams
import com.firefly.api.models.transactionlinks.TransactionLinkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionLinkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionLinkServiceAsync = client.transactionLinks()

        val transactionLinkSingle =
            transactionLinkServiceAsync.create(
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
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionLinkServiceAsync = client.transactionLinks()

        val transactionLinkSingle =
            transactionLinkServiceAsync.retrieve(
                TransactionLinkRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionLinkSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionLinkServiceAsync = client.transactionLinks()

        val transactionLinkSingle =
            transactionLinkServiceAsync.update(
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
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionLinkServiceAsync = client.transactionLinks()

        val transactionLinkArray =
            transactionLinkServiceAsync.list(
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
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionLinkServiceAsync = client.transactionLinks()

        transactionLinkServiceAsync.delete(
            TransactionLinkDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }
}
