// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListCurrenciesWithCodeResponseTest {

    @Test
    fun create() {
        val autocompleteListCurrenciesWithCodeResponse =
            AutocompleteListCurrenciesWithCodeResponse.builder()
                .id("2")
                .code("EUR")
                .decimalPlaces(2)
                .name("Currency name (XCN)")
                .symbol("\$")
                .build()

        assertThat(autocompleteListCurrenciesWithCodeResponse.id()).isEqualTo("2")
        assertThat(autocompleteListCurrenciesWithCodeResponse.code()).isEqualTo("EUR")
        assertThat(autocompleteListCurrenciesWithCodeResponse.decimalPlaces()).isEqualTo(2)
        assertThat(autocompleteListCurrenciesWithCodeResponse.name())
            .isEqualTo("Currency name (XCN)")
        assertThat(autocompleteListCurrenciesWithCodeResponse.symbol()).isEqualTo("\$")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListCurrenciesWithCodeResponse =
            AutocompleteListCurrenciesWithCodeResponse.builder()
                .id("2")
                .code("EUR")
                .decimalPlaces(2)
                .name("Currency name (XCN)")
                .symbol("\$")
                .build()

        val roundtrippedAutocompleteListCurrenciesWithCodeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListCurrenciesWithCodeResponse),
                jacksonTypeRef<AutocompleteListCurrenciesWithCodeResponse>(),
            )

        assertThat(roundtrippedAutocompleteListCurrenciesWithCodeResponse)
            .isEqualTo(autocompleteListCurrenciesWithCodeResponse)
    }
}
