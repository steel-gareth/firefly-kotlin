// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async.webhooks

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.webhooks.messages.MessageDeleteParams
import com.firefly.api.models.webhooks.messages.MessageListParams
import com.firefly.api.models.webhooks.messages.MessageListResponse
import com.firefly.api.models.webhooks.messages.MessageRetrieveParams
import com.firefly.api.models.webhooks.messages.MessageRetrieveResponse
import com.firefly.api.services.async.webhooks.messages.AttemptServiceAsync
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageServiceAsync

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    fun attempts(): AttemptServiceAsync

    /**
     * When a webhook is triggered it will store the actual content of the webhook in a webhook
     * message. You can view and analyse a single one using this endpoint.
     */
    suspend fun retrieve(
        messageId: Long,
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /**
     * When a webhook is triggered the actual message that will be send is stored in a "message".
     * You can view and analyse these messages.
     */
    suspend fun list(
        id: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    suspend fun list(id: String, requestOptions: RequestOptions): MessageListResponse =
        list(id, MessageListParams.none(), requestOptions)

    /**
     * Delete a webhook message. Any time a webhook is triggered the message is stored before it's
     * sent. You can delete them before or after sending.
     */
    suspend fun delete(
        messageId: Long,
        params: MessageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: MessageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MessageServiceAsync.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        fun attempts(): AttemptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}/messages/{messageId}`, but is
         * otherwise the same as [MessageServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            messageId: Long,
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}/messages`, but is otherwise the
         * same as [MessageServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            id: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListResponse> = list(id, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/webhooks/{id}/messages/{messageId}`, but is
         * otherwise the same as [MessageServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            messageId: Long,
            params: MessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: MessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
