// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.handlers.jsonHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepare
import com.firefly.api.models.accounts.AccountArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.search.SearchAccountsParams
import com.firefly.api.models.search.SearchTransactionsParams

/**
 * Endpoints that allow you to search through the user&#039;s financial data. Different from the
 * autocomplete endpoints, the search accepts more advanced arguments.
 */
class SearchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SearchService {

    private val withRawResponse: SearchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SearchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SearchService =
        SearchServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun accounts(
        params: SearchAccountsParams,
        requestOptions: RequestOptions,
    ): AccountArray =
        // get /v1/search/accounts
        withRawResponse().accounts(params, requestOptions).parse()

    override fun transactions(
        params: SearchTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/search/transactions
        withRawResponse().transactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SearchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SearchService.WithRawResponse =
            SearchServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val accountsHandler: Handler<AccountArray> =
            jsonHandler<AccountArray>(clientOptions.jsonMapper)

        override fun accounts(
            params: SearchAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "search", "accounts")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { accountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transactionsHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override fun transactions(
            params: SearchTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "search", "transactions")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
