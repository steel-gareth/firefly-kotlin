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
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentDownloadParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentListParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentSingle
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentUpdateParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentUploadParams

/**
 * Endpoints to manage the attachments of the authenticated user, including up- and downloading of
 * the files.
 */
class AttachmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttachmentService {

    private val withRawResponse: AttachmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttachmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttachmentService =
        AttachmentServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: AttachmentCreateParams,
        requestOptions: RequestOptions,
    ): AttachmentSingle =
        // post /v1/attachments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions,
    ): AttachmentSingle =
        // get /v1/attachments/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AttachmentUpdateParams,
        requestOptions: RequestOptions,
    ): AttachmentSingle =
        // put /v1/attachments/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/attachments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AttachmentDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/attachments/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun download(
        params: AttachmentDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/attachments/{id}/download
        withRawResponse().download(params, requestOptions)

    override fun upload(params: AttachmentUploadParams, requestOptions: RequestOptions) {
        // post /v1/attachments/{id}/upload
        withRawResponse().upload(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttachmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AttachmentService.WithRawResponse =
            AttachmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AttachmentSingle> =
            jsonHandler<AttachmentSingle>(clientOptions.jsonMapper)

        override fun create(
            params: AttachmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments")
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

        private val retrieveHandler: Handler<AttachmentSingle> =
            jsonHandler<AttachmentSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments", params._pathParam(0))
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

        private val updateHandler: Handler<AttachmentSingle> =
            jsonHandler<AttachmentSingle>(clientOptions.jsonMapper)

        override fun update(
            params: AttachmentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments", params._pathParam(0))
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

        private val listHandler: Handler<AttachmentArray> =
            jsonHandler<AttachmentArray>(clientOptions.jsonMapper)

        override fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments")
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
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override fun download(
            params: AttachmentDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments", params._pathParam(0), "download")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val uploadHandler: Handler<Void?> = emptyHandler()

        override fun upload(
            params: AttachmentUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            checkRequired("body", params._body())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "attachments", params._pathParam(0), "upload")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadHandler.handle(it) }
            }
        }
    }
}
