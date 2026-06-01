// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.about.UserSingle
import com.firefly.api.models.users.User
import com.firefly.api.models.users.UserCreateParams
import com.firefly.api.models.users.UserDeleteParams
import com.firefly.api.models.users.UserListParams
import com.firefly.api.models.users.UserListResponse
import com.firefly.api.models.users.UserRetrieveParams
import com.firefly.api.models.users.UserUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Use these endpoints to manage the users registered within Firefly III. You need to have the
 * &quot;owner&quot; role to access these endpoints.
 */
interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    /**
     * Creates a new user. The data required can be submitted as a JSON body or as a list of
     * parameters. The user will be given a random password, which they can reset using the "forgot
     * password" function.
     */
    suspend fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** @see create */
    suspend fun create(
        user: User,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle = create(UserCreateParams.builder().user(user).build(), requestOptions)

    /** Gets all info of a single user. */
    suspend fun retrieve(
        id: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): UserSingle =
        retrieve(id, UserRetrieveParams.none(), requestOptions)

    /** Update existing user. */
    suspend fun update(
        id: String,
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** List all the users in this instance of Firefly III. */
    suspend fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): UserListResponse =
        list(UserListParams.none(), requestOptions)

    /**
     * Delete a user. You cannot delete the user you're authenticated with. This cannot be undone.
     * Be careful.
     */
    suspend fun delete(
        id: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, UserDeleteParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/users`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            user: User,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle> =
            create(UserCreateParams.builder().user(user).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/users/{id}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserSingle> = retrieve(id, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/users/{id}`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /**
         * Returns a raw HTTP response for `get /v1/users`, but is otherwise the same as
         * [UserServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<UserListResponse> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/users/{id}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, UserDeleteParams.none(), requestOptions)
    }
}
