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
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PiggyBankArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillArray
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListBillsParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupListResponse
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupSingle
import com.configure_me_emcees_prod_testing_5.api.models.objectgroups.ObjectGroupUpdateParams

/**
 * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
 * conjunction with another object (for example a piggy bank) and will auto-delete when no other
 * items are linked to it.
 */
class ObjectGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectGroupServiceAsync {

    private val withRawResponse: ObjectGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ObjectGroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ObjectGroupServiceAsync =
        ObjectGroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ObjectGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): ObjectGroupSingle =
        // get /v1/object-groups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: ObjectGroupUpdateParams,
        requestOptions: RequestOptions,
    ): ObjectGroupSingle =
        // put /v1/object-groups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: ObjectGroupListParams,
        requestOptions: RequestOptions,
    ): ObjectGroupListResponse =
        // get /v1/object-groups
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: ObjectGroupDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/object-groups/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun listBills(
        params: ObjectGroupListBillsParams,
        requestOptions: RequestOptions,
    ): BillArray =
        // get /v1/object-groups/{id}/bills
        withRawResponse().listBills(params, requestOptions).parse()

    override suspend fun listPiggyBanks(
        params: ObjectGroupListPiggyBanksParams,
        requestOptions: RequestOptions,
    ): PiggyBankArray =
        // get /v1/object-groups/{id}/piggy-banks
        withRawResponse().listPiggyBanks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ObjectGroupServiceAsync.WithRawResponse =
            ObjectGroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ObjectGroupSingle> =
            jsonHandler<ObjectGroupSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: ObjectGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGroupSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "object-groups", params._pathParam(0))
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

        private val updateHandler: Handler<ObjectGroupSingle> =
            jsonHandler<ObjectGroupSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: ObjectGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGroupSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "object-groups", params._pathParam(0))
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

        private val listHandler: Handler<ObjectGroupListResponse> =
            jsonHandler<ObjectGroupListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ObjectGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGroupListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "object-groups")
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
            params: ObjectGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "object-groups", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listBillsHandler: Handler<BillArray> =
            jsonHandler<BillArray>(clientOptions.jsonMapper)

        override suspend fun listBills(
            params: ObjectGroupListBillsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "object-groups", params._pathParam(0), "bills")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBillsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPiggyBanksHandler: Handler<PiggyBankArray> =
            jsonHandler<PiggyBankArray>(clientOptions.jsonMapper)

        override suspend fun listPiggyBanks(
            params: ObjectGroupListPiggyBanksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "object-groups", params._pathParam(0), "piggy-banks")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPiggyBanksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
