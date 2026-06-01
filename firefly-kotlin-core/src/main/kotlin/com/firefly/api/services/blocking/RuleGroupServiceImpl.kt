// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

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
import com.firefly.api.core.prepare
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.bills.RuleArray
import com.firefly.api.models.rulegroups.RuleGroupCreateParams
import com.firefly.api.models.rulegroups.RuleGroupDeleteParams
import com.firefly.api.models.rulegroups.RuleGroupListAllParams
import com.firefly.api.models.rulegroups.RuleGroupListAllResponse
import com.firefly.api.models.rulegroups.RuleGroupListRulesParams
import com.firefly.api.models.rulegroups.RuleGroupRetrieveParams
import com.firefly.api.models.rulegroups.RuleGroupSingle
import com.firefly.api.models.rulegroups.RuleGroupTestTransactionsParams
import com.firefly.api.models.rulegroups.RuleGroupTriggerRulesParams
import com.firefly.api.models.rulegroups.RuleGroupUpdateParams

/** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
class RuleGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RuleGroupService {

    private val withRawResponse: RuleGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuleGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleGroupService =
        RuleGroupServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: RuleGroupCreateParams,
        requestOptions: RequestOptions,
    ): RuleGroupSingle =
        // post /v1/rule-groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RuleGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): RuleGroupSingle =
        // get /v1/rule-groups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RuleGroupUpdateParams,
        requestOptions: RequestOptions,
    ): RuleGroupSingle =
        // put /v1/rule-groups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: RuleGroupDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/rule-groups/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listAll(
        params: RuleGroupListAllParams,
        requestOptions: RequestOptions,
    ): RuleGroupListAllResponse =
        // get /v1/rule-groups
        withRawResponse().listAll(params, requestOptions).parse()

    override fun listRules(
        params: RuleGroupListRulesParams,
        requestOptions: RequestOptions,
    ): RuleArray =
        // get /v1/rule-groups/{id}/rules
        withRawResponse().listRules(params, requestOptions).parse()

    override fun testTransactions(
        params: RuleGroupTestTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/rule-groups/{id}/test
        withRawResponse().testTransactions(params, requestOptions).parse()

    override fun triggerRules(params: RuleGroupTriggerRulesParams, requestOptions: RequestOptions) {
        // post /v1/rule-groups/{id}/trigger
        withRawResponse().triggerRules(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RuleGroupService.WithRawResponse =
            RuleGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<RuleGroupSingle> =
            jsonHandler<RuleGroupSingle>(clientOptions.jsonMapper)

        override fun create(
            params: RuleGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleGroupSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups")
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

        private val retrieveHandler: Handler<RuleGroupSingle> =
            jsonHandler<RuleGroupSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RuleGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleGroupSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups", params._pathParam(0))
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

        private val updateHandler: Handler<RuleGroupSingle> =
            jsonHandler<RuleGroupSingle>(clientOptions.jsonMapper)

        override fun update(
            params: RuleGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleGroupSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RuleGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listAllHandler: Handler<RuleGroupListAllResponse> =
            jsonHandler<RuleGroupListAllResponse>(clientOptions.jsonMapper)

        override fun listAll(
            params: RuleGroupListAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleGroupListAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRulesHandler: Handler<RuleArray> =
            jsonHandler<RuleArray>(clientOptions.jsonMapper)

        override fun listRules(
            params: RuleGroupListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups", params._pathParam(0), "rules")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRulesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val testTransactionsHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override fun testTransactions(
            params: RuleGroupTestTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups", params._pathParam(0), "test")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testTransactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerRulesHandler: Handler<Void?> = emptyHandler()

        override fun triggerRules(
            params: RuleGroupTriggerRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rule-groups", params._pathParam(0), "trigger")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { triggerRulesHandler.handle(it) }
            }
        }
    }
}
