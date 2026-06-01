// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.transactionjournals.TransactionJournalDeleteParams
import com.firefly.api.models.transactionjournals.TransactionJournalListLinksParams
import com.firefly.api.models.transactionjournals.TransactionJournalRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionJournalServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionJournalService = client.transactionJournals()

        val transactionSingle =
            transactionJournalService.retrieve(
                TransactionJournalRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionJournalService = client.transactionJournals()

        transactionJournalService.delete(
            TransactionJournalDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLinks() {
        val client = FireflyOkHttpClient.fromEnv()
        val transactionJournalService = client.transactionJournals()

        val transactionLinkArray =
            transactionJournalService.listLinks(
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
