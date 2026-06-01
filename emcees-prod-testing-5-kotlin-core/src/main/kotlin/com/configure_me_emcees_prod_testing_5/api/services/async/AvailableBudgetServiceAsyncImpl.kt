// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
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
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.AvailableBudgetArray
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.AvailableBudgetListParams
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.AvailableBudgetRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.AvailableBudgetRetrieveResponse

/**
 * Endpoints to manage the total available amount that the user has made available to themselves.
 * Used in periodic budgeting.
 */
class AvailableBudgetServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AvailableBudgetServiceAsync {

    private val withRawResponse: AvailableBudgetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AvailableBudgetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): AvailableBudgetServiceAsync =
        AvailableBudgetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: AvailableBudgetRetrieveParams,
        requestOptions: RequestOptions,
    ): AvailableBudgetRetrieveResponse =
        // get /v1/available-budgets/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: AvailableBudgetListParams,
        requestOptions: RequestOptions,
    ): AvailableBudgetArray =
        // get /v1/available-budgets
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvailableBudgetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AvailableBudgetServiceAsync.WithRawResponse =
            AvailableBudgetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AvailableBudgetRetrieveResponse> =
            jsonHandler<AvailableBudgetRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AvailableBudgetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailableBudgetRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "available-budgets", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AvailableBudgetArray> =
            jsonHandler<AvailableBudgetArray>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AvailableBudgetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailableBudgetArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "available-budgets")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
