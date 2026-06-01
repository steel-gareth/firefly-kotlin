// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.linktypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkTypeTest {

    @Test
    fun create() {
        val linkType =
            LinkType.builder()
                .inward("is (partially) paid for by")
                .name("Paid")
                .outward("(partially) pays for")
                .editable(false)
                .build()

        assertThat(linkType.inward()).isEqualTo("is (partially) paid for by")
        assertThat(linkType.name()).isEqualTo("Paid")
        assertThat(linkType.outward()).isEqualTo("(partially) pays for")
        assertThat(linkType.editable()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkType =
            LinkType.builder()
                .inward("is (partially) paid for by")
                .name("Paid")
                .outward("(partially) pays for")
                .editable(false)
                .build()

        val roundtrippedLinkType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkType),
                jacksonTypeRef<LinkType>(),
            )

        assertThat(roundtrippedLinkType).isEqualTo(linkType)
    }
}
