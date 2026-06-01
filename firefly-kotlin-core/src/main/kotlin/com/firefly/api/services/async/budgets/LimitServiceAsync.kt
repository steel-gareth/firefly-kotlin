// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.budgets

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.budgets.limits.BudgetLimitArray
import com.firefly.api.models.budgets.limits.BudgetLimitSingle
import com.firefly.api.models.budgets.limits.LimitCreateParams
import com.firefly.api.models.budgets.limits.LimitDeleteParams
import com.firefly.api.models.budgets.limits.LimitList0Params
import com.firefly.api.models.budgets.limits.LimitList1Params
import com.firefly.api.models.budgets.limits.LimitListTransactionsParams
import com.firefly.api.models.budgets.limits.LimitRetrieveParams
import com.firefly.api.models.budgets.limits.LimitUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits. */
interface LimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LimitServiceAsync

    /** Store a new budget limit under this budget. */
    suspend fun create(
        id: String,
        params: LimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: LimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle

    /** Get single budget limit. */
    suspend fun retrieve(
        limitId: Long,
        params: LimitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle = retrieve(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LimitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle

    /** Update existing budget limit. */
    suspend fun update(
        limitId: String,
        params: LimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle = update(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle

    /** Delete a budget limit. */
    suspend fun delete(
        limitId: String,
        params: LimitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: LimitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Get all budget limits for this budget and the money spent, and money left. You can limit the
     * list by submitting a date range as well. The "spent" array for each budget limit is NOT
     * influenced by the start and end date of your query, but by the start and end date of the
     * budget limit itself.
     */
    suspend fun list0(
        id: String,
        params: LimitList0Params = LimitList0Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray = list0(params.toBuilder().id(id).build(), requestOptions)

    /** @see list0 */
    suspend fun list0(
        params: LimitList0Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray

    /** @see list0 */
    suspend fun list0(id: String, requestOptions: RequestOptions): BudgetLimitArray =
        list0(id, LimitList0Params.none(), requestOptions)

    /** Get all budget limits for for this date range. */
    suspend fun list1(
        params: LimitList1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray

    /**
     * List all the transactions within one budget limit. The start and end date are dictated by the
     * budget limit.
     */
    suspend fun listTransactions(
        limitId: String,
        params: LimitListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray =
        listTransactions(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: LimitListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** A view of [LimitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/budgets/{id}/limits`, but is otherwise the same
         * as [LimitServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            id: String,
            params: LimitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: LimitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle>

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/limits/{limitId}`, but is otherwise
         * the same as [LimitServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            limitId: Long,
            params: LimitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle> =
            retrieve(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LimitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle>

        /**
         * Returns a raw HTTP response for `put /v1/budgets/{id}/limits/{limitId}`, but is otherwise
         * the same as [LimitServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            limitId: String,
            params: LimitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle> =
            update(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LimitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle>

        /**
         * Returns a raw HTTP response for `delete /v1/budgets/{id}/limits/{limitId}`, but is
         * otherwise the same as [LimitServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            limitId: String,
            params: LimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: LimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/limits`, but is otherwise the same
         * as [LimitServiceAsync.list0].
         */
        @MustBeClosed
        suspend fun list0(
            id: String,
            params: LimitList0Params = LimitList0Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray> =
            list0(params.toBuilder().id(id).build(), requestOptions)

        /** @see list0 */
        @MustBeClosed
        suspend fun list0(
            params: LimitList0Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray>

        /** @see list0 */
        @MustBeClosed
        suspend fun list0(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BudgetLimitArray> = list0(id, LimitList0Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budget-limits`, but is otherwise the same as
         * [LimitServiceAsync.list1].
         */
        @MustBeClosed
        suspend fun list1(
            params: LimitList1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray>

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/limits/{limitId}/transactions`, but
         * is otherwise the same as [LimitServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            limitId: String,
            params: LimitListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: LimitListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>
    }
}
