// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
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
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
 * metadata) together with related transactions, piggy banks and other objects. Also delivers
 * endpoints for CRUD operations for accounts.
 */
interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync

    /**
     * Creates a new account. The data required can be submitted as a JSON body or as a list of
     * parameters (in key=value pairs, like a webform).
     */
    suspend fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSingle

    /** Returns a single account by its ID. */
    suspend fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AccountSingle =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /**
     * Used to update a single account. All fields that are not submitted will be cleared (set to
     * NULL). The model will tell you which fields are mandatory.
     */
    suspend fun update(
        id: String,
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSingle

    /** This endpoint returns a list of all the accounts owned by the authenticated user. */
    suspend fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AccountArray =
        list(AccountListParams.none(), requestOptions)

    /**
     * Will permanently delete an account. Any associated transactions and piggy banks are ALSO
     * deleted. Cannot be recovered from.
     */
    suspend fun delete(
        id: String,
        params: AccountDeleteParams = AccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AccountDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    suspend fun listAttachments(
        id: String,
        params: AccountListAttachmentsParams = AccountListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: AccountListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, AccountListAttachmentsParams.none(), requestOptions)

    /** This endpoint returns a list of all the piggy banks connected to the account. */
    suspend fun listPiggyBanks(
        id: String,
        params: AccountListPiggyBanksParams = AccountListPiggyBanksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray = listPiggyBanks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPiggyBanks */
    suspend fun listPiggyBanks(
        params: AccountListPiggyBanksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray

    /** @see listPiggyBanks */
    suspend fun listPiggyBanks(id: String, requestOptions: RequestOptions): PiggyBankArray =
        listPiggyBanks(id, AccountListPiggyBanksParams.none(), requestOptions)

    /** This endpoint returns a list of all the transactions connected to the account. */
    suspend fun listTransactions(
        id: String,
        params: AccountListTransactionsParams = AccountListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: AccountListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, AccountListTransactionsParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSingle>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSingle> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSingle>

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AccountArray> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/attachments`, but is otherwise the
         * same as [AccountServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            params: AccountListAttachmentsParams = AccountListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: AccountListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, AccountListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/piggy-banks`, but is otherwise the
         * same as [AccountServiceAsync.listPiggyBanks].
         */
        @MustBeClosed
        suspend fun listPiggyBanks(
            id: String,
            params: AccountListPiggyBanksParams = AccountListPiggyBanksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray> =
            listPiggyBanks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPiggyBanks */
        @MustBeClosed
        suspend fun listPiggyBanks(
            params: AccountListPiggyBanksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray>

        /** @see listPiggyBanks */
        @MustBeClosed
        suspend fun listPiggyBanks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankArray> =
            listPiggyBanks(id, AccountListPiggyBanksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/transactions`, but is otherwise
         * the same as [AccountServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            params: AccountListTransactionsParams = AccountListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: AccountListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, AccountListTransactionsParams.none(), requestOptions)
    }
}
