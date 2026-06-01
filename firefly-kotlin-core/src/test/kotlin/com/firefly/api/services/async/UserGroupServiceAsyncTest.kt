// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.usergroups.UserGroupListParams
import com.firefly.api.models.usergroups.UserGroupRetrieveParams
import com.firefly.api.models.usergroups.UserGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val userGroupServiceAsync = client.userGroups()

        val userGroupSingle =
            userGroupServiceAsync.retrieve(
                UserGroupRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userGroupSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val userGroupServiceAsync = client.userGroups()

        val userGroupSingle =
            userGroupServiceAsync.update(
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
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val userGroupServiceAsync = client.userGroups()

        val userGroups =
            userGroupServiceAsync.list(
                UserGroupListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        userGroups.validate()
    }
}
