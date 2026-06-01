// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.chart

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.chart.category.CategoryRetrieveOverviewParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CategoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveOverview() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val categoryServiceAsync = client.chart().category()

        val chartDataSets =
            categoryServiceAsync.retrieveOverview(
                CategoryRetrieveOverviewParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        chartDataSets.forEach { it.validate() }
    }
}
