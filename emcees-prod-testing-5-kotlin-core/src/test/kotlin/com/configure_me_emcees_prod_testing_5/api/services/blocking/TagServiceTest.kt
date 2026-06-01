// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagListParams
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.tags.TagUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        val tagSingle =
            tagService.create(
                TagCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .tag("expensive")
                    .date(LocalDate.parse("2026-04-01"))
                    .description("Tag for expensive stuff")
                    .latitude(51.983333)
                    .longitude(5.916667)
                    .zoomLevel(6)
                    .build()
            )

        tagSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        val tagSingle =
            tagService.retrieve(
                TagRetrieveParams.builder()
                    .tag("groceries")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        tagSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        val tagSingle =
            tagService.update(
                TagUpdateParams.builder()
                    .pathTag("groceries")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .date(LocalDate.parse("2026-04-01"))
                    .description("Tag for expensive stuff")
                    .latitude(51.983333)
                    .longitude(5.916667)
                    .bodyTag("expensive")
                    .zoomLevel(6)
                    .build()
            )

        tagSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        val tags =
            tagService.list(
                TagListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        tags.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        tagService.delete(
            TagDeleteParams.builder()
                .tag("groceries")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        val attachmentArray =
            tagService.listAttachments(
                TagListAttachmentsParams.builder()
                    .tag("groceries")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attachmentArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val tagService = client.tags()

        val transactionArray =
            tagService.listTransactions(
                TagListTransactionsParams.builder()
                    .tag("groceries")
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .type(TransactionTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
