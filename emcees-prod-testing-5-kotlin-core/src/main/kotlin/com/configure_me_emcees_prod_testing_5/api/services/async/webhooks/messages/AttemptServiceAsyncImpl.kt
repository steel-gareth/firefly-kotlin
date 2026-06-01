// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.webhooks.messages

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.handlers.emptyHandler
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
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptListResponse
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptRetrieveResponse

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
class AttemptServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AttemptServiceAsync {

    private val withRawResponse: AttemptServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttemptServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttemptServiceAsync =
        AttemptServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: AttemptRetrieveParams,
        requestOptions: RequestOptions,
    ): AttemptRetrieveResponse =
        // get /v1/webhooks/{id}/messages/{messageId}/attempts/{attemptId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: AttemptListParams,
        requestOptions: RequestOptions,
    ): AttemptListResponse =
        // get /v1/webhooks/{id}/messages/{messageId}/attempts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: AttemptDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/webhooks/{id}/messages/{messageId}/attempts/{attemptId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttemptServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AttemptServiceAsync.WithRawResponse =
            AttemptServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AttemptRetrieveResponse> =
            jsonHandler<AttemptRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AttemptRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttemptRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attemptId", params.attemptId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "webhooks",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "attempts",
                        params._pathParam(2),
                    )
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

        private val listHandler: Handler<AttemptListResponse> =
            jsonHandler<AttemptListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AttemptListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttemptListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "webhooks",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "attempts",
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: AttemptDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attemptId", params.attemptId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "webhooks",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "attempts",
                        params._pathParam(2),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
