// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
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

internal class CategoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        val categorySingle =
            categoryService.create(
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
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        val categorySingle =
            categoryService.retrieve(
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
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        val categorySingle =
            categoryService.update(
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
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        val categories =
            categoryService.list(
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
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        categoryService.delete(
            CategoryDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        val attachmentArray =
            categoryService.listAttachments(
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
    fun listTransactions() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val categoryService = client.categories()

        val transactionArray =
            categoryService.listTransactions(
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
