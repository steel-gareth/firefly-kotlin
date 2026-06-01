// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.bills

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.checkKnown
import com.firefly.api.core.checkRequired
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class BillRead
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
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * Immutable value
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
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
         * Returns a mutable builder for constructing an instance of [BillRead].
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

    /** A builder for [BillRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(billRead: BillRead) = apply {
            id = billRead.id
            attributes = billRead.attributes
            type = billRead.type
            additionalProperties = billRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BillRead].
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
        fun build(): BillRead =
            BillRead(
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
     * @throws FireflyInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): BillRead = apply {
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
        } catch (e: FireflyInvalidDataException) {
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
        private val active: JsonField<Boolean>,
        private val amountAvg: JsonField<String>,
        private val amountMax: JsonField<String>,
        private val amountMin: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencyCode: JsonField<String>,
        private val currencyDecimalPlaces: JsonField<Int>,
        private val currencyId: JsonField<String>,
        private val currencyName: JsonField<String>,
        private val currencySymbol: JsonField<String>,
        private val date: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val extensionDate: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val nextExpectedMatch: JsonField<OffsetDateTime>,
        private val nextExpectedMatchDiff: JsonField<String>,
        private val notes: JsonField<String>,
        private val objectGroupId: JsonField<String>,
        private val objectGroupOrder: JsonField<Int>,
        private val objectGroupTitle: JsonField<String>,
        private val objectHasCurrencySetting: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val paidDates: JsonField<List<PaidDate>>,
        private val payDates: JsonField<List<OffsetDateTime>>,
        private val pcAmountAvg: JsonField<String>,
        private val pcAmountMax: JsonField<String>,
        private val pcAmountMin: JsonField<String>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencyName: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val repeatFreq: JsonField<BillRepeatFrequency>,
        private val skip: JsonField<Int>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("amount_avg")
            @ExcludeMissing
            amountAvg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_max")
            @ExcludeMissing
            amountMax: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_min")
            @ExcludeMissing
            amountMin: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("date")
            @ExcludeMissing
            date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("extension_date")
            @ExcludeMissing
            extensionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("next_expected_match")
            @ExcludeMissing
            nextExpectedMatch: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("next_expected_match_diff")
            @ExcludeMissing
            nextExpectedMatchDiff: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("paid_dates")
            @ExcludeMissing
            paidDates: JsonField<List<PaidDate>> = JsonMissing.of(),
            @JsonProperty("pay_dates")
            @ExcludeMissing
            payDates: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
            @JsonProperty("pc_amount_avg")
            @ExcludeMissing
            pcAmountAvg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_amount_max")
            @ExcludeMissing
            pcAmountMax: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_amount_min")
            @ExcludeMissing
            pcAmountMin: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("repeat_freq")
            @ExcludeMissing
            repeatFreq: JsonField<BillRepeatFrequency> = JsonMissing.of(),
            @JsonProperty("skip") @ExcludeMissing skip: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            active,
            amountAvg,
            amountMax,
            amountMin,
            createdAt,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            date,
            endDate,
            extensionDate,
            name,
            nextExpectedMatch,
            nextExpectedMatchDiff,
            notes,
            objectGroupId,
            objectGroupOrder,
            objectGroupTitle,
            objectHasCurrencySetting,
            order,
            paidDates,
            payDates,
            pcAmountAvg,
            pcAmountMax,
            pcAmountMin,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            repeatFreq,
            skip,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * If the subscription is active.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * The average amount that is expected for this subscription in the subscription's currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountAvg(): String? = amountAvg.getNullable("amount_avg")

        /**
         * The maximum amount that is expected for this subscription in the subscription's currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountMax(): String? = amountMax.getNullable("amount_max")

        /**
         * The minimum amount that is expected for this subscription in the subscription's currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountMin(): String? = amountMin.getNullable("amount_min")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * The currency code of the currency associated with this object.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyDecimalPlaces(): Int? =
            currencyDecimalPlaces.getNullable("currency_decimal_places")

        /**
         * The currency ID of the currency associated with this object.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * The currency name of the currency associated with this object.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyName(): String? = currencyName.getNullable("currency_name")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun date(): OffsetDateTime? = date.getNullable("date")

        /**
         * The date after which this subscription is no longer valid or applicable
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The date before which the subscription must be renewed (or cancelled)
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extensionDate(): OffsetDateTime? = extensionDate.getNullable("extension_date")

        /**
         * The name of the subscription.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * When the subscription is expected to be due.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextExpectedMatch(): OffsetDateTime? =
            nextExpectedMatch.getNullable("next_expected_match")

        /**
         * Formatted (locally) when the subscription is due.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextExpectedMatchDiff(): String? =
            nextExpectedMatchDiff.getNullable("next_expected_match_diff")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * The group ID of the group this object is part of. NULL if no group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectGroupId(): String? = objectGroupId.getNullable("object_group_id")

        /**
         * The order of the group. At least 1, for the highest sorting.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectGroupOrder(): Int? = objectGroupOrder.getNullable("object_group_order")

        /**
         * The name of the group. NULL if no group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectGroupTitle(): String? = objectGroupTitle.getNullable("object_group_title")

        /**
         * Indicates whether the object has a currency setting. If false, the object uses the
         * administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectHasCurrencySetting(): Boolean? =
            objectHasCurrencySetting.getNullable("object_has_currency_setting")

        /**
         * Order of the subscription.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * Array of past transactions when the subscription was paid.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paidDates(): List<PaidDate>? = paidDates.getNullable("paid_dates")

        /**
         * Array of future dates when the bill is expected to be paid. Autogenerated.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payDates(): List<OffsetDateTime>? = payDates.getNullable("pay_dates")

        /**
         * The average amount that is expected for this subscription in the administration's primary
         * currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pcAmountAvg(): String? = pcAmountAvg.getNullable("pc_amount_avg")

        /**
         * The maximum amount that is expected for this subscription in the administration's primary
         * currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pcAmountMax(): String? = pcAmountMax.getNullable("pc_amount_max")

        /**
         * The minimum amount that is expected for this subscription in the administration's primary
         * currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pcAmountMin(): String? = pcAmountMin.getNullable("pc_amount_min")

        /**
         * The currency code of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyCode(): String? =
            primaryCurrencyCode.getNullable("primary_currency_code")

        /**
         * The currency decimal places of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyDecimalPlaces(): Int? =
            primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

        /**
         * The currency ID of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

        /**
         * The currency name of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyName(): String? =
            primaryCurrencyName.getNullable("primary_currency_name")

        /**
         * The currency symbol of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencySymbol(): String? =
            primaryCurrencySymbol.getNullable("primary_currency_symbol")

        /**
         * How often the bill must be paid.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun repeatFreq(): BillRepeatFrequency? = repeatFreq.getNullable("repeat_freq")

        /**
         * How often the subscription will be skipped. 1 means a bi-monthly subscription.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skip(): Int? = skip.getNullable("skip")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [amountAvg].
         *
         * Unlike [amountAvg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_avg") @ExcludeMissing fun _amountAvg(): JsonField<String> = amountAvg

        /**
         * Returns the raw JSON value of [amountMax].
         *
         * Unlike [amountMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_max") @ExcludeMissing fun _amountMax(): JsonField<String> = amountMax

        /**
         * Returns the raw JSON value of [amountMin].
         *
         * Unlike [amountMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_min") @ExcludeMissing fun _amountMin(): JsonField<String> = amountMin

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
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [extensionDate].
         *
         * Unlike [extensionDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extension_date")
        @ExcludeMissing
        fun _extensionDate(): JsonField<OffsetDateTime> = extensionDate

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [nextExpectedMatch].
         *
         * Unlike [nextExpectedMatch], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_expected_match")
        @ExcludeMissing
        fun _nextExpectedMatch(): JsonField<OffsetDateTime> = nextExpectedMatch

        /**
         * Returns the raw JSON value of [nextExpectedMatchDiff].
         *
         * Unlike [nextExpectedMatchDiff], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("next_expected_match_diff")
        @ExcludeMissing
        fun _nextExpectedMatchDiff(): JsonField<String> = nextExpectedMatchDiff

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
         * Returns the raw JSON value of [paidDates].
         *
         * Unlike [paidDates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paid_dates")
        @ExcludeMissing
        fun _paidDates(): JsonField<List<PaidDate>> = paidDates

        /**
         * Returns the raw JSON value of [payDates].
         *
         * Unlike [payDates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pay_dates")
        @ExcludeMissing
        fun _payDates(): JsonField<List<OffsetDateTime>> = payDates

        /**
         * Returns the raw JSON value of [pcAmountAvg].
         *
         * Unlike [pcAmountAvg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_amount_avg")
        @ExcludeMissing
        fun _pcAmountAvg(): JsonField<String> = pcAmountAvg

        /**
         * Returns the raw JSON value of [pcAmountMax].
         *
         * Unlike [pcAmountMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_amount_max")
        @ExcludeMissing
        fun _pcAmountMax(): JsonField<String> = pcAmountMax

        /**
         * Returns the raw JSON value of [pcAmountMin].
         *
         * Unlike [pcAmountMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_amount_min")
        @ExcludeMissing
        fun _pcAmountMin(): JsonField<String> = pcAmountMin

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
         * Returns the raw JSON value of [repeatFreq].
         *
         * Unlike [repeatFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repeat_freq")
        @ExcludeMissing
        fun _repeatFreq(): JsonField<BillRepeatFrequency> = repeatFreq

        /**
         * Returns the raw JSON value of [skip].
         *
         * Unlike [skip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("skip") @ExcludeMissing fun _skip(): JsonField<Int> = skip

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

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var amountAvg: JsonField<String> = JsonMissing.of()
            private var amountMax: JsonField<String> = JsonMissing.of()
            private var amountMin: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var currencyName: JsonField<String> = JsonMissing.of()
            private var currencySymbol: JsonField<String> = JsonMissing.of()
            private var date: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var extensionDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var nextExpectedMatch: JsonField<OffsetDateTime> = JsonMissing.of()
            private var nextExpectedMatchDiff: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectGroupId: JsonField<String> = JsonMissing.of()
            private var objectGroupOrder: JsonField<Int> = JsonMissing.of()
            private var objectGroupTitle: JsonField<String> = JsonMissing.of()
            private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var paidDates: JsonField<MutableList<PaidDate>>? = null
            private var payDates: JsonField<MutableList<OffsetDateTime>>? = null
            private var pcAmountAvg: JsonField<String> = JsonMissing.of()
            private var pcAmountMax: JsonField<String> = JsonMissing.of()
            private var pcAmountMin: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var repeatFreq: JsonField<BillRepeatFrequency> = JsonMissing.of()
            private var skip: JsonField<Int> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                active = attributes.active
                amountAvg = attributes.amountAvg
                amountMax = attributes.amountMax
                amountMin = attributes.amountMin
                createdAt = attributes.createdAt
                currencyCode = attributes.currencyCode
                currencyDecimalPlaces = attributes.currencyDecimalPlaces
                currencyId = attributes.currencyId
                currencyName = attributes.currencyName
                currencySymbol = attributes.currencySymbol
                date = attributes.date
                endDate = attributes.endDate
                extensionDate = attributes.extensionDate
                name = attributes.name
                nextExpectedMatch = attributes.nextExpectedMatch
                nextExpectedMatchDiff = attributes.nextExpectedMatchDiff
                notes = attributes.notes
                objectGroupId = attributes.objectGroupId
                objectGroupOrder = attributes.objectGroupOrder
                objectGroupTitle = attributes.objectGroupTitle
                objectHasCurrencySetting = attributes.objectHasCurrencySetting
                order = attributes.order
                paidDates = attributes.paidDates.map { it.toMutableList() }
                payDates = attributes.payDates.map { it.toMutableList() }
                pcAmountAvg = attributes.pcAmountAvg
                pcAmountMax = attributes.pcAmountMax
                pcAmountMin = attributes.pcAmountMin
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencyName = attributes.primaryCurrencyName
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                repeatFreq = attributes.repeatFreq
                skip = attributes.skip
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            /** If the subscription is active. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /**
             * The average amount that is expected for this subscription in the subscription's
             * currency.
             */
            fun amountAvg(amountAvg: String) = amountAvg(JsonField.of(amountAvg))

            /**
             * Sets [Builder.amountAvg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountAvg] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountAvg(amountAvg: JsonField<String>) = apply { this.amountAvg = amountAvg }

            /**
             * The maximum amount that is expected for this subscription in the subscription's
             * currency.
             */
            fun amountMax(amountMax: String) = amountMax(JsonField.of(amountMax))

            /**
             * Sets [Builder.amountMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountMax] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountMax(amountMax: JsonField<String>) = apply { this.amountMax = amountMax }

            /**
             * The minimum amount that is expected for this subscription in the subscription's
             * currency.
             */
            fun amountMin(amountMin: String) = amountMin(JsonField.of(amountMin))

            /**
             * Sets [Builder.amountMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountMin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountMin(amountMin: JsonField<String>) = apply { this.amountMin = amountMin }

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

            fun date(date: OffsetDateTime) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            /** The date after which this subscription is no longer valid or applicable */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The date before which the subscription must be renewed (or cancelled) */
            fun extensionDate(extensionDate: OffsetDateTime?) =
                extensionDate(JsonField.ofNullable(extensionDate))

            /**
             * Sets [Builder.extensionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extensionDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun extensionDate(extensionDate: JsonField<OffsetDateTime>) = apply {
                this.extensionDate = extensionDate
            }

            /** The name of the subscription. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** When the subscription is expected to be due. */
            fun nextExpectedMatch(nextExpectedMatch: OffsetDateTime?) =
                nextExpectedMatch(JsonField.ofNullable(nextExpectedMatch))

            /**
             * Sets [Builder.nextExpectedMatch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextExpectedMatch] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun nextExpectedMatch(nextExpectedMatch: JsonField<OffsetDateTime>) = apply {
                this.nextExpectedMatch = nextExpectedMatch
            }

            /** Formatted (locally) when the subscription is due. */
            fun nextExpectedMatchDiff(nextExpectedMatchDiff: String?) =
                nextExpectedMatchDiff(JsonField.ofNullable(nextExpectedMatchDiff))

            /**
             * Sets [Builder.nextExpectedMatchDiff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextExpectedMatchDiff] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextExpectedMatchDiff(nextExpectedMatchDiff: JsonField<String>) = apply {
                this.nextExpectedMatchDiff = nextExpectedMatchDiff
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

            /** Order of the subscription. */
            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /** Array of past transactions when the subscription was paid. */
            fun paidDates(paidDates: List<PaidDate>) = paidDates(JsonField.of(paidDates))

            /**
             * Sets [Builder.paidDates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paidDates] with a well-typed `List<PaidDate>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paidDates(paidDates: JsonField<List<PaidDate>>) = apply {
                this.paidDates = paidDates.map { it.toMutableList() }
            }

            /**
             * Adds a single [PaidDate] to [paidDates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPaidDate(paidDate: PaidDate) = apply {
                paidDates =
                    (paidDates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("paidDates", it).add(paidDate)
                    }
            }

            /** Array of future dates when the bill is expected to be paid. Autogenerated. */
            fun payDates(payDates: List<OffsetDateTime>) = payDates(JsonField.of(payDates))

            /**
             * Sets [Builder.payDates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payDates] with a well-typed `List<OffsetDateTime>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun payDates(payDates: JsonField<List<OffsetDateTime>>) = apply {
                this.payDates = payDates.map { it.toMutableList() }
            }

            /**
             * Adds a single [OffsetDateTime] to [payDates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayDate(payDate: OffsetDateTime) = apply {
                payDates =
                    (payDates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payDates", it).add(payDate)
                    }
            }

            /**
             * The average amount that is expected for this subscription in the administration's
             * primary currency.
             */
            fun pcAmountAvg(pcAmountAvg: String) = pcAmountAvg(JsonField.of(pcAmountAvg))

            /**
             * Sets [Builder.pcAmountAvg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcAmountAvg] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcAmountAvg(pcAmountAvg: JsonField<String>) = apply {
                this.pcAmountAvg = pcAmountAvg
            }

            /**
             * The maximum amount that is expected for this subscription in the administration's
             * primary currency.
             */
            fun pcAmountMax(pcAmountMax: String) = pcAmountMax(JsonField.of(pcAmountMax))

            /**
             * Sets [Builder.pcAmountMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcAmountMax] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcAmountMax(pcAmountMax: JsonField<String>) = apply {
                this.pcAmountMax = pcAmountMax
            }

            /**
             * The minimum amount that is expected for this subscription in the administration's
             * primary currency.
             */
            fun pcAmountMin(pcAmountMin: String) = pcAmountMin(JsonField.of(pcAmountMin))

            /**
             * Sets [Builder.pcAmountMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcAmountMin] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcAmountMin(pcAmountMin: JsonField<String>) = apply {
                this.pcAmountMin = pcAmountMin
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

            /** How often the bill must be paid. */
            fun repeatFreq(repeatFreq: BillRepeatFrequency) = repeatFreq(JsonField.of(repeatFreq))

            /**
             * Sets [Builder.repeatFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repeatFreq] with a well-typed [BillRepeatFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun repeatFreq(repeatFreq: JsonField<BillRepeatFrequency>) = apply {
                this.repeatFreq = repeatFreq
            }

            /** How often the subscription will be skipped. 1 means a bi-monthly subscription. */
            fun skip(skip: Int) = skip(JsonField.of(skip))

            /**
             * Sets [Builder.skip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skip] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun skip(skip: JsonField<Int>) = apply { this.skip = skip }

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
                    active,
                    amountAvg,
                    amountMax,
                    amountMin,
                    createdAt,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    date,
                    endDate,
                    extensionDate,
                    name,
                    nextExpectedMatch,
                    nextExpectedMatchDiff,
                    notes,
                    objectGroupId,
                    objectGroupOrder,
                    objectGroupTitle,
                    objectHasCurrencySetting,
                    order,
                    (paidDates ?: JsonMissing.of()).map { it.toImmutable() },
                    (payDates ?: JsonMissing.of()).map { it.toImmutable() },
                    pcAmountAvg,
                    pcAmountMax,
                    pcAmountMin,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    repeatFreq,
                    skip,
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
         * @throws FireflyInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            active()
            amountAvg()
            amountMax()
            amountMin()
            createdAt()
            currencyCode()
            currencyDecimalPlaces()
            currencyId()
            currencyName()
            currencySymbol()
            date()
            endDate()
            extensionDate()
            name()
            nextExpectedMatch()
            nextExpectedMatchDiff()
            notes()
            objectGroupId()
            objectGroupOrder()
            objectGroupTitle()
            objectHasCurrencySetting()
            order()
            paidDates()?.forEach { it.validate() }
            payDates()
            pcAmountAvg()
            pcAmountMax()
            pcAmountMin()
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencyName()
            primaryCurrencySymbol()
            repeatFreq()?.validate()
            skip()
            updatedAt()
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
            (if (active.asKnown() == null) 0 else 1) +
                (if (amountAvg.asKnown() == null) 0 else 1) +
                (if (amountMax.asKnown() == null) 0 else 1) +
                (if (amountMin.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (currencyName.asKnown() == null) 0 else 1) +
                (if (currencySymbol.asKnown() == null) 0 else 1) +
                (if (date.asKnown() == null) 0 else 1) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (extensionDate.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (nextExpectedMatch.asKnown() == null) 0 else 1) +
                (if (nextExpectedMatchDiff.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectGroupId.asKnown() == null) 0 else 1) +
                (if (objectGroupOrder.asKnown() == null) 0 else 1) +
                (if (objectGroupTitle.asKnown() == null) 0 else 1) +
                (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (paidDates.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (payDates.asKnown()?.size ?: 0) +
                (if (pcAmountAvg.asKnown() == null) 0 else 1) +
                (if (pcAmountMax.asKnown() == null) 0 else 1) +
                (if (pcAmountMin.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (repeatFreq.asKnown()?.validity() ?: 0) +
                (if (skip.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        class PaidDate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val currencyCode: JsonField<String>,
            private val currencyDecimalPlaces: JsonField<Int>,
            private val currencyId: JsonField<String>,
            private val currencyName: JsonField<String>,
            private val currencySymbol: JsonField<String>,
            private val date: JsonField<OffsetDateTime>,
            private val foreignAmount: JsonField<String>,
            private val pcAmount: JsonField<String>,
            private val pcForeignAmount: JsonField<String>,
            private val primaryCurrencyCode: JsonField<String>,
            private val primaryCurrencyDecimalPlaces: JsonField<Int>,
            private val primaryCurrencyId: JsonField<String>,
            private val primaryCurrencyName: JsonField<String>,
            private val primaryCurrencySymbol: JsonField<String>,
            private val subscriptionId: JsonField<String>,
            private val transactionGroupId: JsonField<String>,
            private val transactionJournalId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("date")
                @ExcludeMissing
                date: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("foreign_amount")
                @ExcludeMissing
                foreignAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_amount")
                @ExcludeMissing
                pcAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_foreign_amount")
                @ExcludeMissing
                pcForeignAmount: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_group_id")
                @ExcludeMissing
                transactionGroupId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_journal_id")
                @ExcludeMissing
                transactionJournalId: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                date,
                foreignAmount,
                pcAmount,
                pcForeignAmount,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                subscriptionId,
                transactionGroupId,
                transactionJournalId,
                mutableMapOf(),
            )

            /**
             * The amount that was paid for this subscription in the subscription's currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): String? = amount.getNullable("amount")

            /**
             * The currency code of the currency associated with this object.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyCode(): String? = currencyCode.getNullable("currency_code")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyDecimalPlaces(): Int? =
                currencyDecimalPlaces.getNullable("currency_decimal_places")

            /**
             * The currency ID of the currency associated with this object.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyId(): String? = currencyId.getNullable("currency_id")

            /**
             * The currency name of the currency associated with this object.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyName(): String? = currencyName.getNullable("currency_name")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

            /**
             * Date the bill was paid.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun date(): OffsetDateTime? = date.getNullable("date")

            /**
             * The foreign amount that was paid for this subscription in the subscription's
             * currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun foreignAmount(): String? = foreignAmount.getNullable("foreign_amount")

            /**
             * The amount that was paid for this subscription in the administration's primary
             * currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pcAmount(): String? = pcAmount.getNullable("pc_amount")

            /**
             * The foreign amount that was paid for this subscription in the administration's
             * primary currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pcForeignAmount(): String? = pcForeignAmount.getNullable("pc_foreign_amount")

            /**
             * The currency code of the administration's primary currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyCode(): String? =
                primaryCurrencyCode.getNullable("primary_currency_code")

            /**
             * The currency decimal places of the administration's primary currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyDecimalPlaces(): Int? =
                primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

            /**
             * The currency ID of the administration's primary currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

            /**
             * The currency name of the administration's primary currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyName(): String? =
                primaryCurrencyName.getNullable("primary_currency_name")

            /**
             * The currency symbol of the administration's primary currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencySymbol(): String? =
                primaryCurrencySymbol.getNullable("primary_currency_symbol")

            /**
             * ID of this subscription.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * Transaction group ID of the transaction linked to this subscription.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transactionGroupId(): String? =
                transactionGroupId.getNullable("transaction_group_id")

            /**
             * Transaction journal ID of the transaction linked to this subscription.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transactionJournalId(): String? =
                transactionJournalId.getNullable("transaction_journal_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

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
             * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [currencySymbol], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("currency_symbol")
            @ExcludeMissing
            fun _currencySymbol(): JsonField<String> = currencySymbol

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

            /**
             * Returns the raw JSON value of [foreignAmount].
             *
             * Unlike [foreignAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("foreign_amount")
            @ExcludeMissing
            fun _foreignAmount(): JsonField<String> = foreignAmount

            /**
             * Returns the raw JSON value of [pcAmount].
             *
             * Unlike [pcAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pc_amount") @ExcludeMissing fun _pcAmount(): JsonField<String> = pcAmount

            /**
             * Returns the raw JSON value of [pcForeignAmount].
             *
             * Unlike [pcForeignAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pc_foreign_amount")
            @ExcludeMissing
            fun _pcForeignAmount(): JsonField<String> = pcForeignAmount

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
             * Unlike [primaryCurrencyDecimalPlaces], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("primary_currency_decimal_places")
            @ExcludeMissing
            fun _primaryCurrencyDecimalPlaces(): JsonField<Int> = primaryCurrencyDecimalPlaces

            /**
             * Returns the raw JSON value of [primaryCurrencyId].
             *
             * Unlike [primaryCurrencyId], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [transactionGroupId].
             *
             * Unlike [transactionGroupId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transaction_group_id")
            @ExcludeMissing
            fun _transactionGroupId(): JsonField<String> = transactionGroupId

            /**
             * Returns the raw JSON value of [transactionJournalId].
             *
             * Unlike [transactionJournalId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transaction_journal_id")
            @ExcludeMissing
            fun _transactionJournalId(): JsonField<String> = transactionJournalId

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

                /** Returns a mutable builder for constructing an instance of [PaidDate]. */
                fun builder() = Builder()
            }

            /** A builder for [PaidDate]. */
            class Builder internal constructor() {

                private var amount: JsonField<String> = JsonMissing.of()
                private var currencyCode: JsonField<String> = JsonMissing.of()
                private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var currencyId: JsonField<String> = JsonMissing.of()
                private var currencyName: JsonField<String> = JsonMissing.of()
                private var currencySymbol: JsonField<String> = JsonMissing.of()
                private var date: JsonField<OffsetDateTime> = JsonMissing.of()
                private var foreignAmount: JsonField<String> = JsonMissing.of()
                private var pcAmount: JsonField<String> = JsonMissing.of()
                private var pcForeignAmount: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
                private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var transactionGroupId: JsonField<String> = JsonMissing.of()
                private var transactionJournalId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paidDate: PaidDate) = apply {
                    amount = paidDate.amount
                    currencyCode = paidDate.currencyCode
                    currencyDecimalPlaces = paidDate.currencyDecimalPlaces
                    currencyId = paidDate.currencyId
                    currencyName = paidDate.currencyName
                    currencySymbol = paidDate.currencySymbol
                    date = paidDate.date
                    foreignAmount = paidDate.foreignAmount
                    pcAmount = paidDate.pcAmount
                    pcForeignAmount = paidDate.pcForeignAmount
                    primaryCurrencyCode = paidDate.primaryCurrencyCode
                    primaryCurrencyDecimalPlaces = paidDate.primaryCurrencyDecimalPlaces
                    primaryCurrencyId = paidDate.primaryCurrencyId
                    primaryCurrencyName = paidDate.primaryCurrencyName
                    primaryCurrencySymbol = paidDate.primaryCurrencySymbol
                    subscriptionId = paidDate.subscriptionId
                    transactionGroupId = paidDate.transactionGroupId
                    transactionJournalId = paidDate.transactionJournalId
                    additionalProperties = paidDate.additionalProperties.toMutableMap()
                }

                /**
                 * The amount that was paid for this subscription in the subscription's currency.
                 */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The currency code of the currency associated with this object. */
                fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

                /**
                 * Sets [Builder.currencyCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyCode(currencyCode: JsonField<String>) = apply {
                    this.currencyCode = currencyCode
                }

                fun currencyDecimalPlaces(currencyDecimalPlaces: Int) =
                    currencyDecimalPlaces(JsonField.of(currencyDecimalPlaces))

                /**
                 * Sets [Builder.currencyDecimalPlaces] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyDecimalPlaces] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyId(currencyId: JsonField<String>) = apply {
                    this.currencyId = currencyId
                }

                /** The currency name of the currency associated with this object. */
                fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

                /**
                 * Sets [Builder.currencyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencySymbol(currencySymbol: JsonField<String>) = apply {
                    this.currencySymbol = currencySymbol
                }

                /** Date the bill was paid. */
                fun date(date: OffsetDateTime) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

                /**
                 * The foreign amount that was paid for this subscription in the subscription's
                 * currency.
                 */
                fun foreignAmount(foreignAmount: String) =
                    foreignAmount(JsonField.of(foreignAmount))

                /**
                 * Sets [Builder.foreignAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun foreignAmount(foreignAmount: JsonField<String>) = apply {
                    this.foreignAmount = foreignAmount
                }

                /**
                 * The amount that was paid for this subscription in the administration's primary
                 * currency.
                 */
                fun pcAmount(pcAmount: String) = pcAmount(JsonField.of(pcAmount))

                /**
                 * Sets [Builder.pcAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pcAmount(pcAmount: JsonField<String>) = apply { this.pcAmount = pcAmount }

                /**
                 * The foreign amount that was paid for this subscription in the administration's
                 * primary currency.
                 */
                fun pcForeignAmount(pcForeignAmount: String) =
                    pcForeignAmount(JsonField.of(pcForeignAmount))

                /**
                 * Sets [Builder.pcForeignAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcForeignAmount] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pcForeignAmount(pcForeignAmount: JsonField<String>) = apply {
                    this.pcForeignAmount = pcForeignAmount
                }

                /** The currency code of the administration's primary currency. */
                fun primaryCurrencyCode(primaryCurrencyCode: String) =
                    primaryCurrencyCode(JsonField.of(primaryCurrencyCode))

                /**
                 * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: JsonField<Int>) =
                    apply {
                        this.primaryCurrencyDecimalPlaces = primaryCurrencyDecimalPlaces
                    }

                /** The currency ID of the administration's primary currency. */
                fun primaryCurrencyId(primaryCurrencyId: String) =
                    primaryCurrencyId(JsonField.of(primaryCurrencyId))

                /**
                 * Sets [Builder.primaryCurrencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencyId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.primaryCurrencySymbol] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun primaryCurrencySymbol(primaryCurrencySymbol: JsonField<String>) = apply {
                    this.primaryCurrencySymbol = primaryCurrencySymbol
                }

                /** ID of this subscription. */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /** Transaction group ID of the transaction linked to this subscription. */
                fun transactionGroupId(transactionGroupId: String) =
                    transactionGroupId(JsonField.of(transactionGroupId))

                /**
                 * Sets [Builder.transactionGroupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionGroupId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun transactionGroupId(transactionGroupId: JsonField<String>) = apply {
                    this.transactionGroupId = transactionGroupId
                }

                /** Transaction journal ID of the transaction linked to this subscription. */
                fun transactionJournalId(transactionJournalId: String) =
                    transactionJournalId(JsonField.of(transactionJournalId))

                /**
                 * Sets [Builder.transactionJournalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionJournalId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun transactionJournalId(transactionJournalId: JsonField<String>) = apply {
                    this.transactionJournalId = transactionJournalId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PaidDate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PaidDate =
                    PaidDate(
                        amount,
                        currencyCode,
                        currencyDecimalPlaces,
                        currencyId,
                        currencyName,
                        currencySymbol,
                        date,
                        foreignAmount,
                        pcAmount,
                        pcForeignAmount,
                        primaryCurrencyCode,
                        primaryCurrencyDecimalPlaces,
                        primaryCurrencyId,
                        primaryCurrencyName,
                        primaryCurrencySymbol,
                        subscriptionId,
                        transactionGroupId,
                        transactionJournalId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws FireflyInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PaidDate = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currencyCode()
                currencyDecimalPlaces()
                currencyId()
                currencyName()
                currencySymbol()
                date()
                foreignAmount()
                pcAmount()
                pcForeignAmount()
                primaryCurrencyCode()
                primaryCurrencyDecimalPlaces()
                primaryCurrencyId()
                primaryCurrencyName()
                primaryCurrencySymbol()
                subscriptionId()
                transactionGroupId()
                transactionJournalId()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (currencyCode.asKnown() == null) 0 else 1) +
                    (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (currencyId.asKnown() == null) 0 else 1) +
                    (if (currencyName.asKnown() == null) 0 else 1) +
                    (if (currencySymbol.asKnown() == null) 0 else 1) +
                    (if (date.asKnown() == null) 0 else 1) +
                    (if (foreignAmount.asKnown() == null) 0 else 1) +
                    (if (pcAmount.asKnown() == null) 0 else 1) +
                    (if (pcForeignAmount.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (transactionGroupId.asKnown() == null) 0 else 1) +
                    (if (transactionJournalId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaidDate &&
                    amount == other.amount &&
                    currencyCode == other.currencyCode &&
                    currencyDecimalPlaces == other.currencyDecimalPlaces &&
                    currencyId == other.currencyId &&
                    currencyName == other.currencyName &&
                    currencySymbol == other.currencySymbol &&
                    date == other.date &&
                    foreignAmount == other.foreignAmount &&
                    pcAmount == other.pcAmount &&
                    pcForeignAmount == other.pcForeignAmount &&
                    primaryCurrencyCode == other.primaryCurrencyCode &&
                    primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                    primaryCurrencyId == other.primaryCurrencyId &&
                    primaryCurrencyName == other.primaryCurrencyName &&
                    primaryCurrencySymbol == other.primaryCurrencySymbol &&
                    subscriptionId == other.subscriptionId &&
                    transactionGroupId == other.transactionGroupId &&
                    transactionJournalId == other.transactionJournalId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    date,
                    foreignAmount,
                    pcAmount,
                    pcForeignAmount,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    subscriptionId,
                    transactionGroupId,
                    transactionJournalId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaidDate{amount=$amount, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, date=$date, foreignAmount=$foreignAmount, pcAmount=$pcAmount, pcForeignAmount=$pcForeignAmount, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, subscriptionId=$subscriptionId, transactionGroupId=$transactionGroupId, transactionJournalId=$transactionJournalId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                active == other.active &&
                amountAvg == other.amountAvg &&
                amountMax == other.amountMax &&
                amountMin == other.amountMin &&
                createdAt == other.createdAt &&
                currencyCode == other.currencyCode &&
                currencyDecimalPlaces == other.currencyDecimalPlaces &&
                currencyId == other.currencyId &&
                currencyName == other.currencyName &&
                currencySymbol == other.currencySymbol &&
                date == other.date &&
                endDate == other.endDate &&
                extensionDate == other.extensionDate &&
                name == other.name &&
                nextExpectedMatch == other.nextExpectedMatch &&
                nextExpectedMatchDiff == other.nextExpectedMatchDiff &&
                notes == other.notes &&
                objectGroupId == other.objectGroupId &&
                objectGroupOrder == other.objectGroupOrder &&
                objectGroupTitle == other.objectGroupTitle &&
                objectHasCurrencySetting == other.objectHasCurrencySetting &&
                order == other.order &&
                paidDates == other.paidDates &&
                payDates == other.payDates &&
                pcAmountAvg == other.pcAmountAvg &&
                pcAmountMax == other.pcAmountMax &&
                pcAmountMin == other.pcAmountMin &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencyName == other.primaryCurrencyName &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                repeatFreq == other.repeatFreq &&
                skip == other.skip &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                active,
                amountAvg,
                amountMax,
                amountMin,
                createdAt,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                date,
                endDate,
                extensionDate,
                name,
                nextExpectedMatch,
                nextExpectedMatchDiff,
                notes,
                objectGroupId,
                objectGroupOrder,
                objectGroupTitle,
                objectHasCurrencySetting,
                order,
                paidDates,
                payDates,
                pcAmountAvg,
                pcAmountMax,
                pcAmountMin,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                repeatFreq,
                skip,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{active=$active, amountAvg=$amountAvg, amountMax=$amountMax, amountMin=$amountMin, createdAt=$createdAt, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, date=$date, endDate=$endDate, extensionDate=$extensionDate, name=$name, nextExpectedMatch=$nextExpectedMatch, nextExpectedMatchDiff=$nextExpectedMatchDiff, notes=$notes, objectGroupId=$objectGroupId, objectGroupOrder=$objectGroupOrder, objectGroupTitle=$objectGroupTitle, objectHasCurrencySetting=$objectHasCurrencySetting, order=$order, paidDates=$paidDates, payDates=$payDates, pcAmountAvg=$pcAmountAvg, pcAmountMax=$pcAmountMax, pcAmountMin=$pcAmountMin, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, repeatFreq=$repeatFreq, skip=$skip, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillRead &&
            id == other.id &&
            attributes == other.attributes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, attributes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillRead{id=$id, attributes=$attributes, type=$type, additionalProperties=$additionalProperties}"
}
