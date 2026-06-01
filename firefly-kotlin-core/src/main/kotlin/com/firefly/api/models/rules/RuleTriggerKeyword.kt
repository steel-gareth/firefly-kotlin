// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.fasterxml.jackson.annotation.JsonCreator
import com.firefly.api.core.Enum
import com.firefly.api.core.JsonField
import com.firefly.api.errors.FireflyInvalidDataException

/** The type of thing this trigger responds to. A limited set is possible */
class RuleTriggerKeyword @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val FROM_ACCOUNT_STARTS = of("from_account_starts")

        val FROM_ACCOUNT_ENDS = of("from_account_ends")

        val FROM_ACCOUNT_IS = of("from_account_is")

        val FROM_ACCOUNT_CONTAINS = of("from_account_contains")

        val TO_ACCOUNT_STARTS = of("to_account_starts")

        val TO_ACCOUNT_ENDS = of("to_account_ends")

        val TO_ACCOUNT_IS = of("to_account_is")

        val TO_ACCOUNT_CONTAINS = of("to_account_contains")

        val AMOUNT_LESS = of("amount_less")

        val AMOUNT_EXACTLY = of("amount_exactly")

        val AMOUNT_MORE = of("amount_more")

        val DESCRIPTION_STARTS = of("description_starts")

        val DESCRIPTION_ENDS = of("description_ends")

        val DESCRIPTION_CONTAINS = of("description_contains")

        val DESCRIPTION_IS = of("description_is")

        val TRANSACTION_TYPE = of("transaction_type")

        val CATEGORY_IS = of("category_is")

        val BUDGET_IS = of("budget_is")

        val TAG_IS = of("tag_is")

        val CURRENCY_IS = of("currency_is")

        val HAS_ATTACHMENTS = of("has_attachments")

        val HAS_NO_CATEGORY = of("has_no_category")

        val HAS_ANY_CATEGORY = of("has_any_category")

        val HAS_NO_BUDGET = of("has_no_budget")

        val HAS_ANY_BUDGET = of("has_any_budget")

        val HAS_NO_TAG = of("has_no_tag")

        val HAS_ANY_TAG = of("has_any_tag")

        val NOTES_CONTAINS = of("notes_contains")

        val NOTES_STARTS = of("notes_starts")

        val NOTES_END = of("notes_end")

        val NOTES_ARE = of("notes_are")

        val NO_NOTES = of("no_notes")

        val ANY_NOTES = of("any_notes")

        val SOURCE_ACCOUNT_IS = of("source_account_is")

        val DESTINATION_ACCOUNT_IS = of("destination_account_is")

        val SOURCE_ACCOUNT_STARTS = of("source_account_starts")

        fun of(value: String) = RuleTriggerKeyword(JsonField.of(value))
    }

    /** An enum containing [RuleTriggerKeyword]'s known values. */
    enum class Known {
        FROM_ACCOUNT_STARTS,
        FROM_ACCOUNT_ENDS,
        FROM_ACCOUNT_IS,
        FROM_ACCOUNT_CONTAINS,
        TO_ACCOUNT_STARTS,
        TO_ACCOUNT_ENDS,
        TO_ACCOUNT_IS,
        TO_ACCOUNT_CONTAINS,
        AMOUNT_LESS,
        AMOUNT_EXACTLY,
        AMOUNT_MORE,
        DESCRIPTION_STARTS,
        DESCRIPTION_ENDS,
        DESCRIPTION_CONTAINS,
        DESCRIPTION_IS,
        TRANSACTION_TYPE,
        CATEGORY_IS,
        BUDGET_IS,
        TAG_IS,
        CURRENCY_IS,
        HAS_ATTACHMENTS,
        HAS_NO_CATEGORY,
        HAS_ANY_CATEGORY,
        HAS_NO_BUDGET,
        HAS_ANY_BUDGET,
        HAS_NO_TAG,
        HAS_ANY_TAG,
        NOTES_CONTAINS,
        NOTES_STARTS,
        NOTES_END,
        NOTES_ARE,
        NO_NOTES,
        ANY_NOTES,
        SOURCE_ACCOUNT_IS,
        DESTINATION_ACCOUNT_IS,
        SOURCE_ACCOUNT_STARTS,
    }

    /**
     * An enum containing [RuleTriggerKeyword]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RuleTriggerKeyword] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        FROM_ACCOUNT_STARTS,
        FROM_ACCOUNT_ENDS,
        FROM_ACCOUNT_IS,
        FROM_ACCOUNT_CONTAINS,
        TO_ACCOUNT_STARTS,
        TO_ACCOUNT_ENDS,
        TO_ACCOUNT_IS,
        TO_ACCOUNT_CONTAINS,
        AMOUNT_LESS,
        AMOUNT_EXACTLY,
        AMOUNT_MORE,
        DESCRIPTION_STARTS,
        DESCRIPTION_ENDS,
        DESCRIPTION_CONTAINS,
        DESCRIPTION_IS,
        TRANSACTION_TYPE,
        CATEGORY_IS,
        BUDGET_IS,
        TAG_IS,
        CURRENCY_IS,
        HAS_ATTACHMENTS,
        HAS_NO_CATEGORY,
        HAS_ANY_CATEGORY,
        HAS_NO_BUDGET,
        HAS_ANY_BUDGET,
        HAS_NO_TAG,
        HAS_ANY_TAG,
        NOTES_CONTAINS,
        NOTES_STARTS,
        NOTES_END,
        NOTES_ARE,
        NO_NOTES,
        ANY_NOTES,
        SOURCE_ACCOUNT_IS,
        DESTINATION_ACCOUNT_IS,
        SOURCE_ACCOUNT_STARTS,
        /**
         * An enum member indicating that [RuleTriggerKeyword] was instantiated with an unknown
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
            FROM_ACCOUNT_STARTS -> Value.FROM_ACCOUNT_STARTS
            FROM_ACCOUNT_ENDS -> Value.FROM_ACCOUNT_ENDS
            FROM_ACCOUNT_IS -> Value.FROM_ACCOUNT_IS
            FROM_ACCOUNT_CONTAINS -> Value.FROM_ACCOUNT_CONTAINS
            TO_ACCOUNT_STARTS -> Value.TO_ACCOUNT_STARTS
            TO_ACCOUNT_ENDS -> Value.TO_ACCOUNT_ENDS
            TO_ACCOUNT_IS -> Value.TO_ACCOUNT_IS
            TO_ACCOUNT_CONTAINS -> Value.TO_ACCOUNT_CONTAINS
            AMOUNT_LESS -> Value.AMOUNT_LESS
            AMOUNT_EXACTLY -> Value.AMOUNT_EXACTLY
            AMOUNT_MORE -> Value.AMOUNT_MORE
            DESCRIPTION_STARTS -> Value.DESCRIPTION_STARTS
            DESCRIPTION_ENDS -> Value.DESCRIPTION_ENDS
            DESCRIPTION_CONTAINS -> Value.DESCRIPTION_CONTAINS
            DESCRIPTION_IS -> Value.DESCRIPTION_IS
            TRANSACTION_TYPE -> Value.TRANSACTION_TYPE
            CATEGORY_IS -> Value.CATEGORY_IS
            BUDGET_IS -> Value.BUDGET_IS
            TAG_IS -> Value.TAG_IS
            CURRENCY_IS -> Value.CURRENCY_IS
            HAS_ATTACHMENTS -> Value.HAS_ATTACHMENTS
            HAS_NO_CATEGORY -> Value.HAS_NO_CATEGORY
            HAS_ANY_CATEGORY -> Value.HAS_ANY_CATEGORY
            HAS_NO_BUDGET -> Value.HAS_NO_BUDGET
            HAS_ANY_BUDGET -> Value.HAS_ANY_BUDGET
            HAS_NO_TAG -> Value.HAS_NO_TAG
            HAS_ANY_TAG -> Value.HAS_ANY_TAG
            NOTES_CONTAINS -> Value.NOTES_CONTAINS
            NOTES_STARTS -> Value.NOTES_STARTS
            NOTES_END -> Value.NOTES_END
            NOTES_ARE -> Value.NOTES_ARE
            NO_NOTES -> Value.NO_NOTES
            ANY_NOTES -> Value.ANY_NOTES
            SOURCE_ACCOUNT_IS -> Value.SOURCE_ACCOUNT_IS
            DESTINATION_ACCOUNT_IS -> Value.DESTINATION_ACCOUNT_IS
            SOURCE_ACCOUNT_STARTS -> Value.SOURCE_ACCOUNT_STARTS
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
            FROM_ACCOUNT_STARTS -> Known.FROM_ACCOUNT_STARTS
            FROM_ACCOUNT_ENDS -> Known.FROM_ACCOUNT_ENDS
            FROM_ACCOUNT_IS -> Known.FROM_ACCOUNT_IS
            FROM_ACCOUNT_CONTAINS -> Known.FROM_ACCOUNT_CONTAINS
            TO_ACCOUNT_STARTS -> Known.TO_ACCOUNT_STARTS
            TO_ACCOUNT_ENDS -> Known.TO_ACCOUNT_ENDS
            TO_ACCOUNT_IS -> Known.TO_ACCOUNT_IS
            TO_ACCOUNT_CONTAINS -> Known.TO_ACCOUNT_CONTAINS
            AMOUNT_LESS -> Known.AMOUNT_LESS
            AMOUNT_EXACTLY -> Known.AMOUNT_EXACTLY
            AMOUNT_MORE -> Known.AMOUNT_MORE
            DESCRIPTION_STARTS -> Known.DESCRIPTION_STARTS
            DESCRIPTION_ENDS -> Known.DESCRIPTION_ENDS
            DESCRIPTION_CONTAINS -> Known.DESCRIPTION_CONTAINS
            DESCRIPTION_IS -> Known.DESCRIPTION_IS
            TRANSACTION_TYPE -> Known.TRANSACTION_TYPE
            CATEGORY_IS -> Known.CATEGORY_IS
            BUDGET_IS -> Known.BUDGET_IS
            TAG_IS -> Known.TAG_IS
            CURRENCY_IS -> Known.CURRENCY_IS
            HAS_ATTACHMENTS -> Known.HAS_ATTACHMENTS
            HAS_NO_CATEGORY -> Known.HAS_NO_CATEGORY
            HAS_ANY_CATEGORY -> Known.HAS_ANY_CATEGORY
            HAS_NO_BUDGET -> Known.HAS_NO_BUDGET
            HAS_ANY_BUDGET -> Known.HAS_ANY_BUDGET
            HAS_NO_TAG -> Known.HAS_NO_TAG
            HAS_ANY_TAG -> Known.HAS_ANY_TAG
            NOTES_CONTAINS -> Known.NOTES_CONTAINS
            NOTES_STARTS -> Known.NOTES_STARTS
            NOTES_END -> Known.NOTES_END
            NOTES_ARE -> Known.NOTES_ARE
            NO_NOTES -> Known.NO_NOTES
            ANY_NOTES -> Known.ANY_NOTES
            SOURCE_ACCOUNT_IS -> Known.SOURCE_ACCOUNT_IS
            DESTINATION_ACCOUNT_IS -> Known.DESTINATION_ACCOUNT_IS
            SOURCE_ACCOUNT_STARTS -> Known.SOURCE_ACCOUNT_STARTS
            else -> throw FireflyInvalidDataException("Unknown RuleTriggerKeyword: $value")
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
    fun validate(): RuleTriggerKeyword = apply {
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

        return other is RuleTriggerKeyword && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
