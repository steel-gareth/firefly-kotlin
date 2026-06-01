// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.recurrences.RecurrenceArray
import com.firefly.api.models.recurrences.RecurrenceCreateParams
import com.firefly.api.models.recurrences.RecurrenceDeleteParams
import com.firefly.api.models.recurrences.RecurrenceListParams
import com.firefly.api.models.recurrences.RecurrenceListTransactionsParams
import com.firefly.api.models.recurrences.RecurrenceRetrieveParams
import com.firefly.api.models.recurrences.RecurrenceSingle
import com.firefly.api.models.recurrences.RecurrenceTriggerTransactionParams
import com.firefly.api.models.recurrences.RecurrenceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Use these endpoints to manage the user&#039;s recurring transactions, trigger the creation of
 * transactions and manage the settings.
 */
interface RecurrenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RecurrenceService

    /**
     * Creates a new recurring transaction. The data required can be submitted as a JSON body or as
     * a list of parameters.
     */
    fun create(
        params: RecurrenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceSingle

    /** Get a single recurring transaction. */
    fun retrieve(
        id: String,
        params: RecurrenceRetrieveParams = RecurrenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: RecurrenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RecurrenceSingle =
        retrieve(id, RecurrenceRetrieveParams.none(), requestOptions)

    /** Update existing recurring transaction. */
    fun update(
        id: String,
        params: RecurrenceUpdateParams = RecurrenceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: RecurrenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): RecurrenceSingle =
        update(id, RecurrenceUpdateParams.none(), requestOptions)

    /** List all recurring transactions. */
    fun list(
        params: RecurrenceListParams = RecurrenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecurrenceArray

    /** @see list */
    fun list(requestOptions: RequestOptions): RecurrenceArray =
        list(RecurrenceListParams.none(), requestOptions)

    /**
     * Delete a recurring transaction. Transactions created by the recurring transaction will not be
     * deleted.
     */
    fun delete(
        id: String,
        params: RecurrenceDeleteParams = RecurrenceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: RecurrenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RecurrenceDeleteParams.none(), requestOptions)

    /**
     * List all transactions created by a recurring transaction, optionally limited to the date
     * ranges specified.
     */
    fun listTransactions(
        id: String,
        params: RecurrenceListTransactionsParams = RecurrenceListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: RecurrenceListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, RecurrenceListTransactionsParams.none(), requestOptions)

    /**
     * Trigger the creation of a transaction for a specific recurring transaction. All recurrences
     * have a set of future occurrences. For those moments, you can trigger the creation of the
     * transaction. That means the transaction will be created NOW, instead of on the indicated
     * date. The transaction will be dated to _today_.
     *
     * So, if you recurring transaction that occurs every Monday, you can trigger the creation of a
     * transaction for Monday in two weeks, today. On that Monday two weeks from now, no transaction
     * will be created. Instead, the transaction is created right now, and dated _today_.
     */
    fun triggerTransaction(
        id: String,
        params: RecurrenceTriggerTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = triggerTransaction(params.toBuilder().id(id).build(), requestOptions)

    /** @see triggerTransaction */
    fun triggerTransaction(
        params: RecurrenceTriggerTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** A view of [RecurrenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RecurrenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/recurrences`, but is otherwise the same as
         * [RecurrenceService.create].
         */
        @MustBeClosed
        fun create(
            params: RecurrenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceSingle>

        /**
         * Returns a raw HTTP response for `get /v1/recurrences/{id}`, but is otherwise the same as
         * [RecurrenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RecurrenceRetrieveParams = RecurrenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RecurrenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecurrenceSingle> =
            retrieve(id, RecurrenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/recurrences/{id}`, but is otherwise the same as
         * [RecurrenceService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: RecurrenceUpdateParams = RecurrenceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: RecurrenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<RecurrenceSingle> =
            update(id, RecurrenceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/recurrences`, but is otherwise the same as
         * [RecurrenceService.list].
         */
        @MustBeClosed
        fun list(
            params: RecurrenceListParams = RecurrenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecurrenceArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RecurrenceArray> =
            list(RecurrenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/recurrences/{id}`, but is otherwise the same
         * as [RecurrenceService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: RecurrenceDeleteParams = RecurrenceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RecurrenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RecurrenceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/recurrences/{id}/transactions`, but is otherwise
         * the same as [RecurrenceService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            id: String,
            params: RecurrenceListTransactionsParams = RecurrenceListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: RecurrenceListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, RecurrenceListTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/recurrences/{id}/trigger`, but is otherwise the
         * same as [RecurrenceService.triggerTransaction].
         */
        @MustBeClosed
        fun triggerTransaction(
            id: String,
            params: RecurrenceTriggerTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            triggerTransaction(params.toBuilder().id(id).build(), requestOptions)

        /** @see triggerTransaction */
        @MustBeClosed
        fun triggerTransaction(
            params: RecurrenceTriggerTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>
    }
}
