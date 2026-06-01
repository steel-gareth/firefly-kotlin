// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.usergroups.UserGroupListParams
import com.firefly.api.models.usergroups.UserGroupRetrieveParams
import com.firefly.api.models.usergroups.UserGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val userGroupService = client.userGroups()

        val userGroupSingle =
            userGroupService.retrieve(
                UserGroupRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val userGroupService = client.userGroups()

        val userGroupSingle =
            userGroupService.update(
                UserGroupUpdateParams.builder()
                    .id("1")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .title("New user group title")
                    .primaryCurrencyCode("EUR")
                    .primaryCurrencyId("1")
                    .build()
            )

        userGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val userGroupService = client.userGroups()

        val userGroups =
            userGroupService.list(
                UserGroupListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userGroups.validate()
    }
}
