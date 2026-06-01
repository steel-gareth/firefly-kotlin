// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListAccountsResponseTest {

    @Test
    fun create() {
        val autocompleteListAccountsResponse =
            AutocompleteListAccountsResponse.builder()
                .id("2")
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("12")
                .currencyName("Euro")
                .currencySymbol("\$")
                .name("Checking Account")
                .nameWithBalance("Checking Account (\$123.45)")
                .type("Asset account")
                .accountCurrencyCode("USD")
                .accountCurrencyDecimalPlaces(2)
                .accountCurrencyId("2")
                .accountCurrencyName("US Dollar")
                .accountCurrencySymbol("\$")
                .active(true)
                .build()

        assertThat(autocompleteListAccountsResponse.id()).isEqualTo("2")
        assertThat(autocompleteListAccountsResponse.currencyCode()).isEqualTo("EUR")
        assertThat(autocompleteListAccountsResponse.currencyDecimalPlaces()).isEqualTo(2)
        assertThat(autocompleteListAccountsResponse.currencyId()).isEqualTo("12")
        assertThat(autocompleteListAccountsResponse.currencyName()).isEqualTo("Euro")
        assertThat(autocompleteListAccountsResponse.currencySymbol()).isEqualTo("\$")
        assertThat(autocompleteListAccountsResponse.name()).isEqualTo("Checking Account")
        assertThat(autocompleteListAccountsResponse.nameWithBalance())
            .isEqualTo("Checking Account (\$123.45)")
        assertThat(autocompleteListAccountsResponse.type()).isEqualTo("Asset account")
        assertThat(autocompleteListAccountsResponse.accountCurrencyCode()).isEqualTo("USD")
        assertThat(autocompleteListAccountsResponse.accountCurrencyDecimalPlaces()).isEqualTo(2)
        assertThat(autocompleteListAccountsResponse.accountCurrencyId()).isEqualTo("2")
        assertThat(autocompleteListAccountsResponse.accountCurrencyName()).isEqualTo("US Dollar")
        assertThat(autocompleteListAccountsResponse.accountCurrencySymbol()).isEqualTo("\$")
        assertThat(autocompleteListAccountsResponse.active()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListAccountsResponse =
            AutocompleteListAccountsResponse.builder()
                .id("2")
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("12")
                .currencyName("Euro")
                .currencySymbol("\$")
                .name("Checking Account")
                .nameWithBalance("Checking Account (\$123.45)")
                .type("Asset account")
                .accountCurrencyCode("USD")
                .accountCurrencyDecimalPlaces(2)
                .accountCurrencyId("2")
                .accountCurrencyName("US Dollar")
                .accountCurrencySymbol("\$")
                .active(true)
                .build()

        val roundtrippedAutocompleteListAccountsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListAccountsResponse),
                jacksonTypeRef<AutocompleteListAccountsResponse>(),
            )

        assertThat(roundtrippedAutocompleteListAccountsResponse)
            .isEqualTo(autocompleteListAccountsResponse)
    }
}
