// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveInfoParams
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveUserParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AboutServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val aboutServiceAsync = client.about()

        val response =
            aboutServiceAsync.retrieveInfo(
                AboutRetrieveInfoParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveUser() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val aboutServiceAsync = client.about()

        val userSingle =
            aboutServiceAsync.retrieveUser(
                AboutRetrieveUserParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userSingle.validate()
    }
}
