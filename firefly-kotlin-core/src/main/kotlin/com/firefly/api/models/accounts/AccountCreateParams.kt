// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.checkRequired
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.errors.FireflyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Creates a new account. The data required can be submitted as a JSON body or as a list of
 * parameters (in key=value pairs, like a webform).
 */
class AccountCreateParams
private constructor(
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xTraceId(): String? = xTraceId

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Can only be one one these account types. import, initial-balance and reconciliation cannot be
     * set manually.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): ShortAccountTypeProperty = body.type()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): String? = body.accountNumber()

    /**
     * Is only mandatory when the type is asset.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountRole(): AccountRoleProperty? = body.accountRole()

    /**
     * If omitted, defaults to true.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Boolean? = body.active()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bic(): String? = body.bic()

    /**
     * Mandatory when the account_role is ccAsset. Can only be monthlyFull or null.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditCardType(): CreditCardTypeProperty? = body.creditCardType()

    /**
     * Use either currency_id or currency_code. Defaults to the user's financial administration's
     * currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyCode(): String? = body.currencyCode()

    /**
     * Use either currency_id or currency_code. Defaults to the user's financial administration's
     * currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): String? = body.currencyId()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun iban(): String? = body.iban()

    /**
     * If omitted, defaults to true.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeNetWorth(): Boolean? = body.includeNetWorth()

    /**
     * Mandatory when type is liability. Interest percentage.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interest(): String? = body.interest()

    /**
     * Mandatory when type is liability. Period over which the interest is calculated.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestPeriod(): InterestPeriodProperty? = body.interestPeriod()

    /**
     * Latitude of the accounts's location, if applicable. Can be used to draw a map.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latitude(): Double? = body.latitude()

    /**
     * 'credit' indicates somebody owes you the liability. 'debit' Indicates you owe this debt
     * yourself. Works only for liabilities.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun liabilityDirection(): LiabilityDirectionProperty? = body.liabilityDirection()

    /**
     * Mandatory when type is liability. Specifies the exact type.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun liabilityType(): LiabilityTypeProperty? = body.liabilityType()

    /**
     * Latitude of the accounts's location, if applicable. Can be used to draw a map.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longitude(): Double? = body.longitude()

    /**
     * Mandatory when the account_role is ccAsset. Moment at which CC payment installments are asked
     * for by the bank.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthlyPaymentDate(): OffsetDateTime? = body.monthlyPaymentDate()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): String? = body.notes()

    /**
     * Represents the opening balance, the initial amount this account holds.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openingBalance(): String? = body.openingBalance()

    /**
     * Represents the date of the opening balance.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openingBalanceDate(): OffsetDateTime? = body.openingBalanceDate()

    /**
     * Order of the account
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Int? = body.order()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun virtualBalance(): String? = body.virtualBalance()

    /**
     * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
     * proprietary value because each map provider has different zoom levels.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zoomLevel(): Int? = body.zoomLevel()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<ShortAccountTypeProperty> = body._type()

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [accountRole].
     *
     * Unlike [accountRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountRole(): JsonField<AccountRoleProperty> = body._accountRole()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [bic].
     *
     * Unlike [bic], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bic(): JsonField<String> = body._bic()

    /**
     * Returns the raw JSON value of [creditCardType].
     *
     * Unlike [creditCardType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditCardType(): JsonField<CreditCardTypeProperty> = body._creditCardType()

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyCode(): JsonField<String> = body._currencyCode()

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyId(): JsonField<String> = body._currencyId()

    /**
     * Returns the raw JSON value of [iban].
     *
     * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _iban(): JsonField<String> = body._iban()

    /**
     * Returns the raw JSON value of [includeNetWorth].
     *
     * Unlike [includeNetWorth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeNetWorth(): JsonField<Boolean> = body._includeNetWorth()

    /**
     * Returns the raw JSON value of [interest].
     *
     * Unlike [interest], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _interest(): JsonField<String> = body._interest()

    /**
     * Returns the raw JSON value of [interestPeriod].
     *
     * Unlike [interestPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _interestPeriod(): JsonField<InterestPeriodProperty> = body._interestPeriod()

    /**
     * Returns the raw JSON value of [latitude].
     *
     * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _latitude(): JsonField<Double> = body._latitude()

    /**
     * Returns the raw JSON value of [liabilityDirection].
     *
     * Unlike [liabilityDirection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _liabilityDirection(): JsonField<LiabilityDirectionProperty> = body._liabilityDirection()

    /**
     * Returns the raw JSON value of [liabilityType].
     *
     * Unlike [liabilityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _liabilityType(): JsonField<LiabilityTypeProperty> = body._liabilityType()

    /**
     * Returns the raw JSON value of [longitude].
     *
     * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _longitude(): JsonField<Double> = body._longitude()

    /**
     * Returns the raw JSON value of [monthlyPaymentDate].
     *
     * Unlike [monthlyPaymentDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _monthlyPaymentDate(): JsonField<OffsetDateTime> = body._monthlyPaymentDate()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

    /**
     * Returns the raw JSON value of [openingBalance].
     *
     * Unlike [openingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _openingBalance(): JsonField<String> = body._openingBalance()

    /**
     * Returns the raw JSON value of [openingBalanceDate].
     *
     * Unlike [openingBalanceDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _openingBalanceDate(): JsonField<OffsetDateTime> = body._openingBalanceDate()

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _order(): JsonField<Int> = body._order()

    /**
     * Returns the raw JSON value of [virtualBalance].
     *
     * Unlike [virtualBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _virtualBalance(): JsonField<String> = body._virtualBalance()

    /**
     * Returns the raw JSON value of [zoomLevel].
     *
     * Unlike [zoomLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _zoomLevel(): JsonField<Int> = body._zoomLevel()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountCreateParams]. */
    class Builder internal constructor() {

        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(accountCreateParams: AccountCreateParams) = apply {
            xTraceId = accountCreateParams.xTraceId
            body = accountCreateParams.body.toBuilder()
            additionalHeaders = accountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountCreateParams.additionalQueryParams.toBuilder()
        }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [type]
         * - [accountNumber]
         * - [accountRole]
         * - [active]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Can only be one one these account types. import, initial-balance and reconciliation
         * cannot be set manually.
         */
        fun type(type: ShortAccountTypeProperty) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [ShortAccountTypeProperty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<ShortAccountTypeProperty>) = apply { body.type(type) }

        fun accountNumber(accountNumber: String?) = apply { body.accountNumber(accountNumber) }

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            body.accountNumber(accountNumber)
        }

        /** Is only mandatory when the type is asset. */
        fun accountRole(accountRole: AccountRoleProperty?) = apply { body.accountRole(accountRole) }

        /**
         * Sets [Builder.accountRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountRole] with a well-typed [AccountRoleProperty]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountRole(accountRole: JsonField<AccountRoleProperty>) = apply {
            body.accountRole(accountRole)
        }

        /** If omitted, defaults to true. */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        fun bic(bic: String?) = apply { body.bic(bic) }

        /**
         * Sets [Builder.bic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bic] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bic(bic: JsonField<String>) = apply { body.bic(bic) }

        /** Mandatory when the account_role is ccAsset. Can only be monthlyFull or null. */
        fun creditCardType(creditCardType: CreditCardTypeProperty?) = apply {
            body.creditCardType(creditCardType)
        }

        /**
         * Sets [Builder.creditCardType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditCardType] with a well-typed
         * [CreditCardTypeProperty] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun creditCardType(creditCardType: JsonField<CreditCardTypeProperty>) = apply {
            body.creditCardType(creditCardType)
        }

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         */
        fun currencyCode(currencyCode: String) = apply { body.currencyCode(currencyCode) }

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyCode(currencyCode: JsonField<String>) = apply {
            body.currencyCode(currencyCode)
        }

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         */
        fun currencyId(currencyId: String) = apply { body.currencyId(currencyId) }

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { body.currencyId(currencyId) }

        fun iban(iban: String?) = apply { body.iban(iban) }

        /**
         * Sets [Builder.iban] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iban] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iban(iban: JsonField<String>) = apply { body.iban(iban) }

        /** If omitted, defaults to true. */
        fun includeNetWorth(includeNetWorth: Boolean) = apply {
            body.includeNetWorth(includeNetWorth)
        }

        /**
         * Sets [Builder.includeNetWorth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeNetWorth] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeNetWorth(includeNetWorth: JsonField<Boolean>) = apply {
            body.includeNetWorth(includeNetWorth)
        }

        /** Mandatory when type is liability. Interest percentage. */
        fun interest(interest: String?) = apply { body.interest(interest) }

        /**
         * Sets [Builder.interest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interest] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun interest(interest: JsonField<String>) = apply { body.interest(interest) }

        /** Mandatory when type is liability. Period over which the interest is calculated. */
        fun interestPeriod(interestPeriod: InterestPeriodProperty?) = apply {
            body.interestPeriod(interestPeriod)
        }

        /**
         * Sets [Builder.interestPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestPeriod] with a well-typed
         * [InterestPeriodProperty] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun interestPeriod(interestPeriod: JsonField<InterestPeriodProperty>) = apply {
            body.interestPeriod(interestPeriod)
        }

        /** Latitude of the accounts's location, if applicable. Can be used to draw a map. */
        fun latitude(latitude: Double?) = apply { body.latitude(latitude) }

        /**
         * Alias for [Builder.latitude].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latitude(latitude: Double) = latitude(latitude as Double?)

        /**
         * Sets [Builder.latitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latitude(latitude: JsonField<Double>) = apply { body.latitude(latitude) }

        /**
         * 'credit' indicates somebody owes you the liability. 'debit' Indicates you owe this debt
         * yourself. Works only for liabilities.
         */
        fun liabilityDirection(liabilityDirection: LiabilityDirectionProperty?) = apply {
            body.liabilityDirection(liabilityDirection)
        }

        /**
         * Sets [Builder.liabilityDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liabilityDirection] with a well-typed
         * [LiabilityDirectionProperty] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun liabilityDirection(liabilityDirection: JsonField<LiabilityDirectionProperty>) = apply {
            body.liabilityDirection(liabilityDirection)
        }

        /** Mandatory when type is liability. Specifies the exact type. */
        fun liabilityType(liabilityType: LiabilityTypeProperty?) = apply {
            body.liabilityType(liabilityType)
        }

        /**
         * Sets [Builder.liabilityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liabilityType] with a well-typed [LiabilityTypeProperty]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun liabilityType(liabilityType: JsonField<LiabilityTypeProperty>) = apply {
            body.liabilityType(liabilityType)
        }

        /** Latitude of the accounts's location, if applicable. Can be used to draw a map. */
        fun longitude(longitude: Double?) = apply { body.longitude(longitude) }

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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitude(longitude: JsonField<Double>) = apply { body.longitude(longitude) }

        /**
         * Mandatory when the account_role is ccAsset. Moment at which CC payment installments are
         * asked for by the bank.
         */
        fun monthlyPaymentDate(monthlyPaymentDate: OffsetDateTime?) = apply {
            body.monthlyPaymentDate(monthlyPaymentDate)
        }

        /**
         * Sets [Builder.monthlyPaymentDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthlyPaymentDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun monthlyPaymentDate(monthlyPaymentDate: JsonField<OffsetDateTime>) = apply {
            body.monthlyPaymentDate(monthlyPaymentDate)
        }

        fun notes(notes: String?) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        /** Represents the opening balance, the initial amount this account holds. */
        fun openingBalance(openingBalance: String) = apply { body.openingBalance(openingBalance) }

        /**
         * Sets [Builder.openingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openingBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openingBalance(openingBalance: JsonField<String>) = apply {
            body.openingBalance(openingBalance)
        }

        /** Represents the date of the opening balance. */
        fun openingBalanceDate(openingBalanceDate: OffsetDateTime?) = apply {
            body.openingBalanceDate(openingBalanceDate)
        }

        /**
         * Sets [Builder.openingBalanceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openingBalanceDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun openingBalanceDate(openingBalanceDate: JsonField<OffsetDateTime>) = apply {
            body.openingBalanceDate(openingBalanceDate)
        }

        /** Order of the account */
        fun order(order: Int) = apply { body.order(order) }

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Int>) = apply { body.order(order) }

        fun virtualBalance(virtualBalance: String) = apply { body.virtualBalance(virtualBalance) }

        /**
         * Sets [Builder.virtualBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.virtualBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun virtualBalance(virtualBalance: JsonField<String>) = apply {
            body.virtualBalance(virtualBalance)
        }

        /**
         * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
         * proprietary value because each map provider has different zoom levels.
         */
        fun zoomLevel(zoomLevel: Int?) = apply { body.zoomLevel(zoomLevel) }

        /**
         * Alias for [Builder.zoomLevel].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun zoomLevel(zoomLevel: Int) = zoomLevel(zoomLevel as Int?)

        /**
         * Sets [Builder.zoomLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoomLevel] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoomLevel(zoomLevel: JsonField<Int>) = apply { body.zoomLevel(zoomLevel) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AccountCreateParams].
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
        fun build(): AccountCreateParams =
            AccountCreateParams(
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xTraceId?.let { put("X-Trace-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val type: JsonField<ShortAccountTypeProperty>,
        private val accountNumber: JsonField<String>,
        private val accountRole: JsonField<AccountRoleProperty>,
        private val active: JsonField<Boolean>,
        private val bic: JsonField<String>,
        private val creditCardType: JsonField<CreditCardTypeProperty>,
        private val currencyCode: JsonField<String>,
        private val currencyId: JsonField<String>,
        private val iban: JsonField<String>,
        private val includeNetWorth: JsonField<Boolean>,
        private val interest: JsonField<String>,
        private val interestPeriod: JsonField<InterestPeriodProperty>,
        private val latitude: JsonField<Double>,
        private val liabilityDirection: JsonField<LiabilityDirectionProperty>,
        private val liabilityType: JsonField<LiabilityTypeProperty>,
        private val longitude: JsonField<Double>,
        private val monthlyPaymentDate: JsonField<OffsetDateTime>,
        private val notes: JsonField<String>,
        private val openingBalance: JsonField<String>,
        private val openingBalanceDate: JsonField<OffsetDateTime>,
        private val order: JsonField<Int>,
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
            @JsonProperty("bic") @ExcludeMissing bic: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_card_type")
            @ExcludeMissing
            creditCardType: JsonField<CreditCardTypeProperty> = JsonMissing.of(),
            @JsonProperty("currency_code")
            @ExcludeMissing
            currencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_id")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("opening_balance")
            @ExcludeMissing
            openingBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("opening_balance_date")
            @ExcludeMissing
            openingBalanceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
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
            bic,
            creditCardType,
            currencyCode,
            currencyId,
            iban,
            includeNetWorth,
            interest,
            interestPeriod,
            latitude,
            liabilityDirection,
            liabilityType,
            longitude,
            monthlyPaymentDate,
            notes,
            openingBalance,
            openingBalanceDate,
            order,
            virtualBalance,
            zoomLevel,
            mutableMapOf(),
        )

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Can only be one one these account types. import, initial-balance and reconciliation
         * cannot be set manually.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): ShortAccountTypeProperty = type.getRequired("type")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /**
         * Is only mandatory when the type is asset.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountRole(): AccountRoleProperty? = accountRole.getNullable("account_role")

        /**
         * If omitted, defaults to true.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bic(): String? = bic.getNullable("bic")

        /**
         * Mandatory when the account_role is ccAsset. Can only be monthlyFull or null.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditCardType(): CreditCardTypeProperty? =
            creditCardType.getNullable("credit_card_type")

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun iban(): String? = iban.getNullable("iban")

        /**
         * If omitted, defaults to true.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeNetWorth(): Boolean? = includeNetWorth.getNullable("include_net_worth")

        /**
         * Mandatory when type is liability. Interest percentage.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interest(): String? = interest.getNullable("interest")

        /**
         * Mandatory when type is liability. Period over which the interest is calculated.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interestPeriod(): InterestPeriodProperty? =
            interestPeriod.getNullable("interest_period")

        /**
         * Latitude of the accounts's location, if applicable. Can be used to draw a map.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latitude(): Double? = latitude.getNullable("latitude")

        /**
         * 'credit' indicates somebody owes you the liability. 'debit' Indicates you owe this debt
         * yourself. Works only for liabilities.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun liabilityDirection(): LiabilityDirectionProperty? =
            liabilityDirection.getNullable("liability_direction")

        /**
         * Mandatory when type is liability. Specifies the exact type.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun liabilityType(): LiabilityTypeProperty? = liabilityType.getNullable("liability_type")

        /**
         * Latitude of the accounts's location, if applicable. Can be used to draw a map.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun longitude(): Double? = longitude.getNullable("longitude")

        /**
         * Mandatory when the account_role is ccAsset. Moment at which CC payment installments are
         * asked for by the bank.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthlyPaymentDate(): OffsetDateTime? =
            monthlyPaymentDate.getNullable("monthly_payment_date")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * Represents the opening balance, the initial amount this account holds.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun openingBalance(): String? = openingBalance.getNullable("opening_balance")

        /**
         * Represents the date of the opening balance.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun openingBalanceDate(): OffsetDateTime? =
            openingBalanceDate.getNullable("opening_balance_date")

        /**
         * Order of the account
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun virtualBalance(): String? = virtualBalance.getNullable("virtual_balance")

        /**
         * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
         * proprietary value because each map provider has different zoom levels.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         * Returns the raw JSON value of [bic].
         *
         * Unlike [bic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bic") @ExcludeMissing fun _bic(): JsonField<String> = bic

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
         * Returns the raw JSON value of [currencyId].
         *
         * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency_id")
        @ExcludeMissing
        fun _currencyId(): JsonField<String> = currencyId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var type: JsonField<ShortAccountTypeProperty>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var accountRole: JsonField<AccountRoleProperty> = JsonMissing.of()
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var bic: JsonField<String> = JsonMissing.of()
            private var creditCardType: JsonField<CreditCardTypeProperty> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var iban: JsonField<String> = JsonMissing.of()
            private var includeNetWorth: JsonField<Boolean> = JsonMissing.of()
            private var interest: JsonField<String> = JsonMissing.of()
            private var interestPeriod: JsonField<InterestPeriodProperty> = JsonMissing.of()
            private var latitude: JsonField<Double> = JsonMissing.of()
            private var liabilityDirection: JsonField<LiabilityDirectionProperty> = JsonMissing.of()
            private var liabilityType: JsonField<LiabilityTypeProperty> = JsonMissing.of()
            private var longitude: JsonField<Double> = JsonMissing.of()
            private var monthlyPaymentDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var openingBalance: JsonField<String> = JsonMissing.of()
            private var openingBalanceDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var virtualBalance: JsonField<String> = JsonMissing.of()
            private var zoomLevel: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                name = body.name
                type = body.type
                accountNumber = body.accountNumber
                accountRole = body.accountRole
                active = body.active
                bic = body.bic
                creditCardType = body.creditCardType
                currencyCode = body.currencyCode
                currencyId = body.currencyId
                iban = body.iban
                includeNetWorth = body.includeNetWorth
                interest = body.interest
                interestPeriod = body.interestPeriod
                latitude = body.latitude
                liabilityDirection = body.liabilityDirection
                liabilityType = body.liabilityType
                longitude = body.longitude
                monthlyPaymentDate = body.monthlyPaymentDate
                notes = body.notes
                openingBalance = body.openingBalance
                openingBalanceDate = body.openingBalanceDate
                order = body.order
                virtualBalance = body.virtualBalance
                zoomLevel = body.zoomLevel
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** If omitted, defaults to true. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun bic(bic: String?) = bic(JsonField.ofNullable(bic))

            /**
             * Sets [Builder.bic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bic] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bic(bic: JsonField<String>) = apply { this.bic = bic }

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

            /**
             * Use either currency_id or currency_code. Defaults to the user's financial
             * administration's currency.
             */
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

            /**
             * Use either currency_id or currency_code. Defaults to the user's financial
             * administration's currency.
             */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            fun iban(iban: String?) = iban(JsonField.ofNullable(iban))

            /**
             * Sets [Builder.iban] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iban] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iban(iban: JsonField<String>) = apply { this.iban = iban }

            /** If omitted, defaults to true. */
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

            /** Represents the opening balance, the initial amount this account holds. */
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

            /** Order of the account */
            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("type", type),
                    accountNumber,
                    accountRole,
                    active,
                    bic,
                    creditCardType,
                    currencyCode,
                    currencyId,
                    iban,
                    includeNetWorth,
                    interest,
                    interestPeriod,
                    latitude,
                    liabilityDirection,
                    liabilityType,
                    longitude,
                    monthlyPaymentDate,
                    notes,
                    openingBalance,
                    openingBalanceDate,
                    order,
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
         * @throws FireflyInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            type().validate()
            accountNumber()
            accountRole()?.validate()
            active()
            bic()
            creditCardType()?.validate()
            currencyCode()
            currencyId()
            iban()
            includeNetWorth()
            interest()
            interestPeriod()?.validate()
            latitude()
            liabilityDirection()?.validate()
            liabilityType()?.validate()
            longitude()
            monthlyPaymentDate()
            notes()
            openingBalance()
            openingBalanceDate()
            order()
            virtualBalance()
            zoomLevel()
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
            (if (name.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (accountNumber.asKnown() == null) 0 else 1) +
                (accountRole.asKnown()?.validity() ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (bic.asKnown() == null) 0 else 1) +
                (creditCardType.asKnown()?.validity() ?: 0) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (iban.asKnown() == null) 0 else 1) +
                (if (includeNetWorth.asKnown() == null) 0 else 1) +
                (if (interest.asKnown() == null) 0 else 1) +
                (interestPeriod.asKnown()?.validity() ?: 0) +
                (if (latitude.asKnown() == null) 0 else 1) +
                (liabilityDirection.asKnown()?.validity() ?: 0) +
                (liabilityType.asKnown()?.validity() ?: 0) +
                (if (longitude.asKnown() == null) 0 else 1) +
                (if (monthlyPaymentDate.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (openingBalance.asKnown() == null) 0 else 1) +
                (if (openingBalanceDate.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (virtualBalance.asKnown() == null) 0 else 1) +
                (if (zoomLevel.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                type == other.type &&
                accountNumber == other.accountNumber &&
                accountRole == other.accountRole &&
                active == other.active &&
                bic == other.bic &&
                creditCardType == other.creditCardType &&
                currencyCode == other.currencyCode &&
                currencyId == other.currencyId &&
                iban == other.iban &&
                includeNetWorth == other.includeNetWorth &&
                interest == other.interest &&
                interestPeriod == other.interestPeriod &&
                latitude == other.latitude &&
                liabilityDirection == other.liabilityDirection &&
                liabilityType == other.liabilityType &&
                longitude == other.longitude &&
                monthlyPaymentDate == other.monthlyPaymentDate &&
                notes == other.notes &&
                openingBalance == other.openingBalance &&
                openingBalanceDate == other.openingBalanceDate &&
                order == other.order &&
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
                bic,
                creditCardType,
                currencyCode,
                currencyId,
                iban,
                includeNetWorth,
                interest,
                interestPeriod,
                latitude,
                liabilityDirection,
                liabilityType,
                longitude,
                monthlyPaymentDate,
                notes,
                openingBalance,
                openingBalanceDate,
                order,
                virtualBalance,
                zoomLevel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, type=$type, accountNumber=$accountNumber, accountRole=$accountRole, active=$active, bic=$bic, creditCardType=$creditCardType, currencyCode=$currencyCode, currencyId=$currencyId, iban=$iban, includeNetWorth=$includeNetWorth, interest=$interest, interestPeriod=$interestPeriod, latitude=$latitude, liabilityDirection=$liabilityDirection, liabilityType=$liabilityType, longitude=$longitude, monthlyPaymentDate=$monthlyPaymentDate, notes=$notes, openingBalance=$openingBalance, openingBalanceDate=$openingBalanceDate, order=$order, virtualBalance=$virtualBalance, zoomLevel=$zoomLevel, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountCreateParams &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountCreateParams{xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
