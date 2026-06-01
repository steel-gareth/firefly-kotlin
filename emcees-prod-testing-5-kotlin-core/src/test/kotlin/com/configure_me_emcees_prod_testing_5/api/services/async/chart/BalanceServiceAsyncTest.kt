// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.chart

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.chart.balance.BalanceRetrieveBalanceParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BalanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveBalance() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val balanceServiceAsync = client.chart().balance()

        val chartDataSets =
            balanceServiceAsync.retrieveBalance(
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
