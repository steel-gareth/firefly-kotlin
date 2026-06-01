// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.accounts.PiggyBankArray
import com.firefly.api.models.piggybanks.PiggyBankCreateParams
import com.firefly.api.models.piggybanks.PiggyBankDeleteParams
import com.firefly.api.models.piggybanks.PiggyBankEventArray
import com.firefly.api.models.piggybanks.PiggyBankListAttachmentsParams
import com.firefly.api.models.piggybanks.PiggyBankListEventsParams
import com.firefly.api.models.piggybanks.PiggyBankListParams
import com.firefly.api.models.piggybanks.PiggyBankRetrieveParams
import com.firefly.api.models.piggybanks.PiggyBankSingle
import com.firefly.api.models.piggybanks.PiggyBankUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
 * information.
 */
interface PiggyBankService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PiggyBankService

    /**
     * Creates a new piggy bank. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: PiggyBankCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle

    /** Get a single piggy bank. */
    fun retrieve(
        id: String,
        params: PiggyBankRetrieveParams = PiggyBankRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PiggyBankRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PiggyBankSingle =
        retrieve(id, PiggyBankRetrieveParams.none(), requestOptions)

    /** Update existing piggy bank. */
    fun update(
        id: String,
        params: PiggyBankUpdateParams = PiggyBankUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: PiggyBankUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): PiggyBankSingle =
        update(id, PiggyBankUpdateParams.none(), requestOptions)

    /** List all piggy banks. */
    fun list(
        params: PiggyBankListParams = PiggyBankListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankArray

    /** @see list */
    fun list(requestOptions: RequestOptions): PiggyBankArray =
        list(PiggyBankListParams.none(), requestOptions)

    /** Delete a piggy bank. */
    fun delete(
        id: String,
        params: PiggyBankDeleteParams = PiggyBankDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: PiggyBankDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, PiggyBankDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    fun listAttachments(
        id: String,
        params: PiggyBankListAttachmentsParams = PiggyBankListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    fun listAttachments(
        params: PiggyBankListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, PiggyBankListAttachmentsParams.none(), requestOptions)

    /** List all events linked to a piggy bank (adding and removing money). */
    fun listEvents(
        id: String,
        params: PiggyBankListEventsParams = PiggyBankListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankEventArray = listEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEvents */
    fun listEvents(
        params: PiggyBankListEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PiggyBankEventArray

    /** @see listEvents */
    fun listEvents(id: String, requestOptions: RequestOptions): PiggyBankEventArray =
        listEvents(id, PiggyBankListEventsParams.none(), requestOptions)

    /** A view of [PiggyBankService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PiggyBankService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/piggy-banks`, but is otherwise the same as
         * [PiggyBankService.create].
         */
        @MustBeClosed
        fun create(
            params: PiggyBankCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle>

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks/{id}`, but is otherwise the same as
         * [PiggyBankService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PiggyBankRetrieveParams = PiggyBankRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PiggyBankRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<PiggyBankSingle> =
            retrieve(id, PiggyBankRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/piggy-banks/{id}`, but is otherwise the same as
         * [PiggyBankService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PiggyBankUpdateParams = PiggyBankUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PiggyBankUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<PiggyBankSingle> =
            update(id, PiggyBankUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks`, but is otherwise the same as
         * [PiggyBankService.list].
         */
        @MustBeClosed
        fun list(
            params: PiggyBankListParams = PiggyBankListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PiggyBankArray> =
            list(PiggyBankListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/piggy-banks/{id}`, but is otherwise the same
         * as [PiggyBankService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: PiggyBankDeleteParams = PiggyBankDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PiggyBankDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, PiggyBankDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks/{id}/attachments`, but is otherwise
         * the same as [PiggyBankService.listAttachments].
         */
        @MustBeClosed
        fun listAttachments(
            id: String,
            params: PiggyBankListAttachmentsParams = PiggyBankListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            params: PiggyBankListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, PiggyBankListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/piggy-banks/{id}/events`, but is otherwise the
         * same as [PiggyBankService.listEvents].
         */
        @MustBeClosed
        fun listEvents(
            id: String,
            params: PiggyBankListEventsParams = PiggyBankListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankEventArray> =
            listEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: PiggyBankListEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PiggyBankEventArray>

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PiggyBankEventArray> =
            listEvents(id, PiggyBankListEventsParams.none(), requestOptions)
    }
}
