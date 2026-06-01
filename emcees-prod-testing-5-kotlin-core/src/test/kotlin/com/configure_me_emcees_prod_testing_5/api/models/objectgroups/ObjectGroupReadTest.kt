// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.objectgroups

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGroupReadTest {

    @Test
    fun create() {
        val objectGroupRead =
            ObjectGroupRead.builder()
                .id("2")
                .attributes(
                    ObjectGroupRead.Attributes.builder()
                        .order(1)
                        .title("My object group")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("object_groups")
                .build()

        assertThat(objectGroupRead.id()).isEqualTo("2")
        assertThat(objectGroupRead.attributes())
            .isEqualTo(
                ObjectGroupRead.Attributes.builder()
                    .order(1)
                    .title("My object group")
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(objectGroupRead.type()).isEqualTo("object_groups")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGroupRead =
            ObjectGroupRead.builder()
                .id("2")
                .attributes(
                    ObjectGroupRead.Attributes.builder()
                        .order(1)
                        .title("My object group")
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .type("object_groups")
                .build()

        val roundtrippedObjectGroupRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGroupRead),
                jacksonTypeRef<ObjectGroupRead>(),
            )

        assertThat(roundtrippedObjectGroupRead).isEqualTo(objectGroupRead)
    }
}
