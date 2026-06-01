// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.availablebudgets

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AvailableBudgetRead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, type, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * Immutable value
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [AvailableBudgetRead].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AvailableBudgetRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(availableBudgetRead: AvailableBudgetRead) = apply {
            id = availableBudgetRead.id
            attributes = availableBudgetRead.attributes
            type = availableBudgetRead.type
            additionalProperties = availableBudgetRead.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        /** Immutable value */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [AvailableBudgetRead].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AvailableBudgetRead =
            AvailableBudgetRead(
                checkRequired("id", id),
                checkRequired("attributes", attributes),
                checkRequired("type", type),
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
    fun validate(): AvailableBudgetRead = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().validate()
        type()
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
            (attributes.asKnown()?.validity() ?: 0) +
            (if (type.asKnown() == null) 0 else 1)

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencyCode: JsonField<String>,
        private val currencyDecimalPlaces: JsonField<Int>,
        private val currencyId: JsonField<String>,
        private val currencyName: JsonField<String>,
        private val currencySymbol: JsonField<String>,
        private val end: JsonField<OffsetDateTime>,
        private val objectHasCurrencySetting: JsonField<Boolean>,
        private val pcAmount: JsonField<String>,
        private val pcSpentInBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val pcSpentOutsideBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencyName: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val spentInBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val spentOutsideBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val start: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency_code")
            @ExcludeMissing
            currencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_decimal_places")
            @ExcludeMissing
            currencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("currency_id")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_name")
            @ExcludeMissing
            currencyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_symbol")
            @ExcludeMissing
            currencySymbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("object_has_currency_setting")
            @ExcludeMissing
            objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pc_amount")
            @ExcludeMissing
            pcAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_spent_in_budgets")
            @ExcludeMissing
            pcSpentInBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("pc_spent_outside_budgets")
            @ExcludeMissing
            pcSpentOutsideBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("primary_currency_code")
            @ExcludeMissing
            primaryCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_decimal_places")
            @ExcludeMissing
            primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("primary_currency_id")
            @ExcludeMissing
            primaryCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_name")
            @ExcludeMissing
            primaryCurrencyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_symbol")
            @ExcludeMissing
            primaryCurrencySymbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("spent_in_budgets")
            @ExcludeMissing
            spentInBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("spent_outside_budgets")
            @ExcludeMissing
            spentOutsideBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("start")
            @ExcludeMissing
            start: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            amount,
            createdAt,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            end,
            objectHasCurrencySetting,
            pcAmount,
            pcSpentInBudgets,
            pcSpentOutsideBudgets,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            spentInBudgets,
            spentOutsideBudgets,
            start,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * The amount of this available budget in the currency of this available budget.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String? = amount.getNullable("amount")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * The currency code of the currency associated with this object.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyDecimalPlaces(): Int? =
            currencyDecimalPlaces.getNullable("currency_decimal_places")

        /**
         * The currency ID of the currency associated with this object.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * The currency name of the currency associated with this object.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyName(): String? = currencyName.getNullable("currency_name")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

        /**
         * End date of the available budget.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun end(): OffsetDateTime? = end.getNullable("end")

        /**
         * Indicates whether the object has a currency setting. If false, the object uses the
         * administration's primary currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectHasCurrencySetting(): Boolean? =
            objectHasCurrencySetting.getNullable("object_has_currency_setting")

        /**
         * The amount of this available budget in the primary currency (pc) of this administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcAmount(): String? = pcAmount.getNullable("pc_amount")

        /**
         * The amount spent in budgets in the primary currency (pc) of this administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcSpentInBudgets(): List<ArrayEntryWithCurrencyAndSum>? =
            pcSpentInBudgets.getNullable("pc_spent_in_budgets")

        /**
         * The amount spent outside of budgets in the primary currency (pc) of this administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcSpentOutsideBudgets(): List<ArrayEntryWithCurrencyAndSum>? =
            pcSpentOutsideBudgets.getNullable("pc_spent_outside_budgets")

        /**
         * The currency code of the administration's primary currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencyCode(): String? =
            primaryCurrencyCode.getNullable("primary_currency_code")

        /**
         * The currency decimal places of the administration's primary currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencyDecimalPlaces(): Int? =
            primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

        /**
         * The currency ID of the administration's primary currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

        /**
         * The currency name of the administration's primary currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencyName(): String? =
            primaryCurrencyName.getNullable("primary_currency_name")

        /**
         * The currency symbol of the administration's primary currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryCurrencySymbol(): String? =
            primaryCurrencySymbol.getNullable("primary_currency_symbol")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spentInBudgets(): List<ArrayEntryWithCurrencyAndSum>? =
            spentInBudgets.getNullable("spent_in_budgets")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spentOutsideBudgets(): List<ArrayEntryWithCurrencyAndSum>? =
            spentOutsideBudgets.getNullable("spent_outside_budgets")

        /**
         * Start date of the available budget.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun start(): OffsetDateTime? = start.getNullable("start")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currencyCode].
         *
         * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_code")
        @ExcludeMissing
        fun _currencyCode(): JsonField<String> = currencyCode

        /**
         * Returns the raw JSON value of [currencyDecimalPlaces].
         *
         * Unlike [currencyDecimalPlaces], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("currency_decimal_places")
        @ExcludeMissing
        fun _currencyDecimalPlaces(): JsonField<Int> = currencyDecimalPlaces

        /**
         * Returns the raw JSON value of [currencyId].
         *
         * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency_id")
        @ExcludeMissing
        fun _currencyId(): JsonField<String> = currencyId

        /**
         * Returns the raw JSON value of [currencyName].
         *
         * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_name")
        @ExcludeMissing
        fun _currencyName(): JsonField<String> = currencyName

        /**
         * Returns the raw JSON value of [currencySymbol].
         *
         * Unlike [currencySymbol], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_symbol")
        @ExcludeMissing
        fun _currencySymbol(): JsonField<String> = currencySymbol

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

        /**
         * Returns the raw JSON value of [objectHasCurrencySetting].
         *
         * Unlike [objectHasCurrencySetting], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("object_has_currency_setting")
        @ExcludeMissing
        fun _objectHasCurrencySetting(): JsonField<Boolean> = objectHasCurrencySetting

        /**
         * Returns the raw JSON value of [pcAmount].
         *
         * Unlike [pcAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_amount") @ExcludeMissing fun _pcAmount(): JsonField<String> = pcAmount

        /**
         * Returns the raw JSON value of [pcSpentInBudgets].
         *
         * Unlike [pcSpentInBudgets], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_spent_in_budgets")
        @ExcludeMissing
        fun _pcSpentInBudgets(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = pcSpentInBudgets

        /**
         * Returns the raw JSON value of [pcSpentOutsideBudgets].
         *
         * Unlike [pcSpentOutsideBudgets], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pc_spent_outside_budgets")
        @ExcludeMissing
        fun _pcSpentOutsideBudgets(): JsonField<List<ArrayEntryWithCurrencyAndSum>> =
            pcSpentOutsideBudgets

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
         * Returns the raw JSON value of [primaryCurrencyDecimalPlaces].
         *
         * Unlike [primaryCurrencyDecimalPlaces], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_currency_decimal_places")
        @ExcludeMissing
        fun _primaryCurrencyDecimalPlaces(): JsonField<Int> = primaryCurrencyDecimalPlaces

        /**
         * Returns the raw JSON value of [primaryCurrencyId].
         *
         * Unlike [primaryCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("primary_currency_id")
        @ExcludeMissing
        fun _primaryCurrencyId(): JsonField<String> = primaryCurrencyId

        /**
         * Returns the raw JSON value of [primaryCurrencyName].
         *
         * Unlike [primaryCurrencyName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_currency_name")
        @ExcludeMissing
        fun _primaryCurrencyName(): JsonField<String> = primaryCurrencyName

        /**
         * Returns the raw JSON value of [primaryCurrencySymbol].
         *
         * Unlike [primaryCurrencySymbol], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_currency_symbol")
        @ExcludeMissing
        fun _primaryCurrencySymbol(): JsonField<String> = primaryCurrencySymbol

        /**
         * Returns the raw JSON value of [spentInBudgets].
         *
         * Unlike [spentInBudgets], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spent_in_budgets")
        @ExcludeMissing
        fun _spentInBudgets(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = spentInBudgets

        /**
         * Returns the raw JSON value of [spentOutsideBudgets].
         *
         * Unlike [spentOutsideBudgets], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("spent_outside_budgets")
        @ExcludeMissing
        fun _spentOutsideBudgets(): JsonField<List<ArrayEntryWithCurrencyAndSum>> =
            spentOutsideBudgets

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var currencyName: JsonField<String> = JsonMissing.of()
            private var currencySymbol: JsonField<String> = JsonMissing.of()
            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
            private var pcAmount: JsonField<String> = JsonMissing.of()
            private var pcSpentInBudgets: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? =
                null
            private var pcSpentOutsideBudgets:
                JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? =
                null
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var spentInBudgets: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var spentOutsideBudgets: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? =
                null
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                amount = attributes.amount
                createdAt = attributes.createdAt
                currencyCode = attributes.currencyCode
                currencyDecimalPlaces = attributes.currencyDecimalPlaces
                currencyId = attributes.currencyId
                currencyName = attributes.currencyName
                currencySymbol = attributes.currencySymbol
                end = attributes.end
                objectHasCurrencySetting = attributes.objectHasCurrencySetting
                pcAmount = attributes.pcAmount
                pcSpentInBudgets = attributes.pcSpentInBudgets.map { it.toMutableList() }
                pcSpentOutsideBudgets = attributes.pcSpentOutsideBudgets.map { it.toMutableList() }
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencyName = attributes.primaryCurrencyName
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                spentInBudgets = attributes.spentInBudgets.map { it.toMutableList() }
                spentOutsideBudgets = attributes.spentOutsideBudgets.map { it.toMutableList() }
                start = attributes.start
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            /** The amount of this available budget in the currency of this available budget. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The currency code of the currency associated with this object. */
            fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

            /**
             * Sets [Builder.currencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyCode(currencyCode: JsonField<String>) = apply {
                this.currencyCode = currencyCode
            }

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

            /** The currency ID of the currency associated with this object. */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** The currency name of the currency associated with this object. */
            fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

            /**
             * Sets [Builder.currencyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyName(currencyName: JsonField<String>) = apply {
                this.currencyName = currencyName
            }

            fun currencySymbol(currencySymbol: String) =
                currencySymbol(JsonField.of(currencySymbol))

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

            /** End date of the available budget. */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

            /**
             * Indicates whether the object has a currency setting. If false, the object uses the
             * administration's primary currency.
             */
            fun objectHasCurrencySetting(objectHasCurrencySetting: Boolean) =
                objectHasCurrencySetting(JsonField.of(objectHasCurrencySetting))

            /**
             * Sets [Builder.objectHasCurrencySetting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectHasCurrencySetting] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun objectHasCurrencySetting(objectHasCurrencySetting: JsonField<Boolean>) = apply {
                this.objectHasCurrencySetting = objectHasCurrencySetting
            }

            /**
             * The amount of this available budget in the primary currency (pc) of this
             * administration.
             */
            fun pcAmount(pcAmount: String) = pcAmount(JsonField.of(pcAmount))

            /**
             * Sets [Builder.pcAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcAmount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcAmount(pcAmount: JsonField<String>) = apply { this.pcAmount = pcAmount }

            /** The amount spent in budgets in the primary currency (pc) of this administration. */
            fun pcSpentInBudgets(pcSpentInBudgets: List<ArrayEntryWithCurrencyAndSum>) =
                pcSpentInBudgets(JsonField.of(pcSpentInBudgets))

            /**
             * Sets [Builder.pcSpentInBudgets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcSpentInBudgets] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun pcSpentInBudgets(pcSpentInBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>) =
                apply {
                    this.pcSpentInBudgets = pcSpentInBudgets.map { it.toMutableList() }
                }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [pcSpentInBudgets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPcSpentInBudget(pcSpentInBudget: ArrayEntryWithCurrencyAndSum) = apply {
                pcSpentInBudgets =
                    (pcSpentInBudgets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pcSpentInBudgets", it).add(pcSpentInBudget)
                    }
            }

            /**
             * The amount spent outside of budgets in the primary currency (pc) of this
             * administration.
             */
            fun pcSpentOutsideBudgets(pcSpentOutsideBudgets: List<ArrayEntryWithCurrencyAndSum>) =
                pcSpentOutsideBudgets(JsonField.of(pcSpentOutsideBudgets))

            /**
             * Sets [Builder.pcSpentOutsideBudgets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcSpentOutsideBudgets] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun pcSpentOutsideBudgets(
                pcSpentOutsideBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>
            ) = apply {
                this.pcSpentOutsideBudgets = pcSpentOutsideBudgets.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [pcSpentOutsideBudgets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPcSpentOutsideBudget(pcSpentOutsideBudget: ArrayEntryWithCurrencyAndSum) =
                apply {
                    pcSpentOutsideBudgets =
                        (pcSpentOutsideBudgets ?: JsonField.of(mutableListOf())).also {
                            checkKnown("pcSpentOutsideBudgets", it).add(pcSpentOutsideBudget)
                        }
                }

            /** The currency code of the administration's primary currency. */
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

            /** The currency decimal places of the administration's primary currency. */
            fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: Int) =
                primaryCurrencyDecimalPlaces(JsonField.of(primaryCurrencyDecimalPlaces))

            /**
             * Sets [Builder.primaryCurrencyDecimalPlaces] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyDecimalPlaces] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: JsonField<Int>) = apply {
                this.primaryCurrencyDecimalPlaces = primaryCurrencyDecimalPlaces
            }

            /** The currency ID of the administration's primary currency. */
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

            /** The currency name of the administration's primary currency. */
            fun primaryCurrencyName(primaryCurrencyName: String) =
                primaryCurrencyName(JsonField.of(primaryCurrencyName))

            /**
             * Sets [Builder.primaryCurrencyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCurrencyName(primaryCurrencyName: JsonField<String>) = apply {
                this.primaryCurrencyName = primaryCurrencyName
            }

            /** The currency symbol of the administration's primary currency. */
            fun primaryCurrencySymbol(primaryCurrencySymbol: String) =
                primaryCurrencySymbol(JsonField.of(primaryCurrencySymbol))

            /**
             * Sets [Builder.primaryCurrencySymbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencySymbol] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCurrencySymbol(primaryCurrencySymbol: JsonField<String>) = apply {
                this.primaryCurrencySymbol = primaryCurrencySymbol
            }

            fun spentInBudgets(spentInBudgets: List<ArrayEntryWithCurrencyAndSum>) =
                spentInBudgets(JsonField.of(spentInBudgets))

            /**
             * Sets [Builder.spentInBudgets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spentInBudgets] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun spentInBudgets(spentInBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>) =
                apply {
                    this.spentInBudgets = spentInBudgets.map { it.toMutableList() }
                }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [spentInBudgets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpentInBudget(spentInBudget: ArrayEntryWithCurrencyAndSum) = apply {
                spentInBudgets =
                    (spentInBudgets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("spentInBudgets", it).add(spentInBudget)
                    }
            }

            fun spentOutsideBudgets(spentOutsideBudgets: List<ArrayEntryWithCurrencyAndSum>) =
                spentOutsideBudgets(JsonField.of(spentOutsideBudgets))

            /**
             * Sets [Builder.spentOutsideBudgets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spentOutsideBudgets] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun spentOutsideBudgets(
                spentOutsideBudgets: JsonField<List<ArrayEntryWithCurrencyAndSum>>
            ) = apply { this.spentOutsideBudgets = spentOutsideBudgets.map { it.toMutableList() } }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [spentOutsideBudgets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpentOutsideBudget(spentOutsideBudget: ArrayEntryWithCurrencyAndSum) = apply {
                spentOutsideBudgets =
                    (spentOutsideBudgets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("spentOutsideBudgets", it).add(spentOutsideBudget)
                    }
            }

            /** Start date of the available budget. */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes =
                Attributes(
                    amount,
                    createdAt,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    end,
                    objectHasCurrencySetting,
                    pcAmount,
                    (pcSpentInBudgets ?: JsonMissing.of()).map { it.toImmutable() },
                    (pcSpentOutsideBudgets ?: JsonMissing.of()).map { it.toImmutable() },
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    (spentInBudgets ?: JsonMissing.of()).map { it.toImmutable() },
                    (spentOutsideBudgets ?: JsonMissing.of()).map { it.toImmutable() },
                    start,
                    updatedAt,
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
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            amount()
            createdAt()
            currencyCode()
            currencyDecimalPlaces()
            currencyId()
            currencyName()
            currencySymbol()
            end()
            objectHasCurrencySetting()
            pcAmount()
            pcSpentInBudgets()?.forEach { it.validate() }
            pcSpentOutsideBudgets()?.forEach { it.validate() }
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencyName()
            primaryCurrencySymbol()
            spentInBudgets()?.forEach { it.validate() }
            spentOutsideBudgets()?.forEach { it.validate() }
            start()
            updatedAt()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (currencyName.asKnown() == null) 0 else 1) +
                (if (currencySymbol.asKnown() == null) 0 else 1) +
                (if (end.asKnown() == null) 0 else 1) +
                (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                (if (pcAmount.asKnown() == null) 0 else 1) +
                (pcSpentInBudgets.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (pcSpentOutsideBudgets.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (spentInBudgets.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (spentOutsideBudgets.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (start.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                currencyCode == other.currencyCode &&
                currencyDecimalPlaces == other.currencyDecimalPlaces &&
                currencyId == other.currencyId &&
                currencyName == other.currencyName &&
                currencySymbol == other.currencySymbol &&
                end == other.end &&
                objectHasCurrencySetting == other.objectHasCurrencySetting &&
                pcAmount == other.pcAmount &&
                pcSpentInBudgets == other.pcSpentInBudgets &&
                pcSpentOutsideBudgets == other.pcSpentOutsideBudgets &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencyName == other.primaryCurrencyName &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                spentInBudgets == other.spentInBudgets &&
                spentOutsideBudgets == other.spentOutsideBudgets &&
                start == other.start &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                createdAt,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                end,
                objectHasCurrencySetting,
                pcAmount,
                pcSpentInBudgets,
                pcSpentOutsideBudgets,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                spentInBudgets,
                spentOutsideBudgets,
                start,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{amount=$amount, createdAt=$createdAt, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, end=$end, objectHasCurrencySetting=$objectHasCurrencySetting, pcAmount=$pcAmount, pcSpentInBudgets=$pcSpentInBudgets, pcSpentOutsideBudgets=$pcSpentOutsideBudgets, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, spentInBudgets=$spentInBudgets, spentOutsideBudgets=$spentOutsideBudgets, start=$start, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvailableBudgetRead &&
            id == other.id &&
            attributes == other.attributes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, attributes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AvailableBudgetRead{id=$id, attributes=$attributes, type=$type, additionalProperties=$additionalProperties}"
}
