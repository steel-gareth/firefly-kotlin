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
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.RuleArray
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleListParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleSingle
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleTestParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleTriggerParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleUpdateParams

/**
 * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
 * execute or test rules and individual triggers.
 */
class RuleServiceImpl internal constructor(private val clientOptions: ClientOptions) : RuleService {

    private val withRawResponse: RuleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleService =
        RuleServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: RuleCreateParams, requestOptions: RequestOptions): RuleSingle =
        // post /v1/rules
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: RuleRetrieveParams, requestOptions: RequestOptions): RuleSingle =
        // get /v1/rules/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: RuleUpdateParams, requestOptions: RequestOptions): RuleSingle =
        // put /v1/rules/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: RuleListParams, requestOptions: RequestOptions): RuleArray =
        // get /v1/rules
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RuleDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/rules/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun test(params: RuleTestParams, requestOptions: RequestOptions): TransactionArray =
        // get /v1/rules/{id}/test
        withRawResponse().test(params, requestOptions).parse()

    override fun trigger(params: RuleTriggerParams, requestOptions: RequestOptions) {
        // post /v1/rules/{id}/trigger
        withRawResponse().trigger(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RuleService.WithRawResponse =
            RuleServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<RuleSingle> =
            jsonHandler<RuleSingle>(clientOptions.jsonMapper)

        override fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules")
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

        private val retrieveHandler: Handler<RuleSingle> =
            jsonHandler<RuleSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RuleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules", params._pathParam(0))
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

        private val updateHandler: Handler<RuleSingle> =
            jsonHandler<RuleSingle>(clientOptions.jsonMapper)

        override fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules", params._pathParam(0))
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

        private val listHandler: Handler<RuleArray> =
            jsonHandler<RuleArray>(clientOptions.jsonMapper)

        override fun list(
            params: RuleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules")
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
            params: RuleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val testHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override fun test(
            params: RuleTestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules", params._pathParam(0), "test")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerHandler: Handler<Void?> = emptyHandler()

        override fun trigger(
            params: RuleTriggerParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rules", params._pathParam(0), "trigger")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { triggerHandler.handle(it) }
            }
        }
    }
}
