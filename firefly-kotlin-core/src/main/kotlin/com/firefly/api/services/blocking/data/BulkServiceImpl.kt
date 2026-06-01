// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.data

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.emptyHandler
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.http.json
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepare
import com.firefly.api.models.data.bulk.BulkUpdateTransactionsParams

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
class BulkServiceImpl internal constructor(private val clientOptions: ClientOptions) : BulkService {

    private val withRawResponse: BulkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BulkService =
        BulkServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun updateTransactions(
        params: BulkUpdateTransactionsParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/data/bulk/transactions
        withRawResponse().updateTransactions(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BulkService.WithRawResponse =
            BulkServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val updateTransactionsHandler: Handler<Void?> = emptyHandler()

        override fun updateTransactions(
            params: BulkUpdateTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "bulk", "transactions")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateTransactionsHandler.handle(it) }
            }
        }
    }
}
