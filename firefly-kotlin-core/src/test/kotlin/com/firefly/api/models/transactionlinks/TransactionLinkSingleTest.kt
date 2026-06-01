// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.transactionlinks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLinkSingleTest {

    @Test
    fun create() {
        val transactionLinkSingle =
            TransactionLinkSingle.builder()
                .data(
                    TransactionLinkRead.builder()
                        .id("2")
                        .attributes(
                            TransactionLinkRead.Attributes.builder()
                                .inwardId("131")
                                .linkTypeId("5")
                                .outwardId("131")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .linkTypeName("Is paid by")
                                .notes("Some example notes")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("transactionLinks")
                        .build()
                )
                .build()

        assertThat(transactionLinkSingle.data())
            .isEqualTo(
                TransactionLinkRead.builder()
                    .id("2")
                    .attributes(
                        TransactionLinkRead.Attributes.builder()
                            .inwardId("131")
                            .linkTypeId("5")
                            .outwardId("131")
                            .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .linkTypeName("Is paid by")
                            .notes("Some example notes")
                            .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .build()
                    )
                    .links(
                        ObjectLink.builder()
                            ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                            .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                            .build()
                    )
                    .type("transactionLinks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionLinkSingle =
            TransactionLinkSingle.builder()
                .data(
                    TransactionLinkRead.builder()
                        .id("2")
                        .attributes(
                            TransactionLinkRead.Attributes.builder()
                                .inwardId("131")
                                .linkTypeId("5")
                                .outwardId("131")
                                .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .linkTypeName("Is paid by")
                                .notes("Some example notes")
                                .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                                .build()
                        )
                        .links(
                            ObjectLink.builder()
                                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                                .build()
                        )
                        .type("transactionLinks")
                        .build()
                )
                .build()

        val roundtrippedTransactionLinkSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionLinkSingle),
                jacksonTypeRef<TransactionLinkSingle>(),
            )

        assertThat(roundtrippedTransactionLinkSingle).isEqualTo(transactionLinkSingle)
    }
}
