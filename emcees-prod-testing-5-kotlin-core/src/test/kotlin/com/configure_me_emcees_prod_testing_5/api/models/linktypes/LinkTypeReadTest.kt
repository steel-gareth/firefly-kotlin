// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.linktypes

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkTypeReadTest {

    @Test
    fun create() {
        val linkTypeRead =
            LinkTypeRead.builder()
                .id("2")
                .attributes(
                    LinkType.builder()
                        .inward("is (partially) paid for by")
                        .name("Paid")
                        .outward("(partially) pays for")
                        .editable(false)
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("link_types")
                .build()

        assertThat(linkTypeRead.id()).isEqualTo("2")
        assertThat(linkTypeRead.attributes())
            .isEqualTo(
                LinkType.builder()
                    .inward("is (partially) paid for by")
                    .name("Paid")
                    .outward("(partially) pays for")
                    .editable(false)
                    .build()
            )
        assertThat(linkTypeRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(linkTypeRead.type()).isEqualTo("link_types")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkTypeRead =
            LinkTypeRead.builder()
                .id("2")
                .attributes(
                    LinkType.builder()
                        .inward("is (partially) paid for by")
                        .name("Paid")
                        .outward("(partially) pays for")
                        .editable(false)
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("link_types")
                .build()

        val roundtrippedLinkTypeRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkTypeRead),
                jacksonTypeRef<LinkTypeRead>(),
            )

        assertThat(roundtrippedLinkTypeRead).isEqualTo(linkTypeRead)
    }
}
