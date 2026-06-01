// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.handlers.errorBodyHandler
import com.firefly.api.core.handlers.errorHandler
import com.firefly.api.core.handlers.jsonHandler
import com.firefly.api.core.http.HttpMethod
import com.firefly.api.core.http.HttpRequest
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.core.http.parseable
import com.firefly.api.core.prepare
import com.firefly.api.models.about.AboutRetrieveInfoParams
import com.firefly.api.models.about.AboutRetrieveInfoResponse
import com.firefly.api.models.about.AboutRetrieveUserParams
import com.firefly.api.models.about.UserSingle

/** These endpoints deliver general system information, version- and meta information. */
class AboutServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AboutService {

    private val withRawResponse: AboutService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AboutService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AboutService =
        AboutServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveInfo(
        params: AboutRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): AboutRetrieveInfoResponse =
        // get /v1/about
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    override fun retrieveUser(
        params: AboutRetrieveUserParams,
        requestOptions: RequestOptions,
    ): UserSingle =
        // get /v1/about/user
        withRawResponse().retrieveUser(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AboutService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AboutService.WithRawResponse =
            AboutServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveInfoHandler: Handler<AboutRetrieveInfoResponse> =
            jsonHandler<AboutRetrieveInfoResponse>(clientOptions.jsonMapper)

        override fun retrieveInfo(
            params: AboutRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AboutRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "about")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieveUser(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
