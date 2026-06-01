// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.data

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.prepare
import com.firefly.api.models.data.export.ExportExportAccountsParams
import com.firefly.api.models.data.export.ExportExportBillsParams
import com.firefly.api.models.data.export.ExportExportBudgetsParams
import com.firefly.api.models.data.export.ExportExportCategoriesParams
import com.firefly.api.models.data.export.ExportExportPiggyBanksParams
import com.firefly.api.models.data.export.ExportExportRecurringParams
import com.firefly.api.models.data.export.ExportExportRulesParams
import com.firefly.api.models.data.export.ExportExportTagsParams
import com.firefly.api.models.data.export.ExportExportTransactionsParams

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
class ExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportService {

    private val withRawResponse: ExportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportService =
        ExportServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun exportAccounts(
        params: ExportExportAccountsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/accounts
        withRawResponse().exportAccounts(params, requestOptions)

    override fun exportBills(
        params: ExportExportBillsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/bills
        withRawResponse().exportBills(params, requestOptions)

    override fun exportBudgets(
        params: ExportExportBudgetsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/budgets
        withRawResponse().exportBudgets(params, requestOptions)

    override fun exportCategories(
        params: ExportExportCategoriesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/categories
        withRawResponse().exportCategories(params, requestOptions)

    override fun exportPiggyBanks(
        params: ExportExportPiggyBanksParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/piggy-banks
        withRawResponse().exportPiggyBanks(params, requestOptions)

    override fun exportRecurring(
        params: ExportExportRecurringParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/recurring
        withRawResponse().exportRecurring(params, requestOptions)

    override fun exportRules(
        params: ExportExportRulesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/rules
        withRawResponse().exportRules(params, requestOptions)

    override fun exportTags(
        params: ExportExportTagsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/tags
        withRawResponse().exportTags(params, requestOptions)

    override fun exportTransactions(
        params: ExportExportTransactionsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/transactions
        withRawResponse().exportTransactions(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExportService.WithRawResponse =
            ExportServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun exportAccounts(
            params: ExportExportAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "accounts")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportBills(
            params: ExportExportBillsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "bills")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportBudgets(
            params: ExportExportBudgetsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "budgets")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportCategories(
            params: ExportExportCategoriesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "categories")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportPiggyBanks(
            params: ExportExportPiggyBanksParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "piggy-banks")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportRecurring(
            params: ExportExportRecurringParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "recurring")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportRules(
            params: ExportExportRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "rules")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportTags(
            params: ExportExportTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "tags")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportTransactions(
            params: ExportExportTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "export", "transactions")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
