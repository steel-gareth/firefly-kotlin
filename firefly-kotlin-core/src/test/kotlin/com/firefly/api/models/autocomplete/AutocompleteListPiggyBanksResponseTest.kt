// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListPiggyBanksResponseTest {

    @Test
    fun create() {
        val autocompleteListPiggyBanksResponse =
            AutocompleteListPiggyBanksResponse.builder()
                .id("2")
                .name("New couch")
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("12")
                .currencyName("Euro")
                .currencySymbol("\$")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .build()

        assertThat(autocompleteListPiggyBanksResponse.id()).isEqualTo("2")
        assertThat(autocompleteListPiggyBanksResponse.name()).isEqualTo("New couch")
        assertThat(autocompleteListPiggyBanksResponse.currencyCode()).isEqualTo("EUR")
        assertThat(autocompleteListPiggyBanksResponse.currencyDecimalPlaces()).isEqualTo(2)
        assertThat(autocompleteListPiggyBanksResponse.currencyId()).isEqualTo("12")
        assertThat(autocompleteListPiggyBanksResponse.currencyName()).isEqualTo("Euro")
        assertThat(autocompleteListPiggyBanksResponse.currencySymbol()).isEqualTo("\$")
        assertThat(autocompleteListPiggyBanksResponse.objectGroupId()).isEqualTo("5")
        assertThat(autocompleteListPiggyBanksResponse.objectGroupTitle()).isEqualTo("Example Group")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListPiggyBanksResponse =
            AutocompleteListPiggyBanksResponse.builder()
                .id("2")
                .name("New couch")
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("12")
                .currencyName("Euro")
                .currencySymbol("\$")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .build()

        val roundtrippedAutocompleteListPiggyBanksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListPiggyBanksResponse),
                jacksonTypeRef<AutocompleteListPiggyBanksResponse>(),
            )

        assertThat(roundtrippedAutocompleteListPiggyBanksResponse)
            .isEqualTo(autocompleteListPiggyBanksResponse)
    }
}
