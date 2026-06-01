// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rulegroups

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

/**
 * Fire the rule group on your transactions. Changes will be made by the rules in the rule group.
 * Limit the result if you want to.
 */
class RuleGroupTriggerRulesParams
private constructor(
    private val id: String?,
    private val accounts: List<Long>?,
    private val end: LocalDate?,
    private val start: LocalDate?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun id(): String? = id

    /**
     * Limit the triggering of the rule group to these asset accounts or liabilities. Only asset
     * accounts and liabilities will be accepted. Other types will be silently dropped.
     */
    fun accounts(): List<Long>? = accounts

    /**
     * A date formatted YYYY-MM-DD, to limit the transactions the actions will be applied to. Both
     * the start date and the end date must be present.
     */
    fun end(): LocalDate? = end

    /**
     * A date formatted YYYY-MM-DD, to limit the transactions the actions will be applied to. Both
     * the start date and the end date must be present.
     */
    fun start(): LocalDate? = start

    fun xTraceId(): String? = xTraceId

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): RuleGroupTriggerRulesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [RuleGroupTriggerRulesParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [RuleGroupTriggerRulesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var accounts: MutableList<Long>? = null
        private var end: LocalDate? = null
        private var start: LocalDate? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ruleGroupTriggerRulesParams: RuleGroupTriggerRulesParams) = apply {
            id = ruleGroupTriggerRulesParams.id
            accounts = ruleGroupTriggerRulesParams.accounts?.toMutableList()
            end = ruleGroupTriggerRulesParams.end
            start = ruleGroupTriggerRulesParams.start
            xTraceId = ruleGroupTriggerRulesParams.xTraceId
            additionalHeaders = ruleGroupTriggerRulesParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleGroupTriggerRulesParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                ruleGroupTriggerRulesParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Limit the triggering of the rule group to these asset accounts or liabilities. Only asset
         * accounts and liabilities will be accepted. Other types will be silently dropped.
         */
        fun accounts(accounts: List<Long>?) = apply { this.accounts = accounts?.toMutableList() }

        /**
         * Adds a single [Long] to [accounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccount(account: Long) = apply {
            accounts = (accounts ?: mutableListOf()).apply { add(account) }
        }

        /**
         * A date formatted YYYY-MM-DD, to limit the transactions the actions will be applied to.
         * Both the start date and the end date must be present.
         */
        fun end(end: LocalDate?) = apply { this.end = end }

        /**
         * A date formatted YYYY-MM-DD, to limit the transactions the actions will be applied to.
         * Both the start date and the end date must be present.
         */
        fun start(start: LocalDate?) = apply { this.start = start }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [RuleGroupTriggerRulesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleGroupTriggerRulesParams =
            RuleGroupTriggerRulesParams(
                id,
                accounts?.toImmutable(),
                end,
                start,
                xTraceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Map<String, JsonValue>? = additionalBodyProperties.ifEmpty { null }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xTraceId?.let { put("X-Trace-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accounts?.let { put("accounts", it.joinToString(",") { it.toString() }) }
                end?.let { put("end", it.toString()) }
                start?.let { put("start", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleGroupTriggerRulesParams &&
            id == other.id &&
            accounts == other.accounts &&
            end == other.end &&
            start == other.start &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            accounts,
            end,
            start,
            xTraceId,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "RuleGroupTriggerRulesParams{id=$id, accounts=$accounts, end=$end, start=$start, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
