// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CategoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
