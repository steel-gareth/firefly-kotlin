// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.bills.RuleArray
import com.firefly.api.models.rulegroups.RuleGroupCreateParams
import com.firefly.api.models.rulegroups.RuleGroupDeleteParams
import com.firefly.api.models.rulegroups.RuleGroupListAllParams
import com.firefly.api.models.rulegroups.RuleGroupListAllResponse
import com.firefly.api.models.rulegroups.RuleGroupListRulesParams
import com.firefly.api.models.rulegroups.RuleGroupRetrieveParams
import com.firefly.api.models.rulegroups.RuleGroupSingle
import com.firefly.api.models.rulegroups.RuleGroupTestTransactionsParams
import com.firefly.api.models.rulegroups.RuleGroupTriggerRulesParams
import com.firefly.api.models.rulegroups.RuleGroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
interface RuleGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleGroupService

    /**
     * Creates a new rule group. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: RuleGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle

    /** Get a single rule group. This does not include the rules. For that, see below. */
    fun retrieve(
        id: String,
        params: RuleGroupRetrieveParams = RuleGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: RuleGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RuleGroupSingle =
        retrieve(id, RuleGroupRetrieveParams.none(), requestOptions)

    /** Update existing rule group. */
    fun update(
        id: String,
        params: RuleGroupUpdateParams = RuleGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: RuleGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): RuleGroupSingle =
        update(id, RuleGroupUpdateParams.none(), requestOptions)

    /** Delete a rule group. */
    fun delete(
        id: String,
        params: RuleGroupDeleteParams = RuleGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: RuleGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RuleGroupDeleteParams.none(), requestOptions)

    /** List all rule groups. */
    fun listAll(
        params: RuleGroupListAllParams = RuleGroupListAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupListAllResponse

    /** @see listAll */
    fun listAll(requestOptions: RequestOptions): RuleGroupListAllResponse =
        listAll(RuleGroupListAllParams.none(), requestOptions)

    /** List rules in this rule group. */
    fun listRules(
        id: String,
        params: RuleGroupListRulesParams = RuleGroupListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray = listRules(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRules */
    fun listRules(
        params: RuleGroupListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see listRules */
    fun listRules(id: String, requestOptions: RequestOptions): RuleArray =
        listRules(id, RuleGroupListRulesParams.none(), requestOptions)

    /**
     * Test which transactions would be hit by the rule group. No changes will be made. Limit the
     * result if you want to.
     */
    fun testTransactions(
        id: String,
        params: RuleGroupTestTransactionsParams = RuleGroupTestTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = testTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see testTransactions */
    fun testTransactions(
        params: RuleGroupTestTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see testTransactions */
    fun testTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        testTransactions(id, RuleGroupTestTransactionsParams.none(), requestOptions)

    /**
     * Fire the rule group on your transactions. Changes will be made by the rules in the rule
     * group. Limit the result if you want to.
     */
    fun triggerRules(
        id: String,
        params: RuleGroupTriggerRulesParams = RuleGroupTriggerRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = triggerRules(params.toBuilder().id(id).build(), requestOptions)

    /** @see triggerRules */
    fun triggerRules(
        params: RuleGroupTriggerRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see triggerRules */
    fun triggerRules(id: String, requestOptions: RequestOptions) =
        triggerRules(id, RuleGroupTriggerRulesParams.none(), requestOptions)

    /** A view of [RuleGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/rule-groups`, but is otherwise the same as
         * [RuleGroupService.create].
         */
        @MustBeClosed
        fun create(
            params: RuleGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle>

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups/{id}`, but is otherwise the same as
         * [RuleGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RuleGroupRetrieveParams = RuleGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RuleGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<RuleGroupSingle> =
            retrieve(id, RuleGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/rule-groups/{id}`, but is otherwise the same as
         * [RuleGroupService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: RuleGroupUpdateParams = RuleGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: RuleGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<RuleGroupSingle> =
            update(id, RuleGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/rule-groups/{id}`, but is otherwise the same
         * as [RuleGroupService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: RuleGroupDeleteParams = RuleGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RuleGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RuleGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups`, but is otherwise the same as
         * [RuleGroupService.listAll].
         */
        @MustBeClosed
        fun listAll(
            params: RuleGroupListAllParams = RuleGroupListAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupListAllResponse>

        /** @see listAll */
        @MustBeClosed
        fun listAll(requestOptions: RequestOptions): HttpResponseFor<RuleGroupListAllResponse> =
            listAll(RuleGroupListAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups/{id}/rules`, but is otherwise the
         * same as [RuleGroupService.listRules].
         */
        @MustBeClosed
        fun listRules(
            id: String,
            params: RuleGroupListRulesParams = RuleGroupListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray> = listRules(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: RuleGroupListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see listRules */
        @MustBeClosed
        fun listRules(id: String, requestOptions: RequestOptions): HttpResponseFor<RuleArray> =
            listRules(id, RuleGroupListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups/{id}/test`, but is otherwise the
         * same as [RuleGroupService.testTransactions].
         */
        @MustBeClosed
        fun testTransactions(
            id: String,
            params: RuleGroupTestTransactionsParams = RuleGroupTestTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            testTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see testTransactions */
        @MustBeClosed
        fun testTransactions(
            params: RuleGroupTestTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see testTransactions */
        @MustBeClosed
        fun testTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            testTransactions(id, RuleGroupTestTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rule-groups/{id}/trigger`, but is otherwise the
         * same as [RuleGroupService.triggerRules].
         */
        @MustBeClosed
        fun triggerRules(
            id: String,
            params: RuleGroupTriggerRulesParams = RuleGroupTriggerRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = triggerRules(params.toBuilder().id(id).build(), requestOptions)

        /** @see triggerRules */
        @MustBeClosed
        fun triggerRules(
            params: RuleGroupTriggerRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see triggerRules */
        @MustBeClosed
        fun triggerRules(id: String, requestOptions: RequestOptions): HttpResponse =
            triggerRules(id, RuleGroupTriggerRulesParams.none(), requestOptions)
    }
}
