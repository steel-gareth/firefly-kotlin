// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.data.DataDestroyParams
import com.firefly.api.models.data.DataPurgeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun destroy() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val dataServiceAsync = client.data()

        dataServiceAsync.destroy(
            DataDestroyParams.builder()
                .objects(DataDestroyParams.Objects.NOT_ASSETS_LIABILITIES)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun purge() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val dataServiceAsync = client.data()

        dataServiceAsync.purge(
            DataPurgeParams.builder().xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
        )
    }
}
