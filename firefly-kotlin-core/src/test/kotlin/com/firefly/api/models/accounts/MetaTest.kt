// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetaTest {

    @Test
    fun create() {
        val meta =
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

        assertThat(meta.pagination())
            .isEqualTo(
                Meta.Pagination.builder()
                    .count(20L)
                    .currentPage(1L)
                    .perPage(100L)
                    .total(3L)
                    .totalPages(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meta =
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

        val roundtrippedMeta =
            jsonMapper.readValue(jsonMapper.writeValueAsString(meta), jacksonTypeRef<Meta>())

        assertThat(roundtrippedMeta).isEqualTo(meta)
    }
}
