// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.cron

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class CronRunResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autoBudgets: JsonField<CronResultRow>,
    private val recurringTransactions: JsonField<CronResultRow>,
    private val telemetry: JsonField<CronResultRow>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auto_budgets")
        @ExcludeMissing
        autoBudgets: JsonField<CronResultRow> = JsonMissing.of(),
        @JsonProperty("recurring_transactions")
        @ExcludeMissing
        recurringTransactions: JsonField<CronResultRow> = JsonMissing.of(),
        @JsonProperty("telemetry")
        @ExcludeMissing
        telemetry: JsonField<CronResultRow> = JsonMissing.of(),
    ) : this(autoBudgets, recurringTransactions, telemetry, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun autoBudgets(): CronResultRow? = autoBudgets.getNullable("auto_budgets")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun recurringTransactions(): CronResultRow? =
        recurringTransactions.getNullable("recurring_transactions")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun telemetry(): CronResultRow? = telemetry.getNullable("telemetry")

    /**
     * Returns the raw JSON value of [autoBudgets].
     *
     * Unlike [autoBudgets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_budgets")
    @ExcludeMissing
    fun _autoBudgets(): JsonField<CronResultRow> = autoBudgets

    /**
     * Returns the raw JSON value of [recurringTransactions].
     *
     * Unlike [recurringTransactions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_transactions")
    @ExcludeMissing
    fun _recurringTransactions(): JsonField<CronResultRow> = recurringTransactions

    /**
     * Returns the raw JSON value of [telemetry].
     *
     * Unlike [telemetry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("telemetry")
    @ExcludeMissing
    fun _telemetry(): JsonField<CronResultRow> = telemetry

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

        /** Returns a mutable builder for constructing an instance of [CronRunResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [CronRunResponse]. */
    class Builder internal constructor() {

        private var autoBudgets: JsonField<CronResultRow> = JsonMissing.of()
        private var recurringTransactions: JsonField<CronResultRow> = JsonMissing.of()
        private var telemetry: JsonField<CronResultRow> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cronRunResponse: CronRunResponse) = apply {
            autoBudgets = cronRunResponse.autoBudgets
            recurringTransactions = cronRunResponse.recurringTransactions
            telemetry = cronRunResponse.telemetry
            additionalProperties = cronRunResponse.additionalProperties.toMutableMap()
        }

        fun autoBudgets(autoBudgets: CronResultRow) = autoBudgets(JsonField.of(autoBudgets))

        /**
         * Sets [Builder.autoBudgets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoBudgets] with a well-typed [CronResultRow] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoBudgets(autoBudgets: JsonField<CronResultRow>) = apply {
            this.autoBudgets = autoBudgets
        }

        fun recurringTransactions(recurringTransactions: CronResultRow) =
            recurringTransactions(JsonField.of(recurringTransactions))

        /**
         * Sets [Builder.recurringTransactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringTransactions] with a well-typed [CronResultRow]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recurringTransactions(recurringTransactions: JsonField<CronResultRow>) = apply {
            this.recurringTransactions = recurringTransactions
        }

        fun telemetry(telemetry: CronResultRow) = telemetry(JsonField.of(telemetry))

        /**
         * Sets [Builder.telemetry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.telemetry] with a well-typed [CronResultRow] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun telemetry(telemetry: JsonField<CronResultRow>) = apply { this.telemetry = telemetry }

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
         * Returns an immutable instance of [CronRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CronRunResponse =
            CronRunResponse(
                autoBudgets,
                recurringTransactions,
                telemetry,
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
    fun validate(): CronRunResponse = apply {
        if (validated) {
            return@apply
        }

        autoBudgets()?.validate()
        recurringTransactions()?.validate()
        telemetry()?.validate()
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
        (autoBudgets.asKnown()?.validity() ?: 0) +
            (recurringTransactions.asKnown()?.validity() ?: 0) +
            (telemetry.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CronRunResponse &&
            autoBudgets == other.autoBudgets &&
            recurringTransactions == other.recurringTransactions &&
            telemetry == other.telemetry &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(autoBudgets, recurringTransactions, telemetry, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CronRunResponse{autoBudgets=$autoBudgets, recurringTransactions=$recurringTransactions, telemetry=$telemetry, additionalProperties=$additionalProperties}"
}
