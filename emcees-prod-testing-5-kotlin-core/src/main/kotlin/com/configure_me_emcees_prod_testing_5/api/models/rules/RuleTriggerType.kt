// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rules

import com.configure_me_emcees_prod_testing_5.api.core.Enum
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Which action is necessary for the rule to fire? Use either store-journal, update-journal or
 * manual-activation.
 */
class RuleTriggerType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val STORE_JOURNAL = of("store-journal")

        val UPDATE_JOURNAL = of("update-journal")

        val MANUAL_ACTIVATION = of("manual-activation")

        fun of(value: String) = RuleTriggerType(JsonField.of(value))
    }

    /** An enum containing [RuleTriggerType]'s known values. */
    enum class Known {
        STORE_JOURNAL,
        UPDATE_JOURNAL,
        MANUAL_ACTIVATION,
    }

    /**
     * An enum containing [RuleTriggerType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RuleTriggerType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        STORE_JOURNAL,
        UPDATE_JOURNAL,
        MANUAL_ACTIVATION,
        /**
         * An enum member indicating that [RuleTriggerType] was instantiated with an unknown value.
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
            STORE_JOURNAL -> Value.STORE_JOURNAL
            UPDATE_JOURNAL -> Value.UPDATE_JOURNAL
            MANUAL_ACTIVATION -> Value.MANUAL_ACTIVATION
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws EmceesProdTesting5InvalidDataException if this class instance's value is a not a
     *   known member.
     */
    fun known(): Known =
        when (this) {
            STORE_JOURNAL -> Known.STORE_JOURNAL
            UPDATE_JOURNAL -> Known.UPDATE_JOURNAL
            MANUAL_ACTIVATION -> Known.MANUAL_ACTIVATION
            else -> throw EmceesProdTesting5InvalidDataException("Unknown RuleTriggerType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws EmceesProdTesting5InvalidDataException if this class instance's value does not have
     *   the expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw EmceesProdTesting5InvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't match
     *   its expected type.
     */
    fun validate(): RuleTriggerType = apply {
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
        } catch (e: EmceesProdTesting5InvalidDataException) {
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

        return other is RuleTriggerType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
