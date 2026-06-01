// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListRecurringTransactionsResponseTest {

    @Test
    fun create() {
        val autocompleteListRecurringTransactionsResponse =
            AutocompleteListRecurringTransactionsResponse.builder()
                .id("2")
                .name("Yearly bill")
                .active(true)
                .description("Should trigger daily.")
                .build()

        assertThat(autocompleteListRecurringTransactionsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListRecurringTransactionsResponse.name()).isEqualTo("Yearly bill")
        assertThat(autocompleteListRecurringTransactionsResponse.active()).isEqualTo(true)
        assertThat(autocompleteListRecurringTransactionsResponse.description())
            .isEqualTo("Should trigger daily.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListRecurringTransactionsResponse =
            AutocompleteListRecurringTransactionsResponse.builder()
                .id("2")
                .name("Yearly bill")
                .active(true)
                .description("Should trigger daily.")
                .build()

        val roundtrippedAutocompleteListRecurringTransactionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListRecurringTransactionsResponse),
                jacksonTypeRef<AutocompleteListRecurringTransactionsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListRecurringTransactionsResponse)
            .isEqualTo(autocompleteListRecurringTransactionsResponse)
    }
}
