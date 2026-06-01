// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.tags.TagCreateParams
import com.firefly.api.models.tags.TagDeleteParams
import com.firefly.api.models.tags.TagListAttachmentsParams
import com.firefly.api.models.tags.TagListParams
import com.firefly.api.models.tags.TagListResponse
import com.firefly.api.models.tags.TagListTransactionsParams
import com.firefly.api.models.tags.TagRetrieveParams
import com.firefly.api.models.tags.TagSingle
import com.firefly.api.models.tags.TagUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** This endpoint manages all of the user&#039;s tags. */
interface TagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TagServiceAsync

    /**
     * Creates a new tag. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagSingle

    /** Get a single tag. */
    suspend fun retrieve(
        tag: String,
        params: TagRetrieveParams = TagRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagSingle = retrieve(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagSingle

    /** @see retrieve */
    suspend fun retrieve(tag: String, requestOptions: RequestOptions): TagSingle =
        retrieve(tag, TagRetrieveParams.none(), requestOptions)

    /** Update existing tag. */
    suspend fun update(
        pathTag: String,
        params: TagUpdateParams = TagUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagSingle = update(params.toBuilder().pathTag(pathTag).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagSingle

    /** @see update */
    suspend fun update(pathTag: String, requestOptions: RequestOptions): TagSingle =
        update(pathTag, TagUpdateParams.none(), requestOptions)

    /** List all of the user's tags. */
    suspend fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TagListResponse =
        list(TagListParams.none(), requestOptions)

    /** Delete an tag. */
    suspend fun delete(
        tag: String,
        params: TagDeleteParams = TagDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(tag: String, requestOptions: RequestOptions) =
        delete(tag, TagDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    suspend fun listAttachments(
        tag: String,
        params: TagListAttachmentsParams = TagListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: TagListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(tag: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(tag, TagListAttachmentsParams.none(), requestOptions)

    /** List all transactions with this tag. */
    suspend fun listTransactions(
        tag: String,
        params: TagListTransactionsParams = TagListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: TagListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(tag: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(tag, TagListTransactionsParams.none(), requestOptions)

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tags`, but is otherwise the same as
         * [TagServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagSingle>

        /**
         * Returns a raw HTTP response for `get /v1/tags/{tag}`, but is otherwise the same as
         * [TagServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            tag: String,
            params: TagRetrieveParams = TagRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagSingle> =
            retrieve(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TagRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            tag: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagSingle> = retrieve(tag, TagRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/tags/{tag}`, but is otherwise the same as
         * [TagServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            pathTag: String,
            params: TagUpdateParams = TagUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagSingle> =
            update(params.toBuilder().pathTag(pathTag).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            pathTag: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagSingle> = update(pathTag, TagUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/tags`, but is otherwise the same as
         * [TagServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<TagListResponse> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/tags/{tag}`, but is otherwise the same as
         * [TagServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            tag: String,
            params: TagDeleteParams = TagDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(tag: String, requestOptions: RequestOptions): HttpResponse =
            delete(tag, TagDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/tags/{tag}/attachments`, but is otherwise the
         * same as [TagServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            tag: String,
            params: TagListAttachmentsParams = TagListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: TagListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            tag: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(tag, TagListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/tags/{tag}/transactions`, but is otherwise the
         * same as [TagServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            tag: String,
            params: TagListTransactionsParams = TagListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: TagListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            tag: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(tag, TagListTransactionsParams.none(), requestOptions)
    }
}
