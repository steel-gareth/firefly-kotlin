// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.handlers.emptyHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorBodyHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorHandler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpMethod
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpRequest
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse.Handler
import com.configure_me_emcees_prod_testing_5.api.core.http.json
import com.configure_me_emcees_prod_testing_5.api.core.http.parseable
import com.configure_me_emcees_prod_testing_5.api.core.prepareAsync
import com.configure_me_emcees_prod_testing_5.api.models.data.DataDestroyParams
import com.configure_me_emcees_prod_testing_5.api.models.data.DataPurgeParams
import com.configure_me_emcees_prod_testing_5.api.services.async.data.BulkServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.data.BulkServiceAsyncImpl
import com.configure_me_emcees_prod_testing_5.api.services.async.data.ExportServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.data.ExportServiceAsyncImpl

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
