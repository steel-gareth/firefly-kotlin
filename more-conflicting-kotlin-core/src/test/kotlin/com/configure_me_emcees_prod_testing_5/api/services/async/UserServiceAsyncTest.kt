// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.MoreConflictingOkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.users.User
import com.configure_me_emcees_prod_testing_5.api.models.users.UserLoginParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.create(
                User.builder()
                    .id(10L)
                    .email("john@email.com")
                    .firstName("John")
                    .lastName("James")
                    .password("12345")
                    .phone("12345")
                    .username("theUser")
                    .userStatus(1)
                    .build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user = userServiceAsync.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.update(
            UserUpdateParams.builder()
                .existingUsername("username")
                .user(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createWithList() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.createWithList(
                listOf(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun login() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun logout() {
        val client = MoreConflictingOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.logout()
    }
}
