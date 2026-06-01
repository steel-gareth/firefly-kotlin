// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListTransactionsResponseTest {

    @Test
    fun create() {
        val autocompleteListTransactionsResponse =
            AutocompleteListTransactionsResponse.builder()
                .id("2")
                .description("Transaction")
                .name("Transaction")
                .transactionGroupId("2")
                .build()

        assertThat(autocompleteListTransactionsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListTransactionsResponse.description()).isEqualTo("Transaction")
        assertThat(autocompleteListTransactionsResponse.name()).isEqualTo("Transaction")
        assertThat(autocompleteListTransactionsResponse.transactionGroupId()).isEqualTo("2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListTransactionsResponse =
            AutocompleteListTransactionsResponse.builder()
                .id("2")
                .description("Transaction")
                .name("Transaction")
                .transactionGroupId("2")
                .build()

        val roundtrippedAutocompleteListTransactionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListTransactionsResponse),
                jacksonTypeRef<AutocompleteListTransactionsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListTransactionsResponse)
            .isEqualTo(autocompleteListTransactionsResponse)
    }
}
