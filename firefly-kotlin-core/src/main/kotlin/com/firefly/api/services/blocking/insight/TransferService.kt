// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.insight

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.insight.expense.InsightGroupEntry
import com.firefly.api.models.insight.expense.InsightTotalEntry
import com.firefly.api.models.insight.transfer.TransferGetTotalParams
import com.firefly.api.models.insight.transfer.TransferListByAssetAccountParams
import com.firefly.api.models.insight.transfer.TransferListByAssetAccountResponse
import com.firefly.api.models.insight.transfer.TransferListByCategoryParams
import com.firefly.api.models.insight.transfer.TransferListByTagParams
import com.firefly.api.models.insight.transfer.TransferListWithoutCategoryParams
import com.firefly.api.models.insight.transfer.TransferListWithoutTagParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
interface TransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferService

    /** This endpoint gives a sum of the total amount transfers made by the user. */
    fun getTotal(
        params: TransferGetTotalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the transfers made by the user, grouped by asset account or
     * lability.
     */
    fun listByAssetAccount(
        params: TransferListByAssetAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TransferListByAssetAccountResponse>

    /**
     * This endpoint gives a summary of the transfers made by the user, grouped by (any) category.
     */
    fun listByCategory(
        params: TransferListByCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /** This endpoint gives a summary of the transfers created by the user, grouped by (any) tag. */
    fun listByTag(
        params: TransferListByTagParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightGroupEntry>

    /**
     * This endpoint gives a summary of the transfers made by the user, including only transfers
     * with no category.
     */
    fun listWithoutCategory(
        params: TransferListWithoutCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /**
     * This endpoint gives a summary of the transfers made by the user, including only transfers
     * with no tag.
     */
    fun listWithoutTag(
        params: TransferListWithoutTagParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<InsightTotalEntry>

    /** A view of [TransferService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/insight/transfer/total`, but is otherwise the
         * same as [TransferService.getTotal].
         */
        @MustBeClosed
        fun getTotal(
            params: TransferGetTotalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/transfer/asset`, but is otherwise the
         * same as [TransferService.listByAssetAccount].
         */
        @MustBeClosed
        fun listByAssetAccount(
            params: TransferListByAssetAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TransferListByAssetAccountResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/transfer/category`, but is otherwise the
         * same as [TransferService.listByCategory].
         */
        @MustBeClosed
        fun listByCategory(
            params: TransferListByCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/transfer/tag`, but is otherwise the same
         * as [TransferService.listByTag].
         */
        @MustBeClosed
        fun listByTag(
            params: TransferListByTagParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightGroupEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/transfer/no-category`, but is otherwise
         * the same as [TransferService.listWithoutCategory].
         */
        @MustBeClosed
        fun listWithoutCategory(
            params: TransferListWithoutCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>

        /**
         * Returns a raw HTTP response for `get /v1/insight/transfer/no-tag`, but is otherwise the
         * same as [TransferService.listWithoutTag].
         */
        @MustBeClosed
        fun listWithoutTag(
            params: TransferListWithoutTagParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<InsightTotalEntry>>
    }
}
