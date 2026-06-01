// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.checkRequired
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

class AutocompleteListAccountsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val currencyCode: JsonField<String>,
    private val currencyDecimalPlaces: JsonField<Int>,
    private val currencyId: JsonField<String>,
    private val currencyName: JsonField<String>,
    private val currencySymbol: JsonField<String>,
    private val name: JsonField<String>,
    private val nameWithBalance: JsonField<String>,
    private val type: JsonField<String>,
    private val accountCurrencyCode: JsonField<String>,
    private val accountCurrencyDecimalPlaces: JsonField<Int>,
    private val accountCurrencyId: JsonField<String>,
    private val accountCurrencyName: JsonField<String>,
    private val accountCurrencySymbol: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name_with_balance")
        @ExcludeMissing
        nameWithBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_currency_code")
        @ExcludeMissing
        accountCurrencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_currency_decimal_places")
        @ExcludeMissing
        accountCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("account_currency_id")
        @ExcludeMissing
        accountCurrencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_currency_name")
        @ExcludeMissing
        accountCurrencyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_currency_symbol")
        @ExcludeMissing
        accountCurrencySymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        currencyCode,
        currencyDecimalPlaces,
        currencyId,
        currencyName,
        currencySymbol,
        name,
        nameWithBalance,
        type,
        accountCurrencyCode,
        accountCurrencyDecimalPlaces,
        accountCurrencyId,
        accountCurrencyName,
        accountCurrencySymbol,
        active,
        mutableMapOf(),
    )

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Currency code for the currency used by this account. If the user prefers amounts converted to
     * their primary currency, this primary currency is used instead.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyCode(): String = currencyCode.getRequired("currency_code")

    /**
     * Number of decimal places for the currency used by this account. If the user prefers amounts
     * converted to their primary currency, this primary currency is used instead.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyDecimalPlaces(): Int = currencyDecimalPlaces.getRequired("currency_decimal_places")

    /**
     * ID for the currency used by this account. If the user prefers amounts converted to their
     * primary currency, this primary currency is used instead.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyId(): String = currencyId.getRequired("currency_id")

    /**
     * Currency name for the currency used by this account. If the user prefers amounts converted to
     * their primary currency, this primary currency is used instead.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyName(): String = currencyName.getRequired("currency_name")

    /**
     * Currency symbol for the currency used by this account. If the user prefers amounts converted
     * to their primary currency, this primary currency is used instead.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencySymbol(): String = currencySymbol.getRequired("currency_symbol")

    /**
     * Name of the account found by an auto-complete search.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Asset accounts and liabilities have a second field with the given date's account balance in
     * the account currency or primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nameWithBalance(): String = nameWithBalance.getRequired("name_with_balance")

    /**
     * Account type of the account found by the auto-complete search.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Code for the currency used by this account. Even if "convertToPrimary" is on, the account
     * currency code is displayed here.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountCurrencyCode(): String? = accountCurrencyCode.getNullable("account_currency_code")

    /**
     * Number of decimal places for the currency used by this account. Even if "convertToPrimary" is
     * on, the account currency code is displayed here.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountCurrencyDecimalPlaces(): Int? =
        accountCurrencyDecimalPlaces.getNullable("account_currency_decimal_places")

    /**
     * ID for the currency used by this account. Even if "convertToPrimary" is on, the account
     * currency ID is displayed here.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountCurrencyId(): String? = accountCurrencyId.getNullable("account_currency_id")

    /**
     * Name for the currency used by this account. Even if "convertToPrimary" is on, the account
     * currency name is displayed here.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountCurrencyName(): String? = accountCurrencyName.getNullable("account_currency_name")

    /**
     * Code for the currency used by this account. Even if "convertToPrimary" is on, the account
     * currency code is displayed here.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountCurrencySymbol(): String? =
        accountCurrencySymbol.getNullable("account_currency_symbol")

    /**
     * Is the bill active or not?
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Boolean? = active.getNullable("active")

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
     * Returns the raw JSON value of [currencyName].
     *
     * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_name")
    @ExcludeMissing
    fun _currencyName(): JsonField<String> = currencyName

    /**
     * Returns the raw JSON value of [currencySymbol].
     *
     * Unlike [currencySymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_symbol")
    @ExcludeMissing
    fun _currencySymbol(): JsonField<String> = currencySymbol

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nameWithBalance].
     *
     * Unlike [nameWithBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name_with_balance")
    @ExcludeMissing
    fun _nameWithBalance(): JsonField<String> = nameWithBalance

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [accountCurrencyCode].
     *
     * Unlike [accountCurrencyCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_currency_code")
    @ExcludeMissing
    fun _accountCurrencyCode(): JsonField<String> = accountCurrencyCode

    /**
     * Returns the raw JSON value of [accountCurrencyDecimalPlaces].
     *
     * Unlike [accountCurrencyDecimalPlaces], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("account_currency_decimal_places")
    @ExcludeMissing
    fun _accountCurrencyDecimalPlaces(): JsonField<Int> = accountCurrencyDecimalPlaces

    /**
     * Returns the raw JSON value of [accountCurrencyId].
     *
     * Unlike [accountCurrencyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_currency_id")
    @ExcludeMissing
    fun _accountCurrencyId(): JsonField<String> = accountCurrencyId

    /**
     * Returns the raw JSON value of [accountCurrencyName].
     *
     * Unlike [accountCurrencyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_currency_name")
    @ExcludeMissing
    fun _accountCurrencyName(): JsonField<String> = accountCurrencyName

    /**
     * Returns the raw JSON value of [accountCurrencySymbol].
     *
     * Unlike [accountCurrencySymbol], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_currency_symbol")
    @ExcludeMissing
    fun _accountCurrencySymbol(): JsonField<String> = accountCurrencySymbol

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

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
         * [AutocompleteListAccountsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .currencyCode()
         * .currencyDecimalPlaces()
         * .currencyId()
         * .currencyName()
         * .currencySymbol()
         * .name()
         * .nameWithBalance()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AutocompleteListAccountsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var currencyCode: JsonField<String>? = null
        private var currencyDecimalPlaces: JsonField<Int>? = null
        private var currencyId: JsonField<String>? = null
        private var currencyName: JsonField<String>? = null
        private var currencySymbol: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var nameWithBalance: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var accountCurrencyCode: JsonField<String> = JsonMissing.of()
        private var accountCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
        private var accountCurrencyId: JsonField<String> = JsonMissing.of()
        private var accountCurrencyName: JsonField<String> = JsonMissing.of()
        private var accountCurrencySymbol: JsonField<String> = JsonMissing.of()
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(autocompleteListAccountsResponse: AutocompleteListAccountsResponse) =
            apply {
                id = autocompleteListAccountsResponse.id
                currencyCode = autocompleteListAccountsResponse.currencyCode
                currencyDecimalPlaces = autocompleteListAccountsResponse.currencyDecimalPlaces
                currencyId = autocompleteListAccountsResponse.currencyId
                currencyName = autocompleteListAccountsResponse.currencyName
                currencySymbol = autocompleteListAccountsResponse.currencySymbol
                name = autocompleteListAccountsResponse.name
                nameWithBalance = autocompleteListAccountsResponse.nameWithBalance
                type = autocompleteListAccountsResponse.type
                accountCurrencyCode = autocompleteListAccountsResponse.accountCurrencyCode
                accountCurrencyDecimalPlaces =
                    autocompleteListAccountsResponse.accountCurrencyDecimalPlaces
                accountCurrencyId = autocompleteListAccountsResponse.accountCurrencyId
                accountCurrencyName = autocompleteListAccountsResponse.accountCurrencyName
                accountCurrencySymbol = autocompleteListAccountsResponse.accountCurrencySymbol
                active = autocompleteListAccountsResponse.active
                additionalProperties =
                    autocompleteListAccountsResponse.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Currency code for the currency used by this account. If the user prefers amounts
         * converted to their primary currency, this primary currency is used instead.
         */
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

        /**
         * Number of decimal places for the currency used by this account. If the user prefers
         * amounts converted to their primary currency, this primary currency is used instead.
         */
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

        /**
         * ID for the currency used by this account. If the user prefers amounts converted to their
         * primary currency, this primary currency is used instead.
         */
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
         * Currency name for the currency used by this account. If the user prefers amounts
         * converted to their primary currency, this primary currency is used instead.
         */
        fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

        /**
         * Sets [Builder.currencyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyName(currencyName: JsonField<String>) = apply {
            this.currencyName = currencyName
        }

        /**
         * Currency symbol for the currency used by this account. If the user prefers amounts
         * converted to their primary currency, this primary currency is used instead.
         */
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

        /** Name of the account found by an auto-complete search. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Asset accounts and liabilities have a second field with the given date's account balance
         * in the account currency or primary currency.
         */
        fun nameWithBalance(nameWithBalance: String) =
            nameWithBalance(JsonField.of(nameWithBalance))

        /**
         * Sets [Builder.nameWithBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nameWithBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nameWithBalance(nameWithBalance: JsonField<String>) = apply {
            this.nameWithBalance = nameWithBalance
        }

        /** Account type of the account found by the auto-complete search. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Code for the currency used by this account. Even if "convertToPrimary" is on, the account
         * currency code is displayed here.
         */
        fun accountCurrencyCode(accountCurrencyCode: String) =
            accountCurrencyCode(JsonField.of(accountCurrencyCode))

        /**
         * Sets [Builder.accountCurrencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountCurrencyCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountCurrencyCode(accountCurrencyCode: JsonField<String>) = apply {
            this.accountCurrencyCode = accountCurrencyCode
        }

        /**
         * Number of decimal places for the currency used by this account. Even if
         * "convertToPrimary" is on, the account currency code is displayed here.
         */
        fun accountCurrencyDecimalPlaces(accountCurrencyDecimalPlaces: Int) =
            accountCurrencyDecimalPlaces(JsonField.of(accountCurrencyDecimalPlaces))

        /**
         * Sets [Builder.accountCurrencyDecimalPlaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountCurrencyDecimalPlaces] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountCurrencyDecimalPlaces(accountCurrencyDecimalPlaces: JsonField<Int>) = apply {
            this.accountCurrencyDecimalPlaces = accountCurrencyDecimalPlaces
        }

        /**
         * ID for the currency used by this account. Even if "convertToPrimary" is on, the account
         * currency ID is displayed here.
         */
        fun accountCurrencyId(accountCurrencyId: String) =
            accountCurrencyId(JsonField.of(accountCurrencyId))

        /**
         * Sets [Builder.accountCurrencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountCurrencyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountCurrencyId(accountCurrencyId: JsonField<String>) = apply {
            this.accountCurrencyId = accountCurrencyId
        }

        /**
         * Name for the currency used by this account. Even if "convertToPrimary" is on, the account
         * currency name is displayed here.
         */
        fun accountCurrencyName(accountCurrencyName: String) =
            accountCurrencyName(JsonField.of(accountCurrencyName))

        /**
         * Sets [Builder.accountCurrencyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountCurrencyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountCurrencyName(accountCurrencyName: JsonField<String>) = apply {
            this.accountCurrencyName = accountCurrencyName
        }

        /**
         * Code for the currency used by this account. Even if "convertToPrimary" is on, the account
         * currency code is displayed here.
         */
        fun accountCurrencySymbol(accountCurrencySymbol: String) =
            accountCurrencySymbol(JsonField.of(accountCurrencySymbol))

        /**
         * Sets [Builder.accountCurrencySymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountCurrencySymbol] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountCurrencySymbol(accountCurrencySymbol: JsonField<String>) = apply {
            this.accountCurrencySymbol = accountCurrencySymbol
        }

        /** Is the bill active or not? */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

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
         * Returns an immutable instance of [AutocompleteListAccountsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .currencyCode()
         * .currencyDecimalPlaces()
         * .currencyId()
         * .currencyName()
         * .currencySymbol()
         * .name()
         * .nameWithBalance()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AutocompleteListAccountsResponse =
            AutocompleteListAccountsResponse(
                checkRequired("id", id),
                checkRequired("currencyCode", currencyCode),
                checkRequired("currencyDecimalPlaces", currencyDecimalPlaces),
                checkRequired("currencyId", currencyId),
                checkRequired("currencyName", currencyName),
                checkRequired("currencySymbol", currencySymbol),
                checkRequired("name", name),
                checkRequired("nameWithBalance", nameWithBalance),
                checkRequired("type", type),
                accountCurrencyCode,
                accountCurrencyDecimalPlaces,
                accountCurrencyId,
                accountCurrencyName,
                accountCurrencySymbol,
                active,
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
    fun validate(): AutocompleteListAccountsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        currencyCode()
        currencyDecimalPlaces()
        currencyId()
        currencyName()
        currencySymbol()
        name()
        nameWithBalance()
        type()
        accountCurrencyCode()
        accountCurrencyDecimalPlaces()
        accountCurrencyId()
        accountCurrencyName()
        accountCurrencySymbol()
        active()
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
            (if (currencyCode.asKnown() == null) 0 else 1) +
            (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
            (if (currencyId.asKnown() == null) 0 else 1) +
            (if (currencyName.asKnown() == null) 0 else 1) +
            (if (currencySymbol.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (nameWithBalance.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (accountCurrencyCode.asKnown() == null) 0 else 1) +
            (if (accountCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
            (if (accountCurrencyId.asKnown() == null) 0 else 1) +
            (if (accountCurrencyName.asKnown() == null) 0 else 1) +
            (if (accountCurrencySymbol.asKnown() == null) 0 else 1) +
            (if (active.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutocompleteListAccountsResponse &&
            id == other.id &&
            currencyCode == other.currencyCode &&
            currencyDecimalPlaces == other.currencyDecimalPlaces &&
            currencyId == other.currencyId &&
            currencyName == other.currencyName &&
            currencySymbol == other.currencySymbol &&
            name == other.name &&
            nameWithBalance == other.nameWithBalance &&
            type == other.type &&
            accountCurrencyCode == other.accountCurrencyCode &&
            accountCurrencyDecimalPlaces == other.accountCurrencyDecimalPlaces &&
            accountCurrencyId == other.accountCurrencyId &&
            accountCurrencyName == other.accountCurrencyName &&
            accountCurrencySymbol == other.accountCurrencySymbol &&
            active == other.active &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            name,
            nameWithBalance,
            type,
            accountCurrencyCode,
            accountCurrencyDecimalPlaces,
            accountCurrencyId,
            accountCurrencyName,
            accountCurrencySymbol,
            active,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutocompleteListAccountsResponse{id=$id, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, name=$name, nameWithBalance=$nameWithBalance, type=$type, accountCurrencyCode=$accountCurrencyCode, accountCurrencyDecimalPlaces=$accountCurrencyDecimalPlaces, accountCurrencyId=$accountCurrencyId, accountCurrencyName=$accountCurrencyName, accountCurrencySymbol=$accountCurrencySymbol, active=$active, additionalProperties=$additionalProperties}"
}
