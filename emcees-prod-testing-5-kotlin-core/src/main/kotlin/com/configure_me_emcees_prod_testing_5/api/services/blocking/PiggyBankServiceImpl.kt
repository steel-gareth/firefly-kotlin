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
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PiggyBankArray
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankEventArray
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListEventsParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankSingle
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankUpdateParams

/**
 * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
 * information.
 */
class PiggyBankServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PiggyBankService {

    private val withRawResponse: PiggyBankService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PiggyBankService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PiggyBankService =
        PiggyBankServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: PiggyBankCreateParams,
        requestOptions: RequestOptions,
    ): PiggyBankSingle =
        // post /v1/piggy-banks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PiggyBankRetrieveParams,
        requestOptions: RequestOptions,
    ): PiggyBankSingle =
        // get /v1/piggy-banks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PiggyBankUpdateParams,
        requestOptions: RequestOptions,
    ): PiggyBankSingle =
        // put /v1/piggy-banks/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PiggyBankListParams, requestOptions: RequestOptions): PiggyBankArray =
        // get /v1/piggy-banks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PiggyBankDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/piggy-banks/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listAttachments(
        params: PiggyBankListAttachmentsParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/piggy-banks/{id}/attachments
        withRawResponse().listAttachments(params, requestOptions).parse()

    override fun listEvents(
        params: PiggyBankListEventsParams,
        requestOptions: RequestOptions,
    ): PiggyBankEventArray =
        // get /v1/piggy-banks/{id}/events
        withRawResponse().listEvents(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PiggyBankService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PiggyBankService.WithRawResponse =
            PiggyBankServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PiggyBankSingle> =
            jsonHandler<PiggyBankSingle>(clientOptions.jsonMapper)

        override fun create(
            params: PiggyBankCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks")
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

        private val retrieveHandler: Handler<PiggyBankSingle> =
            jsonHandler<PiggyBankSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PiggyBankRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks", params._pathParam(0))
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

        private val updateHandler: Handler<PiggyBankSingle> =
            jsonHandler<PiggyBankSingle>(clientOptions.jsonMapper)

        override fun update(
            params: PiggyBankUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks", params._pathParam(0))
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

        private val listHandler: Handler<PiggyBankArray> =
            jsonHandler<PiggyBankArray>(clientOptions.jsonMapper)

        override fun list(
            params: PiggyBankListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks")
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
            params: PiggyBankDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listAttachmentsHandler: Handler<AttachmentArray> =
            jsonHandler<AttachmentArray>(clientOptions.jsonMapper)

        override fun listAttachments(
            params: PiggyBankListAttachmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks", params._pathParam(0), "attachments")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAttachmentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEventsHandler: Handler<PiggyBankEventArray> =
            jsonHandler<PiggyBankEventArray>(clientOptions.jsonMapper)

        override fun listEvents(
            params: PiggyBankListEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankEventArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "piggy-banks", params._pathParam(0), "events")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
