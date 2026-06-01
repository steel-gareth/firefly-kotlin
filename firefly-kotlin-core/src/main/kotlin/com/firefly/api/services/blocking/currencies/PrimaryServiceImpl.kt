// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.currencies

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
import com.firefly.api.core.http.json
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepare
import com.firefly.api.models.currencies.CurrencySingle
import com.firefly.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.firefly.api.models.currencies.primary.PrimaryRetrieveParams

/**
 * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can also
 * disable and enable them, or add new ones.
 */
class PrimaryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PrimaryService {

    private val withRawResponse: PrimaryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PrimaryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PrimaryService =
        PrimaryServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: PrimaryRetrieveParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // get /v1/currencies/primary
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun makePrimary(
        params: PrimaryMakePrimaryParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // post /v1/currencies/{code}/primary
        withRawResponse().makePrimary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrimaryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PrimaryService.WithRawResponse =
            PrimaryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PrimaryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", "primary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val makePrimaryHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override fun makePrimary(
            params: PrimaryMakePrimaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("code", params.code())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", params._pathParam(0), "primary")
                    .putHeader("Accept", "application/vnd.api+json")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { makePrimaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
