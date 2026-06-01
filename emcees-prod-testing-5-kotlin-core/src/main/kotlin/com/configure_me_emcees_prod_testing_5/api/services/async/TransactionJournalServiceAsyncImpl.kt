// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

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
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalListLinksParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionJournalRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.transactionjournals.TransactionSingle
import com.configure_me_emcees_prod_testing_5.api.models.transactionlinks.TransactionLinkArray

/**
 * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
 * transactions.
 */
class TransactionJournalServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionJournalServiceAsync {

    private val withRawResponse: TransactionJournalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionJournalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): TransactionJournalServiceAsync =
        TransactionJournalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: TransactionJournalRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionSingle =
        // get /v1/transaction-journals/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun delete(
        params: TransactionJournalDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/transaction-journals/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listLinks(
        params: TransactionJournalListLinksParams,
        requestOptions: RequestOptions,
    ): TransactionLinkArray =
        // get /v1/transaction-journals/{id}/links
        withRawResponse().listLinks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionJournalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionJournalServiceAsync.WithRawResponse =
            TransactionJournalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<TransactionSingle> =
            jsonHandler<TransactionSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionJournalRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-journals", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: TransactionJournalDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-journals", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listLinksHandler: Handler<TransactionLinkArray> =
            jsonHandler<TransactionLinkArray>(clientOptions.jsonMapper)

        override suspend fun listLinks(
            params: TransactionJournalListLinksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLinkArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction-journals", params._pathParam(0), "links")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLinksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
