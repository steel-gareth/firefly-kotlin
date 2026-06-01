// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.availablebudgets

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArrayEntryWithCurrencyAndSumTest {

    @Test
    fun create() {
        val arrayEntryWithCurrencyAndSum =
            ArrayEntryWithCurrencyAndSum.builder()
                .currencyCode("USD")
                .currencyDecimalPlaces(2)
                .currencyId("5")
                .currencySymbol("\$")
                .sum("123.45")
                .build()

        assertThat(arrayEntryWithCurrencyAndSum.currencyCode()).isEqualTo("USD")
        assertThat(arrayEntryWithCurrencyAndSum.currencyDecimalPlaces()).isEqualTo(2)
        assertThat(arrayEntryWithCurrencyAndSum.currencyId()).isEqualTo("5")
        assertThat(arrayEntryWithCurrencyAndSum.currencySymbol()).isEqualTo("\$")
        assertThat(arrayEntryWithCurrencyAndSum.sum()).isEqualTo("123.45")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val arrayEntryWithCurrencyAndSum =
            ArrayEntryWithCurrencyAndSum.builder()
                .currencyCode("USD")
                .currencyDecimalPlaces(2)
                .currencyId("5")
                .currencySymbol("\$")
                .sum("123.45")
                .build()

        val roundtrippedArrayEntryWithCurrencyAndSum =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(arrayEntryWithCurrencyAndSum),
                jacksonTypeRef<ArrayEntryWithCurrencyAndSum>(),
            )

        assertThat(roundtrippedArrayEntryWithCurrencyAndSum).isEqualTo(arrayEntryWithCurrencyAndSum)
    }
}
