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
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountSingle
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountUpdateParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PiggyBankArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray

/**
 * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
 * metadata) together with related transactions, piggy banks and other objects. Also delivers
 * endpoints for CRUD operations for accounts.
 */
class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions,
    ): AccountSingle =
        // post /v1/accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountSingle =
        // get /v1/accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): AccountSingle =
        // put /v1/accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AccountListParams, requestOptions: RequestOptions): AccountArray =
        // get /v1/accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AccountDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/accounts/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun listAttachments(
        params: AccountListAttachmentsParams,
        requestOptions: RequestOptions,
    ): AttachmentArray =
        // get /v1/accounts/{id}/attachments
        withRawResponse().listAttachments(params, requestOptions).parse()

    override fun listPiggyBanks(
        params: AccountListPiggyBanksParams,
        requestOptions: RequestOptions,
    ): PiggyBankArray =
        // get /v1/accounts/{id}/piggy-banks
        withRawResponse().listPiggyBanks(params, requestOptions).parse()

    override fun listTransactions(
        params: AccountListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionArray =
        // get /v1/accounts/{id}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AccountSingle> =
            jsonHandler<AccountSingle>(clientOptions.jsonMapper)

        override fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSingle> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts")
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

        private val retrieveHandler: Handler<AccountSingle> =
            jsonHandler<AccountSingle>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
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

        private val updateHandler: Handler<AccountSingle> =
            jsonHandler<AccountSingle>(clientOptions.jsonMapper)

        override fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSingle> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
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

        private val listHandler: Handler<AccountArray> =
            jsonHandler<AccountArray>(clientOptions.jsonMapper)

        override fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountArray> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts")
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
            params: AccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
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
            params: AccountListAttachmentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "attachments")
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

        private val listPiggyBanksHandler: Handler<PiggyBankArray> =
            jsonHandler<PiggyBankArray>(clientOptions.jsonMapper)

        override fun listPiggyBanks(
            params: AccountListPiggyBanksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "piggy-banks")
                    .putHeader("Accept", "application/vnd.api+json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listTransactionsHandler: Handler<TransactionArray> =
            jsonHandler<TransactionArray>(clientOptions.jsonMapper)

        override fun listTransactions(
            params: AccountListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "transactions")
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
