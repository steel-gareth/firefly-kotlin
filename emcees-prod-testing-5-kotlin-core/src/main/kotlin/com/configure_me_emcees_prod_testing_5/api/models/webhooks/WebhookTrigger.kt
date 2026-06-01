// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.Enum
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** The trigger for the webhook. */
class WebhookTrigger @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val ANY = of("ANY")

        val STORE_TRANSACTION = of("STORE_TRANSACTION")

        val UPDATE_TRANSACTION = of("UPDATE_TRANSACTION")

        val DESTROY_TRANSACTION = of("DESTROY_TRANSACTION")

        val STORE_BUDGET = of("STORE_BUDGET")

        val UPDATE_BUDGET = of("UPDATE_BUDGET")

        val DESTROY_BUDGET = of("DESTROY_BUDGET")

        val STORE_UPDATE_BUDGET_LIMIT = of("STORE_UPDATE_BUDGET_LIMIT")

        fun of(value: String) = WebhookTrigger(JsonField.of(value))
    }

    /** An enum containing [WebhookTrigger]'s known values. */
    enum class Known {
        ANY,
        STORE_TRANSACTION,
        UPDATE_TRANSACTION,
        DESTROY_TRANSACTION,
        STORE_BUDGET,
        UPDATE_BUDGET,
        DESTROY_BUDGET,
        STORE_UPDATE_BUDGET_LIMIT,
    }

    /**
     * An enum containing [WebhookTrigger]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookTrigger] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ANY,
        STORE_TRANSACTION,
        UPDATE_TRANSACTION,
        DESTROY_TRANSACTION,
        STORE_BUDGET,
        UPDATE_BUDGET,
        DESTROY_BUDGET,
        STORE_UPDATE_BUDGET_LIMIT,
        /**
         * An enum member indicating that [WebhookTrigger] was instantiated with an unknown value.
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
            ANY -> Value.ANY
            STORE_TRANSACTION -> Value.STORE_TRANSACTION
            UPDATE_TRANSACTION -> Value.UPDATE_TRANSACTION
            DESTROY_TRANSACTION -> Value.DESTROY_TRANSACTION
            STORE_BUDGET -> Value.STORE_BUDGET
            UPDATE_BUDGET -> Value.UPDATE_BUDGET
            DESTROY_BUDGET -> Value.DESTROY_BUDGET
            STORE_UPDATE_BUDGET_LIMIT -> Value.STORE_UPDATE_BUDGET_LIMIT
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
            ANY -> Known.ANY
            STORE_TRANSACTION -> Known.STORE_TRANSACTION
            UPDATE_TRANSACTION -> Known.UPDATE_TRANSACTION
            DESTROY_TRANSACTION -> Known.DESTROY_TRANSACTION
            STORE_BUDGET -> Known.STORE_BUDGET
            UPDATE_BUDGET -> Known.UPDATE_BUDGET
            DESTROY_BUDGET -> Known.DESTROY_BUDGET
            STORE_UPDATE_BUDGET_LIMIT -> Known.STORE_UPDATE_BUDGET_LIMIT
            else -> throw EmceesProdTesting5InvalidDataException("Unknown WebhookTrigger: $value")
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
    fun validate(): WebhookTrigger = apply {
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

        return other is WebhookTrigger && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
