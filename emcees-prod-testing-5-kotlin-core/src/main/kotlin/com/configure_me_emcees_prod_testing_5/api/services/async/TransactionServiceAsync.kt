// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankEventArray
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionSingle
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListPiggyBankEventsParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
 * transactions.
 */
interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync

    /**
     * Creates a new transaction. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle

    /** Get a single transaction. */
    suspend fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): TransactionSingle =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** Update an existing transaction. */
    suspend fun update(
        id: String,
        params: TransactionUpdateParams = TransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): TransactionSingle =
        update(id, TransactionUpdateParams.none(), requestOptions)

    /** List all the user's transactions. */
    suspend fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TransactionArray =
        list(TransactionListParams.none(), requestOptions)

    /** Delete a transaction. */
    suspend fun delete(
        id: String,
        params: TransactionDeleteParams = TransactionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TransactionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TransactionDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    suspend fun listAttachments(
        id: String,
        params: TransactionListAttachmentsParams = TransactionListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: TransactionListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, TransactionListAttachmentsParams.none(), requestOptions)

    /** Lists all piggy bank events. */
    suspend fun listPiggyBankEvents(
        id: String,
        params: TransactionListPiggyBankEventsParams = TransactionListPiggyBankEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankEventArray = listPiggyBankEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPiggyBankEvents */
    suspend fun listPiggyBankEvents(
        params: TransactionListPiggyBankEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankEventArray

    /** @see listPiggyBankEvents */
    suspend fun listPiggyBankEvents(
        id: String,
        requestOptions: RequestOptions,
    ): PiggyBankEventArray =
        listPiggyBankEvents(id, TransactionListPiggyBankEventsParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle>

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{id}`, but is otherwise the same as
         * [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/transactions/{id}`, but is otherwise the same as
         * [TransactionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: TransactionUpdateParams = TransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> =
            update(id, TransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionArray> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/transactions/{id}`, but is otherwise the same
         * as [TransactionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: TransactionDeleteParams = TransactionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TransactionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TransactionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{id}/attachments`, but is otherwise
         * the same as [TransactionServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            params: TransactionListAttachmentsParams = TransactionListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: TransactionListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, TransactionListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{id}/piggy-bank-events`, but is
         * otherwise the same as [TransactionServiceAsync.listPiggyBankEvents].
         */
        @MustBeClosed
        suspend fun listPiggyBankEvents(
            id: String,
            params: TransactionListPiggyBankEventsParams =
                TransactionListPiggyBankEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankEventArray> =
            listPiggyBankEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPiggyBankEvents */
        @MustBeClosed
        suspend fun listPiggyBankEvents(
            params: TransactionListPiggyBankEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankEventArray>

        /** @see listPiggyBankEvents */
        @MustBeClosed
        suspend fun listPiggyBankEvents(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankEventArray> =
            listPiggyBankEvents(id, TransactionListPiggyBankEventsParams.none(), requestOptions)
    }
}
