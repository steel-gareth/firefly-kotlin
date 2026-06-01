// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListObjectGroupsResponseTest {

    @Test
    fun create() {
        val autocompleteListObjectGroupsResponse =
            AutocompleteListObjectGroupsResponse.builder()
                .id("2")
                .name("Object Group one")
                .title("Object Group one")
                .build()

        assertThat(autocompleteListObjectGroupsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListObjectGroupsResponse.name()).isEqualTo("Object Group one")
        assertThat(autocompleteListObjectGroupsResponse.title()).isEqualTo("Object Group one")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListObjectGroupsResponse =
            AutocompleteListObjectGroupsResponse.builder()
                .id("2")
                .name("Object Group one")
                .title("Object Group one")
                .build()

        val roundtrippedAutocompleteListObjectGroupsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListObjectGroupsResponse),
                jacksonTypeRef<AutocompleteListObjectGroupsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListObjectGroupsResponse)
            .isEqualTo(autocompleteListObjectGroupsResponse)
    }
}
