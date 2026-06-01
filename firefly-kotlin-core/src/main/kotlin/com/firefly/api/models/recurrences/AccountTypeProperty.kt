// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.recurrences

import com.fasterxml.jackson.annotation.JsonCreator
import com.firefly.api.core.Enum
import com.firefly.api.core.JsonField
import com.firefly.api.errors.FireflyInvalidDataException

class AccountTypeProperty @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val DEFAULT_ACCOUNT = of("Default account")

        val CASH_ACCOUNT = of("Cash account")

        val ASSET_ACCOUNT = of("Asset account")

        val EXPENSE_ACCOUNT = of("Expense account")

        val REVENUE_ACCOUNT = of("Revenue account")

        val INITIAL_BALANCE_ACCOUNT = of("Initial balance account")

        val BENEFICIARY_ACCOUNT = of("Beneficiary account")

        val IMPORT_ACCOUNT = of("Import account")

        val RECONCILIATION_ACCOUNT = of("Reconciliation account")

        val LOAN = of("Loan")

        val DEBT = of("Debt")

        val MORTGAGE = of("Mortgage")

        fun of(value: String) = AccountTypeProperty(JsonField.of(value))
    }

    /** An enum containing [AccountTypeProperty]'s known values. */
    enum class Known {
        DEFAULT_ACCOUNT,
        CASH_ACCOUNT,
        ASSET_ACCOUNT,
        EXPENSE_ACCOUNT,
        REVENUE_ACCOUNT,
        INITIAL_BALANCE_ACCOUNT,
        BENEFICIARY_ACCOUNT,
        IMPORT_ACCOUNT,
        RECONCILIATION_ACCOUNT,
        LOAN,
        DEBT,
        MORTGAGE,
    }

    /**
     * An enum containing [AccountTypeProperty]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AccountTypeProperty] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DEFAULT_ACCOUNT,
        CASH_ACCOUNT,
        ASSET_ACCOUNT,
        EXPENSE_ACCOUNT,
        REVENUE_ACCOUNT,
        INITIAL_BALANCE_ACCOUNT,
        BENEFICIARY_ACCOUNT,
        IMPORT_ACCOUNT,
        RECONCILIATION_ACCOUNT,
        LOAN,
        DEBT,
        MORTGAGE,
        /**
         * An enum member indicating that [AccountTypeProperty] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            DEFAULT_ACCOUNT -> Value.DEFAULT_ACCOUNT
            CASH_ACCOUNT -> Value.CASH_ACCOUNT
            ASSET_ACCOUNT -> Value.ASSET_ACCOUNT
            EXPENSE_ACCOUNT -> Value.EXPENSE_ACCOUNT
            REVENUE_ACCOUNT -> Value.REVENUE_ACCOUNT
            INITIAL_BALANCE_ACCOUNT -> Value.INITIAL_BALANCE_ACCOUNT
            BENEFICIARY_ACCOUNT -> Value.BENEFICIARY_ACCOUNT
            IMPORT_ACCOUNT -> Value.IMPORT_ACCOUNT
            RECONCILIATION_ACCOUNT -> Value.RECONCILIATION_ACCOUNT
            LOAN -> Value.LOAN
            DEBT -> Value.DEBT
            MORTGAGE -> Value.MORTGAGE
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws FireflyInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            DEFAULT_ACCOUNT -> Known.DEFAULT_ACCOUNT
            CASH_ACCOUNT -> Known.CASH_ACCOUNT
            ASSET_ACCOUNT -> Known.ASSET_ACCOUNT
            EXPENSE_ACCOUNT -> Known.EXPENSE_ACCOUNT
            REVENUE_ACCOUNT -> Known.REVENUE_ACCOUNT
            INITIAL_BALANCE_ACCOUNT -> Known.INITIAL_BALANCE_ACCOUNT
            BENEFICIARY_ACCOUNT -> Known.BENEFICIARY_ACCOUNT
            IMPORT_ACCOUNT -> Known.IMPORT_ACCOUNT
            RECONCILIATION_ACCOUNT -> Known.RECONCILIATION_ACCOUNT
            LOAN -> Known.LOAN
            DEBT -> Known.DEBT
            MORTGAGE -> Known.MORTGAGE
            else -> throw FireflyInvalidDataException("Unknown AccountTypeProperty: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws FireflyInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw FireflyInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws FireflyInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AccountTypeProperty = apply {
        if (validated) {
            return@apply
        }

        known()
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
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountTypeProperty && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
