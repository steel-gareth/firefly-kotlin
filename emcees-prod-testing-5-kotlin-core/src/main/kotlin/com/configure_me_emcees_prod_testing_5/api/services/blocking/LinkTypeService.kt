// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkType
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeListParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeListResponse
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeSingle
import com.configure_me_emcees_prod_testing_5.api.models.linktypes.LinkTypeUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage links between transactions, and manage the type of links available. */
interface LinkTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LinkTypeService

    /**
     * Creates a new link type. The data required can be submitted as a JSON body or as a list of
     * parameters (in key=value pairs, like a webform).
     */
    fun create(
        params: LinkTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle

    /** @see create */
    fun create(
        linkType: LinkType,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle =
        create(LinkTypeCreateParams.builder().linkType(linkType).build(), requestOptions)

    /** Returns a single link type by its ID. */
    fun retrieve(
        id: String,
        params: LinkTypeRetrieveParams = LinkTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LinkTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LinkTypeSingle =
        retrieve(id, LinkTypeRetrieveParams.none(), requestOptions)

    /**
     * Used to update a single link type. All fields that are not submitted will be cleared (set to
     * NULL). The model will tell you which fields are mandatory. You cannot update some of the
     * system provided link types, indicated by the editable=false flag when you list it.
     */
    fun update(
        id: String,
        params: LinkTypeUpdateParams = LinkTypeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: LinkTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): LinkTypeSingle =
        update(id, LinkTypeUpdateParams.none(), requestOptions)

    /**
     * List all the link types the system has. These include the default ones as well as any new
     * ones.
     */
    fun list(
        params: LinkTypeListParams = LinkTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): LinkTypeListResponse =
        list(LinkTypeListParams.none(), requestOptions)

    /**
     * Will permanently delete a link type. The links between transactions will be removed. The
     * transactions themselves remain. You cannot delete some of the system provided link types,
     * indicated by the editable=false flag when you list it.
     */
    fun delete(
        id: String,
        params: LinkTypeDeleteParams = LinkTypeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: LinkTypeDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LinkTypeDeleteParams.none(), requestOptions)

    /** List all transactions under this link type, both the inward and outward transactions. */
    fun listTransactions(
        id: String,
        params: LinkTypeListTransactionsParams = LinkTypeListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: LinkTypeListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, LinkTypeListTransactionsParams.none(), requestOptions)

    /** A view of [LinkTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LinkTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/link-types`, but is otherwise the same as
         * [LinkTypeService.create].
         */
        @MustBeClosed
        fun create(
            params: LinkTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle>

        /** @see create */
        @MustBeClosed
        fun create(
            linkType: LinkType,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle> =
            create(LinkTypeCreateParams.builder().linkType(linkType).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/link-types/{id}`, but is otherwise the same as
         * [LinkTypeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LinkTypeRetrieveParams = LinkTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LinkTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<LinkTypeSingle> =
            retrieve(id, LinkTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/link-types/{id}`, but is otherwise the same as
         * [LinkTypeService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LinkTypeUpdateParams = LinkTypeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LinkTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<LinkTypeSingle> =
            update(id, LinkTypeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/link-types`, but is otherwise the same as
         * [LinkTypeService.list].
         */
        @MustBeClosed
        fun list(
            params: LinkTypeListParams = LinkTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LinkTypeListResponse> =
            list(LinkTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/link-types/{id}`, but is otherwise the same
         * as [LinkTypeService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: LinkTypeDeleteParams = LinkTypeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LinkTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LinkTypeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/link-types/{id}/transactions`, but is otherwise
         * the same as [LinkTypeService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            id: String,
            params: LinkTypeListTransactionsParams = LinkTypeListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: LinkTypeListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, LinkTypeListTransactionsParams.none(), requestOptions)
    }
}
