// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListTagsResponseTest {

    @Test
    fun create() {
        val autocompleteListTagsResponse =
            AutocompleteListTagsResponse.builder()
                .id("2")
                .name("too-expensive-tag-example")
                .tag("too-expensive-tag-example")
                .build()

        assertThat(autocompleteListTagsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListTagsResponse.name()).isEqualTo("too-expensive-tag-example")
        assertThat(autocompleteListTagsResponse.tag()).isEqualTo("too-expensive-tag-example")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListTagsResponse =
            AutocompleteListTagsResponse.builder()
                .id("2")
                .name("too-expensive-tag-example")
                .tag("too-expensive-tag-example")
                .build()

        val roundtrippedAutocompleteListTagsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListTagsResponse),
                jacksonTypeRef<AutocompleteListTagsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListTagsResponse).isEqualTo(autocompleteListTagsResponse)
    }
}
