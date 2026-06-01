// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

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
import com.firefly.api.core.prepare
import com.firefly.api.models.summary.SummaryRetrieveBasicParams
import com.firefly.api.models.summary.SummaryRetrieveBasicResponse

/**
 * These endpoints deliver summaries, like sums, lists of numbers and other processed information.
 * Mainly used for the main dashboard and pretty specific for Firefly III itself.
 */
class SummaryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SummaryService {

    private val withRawResponse: SummaryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SummaryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SummaryService =
        SummaryServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveBasic(
        params: SummaryRetrieveBasicParams,
        requestOptions: RequestOptions,
    ): SummaryRetrieveBasicResponse =
        // get /v1/summary/basic
        withRawResponse().retrieveBasic(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SummaryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SummaryService.WithRawResponse =
            SummaryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveBasicHandler: Handler<SummaryRetrieveBasicResponse> =
            jsonHandler<SummaryRetrieveBasicResponse>(clientOptions.jsonMapper)

        override fun retrieveBasic(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
