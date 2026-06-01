// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.checkRequired
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
import com.firefly.api.models.cron.CronRunParams
import com.firefly.api.models.cron.CronRunResponse

/** These endpoints deliver general system information, version- and meta information. */
class CronServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CronServiceAsync {

    private val withRawResponse: CronServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CronServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CronServiceAsync =
        CronServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun run(
        params: CronRunParams,
        requestOptions: RequestOptions,
    ): CronRunResponse =
        // get /v1/cron/{cliToken}
        withRawResponse().run(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CronServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CronServiceAsync.WithRawResponse =
            CronServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val runHandler: Handler<CronRunResponse> =
            jsonHandler<CronRunResponse>(clientOptions.jsonMapper)

        override suspend fun run(
            params: CronRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CronRunResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cliToken", params.cliToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cron", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { runHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
