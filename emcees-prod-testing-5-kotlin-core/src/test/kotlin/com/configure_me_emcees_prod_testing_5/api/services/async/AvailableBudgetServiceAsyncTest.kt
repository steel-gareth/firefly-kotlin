// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.AvailableBudgetListParams
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.AvailableBudgetRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AvailableBudgetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val availableBudgetServiceAsync = client.availableBudgets()

        val availableBudget =
            availableBudgetServiceAsync.retrieve(
                AvailableBudgetRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        availableBudget.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val availableBudgetServiceAsync = client.availableBudgets()

        val availableBudgetArray =
            availableBudgetServiceAsync.list(
                AvailableBudgetListParams.builder()
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        availableBudgetArray.validate()
    }
}
