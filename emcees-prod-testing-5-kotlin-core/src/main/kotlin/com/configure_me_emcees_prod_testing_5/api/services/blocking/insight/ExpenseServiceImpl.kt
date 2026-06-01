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
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseGetTotalParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListByAssetAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListByBillParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListByBudgetParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListByCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListByExpenseAccountParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListByTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListWithoutBillParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListWithoutBudgetParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListWithoutCategoryParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.ExpenseListWithoutTagParams
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightGroupEntry
import com.configure_me_emcees_prod_testing_5.api.models.insight.expense.InsightTotalEntry

/**
 * The &quot;insight&quot; endpoints try to deliver sums, balances and insightful information in the
 * broadest sense of the word.
 */
class ExpenseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExpenseService {

    private val withRawResponse: ExpenseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExpenseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExpenseService =
        ExpenseServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getTotal(
        params: ExpenseGetTotalParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/expense/total
        withRawResponse().getTotal(params, requestOptions).parse()

    override fun listByAssetAccount(
        params: ExpenseListByAssetAccountParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/expense/asset
        withRawResponse().listByAssetAccount(params, requestOptions).parse()

    override fun listByBill(
        params: ExpenseListByBillParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/expense/bill
        withRawResponse().listByBill(params, requestOptions).parse()

    override fun listByBudget(
        params: ExpenseListByBudgetParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/expense/budget
        withRawResponse().listByBudget(params, requestOptions).parse()

    override fun listByCategory(
        params: ExpenseListByCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/expense/category
        withRawResponse().listByCategory(params, requestOptions).parse()

    override fun listByExpenseAccount(
        params: ExpenseListByExpenseAccountParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/expense/expense
        withRawResponse().listByExpenseAccount(params, requestOptions).parse()

    override fun listByTag(
        params: ExpenseListByTagParams,
        requestOptions: RequestOptions,
    ): List<InsightGroupEntry> =
        // get /v1/insight/expense/tag
        withRawResponse().listByTag(params, requestOptions).parse()

    override fun listWithoutBill(
        params: ExpenseListWithoutBillParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/expense/no-bill
        withRawResponse().listWithoutBill(params, requestOptions).parse()

    override fun listWithoutBudget(
        params: ExpenseListWithoutBudgetParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/expense/no-budget
        withRawResponse().listWithoutBudget(params, requestOptions).parse()

    override fun listWithoutCategory(
        params: ExpenseListWithoutCategoryParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/expense/no-category
        withRawResponse().listWithoutCategory(params, requestOptions).parse()

    override fun listWithoutTag(
        params: ExpenseListWithoutTagParams,
        requestOptions: RequestOptions,
    ): List<InsightTotalEntry> =
        // get /v1/insight/expense/no-tag
        withRawResponse().listWithoutTag(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExpenseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExpenseService.WithRawResponse =
            ExpenseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getTotalHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun getTotal(
            params: ExpenseGetTotalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "total")
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
            params: ExpenseListByAssetAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "asset")
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

        private val listByBillHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByBill(
            params: ExpenseListByBillParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "bill")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByBillHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listByBudgetHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByBudget(
            params: ExpenseListByBudgetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "budget")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByBudgetHandler.handle(it) }
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
            params: ExpenseListByCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "category")
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

        private val listByExpenseAccountHandler: Handler<List<InsightGroupEntry>> =
            jsonHandler<List<InsightGroupEntry>>(clientOptions.jsonMapper)

        override fun listByExpenseAccount(
            params: ExpenseListByExpenseAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "expense")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByExpenseAccountHandler.handle(it) }
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
            params: ExpenseListByTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightGroupEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "tag")
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

        private val listWithoutBillHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun listWithoutBill(
            params: ExpenseListWithoutBillParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "no-bill")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWithoutBillHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val listWithoutBudgetHandler: Handler<List<InsightTotalEntry>> =
            jsonHandler<List<InsightTotalEntry>>(clientOptions.jsonMapper)

        override fun listWithoutBudget(
            params: ExpenseListWithoutBudgetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "no-budget")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWithoutBudgetHandler.handle(it) }
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
            params: ExpenseListWithoutCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "no-category")
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
            params: ExpenseListWithoutTagParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<InsightTotalEntry>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "insight", "expense", "no-tag")
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
