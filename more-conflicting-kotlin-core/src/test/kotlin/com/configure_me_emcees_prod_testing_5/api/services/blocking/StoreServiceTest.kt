// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.MoreConflictingOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInventory() {
        val client = MoreConflictingOkHttpClient.builder().apiKey("My API Key").build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
