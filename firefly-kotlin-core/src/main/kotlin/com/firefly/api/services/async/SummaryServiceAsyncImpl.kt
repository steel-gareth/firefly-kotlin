// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

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
import com.firefly.api.core.prepareAsync
import com.firefly.api.models.summary.SummaryRetrieveBasicParams
import com.firefly.api.models.summary.SummaryRetrieveBasicResponse

/**
 * These endpoints deliver summaries, like sums, lists of numbers and other processed information.
 * Mainly used for the main dashboard and pretty specific for Firefly III itself.
 */
class SummaryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SummaryServiceAsync {

    private val withRawResponse: SummaryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SummaryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SummaryServiceAsync =
        SummaryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieveBasic(
        params: SummaryRetrieveBasicParams,
        requestOptions: RequestOptions,
    ): SummaryRetrieveBasicResponse =
        // get /v1/summary/basic
        withRawResponse().retrieveBasic(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SummaryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SummaryServiceAsync.WithRawResponse =
            SummaryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveBasicHandler: Handler<SummaryRetrieveBasicResponse> =
            jsonHandler<SummaryRetrieveBasicResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveBasic(
            params: SummaryRetrieveBasicParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SummaryRetrieveBasicResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "summary", "basic")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveBasicHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
