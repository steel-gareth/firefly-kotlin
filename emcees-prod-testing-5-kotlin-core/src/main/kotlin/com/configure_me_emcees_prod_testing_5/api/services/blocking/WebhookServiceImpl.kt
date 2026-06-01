// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

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
import com.configure_me_emcees_prod_testing_5.api.core.prepare
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookListResponse
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookSingle
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookSubmitParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookTriggerTransactionParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.WebhookUpdateParams
import com.configure_me_emcees_prod_testing_5.api.services.blocking.webhooks.MessageService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.webhooks.MessageServiceImpl

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    override fun messages(): MessageService = messages

    override fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions,
    ): WebhookSingle =
        // post /v1/webhooks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions,
    ): WebhookSingle =
        // get /v1/webhooks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions,
    ): WebhookSingle =
        // put /v1/webhooks/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions,
    ): WebhookListResponse =
        // get /v1/webhooks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: WebhookDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/webhooks/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun submit(params: WebhookSubmitParams, requestOptions: RequestOptions) {
        // post /v1/webhooks/{id}/submit
        withRawResponse().submit(params, requestOptions)
    }

    override fun triggerTransaction(
        params: WebhookTriggerTransactionParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/webhooks/{id}/trigger-transaction/{transactionId}
        withRawResponse().triggerTransaction(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        override fun messages(): MessageService.WithRawResponse = messages

        private val createHandler: Handler<WebhookSingle> =
            jsonHandler<WebhookSingle>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks")
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

        private val retrieveHandler: Handler<WebhookSingle> =
            jsonHandler<WebhookSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks", params._pathParam(0))
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

        private val updateHandler: Handler<WebhookSingle> =
            jsonHandler<WebhookSingle>(clientOptions.jsonMapper)

        override fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks", params._pathParam(0))
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

        private val listHandler: Handler<WebhookListResponse> =
            jsonHandler<WebhookListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks")
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
            params: WebhookDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val submitHandler: Handler<Void?> = emptyHandler()

        override fun submit(
            params: WebhookSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "webhooks", params._pathParam(0), "submit")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { submitHandler.handle(it) }
            }
        }

        private val triggerTransactionHandler: Handler<Void?> = emptyHandler()

        override fun triggerTransaction(
            params: WebhookTriggerTransactionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionId", params.transactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "webhooks",
                        params._pathParam(0),
                        "trigger-transaction",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { triggerTransactionHandler.handle(it) }
            }
        }
    }
}
