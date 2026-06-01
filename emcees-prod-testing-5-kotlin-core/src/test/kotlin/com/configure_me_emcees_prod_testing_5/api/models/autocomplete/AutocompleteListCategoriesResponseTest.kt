// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListCategoriesResponseTest {

    @Test
    fun create() {
        val autocompleteListCategoriesResponse =
            AutocompleteListCategoriesResponse.builder().id("2").name("Category X").build()

        assertThat(autocompleteListCategoriesResponse.id()).isEqualTo("2")
        assertThat(autocompleteListCategoriesResponse.name()).isEqualTo("Category X")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListCategoriesResponse =
            AutocompleteListCategoriesResponse.builder().id("2").name("Category X").build()

        val roundtrippedAutocompleteListCategoriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListCategoriesResponse),
                jacksonTypeRef<AutocompleteListCategoriesResponse>(),
            )

        assertThat(roundtrippedAutocompleteListCategoriesResponse)
            .isEqualTo(autocompleteListCategoriesResponse)
    }
}
