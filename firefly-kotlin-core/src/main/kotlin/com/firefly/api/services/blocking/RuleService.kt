// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.bills.RuleArray
import com.firefly.api.models.rules.RuleCreateParams
import com.firefly.api.models.rules.RuleDeleteParams
import com.firefly.api.models.rules.RuleListParams
import com.firefly.api.models.rules.RuleRetrieveParams
import com.firefly.api.models.rules.RuleSingle
import com.firefly.api.models.rules.RuleTestParams
import com.firefly.api.models.rules.RuleTriggerParams
import com.firefly.api.models.rules.RuleUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
 * execute or test rules and individual triggers.
 */
interface RuleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleService

    /**
     * Creates a new rule. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle

    /** Get a single rule. */
    fun retrieve(
        id: String,
        params: RuleRetrieveParams = RuleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: RuleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RuleSingle =
        retrieve(id, RuleRetrieveParams.none(), requestOptions)

    /** Update existing rule. */
    fun update(
        id: String,
        params: RuleUpdateParams = RuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): RuleSingle =
        update(id, RuleUpdateParams.none(), requestOptions)

    /** List all rules. */
    fun list(
        params: RuleListParams = RuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see list */
    fun list(requestOptions: RequestOptions): RuleArray =
        list(RuleListParams.none(), requestOptions)

    /** Delete an rule. */
    fun delete(
        id: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: RuleDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RuleDeleteParams.none(), requestOptions)

    /**
     * Test which transactions would be hit by the rule. No changes will be made. Limit the result
     * if you want to.
     */
    fun test(
        id: String,
        params: RuleTestParams = RuleTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = test(params.toBuilder().id(id).build(), requestOptions)

    /** @see test */
    fun test(
        params: RuleTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see test */
    fun test(id: String, requestOptions: RequestOptions): TransactionArray =
        test(id, RuleTestParams.none(), requestOptions)

    /**
     * Fire the rule group on your transactions. Changes will be made by the rules in the group.
     * Limit the result if you want to.
     */
    fun trigger(
        id: String,
        params: RuleTriggerParams = RuleTriggerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = trigger(params.toBuilder().id(id).build(), requestOptions)

    /** @see trigger */
    fun trigger(params: RuleTriggerParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see trigger */
    fun trigger(id: String, requestOptions: RequestOptions) =
        trigger(id, RuleTriggerParams.none(), requestOptions)

    /** A view of [RuleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/rules`, but is otherwise the same as
         * [RuleService.create].
         */
        @MustBeClosed
        fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle>

        /**
         * Returns a raw HTTP response for `get /v1/rules/{id}`, but is otherwise the same as
         * [RuleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RuleRetrieveParams = RuleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RuleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<RuleSingle> =
            retrieve(id, RuleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/rules/{id}`, but is otherwise the same as
         * [RuleService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: RuleUpdateParams = RuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<RuleSingle> =
            update(id, RuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rules`, but is otherwise the same as
         * [RuleService.list].
         */
        @MustBeClosed
        fun list(
            params: RuleListParams = RuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RuleArray> =
            list(RuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/rules/{id}`, but is otherwise the same as
         * [RuleService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RuleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rules/{id}/test`, but is otherwise the same as
         * [RuleService.test].
         */
        @MustBeClosed
        fun test(
            id: String,
            params: RuleTestParams = RuleTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            test(params.toBuilder().id(id).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(
            params: RuleTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see test */
        @MustBeClosed
        fun test(id: String, requestOptions: RequestOptions): HttpResponseFor<TransactionArray> =
            test(id, RuleTestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rules/{id}/trigger`, but is otherwise the same
         * as [RuleService.trigger].
         */
        @MustBeClosed
        fun trigger(
            id: String,
            params: RuleTriggerParams = RuleTriggerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = trigger(params.toBuilder().id(id).build(), requestOptions)

        /** @see trigger */
        @MustBeClosed
        fun trigger(
            params: RuleTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see trigger */
        @MustBeClosed
        fun trigger(id: String, requestOptions: RequestOptions): HttpResponse =
            trigger(id, RuleTriggerParams.none(), requestOptions)
    }
}
