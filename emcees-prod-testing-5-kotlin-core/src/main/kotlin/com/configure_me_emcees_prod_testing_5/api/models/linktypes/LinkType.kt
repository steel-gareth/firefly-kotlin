// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.linktypes

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class LinkType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inward: JsonField<String>,
    private val name: JsonField<String>,
    private val outward: JsonField<String>,
    private val editable: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inward") @ExcludeMissing inward: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outward") @ExcludeMissing outward: JsonField<String> = JsonMissing.of(),
        @JsonProperty("editable") @ExcludeMissing editable: JsonField<Boolean> = JsonMissing.of(),
    ) : this(inward, name, outward, editable, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inward(): String = inward.getRequired("inward")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outward(): String = outward.getRequired("outward")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun editable(): Boolean? = editable.getNullable("editable")

    /**
     * Returns the raw JSON value of [inward].
     *
     * Unlike [inward], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inward") @ExcludeMissing fun _inward(): JsonField<String> = inward

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [outward].
     *
     * Unlike [outward], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outward") @ExcludeMissing fun _outward(): JsonField<String> = outward

    /**
     * Returns the raw JSON value of [editable].
     *
     * Unlike [editable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("editable") @ExcludeMissing fun _editable(): JsonField<Boolean> = editable

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
         * Returns a mutable builder for constructing an instance of [LinkType].
         *
         * The following fields are required:
         * ```kotlin
         * .inward()
         * .name()
         * .outward()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LinkType]. */
    class Builder internal constructor() {

        private var inward: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var outward: JsonField<String>? = null
        private var editable: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(linkType: LinkType) = apply {
            inward = linkType.inward
            name = linkType.name
            outward = linkType.outward
            editable = linkType.editable
            additionalProperties = linkType.additionalProperties.toMutableMap()
        }

        fun inward(inward: String) = inward(JsonField.of(inward))

        /**
         * Sets [Builder.inward] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inward] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inward(inward: JsonField<String>) = apply { this.inward = inward }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun outward(outward: String) = outward(JsonField.of(outward))

        /**
         * Sets [Builder.outward] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outward] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outward(outward: JsonField<String>) = apply { this.outward = outward }

        fun editable(editable: Boolean) = editable(JsonField.of(editable))

        /**
         * Sets [Builder.editable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.editable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

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
         * Returns an immutable instance of [LinkType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .inward()
         * .name()
         * .outward()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LinkType =
            LinkType(
                checkRequired("inward", inward),
                checkRequired("name", name),
                checkRequired("outward", outward),
                editable,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): LinkType = apply {
        if (validated) {
            return@apply
        }

        inward()
        name()
        outward()
        editable()
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
        (if (inward.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (outward.asKnown() == null) 0 else 1) +
            (if (editable.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LinkType &&
            inward == other.inward &&
            name == other.name &&
            outward == other.outward &&
            editable == other.editable &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inward, name, outward, editable, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LinkType{inward=$inward, name=$name, outward=$outward, editable=$editable, additionalProperties=$additionalProperties}"
}
