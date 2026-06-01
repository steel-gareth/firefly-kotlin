// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.configuration

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationTest {

    @Test
    fun create() {
        val configuration =
            Configuration.builder()
                .editable(true)
                .title(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                .value(true)
                .build()

        assertThat(configuration.editable()).isEqualTo(true)
        assertThat(configuration.title()).isEqualTo(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
        assertThat(configuration.value()).isEqualTo(PolymorphicProperty.ofBoolean(true))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configuration =
            Configuration.builder()
                .editable(true)
                .title(ConfigValueFilter.CONFIGURATION_IS_DEMO_SITE)
                .value(true)
                .build()

        val roundtrippedConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configuration),
                jacksonTypeRef<Configuration>(),
            )

        assertThat(roundtrippedConfiguration).isEqualTo(configuration)
    }
}
