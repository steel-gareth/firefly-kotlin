// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.accounts

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
