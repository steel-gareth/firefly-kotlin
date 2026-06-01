// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.about.AboutRetrieveInfoParams
import com.firefly.api.models.about.AboutRetrieveUserParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AboutServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client = FireflyOkHttpClientAsync.fromEnv()
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
        val client = FireflyOkHttpClientAsync.fromEnv()
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
