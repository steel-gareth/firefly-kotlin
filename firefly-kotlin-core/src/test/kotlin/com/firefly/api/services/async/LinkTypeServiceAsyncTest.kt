// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.linktypes.LinkType
import com.firefly.api.models.linktypes.LinkTypeCreateParams
import com.firefly.api.models.linktypes.LinkTypeDeleteParams
import com.firefly.api.models.linktypes.LinkTypeListParams
import com.firefly.api.models.linktypes.LinkTypeListTransactionsParams
import com.firefly.api.models.linktypes.LinkTypeRetrieveParams
import com.firefly.api.models.linktypes.LinkTypeUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LinkTypeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val linkTypeServiceAsync = client.linkTypes()

        val linkTypeSingle =
            linkTypeServiceAsync.create(
                LinkTypeCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .linkType(
                        LinkType.builder()
                            .inward("is (partially) paid for by")
                            .name("Paid")
                            .outward("(partially) pays for")
                            .editable(false)
                            .build()
                    )
                    .build()
            )

        linkTypeSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val linkTypeServiceAsync = client.linkTypes()

        val linkTypeSingle =
            linkTypeServiceAsync.retrieve(
                LinkTypeRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        linkTypeSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val linkTypeServiceAsync = client.linkTypes()

        val linkTypeSingle =
            linkTypeServiceAsync.update(
                LinkTypeUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .inward("is (partially) paid for by")
                    .name("Paid")
                    .outward("(partially) pays for")
                    .build()
            )

        linkTypeSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val linkTypeServiceAsync = client.linkTypes()

        val linkTypes =
            linkTypeServiceAsync.list(
                LinkTypeListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        linkTypes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val linkTypeServiceAsync = client.linkTypes()

        linkTypeServiceAsync.delete(
            LinkTypeDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val linkTypeServiceAsync = client.linkTypes()

        val transactionArray =
            linkTypeServiceAsync.listTransactions(
                LinkTypeListTransactionsParams.builder()
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
