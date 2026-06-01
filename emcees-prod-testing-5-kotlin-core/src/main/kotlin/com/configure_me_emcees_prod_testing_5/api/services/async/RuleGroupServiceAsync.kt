// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.bills.RuleArray
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupListAllParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupListAllResponse
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupListRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupSingle
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupTestTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupTriggerRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.rulegroups.RuleGroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
interface RuleGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleGroupServiceAsync

    /**
     * Creates a new rule group. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: RuleGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle

    /** Get a single rule group. This does not include the rules. For that, see below. */
    suspend fun retrieve(
        id: String,
        params: RuleGroupRetrieveParams = RuleGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: RuleGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): RuleGroupSingle =
        retrieve(id, RuleGroupRetrieveParams.none(), requestOptions)

    /** Update existing rule group. */
    suspend fun update(
        id: String,
        params: RuleGroupUpdateParams = RuleGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: RuleGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): RuleGroupSingle =
        update(id, RuleGroupUpdateParams.none(), requestOptions)

    /** Delete a rule group. */
    suspend fun delete(
        id: String,
        params: RuleGroupDeleteParams = RuleGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: RuleGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, RuleGroupDeleteParams.none(), requestOptions)

    /** List all rule groups. */
    suspend fun listAll(
        params: RuleGroupListAllParams = RuleGroupListAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleGroupListAllResponse

    /** @see listAll */
    suspend fun listAll(requestOptions: RequestOptions): RuleGroupListAllResponse =
        listAll(RuleGroupListAllParams.none(), requestOptions)

    /** List rules in this rule group. */
    suspend fun listRules(
        id: String,
        params: RuleGroupListRulesParams = RuleGroupListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray = listRules(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRules */
    suspend fun listRules(
        params: RuleGroupListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleArray

    /** @see listRules */
    suspend fun listRules(id: String, requestOptions: RequestOptions): RuleArray =
        listRules(id, RuleGroupListRulesParams.none(), requestOptions)

    /**
     * Test which transactions would be hit by the rule group. No changes will be made. Limit the
     * result if you want to.
     */
    suspend fun testTransactions(
        id: String,
        params: RuleGroupTestTransactionsParams = RuleGroupTestTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = testTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see testTransactions */
    suspend fun testTransactions(
        params: RuleGroupTestTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see testTransactions */
    suspend fun testTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        testTransactions(id, RuleGroupTestTransactionsParams.none(), requestOptions)

    /**
     * Fire the rule group on your transactions. Changes will be made by the rules in the rule
     * group. Limit the result if you want to.
     */
    suspend fun triggerRules(
        id: String,
        params: RuleGroupTriggerRulesParams = RuleGroupTriggerRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = triggerRules(params.toBuilder().id(id).build(), requestOptions)

    /** @see triggerRules */
    suspend fun triggerRules(
        params: RuleGroupTriggerRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see triggerRules */
    suspend fun triggerRules(id: String, requestOptions: RequestOptions) =
        triggerRules(id, RuleGroupTriggerRulesParams.none(), requestOptions)

    /**
     * A view of [RuleGroupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RuleGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/rule-groups`, but is otherwise the same as
         * [RuleGroupServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RuleGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle>

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups/{id}`, but is otherwise the same as
         * [RuleGroupServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: RuleGroupRetrieveParams = RuleGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: RuleGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleGroupSingle> =
            retrieve(id, RuleGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/rule-groups/{id}`, but is otherwise the same as
         * [RuleGroupServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: RuleGroupUpdateParams = RuleGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: RuleGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleGroupSingle> =
            update(id, RuleGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/rule-groups/{id}`, but is otherwise the same
         * as [RuleGroupServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: RuleGroupDeleteParams = RuleGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: RuleGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, RuleGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups`, but is otherwise the same as
         * [RuleGroupServiceAsync.listAll].
         */
        @MustBeClosed
        suspend fun listAll(
            params: RuleGroupListAllParams = RuleGroupListAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleGroupListAllResponse>

        /** @see listAll */
        @MustBeClosed
        suspend fun listAll(
            requestOptions: RequestOptions
        ): HttpResponseFor<RuleGroupListAllResponse> =
            listAll(RuleGroupListAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups/{id}/rules`, but is otherwise the
         * same as [RuleGroupServiceAsync.listRules].
         */
        @MustBeClosed
        suspend fun listRules(
            id: String,
            params: RuleGroupListRulesParams = RuleGroupListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray> = listRules(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            params: RuleGroupListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleArray>

        /** @see listRules */
        @MustBeClosed
        suspend fun listRules(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleArray> =
            listRules(id, RuleGroupListRulesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/rule-groups/{id}/test`, but is otherwise the
         * same as [RuleGroupServiceAsync.testTransactions].
         */
        @MustBeClosed
        suspend fun testTransactions(
            id: String,
            params: RuleGroupTestTransactionsParams = RuleGroupTestTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            testTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see testTransactions */
        @MustBeClosed
        suspend fun testTransactions(
            params: RuleGroupTestTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see testTransactions */
        @MustBeClosed
        suspend fun testTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            testTransactions(id, RuleGroupTestTransactionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rule-groups/{id}/trigger`, but is otherwise the
         * same as [RuleGroupServiceAsync.triggerRules].
         */
        @MustBeClosed
        suspend fun triggerRules(
            id: String,
            params: RuleGroupTriggerRulesParams = RuleGroupTriggerRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = triggerRules(params.toBuilder().id(id).build(), requestOptions)

        /** @see triggerRules */
        @MustBeClosed
        suspend fun triggerRules(
            params: RuleGroupTriggerRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see triggerRules */
        @MustBeClosed
        suspend fun triggerRules(id: String, requestOptions: RequestOptions): HttpResponse =
            triggerRules(id, RuleGroupTriggerRulesParams.none(), requestOptions)
    }
}
