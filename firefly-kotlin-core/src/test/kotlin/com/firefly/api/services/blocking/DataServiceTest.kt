// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.data.DataDestroyParams
import com.firefly.api.models.data.DataPurgeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun destroy() {
        val client = FireflyOkHttpClient.fromEnv()
        val dataService = client.data()

        dataService.destroy(
            DataDestroyParams.builder()
                .objects(DataDestroyParams.Objects.NOT_ASSETS_LIABILITIES)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun purge() {
        val client = FireflyOkHttpClient.fromEnv()
        val dataService = client.data()

        dataService.purge(
            DataPurgeParams.builder().xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
        )
    }
}
