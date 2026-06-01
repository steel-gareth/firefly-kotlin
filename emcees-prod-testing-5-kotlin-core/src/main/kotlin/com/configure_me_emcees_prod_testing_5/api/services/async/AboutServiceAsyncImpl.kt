// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorBodyHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.errorHandler
import com.configure_me_emcees_prod_testing_5.api.core.handlers.jsonHandler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpMethod
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpRequest
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse.Handler
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.core.http.parseable
import com.configure_me_emcees_prod_testing_5.api.core.prepareAsync
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveInfoParams
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveInfoResponse
import com.configure_me_emcees_prod_testing_5.api.models.about.AboutRetrieveUserParams
import com.configure_me_emcees_prod_testing_5.api.models.about.UserSingle

/** These endpoints deliver general system information, version- and meta information. */
class AboutServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AboutServiceAsync {

    private val withRawResponse: AboutServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AboutServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AboutServiceAsync =
        AboutServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieveInfo(
        params: AboutRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): AboutRetrieveInfoResponse =
        // get /v1/about
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    override suspend fun retrieveUser(
        params: AboutRetrieveUserParams,
        requestOptions: RequestOptions,
    ): UserSingle =
        // get /v1/about/user
        withRawResponse().retrieveUser(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AboutServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AboutServiceAsync.WithRawResponse =
            AboutServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveInfoHandler: Handler<AboutRetrieveInfoResponse> =
            jsonHandler<AboutRetrieveInfoResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveInfo(
            params: AboutRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AboutRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "about")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveUserHandler: Handler<UserSingle> =
            jsonHandler<UserSingle>(clientOptions.jsonMapper)

        override suspend fun retrieveUser(
            params: AboutRetrieveUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "about", "user")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
