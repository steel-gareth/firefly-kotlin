// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.chart.balance

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveBalanceParamsTest {

    @Test
    fun create() {
        BalanceRetrieveBalanceParams.builder()
            .end(LocalDate.parse("2019-12-27"))
            .start(LocalDate.parse("2019-12-27"))
            .accounts(listOf(1L, 2L, 3L))
            .period(BalanceRetrieveBalanceParams.Period._1_M)
            .preselected(BalanceRetrieveBalanceParams.Preselected.ALL)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun headers() {
        val params =
            BalanceRetrieveBalanceParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .accounts(listOf(1L, 2L, 3L))
                .period(BalanceRetrieveBalanceParams.Period._1_M)
                .preselected(BalanceRetrieveBalanceParams.Preselected.ALL)
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
        val params =
            BalanceRetrieveBalanceParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            BalanceRetrieveBalanceParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .accounts(listOf(1L, 2L, 3L))
                .period(BalanceRetrieveBalanceParams.Period._1_M)
                .preselected(BalanceRetrieveBalanceParams.Preselected.ALL)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end", "2019-12-27")
                    .put("start", "2019-12-27")
                    .put("accounts", listOf("1", "2", "3").joinToString(","))
                    .put("period", "1M")
                    .put("preselected", "all")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceRetrieveBalanceParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("end", "2019-12-27").put("start", "2019-12-27").build()
            )
    }
}
