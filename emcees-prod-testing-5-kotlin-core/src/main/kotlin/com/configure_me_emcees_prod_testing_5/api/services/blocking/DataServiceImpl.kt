// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

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
import com.configure_me_emcees_prod_testing_5.api.core.prepare
import com.configure_me_emcees_prod_testing_5.api.models.data.DataDestroyParams
import com.configure_me_emcees_prod_testing_5.api.models.data.DataPurgeParams
import com.configure_me_emcees_prod_testing_5.api.services.blocking.data.BulkService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.data.BulkServiceImpl
import com.configure_me_emcees_prod_testing_5.api.services.blocking.data.ExportService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.data.ExportServiceImpl

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
class DataServiceImpl internal constructor(private val clientOptions: ClientOptions) : DataService {

    private val withRawResponse: DataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val bulk: BulkService by lazy { BulkServiceImpl(clientOptions) }

    private val export: ExportService by lazy { ExportServiceImpl(clientOptions) }

    override fun withRawResponse(): DataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataService =
        DataServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    override fun bulk(): BulkService = bulk

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    override fun export(): ExportService = export

    override fun destroy(params: DataDestroyParams, requestOptions: RequestOptions) {
        // delete /v1/data/destroy
        withRawResponse().destroy(params, requestOptions)
    }

    override fun purge(params: DataPurgeParams, requestOptions: RequestOptions) {
        // delete /v1/data/purge
        withRawResponse().purge(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val bulk: BulkService.WithRawResponse by lazy {
            BulkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val export: ExportService.WithRawResponse by lazy {
            ExportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DataService.WithRawResponse =
            DataServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        override fun bulk(): BulkService.WithRawResponse = bulk

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        override fun export(): ExportService.WithRawResponse = export

        private val destroyHandler: Handler<Void?> = emptyHandler()

        override fun destroy(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { destroyHandler.handle(it) }
            }
        }

        private val purgeHandler: Handler<Void?> = emptyHandler()

        override fun purge(params: DataPurgeParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "data", "purge")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { purgeHandler.handle(it) }
            }
        }
    }
}
