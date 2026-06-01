// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.insight.income

import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects

/** This endpoint gives a sum of the total income received by the user. */
class IncomeGetTotalParams
private constructor(
    private val end: LocalDate,
    private val start: LocalDate,
    private val accounts: List<Long>?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A date formatted YYYY-MM-DD. */
    fun end(): LocalDate = end

    /** A date formatted YYYY-MM-DD. */
    fun start(): LocalDate = start

    /**
     * The accounts to be included in the results. If you include ID's of asset accounts or
     * liabilities, only deposits to those asset accounts / liabilities will be included. Other
     * account ID's will be ignored.
     */
    fun accounts(): List<Long>? = accounts

    fun xTraceId(): String? = xTraceId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IncomeGetTotalParams].
         *
         * The following fields are required:
         * ```kotlin
         * .end()
         * .start()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IncomeGetTotalParams]. */
    class Builder internal constructor() {

        private var end: LocalDate? = null
        private var start: LocalDate? = null
        private var accounts: MutableList<Long>? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(incomeGetTotalParams: IncomeGetTotalParams) = apply {
            end = incomeGetTotalParams.end
            start = incomeGetTotalParams.start
            accounts = incomeGetTotalParams.accounts?.toMutableList()
            xTraceId = incomeGetTotalParams.xTraceId
            additionalHeaders = incomeGetTotalParams.additionalHeaders.toBuilder()
            additionalQueryParams = incomeGetTotalParams.additionalQueryParams.toBuilder()
        }

        /** A date formatted YYYY-MM-DD. */
        fun end(end: LocalDate) = apply { this.end = end }

        /** A date formatted YYYY-MM-DD. */
        fun start(start: LocalDate) = apply { this.start = start }

        /**
         * The accounts to be included in the results. If you include ID's of asset accounts or
         * liabilities, only deposits to those asset accounts / liabilities will be included. Other
         * account ID's will be ignored.
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
         * Returns an immutable instance of [IncomeGetTotalParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .end()
         * .start()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IncomeGetTotalParams =
            IncomeGetTotalParams(
                checkRequired("end", end),
                checkRequired("start", start),
                accounts?.toImmutable(),
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
                put("end", end.toString())
                put("start", start.toString())
                accounts?.let { put("accounts", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IncomeGetTotalParams &&
            end == other.end &&
            start == other.start &&
            accounts == other.accounts &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(end, start, accounts, xTraceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IncomeGetTotalParams{end=$end, start=$start, accounts=$accounts, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
