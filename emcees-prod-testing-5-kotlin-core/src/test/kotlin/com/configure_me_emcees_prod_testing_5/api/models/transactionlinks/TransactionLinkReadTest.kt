// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.transactionlinks

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLinkReadTest {

    @Test
    fun create() {
        val transactionLinkRead =
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

        assertThat(transactionLinkRead.id()).isEqualTo("2")
        assertThat(transactionLinkRead.attributes())
            .isEqualTo(
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
        assertThat(transactionLinkRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(transactionLinkRead.type()).isEqualTo("transactionLinks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionLinkRead =
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

        val roundtrippedTransactionLinkRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionLinkRead),
                jacksonTypeRef<TransactionLinkRead>(),
            )

        assertThat(roundtrippedTransactionLinkRead).isEqualTo(transactionLinkRead)
    }
}
