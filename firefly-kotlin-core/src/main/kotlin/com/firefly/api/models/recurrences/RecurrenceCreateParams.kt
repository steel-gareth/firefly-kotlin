// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.recurrences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.checkKnown
import com.firefly.api.core.checkRequired
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Creates a new recurring transaction. The data required can be submitted as a JSON body or as a
 * list of parameters.
 */
class RecurrenceCreateParams
private constructor(
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xTraceId(): String? = xTraceId

    /**
     * First time the recurring transaction will fire. Must be after today.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstDate(): LocalDate = body.firstDate()

    /**
     * Date until the recurring transaction can fire. Use either this field or repetitions.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repeatUntil(): LocalDate? = body.repeatUntil()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repetitions(): List<Repetition> = body.repetitions()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = body.title()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactions(): List<Transaction> = body.transactions()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): RecurrenceTransactionType = body.type()

    /**
     * If the recurrence is even active.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Boolean? = body.active()

    /**
     * Whether or not to fire the rules after the creation of a transaction.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyRules(): Boolean? = body.applyRules()

    /**
     * Not to be confused with the description of the actual transaction(s) being created.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): String? = body.notes()

    /**
     * Max number of created transactions. Use either this field or repeat_until.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nrOfRepetitions(): Int? = body.nrOfRepetitions()

    /**
     * Returns the raw JSON value of [firstDate].
     *
     * Unlike [firstDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstDate(): JsonField<LocalDate> = body._firstDate()

    /**
     * Returns the raw JSON value of [repeatUntil].
     *
     * Unlike [repeatUntil], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repeatUntil(): JsonField<LocalDate> = body._repeatUntil()

    /**
     * Returns the raw JSON value of [repetitions].
     *
     * Unlike [repetitions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repetitions(): JsonField<List<Repetition>> = body._repetitions()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [transactions].
     *
     * Unlike [transactions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactions(): JsonField<List<Transaction>> = body._transactions()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<RecurrenceTransactionType> = body._type()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [applyRules].
     *
     * Unlike [applyRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applyRules(): JsonField<Boolean> = body._applyRules()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

    /**
     * Returns the raw JSON value of [nrOfRepetitions].
     *
     * Unlike [nrOfRepetitions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nrOfRepetitions(): JsonField<Int> = body._nrOfRepetitions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RecurrenceCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .firstDate()
         * .repeatUntil()
         * .repetitions()
         * .title()
         * .transactions()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RecurrenceCreateParams]. */
    class Builder internal constructor() {

        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(recurrenceCreateParams: RecurrenceCreateParams) = apply {
            xTraceId = recurrenceCreateParams.xTraceId
            body = recurrenceCreateParams.body.toBuilder()
            additionalHeaders = recurrenceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = recurrenceCreateParams.additionalQueryParams.toBuilder()
        }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [firstDate]
         * - [repeatUntil]
         * - [repetitions]
         * - [title]
         * - [transactions]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** First time the recurring transaction will fire. Must be after today. */
        fun firstDate(firstDate: LocalDate) = apply { body.firstDate(firstDate) }

        /**
         * Sets [Builder.firstDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstDate(firstDate: JsonField<LocalDate>) = apply { body.firstDate(firstDate) }

        /** Date until the recurring transaction can fire. Use either this field or repetitions. */
        fun repeatUntil(repeatUntil: LocalDate?) = apply { body.repeatUntil(repeatUntil) }

        /**
         * Sets [Builder.repeatUntil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repeatUntil] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun repeatUntil(repeatUntil: JsonField<LocalDate>) = apply { body.repeatUntil(repeatUntil) }

        fun repetitions(repetitions: List<Repetition>) = apply { body.repetitions(repetitions) }

        /**
         * Sets [Builder.repetitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repetitions] with a well-typed `List<Repetition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun repetitions(repetitions: JsonField<List<Repetition>>) = apply {
            body.repetitions(repetitions)
        }

        /**
         * Adds a single [Repetition] to [repetitions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRepetition(repetition: Repetition) = apply { body.addRepetition(repetition) }

        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        fun transactions(transactions: List<Transaction>) = apply {
            body.transactions(transactions)
        }

        /**
         * Sets [Builder.transactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactions] with a well-typed `List<Transaction>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactions(transactions: JsonField<List<Transaction>>) = apply {
            body.transactions(transactions)
        }

        /**
         * Adds a single [Transaction] to [transactions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransaction(transaction: Transaction) = apply { body.addTransaction(transaction) }

        fun type(type: RecurrenceTransactionType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [RecurrenceTransactionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun type(type: JsonField<RecurrenceTransactionType>) = apply { body.type(type) }

        /** If the recurrence is even active. */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        /** Whether or not to fire the rules after the creation of a transaction. */
        fun applyRules(applyRules: Boolean) = apply { body.applyRules(applyRules) }

        /**
         * Sets [Builder.applyRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyRules] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applyRules(applyRules: JsonField<Boolean>) = apply { body.applyRules(applyRules) }

        /** Not to be confused with the description of the actual transaction(s) being created. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun notes(notes: String?) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        /** Max number of created transactions. Use either this field or repeat_until. */
        fun nrOfRepetitions(nrOfRepetitions: Int?) = apply { body.nrOfRepetitions(nrOfRepetitions) }

        /**
         * Alias for [Builder.nrOfRepetitions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun nrOfRepetitions(nrOfRepetitions: Int) = nrOfRepetitions(nrOfRepetitions as Int?)

        /**
         * Sets [Builder.nrOfRepetitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nrOfRepetitions] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nrOfRepetitions(nrOfRepetitions: JsonField<Int>) = apply {
            body.nrOfRepetitions(nrOfRepetitions)
        }

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
         * Returns an immutable instance of [RecurrenceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .firstDate()
         * .repeatUntil()
         * .repetitions()
         * .title()
         * .transactions()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecurrenceCreateParams =
            RecurrenceCreateParams(
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
        private val firstDate: JsonField<LocalDate>,
        private val repeatUntil: JsonField<LocalDate>,
        private val repetitions: JsonField<List<Repetition>>,
        private val title: JsonField<String>,
        private val transactions: JsonField<List<Transaction>>,
        private val type: JsonField<RecurrenceTransactionType>,
        private val active: JsonField<Boolean>,
        private val applyRules: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val notes: JsonField<String>,
        private val nrOfRepetitions: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("first_date")
            @ExcludeMissing
            firstDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("repeat_until")
            @ExcludeMissing
            repeatUntil: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("repetitions")
            @ExcludeMissing
            repetitions: JsonField<List<Repetition>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transactions")
            @ExcludeMissing
            transactions: JsonField<List<Transaction>> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<RecurrenceTransactionType> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("apply_rules")
            @ExcludeMissing
            applyRules: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nr_of_repetitions")
            @ExcludeMissing
            nrOfRepetitions: JsonField<Int> = JsonMissing.of(),
        ) : this(
            firstDate,
            repeatUntil,
            repetitions,
            title,
            transactions,
            type,
            active,
            applyRules,
            description,
            notes,
            nrOfRepetitions,
            mutableMapOf(),
        )

        /**
         * First time the recurring transaction will fire. Must be after today.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstDate(): LocalDate = firstDate.getRequired("first_date")

        /**
         * Date until the recurring transaction can fire. Use either this field or repetitions.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun repeatUntil(): LocalDate? = repeatUntil.getNullable("repeat_until")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repetitions(): List<Repetition> = repetitions.getRequired("repetitions")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactions(): List<Transaction> = transactions.getRequired("transactions")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): RecurrenceTransactionType = type.getRequired("type")

        /**
         * If the recurrence is even active.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * Whether or not to fire the rules after the creation of a transaction.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applyRules(): Boolean? = applyRules.getNullable("apply_rules")

        /**
         * Not to be confused with the description of the actual transaction(s) being created.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * Max number of created transactions. Use either this field or repeat_until.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nrOfRepetitions(): Int? = nrOfRepetitions.getNullable("nr_of_repetitions")

        /**
         * Returns the raw JSON value of [firstDate].
         *
         * Unlike [firstDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_date")
        @ExcludeMissing
        fun _firstDate(): JsonField<LocalDate> = firstDate

        /**
         * Returns the raw JSON value of [repeatUntil].
         *
         * Unlike [repeatUntil], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repeat_until")
        @ExcludeMissing
        fun _repeatUntil(): JsonField<LocalDate> = repeatUntil

        /**
         * Returns the raw JSON value of [repetitions].
         *
         * Unlike [repetitions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repetitions")
        @ExcludeMissing
        fun _repetitions(): JsonField<List<Repetition>> = repetitions

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [transactions].
         *
         * Unlike [transactions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactions")
        @ExcludeMissing
        fun _transactions(): JsonField<List<Transaction>> = transactions

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<RecurrenceTransactionType> = type

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [applyRules].
         *
         * Unlike [applyRules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apply_rules")
        @ExcludeMissing
        fun _applyRules(): JsonField<Boolean> = applyRules

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [nrOfRepetitions].
         *
         * Unlike [nrOfRepetitions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nr_of_repetitions")
        @ExcludeMissing
        fun _nrOfRepetitions(): JsonField<Int> = nrOfRepetitions

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
             * .firstDate()
             * .repeatUntil()
             * .repetitions()
             * .title()
             * .transactions()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var firstDate: JsonField<LocalDate>? = null
            private var repeatUntil: JsonField<LocalDate>? = null
            private var repetitions: JsonField<MutableList<Repetition>>? = null
            private var title: JsonField<String>? = null
            private var transactions: JsonField<MutableList<Transaction>>? = null
            private var type: JsonField<RecurrenceTransactionType>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var applyRules: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var nrOfRepetitions: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                firstDate = body.firstDate
                repeatUntil = body.repeatUntil
                repetitions = body.repetitions.map { it.toMutableList() }
                title = body.title
                transactions = body.transactions.map { it.toMutableList() }
                type = body.type
                active = body.active
                applyRules = body.applyRules
                description = body.description
                notes = body.notes
                nrOfRepetitions = body.nrOfRepetitions
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** First time the recurring transaction will fire. Must be after today. */
            fun firstDate(firstDate: LocalDate) = firstDate(JsonField.of(firstDate))

            /**
             * Sets [Builder.firstDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstDate(firstDate: JsonField<LocalDate>) = apply { this.firstDate = firstDate }

            /**
             * Date until the recurring transaction can fire. Use either this field or repetitions.
             */
            fun repeatUntil(repeatUntil: LocalDate?) =
                repeatUntil(JsonField.ofNullable(repeatUntil))

            /**
             * Sets [Builder.repeatUntil] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repeatUntil] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repeatUntil(repeatUntil: JsonField<LocalDate>) = apply {
                this.repeatUntil = repeatUntil
            }

            fun repetitions(repetitions: List<Repetition>) = repetitions(JsonField.of(repetitions))

            /**
             * Sets [Builder.repetitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repetitions] with a well-typed `List<Repetition>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun repetitions(repetitions: JsonField<List<Repetition>>) = apply {
                this.repetitions = repetitions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Repetition] to [repetitions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRepetition(repetition: Repetition) = apply {
                repetitions =
                    (repetitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("repetitions", it).add(repetition)
                    }
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun transactions(transactions: List<Transaction>) =
                transactions(JsonField.of(transactions))

            /**
             * Sets [Builder.transactions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactions] with a well-typed `List<Transaction>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transactions(transactions: JsonField<List<Transaction>>) = apply {
                this.transactions = transactions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Transaction] to [transactions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTransaction(transaction: Transaction) = apply {
                transactions =
                    (transactions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("transactions", it).add(transaction)
                    }
            }

            fun type(type: RecurrenceTransactionType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [RecurrenceTransactionType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun type(type: JsonField<RecurrenceTransactionType>) = apply { this.type = type }

            /** If the recurrence is even active. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /** Whether or not to fire the rules after the creation of a transaction. */
            fun applyRules(applyRules: Boolean) = applyRules(JsonField.of(applyRules))

            /**
             * Sets [Builder.applyRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applyRules] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applyRules(applyRules: JsonField<Boolean>) = apply { this.applyRules = applyRules }

            /**
             * Not to be confused with the description of the actual transaction(s) being created.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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

            /** Max number of created transactions. Use either this field or repeat_until. */
            fun nrOfRepetitions(nrOfRepetitions: Int?) =
                nrOfRepetitions(JsonField.ofNullable(nrOfRepetitions))

            /**
             * Alias for [Builder.nrOfRepetitions].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun nrOfRepetitions(nrOfRepetitions: Int) = nrOfRepetitions(nrOfRepetitions as Int?)

            /**
             * Sets [Builder.nrOfRepetitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nrOfRepetitions] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nrOfRepetitions(nrOfRepetitions: JsonField<Int>) = apply {
                this.nrOfRepetitions = nrOfRepetitions
            }

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
             * .firstDate()
             * .repeatUntil()
             * .repetitions()
             * .title()
             * .transactions()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("firstDate", firstDate),
                    checkRequired("repeatUntil", repeatUntil),
                    checkRequired("repetitions", repetitions).map { it.toImmutable() },
                    checkRequired("title", title),
                    checkRequired("transactions", transactions).map { it.toImmutable() },
                    checkRequired("type", type),
                    active,
                    applyRules,
                    description,
                    notes,
                    nrOfRepetitions,
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

            firstDate()
            repeatUntil()
            repetitions().forEach { it.validate() }
            title()
            transactions().forEach { it.validate() }
            type().validate()
            active()
            applyRules()
            description()
            notes()
            nrOfRepetitions()
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
            (if (firstDate.asKnown() == null) 0 else 1) +
                (if (repeatUntil.asKnown() == null) 0 else 1) +
                (repetitions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (title.asKnown() == null) 0 else 1) +
                (transactions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (applyRules.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (nrOfRepetitions.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                firstDate == other.firstDate &&
                repeatUntil == other.repeatUntil &&
                repetitions == other.repetitions &&
                title == other.title &&
                transactions == other.transactions &&
                type == other.type &&
                active == other.active &&
                applyRules == other.applyRules &&
                description == other.description &&
                notes == other.notes &&
                nrOfRepetitions == other.nrOfRepetitions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                firstDate,
                repeatUntil,
                repetitions,
                title,
                transactions,
                type,
                active,
                applyRules,
                description,
                notes,
                nrOfRepetitions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{firstDate=$firstDate, repeatUntil=$repeatUntil, repetitions=$repetitions, title=$title, transactions=$transactions, type=$type, active=$active, applyRules=$applyRules, description=$description, notes=$notes, nrOfRepetitions=$nrOfRepetitions, additionalProperties=$additionalProperties}"
    }

    class Repetition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val moment: JsonField<String>,
        private val type: JsonField<RecurrenceRepetitionType>,
        private val skip: JsonField<Int>,
        private val weekend: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("moment") @ExcludeMissing moment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<RecurrenceRepetitionType> = JsonMissing.of(),
            @JsonProperty("skip") @ExcludeMissing skip: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("weekend") @ExcludeMissing weekend: JsonField<Int> = JsonMissing.of(),
        ) : this(moment, type, skip, weekend, mutableMapOf())

        /**
         * Information that defined the type of repetition.
         * - For 'daily', this is empty.
         * - For 'weekly', it is day of the week between 1 and 7 (Monday - Sunday).
         * - For 'ndom', it is '1,2' or '4,5' or something else, where the first number is the week
         *   in the month, and the second number is the day in the week (between 1 and 7). '2,3'
         *   means: the 2nd Wednesday of the month
         * - For 'monthly' it is the day of the month (1 - 31)
         * - For yearly, it is a full date, ie '2026-04-01'. The year you use does not matter.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun moment(): String = moment.getRequired("moment")

        /**
         * The type of the repetition. ndom means: the n-th weekday of the month, where you can also
         * specify which day of the week.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): RecurrenceRepetitionType = type.getRequired("type")

        /**
         * How many occurrences to skip. 0 means skip nothing. 1 means every other.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skip(): Int? = skip.getNullable("skip")

        /**
         * How to respond when the recurring transaction falls in the weekend. Possible values:
         * 1. Do nothing, just create it
         * 2. Create no transaction.
         * 3. Skip to the previous Friday.
         * 4. Skip to the next Monday.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weekend(): Int? = weekend.getNullable("weekend")

        /**
         * Returns the raw JSON value of [moment].
         *
         * Unlike [moment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("moment") @ExcludeMissing fun _moment(): JsonField<String> = moment

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<RecurrenceRepetitionType> = type

        /**
         * Returns the raw JSON value of [skip].
         *
         * Unlike [skip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("skip") @ExcludeMissing fun _skip(): JsonField<Int> = skip

        /**
         * Returns the raw JSON value of [weekend].
         *
         * Unlike [weekend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weekend") @ExcludeMissing fun _weekend(): JsonField<Int> = weekend

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
             * Returns a mutable builder for constructing an instance of [Repetition].
             *
             * The following fields are required:
             * ```kotlin
             * .moment()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Repetition]. */
        class Builder internal constructor() {

            private var moment: JsonField<String>? = null
            private var type: JsonField<RecurrenceRepetitionType>? = null
            private var skip: JsonField<Int> = JsonMissing.of()
            private var weekend: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(repetition: Repetition) = apply {
                moment = repetition.moment
                type = repetition.type
                skip = repetition.skip
                weekend = repetition.weekend
                additionalProperties = repetition.additionalProperties.toMutableMap()
            }

            /**
             * Information that defined the type of repetition.
             * - For 'daily', this is empty.
             * - For 'weekly', it is day of the week between 1 and 7 (Monday - Sunday).
             * - For 'ndom', it is '1,2' or '4,5' or something else, where the first number is the
             *   week in the month, and the second number is the day in the week (between 1 and 7).
             *   '2,3' means: the 2nd Wednesday of the month
             * - For 'monthly' it is the day of the month (1 - 31)
             * - For yearly, it is a full date, ie '2026-04-01'. The year you use does not matter.
             */
            fun moment(moment: String) = moment(JsonField.of(moment))

            /**
             * Sets [Builder.moment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.moment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun moment(moment: JsonField<String>) = apply { this.moment = moment }

            /**
             * The type of the repetition. ndom means: the n-th weekday of the month, where you can
             * also specify which day of the week.
             */
            fun type(type: RecurrenceRepetitionType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [RecurrenceRepetitionType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun type(type: JsonField<RecurrenceRepetitionType>) = apply { this.type = type }

            /** How many occurrences to skip. 0 means skip nothing. 1 means every other. */
            fun skip(skip: Int) = skip(JsonField.of(skip))

            /**
             * Sets [Builder.skip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skip] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun skip(skip: JsonField<Int>) = apply { this.skip = skip }

            /**
             * How to respond when the recurring transaction falls in the weekend. Possible values:
             * 1. Do nothing, just create it
             * 2. Create no transaction.
             * 3. Skip to the previous Friday.
             * 4. Skip to the next Monday.
             */
            fun weekend(weekend: Int) = weekend(JsonField.of(weekend))

            /**
             * Sets [Builder.weekend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weekend] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun weekend(weekend: JsonField<Int>) = apply { this.weekend = weekend }

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
             * Returns an immutable instance of [Repetition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .moment()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Repetition =
                Repetition(
                    checkRequired("moment", moment),
                    checkRequired("type", type),
                    skip,
                    weekend,
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
        fun validate(): Repetition = apply {
            if (validated) {
                return@apply
            }

            moment()
            type().validate()
            skip()
            weekend()
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
            (if (moment.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (skip.asKnown() == null) 0 else 1) +
                (if (weekend.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Repetition &&
                moment == other.moment &&
                type == other.type &&
                skip == other.skip &&
                weekend == other.weekend &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(moment, type, skip, weekend, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Repetition{moment=$moment, type=$type, skip=$skip, weekend=$weekend, additionalProperties=$additionalProperties}"
    }

    class Transaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val description: JsonField<String>,
        private val destinationId: JsonField<String>,
        private val sourceId: JsonField<String>,
        private val billId: JsonField<String>,
        private val budgetId: JsonField<String>,
        private val categoryId: JsonField<String>,
        private val currencyCode: JsonField<String>,
        private val currencyId: JsonField<String>,
        private val foreignAmount: JsonField<String>,
        private val foreignCurrencyCode: JsonField<String>,
        private val foreignCurrencyId: JsonField<String>,
        private val piggyBankId: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_id")
            @ExcludeMissing
            destinationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_id")
            @ExcludeMissing
            sourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bill_id") @ExcludeMissing billId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category_id")
            @ExcludeMissing
            categoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_code")
            @ExcludeMissing
            currencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_id")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_amount")
            @ExcludeMissing
            foreignAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_currency_code")
            @ExcludeMissing
            foreignCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_currency_id")
            @ExcludeMissing
            foreignCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("piggy_bank_id")
            @ExcludeMissing
            piggyBankId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            amount,
            description,
            destinationId,
            sourceId,
            billId,
            budgetId,
            categoryId,
            currencyCode,
            currencyId,
            foreignAmount,
            foreignCurrencyCode,
            foreignCurrencyId,
            piggyBankId,
            tags,
            mutableMapOf(),
        )

        /**
         * Amount of the transaction.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * ID of the destination account.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationId(): String = destinationId.getRequired("destination_id")

        /**
         * ID of the source account.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceId(): String = sourceId.getRequired("source_id")

        /**
         * Optional.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billId(): String? = billId.getNullable("bill_id")

        /**
         * The budget ID for this transaction.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetId(): String? = budgetId.getNullable("budget_id")

        /**
         * Category ID for this transaction.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categoryId(): String? = categoryId.getNullable("category_id")

        /**
         * Submit either a currency_id or a currency_code.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * Submit either a currency_id or a currency_code.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * Foreign amount of the transaction.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun foreignAmount(): String? = foreignAmount.getNullable("foreign_amount")

        /**
         * Submit either a foreign_currency_id or a foreign_currency_code, or neither.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun foreignCurrencyCode(): String? =
            foreignCurrencyCode.getNullable("foreign_currency_code")

        /**
         * Submit either a foreign_currency_id or a foreign_currency_code, or neither.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun foreignCurrencyId(): String? = foreignCurrencyId.getNullable("foreign_currency_id")

        /**
         * Optional.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun piggyBankId(): String? = piggyBankId.getNullable("piggy_bank_id")

        /**
         * Array of tags.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): List<String>? = tags.getNullable("tags")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [destinationId].
         *
         * Unlike [destinationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destination_id")
        @ExcludeMissing
        fun _destinationId(): JsonField<String> = destinationId

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [billId].
         *
         * Unlike [billId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bill_id") @ExcludeMissing fun _billId(): JsonField<String> = billId

        /**
         * Returns the raw JSON value of [budgetId].
         *
         * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

        /**
         * Returns the raw JSON value of [categoryId].
         *
         * Unlike [categoryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category_id")
        @ExcludeMissing
        fun _categoryId(): JsonField<String> = categoryId

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
         * Returns the raw JSON value of [foreignAmount].
         *
         * Unlike [foreignAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("foreign_amount")
        @ExcludeMissing
        fun _foreignAmount(): JsonField<String> = foreignAmount

        /**
         * Returns the raw JSON value of [foreignCurrencyCode].
         *
         * Unlike [foreignCurrencyCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_currency_code")
        @ExcludeMissing
        fun _foreignCurrencyCode(): JsonField<String> = foreignCurrencyCode

        /**
         * Returns the raw JSON value of [foreignCurrencyId].
         *
         * Unlike [foreignCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("foreign_currency_id")
        @ExcludeMissing
        fun _foreignCurrencyId(): JsonField<String> = foreignCurrencyId

        /**
         * Returns the raw JSON value of [piggyBankId].
         *
         * Unlike [piggyBankId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("piggy_bank_id")
        @ExcludeMissing
        fun _piggyBankId(): JsonField<String> = piggyBankId

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
             * Returns a mutable builder for constructing an instance of [Transaction].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .description()
             * .destinationId()
             * .sourceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Transaction]. */
        class Builder internal constructor() {

            private var amount: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var destinationId: JsonField<String>? = null
            private var sourceId: JsonField<String>? = null
            private var billId: JsonField<String> = JsonMissing.of()
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var categoryId: JsonField<String> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var foreignAmount: JsonField<String> = JsonMissing.of()
            private var foreignCurrencyCode: JsonField<String> = JsonMissing.of()
            private var foreignCurrencyId: JsonField<String> = JsonMissing.of()
            private var piggyBankId: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transaction: Transaction) = apply {
                amount = transaction.amount
                description = transaction.description
                destinationId = transaction.destinationId
                sourceId = transaction.sourceId
                billId = transaction.billId
                budgetId = transaction.budgetId
                categoryId = transaction.categoryId
                currencyCode = transaction.currencyCode
                currencyId = transaction.currencyId
                foreignAmount = transaction.foreignAmount
                foreignCurrencyCode = transaction.foreignCurrencyCode
                foreignCurrencyId = transaction.foreignCurrencyId
                piggyBankId = transaction.piggyBankId
                tags = transaction.tags.map { it.toMutableList() }
                additionalProperties = transaction.additionalProperties.toMutableMap()
            }

            /** Amount of the transaction. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** ID of the destination account. */
            fun destinationId(destinationId: String) = destinationId(JsonField.of(destinationId))

            /**
             * Sets [Builder.destinationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationId(destinationId: JsonField<String>) = apply {
                this.destinationId = destinationId
            }

            /** ID of the source account. */
            fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /** Optional. */
            fun billId(billId: String?) = billId(JsonField.ofNullable(billId))

            /**
             * Sets [Builder.billId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billId(billId: JsonField<String>) = apply { this.billId = billId }

            /** The budget ID for this transaction. */
            fun budgetId(budgetId: String) = budgetId(JsonField.of(budgetId))

            /**
             * Sets [Builder.budgetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            /** Category ID for this transaction. */
            fun categoryId(categoryId: String) = categoryId(JsonField.of(categoryId))

            /**
             * Sets [Builder.categoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categoryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categoryId(categoryId: JsonField<String>) = apply { this.categoryId = categoryId }

            /** Submit either a currency_id or a currency_code. */
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

            /** Submit either a currency_id or a currency_code. */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** Foreign amount of the transaction. */
            fun foreignAmount(foreignAmount: String?) =
                foreignAmount(JsonField.ofNullable(foreignAmount))

            /**
             * Sets [Builder.foreignAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun foreignAmount(foreignAmount: JsonField<String>) = apply {
                this.foreignAmount = foreignAmount
            }

            /** Submit either a foreign_currency_id or a foreign_currency_code, or neither. */
            fun foreignCurrencyCode(foreignCurrencyCode: String?) =
                foreignCurrencyCode(JsonField.ofNullable(foreignCurrencyCode))

            /**
             * Sets [Builder.foreignCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun foreignCurrencyCode(foreignCurrencyCode: JsonField<String>) = apply {
                this.foreignCurrencyCode = foreignCurrencyCode
            }

            /** Submit either a foreign_currency_id or a foreign_currency_code, or neither. */
            fun foreignCurrencyId(foreignCurrencyId: String?) =
                foreignCurrencyId(JsonField.ofNullable(foreignCurrencyId))

            /**
             * Sets [Builder.foreignCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignCurrencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun foreignCurrencyId(foreignCurrencyId: JsonField<String>) = apply {
                this.foreignCurrencyId = foreignCurrencyId
            }

            /** Optional. */
            fun piggyBankId(piggyBankId: String?) = piggyBankId(JsonField.ofNullable(piggyBankId))

            /**
             * Sets [Builder.piggyBankId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.piggyBankId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun piggyBankId(piggyBankId: JsonField<String>) = apply {
                this.piggyBankId = piggyBankId
            }

            /** Array of tags. */
            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

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
             * Returns an immutable instance of [Transaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .description()
             * .destinationId()
             * .sourceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transaction =
                Transaction(
                    checkRequired("amount", amount),
                    checkRequired("description", description),
                    checkRequired("destinationId", destinationId),
                    checkRequired("sourceId", sourceId),
                    billId,
                    budgetId,
                    categoryId,
                    currencyCode,
                    currencyId,
                    foreignAmount,
                    foreignCurrencyCode,
                    foreignCurrencyId,
                    piggyBankId,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            amount()
            description()
            destinationId()
            sourceId()
            billId()
            budgetId()
            categoryId()
            currencyCode()
            currencyId()
            foreignAmount()
            foreignCurrencyCode()
            foreignCurrencyId()
            piggyBankId()
            tags()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (destinationId.asKnown() == null) 0 else 1) +
                (if (sourceId.asKnown() == null) 0 else 1) +
                (if (billId.asKnown() == null) 0 else 1) +
                (if (budgetId.asKnown() == null) 0 else 1) +
                (if (categoryId.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (foreignAmount.asKnown() == null) 0 else 1) +
                (if (foreignCurrencyCode.asKnown() == null) 0 else 1) +
                (if (foreignCurrencyId.asKnown() == null) 0 else 1) +
                (if (piggyBankId.asKnown() == null) 0 else 1) +
                (tags.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transaction &&
                amount == other.amount &&
                description == other.description &&
                destinationId == other.destinationId &&
                sourceId == other.sourceId &&
                billId == other.billId &&
                budgetId == other.budgetId &&
                categoryId == other.categoryId &&
                currencyCode == other.currencyCode &&
                currencyId == other.currencyId &&
                foreignAmount == other.foreignAmount &&
                foreignCurrencyCode == other.foreignCurrencyCode &&
                foreignCurrencyId == other.foreignCurrencyId &&
                piggyBankId == other.piggyBankId &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                description,
                destinationId,
                sourceId,
                billId,
                budgetId,
                categoryId,
                currencyCode,
                currencyId,
                foreignAmount,
                foreignCurrencyCode,
                foreignCurrencyId,
                piggyBankId,
                tags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transaction{amount=$amount, description=$description, destinationId=$destinationId, sourceId=$sourceId, billId=$billId, budgetId=$budgetId, categoryId=$categoryId, currencyCode=$currencyCode, currencyId=$currencyId, foreignAmount=$foreignAmount, foreignCurrencyCode=$foreignCurrencyCode, foreignCurrencyId=$foreignCurrencyId, piggyBankId=$piggyBankId, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecurrenceCreateParams &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RecurrenceCreateParams{xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
