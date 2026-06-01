// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkType
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeListParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LinkTypeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val linkTypeService = client.linkTypes()

        val linkTypeSingle =
            linkTypeService.create(
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
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val linkTypeService = client.linkTypes()

        val linkTypeSingle =
            linkTypeService.retrieve(
                LinkTypeRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        linkTypeSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val linkTypeService = client.linkTypes()

        val linkTypeSingle =
            linkTypeService.update(
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
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val linkTypeService = client.linkTypes()

        val linkTypes =
            linkTypeService.list(
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
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val linkTypeService = client.linkTypes()

        linkTypeService.delete(
            LinkTypeDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val linkTypeService = client.linkTypes()

        val transactionArray =
            linkTypeService.listTransactions(
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
