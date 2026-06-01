// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.cron

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

class CronResultRow
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val jobErrored: JsonField<Boolean>,
    private val jobFired: JsonField<Boolean>,
    private val jobSucceeded: JsonField<Boolean>,
    private val message: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("job_errored")
        @ExcludeMissing
        jobErrored: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("job_fired") @ExcludeMissing jobFired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("job_succeeded")
        @ExcludeMissing
        jobSucceeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
    ) : this(jobErrored, jobFired, jobSucceeded, message, mutableMapOf())

    /**
     * If the cron job ran into some kind of an error, this value will be true.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobErrored(): Boolean? = jobErrored.getNullable("job_errored")

    /**
     * This value tells you if this specific cron job actually fired. It may not fire. Some cron
     * jobs only fire every 24 hours, for example.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobFired(): Boolean? = jobFired.getNullable("job_fired")

    /**
     * This value tells you if this specific cron job actually did something. The job may fire but
     * not change anything.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobSucceeded(): Boolean? = jobSucceeded.getNullable("job_succeeded")

    /**
     * If the cron job ran into some kind of an error, this value will be the error message. The
     * success message if the job actually ran OK.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): String? = message.getNullable("message")

    /**
     * Returns the raw JSON value of [jobErrored].
     *
     * Unlike [jobErrored], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_errored") @ExcludeMissing fun _jobErrored(): JsonField<Boolean> = jobErrored

    /**
     * Returns the raw JSON value of [jobFired].
     *
     * Unlike [jobFired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_fired") @ExcludeMissing fun _jobFired(): JsonField<Boolean> = jobFired

    /**
     * Returns the raw JSON value of [jobSucceeded].
     *
     * Unlike [jobSucceeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_succeeded")
    @ExcludeMissing
    fun _jobSucceeded(): JsonField<Boolean> = jobSucceeded

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [CronResultRow]. */
        fun builder() = Builder()
    }

    /** A builder for [CronResultRow]. */
    class Builder internal constructor() {

        private var jobErrored: JsonField<Boolean> = JsonMissing.of()
        private var jobFired: JsonField<Boolean> = JsonMissing.of()
        private var jobSucceeded: JsonField<Boolean> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cronResultRow: CronResultRow) = apply {
            jobErrored = cronResultRow.jobErrored
            jobFired = cronResultRow.jobFired
            jobSucceeded = cronResultRow.jobSucceeded
            message = cronResultRow.message
            additionalProperties = cronResultRow.additionalProperties.toMutableMap()
        }

        /** If the cron job ran into some kind of an error, this value will be true. */
        fun jobErrored(jobErrored: Boolean?) = jobErrored(JsonField.ofNullable(jobErrored))

        /**
         * Alias for [Builder.jobErrored].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun jobErrored(jobErrored: Boolean) = jobErrored(jobErrored as Boolean?)

        /**
         * Sets [Builder.jobErrored] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobErrored] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jobErrored(jobErrored: JsonField<Boolean>) = apply { this.jobErrored = jobErrored }

        /**
         * This value tells you if this specific cron job actually fired. It may not fire. Some cron
         * jobs only fire every 24 hours, for example.
         */
        fun jobFired(jobFired: Boolean?) = jobFired(JsonField.ofNullable(jobFired))

        /**
         * Alias for [Builder.jobFired].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun jobFired(jobFired: Boolean) = jobFired(jobFired as Boolean?)

        /**
         * Sets [Builder.jobFired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobFired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jobFired(jobFired: JsonField<Boolean>) = apply { this.jobFired = jobFired }

        /**
         * This value tells you if this specific cron job actually did something. The job may fire
         * but not change anything.
         */
        fun jobSucceeded(jobSucceeded: Boolean?) = jobSucceeded(JsonField.ofNullable(jobSucceeded))

        /**
         * Alias for [Builder.jobSucceeded].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun jobSucceeded(jobSucceeded: Boolean) = jobSucceeded(jobSucceeded as Boolean?)

        /**
         * Sets [Builder.jobSucceeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobSucceeded] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jobSucceeded(jobSucceeded: JsonField<Boolean>) = apply {
            this.jobSucceeded = jobSucceeded
        }

        /**
         * If the cron job ran into some kind of an error, this value will be the error message. The
         * success message if the job actually ran OK.
         */
        fun message(message: String?) = message(JsonField.ofNullable(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [CronResultRow].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CronResultRow =
            CronResultRow(
                jobErrored,
                jobFired,
                jobSucceeded,
                message,
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
    fun validate(): CronResultRow = apply {
        if (validated) {
            return@apply
        }

        jobErrored()
        jobFired()
        jobSucceeded()
        message()
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
        (if (jobErrored.asKnown() == null) 0 else 1) +
            (if (jobFired.asKnown() == null) 0 else 1) +
            (if (jobSucceeded.asKnown() == null) 0 else 1) +
            (if (message.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CronResultRow &&
            jobErrored == other.jobErrored &&
            jobFired == other.jobFired &&
            jobSucceeded == other.jobSucceeded &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(jobErrored, jobFired, jobSucceeded, message, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CronResultRow{jobErrored=$jobErrored, jobFired=$jobFired, jobSucceeded=$jobSucceeded, message=$message, additionalProperties=$additionalProperties}"
}
