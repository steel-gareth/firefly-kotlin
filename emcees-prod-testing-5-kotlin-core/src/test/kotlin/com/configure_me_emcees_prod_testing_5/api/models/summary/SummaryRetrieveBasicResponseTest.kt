// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.summary

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SummaryRetrieveBasicResponseTest {

    @Test
    fun create() {
        val summaryRetrieveBasicResponse =
            SummaryRetrieveBasicResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "currency_code" to "EUR",
                            "currency_decimal_places" to 2,
                            "currency_id" to "5",
                            "currency_symbol" to "\$",
                            "key" to "balance-in-EUR",
                            "local_icon" to "balance-scale",
                            "monetary_value" to 123.45,
                            "no_available_budgets" to false,
                            "sub_title" to "\$20 + \$-40",
                            "title" to "Balance (\$)",
                            "value_parsed" to "\$ 12.45",
                        )
                    ),
                )
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val summaryRetrieveBasicResponse =
            SummaryRetrieveBasicResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "currency_code" to "EUR",
                            "currency_decimal_places" to 2,
                            "currency_id" to "5",
                            "currency_symbol" to "\$",
                            "key" to "balance-in-EUR",
                            "local_icon" to "balance-scale",
                            "monetary_value" to 123.45,
                            "no_available_budgets" to false,
                            "sub_title" to "\$20 + \$-40",
                            "title" to "Balance (\$)",
                            "value_parsed" to "\$ 12.45",
                        )
                    ),
                )
                .build()

        val roundtrippedSummaryRetrieveBasicResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(summaryRetrieveBasicResponse),
                jacksonTypeRef<SummaryRetrieveBasicResponse>(),
            )

        assertThat(roundtrippedSummaryRetrieveBasicResponse).isEqualTo(summaryRetrieveBasicResponse)
    }
}
