// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.configuration

import com.fasterxml.jackson.annotation.JsonCreator
import com.firefly.api.core.Enum
import com.firefly.api.core.JsonField
import com.firefly.api.errors.FireflyInvalidDataException

/** Title of the configuration value. */
class ConfigValueFilter @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val CONFIGURATION_IS_DEMO_SITE = of("configuration.is_demo_site")

        val CONFIGURATION_PERMISSION_UPDATE_CHECK = of("configuration.permission_update_check")

        val CONFIGURATION_LAST_UPDATE_CHECK = of("configuration.last_update_check")

        val CONFIGURATION_SINGLE_USER_MODE = of("configuration.single_user_mode")

        val FIREFLY_VERSION = of("firefly.version")

        val FIREFLY_DEFAULT_LOCATION = of("firefly.default_location")

        val FIREFLY_ACCOUNT_TO_TRANSACTION = of("firefly.account_to_transaction")

        val FIREFLY_ALLOWED_OPPOSING_TYPES = of("firefly.allowed_opposing_types")

        val FIREFLY_ACCOUNT_ROLES = of("firefly.accountRoles")

        val FIREFLY_VALID_LIABILITIES = of("firefly.valid_liabilities")

        val FIREFLY_INTEREST_PERIODS = of("firefly.interest_periods")

        val FIREFLY_ENABLE_EXTERNAL_MAP = of("firefly.enable_external_map")

        val FIREFLY_EXPECTED_SOURCE_TYPES = of("firefly.expected_source_types")

        val APP_TIMEZONE = of("app.timezone")

        val FIREFLY_BILL_PERIODS = of("firefly.bill_periods")

        val FIREFLY_CREDIT_CARD_TYPES = of("firefly.credit_card_types")

        val FIREFLY_LANGUAGES = of("firefly.languages")

        val FIREFLY_VALID_VIEW_RANGES = of("firefly.valid_view_ranges")

        val CER_ENABLED = of("cer.enabled")

        val FIREFLY_PRESELECTED_ACCOUNTS = of("firefly.preselected_accounts")

        val FIREFLY_RULE_ACTIONS = of("firefly.rule-actions")

        val FIREFLY_CONTEXT_RULE_ACTIONS = of("firefly.context-rule-actions")

        val SEARCH_OPERATORS = of("search.operators")

        val WEBHOOK_TRIGGERS = of("webhook.triggers")

        val WEBHOOK_RESPONSES = of("webhook.responses")

        val WEBHOOK_DELIVERIES = of("webhook.deliveries")

        fun of(value: String) = ConfigValueFilter(JsonField.of(value))
    }

    /** An enum containing [ConfigValueFilter]'s known values. */
    enum class Known {
        CONFIGURATION_IS_DEMO_SITE,
        CONFIGURATION_PERMISSION_UPDATE_CHECK,
        CONFIGURATION_LAST_UPDATE_CHECK,
        CONFIGURATION_SINGLE_USER_MODE,
        FIREFLY_VERSION,
        FIREFLY_DEFAULT_LOCATION,
        FIREFLY_ACCOUNT_TO_TRANSACTION,
        FIREFLY_ALLOWED_OPPOSING_TYPES,
        FIREFLY_ACCOUNT_ROLES,
        FIREFLY_VALID_LIABILITIES,
        FIREFLY_INTEREST_PERIODS,
        FIREFLY_ENABLE_EXTERNAL_MAP,
        FIREFLY_EXPECTED_SOURCE_TYPES,
        APP_TIMEZONE,
        FIREFLY_BILL_PERIODS,
        FIREFLY_CREDIT_CARD_TYPES,
        FIREFLY_LANGUAGES,
        FIREFLY_VALID_VIEW_RANGES,
        CER_ENABLED,
        FIREFLY_PRESELECTED_ACCOUNTS,
        FIREFLY_RULE_ACTIONS,
        FIREFLY_CONTEXT_RULE_ACTIONS,
        SEARCH_OPERATORS,
        WEBHOOK_TRIGGERS,
        WEBHOOK_RESPONSES,
        WEBHOOK_DELIVERIES,
    }

    /**
     * An enum containing [ConfigValueFilter]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ConfigValueFilter] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CONFIGURATION_IS_DEMO_SITE,
        CONFIGURATION_PERMISSION_UPDATE_CHECK,
        CONFIGURATION_LAST_UPDATE_CHECK,
        CONFIGURATION_SINGLE_USER_MODE,
        FIREFLY_VERSION,
        FIREFLY_DEFAULT_LOCATION,
        FIREFLY_ACCOUNT_TO_TRANSACTION,
        FIREFLY_ALLOWED_OPPOSING_TYPES,
        FIREFLY_ACCOUNT_ROLES,
        FIREFLY_VALID_LIABILITIES,
        FIREFLY_INTEREST_PERIODS,
        FIREFLY_ENABLE_EXTERNAL_MAP,
        FIREFLY_EXPECTED_SOURCE_TYPES,
        APP_TIMEZONE,
        FIREFLY_BILL_PERIODS,
        FIREFLY_CREDIT_CARD_TYPES,
        FIREFLY_LANGUAGES,
        FIREFLY_VALID_VIEW_RANGES,
        CER_ENABLED,
        FIREFLY_PRESELECTED_ACCOUNTS,
        FIREFLY_RULE_ACTIONS,
        FIREFLY_CONTEXT_RULE_ACTIONS,
        SEARCH_OPERATORS,
        WEBHOOK_TRIGGERS,
        WEBHOOK_RESPONSES,
        WEBHOOK_DELIVERIES,
        /**
         * An enum member indicating that [ConfigValueFilter] was instantiated with an unknown
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
            CONFIGURATION_IS_DEMO_SITE -> Value.CONFIGURATION_IS_DEMO_SITE
            CONFIGURATION_PERMISSION_UPDATE_CHECK -> Value.CONFIGURATION_PERMISSION_UPDATE_CHECK
            CONFIGURATION_LAST_UPDATE_CHECK -> Value.CONFIGURATION_LAST_UPDATE_CHECK
            CONFIGURATION_SINGLE_USER_MODE -> Value.CONFIGURATION_SINGLE_USER_MODE
            FIREFLY_VERSION -> Value.FIREFLY_VERSION
            FIREFLY_DEFAULT_LOCATION -> Value.FIREFLY_DEFAULT_LOCATION
            FIREFLY_ACCOUNT_TO_TRANSACTION -> Value.FIREFLY_ACCOUNT_TO_TRANSACTION
            FIREFLY_ALLOWED_OPPOSING_TYPES -> Value.FIREFLY_ALLOWED_OPPOSING_TYPES
            FIREFLY_ACCOUNT_ROLES -> Value.FIREFLY_ACCOUNT_ROLES
            FIREFLY_VALID_LIABILITIES -> Value.FIREFLY_VALID_LIABILITIES
            FIREFLY_INTEREST_PERIODS -> Value.FIREFLY_INTEREST_PERIODS
            FIREFLY_ENABLE_EXTERNAL_MAP -> Value.FIREFLY_ENABLE_EXTERNAL_MAP
            FIREFLY_EXPECTED_SOURCE_TYPES -> Value.FIREFLY_EXPECTED_SOURCE_TYPES
            APP_TIMEZONE -> Value.APP_TIMEZONE
            FIREFLY_BILL_PERIODS -> Value.FIREFLY_BILL_PERIODS
            FIREFLY_CREDIT_CARD_TYPES -> Value.FIREFLY_CREDIT_CARD_TYPES
            FIREFLY_LANGUAGES -> Value.FIREFLY_LANGUAGES
            FIREFLY_VALID_VIEW_RANGES -> Value.FIREFLY_VALID_VIEW_RANGES
            CER_ENABLED -> Value.CER_ENABLED
            FIREFLY_PRESELECTED_ACCOUNTS -> Value.FIREFLY_PRESELECTED_ACCOUNTS
            FIREFLY_RULE_ACTIONS -> Value.FIREFLY_RULE_ACTIONS
            FIREFLY_CONTEXT_RULE_ACTIONS -> Value.FIREFLY_CONTEXT_RULE_ACTIONS
            SEARCH_OPERATORS -> Value.SEARCH_OPERATORS
            WEBHOOK_TRIGGERS -> Value.WEBHOOK_TRIGGERS
            WEBHOOK_RESPONSES -> Value.WEBHOOK_RESPONSES
            WEBHOOK_DELIVERIES -> Value.WEBHOOK_DELIVERIES
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
            CONFIGURATION_IS_DEMO_SITE -> Known.CONFIGURATION_IS_DEMO_SITE
            CONFIGURATION_PERMISSION_UPDATE_CHECK -> Known.CONFIGURATION_PERMISSION_UPDATE_CHECK
            CONFIGURATION_LAST_UPDATE_CHECK -> Known.CONFIGURATION_LAST_UPDATE_CHECK
            CONFIGURATION_SINGLE_USER_MODE -> Known.CONFIGURATION_SINGLE_USER_MODE
            FIREFLY_VERSION -> Known.FIREFLY_VERSION
            FIREFLY_DEFAULT_LOCATION -> Known.FIREFLY_DEFAULT_LOCATION
            FIREFLY_ACCOUNT_TO_TRANSACTION -> Known.FIREFLY_ACCOUNT_TO_TRANSACTION
            FIREFLY_ALLOWED_OPPOSING_TYPES -> Known.FIREFLY_ALLOWED_OPPOSING_TYPES
            FIREFLY_ACCOUNT_ROLES -> Known.FIREFLY_ACCOUNT_ROLES
            FIREFLY_VALID_LIABILITIES -> Known.FIREFLY_VALID_LIABILITIES
            FIREFLY_INTEREST_PERIODS -> Known.FIREFLY_INTEREST_PERIODS
            FIREFLY_ENABLE_EXTERNAL_MAP -> Known.FIREFLY_ENABLE_EXTERNAL_MAP
            FIREFLY_EXPECTED_SOURCE_TYPES -> Known.FIREFLY_EXPECTED_SOURCE_TYPES
            APP_TIMEZONE -> Known.APP_TIMEZONE
            FIREFLY_BILL_PERIODS -> Known.FIREFLY_BILL_PERIODS
            FIREFLY_CREDIT_CARD_TYPES -> Known.FIREFLY_CREDIT_CARD_TYPES
            FIREFLY_LANGUAGES -> Known.FIREFLY_LANGUAGES
            FIREFLY_VALID_VIEW_RANGES -> Known.FIREFLY_VALID_VIEW_RANGES
            CER_ENABLED -> Known.CER_ENABLED
            FIREFLY_PRESELECTED_ACCOUNTS -> Known.FIREFLY_PRESELECTED_ACCOUNTS
            FIREFLY_RULE_ACTIONS -> Known.FIREFLY_RULE_ACTIONS
            FIREFLY_CONTEXT_RULE_ACTIONS -> Known.FIREFLY_CONTEXT_RULE_ACTIONS
            SEARCH_OPERATORS -> Known.SEARCH_OPERATORS
            WEBHOOK_TRIGGERS -> Known.WEBHOOK_TRIGGERS
            WEBHOOK_RESPONSES -> Known.WEBHOOK_RESPONSES
            WEBHOOK_DELIVERIES -> Known.WEBHOOK_DELIVERIES
            else -> throw FireflyInvalidDataException("Unknown ConfigValueFilter: $value")
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
    fun validate(): ConfigValueFilter = apply {
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

        return other is ConfigValueFilter && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
