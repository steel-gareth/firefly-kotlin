// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteListPiggyBanksWithBalanceResponseTest {

    @Test
    fun create() {
        val autocompleteListPiggyBanksWithBalanceResponse =
            AutocompleteListPiggyBanksWithBalanceResponse.builder()
                .id("2")
                .name("New couch")
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("12")
                .currencySymbol("\$")
                .nameWithBalance("New couch (\$234.56 / \$600)")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .build()

        assertThat(autocompleteListPiggyBanksWithBalanceResponse.id()).isEqualTo("2")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.name()).isEqualTo("New couch")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.currencyCode()).isEqualTo("EUR")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.currencyDecimalPlaces())
            .isEqualTo(2)
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.currencyId()).isEqualTo("12")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.currencySymbol()).isEqualTo("\$")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.nameWithBalance())
            .isEqualTo("New couch (\$234.56 / \$600)")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.objectGroupId()).isEqualTo("5")
        assertThat(autocompleteListPiggyBanksWithBalanceResponse.objectGroupTitle())
            .isEqualTo("Example Group")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteListPiggyBanksWithBalanceResponse =
            AutocompleteListPiggyBanksWithBalanceResponse.builder()
                .id("2")
                .name("New couch")
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("12")
                .currencySymbol("\$")
                .nameWithBalance("New couch (\$234.56 / \$600)")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .build()

        val roundtrippedAutocompleteListPiggyBanksWithBalanceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteListPiggyBanksWithBalanceResponse),
                jacksonTypeRef<AutocompleteListPiggyBanksWithBalanceResponse>(),
            )

        assertThat(roundtrippedAutocompleteListPiggyBanksWithBalanceResponse)
            .isEqualTo(autocompleteListPiggyBanksWithBalanceResponse)
    }
}
