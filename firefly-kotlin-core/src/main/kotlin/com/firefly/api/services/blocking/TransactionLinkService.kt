// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

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
interface TransactionLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionLinkService

    /**
     * Store a new link between two transactions. For this end point you need the journal_id from a
     * transaction.
     */
    fun create(
        params: TransactionLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle

    /** Returns a single link by its ID. */
    fun retrieve(
        id: String,
        params: TransactionLinkRetrieveParams = TransactionLinkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: TransactionLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TransactionLinkSingle =
        retrieve(id, TransactionLinkRetrieveParams.none(), requestOptions)

    /** Used to update a single existing link. */
    fun update(
        id: String,
        params: TransactionLinkUpdateParams = TransactionLinkUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: TransactionLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): TransactionLinkSingle =
        update(id, TransactionLinkUpdateParams.none(), requestOptions)

    /** List all the transaction links. */
    fun list(
        params: TransactionLinkListParams = TransactionLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkArray

    /** @see list */
    fun list(requestOptions: RequestOptions): TransactionLinkArray =
        list(TransactionLinkListParams.none(), requestOptions)

    /** Will permanently delete link. Transactions remain. */
    fun delete(
        id: String,
        params: TransactionLinkDeleteParams = TransactionLinkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: TransactionLinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TransactionLinkDeleteParams.none(), requestOptions)

    /**
     * A view of [TransactionLinkService] that provides access to raw HTTP responses for each
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
        ): TransactionLinkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transaction-links`, but is otherwise the same
         * as [TransactionLinkService.create].
         */
        @MustBeClosed
        fun create(
            params: TransactionLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle>

        /**
         * Returns a raw HTTP response for `get /v1/transaction-links/{id}`, but is otherwise the
         * same as [TransactionLinkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionLinkRetrieveParams = TransactionLinkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> =
            retrieve(id, TransactionLinkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/transaction-links/{id}`, but is otherwise the
         * same as [TransactionLinkService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: TransactionLinkUpdateParams = TransactionLinkUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TransactionLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkSingle>

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkSingle> =
            update(id, TransactionLinkUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction-links`, but is otherwise the same as
         * [TransactionLinkService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionLinkListParams = TransactionLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionLinkArray> =
            list(TransactionLinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transaction-links/{id}`, but is otherwise the
         * same as [TransactionLinkService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransactionLinkDeleteParams = TransactionLinkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TransactionLinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TransactionLinkDeleteParams.none(), requestOptions)
    }
}
