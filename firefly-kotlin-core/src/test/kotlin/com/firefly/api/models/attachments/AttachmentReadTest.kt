// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.attachments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentReadTest {

    @Test
    fun create() {
        val attachmentRead =
            AttachmentRead.builder()
                .id("2")
                .attributes(
                    AttachmentRead.Attributes.builder()
                        .attachableId("134")
                        .attachableType(AttachableType.BILL)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .downloadUrl("https://demo.firefly-iii.org/api/v1/attachments/191/download")
                        .filename("file.pdf")
                        .hash("0c3f95f34370baa88f9fd9a671fea305")
                        .mime("application/pdf")
                        .notes("Some notes")
                        .size(48211)
                        .title("Some PDF file")
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .uploadUrl("https://demo.firefly-iii.org/api/v1/attachments/191/download")
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

        assertThat(attachmentRead.id()).isEqualTo("2")
        assertThat(attachmentRead.attributes())
            .isEqualTo(
                AttachmentRead.Attributes.builder()
                    .attachableId("134")
                    .attachableType(AttachableType.BILL)
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .downloadUrl("https://demo.firefly-iii.org/api/v1/attachments/191/download")
                    .filename("file.pdf")
                    .hash("0c3f95f34370baa88f9fd9a671fea305")
                    .mime("application/pdf")
                    .notes("Some notes")
                    .size(48211)
                    .title("Some PDF file")
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .uploadUrl("https://demo.firefly-iii.org/api/v1/attachments/191/download")
                    .build()
            )
        assertThat(attachmentRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(attachmentRead.type()).isEqualTo("attachments")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentRead =
            AttachmentRead.builder()
                .id("2")
                .attributes(
                    AttachmentRead.Attributes.builder()
                        .attachableId("134")
                        .attachableType(AttachableType.BILL)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .downloadUrl("https://demo.firefly-iii.org/api/v1/attachments/191/download")
                        .filename("file.pdf")
                        .hash("0c3f95f34370baa88f9fd9a671fea305")
                        .mime("application/pdf")
                        .notes("Some notes")
                        .size(48211)
                        .title("Some PDF file")
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .uploadUrl("https://demo.firefly-iii.org/api/v1/attachments/191/download")
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

        val roundtrippedAttachmentRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentRead),
                jacksonTypeRef<AttachmentRead>(),
            )

        assertThat(roundtrippedAttachmentRead).isEqualTo(attachmentRead)
    }
}
