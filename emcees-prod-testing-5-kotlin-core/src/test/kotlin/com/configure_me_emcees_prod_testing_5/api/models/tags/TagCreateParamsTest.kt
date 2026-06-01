// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.tags

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCreateParamsTest {

    @Test
    fun create() {
        TagCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .tag("expensive")
            .date(LocalDate.parse("2026-04-01"))
            .description("Tag for expensive stuff")
            .latitude(51.983333)
            .longitude(5.916667)
            .zoomLevel(6)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TagCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .tag("expensive")
                .date(LocalDate.parse("2026-04-01"))
                .description("Tag for expensive stuff")
                .latitude(51.983333)
                .longitude(5.916667)
                .zoomLevel(6)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TagCreateParams.builder().tag("expensive").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TagCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .tag("expensive")
                .date(LocalDate.parse("2026-04-01"))
                .description("Tag for expensive stuff")
                .latitude(51.983333)
                .longitude(5.916667)
                .zoomLevel(6)
                .build()

        val body = params._body()

        assertThat(body.tag()).isEqualTo("expensive")
        assertThat(body.date()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.description()).isEqualTo("Tag for expensive stuff")
        assertThat(body.latitude()).isEqualTo(51.983333)
        assertThat(body.longitude()).isEqualTo(5.916667)
        assertThat(body.zoomLevel()).isEqualTo(6)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TagCreateParams.builder().tag("expensive").build()

        val body = params._body()

        assertThat(body.tag()).isEqualTo("expensive")
    }
}
