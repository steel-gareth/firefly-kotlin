// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.summary.SummaryRetrieveBasicParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SummaryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveBasic() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val summaryService = client.summary()

        val response =
            summaryService.retrieveBasic(
                SummaryRetrieveBasicParams.builder()
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .currencyCode("currency_code")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.validate()
    }
}
