// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.usergroups

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Used to update a single user group. The available fields are still limited. */
class UserGroupUpdateParams
private constructor(
    private val id: String?,
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun xTraceId(): String? = xTraceId

    /**
     * A descriptive title for the user group.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = body.title()

    /**
     * Use either primary_currency_id or primary_currency_code. This will set the primary currency
     * for the user group ('financial administration').
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primaryCurrencyCode(): String? = body.primaryCurrencyCode()

    /**
     * Use either primary_currency_id or primary_currency_code. This will set the primary currency
     * for the user group ('financial administration').
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun primaryCurrencyId(): String? = body.primaryCurrencyId()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [primaryCurrencyCode].
     *
     * Unlike [primaryCurrencyCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _primaryCurrencyCode(): JsonField<String> = body._primaryCurrencyCode()

    /**
     * Returns the raw JSON value of [primaryCurrencyId].
     *
     * Unlike [primaryCurrencyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _primaryCurrencyId(): JsonField<String> = body._primaryCurrencyId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserGroupUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .title()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserGroupUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userGroupUpdateParams: UserGroupUpdateParams) = apply {
            id = userGroupUpdateParams.id
            xTraceId = userGroupUpdateParams.xTraceId
            body = userGroupUpdateParams.body.toBuilder()
            additionalHeaders = userGroupUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userGroupUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [title]
         * - [primaryCurrencyCode]
         * - [primaryCurrencyId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A descriptive title for the user group. */
        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        /**
         * Use either primary_currency_id or primary_currency_code. This will set the primary
         * currency for the user group ('financial administration').
         */
        fun primaryCurrencyCode(primaryCurrencyCode: String) = apply {
            body.primaryCurrencyCode(primaryCurrencyCode)
        }

        /**
         * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCurrencyCode(primaryCurrencyCode: JsonField<String>) = apply {
            body.primaryCurrencyCode(primaryCurrencyCode)
        }

        /**
         * Use either primary_currency_id or primary_currency_code. This will set the primary
         * currency for the user group ('financial administration').
         */
        fun primaryCurrencyId(primaryCurrencyId: String) = apply {
            body.primaryCurrencyId(primaryCurrencyId)
        }

        /**
         * Sets [Builder.primaryCurrencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCurrencyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCurrencyId(primaryCurrencyId: JsonField<String>) = apply {
            body.primaryCurrencyId(primaryCurrencyId)
        }

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
         * Returns an immutable instance of [UserGroupUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserGroupUpdateParams =
            UserGroupUpdateParams(
                id,
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

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

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val title: JsonField<String>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_code")
            @ExcludeMissing
            primaryCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_id")
            @ExcludeMissing
            primaryCurrencyId: JsonField<String> = JsonMissing.of(),
        ) : this(title, primaryCurrencyCode, primaryCurrencyId, mutableMapOf())

        /**
         * A descriptive title for the user group.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Use either primary_currency_id or primary_currency_code. This will set the primary
         * currency for the user group ('financial administration').
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencyCode(): String? =
            primaryCurrencyCode.getNullable("primary_currency_code")

        /**
         * Use either primary_currency_id or primary_currency_code. This will set the primary
         * currency for the user group ('financial administration').
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [primaryCurrencyCode].
         *
         * Unlike [primaryCurrencyCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_currency_code")
        @ExcludeMissing
        fun _primaryCurrencyCode(): JsonField<String> = primaryCurrencyCode

        /**
         * Returns the raw JSON value of [primaryCurrencyId].
         *
         * Unlike [primaryCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_currency_id")
        @ExcludeMissing
        fun _primaryCurrencyId(): JsonField<String> = primaryCurrencyId

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
             * .title()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var title: JsonField<String>? = null
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                title = body.title
                primaryCurrencyCode = body.primaryCurrencyCode
                primaryCurrencyId = body.primaryCurrencyId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A descriptive title for the user group. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /**
             * Use either primary_currency_id or primary_currency_code. This will set the primary
             * currency for the user group ('financial administration').
             */
            fun primaryCurrencyCode(primaryCurrencyCode: String) =
                primaryCurrencyCode(JsonField.of(primaryCurrencyCode))

            /**
             * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCurrencyCode(primaryCurrencyCode: JsonField<String>) = apply {
                this.primaryCurrencyCode = primaryCurrencyCode
            }

            /**
             * Use either primary_currency_id or primary_currency_code. This will set the primary
             * currency for the user group ('financial administration').
             */
            fun primaryCurrencyId(primaryCurrencyId: String) =
                primaryCurrencyId(JsonField.of(primaryCurrencyId))

            /**
             * Sets [Builder.primaryCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryCurrencyId(primaryCurrencyId: JsonField<String>) = apply {
                this.primaryCurrencyId = primaryCurrencyId
            }

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
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("title", title),
                    primaryCurrencyCode,
                    primaryCurrencyId,
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
         * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            title()
            primaryCurrencyCode()
            primaryCurrencyId()
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
        internal fun validity(): Int =
            (if (title.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                title == other.title &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyId == other.primaryCurrencyId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(title, primaryCurrencyCode, primaryCurrencyId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{title=$title, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyId=$primaryCurrencyId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserGroupUpdateParams &&
            id == other.id &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserGroupUpdateParams{id=$id, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
