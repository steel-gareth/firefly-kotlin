// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupListParams
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
