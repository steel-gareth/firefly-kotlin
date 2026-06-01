// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.preferences.Preference
import com.firefly.api.models.preferences.PreferenceCreateParams
import com.firefly.api.models.preferences.PreferenceListParams
import com.firefly.api.models.preferences.PreferenceRetrieveParams
import com.firefly.api.models.preferences.PreferenceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val preferenceService = client.preferences()

        val preferenceSingle =
            preferenceService.create(
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
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val preferenceService = client.preferences()

        val preferenceSingle =
            preferenceService.retrieve(
                PreferenceRetrieveParams.builder()
                    .name("currencyPreference")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        preferenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val preferenceService = client.preferences()

        val preferenceSingle =
            preferenceService.update(
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
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val preferenceService = client.preferences()

        val preferences =
            preferenceService.list(
                PreferenceListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        preferences.validate()
    }
}
