// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
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
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupListParams
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupListResponse
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupSingle
import com.configure_me_emcees_prod_testing_5.api.models.usergroups.UserGroupUpdateParams

/** User groups are the objects around which &quot;financial administrations&quot; are built. */
class UserGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserGroupServiceAsync {

    private val withRawResponse: UserGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserGroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserGroupServiceAsync =
        UserGroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: UserGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): UserGroupSingle =
        // get /v1/user-groups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: UserGroupUpdateParams,
        requestOptions: RequestOptions,
    ): UserGroupSingle =
        // put /v1/user-groups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: UserGroupListParams,
        requestOptions: RequestOptions,
    ): UserGroupListResponse =
        // get /v1/user-groups
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserGroupServiceAsync.WithRawResponse =
            UserGroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<UserGroupSingle> =
            jsonHandler<UserGroupSingle>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: UserGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserGroupSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "user-groups", params._pathParam(0))
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

        private val updateHandler: Handler<UserGroupSingle> =
            jsonHandler<UserGroupSingle>(clientOptions.jsonMapper)

        override suspend fun update(
            params: UserGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserGroupSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "user-groups", params._pathParam(0))
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

        private val listHandler: Handler<UserGroupListResponse> =
            jsonHandler<UserGroupListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: UserGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserGroupListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "user-groups")
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
    }
}
