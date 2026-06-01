// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.configuration

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationSingleTest {

    @Test
    fun create() {
        val configurationSingle =
            ConfigurationSingle.builder()
                .data(
                    Configuration.builder()
                        .editable(true)
                        .title(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                        .value(true)
                        .build()
                )
                .build()

        assertThat(configurationSingle.data())
            .isEqualTo(
                Configuration.builder()
                    .editable(true)
                    .title(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                    .value(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationSingle =
            ConfigurationSingle.builder()
                .data(
                    Configuration.builder()
                        .editable(true)
                        .title(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                        .value(true)
                        .build()
                )
                .build()

        val roundtrippedConfigurationSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationSingle),
                jacksonTypeRef<ConfigurationSingle>(),
            )

        assertThat(roundtrippedConfigurationSingle).isEqualTo(configurationSingle)
    }
}
