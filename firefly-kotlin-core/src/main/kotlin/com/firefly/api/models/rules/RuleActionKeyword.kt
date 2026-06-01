// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.fasterxml.jackson.annotation.JsonCreator
import com.firefly.api.core.Enum
import com.firefly.api.core.JsonField
import com.firefly.api.errors.FireflyInvalidDataException

/** The type of thing this action will do. A limited set is possible. */
class RuleActionKeyword @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val USER_ACTION = of("user_action")

        val SET_CATEGORY = of("set_category")

        val CLEAR_CATEGORY = of("clear_category")

        val SET_BUDGET = of("set_budget")

        val CLEAR_BUDGET = of("clear_budget")

        val ADD_TAG = of("add_tag")

        val REMOVE_TAG = of("remove_tag")

        val REMOVE_ALL_TAGS = of("remove_all_tags")

        val SET_DESCRIPTION = of("set_description")

        val APPEND_DESCRIPTION = of("append_description")

        val PREPEND_DESCRIPTION = of("prepend_description")

        val SET_SOURCE_ACCOUNT = of("set_source_account")

        val SET_DESTINATION_ACCOUNT = of("set_destination_account")

        val SET_NOTES = of("set_notes")

        val APPEND_NOTES = of("append_notes")

        val PREPEND_NOTES = of("prepend_notes")

        val CLEAR_NOTES = of("clear_notes")

        val LINK_TO_BILL = of("link_to_bill")

        val CONVERT_WITHDRAWAL = of("convert_withdrawal")

        val CONVERT_DEPOSIT = of("convert_deposit")

        val CONVERT_TRANSFER = of("convert_transfer")

        val DELETE_TRANSACTION = of("delete_transaction")

        fun of(value: String) = RuleActionKeyword(JsonField.of(value))
    }

    /** An enum containing [RuleActionKeyword]'s known values. */
    enum class Known {
        USER_ACTION,
        SET_CATEGORY,
        CLEAR_CATEGORY,
        SET_BUDGET,
        CLEAR_BUDGET,
        ADD_TAG,
        REMOVE_TAG,
        REMOVE_ALL_TAGS,
        SET_DESCRIPTION,
        APPEND_DESCRIPTION,
        PREPEND_DESCRIPTION,
        SET_SOURCE_ACCOUNT,
        SET_DESTINATION_ACCOUNT,
        SET_NOTES,
        APPEND_NOTES,
        PREPEND_NOTES,
        CLEAR_NOTES,
        LINK_TO_BILL,
        CONVERT_WITHDRAWAL,
        CONVERT_DEPOSIT,
        CONVERT_TRANSFER,
        DELETE_TRANSACTION,
    }

    /**
     * An enum containing [RuleActionKeyword]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RuleActionKeyword] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        USER_ACTION,
        SET_CATEGORY,
        CLEAR_CATEGORY,
        SET_BUDGET,
        CLEAR_BUDGET,
        ADD_TAG,
        REMOVE_TAG,
        REMOVE_ALL_TAGS,
        SET_DESCRIPTION,
        APPEND_DESCRIPTION,
        PREPEND_DESCRIPTION,
        SET_SOURCE_ACCOUNT,
        SET_DESTINATION_ACCOUNT,
        SET_NOTES,
        APPEND_NOTES,
        PREPEND_NOTES,
        CLEAR_NOTES,
        LINK_TO_BILL,
        CONVERT_WITHDRAWAL,
        CONVERT_DEPOSIT,
        CONVERT_TRANSFER,
        DELETE_TRANSACTION,
        /**
         * An enum member indicating that [RuleActionKeyword] was instantiated with an unknown
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
            USER_ACTION -> Value.USER_ACTION
            SET_CATEGORY -> Value.SET_CATEGORY
            CLEAR_CATEGORY -> Value.CLEAR_CATEGORY
            SET_BUDGET -> Value.SET_BUDGET
            CLEAR_BUDGET -> Value.CLEAR_BUDGET
            ADD_TAG -> Value.ADD_TAG
            REMOVE_TAG -> Value.REMOVE_TAG
            REMOVE_ALL_TAGS -> Value.REMOVE_ALL_TAGS
            SET_DESCRIPTION -> Value.SET_DESCRIPTION
            APPEND_DESCRIPTION -> Value.APPEND_DESCRIPTION
            PREPEND_DESCRIPTION -> Value.PREPEND_DESCRIPTION
            SET_SOURCE_ACCOUNT -> Value.SET_SOURCE_ACCOUNT
            SET_DESTINATION_ACCOUNT -> Value.SET_DESTINATION_ACCOUNT
            SET_NOTES -> Value.SET_NOTES
            APPEND_NOTES -> Value.APPEND_NOTES
            PREPEND_NOTES -> Value.PREPEND_NOTES
            CLEAR_NOTES -> Value.CLEAR_NOTES
            LINK_TO_BILL -> Value.LINK_TO_BILL
            CONVERT_WITHDRAWAL -> Value.CONVERT_WITHDRAWAL
            CONVERT_DEPOSIT -> Value.CONVERT_DEPOSIT
            CONVERT_TRANSFER -> Value.CONVERT_TRANSFER
            DELETE_TRANSACTION -> Value.DELETE_TRANSACTION
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
            USER_ACTION -> Known.USER_ACTION
            SET_CATEGORY -> Known.SET_CATEGORY
            CLEAR_CATEGORY -> Known.CLEAR_CATEGORY
            SET_BUDGET -> Known.SET_BUDGET
            CLEAR_BUDGET -> Known.CLEAR_BUDGET
            ADD_TAG -> Known.ADD_TAG
            REMOVE_TAG -> Known.REMOVE_TAG
            REMOVE_ALL_TAGS -> Known.REMOVE_ALL_TAGS
            SET_DESCRIPTION -> Known.SET_DESCRIPTION
            APPEND_DESCRIPTION -> Known.APPEND_DESCRIPTION
            PREPEND_DESCRIPTION -> Known.PREPEND_DESCRIPTION
            SET_SOURCE_ACCOUNT -> Known.SET_SOURCE_ACCOUNT
            SET_DESTINATION_ACCOUNT -> Known.SET_DESTINATION_ACCOUNT
            SET_NOTES -> Known.SET_NOTES
            APPEND_NOTES -> Known.APPEND_NOTES
            PREPEND_NOTES -> Known.PREPEND_NOTES
            CLEAR_NOTES -> Known.CLEAR_NOTES
            LINK_TO_BILL -> Known.LINK_TO_BILL
            CONVERT_WITHDRAWAL -> Known.CONVERT_WITHDRAWAL
            CONVERT_DEPOSIT -> Known.CONVERT_DEPOSIT
            CONVERT_TRANSFER -> Known.CONVERT_TRANSFER
            DELETE_TRANSACTION -> Known.DELETE_TRANSACTION
            else -> throw FireflyInvalidDataException("Unknown RuleActionKeyword: $value")
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
    fun validate(): RuleActionKeyword = apply {
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

        return other is RuleActionKeyword && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
