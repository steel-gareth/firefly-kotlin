// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.configuration.ConfigValueFilter
import com.firefly.api.models.configuration.ConfigurationRetrieveParams
import com.firefly.api.models.configuration.ConfigurationRetrieveValueParams
import com.firefly.api.models.configuration.ConfigurationUpdateValueParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val configurationServiceAsync = client.configuration()

        val configurations =
            configurationServiceAsync.retrieve(
                ConfigurationRetrieveParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        configurations.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveValue() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val configurationServiceAsync = client.configuration()

        val configurationSingle =
            configurationServiceAsync.retrieveValue(
                ConfigurationRetrieveValueParams.builder()
                    .name(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        configurationSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateValue() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val configurationServiceAsync = client.configuration()

        val configurationSingle =
            configurationServiceAsync.updateValue(
                ConfigurationUpdateValueParams.builder()
                    .name(ConfigurationUpdateValueParams.Name.CONFIGURATION_IS_DEMO_SITE)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .value(true)
                    .build()
            )

        configurationSingle.validate()
    }
}
