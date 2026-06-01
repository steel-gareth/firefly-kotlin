// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.chart

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
import com.configure_me_emcees_prod_testing_5.api.models.chart.account.ChartDataSet
import com.configure_me_emcees_prod_testing_5.api.models.chart.budget.BudgetRetrieveOverviewParams

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
class BudgetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BudgetService {

    private val withRawResponse: BudgetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BudgetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BudgetService =
        BudgetServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveOverview(
        params: BudgetRetrieveOverviewParams,
        requestOptions: RequestOptions,
    ): List<ChartDataSet> =
        // get /v1/chart/budget/overview
        withRawResponse().retrieveOverview(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BudgetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BudgetService.WithRawResponse =
            BudgetServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveOverviewHandler: Handler<List<ChartDataSet>> =
            jsonHandler<List<ChartDataSet>>(clientOptions.jsonMapper)

        override fun retrieveOverview(
            params: BudgetRetrieveOverviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ChartDataSet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "chart", "budget", "overview")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
