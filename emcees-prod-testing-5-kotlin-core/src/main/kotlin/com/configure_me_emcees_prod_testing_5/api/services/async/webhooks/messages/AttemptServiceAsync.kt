// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async.webhooks.messages

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptListParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptListResponse
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts.AttemptRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
interface AttemptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttemptServiceAsync

    /**
     * When a webhook message fails to send it will store the failure in an "attempt". You can view
     * and analyse these. Webhooks messages that receive too many attempts (failures) will not be
     * fired. You must first clear out old attempts and try again. This endpoint shows you the
     * details of a single attempt. The ID of the attempt must match the corresponding webhook and
     * webhook message.
     */
    suspend fun retrieve(
        attemptId: Long,
        params: AttemptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptRetrieveResponse =
        retrieve(params.toBuilder().attemptId(attemptId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AttemptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptRetrieveResponse

    /**
     * When a webhook message fails to send it will store the failure in an "attempt". You can view
     * and analyse these. Webhook messages that receive too many attempts (failures) will not be
     * sent again. You must first clear out old attempts before the message can go out again.
     */
    suspend fun list(
        messageId: Long,
        params: AttemptListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptListResponse = list(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: AttemptListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttemptListResponse

    /**
     * Delete a webhook message attempt. If you delete all attempts for a webhook message, Firefly
     * III will (once again) assume all is well with the webhook message and will try to send it
     * again.
     */
    suspend fun delete(
        attemptId: Long,
        params: AttemptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().attemptId(attemptId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: AttemptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AttemptServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AttemptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/webhooks/{id}/messages/{messageId}/attempts/{attemptId}`, but is otherwise the same
         * as [AttemptServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            attemptId: Long,
            params: AttemptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptRetrieveResponse> =
            retrieve(params.toBuilder().attemptId(attemptId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AttemptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}/messages/{messageId}/attempts`,
         * but is otherwise the same as [AttemptServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            messageId: Long,
            params: AttemptListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptListResponse> =
            list(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: AttemptListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttemptListResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/webhooks/{id}/messages/{messageId}/attempts/{attemptId}`, but is otherwise the same
         * as [AttemptServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            attemptId: Long,
            params: AttemptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().attemptId(attemptId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: AttemptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
