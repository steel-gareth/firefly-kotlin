// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.insight.transfer

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

class TransferListByAssetAccountResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val currencyCode: JsonField<String>,
    private val currencyId: JsonField<String>,
    private val difference: JsonField<String>,
    private val differenceFloat: JsonField<Double>,
    private val in_: JsonField<String>,
    private val inFloat: JsonField<Double>,
    private val name: JsonField<String>,
    private val out: JsonField<String>,
    private val outFloat: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("in") @ExcludeMissing in_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("in_float") @ExcludeMissing inFloat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("out") @ExcludeMissing out: JsonField<String> = JsonMissing.of(),
        @JsonProperty("out_float") @ExcludeMissing outFloat: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        currencyCode,
        currencyId,
        difference,
        differenceFloat,
        in_,
        inFloat,
        name,
        out,
        outFloat,
        mutableMapOf(),
    )

    /**
     * This ID is a reference to the original object.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * The currency code of the expenses listed for this account.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currencyCode(): String? = currencyCode.getNullable("currency_code")

    /**
     * The currency ID of the expenses listed for this account.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currencyId(): String? = currencyId.getNullable("currency_id")

    /**
     * The total amount transferred between start date and end date, a number defined as a string,
     * for this asset account.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun difference(): String? = difference.getNullable("difference")

    /**
     * The total amount transferred between start date and end date, a number as a float, for this
     * asset account. May have rounding errors.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun differenceFloat(): Double? = differenceFloat.getNullable("difference_float")

    /**
     * The total amount transferred TO this account between start date and end date, a number
     * defined as a string, for this asset account.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun in_(): String? = in_.getNullable("in")

    /**
     * The total amount transferred FROM this account between start date and end date, a number as a
     * float, for this asset account. May have rounding errors.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inFloat(): Double? = inFloat.getNullable("in_float")

    /**
     * This is the name of the object.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * The total amount transferred FROM this account between start date and end date, a number
     * defined as a string, for this asset account.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun out(): String? = out.getNullable("out")

    /**
     * The total amount transferred TO this account between start date and end date, a number as a
     * float, for this asset account. May have rounding errors.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun outFloat(): Double? = outFloat.getNullable("out_float")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

    /**
     * Returns the raw JSON value of [in_].
     *
     * Unlike [in_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in") @ExcludeMissing fun _in_(): JsonField<String> = in_

    /**
     * Returns the raw JSON value of [inFloat].
     *
     * Unlike [inFloat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in_float") @ExcludeMissing fun _inFloat(): JsonField<Double> = inFloat

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [out].
     *
     * Unlike [out], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("out") @ExcludeMissing fun _out(): JsonField<String> = out

    /**
     * Returns the raw JSON value of [outFloat].
     *
     * Unlike [outFloat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("out_float") @ExcludeMissing fun _outFloat(): JsonField<Double> = outFloat

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
         * Returns a mutable builder for constructing an instance of
         * [TransferListByAssetAccountResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [TransferListByAssetAccountResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var currencyCode: JsonField<String> = JsonMissing.of()
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var difference: JsonField<String> = JsonMissing.of()
        private var differenceFloat: JsonField<Double> = JsonMissing.of()
        private var in_: JsonField<String> = JsonMissing.of()
        private var inFloat: JsonField<Double> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var out: JsonField<String> = JsonMissing.of()
        private var outFloat: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transferListByAssetAccountResponse: TransferListByAssetAccountResponse) =
            apply {
                id = transferListByAssetAccountResponse.id
                currencyCode = transferListByAssetAccountResponse.currencyCode
                currencyId = transferListByAssetAccountResponse.currencyId
                difference = transferListByAssetAccountResponse.difference
                differenceFloat = transferListByAssetAccountResponse.differenceFloat
                in_ = transferListByAssetAccountResponse.in_
                inFloat = transferListByAssetAccountResponse.inFloat
                name = transferListByAssetAccountResponse.name
                out = transferListByAssetAccountResponse.out
                outFloat = transferListByAssetAccountResponse.outFloat
                additionalProperties =
                    transferListByAssetAccountResponse.additionalProperties.toMutableMap()
            }

        /** This ID is a reference to the original object. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The currency code of the expenses listed for this account. */
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

        /** The currency ID of the expenses listed for this account. */
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
         * The total amount transferred between start date and end date, a number defined as a
         * string, for this asset account.
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
         * The total amount transferred between start date and end date, a number as a float, for
         * this asset account. May have rounding errors.
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

        /**
         * The total amount transferred TO this account between start date and end date, a number
         * defined as a string, for this asset account.
         */
        fun in_(in_: String) = in_(JsonField.of(in_))

        /**
         * Sets [Builder.in_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.in_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun in_(in_: JsonField<String>) = apply { this.in_ = in_ }

        /**
         * The total amount transferred FROM this account between start date and end date, a number
         * as a float, for this asset account. May have rounding errors.
         */
        fun inFloat(inFloat: Double) = inFloat(JsonField.of(inFloat))

        /**
         * Sets [Builder.inFloat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inFloat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inFloat(inFloat: JsonField<Double>) = apply { this.inFloat = inFloat }

        /** This is the name of the object. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The total amount transferred FROM this account between start date and end date, a number
         * defined as a string, for this asset account.
         */
        fun out(out: String) = out(JsonField.of(out))

        /**
         * Sets [Builder.out] to an arbitrary JSON value.
         *
         * You should usually call [Builder.out] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun out(out: JsonField<String>) = apply { this.out = out }

        /**
         * The total amount transferred TO this account between start date and end date, a number as
         * a float, for this asset account. May have rounding errors.
         */
        fun outFloat(outFloat: Double) = outFloat(JsonField.of(outFloat))

        /**
         * Sets [Builder.outFloat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outFloat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outFloat(outFloat: JsonField<Double>) = apply { this.outFloat = outFloat }

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
         * Returns an immutable instance of [TransferListByAssetAccountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransferListByAssetAccountResponse =
            TransferListByAssetAccountResponse(
                id,
                currencyCode,
                currencyId,
                difference,
                differenceFloat,
                in_,
                inFloat,
                name,
                out,
                outFloat,
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
    fun validate(): TransferListByAssetAccountResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        currencyCode()
        currencyId()
        difference()
        differenceFloat()
        in_()
        inFloat()
        name()
        out()
        outFloat()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (currencyCode.asKnown() == null) 0 else 1) +
            (if (currencyId.asKnown() == null) 0 else 1) +
            (if (difference.asKnown() == null) 0 else 1) +
            (if (differenceFloat.asKnown() == null) 0 else 1) +
            (if (in_.asKnown() == null) 0 else 1) +
            (if (inFloat.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (out.asKnown() == null) 0 else 1) +
            (if (outFloat.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferListByAssetAccountResponse &&
            id == other.id &&
            currencyCode == other.currencyCode &&
            currencyId == other.currencyId &&
            difference == other.difference &&
            differenceFloat == other.differenceFloat &&
            in_ == other.in_ &&
            inFloat == other.inFloat &&
            name == other.name &&
            out == other.out &&
            outFloat == other.outFloat &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            currencyCode,
            currencyId,
            difference,
            differenceFloat,
            in_,
            inFloat,
            name,
            out,
            outFloat,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferListByAssetAccountResponse{id=$id, currencyCode=$currencyCode, currencyId=$currencyId, difference=$difference, differenceFloat=$differenceFloat, in_=$in_, inFloat=$inFloat, name=$name, out=$out, outFloat=$outFloat, additionalProperties=$additionalProperties}"
}
