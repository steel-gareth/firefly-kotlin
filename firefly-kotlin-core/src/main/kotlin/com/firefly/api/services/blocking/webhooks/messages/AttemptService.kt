// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking.webhooks.messages

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.webhooks.messages.attempts.AttemptDeleteParams
import com.firefly.api.models.webhooks.messages.attempts.AttemptListParams
import com.firefly.api.models.webhooks.messages.attempts.AttemptListResponse
import com.firefly.api.models.webhooks.messages.attempts.AttemptRetrieveParams
import com.firefly.api.models.webhooks.messages.attempts.AttemptRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
interface AttemptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttemptService

    /**
     * When a webhook message fails to send it will store the failure in an "attempt". You can view
     * and analyse these. Webhooks messages that receive too many attempts (failures) will not be
     * fired. You must first clear out old attempts and try again. This endpoint shows you the
     * details of a single attempt. The ID of the attempt must match the corresponding webhook and
     * webhook message.
     */
    fun retrieve(
        attemptId: Long,
        params: AttemptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptRetrieveResponse =
        retrieve(params.toBuilder().attemptId(attemptId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AttemptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptRetrieveResponse

    /**
     * When a webhook message fails to send it will store the failure in an "attempt". You can view
     * and analyse these. Webhook messages that receive too many attempts (failures) will not be
     * sent again. You must first clear out old attempts before the message can go out again.
     */
    fun list(
        messageId: Long,
        params: AttemptListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptListResponse = list(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see list */
    fun list(
        params: AttemptListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptListResponse

    /**
     * Delete a webhook message attempt. If you delete all attempts for a webhook message, Firefly
     * III will (once again) assume all is well with the webhook message and will try to send it
     * again.
     */
    fun delete(
        attemptId: Long,
        params: AttemptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().attemptId(attemptId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AttemptDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AttemptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttemptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/webhooks/{id}/messages/{messageId}/attempts/{attemptId}`, but is otherwise the same
         * as [AttemptService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            attemptId: Long,
            params: AttemptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptRetrieveResponse> =
            retrieve(params.toBuilder().attemptId(attemptId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AttemptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}/messages/{messageId}/attempts`,
         * but is otherwise the same as [AttemptService.list].
         */
        @MustBeClosed
        fun list(
            messageId: Long,
            params: AttemptListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptListResponse> =
            list(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: AttemptListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptListResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/webhooks/{id}/messages/{messageId}/attempts/{attemptId}`, but is otherwise the same
         * as [AttemptService.delete].
         */
        @MustBeClosed
        fun delete(
            attemptId: Long,
            params: AttemptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().attemptId(attemptId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AttemptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
