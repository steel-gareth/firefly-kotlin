// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.preferences

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.configuration.PolymorphicProperty
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceTest {

    @Test
    fun create() {
        val preference =
            Preference.builder()
                .data(true)
                .name("currencyPreference")
                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .build()

        assertThat(preference.data()).isEqualTo(PolymorphicProperty.ofBoolean(true))
        assertThat(preference.name()).isEqualTo("currencyPreference")
        assertThat(preference.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(preference.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preference =
            Preference.builder()
                .data(true)
                .name("currencyPreference")
                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .build()

        val roundtrippedPreference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preference),
                jacksonTypeRef<Preference>(),
            )

        assertThat(roundtrippedPreference).isEqualTo(preference)
    }
}
