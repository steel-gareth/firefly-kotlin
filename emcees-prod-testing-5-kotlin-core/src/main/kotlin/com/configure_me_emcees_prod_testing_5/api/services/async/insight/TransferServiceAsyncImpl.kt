// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.insight

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorBodyHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.jsonHandler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpMethod
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpRequest
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse.Handler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.core.http.parseable
import com.configure_me_emcees_prod_testing_5.api.core.prepareAsync
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightGroupEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightTotalEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferGetTotalParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByAssetAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByAssetAccountResponse
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListByTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListWithoutCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.transfer.TransferListWithoutTagParams

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
class TransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransferServiceAsync {

    private val withRawResponse: TransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferServiceAsync =
        TransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun getTotal(
        params: TransferGetTotalParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/transfer/total
        withRawResponse().getTotal(params, requestOptions).parse()

    override suspend fun listByAssetAccount(
        params: TransferListByAssetAccountParams,
        requestOptions: RequestOptions,
    ): List<TransferListByAssetAccountResponse> =
        // get /v1/insight/transfer/asset
        withRawResponse().listByAssetAccount(params, requestOptions).parse()

    override suspend fun listByCategory(
        params: TransferListByCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/transfer/category
        withRawResponse().listByCategory(params, requestOptions).parse()

    override suspend fun listByTag(
        params: TransferListByTagParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/transfer/tag
        withRawResponse().listByTag(params, requestOptions).parse()

    override suspend fun listWithoutCategory(
        params: TransferListWithoutCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/transfer/no-category
        withRawResponse().listWithoutCategory(params, requestOptions).parse()

    override suspend fun listWithoutTag(
        params: TransferListWithoutTagParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/transfer/no-tag
        withRawResponse().listWithoutTag(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransferServiceAsync.WithRawResponse =
            TransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getTotalHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override suspend fun getTotal(
            params: TransferGetTotalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "total")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listByAssetAccount(
            params: TransferListByAssetAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TransferListByAssetAccountResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "asset")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listByCategory(
            params: TransferListByCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "category")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listByTag(
            params: TransferListByTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "tag")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listWithoutCategory(
            params: TransferListWithoutCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "no-category")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun listWithoutTag(
            params: TransferListWithoutTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "transfer", "no-tag")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
