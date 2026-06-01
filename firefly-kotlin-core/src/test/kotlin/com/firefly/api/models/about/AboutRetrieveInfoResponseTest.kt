// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.about

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AboutRetrieveInfoResponseTest {

    @Test
    fun create() {
        val aboutRetrieveInfoResponse =
            AboutRetrieveInfoResponse.builder()
                .data(
                    AboutRetrieveInfoResponse.Data.builder()
                        .apiVersion("6.6.2")
                        .driver("mysql")
                        .os("Linux")
                        .phpVersion("8.1.5")
                        .version("6.6.2")
                        .build()
                )
                .build()

        assertThat(aboutRetrieveInfoResponse.data())
            .isEqualTo(
                AboutRetrieveInfoResponse.Data.builder()
                    .apiVersion("6.6.2")
                    .driver("mysql")
                    .os("Linux")
                    .phpVersion("8.1.5")
                    .version("6.6.2")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aboutRetrieveInfoResponse =
            AboutRetrieveInfoResponse.builder()
                .data(
                    AboutRetrieveInfoResponse.Data.builder()
                        .apiVersion("6.6.2")
                        .driver("mysql")
                        .os("Linux")
                        .phpVersion("8.1.5")
                        .version("6.6.2")
                        .build()
                )
                .build()

        val roundtrippedAboutRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aboutRetrieveInfoResponse),
                jacksonTypeRef<AboutRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedAboutRetrieveInfoResponse).isEqualTo(aboutRetrieveInfoResponse)
    }
}
