// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.chart

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
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.ChartDataSet
import com.configure_me_emcees_prod_testing_5.api.models.chart.category.CategoryRetrieveOverviewParams

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
class CategoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CategoryServiceAsync {

    private val withRawResponse: CategoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CategoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryServiceAsync =
        CategoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieveOverview(
        params: CategoryRetrieveOverviewParams,
        requestOptions: RequestOptions,
    ): List<ChartDataSet> =
        // get /v1/chart/category/overview
        withRawResponse().retrieveOverview(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CategoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CategoryServiceAsync.WithRawResponse =
            CategoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveOverviewHandler: Handler<List<ChartDataSet>> =
            jsonHandler<List<ChartDataSet>>(clientOptions.jsonMapper)

        override suspend fun retrieveOverview(
            params: CategoryRetrieveOverviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ChartDataSet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "chart", "category", "overview")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveOverviewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
