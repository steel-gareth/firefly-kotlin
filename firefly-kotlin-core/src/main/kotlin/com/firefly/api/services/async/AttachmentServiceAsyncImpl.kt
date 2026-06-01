// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

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
import com.firefly.api.core.prepareAsync
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.attachments.AttachmentCreateParams
import com.firefly.api.models.attachments.AttachmentDeleteParams
import com.firefly.api.models.attachments.AttachmentDownloadParams
import com.firefly.api.models.attachments.AttachmentListParams
import com.firefly.api.models.attachments.AttachmentRetrieveParams
import com.firefly.api.models.attachments.AttachmentSingle
import com.firefly.api.models.attachments.AttachmentUpdateParams
import com.firefly.api.models.attachments.AttachmentUploadParams

/**
 * Endpoints to manage the attachments of the authenticated user, including up- and downloading of
 * the files.
 */
class AttachmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AttachmentServiceAsync {

    private val withRawResponse: AttachmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttachmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttachmentServiceAsync =
        AttachmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AttachmentCreateParams,
        requestOptions: RequestOptions,
    ): AttachmentSingle =
        // post /v1/attachments
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions,
    ): AttachmentSingle =
        // get /v1/attachments/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AttachmentUpdateParams,
        requestOptions: RequestOptions,
    ): AttachmentSingle =
        // put /v1/attachments/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/attachments
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: AttachmentDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/attachments/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun download(
        params: AttachmentDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /v1/attachments/{id}/download
        withRawResponse().download(params, requestOptions)

    override suspend fun upload(params: AttachmentUploadParams, requestOptions: RequestOptions) {
        // post /v1/attachments/{id}/upload
        withRawResponse().upload(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttachmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AttachmentServiceAsync.WithRawResponse =
            AttachmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AttachmentSingle> =
            jsonHandler<AttachmentSingle>(clientOptions.jsonMapper)

        override suspend fun create(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieve(
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

        private val updateHandler: Handler<AttachmentSingle> =
            jsonHandler<AttachmentSingle>(clientOptions.jsonMapper)

        override suspend fun update(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun list(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override suspend fun download(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val uploadHandler: Handler<Void?> = emptyHandler()

        override suspend fun upload(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadHandler.handle(it) }
            }
        }
    }
}
