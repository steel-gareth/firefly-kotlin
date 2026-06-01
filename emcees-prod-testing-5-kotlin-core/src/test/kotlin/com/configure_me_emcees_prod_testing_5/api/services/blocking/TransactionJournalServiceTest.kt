// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalListLinksParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionJournalServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
