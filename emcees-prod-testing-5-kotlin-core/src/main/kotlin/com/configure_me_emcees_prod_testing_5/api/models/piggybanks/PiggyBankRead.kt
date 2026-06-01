// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.piggybanks

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PiggyBankRead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val links: JsonField<ObjectLink>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<ObjectLink> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, links, type, mutableMapOf())

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
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): ObjectLink = links.getRequired("links")

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
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<ObjectLink> = links

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
         * Returns a mutable builder for constructing an instance of [PiggyBankRead].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .links()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PiggyBankRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(piggyBankRead: PiggyBankRead) = apply {
            id = piggyBankRead.id
            attributes = piggyBankRead.attributes
            links = piggyBankRead.links
            type = piggyBankRead.type
            additionalProperties = piggyBankRead.additionalProperties.toMutableMap()
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

        fun links(links: ObjectLink) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [ObjectLink] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun links(links: JsonField<ObjectLink>) = apply { this.links = links }

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
         * Returns an immutable instance of [PiggyBankRead].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .links()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PiggyBankRead =
            PiggyBankRead(
                checkRequired("id", id),
                checkRequired("attributes", attributes),
                checkRequired("links", links),
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
    fun validate(): PiggyBankRead = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().validate()
        links().validate()
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
            (links.asKnown()?.validity() ?: 0) +
            (if (type.asKnown() == null) 0 else 1)

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonValue,
        private val name: JsonField<String>,
        private val targetAmount: JsonField<String>,
        private val accounts: JsonField<List<Account>>,
        private val active: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencyCode: JsonField<String>,
        private val currencyDecimalPlaces: JsonField<Int>,
        private val currencyId: JsonField<String>,
        private val currencyName: JsonField<String>,
        private val currencySymbol: JsonField<String>,
        private val currentAmount: JsonField<String>,
        private val leftToSave: JsonField<String>,
        private val notes: JsonField<String>,
        private val objectGroupId: JsonField<String>,
        private val objectGroupOrder: JsonField<Int>,
        private val objectGroupTitle: JsonField<String>,
        private val objectHasCurrencySetting: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val pcCurrentAmount: JsonField<String>,
        private val pcLeftToSave: JsonField<String>,
        private val pcSavePerMonth: JsonField<String>,
        private val pcTargetAmount: JsonField<String>,
        private val percentage: JsonField<Int>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencyName: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val savePerMonth: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val targetDate: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id") @ExcludeMissing accountId: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_amount")
            @ExcludeMissing
            targetAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounts")
            @ExcludeMissing
            accounts: JsonField<List<Account>> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
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
            @JsonProperty("current_amount")
            @ExcludeMissing
            currentAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("left_to_save")
            @ExcludeMissing
            leftToSave: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("pc_current_amount")
            @ExcludeMissing
            pcCurrentAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_left_to_save")
            @ExcludeMissing
            pcLeftToSave: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_save_per_month")
            @ExcludeMissing
            pcSavePerMonth: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_target_amount")
            @ExcludeMissing
            pcTargetAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("percentage")
            @ExcludeMissing
            percentage: JsonField<Int> = JsonMissing.of(),
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
            @JsonProperty("save_per_month")
            @ExcludeMissing
            savePerMonth: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("target_date")
            @ExcludeMissing
            targetDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            accountId,
            name,
            targetAmount,
            accounts,
            active,
            createdAt,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            currentAmount,
            leftToSave,
            notes,
            objectGroupId,
            objectGroupOrder,
            objectGroupTitle,
            objectHasCurrencySetting,
            order,
            pcCurrentAmount,
            pcLeftToSave,
            pcSavePerMonth,
            pcTargetAmount,
            percentage,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            savePerMonth,
            startDate,
            targetDate,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = attributes.accountId().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonValue = accountId

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
        fun targetAmount(): String? = targetAmount.getNullable("target_amount")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun accounts(): List<Account>? = accounts.getNullable("accounts")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

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
        fun currentAmount(): String? = currentAmount.getNullable("current_amount")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun leftToSave(): String? = leftToSave.getNullable("left_to_save")

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
         * The current amount in the primary currency of the administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcCurrentAmount(): String? = pcCurrentAmount.getNullable("pc_current_amount")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcLeftToSave(): String? = pcLeftToSave.getNullable("pc_left_to_save")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcSavePerMonth(): String? = pcSavePerMonth.getNullable("pc_save_per_month")

        /**
         * The target amount in the primary currency of the administration.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcTargetAmount(): String? = pcTargetAmount.getNullable("pc_target_amount")

        /**
         * The percentage of the target amount that has been saved, if a target amount is set.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun percentage(): Int? = percentage.getNullable("percentage")

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
        fun savePerMonth(): String? = savePerMonth.getNullable("save_per_month")

        /**
         * The date you started with this piggy bank.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

        /**
         * The date you intend to finish saving money.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun targetDate(): OffsetDateTime? = targetDate.getNullable("target_date")

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
         * Returns the raw JSON value of [targetAmount].
         *
         * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<String> = targetAmount

        /**
         * Returns the raw JSON value of [accounts].
         *
         * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accounts")
        @ExcludeMissing
        fun _accounts(): JsonField<List<Account>> = accounts

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

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
         * Returns the raw JSON value of [currentAmount].
         *
         * Unlike [currentAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_amount")
        @ExcludeMissing
        fun _currentAmount(): JsonField<String> = currentAmount

        /**
         * Returns the raw JSON value of [leftToSave].
         *
         * Unlike [leftToSave], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("left_to_save")
        @ExcludeMissing
        fun _leftToSave(): JsonField<String> = leftToSave

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
         * Returns the raw JSON value of [pcCurrentAmount].
         *
         * Unlike [pcCurrentAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_current_amount")
        @ExcludeMissing
        fun _pcCurrentAmount(): JsonField<String> = pcCurrentAmount

        /**
         * Returns the raw JSON value of [pcLeftToSave].
         *
         * Unlike [pcLeftToSave], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_left_to_save")
        @ExcludeMissing
        fun _pcLeftToSave(): JsonField<String> = pcLeftToSave

        /**
         * Returns the raw JSON value of [pcSavePerMonth].
         *
         * Unlike [pcSavePerMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_save_per_month")
        @ExcludeMissing
        fun _pcSavePerMonth(): JsonField<String> = pcSavePerMonth

        /**
         * Returns the raw JSON value of [pcTargetAmount].
         *
         * Unlike [pcTargetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_target_amount")
        @ExcludeMissing
        fun _pcTargetAmount(): JsonField<String> = pcTargetAmount

        /**
         * Returns the raw JSON value of [percentage].
         *
         * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("percentage") @ExcludeMissing fun _percentage(): JsonField<Int> = percentage

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
         * Returns the raw JSON value of [savePerMonth].
         *
         * Unlike [savePerMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("save_per_month")
        @ExcludeMissing
        fun _savePerMonth(): JsonField<String> = savePerMonth

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [targetDate].
         *
         * Unlike [targetDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_date")
        @ExcludeMissing
        fun _targetDate(): JsonField<OffsetDateTime> = targetDate

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
             * .accountId()
             * .name()
             * .targetAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var accountId: JsonValue? = null
            private var name: JsonField<String>? = null
            private var targetAmount: JsonField<String>? = null
            private var accounts: JsonField<MutableList<Account>>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var currencyName: JsonField<String> = JsonMissing.of()
            private var currencySymbol: JsonField<String> = JsonMissing.of()
            private var currentAmount: JsonField<String> = JsonMissing.of()
            private var leftToSave: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectGroupId: JsonField<String> = JsonMissing.of()
            private var objectGroupOrder: JsonField<Int> = JsonMissing.of()
            private var objectGroupTitle: JsonField<String> = JsonMissing.of()
            private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var pcCurrentAmount: JsonField<String> = JsonMissing.of()
            private var pcLeftToSave: JsonField<String> = JsonMissing.of()
            private var pcSavePerMonth: JsonField<String> = JsonMissing.of()
            private var pcTargetAmount: JsonField<String> = JsonMissing.of()
            private var percentage: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var savePerMonth: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var targetDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                accountId = attributes.accountId
                name = attributes.name
                targetAmount = attributes.targetAmount
                accounts = attributes.accounts.map { it.toMutableList() }
                active = attributes.active
                createdAt = attributes.createdAt
                currencyCode = attributes.currencyCode
                currencyDecimalPlaces = attributes.currencyDecimalPlaces
                currencyId = attributes.currencyId
                currencyName = attributes.currencyName
                currencySymbol = attributes.currencySymbol
                currentAmount = attributes.currentAmount
                leftToSave = attributes.leftToSave
                notes = attributes.notes
                objectGroupId = attributes.objectGroupId
                objectGroupOrder = attributes.objectGroupOrder
                objectGroupTitle = attributes.objectGroupTitle
                objectHasCurrencySetting = attributes.objectHasCurrencySetting
                order = attributes.order
                pcCurrentAmount = attributes.pcCurrentAmount
                pcLeftToSave = attributes.pcLeftToSave
                pcSavePerMonth = attributes.pcSavePerMonth
                pcTargetAmount = attributes.pcTargetAmount
                percentage = attributes.percentage
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencyName = attributes.primaryCurrencyName
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                savePerMonth = attributes.savePerMonth
                startDate = attributes.startDate
                targetDate = attributes.targetDate
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            fun accountId(accountId: JsonValue) = apply { this.accountId = accountId }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun targetAmount(targetAmount: String?) =
                targetAmount(JsonField.ofNullable(targetAmount))

            /**
             * Sets [Builder.targetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetAmount(targetAmount: JsonField<String>) = apply {
                this.targetAmount = targetAmount
            }

            fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

            /**
             * Sets [Builder.accounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accounts(accounts: JsonField<List<Account>>) = apply {
                this.accounts = accounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Account] to [accounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccount(account: Account) = apply {
                accounts =
                    (accounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accounts", it).add(account)
                    }
            }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

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

            fun currentAmount(currentAmount: String) = currentAmount(JsonField.of(currentAmount))

            /**
             * Sets [Builder.currentAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentAmount(currentAmount: JsonField<String>) = apply {
                this.currentAmount = currentAmount
            }

            fun leftToSave(leftToSave: String?) = leftToSave(JsonField.ofNullable(leftToSave))

            /**
             * Sets [Builder.leftToSave] to an arbitrary JSON value.
             *
             * You should usually call [Builder.leftToSave] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun leftToSave(leftToSave: JsonField<String>) = apply { this.leftToSave = leftToSave }

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

            /** The current amount in the primary currency of the administration. */
            fun pcCurrentAmount(pcCurrentAmount: String) =
                pcCurrentAmount(JsonField.of(pcCurrentAmount))

            /**
             * Sets [Builder.pcCurrentAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcCurrentAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcCurrentAmount(pcCurrentAmount: JsonField<String>) = apply {
                this.pcCurrentAmount = pcCurrentAmount
            }

            fun pcLeftToSave(pcLeftToSave: String?) =
                pcLeftToSave(JsonField.ofNullable(pcLeftToSave))

            /**
             * Sets [Builder.pcLeftToSave] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcLeftToSave] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcLeftToSave(pcLeftToSave: JsonField<String>) = apply {
                this.pcLeftToSave = pcLeftToSave
            }

            fun pcSavePerMonth(pcSavePerMonth: String?) =
                pcSavePerMonth(JsonField.ofNullable(pcSavePerMonth))

            /**
             * Sets [Builder.pcSavePerMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcSavePerMonth] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcSavePerMonth(pcSavePerMonth: JsonField<String>) = apply {
                this.pcSavePerMonth = pcSavePerMonth
            }

            /** The target amount in the primary currency of the administration. */
            fun pcTargetAmount(pcTargetAmount: String?) =
                pcTargetAmount(JsonField.ofNullable(pcTargetAmount))

            /**
             * Sets [Builder.pcTargetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcTargetAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcTargetAmount(pcTargetAmount: JsonField<String>) = apply {
                this.pcTargetAmount = pcTargetAmount
            }

            /**
             * The percentage of the target amount that has been saved, if a target amount is set.
             */
            fun percentage(percentage: Int?) = percentage(JsonField.ofNullable(percentage))

            /**
             * Alias for [Builder.percentage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun percentage(percentage: Int) = percentage(percentage as Int?)

            /**
             * Sets [Builder.percentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentage] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun percentage(percentage: JsonField<Int>) = apply { this.percentage = percentage }

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

            fun savePerMonth(savePerMonth: String?) =
                savePerMonth(JsonField.ofNullable(savePerMonth))

            /**
             * Sets [Builder.savePerMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.savePerMonth] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun savePerMonth(savePerMonth: JsonField<String>) = apply {
                this.savePerMonth = savePerMonth
            }

            /** The date you started with this piggy bank. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The date you intend to finish saving money. */
            fun targetDate(targetDate: OffsetDateTime?) =
                targetDate(JsonField.ofNullable(targetDate))

            /**
             * Sets [Builder.targetDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetDate(targetDate: JsonField<OffsetDateTime>) = apply {
                this.targetDate = targetDate
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
             * .accountId()
             * .name()
             * .targetAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("accountId", accountId),
                    checkRequired("name", name),
                    checkRequired("targetAmount", targetAmount),
                    (accounts ?: JsonMissing.of()).map { it.toImmutable() },
                    active,
                    createdAt,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    currentAmount,
                    leftToSave,
                    notes,
                    objectGroupId,
                    objectGroupOrder,
                    objectGroupTitle,
                    objectHasCurrencySetting,
                    order,
                    pcCurrentAmount,
                    pcLeftToSave,
                    pcSavePerMonth,
                    pcTargetAmount,
                    percentage,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    savePerMonth,
                    startDate,
                    targetDate,
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
            targetAmount()
            accounts()?.forEach { it.validate() }
            active()
            createdAt()
            currencyCode()
            currencyDecimalPlaces()
            currencyId()
            currencyName()
            currencySymbol()
            currentAmount()
            leftToSave()
            notes()
            objectGroupId()
            objectGroupOrder()
            objectGroupTitle()
            objectHasCurrencySetting()
            order()
            pcCurrentAmount()
            pcLeftToSave()
            pcSavePerMonth()
            pcTargetAmount()
            percentage()
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencyName()
            primaryCurrencySymbol()
            savePerMonth()
            startDate()
            targetDate()
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
                (if (targetAmount.asKnown() == null) 0 else 1) +
                (accounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (currencyName.asKnown() == null) 0 else 1) +
                (if (currencySymbol.asKnown() == null) 0 else 1) +
                (if (currentAmount.asKnown() == null) 0 else 1) +
                (if (leftToSave.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectGroupId.asKnown() == null) 0 else 1) +
                (if (objectGroupOrder.asKnown() == null) 0 else 1) +
                (if (objectGroupTitle.asKnown() == null) 0 else 1) +
                (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (pcCurrentAmount.asKnown() == null) 0 else 1) +
                (if (pcLeftToSave.asKnown() == null) 0 else 1) +
                (if (pcSavePerMonth.asKnown() == null) 0 else 1) +
                (if (pcTargetAmount.asKnown() == null) 0 else 1) +
                (if (percentage.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (if (savePerMonth.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1) +
                (if (targetDate.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        class Account
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val currentAmount: JsonField<String>,
            private val name: JsonField<String>,
            private val pcCurrentAmount: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_id")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("current_amount")
                @ExcludeMissing
                currentAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_current_amount")
                @ExcludeMissing
                pcCurrentAmount: JsonField<String> = JsonMissing.of(),
            ) : this(accountId, currentAmount, name, pcCurrentAmount, mutableMapOf())

            /**
             * The ID of the account.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun accountId(): String? = accountId.getNullable("account_id")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currentAmount(): String? = currentAmount.getNullable("current_amount")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * If convertToPrimary is on, this will show the amount in the primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pcCurrentAmount(): String? = pcCurrentAmount.getNullable("pc_current_amount")

            /**
             * Returns the raw JSON value of [accountId].
             *
             * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun _accountId(): JsonField<String> = accountId

            /**
             * Returns the raw JSON value of [currentAmount].
             *
             * Unlike [currentAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("current_amount")
            @ExcludeMissing
            fun _currentAmount(): JsonField<String> = currentAmount

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [pcCurrentAmount].
             *
             * Unlike [pcCurrentAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pc_current_amount")
            @ExcludeMissing
            fun _pcCurrentAmount(): JsonField<String> = pcCurrentAmount

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

                /** Returns a mutable builder for constructing an instance of [Account]. */
                fun builder() = Builder()
            }

            /** A builder for [Account]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String> = JsonMissing.of()
                private var currentAmount: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var pcCurrentAmount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(account: Account) = apply {
                    accountId = account.accountId
                    currentAmount = account.currentAmount
                    name = account.name
                    pcCurrentAmount = account.pcCurrentAmount
                    additionalProperties = account.additionalProperties.toMutableMap()
                }

                /** The ID of the account. */
                fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                /**
                 * Sets [Builder.accountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

                fun currentAmount(currentAmount: String) =
                    currentAmount(JsonField.of(currentAmount))

                /**
                 * Sets [Builder.currentAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currentAmount(currentAmount: JsonField<String>) = apply {
                    this.currentAmount = currentAmount
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** If convertToPrimary is on, this will show the amount in the primary currency. */
                fun pcCurrentAmount(pcCurrentAmount: String) =
                    pcCurrentAmount(JsonField.of(pcCurrentAmount))

                /**
                 * Sets [Builder.pcCurrentAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcCurrentAmount] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pcCurrentAmount(pcCurrentAmount: JsonField<String>) = apply {
                    this.pcCurrentAmount = pcCurrentAmount
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
                 * Returns an immutable instance of [Account].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Account =
                    Account(
                        accountId,
                        currentAmount,
                        name,
                        pcCurrentAmount,
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
             * @throws EmceesProdTesting5InvalidDataException if any value type in this object
             *   doesn't match its expected type.
             */
            fun validate(): Account = apply {
                if (validated) {
                    return@apply
                }

                accountId()
                currentAmount()
                name()
                pcCurrentAmount()
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
                (if (accountId.asKnown() == null) 0 else 1) +
                    (if (currentAmount.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (pcCurrentAmount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Account &&
                    accountId == other.accountId &&
                    currentAmount == other.currentAmount &&
                    name == other.name &&
                    pcCurrentAmount == other.pcCurrentAmount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, currentAmount, name, pcCurrentAmount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Account{accountId=$accountId, currentAmount=$currentAmount, name=$name, pcCurrentAmount=$pcCurrentAmount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                accountId == other.accountId &&
                name == other.name &&
                targetAmount == other.targetAmount &&
                accounts == other.accounts &&
                active == other.active &&
                createdAt == other.createdAt &&
                currencyCode == other.currencyCode &&
                currencyDecimalPlaces == other.currencyDecimalPlaces &&
                currencyId == other.currencyId &&
                currencyName == other.currencyName &&
                currencySymbol == other.currencySymbol &&
                currentAmount == other.currentAmount &&
                leftToSave == other.leftToSave &&
                notes == other.notes &&
                objectGroupId == other.objectGroupId &&
                objectGroupOrder == other.objectGroupOrder &&
                objectGroupTitle == other.objectGroupTitle &&
                objectHasCurrencySetting == other.objectHasCurrencySetting &&
                order == other.order &&
                pcCurrentAmount == other.pcCurrentAmount &&
                pcLeftToSave == other.pcLeftToSave &&
                pcSavePerMonth == other.pcSavePerMonth &&
                pcTargetAmount == other.pcTargetAmount &&
                percentage == other.percentage &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencyName == other.primaryCurrencyName &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                savePerMonth == other.savePerMonth &&
                startDate == other.startDate &&
                targetDate == other.targetDate &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                name,
                targetAmount,
                accounts,
                active,
                createdAt,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                currentAmount,
                leftToSave,
                notes,
                objectGroupId,
                objectGroupOrder,
                objectGroupTitle,
                objectHasCurrencySetting,
                order,
                pcCurrentAmount,
                pcLeftToSave,
                pcSavePerMonth,
                pcTargetAmount,
                percentage,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                savePerMonth,
                startDate,
                targetDate,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{accountId=$accountId, name=$name, targetAmount=$targetAmount, accounts=$accounts, active=$active, createdAt=$createdAt, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, currentAmount=$currentAmount, leftToSave=$leftToSave, notes=$notes, objectGroupId=$objectGroupId, objectGroupOrder=$objectGroupOrder, objectGroupTitle=$objectGroupTitle, objectHasCurrencySetting=$objectHasCurrencySetting, order=$order, pcCurrentAmount=$pcCurrentAmount, pcLeftToSave=$pcLeftToSave, pcSavePerMonth=$pcSavePerMonth, pcTargetAmount=$pcTargetAmount, percentage=$percentage, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, savePerMonth=$savePerMonth, startDate=$startDate, targetDate=$targetDate, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PiggyBankRead &&
            id == other.id &&
            attributes == other.attributes &&
            links == other.links &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, attributes, links, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PiggyBankRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
