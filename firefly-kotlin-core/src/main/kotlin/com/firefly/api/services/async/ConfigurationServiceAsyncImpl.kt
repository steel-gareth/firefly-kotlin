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
import com.firefly.api.core.http.json
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepareAsync
import com.firefly.api.models.configuration.Configuration
import com.firefly.api.models.configuration.ConfigurationRetrieveParams
import com.firefly.api.models.configuration.ConfigurationRetrieveValueParams
import com.firefly.api.models.configuration.ConfigurationSingle
import com.firefly.api.models.configuration.ConfigurationUpdateValueParams

/**
 * These endpoints allow you to manage and update the Firefly III configuration. You need to have
 * the &quot;owner&quot; role to update configuration.
 */
class ConfigurationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationServiceAsync {

    private val withRawResponse: ConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationServiceAsync =
        ConfigurationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): List<Configuration> =
        // get /v1/configuration
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun retrieveValue(
        params: ConfigurationRetrieveValueParams,
        requestOptions: RequestOptions,
    ): ConfigurationSingle =
        // get /v1/configuration/{name}
        withRawResponse().retrieveValue(params, requestOptions).parse()

    override suspend fun updateValue(
        params: ConfigurationUpdateValueParams,
        requestOptions: RequestOptions,
    ): ConfigurationSingle =
        // put /v1/configuration/{name}
        withRawResponse().updateValue(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationServiceAsync.WithRawResponse =
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<List<Configuration>> =
            jsonHandler<List<Configuration>>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Configuration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "configuration")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrieveValueHandler: Handler<ConfigurationSingle> =
            jsonHandler<ConfigurationSingle>(clientOptions.jsonMapper)

        override suspend fun retrieveValue(
            params: ConfigurationRetrieveValueParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "configuration", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveValueHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateValueHandler: Handler<ConfigurationSingle> =
            jsonHandler<ConfigurationSingle>(clientOptions.jsonMapper)

        override suspend fun updateValue(
            params: ConfigurationUpdateValueParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "configuration", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateValueHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
