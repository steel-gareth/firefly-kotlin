// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.chart

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.chart.balance.BalanceRetrieveBalanceParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveBalance() {
        val client = FireflyOkHttpClient.fromEnv()
        val balanceService = client.chart().balance()

        val chartDataSets =
            balanceService.retrieveBalance(
                BalanceRetrieveBalanceParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .accounts(listOf(1L, 2L, 3L))
                    .period(BalanceRetrieveBalanceParams.Period._1_M)
                    .preselected(BalanceRetrieveBalanceParams.Preselected.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        chartDataSets.forEach { it.validate() }
    }
}
