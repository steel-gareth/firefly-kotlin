// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.data

import com.fasterxml.jackson.annotation.JsonCreator
import com.firefly.api.core.Enum
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.checkRequired
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Objects

/**
 * A call to this endpoint deletes the requested data type. Use it with care and always with user
 * permission. The demo user is incapable of using this endpoint.
 */
class DataDestroyParams
private constructor(
    private val objects: Objects,
    private val xTraceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /** The type of data that you wish to destroy. You can only use one at a time. */
    fun objects(): Objects = objects

    fun xTraceId(): String? = xTraceId

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataDestroyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .objects()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DataDestroyParams]. */
    class Builder internal constructor() {

        private var objects: Objects? = null
        private var xTraceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dataDestroyParams: DataDestroyParams) = apply {
            objects = dataDestroyParams.objects
            xTraceId = dataDestroyParams.xTraceId
            additionalHeaders = dataDestroyParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataDestroyParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = dataDestroyParams.additionalBodyProperties.toMutableMap()
        }

        /** The type of data that you wish to destroy. You can only use one at a time. */
        fun objects(objects: Objects) = apply { this.objects = objects }

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
         * Returns an immutable instance of [DataDestroyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .objects()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataDestroyParams =
            DataDestroyParams(
                checkRequired("objects", objects),
                xTraceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Map<String, JsonValue>? = additionalBodyProperties.ifEmpty { null }

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
                put("objects", objects.toString())
                putAll(additionalQueryParams)
            }
            .build()

    /** The type of data that you wish to destroy. You can only use one at a time. */
    class Objects @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val NOT_ASSETS_LIABILITIES = of("not_assets_liabilities")

            val BUDGETS = of("budgets")

            val BILLS = of("bills")

            val PIGGY_BANKS = of("piggy_banks")

            val RULES = of("rules")

            val RECURRING = of("recurring")

            val CATEGORIES = of("categories")

            val TAGS = of("tags")

            val OBJECT_GROUPS = of("object_groups")

            val ACCOUNTS = of("accounts")

            val ASSET_ACCOUNTS = of("asset_accounts")

            val EXPENSE_ACCOUNTS = of("expense_accounts")

            val REVENUE_ACCOUNTS = of("revenue_accounts")

            val LIABILITIES = of("liabilities")

            val TRANSACTIONS = of("transactions")

            val WITHDRAWALS = of("withdrawals")

            val DEPOSITS = of("deposits")

            val TRANSFERS = of("transfers")

            fun of(value: String) = Objects(JsonField.of(value))
        }

        /** An enum containing [Objects]'s known values. */
        enum class Known {
            NOT_ASSETS_LIABILITIES,
            BUDGETS,
            BILLS,
            PIGGY_BANKS,
            RULES,
            RECURRING,
            CATEGORIES,
            TAGS,
            OBJECT_GROUPS,
            ACCOUNTS,
            ASSET_ACCOUNTS,
            EXPENSE_ACCOUNTS,
            REVENUE_ACCOUNTS,
            LIABILITIES,
            TRANSACTIONS,
            WITHDRAWALS,
            DEPOSITS,
            TRANSFERS,
        }

        /**
         * An enum containing [Objects]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Objects] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_ASSETS_LIABILITIES,
            BUDGETS,
            BILLS,
            PIGGY_BANKS,
            RULES,
            RECURRING,
            CATEGORIES,
            TAGS,
            OBJECT_GROUPS,
            ACCOUNTS,
            ASSET_ACCOUNTS,
            EXPENSE_ACCOUNTS,
            REVENUE_ACCOUNTS,
            LIABILITIES,
            TRANSACTIONS,
            WITHDRAWALS,
            DEPOSITS,
            TRANSFERS,
            /** An enum member indicating that [Objects] was instantiated with an unknown value. */
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
                NOT_ASSETS_LIABILITIES -> Value.NOT_ASSETS_LIABILITIES
                BUDGETS -> Value.BUDGETS
                BILLS -> Value.BILLS
                PIGGY_BANKS -> Value.PIGGY_BANKS
                RULES -> Value.RULES
                RECURRING -> Value.RECURRING
                CATEGORIES -> Value.CATEGORIES
                TAGS -> Value.TAGS
                OBJECT_GROUPS -> Value.OBJECT_GROUPS
                ACCOUNTS -> Value.ACCOUNTS
                ASSET_ACCOUNTS -> Value.ASSET_ACCOUNTS
                EXPENSE_ACCOUNTS -> Value.EXPENSE_ACCOUNTS
                REVENUE_ACCOUNTS -> Value.REVENUE_ACCOUNTS
                LIABILITIES -> Value.LIABILITIES
                TRANSACTIONS -> Value.TRANSACTIONS
                WITHDRAWALS -> Value.WITHDRAWALS
                DEPOSITS -> Value.DEPOSITS
                TRANSFERS -> Value.TRANSFERS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FireflyInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NOT_ASSETS_LIABILITIES -> Known.NOT_ASSETS_LIABILITIES
                BUDGETS -> Known.BUDGETS
                BILLS -> Known.BILLS
                PIGGY_BANKS -> Known.PIGGY_BANKS
                RULES -> Known.RULES
                RECURRING -> Known.RECURRING
                CATEGORIES -> Known.CATEGORIES
                TAGS -> Known.TAGS
                OBJECT_GROUPS -> Known.OBJECT_GROUPS
                ACCOUNTS -> Known.ACCOUNTS
                ASSET_ACCOUNTS -> Known.ASSET_ACCOUNTS
                EXPENSE_ACCOUNTS -> Known.EXPENSE_ACCOUNTS
                REVENUE_ACCOUNTS -> Known.REVENUE_ACCOUNTS
                LIABILITIES -> Known.LIABILITIES
                TRANSACTIONS -> Known.TRANSACTIONS
                WITHDRAWALS -> Known.WITHDRAWALS
                DEPOSITS -> Known.DEPOSITS
                TRANSFERS -> Known.TRANSFERS
                else -> throw FireflyInvalidDataException("Unknown Objects: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FireflyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw FireflyInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws FireflyInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Objects = apply {
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
            } catch (e: FireflyInvalidDataException) {
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

            return other is Objects && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataDestroyParams &&
            objects == other.objects &&
            xTraceId == other.xTraceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            objects,
            xTraceId,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "DataDestroyParams{objects=$objects, xTraceId=$xTraceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
