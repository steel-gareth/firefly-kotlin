// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

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
import com.firefly.api.models.preferences.PreferenceCreateParams
import com.firefly.api.models.preferences.PreferenceListParams
import com.firefly.api.models.preferences.PreferenceListResponse
import com.firefly.api.models.preferences.PreferenceRetrieveParams
import com.firefly.api.models.preferences.PreferenceSingle
import com.firefly.api.models.preferences.PreferenceUpdateParams

/**
 * These endpoints can be used to manage the user&#039;s preferences, including some hidden ones.
 */
class PreferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PreferenceService {

    private val withRawResponse: PreferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PreferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PreferenceService =
        PreferenceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: PreferenceCreateParams,
        requestOptions: RequestOptions,
    ): PreferenceSingle =
        // post /v1/preferences
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PreferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): PreferenceSingle =
        // get /v1/preferences/{name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PreferenceUpdateParams,
        requestOptions: RequestOptions,
    ): PreferenceSingle =
        // put /v1/preferences/{name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PreferenceListParams,
        requestOptions: RequestOptions,
    ): PreferenceListResponse =
        // get /v1/preferences
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreferenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PreferenceService.WithRawResponse =
            PreferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PreferenceSingle> =
            jsonHandler<PreferenceSingle>(clientOptions.jsonMapper)

        override fun create(
            params: PreferenceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "preferences")
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PreferenceSingle> =
            jsonHandler<PreferenceSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PreferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "preferences", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
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

        private val updateHandler: Handler<PreferenceSingle> =
            jsonHandler<PreferenceSingle>(clientOptions.jsonMapper)

        override fun update(
            params: PreferenceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "preferences", params._pathParam(0))
                    .putHeader("Accept", "application/vnd.api+json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PreferenceListResponse> =
            jsonHandler<PreferenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PreferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "preferences")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
