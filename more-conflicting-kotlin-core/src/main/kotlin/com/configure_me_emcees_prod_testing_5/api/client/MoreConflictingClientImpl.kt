// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.client

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.getPackageVersion
import com.configure_me_emcees_prod_testing_5.api.services.blocking.PetService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.PetServiceImpl
import com.configure_me_emcees_prod_testing_5.api.services.blocking.StoreService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.StoreServiceImpl
import com.configure_me_emcees_prod_testing_5.api.services.blocking.UserService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.UserServiceImpl

class MoreConflictingClientImpl(private val clientOptions: ClientOptions) : MoreConflictingClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: MoreConflictingClientAsync by lazy {
        MoreConflictingClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: MoreConflictingClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): MoreConflictingClientAsync = async

    override fun withRawResponse(): MoreConflictingClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MoreConflictingClient =
        MoreConflictingClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Everything about your Pets */
    override fun pets(): PetService = pets

    /** Access to Petstore orders */
    override fun store(): StoreService = store

    /** Operations about user */
    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MoreConflictingClient.WithRawResponse {

        private val pets: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MoreConflictingClient.WithRawResponse =
            MoreConflictingClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Everything about your Pets */
        override fun pets(): PetService.WithRawResponse = pets

        /** Access to Petstore orders */
        override fun store(): StoreService.WithRawResponse = store

        /** Operations about user */
        override fun users(): UserService.WithRawResponse = users
    }
}
