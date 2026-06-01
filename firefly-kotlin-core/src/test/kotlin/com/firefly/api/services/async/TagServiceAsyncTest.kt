// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.tags.TagCreateParams
import com.firefly.api.models.tags.TagDeleteParams
import com.firefly.api.models.tags.TagListAttachmentsParams
import com.firefly.api.models.tags.TagListParams
import com.firefly.api.models.tags.TagListTransactionsParams
import com.firefly.api.models.tags.TagRetrieveParams
import com.firefly.api.models.tags.TagUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        val tagSingle =
            tagServiceAsync.create(
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
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        val tagSingle =
            tagServiceAsync.retrieve(
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
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        val tagSingle =
            tagServiceAsync.update(
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
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        val tags =
            tagServiceAsync.list(
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
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        tagServiceAsync.delete(
            TagDeleteParams.builder()
                .tag("groceries")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAttachments() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        val attachmentArray =
            tagServiceAsync.listAttachments(
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
    suspend fun listTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val tagServiceAsync = client.tags()

        val transactionArray =
            tagServiceAsync.listTransactions(
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
