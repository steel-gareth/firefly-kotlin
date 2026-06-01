// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.preferences.Preference
import com.firefly.api.models.preferences.PreferenceCreateParams
import com.firefly.api.models.preferences.PreferenceListParams
import com.firefly.api.models.preferences.PreferenceRetrieveParams
import com.firefly.api.models.preferences.PreferenceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreferenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val preferenceServiceAsync = client.preferences()

        val preferenceSingle =
            preferenceServiceAsync.create(
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
            )

        preferenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val preferenceServiceAsync = client.preferences()

        val preferenceSingle =
            preferenceServiceAsync.retrieve(
                PreferenceRetrieveParams.builder()
                    .name("currencyPreference")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        preferenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val preferenceServiceAsync = client.preferences()

        val preferenceSingle =
            preferenceServiceAsync.update(
                PreferenceUpdateParams.builder()
                    .name("currencyPreference")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .data(true)
                    .build()
            )

        preferenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val preferenceServiceAsync = client.preferences()

        val preferences =
            preferenceServiceAsync.list(
                PreferenceListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        preferences.validate()
    }
}
