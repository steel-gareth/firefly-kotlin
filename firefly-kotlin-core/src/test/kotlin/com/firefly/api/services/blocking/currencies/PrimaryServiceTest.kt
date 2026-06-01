// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.currencies

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.firefly.api.models.currencies.primary.PrimaryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrimaryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val primaryService = client.currencies().primary()

        val currencySingle =
            primaryService.retrieve(
                PrimaryRetrieveParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun makePrimary() {
        val client = FireflyOkHttpClient.fromEnv()
        val primaryService = client.currencies().primary()

        val currencySingle =
            primaryService.makePrimary(
                PrimaryMakePrimaryParams.builder()
                    .code("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }
}
