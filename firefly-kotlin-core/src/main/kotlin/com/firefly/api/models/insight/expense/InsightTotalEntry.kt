// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.insight.expense

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

class InsightTotalEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currencyCode: JsonField<String>,
    private val currencyId: JsonField<String>,
    private val difference: JsonField<String>,
    private val differenceFloat: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency_code")
        @ExcludeMissing
        currencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_id")
        @ExcludeMissing
        currencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("difference")
        @ExcludeMissing
        difference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("difference_float")
        @ExcludeMissing
        differenceFloat: JsonField<Double> = JsonMissing.of(),
    ) : this(currencyCode, currencyId, difference, differenceFloat, mutableMapOf())

    /**
     * The currency code of the expenses listed for this expense account.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyCode(): String? = currencyCode.getNullable("currency_code")

    /**
     * The currency ID of the expenses listed for this expense account.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): String? = currencyId.getNullable("currency_id")

    /**
     * The amount spent between start date and end date, defined as a string, for this expense
     * account and all asset accounts.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun difference(): String? = difference.getNullable("difference")

    /**
     * The amount spent between start date and end date, defined as a string, for this expense
     * account and all asset accounts. This number is a float (double) and may have rounding errors.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun differenceFloat(): Double? = differenceFloat.getNullable("difference_float")

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_code")
    @ExcludeMissing
    fun _currencyCode(): JsonField<String> = currencyCode

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_id") @ExcludeMissing fun _currencyId(): JsonField<String> = currencyId

    /**
     * Returns the raw JSON value of [difference].
     *
     * Unlike [difference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("difference") @ExcludeMissing fun _difference(): JsonField<String> = difference

    /**
     * Returns the raw JSON value of [differenceFloat].
     *
     * Unlike [differenceFloat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("difference_float")
    @ExcludeMissing
    fun _differenceFloat(): JsonField<Double> = differenceFloat

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

        /** Returns a mutable builder for constructing an instance of [InsightTotalEntry]. */
        fun builder() = Builder()
    }

    /** A builder for [InsightTotalEntry]. */
    class Builder internal constructor() {

        private var currencyCode: JsonField<String> = JsonMissing.of()
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var difference: JsonField<String> = JsonMissing.of()
        private var differenceFloat: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(insightTotalEntry: InsightTotalEntry) = apply {
            currencyCode = insightTotalEntry.currencyCode
            currencyId = insightTotalEntry.currencyId
            difference = insightTotalEntry.difference
            differenceFloat = insightTotalEntry.differenceFloat
            additionalProperties = insightTotalEntry.additionalProperties.toMutableMap()
        }

        /** The currency code of the expenses listed for this expense account. */
        fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyCode(currencyCode: JsonField<String>) = apply {
            this.currencyCode = currencyCode
        }

        /** The currency ID of the expenses listed for this expense account. */
        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        /**
         * The amount spent between start date and end date, defined as a string, for this expense
         * account and all asset accounts.
         */
        fun difference(difference: String) = difference(JsonField.of(difference))

        /**
         * Sets [Builder.difference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.difference] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun difference(difference: JsonField<String>) = apply { this.difference = difference }

        /**
         * The amount spent between start date and end date, defined as a string, for this expense
         * account and all asset accounts. This number is a float (double) and may have rounding
         * errors.
         */
        fun differenceFloat(differenceFloat: Double) =
            differenceFloat(JsonField.of(differenceFloat))

        /**
         * Sets [Builder.differenceFloat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.differenceFloat] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun differenceFloat(differenceFloat: JsonField<Double>) = apply {
            this.differenceFloat = differenceFloat
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
         * Returns an immutable instance of [InsightTotalEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InsightTotalEntry =
            InsightTotalEntry(
                currencyCode,
                currencyId,
                difference,
                differenceFloat,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): InsightTotalEntry = apply {
        if (validated) {
            return@apply
        }

        currencyCode()
        currencyId()
        difference()
        differenceFloat()
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
        (if (currencyCode.asKnown() == null) 0 else 1) +
            (if (currencyId.asKnown() == null) 0 else 1) +
            (if (difference.asKnown() == null) 0 else 1) +
            (if (differenceFloat.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightTotalEntry &&
            currencyCode == other.currencyCode &&
            currencyId == other.currencyId &&
            difference == other.difference &&
            differenceFloat == other.differenceFloat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currencyCode, currencyId, difference, differenceFloat, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightTotalEntry{currencyCode=$currencyCode, currencyId=$currencyId, difference=$difference, differenceFloat=$differenceFloat, additionalProperties=$additionalProperties}"
}
