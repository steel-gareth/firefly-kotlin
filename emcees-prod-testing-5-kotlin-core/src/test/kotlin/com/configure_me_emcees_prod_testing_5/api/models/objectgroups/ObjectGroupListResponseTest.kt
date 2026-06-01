// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.objectgroups

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGroupListResponseTest {

    @Test
    fun create() {
        val objectGroupListResponse =
            ObjectGroupListResponse.builder()
                .addData(
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

        assertThat(objectGroupListResponse.data())
            .containsExactly(
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
        assertThat(objectGroupListResponse.meta())
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
        val objectGroupListResponse =
            ObjectGroupListResponse.builder()
                .addData(
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

        val roundtrippedObjectGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGroupListResponse),
                jacksonTypeRef<ObjectGroupListResponse>(),
            )

        assertThat(roundtrippedObjectGroupListResponse).isEqualTo(objectGroupListResponse)
    }
}
