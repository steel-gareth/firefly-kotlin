// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillListParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillListRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillSingle
import com.configure_me_emcees_prod_testing_5.api.models.bills.BillUpdateParams
import com.configure_me_emcees_prod_testing_5.api.models.bills.RuleArray
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage a user&#039;s bills and all related objects. */
interface BillServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillServiceAsync

    /**
     * Creates a new bill. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: BillCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle

    /** Get a single bill. */
    suspend fun retrieve(
        id: String,
        params: BillRetrieveParams = BillRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): BillSingle =
        retrieve(id, BillRetrieveParams.none(), requestOptions)

    /** Update existing bill. */
    suspend fun update(
        id: String,
        params: BillUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: BillUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle

    /** This endpoint will list all the user's bills. */
    suspend fun list(
        params: BillListParams = BillListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): BillArray =
        list(BillListParams.none(), requestOptions)

    /**
     * Delete a bill. This will not delete any associated rules. Will not remove associated
     * transactions. WILL remove all associated attachments.
     */
    suspend fun delete(
        id: String,
        params: BillDeleteParams = BillDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: BillDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BillDeleteParams.none(), requestOptions)

    /** This endpoint will list all attachments linked to the bill. */
    suspend fun listAttachments(
        id: String,
        params: BillListAttachmentsParams = BillListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: BillListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, BillListAttachmentsParams.none(), requestOptions)

    /** This endpoint will list all rules that have an action to set the bill to this bill. */
    suspend fun listRules(
        id: String,
        params: BillListRulesParams = BillListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray = listRules(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRules */
    suspend fun listRules(
        params: BillListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see listRules */
    suspend fun listRules(id: String, requestOptions: RequestOptions): RuleArray =
        listRules(id, BillListRulesParams.none(), requestOptions)

    /** This endpoint will list all transactions linked to this bill. */
    suspend fun listTransactions(
        id: String,
        params: BillListTransactionsParams = BillListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: BillListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, BillListTransactionsParams.none(), requestOptions)

    /** A view of [BillServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/bills`, but is otherwise the same as
         * [BillServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BillCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle>

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}`, but is otherwise the same as
         * [BillServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: BillRetrieveParams = BillRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillSingle> = retrieve(id, BillRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/bills/{id}`, but is otherwise the same as
         * [BillServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: BillUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: BillUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle>

        /**
         * Returns a raw HTTP response for `get /v1/bills`, but is otherwise the same as
         * [BillServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BillListParams = BillListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BillArray> =
            list(BillListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/bills/{id}`, but is otherwise the same as
         * [BillServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: BillDeleteParams = BillDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BillDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}/attachments`, but is otherwise the
         * same as [BillServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            params: BillListAttachmentsParams = BillListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: BillListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, BillListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}/rules`, but is otherwise the same as
         * [BillServiceAsync.listRules].
         */
        @MustBeClosed
        suspend fun listRules(
            id: String,
            params: BillListRulesParams = BillListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray> = listRules(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            params: BillListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> = listRules(id, BillListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}/transactions`, but is otherwise the
         * same as [BillServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            params: BillListTransactionsParams = BillListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: BillListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, BillListTransactionsParams.none(), requestOptions)
    }
}
