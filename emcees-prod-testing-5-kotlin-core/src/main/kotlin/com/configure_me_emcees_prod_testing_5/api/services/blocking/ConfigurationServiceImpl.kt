// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

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
import com.configure_me_emcees_prod_testing_5.api.core.prepare
import com.configure_me_emcees_prod_testing_5.api.models.configuration.Configuration
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationRetrieveValueParams
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationSingle
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationUpdateValueParams

/**
 * These endpoints allow you to manage and update the Firefly III configuration. You need to have
 * the &quot;owner&quot; role to update configuration.
 */
class ConfigurationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationService {

    private val withRawResponse: ConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationService =
        ConfigurationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): List<Configuration> =
        // get /v1/configuration
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun retrieveValue(
        params: ConfigurationRetrieveValueParams,
        requestOptions: RequestOptions,
    ): ConfigurationSingle =
        // get /v1/configuration/{name}
        withRawResponse().retrieveValue(params, requestOptions).parse()

    override fun updateValue(
        params: ConfigurationUpdateValueParams,
        requestOptions: RequestOptions,
    ): ConfigurationSingle =
        // put /v1/configuration/{name}
        withRawResponse().updateValue(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationService.WithRawResponse =
            ConfigurationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<List<Configuration>> =
            jsonHandler<List<Configuration>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Configuration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "configuration")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieveValue(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun updateValue(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
