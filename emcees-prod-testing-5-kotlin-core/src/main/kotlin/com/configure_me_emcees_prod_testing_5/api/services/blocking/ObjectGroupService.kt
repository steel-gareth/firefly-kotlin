// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PiggyBankArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillArray
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListBillsParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListResponse
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupSingle
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
 * conjunction with another object (for example a piggy bank) and will auto-delete when no other
 * items are linked to it.
 */
interface ObjectGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ObjectGroupService

    /** Get a single object group. */
    fun retrieve(
        id: String,
        params: ObjectGroupRetrieveParams = ObjectGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ObjectGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ObjectGroupSingle =
        retrieve(id, ObjectGroupRetrieveParams.none(), requestOptions)

    /** Update existing object group. */
    fun update(
        id: String,
        params: ObjectGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ObjectGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupSingle

    /** List all object groups. */
    fun list(
        params: ObjectGroupListParams = ObjectGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGroupListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): ObjectGroupListResponse =
        list(ObjectGroupListParams.none(), requestOptions)

    /** Delete a object group. */
    fun delete(
        id: String,
        params: ObjectGroupDeleteParams = ObjectGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ObjectGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ObjectGroupDeleteParams.none(), requestOptions)

    /** List all bills with this object group. */
    fun listBills(
        id: String,
        params: ObjectGroupListBillsParams = ObjectGroupListBillsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray = listBills(params.toBuilder().id(id).build(), requestOptions)

    /** @see listBills */
    fun listBills(
        params: ObjectGroupListBillsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray

    /** @see listBills */
    fun listBills(id: String, requestOptions: RequestOptions): BillArray =
        listBills(id, ObjectGroupListBillsParams.none(), requestOptions)

    /** This endpoint returns a list of all the piggy banks connected to the object group. */
    fun listPiggyBanks(
        id: String,
        params: ObjectGroupListPiggyBanksParams = ObjectGroupListPiggyBanksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray = listPiggyBanks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPiggyBanks */
    fun listPiggyBanks(
        params: ObjectGroupListPiggyBanksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray

    /** @see listPiggyBanks */
    fun listPiggyBanks(id: String, requestOptions: RequestOptions): PiggyBankArray =
        listPiggyBanks(id, ObjectGroupListPiggyBanksParams.none(), requestOptions)

    /**
     * A view of [ObjectGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ObjectGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/object-groups/{id}`, but is otherwise the same
         * as [ObjectGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ObjectGroupRetrieveParams = ObjectGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ObjectGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGroupSingle> =
            retrieve(id, ObjectGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/object-groups/{id}`, but is otherwise the same
         * as [ObjectGroupService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ObjectGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ObjectGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupSingle>

        /**
         * Returns a raw HTTP response for `get /v1/object-groups`, but is otherwise the same as
         * [ObjectGroupService.list].
         */
        @MustBeClosed
        fun list(
            params: ObjectGroupListParams = ObjectGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ObjectGroupListResponse> =
            list(ObjectGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/object-groups/{id}`, but is otherwise the
         * same as [ObjectGroupService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: ObjectGroupDeleteParams = ObjectGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ObjectGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ObjectGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/object-groups/{id}/bills`, but is otherwise the
         * same as [ObjectGroupService.listBills].
         */
        @MustBeClosed
        fun listBills(
            id: String,
            params: ObjectGroupListBillsParams = ObjectGroupListBillsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray> = listBills(params.toBuilder().id(id).build(), requestOptions)

        /** @see listBills */
        @MustBeClosed
        fun listBills(
            params: ObjectGroupListBillsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray>

        /** @see listBills */
        @MustBeClosed
        fun listBills(id: String, requestOptions: RequestOptions): HttpResponseFor<BillArray> =
            listBills(id, ObjectGroupListBillsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/object-groups/{id}/piggy-banks`, but is
         * otherwise the same as [ObjectGroupService.listPiggyBanks].
         */
        @MustBeClosed
        fun listPiggyBanks(
            id: String,
            params: ObjectGroupListPiggyBanksParams = ObjectGroupListPiggyBanksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray> =
            listPiggyBanks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPiggyBanks */
        @MustBeClosed
        fun listPiggyBanks(
            params: ObjectGroupListPiggyBanksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray>

        /** @see listPiggyBanks */
        @MustBeClosed
        fun listPiggyBanks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankArray> =
            listPiggyBanks(id, ObjectGroupListPiggyBanksParams.none(), requestOptions)
    }
}
