// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListBudgetsResponseTest {

    @Test
    fun create() {
        val autocompleteListBudgetsResponse =
            AutocompleteListBudgetsResponse.builder().id("2").name("Groceries").active(true).build()

        assertThat(autocompleteListBudgetsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListBudgetsResponse.name()).isEqualTo("Groceries")
        assertThat(autocompleteListBudgetsResponse.active()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListBudgetsResponse =
            AutocompleteListBudgetsResponse.builder().id("2").name("Groceries").active(true).build()

        val roundtrippedAutocompleteListBudgetsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListBudgetsResponse),
                jacksonTypeRef<AutocompleteListBudgetsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListBudgetsResponse)
            .isEqualTo(autocompleteListBudgetsResponse)
    }
}
