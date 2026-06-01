// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.attachments

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentSingleTest {

    @Test
    fun create() {
        val attachmentSingle =
            AttachmentSingle.builder()
                .data(
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
                .build()

        assertThat(attachmentSingle.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachmentSingle =
            AttachmentSingle.builder()
                .data(
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
                .build()

        val roundtrippedAttachmentSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachmentSingle),
                jacksonTypeRef<AttachmentSingle>(),
            )

        assertThat(roundtrippedAttachmentSingle).isEqualTo(attachmentSingle)
    }
}
