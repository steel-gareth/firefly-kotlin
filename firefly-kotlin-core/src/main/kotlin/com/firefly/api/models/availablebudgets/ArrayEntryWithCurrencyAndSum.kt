// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.availablebudgets

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

class ArrayEntryWithCurrencyAndSum
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currencyCode: JsonField<String>,
    private val currencyDecimalPlaces: JsonField<Int>,
    private val currencyId: JsonField<String>,
    private val currencySymbol: JsonField<String>,
    private val sum: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency_code")
        @ExcludeMissing
        currencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_decimal_places")
        @ExcludeMissing
        currencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("currency_id")
        @ExcludeMissing
        currencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_symbol")
        @ExcludeMissing
        currencySymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sum") @ExcludeMissing sum: JsonField<String> = JsonMissing.of(),
    ) : this(currencyCode, currencyDecimalPlaces, currencyId, currencySymbol, sum, mutableMapOf())

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyCode(): String? = currencyCode.getNullable("currency_code")

    /**
     * Number of decimals supported by the currency
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyDecimalPlaces(): Int? = currencyDecimalPlaces.getNullable("currency_decimal_places")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): String? = currencyId.getNullable("currency_id")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

    /**
     * The amount earned, spent or transferred.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sum(): String? = sum.getNullable("sum")

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_code")
    @ExcludeMissing
    fun _currencyCode(): JsonField<String> = currencyCode

    /**
     * Returns the raw JSON value of [currencyDecimalPlaces].
     *
     * Unlike [currencyDecimalPlaces], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currency_decimal_places")
    @ExcludeMissing
    fun _currencyDecimalPlaces(): JsonField<Int> = currencyDecimalPlaces

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_id") @ExcludeMissing fun _currencyId(): JsonField<String> = currencyId

    /**
     * Returns the raw JSON value of [currencySymbol].
     *
     * Unlike [currencySymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_symbol")
    @ExcludeMissing
    fun _currencySymbol(): JsonField<String> = currencySymbol

    /**
     * Returns the raw JSON value of [sum].
     *
     * Unlike [sum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sum") @ExcludeMissing fun _sum(): JsonField<String> = sum

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
         * Returns a mutable builder for constructing an instance of [ArrayEntryWithCurrencyAndSum].
         */
        fun builder() = Builder()
    }

    /** A builder for [ArrayEntryWithCurrencyAndSum]. */
    class Builder internal constructor() {

        private var currencyCode: JsonField<String> = JsonMissing.of()
        private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var currencySymbol: JsonField<String> = JsonMissing.of()
        private var sum: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(arrayEntryWithCurrencyAndSum: ArrayEntryWithCurrencyAndSum) = apply {
            currencyCode = arrayEntryWithCurrencyAndSum.currencyCode
            currencyDecimalPlaces = arrayEntryWithCurrencyAndSum.currencyDecimalPlaces
            currencyId = arrayEntryWithCurrencyAndSum.currencyId
            currencySymbol = arrayEntryWithCurrencyAndSum.currencySymbol
            sum = arrayEntryWithCurrencyAndSum.sum
            additionalProperties = arrayEntryWithCurrencyAndSum.additionalProperties.toMutableMap()
        }

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

        /** Number of decimals supported by the currency */
        fun currencyDecimalPlaces(currencyDecimalPlaces: Int) =
            currencyDecimalPlaces(JsonField.of(currencyDecimalPlaces))

        /**
         * Sets [Builder.currencyDecimalPlaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyDecimalPlaces] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencyDecimalPlaces(currencyDecimalPlaces: JsonField<Int>) = apply {
            this.currencyDecimalPlaces = currencyDecimalPlaces
        }

        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        fun currencySymbol(currencySymbol: String) = currencySymbol(JsonField.of(currencySymbol))

        /**
         * Sets [Builder.currencySymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencySymbol] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencySymbol(currencySymbol: JsonField<String>) = apply {
            this.currencySymbol = currencySymbol
        }

        /** The amount earned, spent or transferred. */
        fun sum(sum: String) = sum(JsonField.of(sum))

        /**
         * Sets [Builder.sum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sum(sum: JsonField<String>) = apply { this.sum = sum }

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
         * Returns an immutable instance of [ArrayEntryWithCurrencyAndSum].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ArrayEntryWithCurrencyAndSum =
            ArrayEntryWithCurrencyAndSum(
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencySymbol,
                sum,
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
    fun validate(): ArrayEntryWithCurrencyAndSum = apply {
        if (validated) {
            return@apply
        }

        currencyCode()
        currencyDecimalPlaces()
        currencyId()
        currencySymbol()
        sum()
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
            (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
            (if (currencyId.asKnown() == null) 0 else 1) +
            (if (currencySymbol.asKnown() == null) 0 else 1) +
            (if (sum.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArrayEntryWithCurrencyAndSum &&
            currencyCode == other.currencyCode &&
            currencyDecimalPlaces == other.currencyDecimalPlaces &&
            currencyId == other.currencyId &&
            currencySymbol == other.currencySymbol &&
            sum == other.sum &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencySymbol,
            sum,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArrayEntryWithCurrencyAndSum{currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencySymbol=$currencySymbol, sum=$sum, additionalProperties=$additionalProperties}"
}
