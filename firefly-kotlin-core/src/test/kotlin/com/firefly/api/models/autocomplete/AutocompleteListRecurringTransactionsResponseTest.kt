// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
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
