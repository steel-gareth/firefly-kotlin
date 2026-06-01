// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.chart

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.AccountRetrieveOverviewParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveOverview() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.chart().account()

        val chartDataSets =
            accountServiceAsync.retrieveOverview(
                AccountRetrieveOverviewParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .period(AccountRetrieveOverviewParams.Period._1_M)
                    .preselected(AccountRetrieveOverviewParams.Preselected.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        chartDataSets.forEach { it.validate() }
    }
}
