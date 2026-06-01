// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.tags

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagReadTest {

    @Test
    fun create() {
        val tagRead =
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

        assertThat(tagRead.id()).isEqualTo("2")
        assertThat(tagRead.attributes())
            .isEqualTo(
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
        assertThat(tagRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(tagRead.type()).isEqualTo("tags")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagRead =
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

        val roundtrippedTagRead =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tagRead), jacksonTypeRef<TagRead>())

        assertThat(roundtrippedTagRead).isEqualTo(tagRead)
    }
}
