// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetRetrieveParamsTest {

    @Test
    fun create() {
        BudgetRetrieveParams.builder()
            .id("123")
            .end(LocalDate.parse("2026-04-30"))
            .start(LocalDate.parse("2026-04-01"))
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BudgetRetrieveParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            BudgetRetrieveParams.builder()
                .id("123")
                .end(LocalDate.parse("2026-04-30"))
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
        val params = BudgetRetrieveParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            BudgetRetrieveParams.builder()
                .id("123")
                .end(LocalDate.parse("2026-04-30"))
                .start(LocalDate.parse("2026-04-01"))
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("end", "2026-04-30").put("start", "2026-04-01").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BudgetRetrieveParams.builder().id("123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
