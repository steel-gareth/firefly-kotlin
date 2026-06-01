// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.accounts

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AccountRead
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
         * Returns a mutable builder for constructing an instance of [AccountRead].
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

    /** A builder for [AccountRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountRead: AccountRead) = apply {
            id = accountRead.id
            attributes = accountRead.attributes
            type = accountRead.type
            additionalProperties = accountRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AccountRead].
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
        fun build(): AccountRead =
            AccountRead(
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
    fun validate(): AccountRead = apply {
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
        private val type: JsonField<ShortAccountTypeProperty>,
        private val accountNumber: JsonField<String>,
        private val accountRole: JsonField<AccountRoleProperty>,
        private val active: JsonField<Boolean>,
        private val balanceDifference: JsonField<String>,
        private val bic: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditCardType: JsonField<CreditCardTypeProperty>,
        private val currencyCode: JsonField<String>,
        private val currencyDecimalPlaces: JsonField<Int>,
        private val currencyId: JsonField<String>,
        private val currencyName: JsonField<String>,
        private val currencySymbol: JsonField<String>,
        private val currentBalance: JsonField<String>,
        private val currentBalanceDate: JsonField<OffsetDateTime>,
        private val debtAmount: JsonField<String>,
        private val iban: JsonField<String>,
        private val includeNetWorth: JsonField<Boolean>,
        private val interest: JsonField<String>,
        private val interestPeriod: JsonField<InterestPeriodProperty>,
        private val lastActivity: JsonField<OffsetDateTime>,
        private val latitude: JsonField<Double>,
        private val liabilityDirection: JsonField<LiabilityDirectionProperty>,
        private val liabilityType: JsonField<LiabilityTypeProperty>,
        private val longitude: JsonField<Double>,
        private val monthlyPaymentDate: JsonField<OffsetDateTime>,
        private val notes: JsonField<String>,
        private val objectGroupId: JsonField<String>,
        private val objectGroupOrder: JsonField<Int>,
        private val objectGroupTitle: JsonField<String>,
        private val objectHasCurrencySetting: JsonField<Boolean>,
        private val openingBalance: JsonField<String>,
        private val openingBalanceDate: JsonField<OffsetDateTime>,
        private val order: JsonField<Int>,
        private val pcBalanceDifference: JsonField<String>,
        private val pcCurrentBalance: JsonField<String>,
        private val pcDebtAmount: JsonField<String>,
        private val pcOpeningBalance: JsonField<String>,
        private val pcVirtualBalance: JsonField<String>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencyName: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val virtualBalance: JsonField<String>,
        private val zoomLevel: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<ShortAccountTypeProperty> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_role")
            @ExcludeMissing
            accountRole: JsonField<AccountRoleProperty> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("balance_difference")
            @ExcludeMissing
            balanceDifference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bic") @ExcludeMissing bic: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_card_type")
            @ExcludeMissing
            creditCardType: JsonField<CreditCardTypeProperty> = JsonMissing.of(),
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
            @JsonProperty("current_balance")
            @ExcludeMissing
            currentBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("current_balance_date")
            @ExcludeMissing
            currentBalanceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("debt_amount")
            @ExcludeMissing
            debtAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
            @JsonProperty("include_net_worth")
            @ExcludeMissing
            includeNetWorth: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("interest")
            @ExcludeMissing
            interest: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interest_period")
            @ExcludeMissing
            interestPeriod: JsonField<InterestPeriodProperty> = JsonMissing.of(),
            @JsonProperty("last_activity")
            @ExcludeMissing
            lastActivity: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("latitude")
            @ExcludeMissing
            latitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("liability_direction")
            @ExcludeMissing
            liabilityDirection: JsonField<LiabilityDirectionProperty> = JsonMissing.of(),
            @JsonProperty("liability_type")
            @ExcludeMissing
            liabilityType: JsonField<LiabilityTypeProperty> = JsonMissing.of(),
            @JsonProperty("longitude")
            @ExcludeMissing
            longitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("monthly_payment_date")
            @ExcludeMissing
            monthlyPaymentDate: JsonField<OffsetDateTime> = JsonMissing.of(),
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
            @JsonProperty("opening_balance")
            @ExcludeMissing
            openingBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("opening_balance_date")
            @ExcludeMissing
            openingBalanceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("pc_balance_difference")
            @ExcludeMissing
            pcBalanceDifference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_current_balance")
            @ExcludeMissing
            pcCurrentBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_debt_amount")
            @ExcludeMissing
            pcDebtAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_opening_balance")
            @ExcludeMissing
            pcOpeningBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pc_virtual_balance")
            @ExcludeMissing
            pcVirtualBalance: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("virtual_balance")
            @ExcludeMissing
            virtualBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zoom_level") @ExcludeMissing zoomLevel: JsonField<Int> = JsonMissing.of(),
        ) : this(
            name,
            type,
            accountNumber,
            accountRole,
            active,
            balanceDifference,
            bic,
            createdAt,
            creditCardType,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            currentBalance,
            currentBalanceDate,
            debtAmount,
            iban,
            includeNetWorth,
            interest,
            interestPeriod,
            lastActivity,
            latitude,
            liabilityDirection,
            liabilityType,
            longitude,
            monthlyPaymentDate,
            notes,
            objectGroupId,
            objectGroupOrder,
            objectGroupTitle,
            objectHasCurrencySetting,
            openingBalance,
            openingBalanceDate,
            order,
            pcBalanceDifference,
            pcCurrentBalance,
            pcDebtAmount,
            pcOpeningBalance,
            pcVirtualBalance,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            updatedAt,
            virtualBalance,
            zoomLevel,
            mutableMapOf(),
        )

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Can only be one one these account types. import, initial-balance and reconciliation
         * cannot be set manually.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): ShortAccountTypeProperty = type.getRequired("type")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /**
         * Is only mandatory when the type is asset.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun accountRole(): AccountRoleProperty? = accountRole.getNullable("account_role")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * If you submit a start AND end date, this will be the difference between those two
         * moments.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun balanceDifference(): String? = balanceDifference.getNullable("balance_difference")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bic(): String? = bic.getNullable("bic")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Mandatory when the account_role is ccAsset. Can only be monthlyFull or null.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun creditCardType(): CreditCardTypeProperty? =
            creditCardType.getNullable("credit_card_type")

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
         * The current balance of the account in the account's currency. If the account has no
         * currency, this is the balance in the administration's primary currency. Either way, the
         * `currency_*` fields reflect the currency used.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentBalance(): String? = currentBalance.getNullable("current_balance")

        /**
         * The timestamp for this date is always 23:59:59, to indicate it's the balance at the very
         * END of that particular day.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentBalanceDate(): OffsetDateTime? =
            currentBalanceDate.getNullable("current_balance_date")

        /**
         * In liability accounts (loans, debts and mortgages), this is the amount of debt in the
         * account's currency (see the `currency_*` fields). In asset accounts, this is NULL.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun debtAmount(): String? = debtAmount.getNullable("debt_amount")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun iban(): String? = iban.getNullable("iban")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun includeNetWorth(): Boolean? = includeNetWorth.getNullable("include_net_worth")

        /**
         * Mandatory when type is liability. Interest percentage.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun interest(): String? = interest.getNullable("interest")

        /**
         * Mandatory when type is liability. Period over which the interest is calculated.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun interestPeriod(): InterestPeriodProperty? =
            interestPeriod.getNullable("interest_period")

        /**
         * Last activity of the account.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lastActivity(): OffsetDateTime? = lastActivity.getNullable("last_activity")

        /**
         * Latitude of the accounts's location, if applicable. Can be used to draw a map.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun latitude(): Double? = latitude.getNullable("latitude")

        /**
         * 'credit' indicates somebody owes you the liability. 'debit' Indicates you owe this debt
         * yourself. Works only for liabilities.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun liabilityDirection(): LiabilityDirectionProperty? =
            liabilityDirection.getNullable("liability_direction")

        /**
         * Mandatory when type is liability. Specifies the exact type.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun liabilityType(): LiabilityTypeProperty? = liabilityType.getNullable("liability_type")

        /**
         * Latitude of the accounts's location, if applicable. Can be used to draw a map.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun longitude(): Double? = longitude.getNullable("longitude")

        /**
         * Mandatory when the account_role is ccAsset. Moment at which CC payment installments are
         * asked for by the bank.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun monthlyPaymentDate(): OffsetDateTime? =
            monthlyPaymentDate.getNullable("monthly_payment_date")

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
         * Indicates whether the account has a currency setting. If false, the account uses the
         * administration's primary currency. Asset accounts and liability accounts always have a
         * currency setting, while expense and revenue accounts do not.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectHasCurrencySetting(): Boolean? =
            objectHasCurrencySetting.getNullable("object_has_currency_setting")

        /**
         * Represents the opening balance, the initial amount this account holds in the currency of
         * the account or the administration's primary currency if the account has no currency.
         * Either way, the `currency_*` fields reflect the currency used.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openingBalance(): String? = openingBalance.getNullable("opening_balance")

        /**
         * Represents the date of the opening balance.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun openingBalanceDate(): OffsetDateTime? =
            openingBalanceDate.getNullable("opening_balance_date")

        /**
         * Order of the account. Is NULL if account is not asset or liability.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * If you submit a start AND end date, this will be the difference in the currency of the
         * account or the administration's primary currency between those two moments.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcBalanceDifference(): String? =
            pcBalanceDifference.getNullable("pc_balance_difference")

        /**
         * The current balance of the account in the administration's primary currency. The
         * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
         * does have 'convert to primary' set to true in their settings.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcCurrentBalance(): String? = pcCurrentBalance.getNullable("pc_current_balance")

        /**
         * In liability accounts (loans, debts and mortgages), this is the amount of debt in the
         * administration's primary currency (see the `currency_*` fields. In asset accounts, this
         * is NULL.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcDebtAmount(): String? = pcDebtAmount.getNullable("pc_debt_amount")

        /**
         * The opening balance of the account in the administration's primary currency (pc). The
         * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
         * does have 'convert to primary' set to true in their settings.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcOpeningBalance(): String? = pcOpeningBalance.getNullable("pc_opening_balance")

        /**
         * The virtual balance of the account in the administration's primary currency (pc). The
         * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
         * does have 'convert to primary' set to true in their settings.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pcVirtualBalance(): String? = pcVirtualBalance.getNullable("pc_virtual_balance")

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
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * The virtual balance of the account in the account's currency or the administration's
         * primary currency if the account has no currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun virtualBalance(): String? = virtualBalance.getNullable("virtual_balance")

        /**
         * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
         * proprietary value because each map provider has different zoom levels.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun zoomLevel(): Int? = zoomLevel.getNullable("zoom_level")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<ShortAccountTypeProperty> = type

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountRole].
         *
         * Unlike [accountRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_role")
        @ExcludeMissing
        fun _accountRole(): JsonField<AccountRoleProperty> = accountRole

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [balanceDifference].
         *
         * Unlike [balanceDifference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("balance_difference")
        @ExcludeMissing
        fun _balanceDifference(): JsonField<String> = balanceDifference

        /**
         * Returns the raw JSON value of [bic].
         *
         * Unlike [bic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bic") @ExcludeMissing fun _bic(): JsonField<String> = bic

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditCardType].
         *
         * Unlike [creditCardType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_card_type")
        @ExcludeMissing
        fun _creditCardType(): JsonField<CreditCardTypeProperty> = creditCardType

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
         * Returns the raw JSON value of [currentBalance].
         *
         * Unlike [currentBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_balance")
        @ExcludeMissing
        fun _currentBalance(): JsonField<String> = currentBalance

        /**
         * Returns the raw JSON value of [currentBalanceDate].
         *
         * Unlike [currentBalanceDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_balance_date")
        @ExcludeMissing
        fun _currentBalanceDate(): JsonField<OffsetDateTime> = currentBalanceDate

        /**
         * Returns the raw JSON value of [debtAmount].
         *
         * Unlike [debtAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debt_amount")
        @ExcludeMissing
        fun _debtAmount(): JsonField<String> = debtAmount

        /**
         * Returns the raw JSON value of [iban].
         *
         * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

        /**
         * Returns the raw JSON value of [includeNetWorth].
         *
         * Unlike [includeNetWorth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_net_worth")
        @ExcludeMissing
        fun _includeNetWorth(): JsonField<Boolean> = includeNetWorth

        /**
         * Returns the raw JSON value of [interest].
         *
         * Unlike [interest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<String> = interest

        /**
         * Returns the raw JSON value of [interestPeriod].
         *
         * Unlike [interestPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interest_period")
        @ExcludeMissing
        fun _interestPeriod(): JsonField<InterestPeriodProperty> = interestPeriod

        /**
         * Returns the raw JSON value of [lastActivity].
         *
         * Unlike [lastActivity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_activity")
        @ExcludeMissing
        fun _lastActivity(): JsonField<OffsetDateTime> = lastActivity

        /**
         * Returns the raw JSON value of [latitude].
         *
         * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

        /**
         * Returns the raw JSON value of [liabilityDirection].
         *
         * Unlike [liabilityDirection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("liability_direction")
        @ExcludeMissing
        fun _liabilityDirection(): JsonField<LiabilityDirectionProperty> = liabilityDirection

        /**
         * Returns the raw JSON value of [liabilityType].
         *
         * Unlike [liabilityType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("liability_type")
        @ExcludeMissing
        fun _liabilityType(): JsonField<LiabilityTypeProperty> = liabilityType

        /**
         * Returns the raw JSON value of [longitude].
         *
         * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

        /**
         * Returns the raw JSON value of [monthlyPaymentDate].
         *
         * Unlike [monthlyPaymentDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("monthly_payment_date")
        @ExcludeMissing
        fun _monthlyPaymentDate(): JsonField<OffsetDateTime> = monthlyPaymentDate

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
         * Returns the raw JSON value of [openingBalance].
         *
         * Unlike [openingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("opening_balance")
        @ExcludeMissing
        fun _openingBalance(): JsonField<String> = openingBalance

        /**
         * Returns the raw JSON value of [openingBalanceDate].
         *
         * Unlike [openingBalanceDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("opening_balance_date")
        @ExcludeMissing
        fun _openingBalanceDate(): JsonField<OffsetDateTime> = openingBalanceDate

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

        /**
         * Returns the raw JSON value of [pcBalanceDifference].
         *
         * Unlike [pcBalanceDifference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pc_balance_difference")
        @ExcludeMissing
        fun _pcBalanceDifference(): JsonField<String> = pcBalanceDifference

        /**
         * Returns the raw JSON value of [pcCurrentBalance].
         *
         * Unlike [pcCurrentBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_current_balance")
        @ExcludeMissing
        fun _pcCurrentBalance(): JsonField<String> = pcCurrentBalance

        /**
         * Returns the raw JSON value of [pcDebtAmount].
         *
         * Unlike [pcDebtAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_debt_amount")
        @ExcludeMissing
        fun _pcDebtAmount(): JsonField<String> = pcDebtAmount

        /**
         * Returns the raw JSON value of [pcOpeningBalance].
         *
         * Unlike [pcOpeningBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_opening_balance")
        @ExcludeMissing
        fun _pcOpeningBalance(): JsonField<String> = pcOpeningBalance

        /**
         * Returns the raw JSON value of [pcVirtualBalance].
         *
         * Unlike [pcVirtualBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_virtual_balance")
        @ExcludeMissing
        fun _pcVirtualBalance(): JsonField<String> = pcVirtualBalance

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
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [virtualBalance].
         *
         * Unlike [virtualBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("virtual_balance")
        @ExcludeMissing
        fun _virtualBalance(): JsonField<String> = virtualBalance

        /**
         * Returns the raw JSON value of [zoomLevel].
         *
         * Unlike [zoomLevel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zoom_level") @ExcludeMissing fun _zoomLevel(): JsonField<Int> = zoomLevel

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
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var type: JsonField<ShortAccountTypeProperty>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var accountRole: JsonField<AccountRoleProperty> = JsonMissing.of()
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var balanceDifference: JsonField<String> = JsonMissing.of()
            private var bic: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var creditCardType: JsonField<CreditCardTypeProperty> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var currencyName: JsonField<String> = JsonMissing.of()
            private var currencySymbol: JsonField<String> = JsonMissing.of()
            private var currentBalance: JsonField<String> = JsonMissing.of()
            private var currentBalanceDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var debtAmount: JsonField<String> = JsonMissing.of()
            private var iban: JsonField<String> = JsonMissing.of()
            private var includeNetWorth: JsonField<Boolean> = JsonMissing.of()
            private var interest: JsonField<String> = JsonMissing.of()
            private var interestPeriod: JsonField<InterestPeriodProperty> = JsonMissing.of()
            private var lastActivity: JsonField<OffsetDateTime> = JsonMissing.of()
            private var latitude: JsonField<Double> = JsonMissing.of()
            private var liabilityDirection: JsonField<LiabilityDirectionProperty> = JsonMissing.of()
            private var liabilityType: JsonField<LiabilityTypeProperty> = JsonMissing.of()
            private var longitude: JsonField<Double> = JsonMissing.of()
            private var monthlyPaymentDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectGroupId: JsonField<String> = JsonMissing.of()
            private var objectGroupOrder: JsonField<Int> = JsonMissing.of()
            private var objectGroupTitle: JsonField<String> = JsonMissing.of()
            private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
            private var openingBalance: JsonField<String> = JsonMissing.of()
            private var openingBalanceDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var pcBalanceDifference: JsonField<String> = JsonMissing.of()
            private var pcCurrentBalance: JsonField<String> = JsonMissing.of()
            private var pcDebtAmount: JsonField<String> = JsonMissing.of()
            private var pcOpeningBalance: JsonField<String> = JsonMissing.of()
            private var pcVirtualBalance: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var virtualBalance: JsonField<String> = JsonMissing.of()
            private var zoomLevel: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                name = attributes.name
                type = attributes.type
                accountNumber = attributes.accountNumber
                accountRole = attributes.accountRole
                active = attributes.active
                balanceDifference = attributes.balanceDifference
                bic = attributes.bic
                createdAt = attributes.createdAt
                creditCardType = attributes.creditCardType
                currencyCode = attributes.currencyCode
                currencyDecimalPlaces = attributes.currencyDecimalPlaces
                currencyId = attributes.currencyId
                currencyName = attributes.currencyName
                currencySymbol = attributes.currencySymbol
                currentBalance = attributes.currentBalance
                currentBalanceDate = attributes.currentBalanceDate
                debtAmount = attributes.debtAmount
                iban = attributes.iban
                includeNetWorth = attributes.includeNetWorth
                interest = attributes.interest
                interestPeriod = attributes.interestPeriod
                lastActivity = attributes.lastActivity
                latitude = attributes.latitude
                liabilityDirection = attributes.liabilityDirection
                liabilityType = attributes.liabilityType
                longitude = attributes.longitude
                monthlyPaymentDate = attributes.monthlyPaymentDate
                notes = attributes.notes
                objectGroupId = attributes.objectGroupId
                objectGroupOrder = attributes.objectGroupOrder
                objectGroupTitle = attributes.objectGroupTitle
                objectHasCurrencySetting = attributes.objectHasCurrencySetting
                openingBalance = attributes.openingBalance
                openingBalanceDate = attributes.openingBalanceDate
                order = attributes.order
                pcBalanceDifference = attributes.pcBalanceDifference
                pcCurrentBalance = attributes.pcCurrentBalance
                pcDebtAmount = attributes.pcDebtAmount
                pcOpeningBalance = attributes.pcOpeningBalance
                pcVirtualBalance = attributes.pcVirtualBalance
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencyName = attributes.primaryCurrencyName
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                updatedAt = attributes.updatedAt
                virtualBalance = attributes.virtualBalance
                zoomLevel = attributes.zoomLevel
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

            /**
             * Can only be one one these account types. import, initial-balance and reconciliation
             * cannot be set manually.
             */
            fun type(type: ShortAccountTypeProperty) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [ShortAccountTypeProperty]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun type(type: JsonField<ShortAccountTypeProperty>) = apply { this.type = type }

            fun accountNumber(accountNumber: String?) =
                accountNumber(JsonField.ofNullable(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** Is only mandatory when the type is asset. */
            fun accountRole(accountRole: AccountRoleProperty?) =
                accountRole(JsonField.ofNullable(accountRole))

            /**
             * Sets [Builder.accountRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountRole] with a well-typed [AccountRoleProperty]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountRole(accountRole: JsonField<AccountRoleProperty>) = apply {
                this.accountRole = accountRole
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

            /**
             * If you submit a start AND end date, this will be the difference between those two
             * moments.
             */
            fun balanceDifference(balanceDifference: String) =
                balanceDifference(JsonField.of(balanceDifference))

            /**
             * Sets [Builder.balanceDifference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceDifference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceDifference(balanceDifference: JsonField<String>) = apply {
                this.balanceDifference = balanceDifference
            }

            fun bic(bic: String?) = bic(JsonField.ofNullable(bic))

            /**
             * Sets [Builder.bic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bic] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bic(bic: JsonField<String>) = apply { this.bic = bic }

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

            /** Mandatory when the account_role is ccAsset. Can only be monthlyFull or null. */
            fun creditCardType(creditCardType: CreditCardTypeProperty?) =
                creditCardType(JsonField.ofNullable(creditCardType))

            /**
             * Sets [Builder.creditCardType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditCardType] with a well-typed
             * [CreditCardTypeProperty] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun creditCardType(creditCardType: JsonField<CreditCardTypeProperty>) = apply {
                this.creditCardType = creditCardType
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

            /**
             * The current balance of the account in the account's currency. If the account has no
             * currency, this is the balance in the administration's primary currency. Either way,
             * the `currency_*` fields reflect the currency used.
             */
            fun currentBalance(currentBalance: String) =
                currentBalance(JsonField.of(currentBalance))

            /**
             * Sets [Builder.currentBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentBalance(currentBalance: JsonField<String>) = apply {
                this.currentBalance = currentBalance
            }

            /**
             * The timestamp for this date is always 23:59:59, to indicate it's the balance at the
             * very END of that particular day.
             */
            fun currentBalanceDate(currentBalanceDate: OffsetDateTime) =
                currentBalanceDate(JsonField.of(currentBalanceDate))

            /**
             * Sets [Builder.currentBalanceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentBalanceDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun currentBalanceDate(currentBalanceDate: JsonField<OffsetDateTime>) = apply {
                this.currentBalanceDate = currentBalanceDate
            }

            /**
             * In liability accounts (loans, debts and mortgages), this is the amount of debt in the
             * account's currency (see the `currency_*` fields). In asset accounts, this is NULL.
             */
            fun debtAmount(debtAmount: String?) = debtAmount(JsonField.ofNullable(debtAmount))

            /**
             * Sets [Builder.debtAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtAmount(debtAmount: JsonField<String>) = apply { this.debtAmount = debtAmount }

            fun iban(iban: String?) = iban(JsonField.ofNullable(iban))

            /**
             * Sets [Builder.iban] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iban] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iban(iban: JsonField<String>) = apply { this.iban = iban }

            fun includeNetWorth(includeNetWorth: Boolean) =
                includeNetWorth(JsonField.of(includeNetWorth))

            /**
             * Sets [Builder.includeNetWorth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeNetWorth] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeNetWorth(includeNetWorth: JsonField<Boolean>) = apply {
                this.includeNetWorth = includeNetWorth
            }

            /** Mandatory when type is liability. Interest percentage. */
            fun interest(interest: String?) = interest(JsonField.ofNullable(interest))

            /**
             * Sets [Builder.interest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interest] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interest(interest: JsonField<String>) = apply { this.interest = interest }

            /** Mandatory when type is liability. Period over which the interest is calculated. */
            fun interestPeriod(interestPeriod: InterestPeriodProperty?) =
                interestPeriod(JsonField.ofNullable(interestPeriod))

            /**
             * Sets [Builder.interestPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interestPeriod] with a well-typed
             * [InterestPeriodProperty] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun interestPeriod(interestPeriod: JsonField<InterestPeriodProperty>) = apply {
                this.interestPeriod = interestPeriod
            }

            /** Last activity of the account. */
            fun lastActivity(lastActivity: OffsetDateTime?) =
                lastActivity(JsonField.ofNullable(lastActivity))

            /**
             * Sets [Builder.lastActivity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastActivity] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastActivity(lastActivity: JsonField<OffsetDateTime>) = apply {
                this.lastActivity = lastActivity
            }

            /** Latitude of the accounts's location, if applicable. Can be used to draw a map. */
            fun latitude(latitude: Double?) = latitude(JsonField.ofNullable(latitude))

            /**
             * Alias for [Builder.latitude].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun latitude(latitude: Double) = latitude(latitude as Double?)

            /**
             * Sets [Builder.latitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

            /**
             * 'credit' indicates somebody owes you the liability. 'debit' Indicates you owe this
             * debt yourself. Works only for liabilities.
             */
            fun liabilityDirection(liabilityDirection: LiabilityDirectionProperty?) =
                liabilityDirection(JsonField.ofNullable(liabilityDirection))

            /**
             * Sets [Builder.liabilityDirection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liabilityDirection] with a well-typed
             * [LiabilityDirectionProperty] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun liabilityDirection(liabilityDirection: JsonField<LiabilityDirectionProperty>) =
                apply {
                    this.liabilityDirection = liabilityDirection
                }

            /** Mandatory when type is liability. Specifies the exact type. */
            fun liabilityType(liabilityType: LiabilityTypeProperty?) =
                liabilityType(JsonField.ofNullable(liabilityType))

            /**
             * Sets [Builder.liabilityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liabilityType] with a well-typed
             * [LiabilityTypeProperty] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun liabilityType(liabilityType: JsonField<LiabilityTypeProperty>) = apply {
                this.liabilityType = liabilityType
            }

            /** Latitude of the accounts's location, if applicable. Can be used to draw a map. */
            fun longitude(longitude: Double?) = longitude(JsonField.ofNullable(longitude))

            /**
             * Alias for [Builder.longitude].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun longitude(longitude: Double) = longitude(longitude as Double?)

            /**
             * Sets [Builder.longitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

            /**
             * Mandatory when the account_role is ccAsset. Moment at which CC payment installments
             * are asked for by the bank.
             */
            fun monthlyPaymentDate(monthlyPaymentDate: OffsetDateTime?) =
                monthlyPaymentDate(JsonField.ofNullable(monthlyPaymentDate))

            /**
             * Sets [Builder.monthlyPaymentDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyPaymentDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun monthlyPaymentDate(monthlyPaymentDate: JsonField<OffsetDateTime>) = apply {
                this.monthlyPaymentDate = monthlyPaymentDate
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
             * Indicates whether the account has a currency setting. If false, the account uses the
             * administration's primary currency. Asset accounts and liability accounts always have
             * a currency setting, while expense and revenue accounts do not.
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
             * Represents the opening balance, the initial amount this account holds in the currency
             * of the account or the administration's primary currency if the account has no
             * currency. Either way, the `currency_*` fields reflect the currency used.
             */
            fun openingBalance(openingBalance: String) =
                openingBalance(JsonField.of(openingBalance))

            /**
             * Sets [Builder.openingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openingBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openingBalance(openingBalance: JsonField<String>) = apply {
                this.openingBalance = openingBalance
            }

            /** Represents the date of the opening balance. */
            fun openingBalanceDate(openingBalanceDate: OffsetDateTime?) =
                openingBalanceDate(JsonField.ofNullable(openingBalanceDate))

            /**
             * Sets [Builder.openingBalanceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openingBalanceDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun openingBalanceDate(openingBalanceDate: JsonField<OffsetDateTime>) = apply {
                this.openingBalanceDate = openingBalanceDate
            }

            /** Order of the account. Is NULL if account is not asset or liability. */
            fun order(order: Int?) = order(JsonField.ofNullable(order))

            /**
             * Alias for [Builder.order].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun order(order: Int) = order(order as Int?)

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /**
             * If you submit a start AND end date, this will be the difference in the currency of
             * the account or the administration's primary currency between those two moments.
             */
            fun pcBalanceDifference(pcBalanceDifference: String?) =
                pcBalanceDifference(JsonField.ofNullable(pcBalanceDifference))

            /**
             * Sets [Builder.pcBalanceDifference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcBalanceDifference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pcBalanceDifference(pcBalanceDifference: JsonField<String>) = apply {
                this.pcBalanceDifference = pcBalanceDifference
            }

            /**
             * The current balance of the account in the administration's primary currency. The
             * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
             * does have 'convert to primary' set to true in their settings.
             */
            fun pcCurrentBalance(pcCurrentBalance: String?) =
                pcCurrentBalance(JsonField.ofNullable(pcCurrentBalance))

            /**
             * Sets [Builder.pcCurrentBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcCurrentBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcCurrentBalance(pcCurrentBalance: JsonField<String>) = apply {
                this.pcCurrentBalance = pcCurrentBalance
            }

            /**
             * In liability accounts (loans, debts and mortgages), this is the amount of debt in the
             * administration's primary currency (see the `currency_*` fields. In asset accounts,
             * this is NULL.
             */
            fun pcDebtAmount(pcDebtAmount: String?) =
                pcDebtAmount(JsonField.ofNullable(pcDebtAmount))

            /**
             * Sets [Builder.pcDebtAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcDebtAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcDebtAmount(pcDebtAmount: JsonField<String>) = apply {
                this.pcDebtAmount = pcDebtAmount
            }

            /**
             * The opening balance of the account in the administration's primary currency (pc). The
             * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
             * does have 'convert to primary' set to true in their settings.
             */
            fun pcOpeningBalance(pcOpeningBalance: String) =
                pcOpeningBalance(JsonField.of(pcOpeningBalance))

            /**
             * Sets [Builder.pcOpeningBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcOpeningBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcOpeningBalance(pcOpeningBalance: JsonField<String>) = apply {
                this.pcOpeningBalance = pcOpeningBalance
            }

            /**
             * The virtual balance of the account in the administration's primary currency (pc). The
             * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
             * does have 'convert to primary' set to true in their settings.
             */
            fun pcVirtualBalance(pcVirtualBalance: String) =
                pcVirtualBalance(JsonField.of(pcVirtualBalance))

            /**
             * Sets [Builder.pcVirtualBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcVirtualBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pcVirtualBalance(pcVirtualBalance: JsonField<String>) = apply {
                this.pcVirtualBalance = pcVirtualBalance
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

            /**
             * The virtual balance of the account in the account's currency or the administration's
             * primary currency if the account has no currency.
             */
            fun virtualBalance(virtualBalance: String) =
                virtualBalance(JsonField.of(virtualBalance))

            /**
             * Sets [Builder.virtualBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.virtualBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun virtualBalance(virtualBalance: JsonField<String>) = apply {
                this.virtualBalance = virtualBalance
            }

            /**
             * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
             * proprietary value because each map provider has different zoom levels.
             */
            fun zoomLevel(zoomLevel: Int?) = zoomLevel(JsonField.ofNullable(zoomLevel))

            /**
             * Alias for [Builder.zoomLevel].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun zoomLevel(zoomLevel: Int) = zoomLevel(zoomLevel as Int?)

            /**
             * Sets [Builder.zoomLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zoomLevel] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoomLevel(zoomLevel: JsonField<Int>) = apply { this.zoomLevel = zoomLevel }

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
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("name", name),
                    checkRequired("type", type),
                    accountNumber,
                    accountRole,
                    active,
                    balanceDifference,
                    bic,
                    createdAt,
                    creditCardType,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    currentBalance,
                    currentBalanceDate,
                    debtAmount,
                    iban,
                    includeNetWorth,
                    interest,
                    interestPeriod,
                    lastActivity,
                    latitude,
                    liabilityDirection,
                    liabilityType,
                    longitude,
                    monthlyPaymentDate,
                    notes,
                    objectGroupId,
                    objectGroupOrder,
                    objectGroupTitle,
                    objectHasCurrencySetting,
                    openingBalance,
                    openingBalanceDate,
                    order,
                    pcBalanceDifference,
                    pcCurrentBalance,
                    pcDebtAmount,
                    pcOpeningBalance,
                    pcVirtualBalance,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    updatedAt,
                    virtualBalance,
                    zoomLevel,
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
            type().validate()
            accountNumber()
            accountRole()?.validate()
            active()
            balanceDifference()
            bic()
            createdAt()
            creditCardType()?.validate()
            currencyCode()
            currencyDecimalPlaces()
            currencyId()
            currencyName()
            currencySymbol()
            currentBalance()
            currentBalanceDate()
            debtAmount()
            iban()
            includeNetWorth()
            interest()
            interestPeriod()?.validate()
            lastActivity()
            latitude()
            liabilityDirection()?.validate()
            liabilityType()?.validate()
            longitude()
            monthlyPaymentDate()
            notes()
            objectGroupId()
            objectGroupOrder()
            objectGroupTitle()
            objectHasCurrencySetting()
            openingBalance()
            openingBalanceDate()
            order()
            pcBalanceDifference()
            pcCurrentBalance()
            pcDebtAmount()
            pcOpeningBalance()
            pcVirtualBalance()
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencyName()
            primaryCurrencySymbol()
            updatedAt()
            virtualBalance()
            zoomLevel()
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
                (type.asKnown()?.validity() ?: 0) +
                (if (accountNumber.asKnown() == null) 0 else 1) +
                (accountRole.asKnown()?.validity() ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (balanceDifference.asKnown() == null) 0 else 1) +
                (if (bic.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditCardType.asKnown()?.validity() ?: 0) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (currencyName.asKnown() == null) 0 else 1) +
                (if (currencySymbol.asKnown() == null) 0 else 1) +
                (if (currentBalance.asKnown() == null) 0 else 1) +
                (if (currentBalanceDate.asKnown() == null) 0 else 1) +
                (if (debtAmount.asKnown() == null) 0 else 1) +
                (if (iban.asKnown() == null) 0 else 1) +
                (if (includeNetWorth.asKnown() == null) 0 else 1) +
                (if (interest.asKnown() == null) 0 else 1) +
                (interestPeriod.asKnown()?.validity() ?: 0) +
                (if (lastActivity.asKnown() == null) 0 else 1) +
                (if (latitude.asKnown() == null) 0 else 1) +
                (liabilityDirection.asKnown()?.validity() ?: 0) +
                (liabilityType.asKnown()?.validity() ?: 0) +
                (if (longitude.asKnown() == null) 0 else 1) +
                (if (monthlyPaymentDate.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectGroupId.asKnown() == null) 0 else 1) +
                (if (objectGroupOrder.asKnown() == null) 0 else 1) +
                (if (objectGroupTitle.asKnown() == null) 0 else 1) +
                (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                (if (openingBalance.asKnown() == null) 0 else 1) +
                (if (openingBalanceDate.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (pcBalanceDifference.asKnown() == null) 0 else 1) +
                (if (pcCurrentBalance.asKnown() == null) 0 else 1) +
                (if (pcDebtAmount.asKnown() == null) 0 else 1) +
                (if (pcOpeningBalance.asKnown() == null) 0 else 1) +
                (if (pcVirtualBalance.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (virtualBalance.asKnown() == null) 0 else 1) +
                (if (zoomLevel.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                name == other.name &&
                type == other.type &&
                accountNumber == other.accountNumber &&
                accountRole == other.accountRole &&
                active == other.active &&
                balanceDifference == other.balanceDifference &&
                bic == other.bic &&
                createdAt == other.createdAt &&
                creditCardType == other.creditCardType &&
                currencyCode == other.currencyCode &&
                currencyDecimalPlaces == other.currencyDecimalPlaces &&
                currencyId == other.currencyId &&
                currencyName == other.currencyName &&
                currencySymbol == other.currencySymbol &&
                currentBalance == other.currentBalance &&
                currentBalanceDate == other.currentBalanceDate &&
                debtAmount == other.debtAmount &&
                iban == other.iban &&
                includeNetWorth == other.includeNetWorth &&
                interest == other.interest &&
                interestPeriod == other.interestPeriod &&
                lastActivity == other.lastActivity &&
                latitude == other.latitude &&
                liabilityDirection == other.liabilityDirection &&
                liabilityType == other.liabilityType &&
                longitude == other.longitude &&
                monthlyPaymentDate == other.monthlyPaymentDate &&
                notes == other.notes &&
                objectGroupId == other.objectGroupId &&
                objectGroupOrder == other.objectGroupOrder &&
                objectGroupTitle == other.objectGroupTitle &&
                objectHasCurrencySetting == other.objectHasCurrencySetting &&
                openingBalance == other.openingBalance &&
                openingBalanceDate == other.openingBalanceDate &&
                order == other.order &&
                pcBalanceDifference == other.pcBalanceDifference &&
                pcCurrentBalance == other.pcCurrentBalance &&
                pcDebtAmount == other.pcDebtAmount &&
                pcOpeningBalance == other.pcOpeningBalance &&
                pcVirtualBalance == other.pcVirtualBalance &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencyName == other.primaryCurrencyName &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                updatedAt == other.updatedAt &&
                virtualBalance == other.virtualBalance &&
                zoomLevel == other.zoomLevel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                type,
                accountNumber,
                accountRole,
                active,
                balanceDifference,
                bic,
                createdAt,
                creditCardType,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                currentBalance,
                currentBalanceDate,
                debtAmount,
                iban,
                includeNetWorth,
                interest,
                interestPeriod,
                lastActivity,
                latitude,
                liabilityDirection,
                liabilityType,
                longitude,
                monthlyPaymentDate,
                notes,
                objectGroupId,
                objectGroupOrder,
                objectGroupTitle,
                objectHasCurrencySetting,
                openingBalance,
                openingBalanceDate,
                order,
                pcBalanceDifference,
                pcCurrentBalance,
                pcDebtAmount,
                pcOpeningBalance,
                pcVirtualBalance,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                updatedAt,
                virtualBalance,
                zoomLevel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{name=$name, type=$type, accountNumber=$accountNumber, accountRole=$accountRole, active=$active, balanceDifference=$balanceDifference, bic=$bic, createdAt=$createdAt, creditCardType=$creditCardType, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, currentBalance=$currentBalance, currentBalanceDate=$currentBalanceDate, debtAmount=$debtAmount, iban=$iban, includeNetWorth=$includeNetWorth, interest=$interest, interestPeriod=$interestPeriod, lastActivity=$lastActivity, latitude=$latitude, liabilityDirection=$liabilityDirection, liabilityType=$liabilityType, longitude=$longitude, monthlyPaymentDate=$monthlyPaymentDate, notes=$notes, objectGroupId=$objectGroupId, objectGroupOrder=$objectGroupOrder, objectGroupTitle=$objectGroupTitle, objectHasCurrencySetting=$objectHasCurrencySetting, openingBalance=$openingBalance, openingBalanceDate=$openingBalanceDate, order=$order, pcBalanceDifference=$pcBalanceDifference, pcCurrentBalance=$pcCurrentBalance, pcDebtAmount=$pcDebtAmount, pcOpeningBalance=$pcOpeningBalance, pcVirtualBalance=$pcVirtualBalance, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, updatedAt=$updatedAt, virtualBalance=$virtualBalance, zoomLevel=$zoomLevel, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountRead &&
            id == other.id &&
            attributes == other.attributes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, attributes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountRead{id=$id, attributes=$attributes, type=$type, additionalProperties=$additionalProperties}"
}
