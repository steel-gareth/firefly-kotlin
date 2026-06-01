// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.currencies

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyListBudgetLimitsParamsTest {

    @Test
    fun create() {
        CurrencyListBudgetLimitsParams.builder()
            .code("USD")
            .end(LocalDate.parse("2026-04-30"))
            .limit(10)
            .page(1)
            .start(LocalDate.parse("2026-04-01"))
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CurrencyListBudgetLimitsParams.builder().code("USD").build()

        assertThat(params._pathParam(0)).isEqualTo("USD")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CurrencyListBudgetLimitsParams.builder()
                .code("USD")
                .end(LocalDate.parse("2026-04-30"))
                .limit(10)
                .page(1)
                .start(LocalDate.parse("2026-04-01"))
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
        val params = CurrencyListBudgetLimitsParams.builder().code("USD").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CurrencyListBudgetLimitsParams.builder()
                .code("USD")
                .end(LocalDate.parse("2026-04-30"))
                .limit(10)
                .page(1)
                .start(LocalDate.parse("2026-04-01"))
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
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CurrencyListBudgetLimitsParams.builder().code("USD").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
