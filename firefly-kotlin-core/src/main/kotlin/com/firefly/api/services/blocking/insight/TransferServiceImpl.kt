// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.insight

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
import com.firefly.api.models.insight.expense.InsightGroupEntry
import com.firefly.api.models.insight.expense.InsightTotalEntry
import com.firefly.api.models.insight.transfer.TransferGetTotalParams
import com.firefly.api.models.insight.transfer.TransferListByAssetAccountParams
import com.firefly.api.models.insight.transfer.TransferListByAssetAccountResponse
import com.firefly.api.models.insight.transfer.TransferListByCategoryParams
import com.firefly.api.models.insight.transfer.TransferListByTagParams
import com.firefly.api.models.insight.transfer.TransferListWithoutCategoryParams
import com.firefly.api.models.insight.transfer.TransferListWithoutTagParams

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
class TransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransferService {

    private val withRawResponse: TransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransferService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferService =
        TransferServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getTotal(
        params: TransferGetTotalParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/transfer/total
        withRawResponse().getTotal(params, requestOptions).parse()

    override fun listByAssetAccount(
        params: TransferListByAssetAccountParams,
        requestOptions: RequestOptions,
    ): List<TransferListByAssetAccountResponse> =
        // get /v1/insight/transfer/asset
        withRawResponse().listByAssetAccount(params, requestOptions).parse()

    override fun listByCategory(
        params: TransferListByCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/transfer/category
        withRawResponse().listByCategory(params, requestOptions).parse()

    override fun listByTag(
        params: TransferListByTagParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/transfer/tag
        withRawResponse().listByTag(params, requestOptions).parse()

    override fun listWithoutCategory(
        params: TransferListWithoutCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/transfer/no-category
        withRawResponse().listWithoutCategory(params, requestOptions).parse()

    override fun listWithoutTag(
        params: TransferListWithoutTagParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/transfer/no-tag
        withRawResponse().listWithoutTag(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransferService.WithRawResponse =
            TransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getTotalHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun getTotal(
            params: TransferGetTotalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "total")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getTotalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listByAssetAccountHandler: Handler<List<TransferListByAssetAccountResponse>> =
            jsonHandler<List<TransferListByAssetAccountResponse>>(clientOptions.jsonMapper)

        override fun listByAssetAccount(
            params: TransferListByAssetAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TransferListByAssetAccountResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "asset")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByAssetAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listByCategoryHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByCategory(
            params: TransferListByCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "category")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByCategoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listByTagHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByTag(
            params: TransferListByTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "tag")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByTagHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listWithoutCategoryHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun listWithoutCategory(
            params: TransferListWithoutCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "no-category")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWithoutCategoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listWithoutTagHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun listWithoutTag(
            params: TransferListWithoutTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "no-tag")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWithoutTagHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
