// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.firefly.api.core.Params
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.core.toImmutable
import com.firefly.api.models.accounts.AccountTypeFilter
import java.util.Objects

/** Returns all accounts of the user returned in a basic auto-complete array. */
class AutocompleteListAccountsParams
private constructor(
    private val date: String?,
    private val limit: Int?,
    private val query: String?,
    private val types: List<AccountTypeFilter>?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * If the account is an asset account or a liability, the autocomplete will also return the
     * balance of the account on this date.
     */
    fun date(): String? = date

    /** The number of items returned. */
    fun limit(): Int? = limit

    /** The autocomplete search query. */
    fun query(): String? = query

    /** Optional filter on the account type(s) used in the autocomplete. */
    fun types(): List<AccountTypeFilter>? = types

    fun xTraceId(): String? = xTraceId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): AutocompleteListAccountsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AutocompleteListAccountsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [AutocompleteListAccountsParams]. */
    class Builder internal constructor() {

        private var date: String? = null
        private var limit: Int? = null
        private var query: String? = null
        private var types: MutableList<AccountTypeFilter>? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(autocompleteListAccountsParams: AutocompleteListAccountsParams) = apply {
            date = autocompleteListAccountsParams.date
            limit = autocompleteListAccountsParams.limit
            query = autocompleteListAccountsParams.query
            types = autocompleteListAccountsParams.types?.toMutableList()
            xTraceId = autocompleteListAccountsParams.xTraceId
            additionalHeaders = autocompleteListAccountsParams.additionalHeaders.toBuilder()
            additionalQueryParams = autocompleteListAccountsParams.additionalQueryParams.toBuilder()
        }

        /**
         * If the account is an asset account or a liability, the autocomplete will also return the
         * balance of the account on this date.
         */
        fun date(date: String?) = apply { this.date = date }

        /** The number of items returned. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** The autocomplete search query. */
        fun query(query: String?) = apply { this.query = query }

        /** Optional filter on the account type(s) used in the autocomplete. */
        fun types(types: List<AccountTypeFilter>?) = apply { this.types = types?.toMutableList() }

        /**
         * Adds a single [AccountTypeFilter] to [types].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addType(type: AccountTypeFilter) = apply {
            types = (types ?: mutableListOf()).apply { add(type) }
        }

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
         * Returns an immutable instance of [AutocompleteListAccountsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AutocompleteListAccountsParams =
            AutocompleteListAccountsParams(
                date,
                limit,
                query,
                types?.toImmutable(),
                xTraceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
                date?.let { put("date", it) }
                limit?.let { put("limit", it.toString()) }
                query?.let { put("query", it) }
                types?.let { put("types", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutocompleteListAccountsParams &&
            date == other.date &&
            limit == other.limit &&
            query == other.query &&
            types == other.types &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(date, limit, query, types, xTraceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AutocompleteListAccountsParams{date=$date, limit=$limit, query=$query, types=$types, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
