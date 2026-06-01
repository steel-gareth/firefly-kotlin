// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.preferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceReadTest {

    @Test
    fun create() {
        val preferenceRead =
            PreferenceRead.builder()
                .id("2")
                .attributes(
                    Preference.builder()
                        .data(true)
                        .name("currencyPreference")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("preferences")
                .build()

        assertThat(preferenceRead.id()).isEqualTo("2")
        assertThat(preferenceRead.attributes())
            .isEqualTo(
                Preference.builder()
                    .data(true)
                    .name("currencyPreference")
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(preferenceRead.type()).isEqualTo("preferences")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceRead =
            PreferenceRead.builder()
                .id("2")
                .attributes(
                    Preference.builder()
                        .data(true)
                        .name("currencyPreference")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("preferences")
                .build()

        val roundtrippedPreferenceRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceRead),
                jacksonTypeRef<PreferenceRead>(),
            )

        assertThat(roundtrippedPreferenceRead).isEqualTo(preferenceRead)
    }
}
