// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.about.UserSingle
import com.configure_me_emcees_prod_testing_5.api.models.users.User
import com.configure_me_emcees_prod_testing_5.api.models.users.UserCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserListParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserListResponse
import com.configure_me_emcees_prod_testing_5.api.models.users.UserRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.users.UserUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Use these endpoints to manage the users registered within Firefly III. You need to have the
 * &quot;owner&quot; role to access these endpoints.
 */
interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    /**
     * Creates a new user. The data required can be submitted as a JSON body or as a list of
     * parameters. The user will be given a random password, which they can reset using the "forgot
     * password" function.
     */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** @see create */
    fun create(user: User, requestOptions: RequestOptions = RequestOptions.none()): UserSingle =
        create(UserCreateParams.builder().user(user).build(), requestOptions)

    /** Gets all info of a single user. */
    fun retrieve(
        id: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): UserSingle =
        retrieve(id, UserRetrieveParams.none(), requestOptions)

    /** Update existing user. */
    fun update(
        id: String,
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserSingle

    /** List all the users in this instance of Firefly III. */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): UserListResponse =
        list(UserListParams.none(), requestOptions)

    /**
     * Delete a user. You cannot delete the user you're authenticated with. This cannot be undone.
     * Be careful.
     */
    fun delete(
        id: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, UserDeleteParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/users`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /** @see create */
        @MustBeClosed
        fun create(
            user: User,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle> =
            create(UserCreateParams.builder().user(user).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/users/{id}`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<UserSingle> =
            retrieve(id, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/users/{id}`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserSingle>

        /**
         * Returns a raw HTTP response for `get /v1/users`, but is otherwise the same as
         * [UserService.list].
         */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserListResponse> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/users/{id}`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, UserDeleteParams.none(), requestOptions)
    }
}
