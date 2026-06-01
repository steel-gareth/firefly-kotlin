// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListCurrenciesResponseTest {

    @Test
    fun create() {
        val autocompleteListCurrenciesResponse =
            AutocompleteListCurrenciesResponse.builder()
                .id("2")
                .code("EUR")
                .decimalPlaces(2)
                .name("Currency name")
                .symbol("\$")
                .build()

        assertThat(autocompleteListCurrenciesResponse.id()).isEqualTo("2")
        assertThat(autocompleteListCurrenciesResponse.code()).isEqualTo("EUR")
        assertThat(autocompleteListCurrenciesResponse.decimalPlaces()).isEqualTo(2)
        assertThat(autocompleteListCurrenciesResponse.name()).isEqualTo("Currency name")
        assertThat(autocompleteListCurrenciesResponse.symbol()).isEqualTo("\$")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListCurrenciesResponse =
            AutocompleteListCurrenciesResponse.builder()
                .id("2")
                .code("EUR")
                .decimalPlaces(2)
                .name("Currency name")
                .symbol("\$")
                .build()

        val roundtrippedAutocompleteListCurrenciesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListCurrenciesResponse),
                jacksonTypeRef<AutocompleteListCurrenciesResponse>(),
            )

        assertThat(roundtrippedAutocompleteListCurrenciesResponse)
            .isEqualTo(autocompleteListCurrenciesResponse)
    }
}
