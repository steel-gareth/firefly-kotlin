// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.categories.CategoryCreateParams
import com.firefly.api.models.categories.CategoryDeleteParams
import com.firefly.api.models.categories.CategoryListAttachmentsParams
import com.firefly.api.models.categories.CategoryListParams
import com.firefly.api.models.categories.CategoryListTransactionsParams
import com.firefly.api.models.categories.CategoryRetrieveParams
import com.firefly.api.models.categories.CategoryUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CategoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.categories()

        val categorySingle =
            categoryServiceAsync.create(
                CategoryCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .name("Lunch")
                    .notes("Some example notes")
                    .build()
            )

        categorySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.categories()

        val categorySingle =
            categoryServiceAsync.retrieve(
                CategoryRetrieveParams.builder()
                    .id("123")
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        categorySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.categories()

        val categorySingle =
            categoryServiceAsync.update(
                CategoryUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .name("Lunch")
                    .notes("Some example notes")
                    .build()
            )

        categorySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.categories()

        val categories =
            categoryServiceAsync.list(
                CategoryListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        categories.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.categories()

        categoryServiceAsync.delete(
            CategoryDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAttachments() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.categories()

        val attachmentArray =
            categoryServiceAsync.listAttachments(
                CategoryListAttachmentsParams.builder()
                    .id("123")
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
        val categoryServiceAsync = client.categories()

        val transactionArray =
            categoryServiceAsync.listTransactions(
                CategoryListTransactionsParams.builder()
                    .id("123")
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
