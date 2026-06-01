// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.currencies

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrimaryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
