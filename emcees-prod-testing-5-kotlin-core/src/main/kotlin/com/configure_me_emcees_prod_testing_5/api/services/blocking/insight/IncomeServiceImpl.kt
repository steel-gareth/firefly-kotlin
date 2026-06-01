// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.insight

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
import com.configure_me_emcees_prod_testing_5.api.core.prepare
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightGroupEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightTotalEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeGetTotalParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByAssetAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByRevenueAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListByTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListWithoutCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.income.IncomeListWithoutTagParams

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
class IncomeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IncomeService {

    private val withRawResponse: IncomeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IncomeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IncomeService =
        IncomeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getTotal(
        params: IncomeGetTotalParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/income/total
        withRawResponse().getTotal(params, requestOptions).parse()

    override fun listByAssetAccount(
        params: IncomeListByAssetAccountParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/income/asset
        withRawResponse().listByAssetAccount(params, requestOptions).parse()

    override fun listByCategory(
        params: IncomeListByCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/income/category
        withRawResponse().listByCategory(params, requestOptions).parse()

    override fun listByRevenueAccount(
        params: IncomeListByRevenueAccountParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/income/revenue
        withRawResponse().listByRevenueAccount(params, requestOptions).parse()

    override fun listByTag(
        params: IncomeListByTagParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/income/tag
        withRawResponse().listByTag(params, requestOptions).parse()

    override fun listWithoutCategory(
        params: IncomeListWithoutCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/income/no-category
        withRawResponse().listWithoutCategory(params, requestOptions).parse()

    override fun listWithoutTag(
        params: IncomeListWithoutTagParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/income/no-tag
        withRawResponse().listWithoutTag(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IncomeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IncomeService.WithRawResponse =
            IncomeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val getTotalHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun getTotal(
            params: IncomeGetTotalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "total")
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

        private val listByAssetAccountHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByAssetAccount(
            params: IncomeListByAssetAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "asset")
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
            params: IncomeListByCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "category")
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

        private val listByRevenueAccountHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByRevenueAccount(
            params: IncomeListByRevenueAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "revenue")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByRevenueAccountHandler.handle(it) }
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
            params: IncomeListByTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "tag")
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
            params: IncomeListWithoutCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "no-category")
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
            params: IncomeListWithoutTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "income", "no-tag")
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
