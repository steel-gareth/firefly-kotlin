// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.attachments

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectLinkTest {

    @Test
    fun create() {
        val objectLink =
            ObjectLink.builder()
                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                .build()

        assertThat(objectLink._0())
            .isEqualTo(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
        assertThat(objectLink.self()).isEqualTo("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectLink =
            ObjectLink.builder()
                ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                .build()

        val roundtrippedObjectLink =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectLink),
                jacksonTypeRef<ObjectLink>(),
            )

        assertThat(roundtrippedObjectLink).isEqualTo(objectLink)
    }
}
