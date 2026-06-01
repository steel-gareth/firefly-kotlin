// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

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
import com.firefly.api.services.blocking.budgets.LimitService
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits. */
interface BudgetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetService

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    fun limits(): LimitService

    /**
     * Creates a new budget. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle

    /**
     * Get a single budget. If the start date and end date are submitted as well, the "spent" array
     * will be updated accordingly.
     */
    fun retrieve(
        id: String,
        params: BudgetRetrieveParams = BudgetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BudgetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BudgetSingle =
        retrieve(id, BudgetRetrieveParams.none(), requestOptions)

    /** Update existing budget. This endpoint cannot be used to set budget amount limits. */
    fun update(
        id: String,
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSingle

    /**
     * List all the budgets the user has made. If the start date and end date are submitted as well,
     * the "spent" array will be updated accordingly.
     */
    fun list(
        params: BudgetListParams = BudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): BudgetListResponse =
        list(BudgetListParams.none(), requestOptions)

    /** Delete a budget. Transactions will not be deleted. */
    fun delete(
        id: String,
        params: BudgetDeleteParams = BudgetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: BudgetDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BudgetDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    fun listAttachments(
        id: String,
        params: BudgetListAttachmentsParams = BudgetListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    fun listAttachments(
        params: BudgetListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, BudgetListAttachmentsParams.none(), requestOptions)

    /** Get all transactions linked to a budget, possibly limited by start and end */
    fun listTransactions(
        id: String,
        params: BudgetListTransactionsParams = BudgetListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: BudgetListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, BudgetListTransactionsParams.none(), requestOptions)

    /** Get all transactions NOT linked to a budget, possibly limited by start and end */
    fun listTransactionsWithoutBudget(
        params: BudgetListTransactionsWithoutBudgetParams =
            BudgetListTransactionsWithoutBudgetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactionsWithoutBudget */
    fun listTransactionsWithoutBudget(requestOptions: RequestOptions): TransactionArray =
        listTransactionsWithoutBudget(
            BudgetListTransactionsWithoutBudgetParams.none(),
            requestOptions,
        )

    /** A view of [BudgetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetService.WithRawResponse

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        fun limits(): LimitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/budgets`, but is otherwise the same as
         * [BudgetService.create].
         */
        @MustBeClosed
        fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle>

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}`, but is otherwise the same as
         * [BudgetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BudgetRetrieveParams = BudgetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BudgetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BudgetSingle> =
            retrieve(id, BudgetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/budgets/{id}`, but is otherwise the same as
         * [BudgetService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSingle>

        /**
         * Returns a raw HTTP response for `get /v1/budgets`, but is otherwise the same as
         * [BudgetService.list].
         */
        @MustBeClosed
        fun list(
            params: BudgetListParams = BudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BudgetListResponse> =
            list(BudgetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/budgets/{id}`, but is otherwise the same as
         * [BudgetService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BudgetDeleteParams = BudgetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BudgetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/attachments`, but is otherwise the
         * same as [BudgetService.listAttachments].
         */
        @MustBeClosed
        fun listAttachments(
            id: String,
            params: BudgetListAttachmentsParams = BudgetListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            params: BudgetListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, BudgetListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/transactions`, but is otherwise the
         * same as [BudgetService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            id: String,
            params: BudgetListTransactionsParams = BudgetListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: BudgetListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, BudgetListTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budgets/transactions-without-budget`, but is
         * otherwise the same as [BudgetService.listTransactionsWithoutBudget].
         */
        @MustBeClosed
        fun listTransactionsWithoutBudget(
            params: BudgetListTransactionsWithoutBudgetParams =
                BudgetListTransactionsWithoutBudgetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactionsWithoutBudget */
        @MustBeClosed
        fun listTransactionsWithoutBudget(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionArray> =
            listTransactionsWithoutBudget(
                BudgetListTransactionsWithoutBudgetParams.none(),
                requestOptions,
            )
    }
}
