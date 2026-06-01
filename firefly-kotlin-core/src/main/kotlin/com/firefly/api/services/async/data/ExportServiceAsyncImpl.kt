// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.data

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.prepareAsync
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
class ExportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportServiceAsync {

    private val withRawResponse: ExportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportServiceAsync =
        ExportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun exportAccounts(
        params: ExportExportAccountsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/accounts
        withRawResponse().exportAccounts(params, requestOptions)

    override suspend fun exportBills(
        params: ExportExportBillsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/bills
        withRawResponse().exportBills(params, requestOptions)

    override suspend fun exportBudgets(
        params: ExportExportBudgetsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/budgets
        withRawResponse().exportBudgets(params, requestOptions)

    override suspend fun exportCategories(
        params: ExportExportCategoriesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/categories
        withRawResponse().exportCategories(params, requestOptions)

    override suspend fun exportPiggyBanks(
        params: ExportExportPiggyBanksParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/piggy-banks
        withRawResponse().exportPiggyBanks(params, requestOptions)

    override suspend fun exportRecurring(
        params: ExportExportRecurringParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/recurring
        withRawResponse().exportRecurring(params, requestOptions)

    override suspend fun exportRules(
        params: ExportExportRulesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/rules
        withRawResponse().exportRules(params, requestOptions)

    override suspend fun exportTags(
        params: ExportExportTagsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/tags
        withRawResponse().exportTags(params, requestOptions)

    override suspend fun exportTransactions(
        params: ExportExportTransactionsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/data/export/transactions
        withRawResponse().exportTransactions(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExportServiceAsync.WithRawResponse =
            ExportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override suspend fun exportAccounts(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportBills(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportBudgets(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportCategories(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportPiggyBanks(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportRecurring(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportRules(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportTags(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun exportTransactions(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
