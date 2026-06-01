// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.transactionlinks

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLinkCreateParamsTest {

    @Test
    fun create() {
        TransactionLinkCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .inwardId("131")
            .linkTypeId("5")
            .outwardId("131")
            .linkTypeName("Is paid by")
            .notes("Some example notes")
            .build()
    }

    @Test
    fun headers() {
        val params =
            TransactionLinkCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .inwardId("131")
                .linkTypeId("5")
                .outwardId("131")
                .linkTypeName("Is paid by")
                .notes("Some example notes")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            TransactionLinkCreateParams.builder()
                .inwardId("131")
                .linkTypeId("5")
                .outwardId("131")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TransactionLinkCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .inwardId("131")
                .linkTypeId("5")
                .outwardId("131")
                .linkTypeName("Is paid by")
                .notes("Some example notes")
                .build()

        val body = params._body()

        assertThat(body.inwardId()).isEqualTo("131")
        assertThat(body.linkTypeId()).isEqualTo("5")
        assertThat(body.outwardId()).isEqualTo("131")
        assertThat(body.linkTypeName()).isEqualTo("Is paid by")
        assertThat(body.notes()).isEqualTo("Some example notes")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionLinkCreateParams.builder()
                .inwardId("131")
                .linkTypeId("5")
                .outwardId("131")
                .build()

        val body = params._body()

        assertThat(body.inwardId()).isEqualTo("131")
        assertThat(body.linkTypeId()).isEqualTo("5")
        assertThat(body.outwardId()).isEqualTo("131")
    }
}
