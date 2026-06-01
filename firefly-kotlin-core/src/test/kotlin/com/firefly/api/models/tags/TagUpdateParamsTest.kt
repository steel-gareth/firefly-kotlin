// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.tags

import com.firefly.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagUpdateParamsTest {

    @Test
    fun create() {
        TagUpdateParams.builder()
            .pathTag("groceries")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .date(LocalDate.parse("2026-04-01"))
            .description("Tag for expensive stuff")
            .latitude(51.983333)
            .longitude(5.916667)
            .bodyTag("expensive")
            .zoomLevel(6)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TagUpdateParams.builder().pathTag("groceries").build()

        assertThat(params._pathParam(0)).isEqualTo("groceries")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TagUpdateParams.builder()
                .pathTag("groceries")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .date(LocalDate.parse("2026-04-01"))
                .description("Tag for expensive stuff")
                .latitude(51.983333)
                .longitude(5.916667)
                .bodyTag("expensive")
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
        val params = TagUpdateParams.builder().pathTag("groceries").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TagUpdateParams.builder()
                .pathTag("groceries")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .date(LocalDate.parse("2026-04-01"))
                .description("Tag for expensive stuff")
                .latitude(51.983333)
                .longitude(5.916667)
                .bodyTag("expensive")
                .zoomLevel(6)
                .build()

        val body = params._body()

        assertThat(body.date()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.description()).isEqualTo("Tag for expensive stuff")
        assertThat(body.latitude()).isEqualTo(51.983333)
        assertThat(body.longitude()).isEqualTo(5.916667)
        assertThat(body.bodyTag()).isEqualTo("expensive")
        assertThat(body.zoomLevel()).isEqualTo(6)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TagUpdateParams.builder().pathTag("groceries").build()

        val body = params._body()
    }
}
