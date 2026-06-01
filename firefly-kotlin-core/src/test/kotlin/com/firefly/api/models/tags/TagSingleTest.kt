// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.attachments.ObjectLink
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagSingleTest {

    @Test
    fun create() {
        val tagSingle =
            TagSingle.builder()
                .data(
                    TagRead.builder()
                        .id("2")
                        .attributes(
                            TagRead.Attributes.builder()
                                .tag("expensive")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .date(LocalDate.parse("2026-04-01"))
                                .description("Tag for expensive stuff")
                                .latitude(51.983333)
                                .longitude(5.916667)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .zoomLevel(6)
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("tags")
                        .build()
                )
                .build()

        assertThat(tagSingle.data())
            .isEqualTo(
                TagRead.builder()
                    .id("2")
                    .attributes(
                        TagRead.Attributes.builder()
                            .tag("expensive")
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .date(LocalDate.parse("2026-04-01"))
                            .description("Tag for expensive stuff")
                            .latitude(51.983333)
                            .longitude(5.916667)
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .zoomLevel(6)
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("tags")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagSingle =
            TagSingle.builder()
                .data(
                    TagRead.builder()
                        .id("2")
                        .attributes(
                            TagRead.Attributes.builder()
                                .tag("expensive")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .date(LocalDate.parse("2026-04-01"))
                                .description("Tag for expensive stuff")
                                .latitude(51.983333)
                                .longitude(5.916667)
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .zoomLevel(6)
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("tags")
                        .build()
                )
                .build()

        val roundtrippedTagSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagSingle),
                jacksonTypeRef<TagSingle>(),
            )

        assertThat(roundtrippedTagSingle).isEqualTo(tagSingle)
    }
}
