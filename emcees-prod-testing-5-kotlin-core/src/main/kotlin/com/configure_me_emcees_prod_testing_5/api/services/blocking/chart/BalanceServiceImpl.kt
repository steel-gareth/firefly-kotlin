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
import com.configure_me_emcees_prod_testing_5.api.models.chart.balance.BalanceRetrieveBalanceParams

/** The &quot;charts&quot; endpoints deliver optimised data for charts and graphs. */
class BalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceService {

    private val withRawResponse: BalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService =
        BalanceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveBalance(
        params: BalanceRetrieveBalanceParams,
        requestOptions: RequestOptions,
    ): List<ChartDataSet> =
        // get /v1/chart/balance/balance
        withRawResponse().retrieveBalance(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceService.WithRawResponse =
            BalanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveBalanceHandler: Handler<List<ChartDataSet>> =
            jsonHandler<List<ChartDataSet>>(clientOptions.jsonMapper)

        override fun retrieveBalance(
            params: BalanceRetrieveBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ChartDataSet>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "chart", "balance", "balance")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveBalanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
