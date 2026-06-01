// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

class PageLink
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val first: JsonField<String>,
    private val last: JsonField<String>,
    private val next: JsonField<String>,
    private val prev: JsonField<String>,
    private val self: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("first") @ExcludeMissing first: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last") @ExcludeMissing last: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev") @ExcludeMissing prev: JsonField<String> = JsonMissing.of(),
        @JsonProperty("self") @ExcludeMissing self: JsonField<String> = JsonMissing.of(),
    ) : this(first, last, next, prev, self, mutableMapOf())

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun first(): String? = first.getNullable("first")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun last(): String? = last.getNullable("last")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): String? = next.getNullable("next")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prev(): String? = prev.getNullable("prev")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun self(): String? = self.getNullable("self")

    /**
     * Returns the raw JSON value of [first].
     *
     * Unlike [first], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first") @ExcludeMissing fun _first(): JsonField<String> = first

    /**
     * Returns the raw JSON value of [last].
     *
     * Unlike [last], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last") @ExcludeMissing fun _last(): JsonField<String> = last

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [prev].
     *
     * Unlike [prev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev") @ExcludeMissing fun _prev(): JsonField<String> = prev

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

        /** Returns a mutable builder for constructing an instance of [PageLink]. */
        fun builder() = Builder()
    }

    /** A builder for [PageLink]. */
    class Builder internal constructor() {

        private var first: JsonField<String> = JsonMissing.of()
        private var last: JsonField<String> = JsonMissing.of()
        private var next: JsonField<String> = JsonMissing.of()
        private var prev: JsonField<String> = JsonMissing.of()
        private var self: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pageLink: PageLink) = apply {
            first = pageLink.first
            last = pageLink.last
            next = pageLink.next
            prev = pageLink.prev
            self = pageLink.self
            additionalProperties = pageLink.additionalProperties.toMutableMap()
        }

        fun first(first: String) = first(JsonField.of(first))

        /**
         * Sets [Builder.first] to an arbitrary JSON value.
         *
         * You should usually call [Builder.first] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun first(first: JsonField<String>) = apply { this.first = first }

        fun last(last: String) = last(JsonField.of(last))

        /**
         * Sets [Builder.last] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last(last: JsonField<String>) = apply { this.last = last }

        fun next(next: String?) = next(JsonField.ofNullable(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        fun prev(prev: String?) = prev(JsonField.ofNullable(prev))

        /**
         * Sets [Builder.prev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prev] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prev(prev: JsonField<String>) = apply { this.prev = prev }

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
         * Returns an immutable instance of [PageLink].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PageLink =
            PageLink(first, last, next, prev, self, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws FireflyInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PageLink = apply {
        if (validated) {
            return@apply
        }

        first()
        last()
        next()
        prev()
        self()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (first.asKnown() == null) 0 else 1) +
            (if (last.asKnown() == null) 0 else 1) +
            (if (next.asKnown() == null) 0 else 1) +
            (if (prev.asKnown() == null) 0 else 1) +
            (if (self.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PageLink &&
            first == other.first &&
            last == other.last &&
            next == other.next &&
            prev == other.prev &&
            self == other.self &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(first, last, next, prev, self, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PageLink{first=$first, last=$last, next=$next, prev=$prev, self=$self, additionalProperties=$additionalProperties}"
}
