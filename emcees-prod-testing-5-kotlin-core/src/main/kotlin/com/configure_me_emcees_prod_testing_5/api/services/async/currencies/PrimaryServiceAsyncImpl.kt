// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.currencies

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
import com.configure_me_emcees_prod_testing_5.api.core.http.json
import com.configure_me_emcees_prod_testing_5.api.core.http.parseable
import com.configure_me_emcees_prod_testing_5.api.core.prepareAsync
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencySingle
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryMakePrimaryParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.primary.PrimaryRetrieveParams

/**
 * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can also
 * disable and enable them, or add new ones.
 */
class PrimaryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PrimaryServiceAsync {

    private val withRawResponse: PrimaryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PrimaryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PrimaryServiceAsync =
        PrimaryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: PrimaryRetrieveParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // get /v1/currencies/primary
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun makePrimary(
        params: PrimaryMakePrimaryParams,
        requestOptions: RequestOptions,
    ): CurrencySingle =
        // post /v1/currencies/{code}/primary
        withRawResponse().makePrimary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrimaryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PrimaryServiceAsync.WithRawResponse =
            PrimaryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PrimaryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencySingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "currencies", "primary")
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

        private val makePrimaryHandler: Handler<CurrencySingle> =
            jsonHandler<CurrencySingle>(clientOptions.jsonMapper)

        override suspend fun makePrimary(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
