// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalListLinksParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionSingle
import com.configure_me_emcees_prod_testing_5.api.models.transactionlinks.TransactionLinkArray
import com.google.errorprone.annotations.MustBeClosed

/**
 * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
 * transactions.
 */
interface TransactionJournalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionJournalServiceAsync

    /** Get a single transaction by underlying journal (split). */
    suspend fun retrieve(
        id: String,
        params: TransactionJournalRetrieveParams = TransactionJournalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionJournalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): TransactionSingle =
        retrieve(id, TransactionJournalRetrieveParams.none(), requestOptions)

    /** Delete an individual journal (split) from a transaction. */
    suspend fun delete(
        id: String,
        params: TransactionJournalDeleteParams = TransactionJournalDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TransactionJournalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TransactionJournalDeleteParams.none(), requestOptions)

    /**
     * Lists all the transaction links for an individual journal (a split). Don't use the group ID,
     * you need the actual underlying journal (the split).
     */
    suspend fun listLinks(
        id: String,
        params: TransactionJournalListLinksParams = TransactionJournalListLinksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkArray = listLinks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listLinks */
    suspend fun listLinks(
        params: TransactionJournalListLinksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLinkArray

    /** @see listLinks */
    suspend fun listLinks(id: String, requestOptions: RequestOptions): TransactionLinkArray =
        listLinks(id, TransactionJournalListLinksParams.none(), requestOptions)

    /**
     * A view of [TransactionJournalServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionJournalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transaction-journals/{id}`, but is otherwise the
         * same as [TransactionJournalServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: TransactionJournalRetrieveParams = TransactionJournalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionJournalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> =
            retrieve(id, TransactionJournalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transaction-journals/{id}`, but is otherwise
         * the same as [TransactionJournalServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: TransactionJournalDeleteParams = TransactionJournalDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TransactionJournalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TransactionJournalDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transaction-journals/{id}/links`, but is
         * otherwise the same as [TransactionJournalServiceAsync.listLinks].
         */
        @MustBeClosed
        suspend fun listLinks(
            id: String,
            params: TransactionJournalListLinksParams = TransactionJournalListLinksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkArray> =
            listLinks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listLinks */
        @MustBeClosed
        suspend fun listLinks(
            params: TransactionJournalListLinksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLinkArray>

        /** @see listLinks */
        @MustBeClosed
        suspend fun listLinks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkArray> =
            listLinks(id, TransactionJournalListLinksParams.none(), requestOptions)
    }
}
