// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.objectgroups.ObjectGroupDeleteParams
import com.firefly.api.models.objectgroups.ObjectGroupListBillsParams
import com.firefly.api.models.objectgroups.ObjectGroupListParams
import com.firefly.api.models.objectgroups.ObjectGroupListPiggyBanksParams
import com.firefly.api.models.objectgroups.ObjectGroupRetrieveParams
import com.firefly.api.models.objectgroups.ObjectGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ObjectGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val objectGroupServiceAsync = client.objectGroups()

        val objectGroupSingle =
            objectGroupServiceAsync.retrieve(
                ObjectGroupRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        objectGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val objectGroupServiceAsync = client.objectGroups()

        val objectGroupSingle =
            objectGroupServiceAsync.update(
                ObjectGroupUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .title("My object group")
                    .order(1)
                    .build()
            )

        objectGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val objectGroupServiceAsync = client.objectGroups()

        val objectGroups =
            objectGroupServiceAsync.list(
                ObjectGroupListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        objectGroups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val objectGroupServiceAsync = client.objectGroups()

        objectGroupServiceAsync.delete(
            ObjectGroupDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listBills() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val objectGroupServiceAsync = client.objectGroups()

        val billArray =
            objectGroupServiceAsync.listBills(
                ObjectGroupListBillsParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        billArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listPiggyBanks() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val objectGroupServiceAsync = client.objectGroups()

        val piggyBankArray =
            objectGroupServiceAsync.listPiggyBanks(
                ObjectGroupListPiggyBanksParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankArray.validate()
    }
}
