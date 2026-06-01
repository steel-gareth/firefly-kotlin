// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.configuration

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
