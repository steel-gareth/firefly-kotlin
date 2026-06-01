// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListTransactionsWithIdResponseTest {

    @Test
    fun create() {
        val autocompleteListTransactionsWithIdResponse =
            AutocompleteListTransactionsWithIdResponse.builder()
                .id("2")
                .description("#12: Transaction")
                .name("#12: Transaction")
                .transactionGroupId("2")
                .build()

        assertThat(autocompleteListTransactionsWithIdResponse.id()).isEqualTo("2")
        assertThat(autocompleteListTransactionsWithIdResponse.description())
            .isEqualTo("#12: Transaction")
        assertThat(autocompleteListTransactionsWithIdResponse.name()).isEqualTo("#12: Transaction")
        assertThat(autocompleteListTransactionsWithIdResponse.transactionGroupId()).isEqualTo("2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListTransactionsWithIdResponse =
            AutocompleteListTransactionsWithIdResponse.builder()
                .id("2")
                .description("#12: Transaction")
                .name("#12: Transaction")
                .transactionGroupId("2")
                .build()

        val roundtrippedAutocompleteListTransactionsWithIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListTransactionsWithIdResponse),
                jacksonTypeRef<AutocompleteListTransactionsWithIdResponse>(),
            )

        assertThat(roundtrippedAutocompleteListTransactionsWithIdResponse)
            .isEqualTo(autocompleteListTransactionsWithIdResponse)
    }
}
