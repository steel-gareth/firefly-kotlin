// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.configuration

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
import com.firefly.api.core.checkRequired
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Set a single configuration value. Not all configuration values can be updated so the list of
 * accepted configuration variables is small.
 */
class ConfigurationUpdateValueParams
private constructor(
    private val name: Name?,
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun name(): Name? = name

    fun xTraceId(): String? = xTraceId

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): PolymorphicProperty = body.value()

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _value(): JsonField<PolymorphicProperty> = body._value()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConfigurationUpdateValueParams].
         *
         * The following fields are required:
         * ```kotlin
         * .value()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConfigurationUpdateValueParams]. */
    class Builder internal constructor() {

        private var name: Name? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(configurationUpdateValueParams: ConfigurationUpdateValueParams) = apply {
            name = configurationUpdateValueParams.name
            xTraceId = configurationUpdateValueParams.xTraceId
            body = configurationUpdateValueParams.body.toBuilder()
            additionalHeaders = configurationUpdateValueParams.additionalHeaders.toBuilder()
            additionalQueryParams = configurationUpdateValueParams.additionalQueryParams.toBuilder()
        }

        fun name(name: Name?) = apply { this.name = name }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [value]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun value(value: PolymorphicProperty) = apply { body.value(value) }

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [PolymorphicProperty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun value(value: JsonField<PolymorphicProperty>) = apply { body.value(value) }

        /** Alias for calling [value] with `PolymorphicProperty.ofBoolean(boolean)`. */
        fun value(boolean: Boolean) = apply { body.value(boolean) }

        /** Alias for calling [value] with `PolymorphicProperty.ofString(string)`. */
        fun value(string: String) = apply { body.value(string) }

        /** Alias for calling [value] with `PolymorphicProperty.ofUnionMember2(unionMember2)`. */
        fun value(unionMember2: PolymorphicProperty.UnionMember2) = apply {
            body.value(unionMember2)
        }

        /** Alias for calling [value] with `PolymorphicProperty.ofStrings(strings)`. */
        fun valueOfStrings(strings: List<String>) = apply { body.valueOfStrings(strings) }

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
         * Returns an immutable instance of [ConfigurationUpdateValueParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfigurationUpdateValueParams =
            ConfigurationUpdateValueParams(
                name,
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> name?.toString() ?: ""
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
        private val value: JsonField<PolymorphicProperty>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("value")
            @ExcludeMissing
            value: JsonField<PolymorphicProperty> = JsonMissing.of()
        ) : this(value, mutableMapOf())

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): PolymorphicProperty = value.getRequired("value")

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<PolymorphicProperty> = value

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var value: JsonField<PolymorphicProperty>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                value = body.value
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun value(value: PolymorphicProperty) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [PolymorphicProperty] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<PolymorphicProperty>) = apply { this.value = value }

            /** Alias for calling [value] with `PolymorphicProperty.ofBoolean(boolean)`. */
            fun value(boolean: Boolean) = value(PolymorphicProperty.ofBoolean(boolean))

            /** Alias for calling [value] with `PolymorphicProperty.ofString(string)`. */
            fun value(string: String) = value(PolymorphicProperty.ofString(string))

            /**
             * Alias for calling [value] with `PolymorphicProperty.ofUnionMember2(unionMember2)`.
             */
            fun value(unionMember2: PolymorphicProperty.UnionMember2) =
                value(PolymorphicProperty.ofUnionMember2(unionMember2))

            /** Alias for calling [value] with `PolymorphicProperty.ofStrings(strings)`. */
            fun valueOfStrings(strings: List<String>) =
                value(PolymorphicProperty.ofStrings(strings))

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
             *
             * The following fields are required:
             * ```kotlin
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("value", value), additionalProperties.toMutableMap())
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

            value().validate()
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
        internal fun validity(): Int = (value.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{value=$value, additionalProperties=$additionalProperties}"
    }

    class Name @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CONFIGURATION_IS_DEMO_SITE = of("configuration.is_demo_site")

            val CONFIGURATION_PERMISSION_UPDATE_CHECK = of("configuration.permission_update_check")

            val CONFIGURATION_LAST_UPDATE_CHECK = of("configuration.last_update_check")

            val CONFIGURATION_SINGLE_USER_MODE = of("configuration.single_user_mode")

            val CONFIGURATION_ENABLE_EXCHANGE_RATES = of("configuration.enable_exchange_rates")

            val CONFIGURATION_USE_RUNNING_BALANCE = of("configuration.use_running_balance")

            val CONFIGURATION_ENABLE_EXTERNAL_MAP = of("configuration.enable_external_map")

            val CONFIGURATION_ENABLE_EXTERNAL_RATES = of("configuration.enable_external_rates")

            val CONFIGURATION_ALLOW_WEBHOOKS = of("configuration.allow_webhooks")

            val CONFIGURATION_VALID_URL_PROTOCOLS = of("configuration.valid_url_protocols")

            fun of(value: String) = Name(JsonField.of(value))
        }

        /** An enum containing [Name]'s known values. */
        enum class Known {
            CONFIGURATION_IS_DEMO_SITE,
            CONFIGURATION_PERMISSION_UPDATE_CHECK,
            CONFIGURATION_LAST_UPDATE_CHECK,
            CONFIGURATION_SINGLE_USER_MODE,
            CONFIGURATION_ENABLE_EXCHANGE_RATES,
            CONFIGURATION_USE_RUNNING_BALANCE,
            CONFIGURATION_ENABLE_EXTERNAL_MAP,
            CONFIGURATION_ENABLE_EXTERNAL_RATES,
            CONFIGURATION_ALLOW_WEBHOOKS,
            CONFIGURATION_VALID_URL_PROTOCOLS,
        }

        /**
         * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Name] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONFIGURATION_IS_DEMO_SITE,
            CONFIGURATION_PERMISSION_UPDATE_CHECK,
            CONFIGURATION_LAST_UPDATE_CHECK,
            CONFIGURATION_SINGLE_USER_MODE,
            CONFIGURATION_ENABLE_EXCHANGE_RATES,
            CONFIGURATION_USE_RUNNING_BALANCE,
            CONFIGURATION_ENABLE_EXTERNAL_MAP,
            CONFIGURATION_ENABLE_EXTERNAL_RATES,
            CONFIGURATION_ALLOW_WEBHOOKS,
            CONFIGURATION_VALID_URL_PROTOCOLS,
            /** An enum member indicating that [Name] was instantiated with an unknown value. */
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
                CONFIGURATION_IS_DEMO_SITE -> Value.CONFIGURATION_IS_DEMO_SITE
                CONFIGURATION_PERMISSION_UPDATE_CHECK -> Value.CONFIGURATION_PERMISSION_UPDATE_CHECK
                CONFIGURATION_LAST_UPDATE_CHECK -> Value.CONFIGURATION_LAST_UPDATE_CHECK
                CONFIGURATION_SINGLE_USER_MODE -> Value.CONFIGURATION_SINGLE_USER_MODE
                CONFIGURATION_ENABLE_EXCHANGE_RATES -> Value.CONFIGURATION_ENABLE_EXCHANGE_RATES
                CONFIGURATION_USE_RUNNING_BALANCE -> Value.CONFIGURATION_USE_RUNNING_BALANCE
                CONFIGURATION_ENABLE_EXTERNAL_MAP -> Value.CONFIGURATION_ENABLE_EXTERNAL_MAP
                CONFIGURATION_ENABLE_EXTERNAL_RATES -> Value.CONFIGURATION_ENABLE_EXTERNAL_RATES
                CONFIGURATION_ALLOW_WEBHOOKS -> Value.CONFIGURATION_ALLOW_WEBHOOKS
                CONFIGURATION_VALID_URL_PROTOCOLS -> Value.CONFIGURATION_VALID_URL_PROTOCOLS
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
                CONFIGURATION_IS_DEMO_SITE -> Known.CONFIGURATION_IS_DEMO_SITE
                CONFIGURATION_PERMISSION_UPDATE_CHECK -> Known.CONFIGURATION_PERMISSION_UPDATE_CHECK
                CONFIGURATION_LAST_UPDATE_CHECK -> Known.CONFIGURATION_LAST_UPDATE_CHECK
                CONFIGURATION_SINGLE_USER_MODE -> Known.CONFIGURATION_SINGLE_USER_MODE
                CONFIGURATION_ENABLE_EXCHANGE_RATES -> Known.CONFIGURATION_ENABLE_EXCHANGE_RATES
                CONFIGURATION_USE_RUNNING_BALANCE -> Known.CONFIGURATION_USE_RUNNING_BALANCE
                CONFIGURATION_ENABLE_EXTERNAL_MAP -> Known.CONFIGURATION_ENABLE_EXTERNAL_MAP
                CONFIGURATION_ENABLE_EXTERNAL_RATES -> Known.CONFIGURATION_ENABLE_EXTERNAL_RATES
                CONFIGURATION_ALLOW_WEBHOOKS -> Known.CONFIGURATION_ALLOW_WEBHOOKS
                CONFIGURATION_VALID_URL_PROTOCOLS -> Known.CONFIGURATION_VALID_URL_PROTOCOLS
                else -> throw FireflyInvalidDataException("Unknown Name: $value")
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
        fun validate(): Name = apply {
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

            return other is Name && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigurationUpdateValueParams &&
            name == other.name &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(name, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConfigurationUpdateValueParams{name=$name, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
