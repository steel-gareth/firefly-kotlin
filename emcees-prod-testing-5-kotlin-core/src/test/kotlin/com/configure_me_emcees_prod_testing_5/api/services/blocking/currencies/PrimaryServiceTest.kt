// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.currencies

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrimaryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
