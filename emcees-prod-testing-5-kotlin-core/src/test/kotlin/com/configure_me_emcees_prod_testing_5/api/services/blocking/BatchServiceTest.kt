// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.batch.BatchFinishParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun finish() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val batchService = client.batch()

        batchService.finish(
            BatchFinishParams.builder().xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
        )
    }
}
