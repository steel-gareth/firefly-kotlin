// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.currencies

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.Enum
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

/** Update existing currency. */
class CurrencyUpdateParams
private constructor(
    private val pathCode: String?,
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathCode(): String? = pathCode

    fun xTraceId(): String? = xTraceId

    /**
     * The currency code
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyCode(): String? = body.bodyCode()

    /**
     * How many decimals to use when displaying this currency. Between 0 and 16.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decimalPlaces(): Int? = body.decimalPlaces()

    /**
     * If the currency is enabled
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Boolean? = body.enabled()

    /**
     * The currency name
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * If the currency must be the primary for the user. You can only submit TRUE. Submitting FALSE
     * will not drop this currency as the primary currency, because then the system would be without
     * one.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primary(): Primary? = body.primary()

    /**
     * The currency symbol
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): String? = body.symbol()

    /**
     * Returns the raw JSON value of [bodyCode].
     *
     * Unlike [bodyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyCode(): JsonField<String> = body._bodyCode()

    /**
     * Returns the raw JSON value of [decimalPlaces].
     *
     * Unlike [decimalPlaces], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _decimalPlaces(): JsonField<Int> = body._decimalPlaces()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [primary].
     *
     * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _primary(): JsonField<Primary> = body._primary()

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _symbol(): JsonField<String> = body._symbol()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CurrencyUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CurrencyUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CurrencyUpdateParams]. */
    class Builder internal constructor() {

        private var pathCode: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(currencyUpdateParams: CurrencyUpdateParams) = apply {
            pathCode = currencyUpdateParams.pathCode
            xTraceId = currencyUpdateParams.xTraceId
            body = currencyUpdateParams.body.toBuilder()
            additionalHeaders = currencyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = currencyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pathCode(pathCode: String?) = apply { this.pathCode = pathCode }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bodyCode]
         * - [decimalPlaces]
         * - [enabled]
         * - [name]
         * - [primary]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The currency code */
        fun bodyCode(bodyCode: String) = apply { body.bodyCode(bodyCode) }

        /**
         * Sets [Builder.bodyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bodyCode(bodyCode: JsonField<String>) = apply { body.bodyCode(bodyCode) }

        /** How many decimals to use when displaying this currency. Between 0 and 16. */
        fun decimalPlaces(decimalPlaces: Int) = apply { body.decimalPlaces(decimalPlaces) }

        /**
         * Sets [Builder.decimalPlaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decimalPlaces] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decimalPlaces(decimalPlaces: JsonField<Int>) = apply {
            body.decimalPlaces(decimalPlaces)
        }

        /** If the currency is enabled */
        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        /** The currency name */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * If the currency must be the primary for the user. You can only submit TRUE. Submitting
         * FALSE will not drop this currency as the primary currency, because then the system would
         * be without one.
         */
        fun primary(primary: Primary) = apply { body.primary(primary) }

        /**
         * Sets [Builder.primary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primary] with a well-typed [Primary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun primary(primary: JsonField<Primary>) = apply { body.primary(primary) }

        /** The currency symbol */
        fun symbol(symbol: String) = apply { body.symbol(symbol) }

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { body.symbol(symbol) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [CurrencyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CurrencyUpdateParams =
            CurrencyUpdateParams(
                pathCode,
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathCode ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xTraceId?.let { put("X-Trace-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bodyCode: JsonField<String>,
        private val decimalPlaces: JsonField<Int>,
        private val enabled: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val primary: JsonField<Primary>,
        private val symbol: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing bodyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("decimal_places")
            @ExcludeMissing
            decimalPlaces: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary") @ExcludeMissing primary: JsonField<Primary> = JsonMissing.of(),
            @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        ) : this(bodyCode, decimalPlaces, enabled, name, primary, symbol, mutableMapOf())

        /**
         * The currency code
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyCode(): String? = bodyCode.getNullable("code")

        /**
         * How many decimals to use when displaying this currency. Between 0 and 16.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun decimalPlaces(): Int? = decimalPlaces.getNullable("decimal_places")

        /**
         * If the currency is enabled
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Boolean? = enabled.getNullable("enabled")

        /**
         * The currency name
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * If the currency must be the primary for the user. You can only submit TRUE. Submitting
         * FALSE will not drop this currency as the primary currency, because then the system would
         * be without one.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primary(): Primary? = primary.getNullable("primary")

        /**
         * The currency symbol
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun symbol(): String? = symbol.getNullable("symbol")

        /**
         * Returns the raw JSON value of [bodyCode].
         *
         * Unlike [bodyCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _bodyCode(): JsonField<String> = bodyCode

        /**
         * Returns the raw JSON value of [decimalPlaces].
         *
         * Unlike [decimalPlaces], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("decimal_places")
        @ExcludeMissing
        fun _decimalPlaces(): JsonField<Int> = decimalPlaces

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [primary].
         *
         * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<Primary> = primary

        /**
         * Returns the raw JSON value of [symbol].
         *
         * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bodyCode: JsonField<String> = JsonMissing.of()
            private var decimalPlaces: JsonField<Int> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var primary: JsonField<Primary> = JsonMissing.of()
            private var symbol: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                bodyCode = body.bodyCode
                decimalPlaces = body.decimalPlaces
                enabled = body.enabled
                name = body.name
                primary = body.primary
                symbol = body.symbol
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The currency code */
            fun bodyCode(bodyCode: String) = bodyCode(JsonField.of(bodyCode))

            /**
             * Sets [Builder.bodyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyCode(bodyCode: JsonField<String>) = apply { this.bodyCode = bodyCode }

            /** How many decimals to use when displaying this currency. Between 0 and 16. */
            fun decimalPlaces(decimalPlaces: Int) = decimalPlaces(JsonField.of(decimalPlaces))

            /**
             * Sets [Builder.decimalPlaces] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decimalPlaces] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decimalPlaces(decimalPlaces: JsonField<Int>) = apply {
                this.decimalPlaces = decimalPlaces
            }

            /** If the currency is enabled */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /** The currency name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If the currency must be the primary for the user. You can only submit TRUE.
             * Submitting FALSE will not drop this currency as the primary currency, because then
             * the system would be without one.
             */
            fun primary(primary: Primary) = primary(JsonField.of(primary))

            /**
             * Sets [Builder.primary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primary] with a well-typed [Primary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primary(primary: JsonField<Primary>) = apply { this.primary = primary }

            /** The currency symbol */
            fun symbol(symbol: String) = symbol(JsonField.of(symbol))

            /**
             * Sets [Builder.symbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.symbol] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    bodyCode,
                    decimalPlaces,
                    enabled,
                    name,
                    primary,
                    symbol,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bodyCode()
            decimalPlaces()
            enabled()
            name()
            primary()?.validate()
            symbol()
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
        internal fun validity(): Int =
            (if (bodyCode.asKnown() == null) 0 else 1) +
                (if (decimalPlaces.asKnown() == null) 0 else 1) +
                (if (enabled.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (primary.asKnown()?.validity() ?: 0) +
                (if (symbol.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bodyCode == other.bodyCode &&
                decimalPlaces == other.decimalPlaces &&
                enabled == other.enabled &&
                name == other.name &&
                primary == other.primary &&
                symbol == other.symbol &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bodyCode,
                decimalPlaces,
                enabled,
                name,
                primary,
                symbol,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bodyCode=$bodyCode, decimalPlaces=$decimalPlaces, enabled=$enabled, name=$name, primary=$primary, symbol=$symbol, additionalProperties=$additionalProperties}"
    }

    /**
     * If the currency must be the primary for the user. You can only submit TRUE. Submitting FALSE
     * will not drop this currency as the primary currency, because then the system would be without
     * one.
     */
    class Primary @JsonCreator private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            val TRUE = of(true)

            fun of(value: Boolean) = Primary(JsonField.of(value))
        }

        /** An enum containing [Primary]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [Primary]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Primary] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /** An enum member indicating that [Primary] was instantiated with an unknown value. */
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else -> throw FireflyInvalidDataException("Unknown Primary: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws FireflyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean() ?: throw FireflyInvalidDataException("Value is not a Boolean")

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
        fun validate(): Primary = apply {
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

            return other is Primary && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrencyUpdateParams &&
            pathCode == other.pathCode &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathCode, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CurrencyUpdateParams{pathCode=$pathCode, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
