// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rulegroups

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleGroupTestTransactionsParamsTest {

    @Test
    fun create() {
        RuleGroupTestTransactionsParams.builder()
            .id("123")
            .accounts(listOf(1L, 2L, 3L))
            .end(LocalDate.parse("2026-04-30"))
            .limit(10)
            .page(1)
            .searchLimit(0L)
            .start(LocalDate.parse("2026-04-01"))
            .triggeredLimit(0L)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RuleGroupTestTransactionsParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            RuleGroupTestTransactionsParams.builder()
                .id("123")
                .accounts(listOf(1L, 2L, 3L))
                .end(LocalDate.parse("2026-04-30"))
                .limit(10)
                .page(1)
                .searchLimit(0L)
                .start(LocalDate.parse("2026-04-01"))
                .triggeredLimit(0L)
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
        val params = RuleGroupTestTransactionsParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            RuleGroupTestTransactionsParams.builder()
                .id("123")
                .accounts(listOf(1L, 2L, 3L))
                .end(LocalDate.parse("2026-04-30"))
                .limit(10)
                .page(1)
                .searchLimit(0L)
                .start(LocalDate.parse("2026-04-01"))
                .triggeredLimit(0L)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accounts", listOf("1", "2", "3").joinToString(","))
                    .put("end", "2026-04-30")
                    .put("limit", "10")
                    .put("page", "1")
                    .put("search_limit", "0")
                    .put("start", "2026-04-01")
                    .put("triggered_limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RuleGroupTestTransactionsParams.builder().id("123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
