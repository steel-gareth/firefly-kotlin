// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
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
import com.google.errorprone.annotations.MustBeClosed

/** Endpoints to manage a user&#039;s bills and all related objects. */
interface BillService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillService

    /**
     * Creates a new bill. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: BillCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle

    /** Get a single bill. */
    fun retrieve(
        id: String,
        params: BillRetrieveParams = BillRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BillSingle =
        retrieve(id, BillRetrieveParams.none(), requestOptions)

    /** Update existing bill. */
    fun update(
        id: String,
        params: BillUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: BillUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSingle

    /** This endpoint will list all the user's bills. */
    fun list(
        params: BillListParams = BillListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillArray

    /** @see list */
    fun list(requestOptions: RequestOptions): BillArray =
        list(BillListParams.none(), requestOptions)

    /**
     * Delete a bill. This will not delete any associated rules. Will not remove associated
     * transactions. WILL remove all associated attachments.
     */
    fun delete(
        id: String,
        params: BillDeleteParams = BillDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: BillDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BillDeleteParams.none(), requestOptions)

    /** This endpoint will list all attachments linked to the bill. */
    fun listAttachments(
        id: String,
        params: BillListAttachmentsParams = BillListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    fun listAttachments(
        params: BillListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, BillListAttachmentsParams.none(), requestOptions)

    /** This endpoint will list all rules that have an action to set the bill to this bill. */
    fun listRules(
        id: String,
        params: BillListRulesParams = BillListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray = listRules(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRules */
    fun listRules(
        params: BillListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see listRules */
    fun listRules(id: String, requestOptions: RequestOptions): RuleArray =
        listRules(id, BillListRulesParams.none(), requestOptions)

    /** This endpoint will list all transactions linked to this bill. */
    fun listTransactions(
        id: String,
        params: BillListTransactionsParams = BillListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: BillListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, BillListTransactionsParams.none(), requestOptions)

    /** A view of [BillService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BillService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/bills`, but is otherwise the same as
         * [BillService.create].
         */
        @MustBeClosed
        fun create(
            params: BillCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle>

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}`, but is otherwise the same as
         * [BillService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillRetrieveParams = BillRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BillSingle> =
            retrieve(id, BillRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/bills/{id}`, but is otherwise the same as
         * [BillService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: BillUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BillUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSingle>

        /**
         * Returns a raw HTTP response for `get /v1/bills`, but is otherwise the same as
         * [BillService.list].
         */
        @MustBeClosed
        fun list(
            params: BillListParams = BillListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillArray> =
            list(BillListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/bills/{id}`, but is otherwise the same as
         * [BillService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillDeleteParams = BillDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BillDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}/attachments`, but is otherwise the
         * same as [BillService.listAttachments].
         */
        @MustBeClosed
        fun listAttachments(
            id: String,
            params: BillListAttachmentsParams = BillListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            params: BillListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, BillListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}/rules`, but is otherwise the same as
         * [BillService.listRules].
         */
        @MustBeClosed
        fun listRules(
            id: String,
            params: BillListRulesParams = BillListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray> = listRules(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: BillListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see listRules */
        @MustBeClosed
        fun listRules(id: String, requestOptions: RequestOptions): HttpResponseFor<RuleArray> =
            listRules(id, BillListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/bills/{id}/transactions`, but is otherwise the
         * same as [BillService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            id: String,
            params: BillListTransactionsParams = BillListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: BillListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, BillListTransactionsParams.none(), requestOptions)
    }
}
