// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageListResponse
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.MessageRetrieveResponse
import com.configure_me_emcees_prod_testing_5.api.services.blocking.webhooks.messages.AttemptService
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageService

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    fun attempts(): AttemptService

    /**
     * When a webhook is triggered it will store the actual content of the webhook in a webhook
     * message. You can view and analyse a single one using this endpoint.
     */
    fun retrieve(
        messageId: Long,
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse =
        retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /**
     * When a webhook is triggered the actual message that will be send is stored in a "message".
     * You can view and analyse these messages.
     */
    fun list(
        id: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): MessageListResponse =
        list(id, MessageListParams.none(), requestOptions)

    /**
     * Delete a webhook message. Any time a webhook is triggered the message is stored before it's
     * sent. You can delete them before or after sending.
     */
    fun delete(
        messageId: Long,
        params: MessageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see delete */
    fun delete(params: MessageDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageService.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        fun attempts(): AttemptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}/messages/{messageId}`, but is
         * otherwise the same as [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            messageId: Long,
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}/messages`, but is otherwise the
         * same as [MessageService.list].
         */
        @MustBeClosed
        fun list(
            id: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<MessageListResponse> =
            list(id, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/webhooks/{id}/messages/{messageId}`, but is
         * otherwise the same as [MessageService.delete].
         */
        @MustBeClosed
        fun delete(
            messageId: Long,
            params: MessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
