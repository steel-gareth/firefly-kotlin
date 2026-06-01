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
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.bills.BillArray
import com.firefly.api.models.bills.BillCreateParams
import com.firefly.api.models.bills.BillDeleteParams
import com.firefly.api.models.bills.BillListAttachmentsParams
import com.firefly.api.models.bills.BillListParams
import com.firefly.api.models.bills.BillListRulesParams
import com.firefly.api.models.bills.BillListTransactionsParams
import com.firefly.api.models.bills.BillRetrieveParams
import com.firefly.api.models.bills.BillSingle
import com.firefly.api.models.bills.BillUpdateParams
import com.firefly.api.models.bills.RuleArray

/** Endpoints to manage a user&#039;s bills and all related objects. */
class BillServiceImpl internal constructor(private val clientOptions: ClientOptions) : BillService {

    private val withRawResponse: BillService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillService =
        BillServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: BillCreateParams, requestOptions: RequestOptions): BillSingle =
        // post /v1/bills
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: BillRetrieveParams, requestOptions: RequestOptions): BillSingle =
        // get /v1/bills/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BillUpdateParams, requestOptions: RequestOptions): BillSingle =
        // put /v1/bills/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: BillListParams, requestOptions: RequestOptions): BillArray =
        // get /v1/bills
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BillDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/bills/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listAttachments(
        params: BillListAttachmentsParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/bills/{id}/attachments
        withRawResponse().listAttachments(params, requestOptions).parse()

    override fun listRules(params: BillListRulesParams, requestOptions: RequestOptions): RuleArray =
        // get /v1/bills/{id}/rules
        withRawResponse().listRules(params, requestOptions).parse()

    override fun listTransactions(
        params: BillListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/bills/{id}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BillService.WithRawResponse =
            BillServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<BillSingle> =
            jsonHandler<BillSingle>(clientOptions.jsonMapper)

        override fun create(
            params: BillCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills")
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

        private val retrieveHandler: Handler<BillSingle> =
            jsonHandler<BillSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills", params._pathParam(0))
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

        private val updateHandler: Handler<BillSingle> =
            jsonHandler<BillSingle>(clientOptions.jsonMapper)

        override fun update(
            params: BillUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills", params._pathParam(0))
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

        private val listHandler: Handler<BillArray> =
            jsonHandler<BillArray>(clientOptions.jsonMapper)

        override fun list(
            params: BillListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills")
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
            params: BillDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val listAttachmentsHandler: Handler<AttachmentArray> =
            jsonHandler<AttachmentArray>(clientOptions.jsonMapper)

        override fun listAttachments(
            params: BillListAttachmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills", params._pathParam(0), "attachments")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAttachmentsHandler.handle(it) }
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
            params: BillListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills", params._pathParam(0), "rules")
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

        private val listTransactionsHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override fun listTransactions(
            params: BillListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "bills", params._pathParam(0), "transactions")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
