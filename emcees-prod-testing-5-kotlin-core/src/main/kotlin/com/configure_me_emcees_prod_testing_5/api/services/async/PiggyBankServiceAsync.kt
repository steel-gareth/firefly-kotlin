// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PiggyBankArray
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankEventArray
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListEventsParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankSingle
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
 * information.
 */
interface PiggyBankServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PiggyBankServiceAsync

    /**
     * Creates a new piggy bank. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: PiggyBankCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle

    /** Get a single piggy bank. */
    suspend fun retrieve(
        id: String,
        params: PiggyBankRetrieveParams = PiggyBankRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PiggyBankRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): PiggyBankSingle =
        retrieve(id, PiggyBankRetrieveParams.none(), requestOptions)

    /** Update existing piggy bank. */
    suspend fun update(
        id: String,
        params: PiggyBankUpdateParams = PiggyBankUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PiggyBankUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): PiggyBankSingle =
        update(id, PiggyBankUpdateParams.none(), requestOptions)

    /** List all piggy banks. */
    suspend fun list(
        params: PiggyBankListParams = PiggyBankListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PiggyBankArray =
        list(PiggyBankListParams.none(), requestOptions)

    /** Delete a piggy bank. */
    suspend fun delete(
        id: String,
        params: PiggyBankDeleteParams = PiggyBankDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: PiggyBankDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, PiggyBankDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    suspend fun listAttachments(
        id: String,
        params: PiggyBankListAttachmentsParams = PiggyBankListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: PiggyBankListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, PiggyBankListAttachmentsParams.none(), requestOptions)

    /** List all events linked to a piggy bank (adding and removing money). */
    suspend fun listEvents(
        id: String,
        params: PiggyBankListEventsParams = PiggyBankListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankEventArray = listEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEvents */
    suspend fun listEvents(
        params: PiggyBankListEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankEventArray

    /** @see listEvents */
    suspend fun listEvents(id: String, requestOptions: RequestOptions): PiggyBankEventArray =
        listEvents(id, PiggyBankListEventsParams.none(), requestOptions)

    /**
     * A view of [PiggyBankServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PiggyBankServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/piggy-banks`, but is otherwise the same as
         * [PiggyBankServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PiggyBankCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle>

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks/{id}`, but is otherwise the same as
         * [PiggyBankServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: PiggyBankRetrieveParams = PiggyBankRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PiggyBankRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankSingle> =
            retrieve(id, PiggyBankRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/piggy-banks/{id}`, but is otherwise the same as
         * [PiggyBankServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: PiggyBankUpdateParams = PiggyBankUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PiggyBankUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankSingle> =
            update(id, PiggyBankUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks`, but is otherwise the same as
         * [PiggyBankServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PiggyBankListParams = PiggyBankListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PiggyBankArray> =
            list(PiggyBankListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/piggy-banks/{id}`, but is otherwise the same
         * as [PiggyBankServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: PiggyBankDeleteParams = PiggyBankDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: PiggyBankDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, PiggyBankDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks/{id}/attachments`, but is otherwise
         * the same as [PiggyBankServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            params: PiggyBankListAttachmentsParams = PiggyBankListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: PiggyBankListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, PiggyBankListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks/{id}/events`, but is otherwise the
         * same as [PiggyBankServiceAsync.listEvents].
         */
        @MustBeClosed
        suspend fun listEvents(
            id: String,
            params: PiggyBankListEventsParams = PiggyBankListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankEventArray> =
            listEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEvents */
        @MustBeClosed
        suspend fun listEvents(
            params: PiggyBankListEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankEventArray>

        /** @see listEvents */
        @MustBeClosed
        suspend fun listEvents(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankEventArray> =
            listEvents(id, PiggyBankListEventsParams.none(), requestOptions)
    }
}
