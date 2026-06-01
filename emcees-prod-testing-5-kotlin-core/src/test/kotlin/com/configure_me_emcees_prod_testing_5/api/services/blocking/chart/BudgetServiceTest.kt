// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.chart

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.chart.budget.BudgetRetrieveOverviewParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveOverview() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val budgetService = client.chart().budget()

        val chartDataSets =
            budgetService.retrieveOverview(
                BudgetRetrieveOverviewParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        chartDataSets.forEach { it.validate() }
    }
}
