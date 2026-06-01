// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.AccountArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.search.SearchAccountsParams
import com.firefly.api.models.search.SearchTransactionsParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints that allow you to search through the user&#039;s financial data. Different from the
 * autocomplete endpoints, the search accepts more advanced arguments.
 */
interface SearchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchService

    /** Search for accounts */
    fun accounts(
        params: SearchAccountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountArray

    /** Searches through the users transactions. */
    fun transactions(
        params: SearchTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** A view of [SearchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/search/accounts`, but is otherwise the same as
         * [SearchService.accounts].
         */
        @MustBeClosed
        fun accounts(
            params: SearchAccountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountArray>

        /**
         * Returns a raw HTTP response for `get /v1/search/transactions`, but is otherwise the same
         * as [SearchService.transactions].
         */
        @MustBeClosed
        fun transactions(
            params: SearchTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>
    }
}
