// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.client

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.getPackageVersion
import com.configure_me_emcees_prod_testing_5.api.services.async.PetServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.PetServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.StoreServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.StoreServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.UserServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.UserServiceAsyncImpl

class MoreConflictingClientAsyncImpl(private val clientOptions: ClientOptions) :
    MoreConflictingClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: MoreConflictingClient by lazy { MoreConflictingClientImpl(clientOptions) }

    private val withRawResponse: MoreConflictingClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): MoreConflictingClient = sync

    override fun withRawResponse(): MoreConflictingClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): MoreConflictingClientAsync =
        MoreConflictingClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Everything about your Pets */
    override fun pets(): PetServiceAsync = pets

    /** Access to Petstore orders */
    override fun store(): StoreServiceAsync = store

    /** Operations about user */
    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MoreConflictingClientAsync.WithRawResponse {

        private val pets: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MoreConflictingClientAsync.WithRawResponse =
            MoreConflictingClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Everything about your Pets */
        override fun pets(): PetServiceAsync.WithRawResponse = pets

        /** Access to Petstore orders */
        override fun store(): StoreServiceAsync.WithRawResponse = store

        /** Operations about user */
        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
