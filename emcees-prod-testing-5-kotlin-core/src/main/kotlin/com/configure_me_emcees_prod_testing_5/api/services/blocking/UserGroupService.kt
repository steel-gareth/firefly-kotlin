// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupListParams
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupListResponse
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupSingle
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** User groups are the objects around which &quot;financial administrations&quot; are built. */
interface UserGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserGroupService

    /** Returns a single user group by its ID. */
    fun retrieve(
        id: String,
        params: UserGroupRetrieveParams = UserGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserGroupSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: UserGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserGroupSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): UserGroupSingle =
        retrieve(id, UserGroupRetrieveParams.none(), requestOptions)

    /** Used to update a single user group. The available fields are still limited. */
    fun update(
        id: String,
        params: UserGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserGroupSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: UserGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserGroupSingle

    /**
     * List all the user groups available to this user. These are essentially the 'financial
     * administrations' that Firefly III supports.
     */
    fun list(
        params: UserGroupListParams = UserGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserGroupListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): UserGroupListResponse =
        list(UserGroupListParams.none(), requestOptions)

    /** A view of [UserGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/user-groups/{id}`, but is otherwise the same as
         * [UserGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UserGroupRetrieveParams = UserGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserGroupSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserGroupSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<UserGroupSingle> =
            retrieve(id, UserGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/user-groups/{id}`, but is otherwise the same as
         * [UserGroupService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: UserGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserGroupSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserGroupSingle>

        /**
         * Returns a raw HTTP response for `get /v1/user-groups`, but is otherwise the same as
         * [UserGroupService.list].
         */
        @MustBeClosed
        fun list(
            params: UserGroupListParams = UserGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserGroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserGroupListResponse> =
            list(UserGroupListParams.none(), requestOptions)
    }
}
