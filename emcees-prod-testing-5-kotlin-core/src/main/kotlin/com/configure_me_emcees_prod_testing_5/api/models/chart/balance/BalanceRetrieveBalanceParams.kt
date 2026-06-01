// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.chart.balance

import com.configure_me_emcees_prod_testing_5.api.core.Enum
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.LocalDate
import java.util.Objects

/** This endpoint returns the data required to generate a chart with balance information. */
class BalanceRetrieveBalanceParams
private constructor(
    private val end: LocalDate,
    private val start: LocalDate,
    private val accounts: List<Long>?,
    private val period: Period?,
    private val preselected: Preselected?,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A date formatted YYYY-MM-DD. */
    fun end(): LocalDate = end

    /** A date formatted YYYY-MM-DD. */
    fun start(): LocalDate = start

    /**
     * Limit the chart to these asset accounts or liabilities. Only asset accounts and liabilities
     * will be accepted. Other types will be silently dropped.
     *
     * This list of accounts will be OVERRULED by the `preselected` parameter.
     */
    fun accounts(): List<Long>? = accounts

    /**
     * Optional period to group the data by. If not provided, it will default to '1M' or whatever is
     * deemed relevant for the range provided.
     *
     * If you want to know which periods are available, see the enums or get the configuration
     * value: `GET /api/v1/configuration/firefly.valid_view_ranges`
     */
    fun period(): Period? = period

    /**
     * Optional set of preselected accounts to limit the chart to. This may be easier than
     * submitting all asset accounts manually, for example. If you want to know which selection are
     * available, see the enums here or get the configuration value: `GET
     * /api/v1/configuration/firefly.preselected_accounts`
     * - `empty`: do not do a pre-selection
     * - `all`: select all asset and all liability accounts
     * - `assets`: select all asset accounts
     * - `liabilities`: select all liability accounts
     *
     * If no accounts are found, the user's "frontpage accounts" preference will be used. If that is
     * empty, all asset accounts will be used.
     */
    fun preselected(): Preselected? = preselected

    fun xTraceId(): String? = xTraceId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceRetrieveBalanceParams].
         *
         * The following fields are required:
         * ```kotlin
         * .end()
         * .start()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceRetrieveBalanceParams]. */
    class Builder internal constructor() {

        private var end: LocalDate? = null
        private var start: LocalDate? = null
        private var accounts: MutableList<Long>? = null
        private var period: Period? = null
        private var preselected: Preselected? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(balanceRetrieveBalanceParams: BalanceRetrieveBalanceParams) = apply {
            end = balanceRetrieveBalanceParams.end
            start = balanceRetrieveBalanceParams.start
            accounts = balanceRetrieveBalanceParams.accounts?.toMutableList()
            period = balanceRetrieveBalanceParams.period
            preselected = balanceRetrieveBalanceParams.preselected
            xTraceId = balanceRetrieveBalanceParams.xTraceId
            additionalHeaders = balanceRetrieveBalanceParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceRetrieveBalanceParams.additionalQueryParams.toBuilder()
        }

        /** A date formatted YYYY-MM-DD. */
        fun end(end: LocalDate) = apply { this.end = end }

        /** A date formatted YYYY-MM-DD. */
        fun start(start: LocalDate) = apply { this.start = start }

        /**
         * Limit the chart to these asset accounts or liabilities. Only asset accounts and
         * liabilities will be accepted. Other types will be silently dropped.
         *
         * This list of accounts will be OVERRULED by the `preselected` parameter.
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
         * Optional period to group the data by. If not provided, it will default to '1M' or
         * whatever is deemed relevant for the range provided.
         *
         * If you want to know which periods are available, see the enums or get the configuration
         * value: `GET /api/v1/configuration/firefly.valid_view_ranges`
         */
        fun period(period: Period?) = apply { this.period = period }

        /**
         * Optional set of preselected accounts to limit the chart to. This may be easier than
         * submitting all asset accounts manually, for example. If you want to know which selection
         * are available, see the enums here or get the configuration value: `GET
         * /api/v1/configuration/firefly.preselected_accounts`
         * - `empty`: do not do a pre-selection
         * - `all`: select all asset and all liability accounts
         * - `assets`: select all asset accounts
         * - `liabilities`: select all liability accounts
         *
         * If no accounts are found, the user's "frontpage accounts" preference will be used. If
         * that is empty, all asset accounts will be used.
         */
        fun preselected(preselected: Preselected?) = apply { this.preselected = preselected }

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
         * Returns an immutable instance of [BalanceRetrieveBalanceParams].
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
        fun build(): BalanceRetrieveBalanceParams =
            BalanceRetrieveBalanceParams(
                checkRequired("end", end),
                checkRequired("start", start),
                accounts?.toImmutable(),
                period,
                preselected,
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
                period?.let { put("period", it.toString()) }
                preselected?.let { put("preselected", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Optional period to group the data by. If not provided, it will default to '1M' or whatever is
     * deemed relevant for the range provided.
     *
     * If you want to know which periods are available, see the enums or get the configuration
     * value: `GET /api/v1/configuration/firefly.valid_view_ranges`
     */
    class Period @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val _1_D = of("1D")

            val _1_W = of("1W")

            val _1_M = of("1M")

            val _3_M = of("3M")

            val _6_M = of("6M")

            val _1_Y = of("1Y")

            fun of(value: String) = Period(JsonField.of(value))
        }

        /** An enum containing [Period]'s known values. */
        enum class Known {
            _1_D,
            _1_W,
            _1_M,
            _3_M,
            _6_M,
            _1_Y,
        }

        /**
         * An enum containing [Period]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Period] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1_D,
            _1_W,
            _1_M,
            _3_M,
            _6_M,
            _1_Y,
            /** An enum member indicating that [Period] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _1_D -> Value._1_D
                _1_W -> Value._1_W
                _1_M -> Value._1_M
                _3_M -> Value._3_M
                _6_M -> Value._6_M
                _1_Y -> Value._1_Y
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EmceesProdTesting5InvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                _1_D -> Known._1_D
                _1_W -> Known._1_W
                _1_M -> Known._1_M
                _3_M -> Known._3_M
                _6_M -> Known._6_M
                _1_Y -> Known._1_Y
                else -> throw EmceesProdTesting5InvalidDataException("Unknown Period: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EmceesProdTesting5InvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw EmceesProdTesting5InvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Period = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EmceesProdTesting5InvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Period && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Optional set of preselected accounts to limit the chart to. This may be easier than
     * submitting all asset accounts manually, for example. If you want to know which selection are
     * available, see the enums here or get the configuration value: `GET
     * /api/v1/configuration/firefly.preselected_accounts`
     * - `empty`: do not do a pre-selection
     * - `all`: select all asset and all liability accounts
     * - `assets`: select all asset accounts
     * - `liabilities`: select all liability accounts
     *
     * If no accounts are found, the user's "frontpage accounts" preference will be used. If that is
     * empty, all asset accounts will be used.
     */
    class Preselected @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EMPTY = of("empty")

            val ALL = of("all")

            val ASSETS = of("assets")

            val LIABILITIES = of("liabilities")

            fun of(value: String) = Preselected(JsonField.of(value))
        }

        /** An enum containing [Preselected]'s known values. */
        enum class Known {
            EMPTY,
            ALL,
            ASSETS,
            LIABILITIES,
        }

        /**
         * An enum containing [Preselected]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Preselected] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMPTY,
            ALL,
            ASSETS,
            LIABILITIES,
            /**
             * An enum member indicating that [Preselected] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EMPTY -> Value.EMPTY
                ALL -> Value.ALL
                ASSETS -> Value.ASSETS
                LIABILITIES -> Value.LIABILITIES
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws EmceesProdTesting5InvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                EMPTY -> Known.EMPTY
                ALL -> Known.ALL
                ASSETS -> Known.ASSETS
                LIABILITIES -> Known.LIABILITIES
                else -> throw EmceesProdTesting5InvalidDataException("Unknown Preselected: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws EmceesProdTesting5InvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw EmceesProdTesting5InvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Preselected = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: EmceesProdTesting5InvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Preselected && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceRetrieveBalanceParams &&
            end == other.end &&
            start == other.start &&
            accounts == other.accounts &&
            period == other.period &&
            preselected == other.preselected &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            end,
            start,
            accounts,
            period,
            preselected,
            xTraceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BalanceRetrieveBalanceParams{end=$end, start=$start, accounts=$accounts, period=$period, preselected=$preselected, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
