// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.preferences

import com.firefly.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceCreateParamsTest {

    @Test
    fun create() {
        PreferenceCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .preference(
                Preference.builder()
                    .data(true)
                    .name("currencyPreference")
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            PreferenceCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .preference(
                    Preference.builder()
                        .data(true)
                        .name("currencyPreference")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            PreferenceCreateParams.builder()
                .preference(Preference.builder().data(true).name("currencyPreference").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            PreferenceCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .preference(
                    Preference.builder()
                        .data(true)
                        .name("currencyPreference")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                Preference.builder()
                    .data(true)
                    .name("currencyPreference")
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PreferenceCreateParams.builder()
                .preference(Preference.builder().data(true).name("currencyPreference").build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(Preference.builder().data(true).name("currencyPreference").build())
    }
}
