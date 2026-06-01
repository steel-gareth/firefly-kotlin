// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListRuleGroupsResponseTest {

    @Test
    fun create() {
        val autocompleteListRuleGroupsResponse =
            AutocompleteListRuleGroupsResponse.builder()
                .id("2")
                .name("Rule group one")
                .active(true)
                .description("Some rule group.")
                .build()

        assertThat(autocompleteListRuleGroupsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListRuleGroupsResponse.name()).isEqualTo("Rule group one")
        assertThat(autocompleteListRuleGroupsResponse.active()).isEqualTo(true)
        assertThat(autocompleteListRuleGroupsResponse.description()).isEqualTo("Some rule group.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListRuleGroupsResponse =
            AutocompleteListRuleGroupsResponse.builder()
                .id("2")
                .name("Rule group one")
                .active(true)
                .description("Some rule group.")
                .build()

        val roundtrippedAutocompleteListRuleGroupsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListRuleGroupsResponse),
                jacksonTypeRef<AutocompleteListRuleGroupsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListRuleGroupsResponse)
            .isEqualTo(autocompleteListRuleGroupsResponse)
    }
}
