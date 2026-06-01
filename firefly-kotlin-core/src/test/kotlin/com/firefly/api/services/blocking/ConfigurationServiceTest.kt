// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.configuration.ConfigValueFilter
import com.firefly.api.models.configuration.ConfigurationRetrieveParams
import com.firefly.api.models.configuration.ConfigurationRetrieveValueParams
import com.firefly.api.models.configuration.ConfigurationUpdateValueParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val configurationService = client.configuration()

        val configurations =
            configurationService.retrieve(
                ConfigurationRetrieveParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        configurations.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveValue() {
        val client = FireflyOkHttpClient.fromEnv()
        val configurationService = client.configuration()

        val configurationSingle =
            configurationService.retrieveValue(
                ConfigurationRetrieveValueParams.builder()
                    .name(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        configurationSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateValue() {
        val client = FireflyOkHttpClient.fromEnv()
        val configurationService = client.configuration()

        val configurationSingle =
            configurationService.updateValue(
                ConfigurationUpdateValueParams.builder()
                    .name(ConfigurationUpdateValueParams.Name.CONFIGURATION_IS_DEMO_SITE)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .value(true)
                    .build()
            )

        configurationSingle.validate()
    }
}
