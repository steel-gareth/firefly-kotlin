// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.accounts

import com.fasterxml.jackson.annotation.JsonCreator
import com.firefly.api.core.Enum
import com.firefly.api.core.JsonField
import com.firefly.api.errors.FireflyInvalidDataException

/** Is only mandatory when the type is asset. */
class AccountRoleProperty @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val DEFAULT_ASSET = of("defaultAsset")

        val SHARED_ASSET = of("sharedAsset")

        val SAVING_ASSET = of("savingAsset")

        val CC_ASSET = of("ccAsset")

        val CASH_WALLET_ASSET = of("cashWalletAsset")

        fun of(value: String) = AccountRoleProperty(JsonField.of(value))
    }

    /** An enum containing [AccountRoleProperty]'s known values. */
    enum class Known {
        DEFAULT_ASSET,
        SHARED_ASSET,
        SAVING_ASSET,
        CC_ASSET,
        CASH_WALLET_ASSET,
    }

    /**
     * An enum containing [AccountRoleProperty]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AccountRoleProperty] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DEFAULT_ASSET,
        SHARED_ASSET,
        SAVING_ASSET,
        CC_ASSET,
        CASH_WALLET_ASSET,
        /**
         * An enum member indicating that [AccountRoleProperty] was instantiated with an unknown
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
            DEFAULT_ASSET -> Value.DEFAULT_ASSET
            SHARED_ASSET -> Value.SHARED_ASSET
            SAVING_ASSET -> Value.SAVING_ASSET
            CC_ASSET -> Value.CC_ASSET
            CASH_WALLET_ASSET -> Value.CASH_WALLET_ASSET
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
            DEFAULT_ASSET -> Known.DEFAULT_ASSET
            SHARED_ASSET -> Known.SHARED_ASSET
            SAVING_ASSET -> Known.SAVING_ASSET
            CC_ASSET -> Known.CC_ASSET
            CASH_WALLET_ASSET -> Known.CASH_WALLET_ASSET
            else -> throw FireflyInvalidDataException("Unknown AccountRoleProperty: $value")
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
    fun validate(): AccountRoleProperty = apply {
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

        return other is AccountRoleProperty && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
