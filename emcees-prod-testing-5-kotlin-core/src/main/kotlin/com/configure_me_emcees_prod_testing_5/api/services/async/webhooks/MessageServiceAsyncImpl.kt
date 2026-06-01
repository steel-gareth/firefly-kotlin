// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.webhooks

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
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageListResponse
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageRetrieveResponse
import com.configure_me_emcees_prod_testing_5.api.services.async.webhooks.messages.AttemptServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.webhooks.messages.AttemptServiceAsyncImpl

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
class MessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageServiceAsync {

    private val withRawResponse: MessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attempts: AttemptServiceAsync by lazy { AttemptServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MessageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageServiceAsync =
        MessageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    override fun attempts(): AttemptServiceAsync = attempts

    override suspend fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions,
    ): MessageRetrieveResponse =
        // get /v1/webhooks/{id}/messages/{messageId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: MessageListParams,
        requestOptions: RequestOptions,
    ): MessageListResponse =
        // get /v1/webhooks/{id}/messages
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: MessageDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/webhooks/{id}/messages/{messageId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val attempts: AttemptServiceAsync.WithRawResponse by lazy {
            AttemptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MessageServiceAsync.WithRawResponse =
            MessageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        override fun attempts(): AttemptServiceAsync.WithRawResponse = attempts

        private val retrieveHandler: Handler<MessageRetrieveResponse> =
            jsonHandler<MessageRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveResponse> {
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

        private val listHandler: Handler<MessageListResponse> =
            jsonHandler<MessageListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: MessageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks", params._pathParam(0), "messages")
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
            params: MessageDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId())
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
