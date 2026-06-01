// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.webhooks

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.checkRequired
import com.firefly.api.core.handlers.emptyHandler
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
import com.firefly.api.models.webhooks.messages.MessageDeleteParams
import com.firefly.api.models.webhooks.messages.MessageListParams
import com.firefly.api.models.webhooks.messages.MessageListResponse
import com.firefly.api.models.webhooks.messages.MessageRetrieveParams
import com.firefly.api.models.webhooks.messages.MessageRetrieveResponse
import com.firefly.api.services.blocking.webhooks.messages.AttemptService
import com.firefly.api.services.blocking.webhooks.messages.AttemptServiceImpl

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
class MessageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageService {

    private val withRawResponse: MessageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attempts: AttemptService by lazy { AttemptServiceImpl(clientOptions) }

    override fun withRawResponse(): MessageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageService =
        MessageServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    override fun attempts(): AttemptService = attempts

    override fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions,
    ): MessageRetrieveResponse =
        // get /v1/webhooks/{id}/messages/{messageId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MessageListParams,
        requestOptions: RequestOptions,
    ): MessageListResponse =
        // get /v1/webhooks/{id}/messages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MessageDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/webhooks/{id}/messages/{messageId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val attempts: AttemptService.WithRawResponse by lazy {
            AttemptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MessageService.WithRawResponse =
            MessageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        override fun attempts(): AttemptService.WithRawResponse = attempts

        private val retrieveHandler: Handler<MessageRetrieveResponse> =
            jsonHandler<MessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<MessageListResponse> =
            jsonHandler<MessageListResponse>(clientOptions.jsonMapper)

        override fun list(
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
