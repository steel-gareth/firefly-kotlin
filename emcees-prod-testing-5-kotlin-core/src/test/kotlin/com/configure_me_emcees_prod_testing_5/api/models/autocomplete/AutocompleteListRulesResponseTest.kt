// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListRulesResponseTest {

    @Test
    fun create() {
        val autocompleteListRulesResponse =
            AutocompleteListRulesResponse.builder()
                .id("2")
                .name("Rule one")
                .active(true)
                .description("Useful rule.")
                .build()

        assertThat(autocompleteListRulesResponse.id()).isEqualTo("2")
        assertThat(autocompleteListRulesResponse.name()).isEqualTo("Rule one")
        assertThat(autocompleteListRulesResponse.active()).isEqualTo(true)
        assertThat(autocompleteListRulesResponse.description()).isEqualTo("Useful rule.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListRulesResponse =
            AutocompleteListRulesResponse.builder()
                .id("2")
                .name("Rule one")
                .active(true)
                .description("Useful rule.")
                .build()

        val roundtrippedAutocompleteListRulesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListRulesResponse),
                jacksonTypeRef<AutocompleteListRulesResponse>(),
            )

        assertThat(roundtrippedAutocompleteListRulesResponse)
            .isEqualTo(autocompleteListRulesResponse)
    }
}
