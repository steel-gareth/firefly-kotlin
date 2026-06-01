// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.transactionlinks.TransactionLinkArray
import com.firefly.api.models.transactionlinks.TransactionLinkCreateParams
import com.firefly.api.models.transactionlinks.TransactionLinkDeleteParams
import com.firefly.api.models.transactionlinks.TransactionLinkListParams
import com.firefly.api.models.transactionlinks.TransactionLinkRetrieveParams
import com.firefly.api.models.transactionlinks.TransactionLinkSingle
import com.firefly.api.models.transactionlinks.TransactionLinkUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage links between transactions, and manage the type of links available. */
interface TransactionLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionLinkServiceAsync

    /**
     * Store a new link between two transactions. For this end point you need the journal_id from a
     * transaction.
     */
    suspend fun create(
        params: TransactionLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle

    /** Returns a single link by its ID. */
    suspend fun retrieve(
        id: String,
        params: TransactionLinkRetrieveParams = TransactionLinkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): TransactionLinkSingle =
        retrieve(id, TransactionLinkRetrieveParams.none(), requestOptions)

    /** Used to update a single existing link. */
    suspend fun update(
        id: String,
        params: TransactionLinkUpdateParams = TransactionLinkUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TransactionLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): TransactionLinkSingle =
        update(id, TransactionLinkUpdateParams.none(), requestOptions)

    /** List all the transaction links. */
    suspend fun list(
        params: TransactionLinkListParams = TransactionLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TransactionLinkArray =
        list(TransactionLinkListParams.none(), requestOptions)

    /** Will permanently delete link. Transactions remain. */
    suspend fun delete(
        id: String,
        params: TransactionLinkDeleteParams = TransactionLinkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TransactionLinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TransactionLinkDeleteParams.none(), requestOptions)

    /**
     * A view of [TransactionLinkServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transaction-links`, but is otherwise the same
         * as [TransactionLinkServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TransactionLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle>

        /**
         * Returns a raw HTTP response for `get /v1/transaction-links/{id}`, but is otherwise the
         * same as [TransactionLinkServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: TransactionLinkRetrieveParams = TransactionLinkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> =
            retrieve(id, TransactionLinkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/transaction-links/{id}`, but is otherwise the
         * same as [TransactionLinkServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: TransactionLinkUpdateParams = TransactionLinkUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TransactionLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> =
            update(id, TransactionLinkUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction-links`, but is otherwise the same as
         * [TransactionLinkServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionLinkListParams = TransactionLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionLinkArray> =
            list(TransactionLinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transaction-links/{id}`, but is otherwise the
         * same as [TransactionLinkServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: TransactionLinkDeleteParams = TransactionLinkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TransactionLinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TransactionLinkDeleteParams.none(), requestOptions)
    }
}
