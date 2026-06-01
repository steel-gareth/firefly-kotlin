// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.transactionjournals.TransactionJournalDeleteParams
import com.firefly.api.models.transactionjournals.TransactionJournalListLinksParams
import com.firefly.api.models.transactionjournals.TransactionJournalRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionJournalServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionJournalServiceAsync = client.transactionJournals()

        val transactionSingle =
            transactionJournalServiceAsync.retrieve(
                TransactionJournalRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionJournalServiceAsync = client.transactionJournals()

        transactionJournalServiceAsync.delete(
            TransactionJournalDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listLinks() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val transactionJournalServiceAsync = client.transactionJournals()

        val transactionLinkArray =
            transactionJournalServiceAsync.listLinks(
                TransactionJournalListLinksParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionLinkArray.validate()
    }
}
