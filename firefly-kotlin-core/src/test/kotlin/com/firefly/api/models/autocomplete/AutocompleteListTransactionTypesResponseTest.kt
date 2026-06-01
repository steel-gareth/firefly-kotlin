// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListTransactionTypesResponseTest {

    @Test
    fun create() {
        val autocompleteListTransactionTypesResponse =
            AutocompleteListTransactionTypesResponse.builder()
                .id("2")
                .name("Withdrawal")
                .type("Withdrawal")
                .build()

        assertThat(autocompleteListTransactionTypesResponse.id()).isEqualTo("2")
        assertThat(autocompleteListTransactionTypesResponse.name()).isEqualTo("Withdrawal")
        assertThat(autocompleteListTransactionTypesResponse.type()).isEqualTo("Withdrawal")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListTransactionTypesResponse =
            AutocompleteListTransactionTypesResponse.builder()
                .id("2")
                .name("Withdrawal")
                .type("Withdrawal")
                .build()

        val roundtrippedAutocompleteListTransactionTypesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListTransactionTypesResponse),
                jacksonTypeRef<AutocompleteListTransactionTypesResponse>(),
            )

        assertThat(roundtrippedAutocompleteListTransactionTypesResponse)
            .isEqualTo(autocompleteListTransactionTypesResponse)
    }
}
