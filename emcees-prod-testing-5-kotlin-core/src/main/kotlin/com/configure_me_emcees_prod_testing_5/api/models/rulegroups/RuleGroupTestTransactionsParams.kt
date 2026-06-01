// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rulegroups

import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

/**
 * Test which transactions would be hit by the rule group. No changes will be made. Limit the result
 * if you want to.
 */
class RuleGroupTestTransactionsParams
private constructor(
    private val id: String?,
    private val accounts: List<Long>?,
    private val end: LocalDate?,
    private val limit: Int?,
    private val page: Int?,
    private val searchLimit: Long?,
    private val start: LocalDate?,
    private val triggeredLimit: Long?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Limit the testing of the rule group to these asset accounts or liabilities. Only asset
     * accounts and liabilities will be accepted. Other types will be silently dropped.
     */
    fun accounts(): List<Long>? = accounts

    /**
     * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both the
     * start date and the end date must be present.
     */
    fun end(): LocalDate? = end

    /** Number of items per page. The default pagination is per 50 items. */
    fun limit(): Int? = limit

    /** Page number. The default pagination is per 50 items. */
    fun page(): Int? = page

    /**
     * Maximum number of transactions Firefly III will try. Don't set this too high, or it will take
     * Firefly III very long to run the test. I suggest a max of 200.
     */
    fun searchLimit(): Long? = searchLimit

    /**
     * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both the
     * start date and the end date must be present.
     */
    fun start(): LocalDate? = start

    /**
     * Maximum number of transactions the rule group can actually trigger on, before Firefly III
     * stops. I would suggest setting this to 10 or 15. Don't go above the user's page size, because
     * browsing to page 2 or 3 of a test result would fire the test again, making any navigation
     * efforts very slow.
     */
    fun triggeredLimit(): Long? = triggeredLimit

    fun xTraceId(): String? = xTraceId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): RuleGroupTestTransactionsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [RuleGroupTestTransactionsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [RuleGroupTestTransactionsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var accounts: MutableList<Long>? = null
        private var end: LocalDate? = null
        private var limit: Int? = null
        private var page: Int? = null
        private var searchLimit: Long? = null
        private var start: LocalDate? = null
        private var triggeredLimit: Long? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ruleGroupTestTransactionsParams: RuleGroupTestTransactionsParams) =
            apply {
                id = ruleGroupTestTransactionsParams.id
                accounts = ruleGroupTestTransactionsParams.accounts?.toMutableList()
                end = ruleGroupTestTransactionsParams.end
                limit = ruleGroupTestTransactionsParams.limit
                page = ruleGroupTestTransactionsParams.page
                searchLimit = ruleGroupTestTransactionsParams.searchLimit
                start = ruleGroupTestTransactionsParams.start
                triggeredLimit = ruleGroupTestTransactionsParams.triggeredLimit
                xTraceId = ruleGroupTestTransactionsParams.xTraceId
                additionalHeaders = ruleGroupTestTransactionsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    ruleGroupTestTransactionsParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Limit the testing of the rule group to these asset accounts or liabilities. Only asset
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
         * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both
         * the start date and the end date must be present.
         */
        fun end(end: LocalDate?) = apply { this.end = end }

        /** Number of items per page. The default pagination is per 50 items. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Page number. The default pagination is per 50 items. */
        fun page(page: Int?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Int) = page(page as Int?)

        /**
         * Maximum number of transactions Firefly III will try. Don't set this too high, or it will
         * take Firefly III very long to run the test. I suggest a max of 200.
         */
        fun searchLimit(searchLimit: Long?) = apply { this.searchLimit = searchLimit }

        /**
         * Alias for [Builder.searchLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun searchLimit(searchLimit: Long) = searchLimit(searchLimit as Long?)

        /**
         * A date formatted YYYY-MM-DD, to limit the transactions the test will be applied to. Both
         * the start date and the end date must be present.
         */
        fun start(start: LocalDate?) = apply { this.start = start }

        /**
         * Maximum number of transactions the rule group can actually trigger on, before Firefly III
         * stops. I would suggest setting this to 10 or 15. Don't go above the user's page size,
         * because browsing to page 2 or 3 of a test result would fire the test again, making any
         * navigation efforts very slow.
         */
        fun triggeredLimit(triggeredLimit: Long?) = apply { this.triggeredLimit = triggeredLimit }

        /**
         * Alias for [Builder.triggeredLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun triggeredLimit(triggeredLimit: Long) = triggeredLimit(triggeredLimit as Long?)

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
         * Returns an immutable instance of [RuleGroupTestTransactionsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleGroupTestTransactionsParams =
            RuleGroupTestTransactionsParams(
                id,
                accounts?.toImmutable(),
                end,
                limit,
                page,
                searchLimit,
                start,
                triggeredLimit,
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
                limit?.let { put("limit", it.toString()) }
                page?.let { put("page", it.toString()) }
                searchLimit?.let { put("search_limit", it.toString()) }
                start?.let { put("start", it.toString()) }
                triggeredLimit?.let { put("triggered_limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleGroupTestTransactionsParams &&
            id == other.id &&
            accounts == other.accounts &&
            end == other.end &&
            limit == other.limit &&
            page == other.page &&
            searchLimit == other.searchLimit &&
            start == other.start &&
            triggeredLimit == other.triggeredLimit &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            accounts,
            end,
            limit,
            page,
            searchLimit,
            start,
            triggeredLimit,
            xTraceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RuleGroupTestTransactionsParams{id=$id, accounts=$accounts, end=$end, limit=$limit, page=$page, searchLimit=$searchLimit, start=$start, triggeredLimit=$triggeredLimit, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
