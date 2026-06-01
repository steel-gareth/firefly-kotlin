// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.about.AboutRetrieveInfoParams
import com.firefly.api.models.about.AboutRetrieveUserParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AboutServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveInfo() {
        val client = FireflyOkHttpClient.fromEnv()
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
        val client = FireflyOkHttpClient.fromEnv()
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
