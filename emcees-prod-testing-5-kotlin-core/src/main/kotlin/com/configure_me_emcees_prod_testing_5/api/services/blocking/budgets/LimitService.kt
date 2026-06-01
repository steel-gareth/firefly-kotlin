// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.budgets

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.BudgetLimitArray
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.BudgetLimitSingle
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitList0Params
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitList1Params
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.budgets.limits.LimitUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits. */
interface LimitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LimitService

    /** Store a new budget limit under this budget. */
    fun create(
        id: String,
        params: LimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        params: LimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle

    /** Get single budget limit. */
    fun retrieve(
        limitId: Long,
        params: LimitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle = retrieve(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LimitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle

    /** Update existing budget limit. */
    fun update(
        limitId: String,
        params: LimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle = update(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see update */
    fun update(
        params: LimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitSingle

    /** Delete a budget limit. */
    fun delete(
        limitId: String,
        params: LimitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see delete */
    fun delete(params: LimitDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Get all budget limits for this budget and the money spent, and money left. You can limit the
     * list by submitting a date range as well. The "spent" array for each budget limit is NOT
     * influenced by the start and end date of your query, but by the start and end date of the
     * budget limit itself.
     */
    fun list0(
        id: String,
        params: LimitList0Params = LimitList0Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray = list0(params.toBuilder().id(id).build(), requestOptions)

    /** @see list0 */
    fun list0(
        params: LimitList0Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray

    /** @see list0 */
    fun list0(id: String, requestOptions: RequestOptions): BudgetLimitArray =
        list0(id, LimitList0Params.none(), requestOptions)

    /** Get all budget limits for for this date range. */
    fun list1(
        params: LimitList1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetLimitArray

    /**
     * List all the transactions within one budget limit. The start and end date are dictated by the
     * budget limit.
     */
    fun listTransactions(
        limitId: String,
        params: LimitListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray =
        listTransactions(params.toBuilder().limitId(limitId).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: LimitListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** A view of [LimitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LimitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/budgets/{id}/limits`, but is otherwise the same
         * as [LimitService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: LimitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: LimitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle>

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/limits/{limitId}`, but is otherwise
         * the same as [LimitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            limitId: Long,
            params: LimitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle> =
            retrieve(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LimitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle>

        /**
         * Returns a raw HTTP response for `put /v1/budgets/{id}/limits/{limitId}`, but is otherwise
         * the same as [LimitService.update].
         */
        @MustBeClosed
        fun update(
            limitId: String,
            params: LimitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle> =
            update(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LimitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitSingle>

        /**
         * Returns a raw HTTP response for `delete /v1/budgets/{id}/limits/{limitId}`, but is
         * otherwise the same as [LimitService.delete].
         */
        @MustBeClosed
        fun delete(
            limitId: String,
            params: LimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/limits`, but is otherwise the same
         * as [LimitService.list0].
         */
        @MustBeClosed
        fun list0(
            id: String,
            params: LimitList0Params = LimitList0Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray> =
            list0(params.toBuilder().id(id).build(), requestOptions)

        /** @see list0 */
        @MustBeClosed
        fun list0(
            params: LimitList0Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray>

        /** @see list0 */
        @MustBeClosed
        fun list0(id: String, requestOptions: RequestOptions): HttpResponseFor<BudgetLimitArray> =
            list0(id, LimitList0Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/budget-limits`, but is otherwise the same as
         * [LimitService.list1].
         */
        @MustBeClosed
        fun list1(
            params: LimitList1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetLimitArray>

        /**
         * Returns a raw HTTP response for `get /v1/budgets/{id}/limits/{limitId}/transactions`, but
         * is otherwise the same as [LimitService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            limitId: String,
            params: LimitListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().limitId(limitId).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: LimitListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>
    }
}
