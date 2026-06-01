// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.firefly.api.core.Params
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

/**
 * Test which transactions would be hit by the rule. No changes will be made. Limit the result if
 * you want to.
 */
class RuleTestParams
private constructor(
    private val id: String?,
    private val accounts: List<Long>?,
    private val end: LocalDate?,
    private val start: LocalDate?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Limit the testing of the rule to these asset accounts or liabilities. Only asset accounts and
     * liabilities will be accepted. Other types will be silently dropped.
     */
    fun accounts(): List<Long>? = accounts

    /**
     * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both the
     * start date and the end date must be present.
     */
    fun end(): LocalDate? = end

    /**
     * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both the
     * start date and the end date must be present.
     */
    fun start(): LocalDate? = start

    fun xTraceId(): String? = xTraceId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): RuleTestParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RuleTestParams]. */
        fun builder() = Builder()
    }

    /** A builder for [RuleTestParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var accounts: MutableList<Long>? = null
        private var end: LocalDate? = null
        private var start: LocalDate? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ruleTestParams: RuleTestParams) = apply {
            id = ruleTestParams.id
            accounts = ruleTestParams.accounts?.toMutableList()
            end = ruleTestParams.end
            start = ruleTestParams.start
            xTraceId = ruleTestParams.xTraceId
            additionalHeaders = ruleTestParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleTestParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Limit the testing of the rule to these asset accounts or liabilities. Only asset accounts
         * and liabilities will be accepted. Other types will be silently dropped.
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
         * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both
         * the start date and the end date must be present.
         */
        fun end(end: LocalDate?) = apply { this.end = end }

        /**
         * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both
         * the start date and the end date must be present.
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

        /**
         * Returns an immutable instance of [RuleTestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleTestParams =
            RuleTestParams(
                id,
                accounts?.toImmutable(),
                end,
                start,
                xTraceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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

        return other is RuleTestParams &&
            id == other.id &&
            accounts == other.accounts &&
            end == other.end &&
            start == other.start &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, accounts, end, start, xTraceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleTestParams{id=$id, accounts=$accounts, end=$end, start=$start, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
