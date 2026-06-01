// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.webhooks.WebhookCreateParams
import com.firefly.api.models.webhooks.WebhookDeleteParams
import com.firefly.api.models.webhooks.WebhookListParams
import com.firefly.api.models.webhooks.WebhookListResponse
import com.firefly.api.models.webhooks.WebhookRetrieveParams
import com.firefly.api.models.webhooks.WebhookSingle
import com.firefly.api.models.webhooks.WebhookSubmitParams
import com.firefly.api.models.webhooks.WebhookTriggerTransactionParams
import com.firefly.api.models.webhooks.WebhookUpdateParams
import com.firefly.api.services.blocking.webhooks.MessageService
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s webhooks and triggers them if necessary.
 */
interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    fun messages(): MessageService

    /**
     * Creates a new webhook. The data required can be submitted as a JSON body or as a list of
     * parameters. The webhook will be given a random secret.
     */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSingle

    /** Gets all info of a single webhook. */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): WebhookSingle =
        retrieve(id, WebhookRetrieveParams.none(), requestOptions)

    /**
     * Update an existing webhook's information. If you wish to reset the secret, submit any value
     * as the "secret". Firefly III will take this as a hint and reset the secret of the webhook.
     */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): WebhookSingle =
        update(id, WebhookUpdateParams.none(), requestOptions)

    /** List all the user's webhooks. */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookListResponse =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook. */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: WebhookDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, WebhookDeleteParams.none(), requestOptions)

    /**
     * This endpoint will submit any open messages for this webhook. This is an asynchronous
     * operation, so you can't see the result. Refresh the webhook message and/or the webhook
     * message attempts to see the results. This may take some time if the webhook receiver is slow.
     */
    fun submit(
        id: String,
        params: WebhookSubmitParams = WebhookSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = submit(params.toBuilder().id(id).build(), requestOptions)

    /** @see submit */
    fun submit(params: WebhookSubmitParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see submit */
    fun submit(id: String, requestOptions: RequestOptions) =
        submit(id, WebhookSubmitParams.none(), requestOptions)

    /**
     * This endpoint will execute this webhook for a given transaction ID. This is an asynchronous
     * operation, so you can't see the result. Refresh the webhook message and/or the webhook
     * message attempts to see the results. This may take some time if the webhook receiver is slow.
     */
    fun triggerTransaction(
        transactionId: String,
        params: WebhookTriggerTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = triggerTransaction(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see triggerTransaction */
    fun triggerTransaction(
        params: WebhookTriggerTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        fun messages(): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSingle>

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<WebhookSingle> =
            retrieve(id, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<WebhookSingle> =
            update(id, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListResponse> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/webhooks/{id}/submit`, but is otherwise the
         * same as [WebhookService.submit].
         */
        @MustBeClosed
        fun submit(
            id: String,
            params: WebhookSubmitParams = WebhookSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = submit(params.toBuilder().id(id).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: WebhookSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see submit */
        @MustBeClosed
        fun submit(id: String, requestOptions: RequestOptions): HttpResponse =
            submit(id, WebhookSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/webhooks/{id}/trigger-transaction/{transactionId}`, but is otherwise the same as
         * [WebhookService.triggerTransaction].
         */
        @MustBeClosed
        fun triggerTransaction(
            transactionId: String,
            params: WebhookTriggerTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            triggerTransaction(
                params.toBuilder().transactionId(transactionId).build(),
                requestOptions,
            )

        /** @see triggerTransaction */
        @MustBeClosed
        fun triggerTransaction(
            params: WebhookTriggerTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
