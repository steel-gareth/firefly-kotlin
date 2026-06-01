// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.linktypes.LinkType
import com.firefly.api.models.linktypes.LinkTypeCreateParams
import com.firefly.api.models.linktypes.LinkTypeDeleteParams
import com.firefly.api.models.linktypes.LinkTypeListParams
import com.firefly.api.models.linktypes.LinkTypeListResponse
import com.firefly.api.models.linktypes.LinkTypeListTransactionsParams
import com.firefly.api.models.linktypes.LinkTypeRetrieveParams
import com.firefly.api.models.linktypes.LinkTypeSingle
import com.firefly.api.models.linktypes.LinkTypeUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage links between transactions, and manage the type of links available. */
interface LinkTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LinkTypeServiceAsync

    /**
     * Creates a new link type. The data required can be submitted as a JSON body or as a list of
     * parameters (in key=value pairs, like a webform).
     */
    suspend fun create(
        params: LinkTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle

    /** @see create */
    suspend fun create(
        linkType: LinkType,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle =
        create(LinkTypeCreateParams.builder().linkType(linkType).build(), requestOptions)

    /** Returns a single link type by its ID. */
    suspend fun retrieve(
        id: String,
        params: LinkTypeRetrieveParams = LinkTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LinkTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LinkTypeSingle =
        retrieve(id, LinkTypeRetrieveParams.none(), requestOptions)

    /**
     * Used to update a single link type. All fields that are not submitted will be cleared (set to
     * NULL). The model will tell you which fields are mandatory. You cannot update some of the
     * system provided link types, indicated by the editable=false flag when you list it.
     */
    suspend fun update(
        id: String,
        params: LinkTypeUpdateParams = LinkTypeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LinkTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): LinkTypeSingle =
        update(id, LinkTypeUpdateParams.none(), requestOptions)

    /**
     * List all the link types the system has. These include the default ones as well as any new
     * ones.
     */
    suspend fun list(
        params: LinkTypeListParams = LinkTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkTypeListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LinkTypeListResponse =
        list(LinkTypeListParams.none(), requestOptions)

    /**
     * Will permanently delete a link type. The links between transactions will be removed. The
     * transactions themselves remain. You cannot delete some of the system provided link types,
     * indicated by the editable=false flag when you list it.
     */
    suspend fun delete(
        id: String,
        params: LinkTypeDeleteParams = LinkTypeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: LinkTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LinkTypeDeleteParams.none(), requestOptions)

    /** List all transactions under this link type, both the inward and outward transactions. */
    suspend fun listTransactions(
        id: String,
        params: LinkTypeListTransactionsParams = LinkTypeListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: LinkTypeListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, LinkTypeListTransactionsParams.none(), requestOptions)

    /**
     * A view of [LinkTypeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LinkTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/link-types`, but is otherwise the same as
         * [LinkTypeServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LinkTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            linkType: LinkType,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle> =
            create(LinkTypeCreateParams.builder().linkType(linkType).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/link-types/{id}`, but is otherwise the same as
         * [LinkTypeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LinkTypeRetrieveParams = LinkTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LinkTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkTypeSingle> =
            retrieve(id, LinkTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/link-types/{id}`, but is otherwise the same as
         * [LinkTypeServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LinkTypeUpdateParams = LinkTypeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LinkTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkTypeSingle> = update(id, LinkTypeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/link-types`, but is otherwise the same as
         * [LinkTypeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LinkTypeListParams = LinkTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkTypeListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<LinkTypeListResponse> =
            list(LinkTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/link-types/{id}`, but is otherwise the same
         * as [LinkTypeServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: LinkTypeDeleteParams = LinkTypeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: LinkTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LinkTypeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/link-types/{id}/transactions`, but is otherwise
         * the same as [LinkTypeServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            params: LinkTypeListTransactionsParams = LinkTypeListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: LinkTypeListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, LinkTypeListTransactionsParams.none(), requestOptions)
    }
}
