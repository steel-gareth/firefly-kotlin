// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class BudgetRead
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
         * Returns a mutable builder for constructing an instance of [BudgetRead].
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

    /** A builder for [BudgetRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(budgetRead: BudgetRead) = apply {
            id = budgetRead.id
            attributes = budgetRead.attributes
            type = budgetRead.type
            additionalProperties = budgetRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BudgetRead].
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
        fun build(): BudgetRead =
            BudgetRead(
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
    fun validate(): BudgetRead = apply {
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
        private val name: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val autoBudgetAmount: JsonField<String>,
        private val autoBudgetPeriod: JsonField<AutoBudgetPeriod>,
        private val autoBudgetType: JsonField<AutoBudgetType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencyCode: JsonField<String>,
        private val currencyDecimalPlaces: JsonField<Int>,
        private val currencyId: JsonField<String>,
        private val currencyName: JsonField<String>,
        private val currencySymbol: JsonField<String>,
        private val notes: JsonField<String>,
        private val objectGroupId: JsonField<String>,
        private val objectGroupOrder: JsonField<Int>,
        private val objectGroupTitle: JsonField<String>,
        private val objectHasCurrencySetting: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val pcAutoBudgetAmount: JsonField<String>,
        private val pcSpent: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencyName: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val spent: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_budget_amount")
            @ExcludeMissing
            autoBudgetAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_budget_period")
            @ExcludeMissing
            autoBudgetPeriod: JsonField<AutoBudgetPeriod> = JsonMissing.of(),
            @JsonProperty("auto_budget_type")
            @ExcludeMissing
            autoBudgetType: JsonField<AutoBudgetType> = JsonMissing.of(),
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
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_group_id")
            @ExcludeMissing
            objectGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_group_order")
            @ExcludeMissing
            objectGroupOrder: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("object_group_title")
            @ExcludeMissing
            objectGroupTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_has_currency_setting")
            @ExcludeMissing
            objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("pc_auto_budget_amount")
            @ExcludeMissing
            pcAutoBudgetAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_spent")
            @ExcludeMissing
            pcSpent: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
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
            @JsonProperty("spent")
            @ExcludeMissing
            spent: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            name,
            active,
            autoBudgetAmount,
            autoBudgetPeriod,
            autoBudgetType,
            createdAt,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            notes,
            objectGroupId,
            objectGroupOrder,
            objectGroupTitle,
            objectHasCurrencySetting,
            order,
            pcAutoBudgetAmount,
            pcSpent,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            spent,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * The amount for the auto-budget, if set.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetAmount(): String? = autoBudgetAmount.getNullable("auto_budget_amount")

        /**
         * Period for the auto budget
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetPeriod(): AutoBudgetPeriod? =
            autoBudgetPeriod.getNullable("auto_budget_period")

        /**
         * The type of auto-budget that Firefly III must create.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetType(): AutoBudgetType? = autoBudgetType.getNullable("auto_budget_type")

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
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * The group ID of the group this object is part of. NULL if no group.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectGroupId(): String? = objectGroupId.getNullable("object_group_id")

        /**
         * The order of the group. At least 1, for the highest sorting.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectGroupOrder(): Int? = objectGroupOrder.getNullable("object_group_order")

        /**
         * The name of the group. NULL if no group.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectGroupTitle(): String? = objectGroupTitle.getNullable("object_group_title")

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
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * The amount for the auto-budget, if set in the primary currency of the administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcAutoBudgetAmount(): String? = pcAutoBudgetAmount.getNullable("pc_auto_budget_amount")

        /**
         * Information on how much was spent in this budget. Is only filled in when the start and
         * end date are submitted. It is converted to the primary currency of the administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcSpent(): List<ArrayEntryWithCurrencyAndSum>? = pcSpent.getNullable("pc_spent")

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
         * Information on how much was spent in this budget. Is only filled in when the start and
         * end date are submitted.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spent(): List<ArrayEntryWithCurrencyAndSum>? = spent.getNullable("spent")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [autoBudgetAmount].
         *
         * Unlike [autoBudgetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_budget_amount")
        @ExcludeMissing
        fun _autoBudgetAmount(): JsonField<String> = autoBudgetAmount

        /**
         * Returns the raw JSON value of [autoBudgetPeriod].
         *
         * Unlike [autoBudgetPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_budget_period")
        @ExcludeMissing
        fun _autoBudgetPeriod(): JsonField<AutoBudgetPeriod> = autoBudgetPeriod

        /**
         * Returns the raw JSON value of [autoBudgetType].
         *
         * Unlike [autoBudgetType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_budget_type")
        @ExcludeMissing
        fun _autoBudgetType(): JsonField<AutoBudgetType> = autoBudgetType

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
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [objectGroupId].
         *
         * Unlike [objectGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("object_group_id")
        @ExcludeMissing
        fun _objectGroupId(): JsonField<String> = objectGroupId

        /**
         * Returns the raw JSON value of [objectGroupOrder].
         *
         * Unlike [objectGroupOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("object_group_order")
        @ExcludeMissing
        fun _objectGroupOrder(): JsonField<Int> = objectGroupOrder

        /**
         * Returns the raw JSON value of [objectGroupTitle].
         *
         * Unlike [objectGroupTitle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("object_group_title")
        @ExcludeMissing
        fun _objectGroupTitle(): JsonField<String> = objectGroupTitle

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
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

        /**
         * Returns the raw JSON value of [pcAutoBudgetAmount].
         *
         * Unlike [pcAutoBudgetAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pc_auto_budget_amount")
        @ExcludeMissing
        fun _pcAutoBudgetAmount(): JsonField<String> = pcAutoBudgetAmount

        /**
         * Returns the raw JSON value of [pcSpent].
         *
         * Unlike [pcSpent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_spent")
        @ExcludeMissing
        fun _pcSpent(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = pcSpent

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
         * Returns the raw JSON value of [spent].
         *
         * Unlike [spent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spent")
        @ExcludeMissing
        fun _spent(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = spent

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

            /**
             * Returns a mutable builder for constructing an instance of [Attributes].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var autoBudgetAmount: JsonField<String> = JsonMissing.of()
            private var autoBudgetPeriod: JsonField<AutoBudgetPeriod> = JsonMissing.of()
            private var autoBudgetType: JsonField<AutoBudgetType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var currencyName: JsonField<String> = JsonMissing.of()
            private var currencySymbol: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectGroupId: JsonField<String> = JsonMissing.of()
            private var objectGroupOrder: JsonField<Int> = JsonMissing.of()
            private var objectGroupTitle: JsonField<String> = JsonMissing.of()
            private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var pcAutoBudgetAmount: JsonField<String> = JsonMissing.of()
            private var pcSpent: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var spent: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                name = attributes.name
                active = attributes.active
                autoBudgetAmount = attributes.autoBudgetAmount
                autoBudgetPeriod = attributes.autoBudgetPeriod
                autoBudgetType = attributes.autoBudgetType
                createdAt = attributes.createdAt
                currencyCode = attributes.currencyCode
                currencyDecimalPlaces = attributes.currencyDecimalPlaces
                currencyId = attributes.currencyId
                currencyName = attributes.currencyName
                currencySymbol = attributes.currencySymbol
                notes = attributes.notes
                objectGroupId = attributes.objectGroupId
                objectGroupOrder = attributes.objectGroupOrder
                objectGroupTitle = attributes.objectGroupTitle
                objectHasCurrencySetting = attributes.objectHasCurrencySetting
                order = attributes.order
                pcAutoBudgetAmount = attributes.pcAutoBudgetAmount
                pcSpent = attributes.pcSpent.map { it.toMutableList() }
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencyName = attributes.primaryCurrencyName
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                spent = attributes.spent.map { it.toMutableList() }
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /** The amount for the auto-budget, if set. */
            fun autoBudgetAmount(autoBudgetAmount: String?) =
                autoBudgetAmount(JsonField.ofNullable(autoBudgetAmount))

            /**
             * Sets [Builder.autoBudgetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoBudgetAmount(autoBudgetAmount: JsonField<String>) = apply {
                this.autoBudgetAmount = autoBudgetAmount
            }

            /** Period for the auto budget */
            fun autoBudgetPeriod(autoBudgetPeriod: AutoBudgetPeriod?) =
                autoBudgetPeriod(JsonField.ofNullable(autoBudgetPeriod))

            /**
             * Sets [Builder.autoBudgetPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetPeriod] with a well-typed
             * [AutoBudgetPeriod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun autoBudgetPeriod(autoBudgetPeriod: JsonField<AutoBudgetPeriod>) = apply {
                this.autoBudgetPeriod = autoBudgetPeriod
            }

            /** The type of auto-budget that Firefly III must create. */
            fun autoBudgetType(autoBudgetType: AutoBudgetType?) =
                autoBudgetType(JsonField.ofNullable(autoBudgetType))

            /**
             * Sets [Builder.autoBudgetType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetType] with a well-typed [AutoBudgetType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoBudgetType(autoBudgetType: JsonField<AutoBudgetType>) = apply {
                this.autoBudgetType = autoBudgetType
            }

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

            fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** The group ID of the group this object is part of. NULL if no group. */
            fun objectGroupId(objectGroupId: String?) =
                objectGroupId(JsonField.ofNullable(objectGroupId))

            /**
             * Sets [Builder.objectGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectGroupId(objectGroupId: JsonField<String>) = apply {
                this.objectGroupId = objectGroupId
            }

            /** The order of the group. At least 1, for the highest sorting. */
            fun objectGroupOrder(objectGroupOrder: Int?) =
                objectGroupOrder(JsonField.ofNullable(objectGroupOrder))

            /**
             * Alias for [Builder.objectGroupOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun objectGroupOrder(objectGroupOrder: Int) = objectGroupOrder(objectGroupOrder as Int?)

            /**
             * Sets [Builder.objectGroupOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectGroupOrder] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectGroupOrder(objectGroupOrder: JsonField<Int>) = apply {
                this.objectGroupOrder = objectGroupOrder
            }

            /** The name of the group. NULL if no group. */
            fun objectGroupTitle(objectGroupTitle: String?) =
                objectGroupTitle(JsonField.ofNullable(objectGroupTitle))

            /**
             * Sets [Builder.objectGroupTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectGroupTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectGroupTitle(objectGroupTitle: JsonField<String>) = apply {
                this.objectGroupTitle = objectGroupTitle
            }

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

            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /**
             * The amount for the auto-budget, if set in the primary currency of the administration.
             */
            fun pcAutoBudgetAmount(pcAutoBudgetAmount: String?) =
                pcAutoBudgetAmount(JsonField.ofNullable(pcAutoBudgetAmount))

            /**
             * Sets [Builder.pcAutoBudgetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcAutoBudgetAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcAutoBudgetAmount(pcAutoBudgetAmount: JsonField<String>) = apply {
                this.pcAutoBudgetAmount = pcAutoBudgetAmount
            }

            /**
             * Information on how much was spent in this budget. Is only filled in when the start
             * and end date are submitted. It is converted to the primary currency of the
             * administration.
             */
            fun pcSpent(pcSpent: List<ArrayEntryWithCurrencyAndSum>) =
                pcSpent(JsonField.of(pcSpent))

            /**
             * Sets [Builder.pcSpent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcSpent] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun pcSpent(pcSpent: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.pcSpent = pcSpent.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.pcSpent].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPcSpent(pcSpent: ArrayEntryWithCurrencyAndSum) = apply {
                this.pcSpent =
                    (this.pcSpent ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pcSpent", it).add(pcSpent)
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

            /**
             * Information on how much was spent in this budget. Is only filled in when the start
             * and end date are submitted.
             */
            fun spent(spent: List<ArrayEntryWithCurrencyAndSum>) = spent(JsonField.of(spent))

            /**
             * Sets [Builder.spent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spent] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun spent(spent: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.spent = spent.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.spent].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpent(spent: ArrayEntryWithCurrencyAndSum) = apply {
                this.spent =
                    (this.spent ?: JsonField.of(mutableListOf())).also {
                        checkKnown("spent", it).add(spent)
                    }
            }

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
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("name", name),
                    active,
                    autoBudgetAmount,
                    autoBudgetPeriod,
                    autoBudgetType,
                    createdAt,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    notes,
                    objectGroupId,
                    objectGroupOrder,
                    objectGroupTitle,
                    objectHasCurrencySetting,
                    order,
                    pcAutoBudgetAmount,
                    (pcSpent ?: JsonMissing.of()).map { it.toImmutable() },
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    (spent ?: JsonMissing.of()).map { it.toImmutable() },
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

            name()
            active()
            autoBudgetAmount()
            autoBudgetPeriod()?.validate()
            autoBudgetType()?.validate()
            createdAt()
            currencyCode()
            currencyDecimalPlaces()
            currencyId()
            currencyName()
            currencySymbol()
            notes()
            objectGroupId()
            objectGroupOrder()
            objectGroupTitle()
            objectHasCurrencySetting()
            order()
            pcAutoBudgetAmount()
            pcSpent()?.forEach { it.validate() }
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencyName()
            primaryCurrencySymbol()
            spent()?.forEach { it.validate() }
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
            (if (name.asKnown() == null) 0 else 1) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (autoBudgetAmount.asKnown() == null) 0 else 1) +
                (autoBudgetPeriod.asKnown()?.validity() ?: 0) +
                (autoBudgetType.asKnown()?.validity() ?: 0) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (currencyName.asKnown() == null) 0 else 1) +
                (if (currencySymbol.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectGroupId.asKnown() == null) 0 else 1) +
                (if (objectGroupOrder.asKnown() == null) 0 else 1) +
                (if (objectGroupTitle.asKnown() == null) 0 else 1) +
                (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (pcAutoBudgetAmount.asKnown() == null) 0 else 1) +
                (pcSpent.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (spent.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                name == other.name &&
                active == other.active &&
                autoBudgetAmount == other.autoBudgetAmount &&
                autoBudgetPeriod == other.autoBudgetPeriod &&
                autoBudgetType == other.autoBudgetType &&
                createdAt == other.createdAt &&
                currencyCode == other.currencyCode &&
                currencyDecimalPlaces == other.currencyDecimalPlaces &&
                currencyId == other.currencyId &&
                currencyName == other.currencyName &&
                currencySymbol == other.currencySymbol &&
                notes == other.notes &&
                objectGroupId == other.objectGroupId &&
                objectGroupOrder == other.objectGroupOrder &&
                objectGroupTitle == other.objectGroupTitle &&
                objectHasCurrencySetting == other.objectHasCurrencySetting &&
                order == other.order &&
                pcAutoBudgetAmount == other.pcAutoBudgetAmount &&
                pcSpent == other.pcSpent &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencyName == other.primaryCurrencyName &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                spent == other.spent &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                active,
                autoBudgetAmount,
                autoBudgetPeriod,
                autoBudgetType,
                createdAt,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                notes,
                objectGroupId,
                objectGroupOrder,
                objectGroupTitle,
                objectHasCurrencySetting,
                order,
                pcAutoBudgetAmount,
                pcSpent,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                spent,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{name=$name, active=$active, autoBudgetAmount=$autoBudgetAmount, autoBudgetPeriod=$autoBudgetPeriod, autoBudgetType=$autoBudgetType, createdAt=$createdAt, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, notes=$notes, objectGroupId=$objectGroupId, objectGroupOrder=$objectGroupOrder, objectGroupTitle=$objectGroupTitle, objectHasCurrencySetting=$objectHasCurrencySetting, order=$order, pcAutoBudgetAmount=$pcAutoBudgetAmount, pcSpent=$pcSpent, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, spent=$spent, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BudgetRead &&
            id == other.id &&
            attributes == other.attributes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, attributes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BudgetRead{id=$id, attributes=$attributes, type=$type, additionalProperties=$additionalProperties}"
}
