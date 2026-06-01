// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.autocomplete

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutocompleteBillTest {

    @Test
    fun create() {
        val autocompleteBill =
            AutocompleteBill.builder().id("2").name("Yearly bill").active(true).build()

        assertThat(autocompleteBill.id()).isEqualTo("2")
        assertThat(autocompleteBill.name()).isEqualTo("Yearly bill")
        assertThat(autocompleteBill.active()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteBill =
            AutocompleteBill.builder().id("2").name("Yearly bill").active(true).build()

        val roundtrippedAutocompleteBill =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteBill),
                jacksonTypeRef<AutocompleteBill>(),
            )

        assertThat(roundtrippedAutocompleteBill).isEqualTo(autocompleteBill)
    }
}
