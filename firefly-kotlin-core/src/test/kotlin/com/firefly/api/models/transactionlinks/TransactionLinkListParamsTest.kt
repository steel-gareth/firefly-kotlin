// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.transactionlinks

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLinkListParamsTest {

    @Test
    fun create() {
        TransactionLinkListParams.builder()
            .limit(10)
            .page(1)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun headers() {
        val params =
            TransactionLinkListParams.builder()
                .limit(10)
                .page(1)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TransactionLinkListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            TransactionLinkListParams.builder()
                .limit(10)
                .page(1)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("page", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionLinkListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
