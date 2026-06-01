// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.emptyHandler
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.http.json
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepareAsync
import com.firefly.api.models.data.DataDestroyParams
import com.firefly.api.models.data.DataPurgeParams
import com.firefly.api.services.async.data.BulkServiceAsync
import com.firefly.api.services.async.data.BulkServiceAsyncImpl
import com.firefly.api.services.async.data.ExportServiceAsync
import com.firefly.api.services.async.data.ExportServiceAsyncImpl

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
class DataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataServiceAsync {

    private val withRawResponse: DataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val bulk: BulkServiceAsync by lazy { BulkServiceAsyncImpl(clientOptions) }

    private val export: ExportServiceAsync by lazy { ExportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataServiceAsync =
        DataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    override fun bulk(): BulkServiceAsync = bulk

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    override fun export(): ExportServiceAsync = export

    override suspend fun destroy(params: DataDestroyParams, requestOptions: RequestOptions) {
        // delete /v1/data/destroy
        withRawResponse().destroy(params, requestOptions)
    }

    override suspend fun purge(params: DataPurgeParams, requestOptions: RequestOptions) {
        // delete /v1/data/purge
        withRawResponse().purge(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val bulk: BulkServiceAsync.WithRawResponse by lazy {
            BulkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val export: ExportServiceAsync.WithRawResponse by lazy {
            ExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DataServiceAsync.WithRawResponse =
            DataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        override fun bulk(): BulkServiceAsync.WithRawResponse = bulk

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        override fun export(): ExportServiceAsync.WithRawResponse = export

        private val destroyHandler: Handler<Void?> = emptyHandler()

        override suspend fun destroy(
            params: DataDestroyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "destroy")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { destroyHandler.handle(it) }
            }
        }

        private val purgeHandler: Handler<Void?> = emptyHandler()

        override suspend fun purge(
            params: DataPurgeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "purge")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { purgeHandler.handle(it) }
            }
        }
    }
}
