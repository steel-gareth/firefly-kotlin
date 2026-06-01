// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.accounts

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageLinkTest {

    @Test
    fun create() {
        val pageLink =
            PageLink.builder()
                .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                .build()

        assertThat(pageLink.first()).isEqualTo("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
        assertThat(pageLink.last()).isEqualTo("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
        assertThat(pageLink.next()).isEqualTo("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
        assertThat(pageLink.prev()).isEqualTo("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
        assertThat(pageLink.self()).isEqualTo("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pageLink =
            PageLink.builder()
                .first("https://demo.firefly-iii.org/api/v1/OBJECT?&page=1")
                .last("https://demo.firefly-iii.org/api/v1/OBJECT?&page=12")
                .next("https://demo.firefly-iii.org/api/v1/OBJECT?&page=3")
                .prev("https://demo.firefly-iii.org/api/v1/OBJECT?&page=2")
                .self("https://demo.firefly-iii.org/api/v1/OBJECT?&page=4")
                .build()

        val roundtrippedPageLink =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pageLink),
                jacksonTypeRef<PageLink>(),
            )

        assertThat(roundtrippedPageLink).isEqualTo(pageLink)
    }
}
