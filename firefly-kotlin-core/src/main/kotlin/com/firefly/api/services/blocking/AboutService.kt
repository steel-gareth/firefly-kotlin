// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.about.AboutRetrieveInfoParams
import com.firefly.api.models.about.AboutRetrieveInfoResponse
import com.firefly.api.models.about.AboutRetrieveUserParams
import com.firefly.api.models.about.UserSingle
import com.google.errorprone.annotations.MustBeClosed

/** These endpoints deliver general system information, version- and meta information. */
interface AboutService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AboutService

    /** Returns general system information and versions of the (supporting) software. */
    fun retrieveInfo(
        params: AboutRetrieveInfoParams = AboutRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AboutRetrieveInfoResponse

    /** @see retrieveInfo */
    fun retrieveInfo(requestOptions: RequestOptions): AboutRetrieveInfoResponse =
        retrieveInfo(AboutRetrieveInfoParams.none(), requestOptions)

    /** Returns the currently authenticated user. */
    fun retrieveUser(
        params: AboutRetrieveUserParams = AboutRetrieveUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** @see retrieveUser */
    fun retrieveUser(requestOptions: RequestOptions): UserSingle =
        retrieveUser(AboutRetrieveUserParams.none(), requestOptions)

    /** A view of [AboutService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AboutService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/about`, but is otherwise the same as
         * [AboutService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(
            params: AboutRetrieveInfoParams = AboutRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AboutRetrieveInfoResponse>

        /** @see retrieveInfo */
        @MustBeClosed
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<AboutRetrieveInfoResponse> =
            retrieveInfo(AboutRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/about/user`, but is otherwise the same as
         * [AboutService.retrieveUser].
         */
        @MustBeClosed
        fun retrieveUser(
            params: AboutRetrieveUserParams = AboutRetrieveUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /** @see retrieveUser */
        @MustBeClosed
        fun retrieveUser(requestOptions: RequestOptions): HttpResponseFor<UserSingle> =
            retrieveUser(AboutRetrieveUserParams.none(), requestOptions)
    }
}
