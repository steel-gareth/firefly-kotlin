// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.about.AboutRetrieveInfoParams
import com.firefly.api.models.about.AboutRetrieveInfoResponse
import com.firefly.api.models.about.AboutRetrieveUserParams
import com.firefly.api.models.about.UserSingle
import com.google.errorprone.annotations.MustBeClosed

/** These endpoints deliver general system information, version- and meta information. */
interface AboutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AboutServiceAsync

    /** Returns general system information and versions of the (supporting) software. */
    suspend fun retrieveInfo(
        params: AboutRetrieveInfoParams = AboutRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AboutRetrieveInfoResponse

    /** @see retrieveInfo */
    suspend fun retrieveInfo(requestOptions: RequestOptions): AboutRetrieveInfoResponse =
        retrieveInfo(AboutRetrieveInfoParams.none(), requestOptions)

    /** Returns the currently authenticated user. */
    suspend fun retrieveUser(
        params: AboutRetrieveUserParams = AboutRetrieveUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** @see retrieveUser */
    suspend fun retrieveUser(requestOptions: RequestOptions): UserSingle =
        retrieveUser(AboutRetrieveUserParams.none(), requestOptions)

    /** A view of [AboutServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AboutServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/about`, but is otherwise the same as
         * [AboutServiceAsync.retrieveInfo].
         */
        @MustBeClosed
        suspend fun retrieveInfo(
            params: AboutRetrieveInfoParams = AboutRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AboutRetrieveInfoResponse>

        /** @see retrieveInfo */
        @MustBeClosed
        suspend fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<AboutRetrieveInfoResponse> =
            retrieveInfo(AboutRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/about/user`, but is otherwise the same as
         * [AboutServiceAsync.retrieveUser].
         */
        @MustBeClosed
        suspend fun retrieveUser(
            params: AboutRetrieveUserParams = AboutRetrieveUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /** @see retrieveUser */
        @MustBeClosed
        suspend fun retrieveUser(requestOptions: RequestOptions): HttpResponseFor<UserSingle> =
            retrieveUser(AboutRetrieveUserParams.none(), requestOptions)
    }
}
