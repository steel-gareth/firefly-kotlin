// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.objectgroups.ObjectGroupDeleteParams
import com.firefly.api.models.objectgroups.ObjectGroupListBillsParams
import com.firefly.api.models.objectgroups.ObjectGroupListParams
import com.firefly.api.models.objectgroups.ObjectGroupListPiggyBanksParams
import com.firefly.api.models.objectgroups.ObjectGroupRetrieveParams
import com.firefly.api.models.objectgroups.ObjectGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ObjectGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val objectGroupService = client.objectGroups()

        val objectGroupSingle =
            objectGroupService.retrieve(
                ObjectGroupRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        objectGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val objectGroupService = client.objectGroups()

        val objectGroupSingle =
            objectGroupService.update(
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
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val objectGroupService = client.objectGroups()

        val objectGroups =
            objectGroupService.list(
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
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val objectGroupService = client.objectGroups()

        objectGroupService.delete(
            ObjectGroupDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBills() {
        val client = FireflyOkHttpClient.fromEnv()
        val objectGroupService = client.objectGroups()

        val billArray =
            objectGroupService.listBills(
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
    fun listPiggyBanks() {
        val client = FireflyOkHttpClient.fromEnv()
        val objectGroupService = client.objectGroups()

        val piggyBankArray =
            objectGroupService.listPiggyBanks(
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
