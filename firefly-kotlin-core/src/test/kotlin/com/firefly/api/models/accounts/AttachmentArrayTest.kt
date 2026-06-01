// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.attachments.AttachableType
import com.firefly.api.models.attachments.AttachmentRead
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentArrayTest {

    @Test
    fun create() {
        val attachmentArray =
            AttachmentArray.builder()
                .addData(
                    AttachmentRead.builder()
                        .id("2")
                        .attributes(
                            AttachmentRead.Attributes.builder()
                                .attachableId("134")
                                .attachableType(AttachableType.BILL)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .downloadUrl(
                                    "https://demo.firefly-iii.org/api/v1/attachments/191/download"
                                )
                                .filename("file.pdf")
                                .hash("0c3f95f34370baa88f9fd9a671fea305")
                                .mime("application/pdf")
                                .notes("Some notes")
                                .size(48211)
                                .title("Some PDF file")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .uploadUrl(
                                    "https://demo.firefly-iii.org/api/v1/attachments/191/download"
                                )
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("attachments")
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

        assertThat(attachmentArray.data())
            .containsExactly(
                AttachmentRead.builder()
                    .id("2")
                    .attributes(
                        AttachmentRead.Attributes.builder()
                            .attachableId("134")
                            .attachableType(AttachableType.BILL)
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .downloadUrl(
                                "https://demo.firefly-iii.org/api/v1/attachments/191/download"
                            )
                            .filename("file.pdf")
                            .hash("0c3f95f34370baa88f9fd9a671fea305")
                            .mime("application/pdf")
                            .notes("Some notes")
                            .size(48211)
                            .title("Some PDF file")
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .uploadUrl(
                                "https://demo.firefly-iii.org/api/v1/attachments/191/download"
                            )
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("attachments")
                    .build()
            )
        assertThat(attachmentArray.meta())
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
        val attachmentArray =
            AttachmentArray.builder()
                .addData(
                    AttachmentRead.builder()
                        .id("2")
                        .attributes(
                            AttachmentRead.Attributes.builder()
                                .attachableId("134")
                                .attachableType(AttachableType.BILL)
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .downloadUrl(
                                    "https://demo.firefly-iii.org/api/v1/attachments/191/download"
                                )
                                .filename("file.pdf")
                                .hash("0c3f95f34370baa88f9fd9a671fea305")
                                .mime("application/pdf")
                                .notes("Some notes")
                                .size(48211)
                                .title("Some PDF file")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .uploadUrl(
                                    "https://demo.firefly-iii.org/api/v1/attachments/191/download"
                                )
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("attachments")
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

        val roundtrippedAttachmentArray =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentArray),
                jacksonTypeRef<AttachmentArray>(),
            )

        assertThat(roundtrippedAttachmentArray).isEqualTo(attachmentArray)
    }
}
