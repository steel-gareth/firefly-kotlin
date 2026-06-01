// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.budgets

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.models.accounts.TransactionTypeFilter
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetListTransactionsParamsTest {

    @Test
    fun create() {
        BudgetListTransactionsParams.builder()
            .id("123")
            .end(LocalDate.parse("2026-04-30"))
            .limit(10)
            .page(1)
            .start(LocalDate.parse("2026-04-01"))
            .type(TransactionTypeFilter.ALL)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BudgetListTransactionsParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            BudgetListTransactionsParams.builder()
                .id("123")
                .end(LocalDate.parse("2026-04-30"))
                .limit(10)
                .page(1)
                .start(LocalDate.parse("2026-04-01"))
                .type(TransactionTypeFilter.ALL)
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
        val params = BudgetListTransactionsParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            BudgetListTransactionsParams.builder()
                .id("123")
                .end(LocalDate.parse("2026-04-30"))
                .limit(10)
                .page(1)
                .start(LocalDate.parse("2026-04-01"))
                .type(TransactionTypeFilter.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end", "2026-04-30")
                    .put("limit", "10")
                    .put("page", "1")
                    .put("start", "2026-04-01")
                    .put("type", "all")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BudgetListTransactionsParams.builder().id("123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
