// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.RuleArray
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleListParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleSingle
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleTestParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleTriggerParams
import com.configure_me_emcees_prod_testing_5.api.models.rules.RuleUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
 * execute or test rules and individual triggers.
 */
interface RuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleServiceAsync

    /**
     * Creates a new rule. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle

    /** Get a single rule. */
    suspend fun retrieve(
        id: String,
        params: RuleRetrieveParams = RuleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: RuleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): RuleSingle =
        retrieve(id, RuleRetrieveParams.none(), requestOptions)

    /** Update existing rule. */
    suspend fun update(
        id: String,
        params: RuleUpdateParams = RuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): RuleSingle =
        update(id, RuleUpdateParams.none(), requestOptions)

    /** List all rules. */
    suspend fun list(
        params: RuleListParams = RuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): RuleArray =
        list(RuleListParams.none(), requestOptions)

    /** Delete an rule. */
    suspend fun delete(
        id: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: RuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RuleDeleteParams.none(), requestOptions)

    /**
     * Test which transactions would be hit by the rule. No changes will be made. Limit the result
     * if you want to.
     */
    suspend fun test(
        id: String,
        params: RuleTestParams = RuleTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = test(params.toBuilder().id(id).build(), requestOptions)

    /** @see test */
    suspend fun test(
        params: RuleTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see test */
    suspend fun test(id: String, requestOptions: RequestOptions): TransactionArray =
        test(id, RuleTestParams.none(), requestOptions)

    /**
     * Fire the rule group on your transactions. Changes will be made by the rules in the group.
     * Limit the result if you want to.
     */
    suspend fun trigger(
        id: String,
        params: RuleTriggerParams = RuleTriggerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = trigger(params.toBuilder().id(id).build(), requestOptions)

    /** @see trigger */
    suspend fun trigger(
        params: RuleTriggerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see trigger */
    suspend fun trigger(id: String, requestOptions: RequestOptions) =
        trigger(id, RuleTriggerParams.none(), requestOptions)

    /** A view of [RuleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/rules`, but is otherwise the same as
         * [RuleServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle>

        /**
         * Returns a raw HTTP response for `get /v1/rules/{id}`, but is otherwise the same as
         * [RuleServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: RuleRetrieveParams = RuleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: RuleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleSingle> = retrieve(id, RuleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/rules/{id}`, but is otherwise the same as
         * [RuleServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: RuleUpdateParams = RuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleSingle> = update(id, RuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rules`, but is otherwise the same as
         * [RuleServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RuleListParams = RuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<RuleArray> =
            list(RuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/rules/{id}`, but is otherwise the same as
         * [RuleServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RuleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rules/{id}/test`, but is otherwise the same as
         * [RuleServiceAsync.test].
         */
        @MustBeClosed
        suspend fun test(
            id: String,
            params: RuleTestParams = RuleTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            test(params.toBuilder().id(id).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        suspend fun test(
            params: RuleTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see test */
        @MustBeClosed
        suspend fun test(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> = test(id, RuleTestParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rules/{id}/trigger`, but is otherwise the same
         * as [RuleServiceAsync.trigger].
         */
        @MustBeClosed
        suspend fun trigger(
            id: String,
            params: RuleTriggerParams = RuleTriggerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = trigger(params.toBuilder().id(id).build(), requestOptions)

        /** @see trigger */
        @MustBeClosed
        suspend fun trigger(
            params: RuleTriggerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see trigger */
        @MustBeClosed
        suspend fun trigger(id: String, requestOptions: RequestOptions): HttpResponse =
            trigger(id, RuleTriggerParams.none(), requestOptions)
    }
}
