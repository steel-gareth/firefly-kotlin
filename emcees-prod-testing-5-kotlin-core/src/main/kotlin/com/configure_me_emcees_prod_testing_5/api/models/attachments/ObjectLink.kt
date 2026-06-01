// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.attachments

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ObjectLink
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val _0: JsonField<_0>,
    private val self: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("0") @ExcludeMissing _0: JsonField<_0> = JsonMissing.of(),
        @JsonProperty("self") @ExcludeMissing self: JsonField<String> = JsonMissing.of(),
    ) : this(_0, self, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun _0(): _0? = _0.getNullable("0")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun self(): String? = self.getNullable("self")

    /**
     * Returns the raw JSON value of [_0].
     *
     * Unlike [_0], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("0") @ExcludeMissing fun __0(): JsonField<_0> = _0

    /**
     * Returns the raw JSON value of [self].
     *
     * Unlike [self], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("self") @ExcludeMissing fun _self(): JsonField<String> = self

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

        /** Returns a mutable builder for constructing an instance of [ObjectLink]. */
        fun builder() = Builder()
    }

    /** A builder for [ObjectLink]. */
    class Builder internal constructor() {

        private var _0: JsonField<_0> = JsonMissing.of()
        private var self: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(objectLink: ObjectLink) = apply {
            _0 = objectLink._0
            self = objectLink.self
            additionalProperties = objectLink.additionalProperties.toMutableMap()
        }

        fun _0(_0: _0) = _0(JsonField.of(_0))

        /**
         * Sets [Builder._0] to an arbitrary JSON value.
         *
         * You should usually call [Builder._0] with a well-typed [_0] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun _0(_0: JsonField<_0>) = apply { this._0 = _0 }

        fun self(self: String) = self(JsonField.of(self))

        /**
         * Sets [Builder.self] to an arbitrary JSON value.
         *
         * You should usually call [Builder.self] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun self(self: JsonField<String>) = apply { this.self = self }

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
         * Returns an immutable instance of [ObjectLink].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectLink = ObjectLink(_0, self, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't match
     *   its expected type.
     */
    fun validate(): ObjectLink = apply {
        if (validated) {
            return@apply
        }

        _0()?.validate()
        self()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (_0.asKnown()?.validity() ?: 0) + (if (self.asKnown() == null) 0 else 1)

    class _0
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val rel: JsonField<String>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("rel") @ExcludeMissing rel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(rel, uri, mutableMapOf())

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rel(): String? = rel.getNullable("rel")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun uri(): String? = uri.getNullable("uri")

        /**
         * Returns the raw JSON value of [rel].
         *
         * Unlike [rel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rel") @ExcludeMissing fun _rel(): JsonField<String> = rel

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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

            /** Returns a mutable builder for constructing an instance of [_0]. */
            fun builder() = Builder()
        }

        /** A builder for [_0]. */
        class Builder internal constructor() {

            private var rel: JsonField<String> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(_0: _0) = apply {
                rel = _0.rel
                uri = _0.uri
                additionalProperties = _0.additionalProperties.toMutableMap()
            }

            fun rel(rel: String) = rel(JsonField.of(rel))

            /**
             * Sets [Builder.rel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rel] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rel(rel: JsonField<String>) = apply { this.rel = rel }

            fun uri(uri: String) = uri(JsonField.of(uri))

            /**
             * Sets [Builder.uri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uri] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
             * Returns an immutable instance of [_0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): _0 = _0(rel, uri, additionalProperties.toMutableMap())
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
        fun validate(): _0 = apply {
            if (validated) {
                return@apply
            }

            rel()
            uri()
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
            (if (rel.asKnown() == null) 0 else 1) + (if (uri.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is _0 &&
                rel == other.rel &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(rel, uri, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "_0{rel=$rel, uri=$uri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectLink &&
            _0 == other._0 &&
            self == other.self &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(_0, self, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectLink{_0=$_0, self=$self, additionalProperties=$additionalProperties}"
}
