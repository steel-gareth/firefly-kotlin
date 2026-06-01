// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.tags

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagListResponseTest {

    @Test
    fun create() {
        val tagListResponse =
            TagListResponse.builder()
                .addData(
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
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pagination(
                            Meta.Pagination.builder()
                                .count(20L)
                                .currentPage(1L)
                                .perPage(100L)
                                .total(3L)
                                .totalPages(1L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(tagListResponse.data())
            .containsExactly(
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
        assertThat(tagListResponse.links())
            .isEqualTo(
                PageLink.builder()
                    .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                    .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                    .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                    .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                    .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                    .build()
            )
        assertThat(tagListResponse.meta())
            .isEqualTo(
                Meta.builder()
                    .pagination(
                        Meta.Pagination.builder()
                            .count(20L)
                            .currentPage(1L)
                            .perPage(100L)
                            .total(3L)
                            .totalPages(1L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagListResponse =
            TagListResponse.builder()
                .addData(
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
                .links(
                    PageLink.builder()
                        .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                        .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                        .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                        .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                        .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pagination(
                            Meta.Pagination.builder()
                                .count(20L)
                                .currentPage(1L)
                                .perPage(100L)
                                .total(3L)
                                .totalPages(1L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTagListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagListResponse),
                jacksonTypeRef<TagListResponse>(),
            )

        assertThat(roundtrippedTagListResponse).isEqualTo(tagListResponse)
    }
}
