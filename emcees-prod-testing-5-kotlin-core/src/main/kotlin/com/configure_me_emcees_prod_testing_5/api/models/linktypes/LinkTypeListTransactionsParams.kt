// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.linktypes

import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import java.time.LocalDate
import java.util.Objects

/** List all transactions under this link type, both the inward and outward transactions. */
class LinkTypeListTransactionsParams
private constructor(
    private val id: String?,
    private val end: LocalDate?,
    private val limit: Int?,
    private val page: Int?,
    private val start: LocalDate?,
    private val type: TransactionTypeFilter?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /** A date formatted YYYY-MM-DD, to limit the results. */
    fun end(): LocalDate? = end

    /** Number of items per page. The default pagination is per 50 items. */
    fun limit(): Int? = limit

    /** Page number. The default pagination is per 50 items. */
    fun page(): Int? = page

    /** A date formatted YYYY-MM-DD, to limit the results. */
    fun start(): LocalDate? = start

    fun type(): TransactionTypeFilter? = type

    fun xTraceId(): String? = xTraceId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LinkTypeListTransactionsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [LinkTypeListTransactionsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [LinkTypeListTransactionsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var end: LocalDate? = null
        private var limit: Int? = null
        private var page: Int? = null
        private var start: LocalDate? = null
        private var type: TransactionTypeFilter? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(linkTypeListTransactionsParams: LinkTypeListTransactionsParams) = apply {
            id = linkTypeListTransactionsParams.id
            end = linkTypeListTransactionsParams.end
            limit = linkTypeListTransactionsParams.limit
            page = linkTypeListTransactionsParams.page
            start = linkTypeListTransactionsParams.start
            type = linkTypeListTransactionsParams.type
            xTraceId = linkTypeListTransactionsParams.xTraceId
            additionalHeaders = linkTypeListTransactionsParams.additionalHeaders.toBuilder()
            additionalQueryParams = linkTypeListTransactionsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** A date formatted YYYY-MM-DD, to limit the results. */
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

        /** A date formatted YYYY-MM-DD, to limit the results. */
        fun start(start: LocalDate?) = apply { this.start = start }

        fun type(type: TransactionTypeFilter?) = apply { this.type = type }

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
         * Returns an immutable instance of [LinkTypeListTransactionsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LinkTypeListTransactionsParams =
            LinkTypeListTransactionsParams(
                id,
                end,
                limit,
                page,
                start,
                type,
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
                end?.let { put("end", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                page?.let { put("page", it.toString()) }
                start?.let { put("start", it.toString()) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LinkTypeListTransactionsParams &&
            id == other.id &&
            end == other.end &&
            limit == other.limit &&
            page == other.page &&
            start == other.start &&
            type == other.type &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            end,
            limit,
            page,
            start,
            type,
            xTraceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LinkTypeListTransactionsParams{id=$id, end=$end, limit=$limit, page=$page, start=$start, type=$type, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
