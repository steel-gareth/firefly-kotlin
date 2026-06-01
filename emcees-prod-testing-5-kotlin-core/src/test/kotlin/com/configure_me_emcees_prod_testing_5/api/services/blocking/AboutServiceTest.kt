// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveInfoParams
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveUserParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AboutServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveInfo() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val aboutService = client.about()

        val response =
            aboutService.retrieveInfo(
                AboutRetrieveInfoParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveUser() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val aboutService = client.about()

        val userSingle =
            aboutService.retrieveUser(
                AboutRetrieveUserParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userSingle.validate()
    }
}
