// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.PiggyBankArray
import com.firefly.api.models.bills.BillArray
import com.firefly.api.models.objectgroups.ObjectGroupDeleteParams
import com.firefly.api.models.objectgroups.ObjectGroupListBillsParams
import com.firefly.api.models.objectgroups.ObjectGroupListParams
import com.firefly.api.models.objectgroups.ObjectGroupListPiggyBanksParams
import com.firefly.api.models.objectgroups.ObjectGroupListResponse
import com.firefly.api.models.objectgroups.ObjectGroupRetrieveParams
import com.firefly.api.models.objectgroups.ObjectGroupSingle
import com.firefly.api.models.objectgroups.ObjectGroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
 * conjunction with another object (for example a piggy bank) and will auto-delete when no other
 * items are linked to it.
 */
interface ObjectGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ObjectGroupServiceAsync

    /** Get a single object group. */
    suspend fun retrieve(
        id: String,
        params: ObjectGroupRetrieveParams = ObjectGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ObjectGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): ObjectGroupSingle =
        retrieve(id, ObjectGroupRetrieveParams.none(), requestOptions)

    /** Update existing object group. */
    suspend fun update(
        id: String,
        params: ObjectGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ObjectGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle

    /** List all object groups. */
    suspend fun list(
        params: ObjectGroupListParams = ObjectGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ObjectGroupListResponse =
        list(ObjectGroupListParams.none(), requestOptions)

    /** Delete a object group. */
    suspend fun delete(
        id: String,
        params: ObjectGroupDeleteParams = ObjectGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ObjectGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ObjectGroupDeleteParams.none(), requestOptions)

    /** List all bills with this object group. */
    suspend fun listBills(
        id: String,
        params: ObjectGroupListBillsParams = ObjectGroupListBillsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray = listBills(params.toBuilder().id(id).build(), requestOptions)

    /** @see listBills */
    suspend fun listBills(
        params: ObjectGroupListBillsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray

    /** @see listBills */
    suspend fun listBills(id: String, requestOptions: RequestOptions): BillArray =
        listBills(id, ObjectGroupListBillsParams.none(), requestOptions)

    /** This endpoint returns a list of all the piggy banks connected to the object group. */
    suspend fun listPiggyBanks(
        id: String,
        params: ObjectGroupListPiggyBanksParams = ObjectGroupListPiggyBanksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray = listPiggyBanks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPiggyBanks */
    suspend fun listPiggyBanks(
        params: ObjectGroupListPiggyBanksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray

    /** @see listPiggyBanks */
    suspend fun listPiggyBanks(id: String, requestOptions: RequestOptions): PiggyBankArray =
        listPiggyBanks(id, ObjectGroupListPiggyBanksParams.none(), requestOptions)

    /**
     * A view of [ObjectGroupServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ObjectGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/object-groups/{id}`, but is otherwise the same
         * as [ObjectGroupServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ObjectGroupRetrieveParams = ObjectGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ObjectGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGroupSingle> =
            retrieve(id, ObjectGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/object-groups/{id}`, but is otherwise the same
         * as [ObjectGroupServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: ObjectGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ObjectGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle>

        /**
         * Returns a raw HTTP response for `get /v1/object-groups`, but is otherwise the same as
         * [ObjectGroupServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ObjectGroupListParams = ObjectGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ObjectGroupListResponse> =
            list(ObjectGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/object-groups/{id}`, but is otherwise the
         * same as [ObjectGroupServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: ObjectGroupDeleteParams = ObjectGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ObjectGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ObjectGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/object-groups/{id}/bills`, but is otherwise the
         * same as [ObjectGroupServiceAsync.listBills].
         */
        @MustBeClosed
        suspend fun listBills(
            id: String,
            params: ObjectGroupListBillsParams = ObjectGroupListBillsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray> = listBills(params.toBuilder().id(id).build(), requestOptions)

        /** @see listBills */
        @MustBeClosed
        suspend fun listBills(
            params: ObjectGroupListBillsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray>

        /** @see listBills */
        @MustBeClosed
        suspend fun listBills(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillArray> =
            listBills(id, ObjectGroupListBillsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/object-groups/{id}/piggy-banks`, but is
         * otherwise the same as [ObjectGroupServiceAsync.listPiggyBanks].
         */
        @MustBeClosed
        suspend fun listPiggyBanks(
            id: String,
            params: ObjectGroupListPiggyBanksParams = ObjectGroupListPiggyBanksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray> =
            listPiggyBanks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPiggyBanks */
        @MustBeClosed
        suspend fun listPiggyBanks(
            params: ObjectGroupListPiggyBanksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray>

        /** @see listPiggyBanks */
        @MustBeClosed
        suspend fun listPiggyBanks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankArray> =
            listPiggyBanks(id, ObjectGroupListPiggyBanksParams.none(), requestOptions)
    }
}
