// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.preferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSingleTest {

    @Test
    fun create() {
        val preferenceSingle =
            PreferenceSingle.builder()
                .data(
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
                )
                .build()

        assertThat(preferenceSingle.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceSingle =
            PreferenceSingle.builder()
                .data(
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
                )
                .build()

        val roundtrippedPreferenceSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceSingle),
                jacksonTypeRef<PreferenceSingle>(),
            )

        assertThat(roundtrippedPreferenceSingle).isEqualTo(preferenceSingle)
    }
}
