// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.currencies

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.firefly.api.models.currencies.primary.PrimaryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrimaryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val primaryServiceAsync = client.currencies().primary()

        val currencySingle =
            primaryServiceAsync.retrieve(
                PrimaryRetrieveParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun makePrimary() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val primaryServiceAsync = client.currencies().primary()

        val currencySingle =
            primaryServiceAsync.makePrimary(
                PrimaryMakePrimaryParams.builder()
                    .code("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }
}
