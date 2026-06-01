// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.objectgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGroupSingleTest {

    @Test
    fun create() {
        val objectGroupSingle =
            ObjectGroupSingle.builder()
                .data(
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
                )
                .build()

        assertThat(objectGroupSingle.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGroupSingle =
            ObjectGroupSingle.builder()
                .data(
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
                )
                .build()

        val roundtrippedObjectGroupSingle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGroupSingle),
                jacksonTypeRef<ObjectGroupSingle>(),
            )

        assertThat(roundtrippedObjectGroupSingle).isEqualTo(objectGroupSingle)
    }
}
