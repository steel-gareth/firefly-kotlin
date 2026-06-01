// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.transactionlinks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Store a new link between two transactions. For this end point you need the journal_id from a
 * transaction.
 */
class TransactionLinkCreateParams
private constructor(
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xTraceId(): String? = xTraceId

    /**
     * The inward transaction transaction_journal_id for the link. This becomes the 'is paid by'
     * transaction of the set.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inwardId(): String = body.inwardId()

    /**
     * The link type ID to use. You can also use the link_type_name field.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkTypeId(): String = body.linkTypeId()

    /**
     * The outward transaction transaction_journal_id for the link. This becomes the 'pays for'
     * transaction of the set.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outwardId(): String = body.outwardId()

    /**
     * The link type name to use. You can also use the link_type_id field.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkTypeName(): String? = body.linkTypeName()

    /**
     * Optional. Some notes.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): String? = body.notes()

    /**
     * Returns the raw JSON value of [inwardId].
     *
     * Unlike [inwardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inwardId(): JsonField<String> = body._inwardId()

    /**
     * Returns the raw JSON value of [linkTypeId].
     *
     * Unlike [linkTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _linkTypeId(): JsonField<String> = body._linkTypeId()

    /**
     * Returns the raw JSON value of [outwardId].
     *
     * Unlike [outwardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outwardId(): JsonField<String> = body._outwardId()

    /**
     * Returns the raw JSON value of [linkTypeName].
     *
     * Unlike [linkTypeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _linkTypeName(): JsonField<String> = body._linkTypeName()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionLinkCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .inwardId()
         * .linkTypeId()
         * .outwardId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionLinkCreateParams]. */
    class Builder internal constructor() {

        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionLinkCreateParams: TransactionLinkCreateParams) = apply {
            xTraceId = transactionLinkCreateParams.xTraceId
            body = transactionLinkCreateParams.body.toBuilder()
            additionalHeaders = transactionLinkCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionLinkCreateParams.additionalQueryParams.toBuilder()
        }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inwardId]
         * - [linkTypeId]
         * - [outwardId]
         * - [linkTypeName]
         * - [notes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The inward transaction transaction_journal_id for the link. This becomes the 'is paid by'
         * transaction of the set.
         */
        fun inwardId(inwardId: String) = apply { body.inwardId(inwardId) }

        /**
         * Sets [Builder.inwardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inwardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inwardId(inwardId: JsonField<String>) = apply { body.inwardId(inwardId) }

        /** The link type ID to use. You can also use the link_type_name field. */
        fun linkTypeId(linkTypeId: String) = apply { body.linkTypeId(linkTypeId) }

        /**
         * Sets [Builder.linkTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun linkTypeId(linkTypeId: JsonField<String>) = apply { body.linkTypeId(linkTypeId) }

        /**
         * The outward transaction transaction_journal_id for the link. This becomes the 'pays for'
         * transaction of the set.
         */
        fun outwardId(outwardId: String) = apply { body.outwardId(outwardId) }

        /**
         * Sets [Builder.outwardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outwardId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outwardId(outwardId: JsonField<String>) = apply { body.outwardId(outwardId) }

        /** The link type name to use. You can also use the link_type_id field. */
        fun linkTypeName(linkTypeName: String) = apply { body.linkTypeName(linkTypeName) }

        /**
         * Sets [Builder.linkTypeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkTypeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun linkTypeName(linkTypeName: JsonField<String>) = apply {
            body.linkTypeName(linkTypeName)
        }

        /** Optional. Some notes. */
        fun notes(notes: String?) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

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
         * Returns an immutable instance of [TransactionLinkCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .inwardId()
         * .linkTypeId()
         * .outwardId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionLinkCreateParams =
            TransactionLinkCreateParams(
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

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
        private val inwardId: JsonField<String>,
        private val linkTypeId: JsonField<String>,
        private val outwardId: JsonField<String>,
        private val linkTypeName: JsonField<String>,
        private val notes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("inward_id")
            @ExcludeMissing
            inwardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("link_type_id")
            @ExcludeMissing
            linkTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outward_id")
            @ExcludeMissing
            outwardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("link_type_name")
            @ExcludeMissing
            linkTypeName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        ) : this(inwardId, linkTypeId, outwardId, linkTypeName, notes, mutableMapOf())

        /**
         * The inward transaction transaction_journal_id for the link. This becomes the 'is paid by'
         * transaction of the set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inwardId(): String = inwardId.getRequired("inward_id")

        /**
         * The link type ID to use. You can also use the link_type_name field.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun linkTypeId(): String = linkTypeId.getRequired("link_type_id")

        /**
         * The outward transaction transaction_journal_id for the link. This becomes the 'pays for'
         * transaction of the set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outwardId(): String = outwardId.getRequired("outward_id")

        /**
         * The link type name to use. You can also use the link_type_id field.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkTypeName(): String? = linkTypeName.getNullable("link_type_name")

        /**
         * Optional. Some notes.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * Returns the raw JSON value of [inwardId].
         *
         * Unlike [inwardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inward_id") @ExcludeMissing fun _inwardId(): JsonField<String> = inwardId

        /**
         * Returns the raw JSON value of [linkTypeId].
         *
         * Unlike [linkTypeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("link_type_id")
        @ExcludeMissing
        fun _linkTypeId(): JsonField<String> = linkTypeId

        /**
         * Returns the raw JSON value of [outwardId].
         *
         * Unlike [outwardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outward_id") @ExcludeMissing fun _outwardId(): JsonField<String> = outwardId

        /**
         * Returns the raw JSON value of [linkTypeName].
         *
         * Unlike [linkTypeName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("link_type_name")
        @ExcludeMissing
        fun _linkTypeName(): JsonField<String> = linkTypeName

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
             * .inwardId()
             * .linkTypeId()
             * .outwardId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inwardId: JsonField<String>? = null
            private var linkTypeId: JsonField<String>? = null
            private var outwardId: JsonField<String>? = null
            private var linkTypeName: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                inwardId = body.inwardId
                linkTypeId = body.linkTypeId
                outwardId = body.outwardId
                linkTypeName = body.linkTypeName
                notes = body.notes
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The inward transaction transaction_journal_id for the link. This becomes the 'is paid
             * by' transaction of the set.
             */
            fun inwardId(inwardId: String) = inwardId(JsonField.of(inwardId))

            /**
             * Sets [Builder.inwardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inwardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inwardId(inwardId: JsonField<String>) = apply { this.inwardId = inwardId }

            /** The link type ID to use. You can also use the link_type_name field. */
            fun linkTypeId(linkTypeId: String) = linkTypeId(JsonField.of(linkTypeId))

            /**
             * Sets [Builder.linkTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkTypeId(linkTypeId: JsonField<String>) = apply { this.linkTypeId = linkTypeId }

            /**
             * The outward transaction transaction_journal_id for the link. This becomes the 'pays
             * for' transaction of the set.
             */
            fun outwardId(outwardId: String) = outwardId(JsonField.of(outwardId))

            /**
             * Sets [Builder.outwardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outwardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outwardId(outwardId: JsonField<String>) = apply { this.outwardId = outwardId }

            /** The link type name to use. You can also use the link_type_id field. */
            fun linkTypeName(linkTypeName: String) = linkTypeName(JsonField.of(linkTypeName))

            /**
             * Sets [Builder.linkTypeName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkTypeName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkTypeName(linkTypeName: JsonField<String>) = apply {
                this.linkTypeName = linkTypeName
            }

            /** Optional. Some notes. */
            fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

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
             * .inwardId()
             * .linkTypeId()
             * .outwardId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("inwardId", inwardId),
                    checkRequired("linkTypeId", linkTypeId),
                    checkRequired("outwardId", outwardId),
                    linkTypeName,
                    notes,
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

            inwardId()
            linkTypeId()
            outwardId()
            linkTypeName()
            notes()
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
            (if (inwardId.asKnown() == null) 0 else 1) +
                (if (linkTypeId.asKnown() == null) 0 else 1) +
                (if (outwardId.asKnown() == null) 0 else 1) +
                (if (linkTypeName.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                inwardId == other.inwardId &&
                linkTypeId == other.linkTypeId &&
                outwardId == other.outwardId &&
                linkTypeName == other.linkTypeName &&
                notes == other.notes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(inwardId, linkTypeId, outwardId, linkTypeName, notes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inwardId=$inwardId, linkTypeId=$linkTypeId, outwardId=$outwardId, linkTypeName=$linkTypeName, notes=$notes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionLinkCreateParams &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionLinkCreateParams{xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
