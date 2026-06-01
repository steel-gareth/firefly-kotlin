// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.budgets.BudgetCreateParams
import com.firefly.api.models.budgets.BudgetDeleteParams
import com.firefly.api.models.budgets.BudgetListAttachmentsParams
import com.firefly.api.models.budgets.BudgetListParams
import com.firefly.api.models.budgets.BudgetListResponse
import com.firefly.api.models.budgets.BudgetListTransactionsParams
import com.firefly.api.models.budgets.BudgetListTransactionsWithoutBudgetParams
import com.firefly.api.models.budgets.BudgetRetrieveParams
import com.firefly.api.models.budgets.BudgetSingle
import com.firefly.api.models.budgets.BudgetUpdateParams
import com.firefly.api.services.async.budgets.LimitServiceAsync
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits. */
interface BudgetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetServiceAsync

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    fun limits(): LimitServiceAsync

    /**
     * Creates a new budget. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle

    /**
     * Get a single budget. If the start date and end date are submitted as well, the "spent" array
     * will be updated accordingly.
     */
    suspend fun retrieve(
        id: String,
        params: BudgetRetrieveParams = BudgetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: BudgetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): BudgetSingle =
        retrieve(id, BudgetRetrieveParams.none(), requestOptions)

    /** Update existing budget. This endpoint cannot be used to set budget amount limits. */
    suspend fun update(
        id: String,
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle

    /**
     * List all the budgets the user has made. If the start date and end date are submitted as well,
     * the "spent" array will be updated accordingly.
     */
    suspend fun list(
        params: BudgetListParams = BudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): BudgetListResponse =
        list(BudgetListParams.none(), requestOptions)

    /** Delete a budget. Transactions will not be deleted. */
    suspend fun delete(
        id: String,
        params: BudgetDeleteParams = BudgetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BudgetDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    suspend fun listAttachments(
        id: String,
        params: BudgetListAttachmentsParams = BudgetListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: BudgetListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, BudgetListAttachmentsParams.none(), requestOptions)

    /** Get all transactions linked to a budget, possibly limited by start and end */
    suspend fun listTransactions(
        id: String,
        params: BudgetListTransactionsParams = BudgetListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: BudgetListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, BudgetListTransactionsParams.none(), requestOptions)

    /** Get all transactions NOT linked to a budget, possibly limited by start and end */
    suspend fun listTransactionsWithoutBudget(
        params: BudgetListTransactionsWithoutBudgetParams =
            BudgetListTransactionsWithoutBudgetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactionsWithoutBudget */
    suspend fun listTransactionsWithoutBudget(requestOptions: RequestOptions): TransactionArray =
        listTransactionsWithoutBudget(
            BudgetListTransactionsWithoutBudgetParams.none(),
            requestOptions,
        )

    /**
     * A view of [BudgetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BudgetServiceAsync.WithRawResponse

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        fun limits(): LimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/budgets`, but is otherwise the same as
         * [BudgetServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle>

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}`, but is otherwise the same as
         * [BudgetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: BudgetRetrieveParams = BudgetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BudgetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetSingle> = retrieve(id, BudgetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/budgets/{id}`, but is otherwise the same as
         * [BudgetServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle>

        /**
         * Returns a raw HTTP response for `get /v1/budgets`, but is otherwise the same as
         * [BudgetServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BudgetListParams = BudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BudgetListResponse> =
            list(BudgetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/budgets/{id}`, but is otherwise the same as
         * [BudgetServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: BudgetDeleteParams = BudgetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BudgetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/attachments`, but is otherwise the
         * same as [BudgetServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            params: BudgetListAttachmentsParams = BudgetListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: BudgetListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, BudgetListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/transactions`, but is otherwise the
         * same as [BudgetServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            params: BudgetListTransactionsParams = BudgetListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: BudgetListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, BudgetListTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budgets/transactions-without-budget`, but is
         * otherwise the same as [BudgetServiceAsync.listTransactionsWithoutBudget].
         */
        @MustBeClosed
        suspend fun listTransactionsWithoutBudget(
            params: BudgetListTransactionsWithoutBudgetParams =
                BudgetListTransactionsWithoutBudgetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactionsWithoutBudget */
        @MustBeClosed
        suspend fun listTransactionsWithoutBudget(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionArray> =
            listTransactionsWithoutBudget(
                BudgetListTransactionsWithoutBudgetParams.none(),
                requestOptions,
            )
    }
}
