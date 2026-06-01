// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.recurrences

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class RecurrenceRead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val links: JsonField<ObjectLink>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<ObjectLink> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, links, type, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): ObjectLink = links.getRequired("links")

    /**
     * Immutable value
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<ObjectLink> = links

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * Returns a mutable builder for constructing an instance of [RecurrenceRead].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .links()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RecurrenceRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(recurrenceRead: RecurrenceRead) = apply {
            id = recurrenceRead.id
            attributes = recurrenceRead.attributes
            links = recurrenceRead.links
            type = recurrenceRead.type
            additionalProperties = recurrenceRead.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun links(links: ObjectLink) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [ObjectLink] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun links(links: JsonField<ObjectLink>) = apply { this.links = links }

        /** Immutable value */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [RecurrenceRead].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .links()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecurrenceRead =
            RecurrenceRead(
                checkRequired("id", id),
                checkRequired("attributes", attributes),
                checkRequired("links", links),
                checkRequired("type", type),
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
    fun validate(): RecurrenceRead = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().validate()
        links().validate()
        type()
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
        (if (id.asKnown() == null) 0 else 1) +
            (attributes.asKnown()?.validity() ?: 0) +
            (links.asKnown()?.validity() ?: 0) +
            (if (type.asKnown() == null) 0 else 1)

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val active: JsonField<Boolean>,
        private val applyRules: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val firstDate: JsonField<LocalDate>,
        private val latestDate: JsonField<LocalDate>,
        private val notes: JsonField<String>,
        private val nrOfRepetitions: JsonField<Int>,
        private val repeatUntil: JsonField<LocalDate>,
        private val repetitions: JsonField<List<Repetition>>,
        private val title: JsonField<String>,
        private val transactions: JsonField<List<Transaction>>,
        private val type: JsonField<RecurrenceTransactionType>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("apply_rules")
            @ExcludeMissing
            applyRules: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_date")
            @ExcludeMissing
            firstDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("latest_date")
            @ExcludeMissing
            latestDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nr_of_repetitions")
            @ExcludeMissing
            nrOfRepetitions: JsonField<Int> = JsonMissing.of(),
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
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            active,
            applyRules,
            createdAt,
            description,
            firstDate,
            latestDate,
            notes,
            nrOfRepetitions,
            repeatUntil,
            repetitions,
            title,
            transactions,
            type,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * If the recurrence is even active.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * Whether or not to fire the rules after the creation of a transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun applyRules(): Boolean? = applyRules.getNullable("apply_rules")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Not to be confused with the description of the actual transaction(s) being created.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * First time the recurring transaction will fire. Must be after today.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun firstDate(): LocalDate? = firstDate.getNullable("first_date")

        /**
         * Last time the recurring transaction has fired.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun latestDate(): LocalDate? = latestDate.getNullable("latest_date")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * Max number of created transactions. Use either this field or repeat_until.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nrOfRepetitions(): Int? = nrOfRepetitions.getNullable("nr_of_repetitions")

        /**
         * Date until the recurring transaction can fire. Use either this field or repetitions.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun repeatUntil(): LocalDate? = repeatUntil.getNullable("repeat_until")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun repetitions(): List<Repetition>? = repetitions.getNullable("repetitions")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun title(): String? = title.getNullable("title")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactions(): List<Transaction>? = transactions.getNullable("transactions")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): RecurrenceTransactionType? = type.getNullable("type")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [firstDate].
         *
         * Unlike [firstDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_date")
        @ExcludeMissing
        fun _firstDate(): JsonField<LocalDate> = firstDate

        /**
         * Returns the raw JSON value of [latestDate].
         *
         * Unlike [latestDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latest_date")
        @ExcludeMissing
        fun _latestDate(): JsonField<LocalDate> = latestDate

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
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var applyRules: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var firstDate: JsonField<LocalDate> = JsonMissing.of()
            private var latestDate: JsonField<LocalDate> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var nrOfRepetitions: JsonField<Int> = JsonMissing.of()
            private var repeatUntil: JsonField<LocalDate> = JsonMissing.of()
            private var repetitions: JsonField<MutableList<Repetition>>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var transactions: JsonField<MutableList<Transaction>>? = null
            private var type: JsonField<RecurrenceTransactionType> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                active = attributes.active
                applyRules = attributes.applyRules
                createdAt = attributes.createdAt
                description = attributes.description
                firstDate = attributes.firstDate
                latestDate = attributes.latestDate
                notes = attributes.notes
                nrOfRepetitions = attributes.nrOfRepetitions
                repeatUntil = attributes.repeatUntil
                repetitions = attributes.repetitions.map { it.toMutableList() }
                title = attributes.title
                transactions = attributes.transactions.map { it.toMutableList() }
                type = attributes.type
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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

            /** Last time the recurring transaction has fired. */
            fun latestDate(latestDate: LocalDate?) = latestDate(JsonField.ofNullable(latestDate))

            /**
             * Sets [Builder.latestDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latestDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latestDate(latestDate: JsonField<LocalDate>) = apply {
                this.latestDate = latestDate
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

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes =
                Attributes(
                    active,
                    applyRules,
                    createdAt,
                    description,
                    firstDate,
                    latestDate,
                    notes,
                    nrOfRepetitions,
                    repeatUntil,
                    (repetitions ?: JsonMissing.of()).map { it.toImmutable() },
                    title,
                    (transactions ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    updatedAt,
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
         * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            active()
            applyRules()
            createdAt()
            description()
            firstDate()
            latestDate()
            notes()
            nrOfRepetitions()
            repeatUntil()
            repetitions()?.forEach { it.validate() }
            title()
            transactions()?.forEach { it.validate() }
            type()?.validate()
            updatedAt()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (active.asKnown() == null) 0 else 1) +
                (if (applyRules.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (firstDate.asKnown() == null) 0 else 1) +
                (if (latestDate.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (nrOfRepetitions.asKnown() == null) 0 else 1) +
                (if (repeatUntil.asKnown() == null) 0 else 1) +
                (repetitions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (title.asKnown() == null) 0 else 1) +
                (transactions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        class Repetition
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val moment: JsonField<String>,
            private val type: JsonField<RecurrenceRepetitionType>,
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val description: JsonField<String>,
            private val occurrences: JsonField<List<OffsetDateTime>>,
            private val skip: JsonField<Int>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val weekend: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("moment")
                @ExcludeMissing
                moment: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<RecurrenceRepetitionType> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("occurrences")
                @ExcludeMissing
                occurrences: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
                @JsonProperty("skip") @ExcludeMissing skip: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("weekend") @ExcludeMissing weekend: JsonField<Int> = JsonMissing.of(),
            ) : this(
                moment,
                type,
                id,
                createdAt,
                description,
                occurrences,
                skip,
                updatedAt,
                weekend,
                mutableMapOf(),
            )

            /**
             * Information that defined the type of repetition.
             * - For 'daily', this is empty.
             * - For 'weekly', it is day of the week between 1 and 7 (Monday - Sunday).
             * - For 'ndom', it is '1,2' or '4,5' or something else, where the first number is the
             *   week in the month, and the second number is the day in the week (between 1 and 7).
             *   '2,3' means: the 2nd Wednesday of the month
             * - For 'monthly' it is the day of the month (1 - 31)
             * - For yearly, it is a full date, ie '2026-04-01'. The year you use does not matter.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun moment(): String = moment.getRequired("moment")

            /**
             * The type of the repetition. ndom means: the n-th weekday of the month, where you can
             * also specify which day of the week.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun type(): RecurrenceRepetitionType = type.getRequired("type")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * Auto-generated repetition description.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * Array of future dates when the repetition will apply to. Auto generated.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun occurrences(): List<OffsetDateTime>? = occurrences.getNullable("occurrences")

            /**
             * How many occurrences to skip. 0 means skip nothing. 1 means every other.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun skip(): Int? = skip.getNullable("skip")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * How to respond when the recurring transaction falls in the weekend. Possible values:
             * 1. Do nothing, just create it
             * 2. Create no transaction.
             * 3. Skip to the previous Friday.
             * 4. Skip to the next Monday.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
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
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [occurrences].
             *
             * Unlike [occurrences], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("occurrences")
            @ExcludeMissing
            fun _occurrences(): JsonField<List<OffsetDateTime>> = occurrences

            /**
             * Returns the raw JSON value of [skip].
             *
             * Unlike [skip], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("skip") @ExcludeMissing fun _skip(): JsonField<Int> = skip

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                private var id: JsonField<String> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var occurrences: JsonField<MutableList<OffsetDateTime>>? = null
                private var skip: JsonField<Int> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var weekend: JsonField<Int> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(repetition: Repetition) = apply {
                    moment = repetition.moment
                    type = repetition.type
                    id = repetition.id
                    createdAt = repetition.createdAt
                    description = repetition.description
                    occurrences = repetition.occurrences.map { it.toMutableList() }
                    skip = repetition.skip
                    updatedAt = repetition.updatedAt
                    weekend = repetition.weekend
                    additionalProperties = repetition.additionalProperties.toMutableMap()
                }

                /**
                 * Information that defined the type of repetition.
                 * - For 'daily', this is empty.
                 * - For 'weekly', it is day of the week between 1 and 7 (Monday - Sunday).
                 * - For 'ndom', it is '1,2' or '4,5' or something else, where the first number is
                 *   the week in the month, and the second number is the day in the week (between 1
                 *   and 7). '2,3' means: the 2nd Wednesday of the month
                 * - For 'monthly' it is the day of the month (1 - 31)
                 * - For yearly, it is a full date, ie '2026-04-01'. The year you use does not
                 *   matter.
                 */
                fun moment(moment: String) = moment(JsonField.of(moment))

                /**
                 * Sets [Builder.moment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.moment] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun moment(moment: JsonField<String>) = apply { this.moment = moment }

                /**
                 * The type of the repetition. ndom means: the n-th weekday of the month, where you
                 * can also specify which day of the week.
                 */
                fun type(type: RecurrenceRepetitionType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed
                 * [RecurrenceRepetitionType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun type(type: JsonField<RecurrenceRepetitionType>) = apply { this.type = type }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Auto-generated repetition description. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Array of future dates when the repetition will apply to. Auto generated. */
                fun occurrences(occurrences: List<OffsetDateTime>) =
                    occurrences(JsonField.of(occurrences))

                /**
                 * Sets [Builder.occurrences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.occurrences] with a well-typed
                 * `List<OffsetDateTime>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun occurrences(occurrences: JsonField<List<OffsetDateTime>>) = apply {
                    this.occurrences = occurrences.map { it.toMutableList() }
                }

                /**
                 * Adds a single [OffsetDateTime] to [occurrences].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOccurrence(occurrence: OffsetDateTime) = apply {
                    occurrences =
                        (occurrences ?: JsonField.of(mutableListOf())).also {
                            checkKnown("occurrences", it).add(occurrence)
                        }
                }

                /** How many occurrences to skip. 0 means skip nothing. 1 means every other. */
                fun skip(skip: Int) = skip(JsonField.of(skip))

                /**
                 * Sets [Builder.skip] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.skip] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun skip(skip: JsonField<Int>) = apply { this.skip = skip }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /**
                 * How to respond when the recurring transaction falls in the weekend. Possible
                 * values:
                 * 1. Do nothing, just create it
                 * 2. Create no transaction.
                 * 3. Skip to the previous Friday.
                 * 4. Skip to the next Monday.
                 */
                fun weekend(weekend: Int) = weekend(JsonField.of(weekend))

                /**
                 * Sets [Builder.weekend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.weekend] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun weekend(weekend: JsonField<Int>) = apply { this.weekend = weekend }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                        id,
                        createdAt,
                        description,
                        (occurrences ?: JsonMissing.of()).map { it.toImmutable() },
                        skip,
                        updatedAt,
                        weekend,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws EmceesProdTesting5InvalidDataException if any value type in this object
             *   doesn't match its expected type.
             */
            fun validate(): Repetition = apply {
                if (validated) {
                    return@apply
                }

                moment()
                type().validate()
                id()
                createdAt()
                description()
                occurrences()
                skip()
                updatedAt()
                weekend()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (moment.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (id.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (occurrences.asKnown()?.size ?: 0) +
                    (if (skip.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    (if (weekend.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Repetition &&
                    moment == other.moment &&
                    type == other.type &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    description == other.description &&
                    occurrences == other.occurrences &&
                    skip == other.skip &&
                    updatedAt == other.updatedAt &&
                    weekend == other.weekend &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    moment,
                    type,
                    id,
                    createdAt,
                    description,
                    occurrences,
                    skip,
                    updatedAt,
                    weekend,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Repetition{moment=$moment, type=$type, id=$id, createdAt=$createdAt, description=$description, occurrences=$occurrences, skip=$skip, updatedAt=$updatedAt, weekend=$weekend, additionalProperties=$additionalProperties}"
        }

        class Transaction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val description: JsonField<String>,
            private val id: JsonField<String>,
            private val budgetId: JsonField<String>,
            private val budgetName: JsonField<String>,
            private val categoryId: JsonField<String>,
            private val categoryName: JsonField<String>,
            private val currencyCode: JsonField<String>,
            private val currencyDecimalPlaces: JsonField<Int>,
            private val currencyId: JsonField<String>,
            private val currencyName: JsonField<String>,
            private val currencySymbol: JsonField<String>,
            private val destinationIban: JsonField<String>,
            private val destinationId: JsonField<String>,
            private val destinationName: JsonField<String>,
            private val destinationType: JsonField<AccountTypeProperty>,
            private val foreignAmount: JsonField<String>,
            private val foreignCurrencyCode: JsonField<String>,
            private val foreignCurrencyDecimalPlaces: JsonField<Int>,
            private val foreignCurrencyId: JsonField<String>,
            private val foreignCurrencyName: JsonField<String>,
            private val foreignCurrencySymbol: JsonField<String>,
            private val objectHasCurrencySetting: JsonField<Boolean>,
            private val pcAmount: JsonField<String>,
            private val pcForeignAmount: JsonField<String>,
            private val piggyBankId: JsonField<String>,
            private val piggyBankName: JsonField<String>,
            private val primaryCurrencyCode: JsonField<String>,
            private val primaryCurrencyDecimalPlaces: JsonField<Int>,
            private val primaryCurrencyId: JsonField<String>,
            private val primaryCurrencyName: JsonField<String>,
            private val primaryCurrencySymbol: JsonField<String>,
            private val sourceIban: JsonField<String>,
            private val sourceId: JsonField<String>,
            private val sourceName: JsonField<String>,
            private val sourceType: JsonField<AccountTypeProperty>,
            private val subscriptionId: JsonField<String>,
            private val subscriptionName: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_id")
                @ExcludeMissing
                budgetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_name")
                @ExcludeMissing
                budgetName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("category_id")
                @ExcludeMissing
                categoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("category_name")
                @ExcludeMissing
                categoryName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency_code")
                @ExcludeMissing
                currencyCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency_decimal_places")
                @ExcludeMissing
                currencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("currency_id")
                @ExcludeMissing
                currencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency_name")
                @ExcludeMissing
                currencyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency_symbol")
                @ExcludeMissing
                currencySymbol: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_iban")
                @ExcludeMissing
                destinationIban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_id")
                @ExcludeMissing
                destinationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_name")
                @ExcludeMissing
                destinationName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_type")
                @ExcludeMissing
                destinationType: JsonField<AccountTypeProperty> = JsonMissing.of(),
                @JsonProperty("foreign_amount")
                @ExcludeMissing
                foreignAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_currency_code")
                @ExcludeMissing
                foreignCurrencyCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_currency_decimal_places")
                @ExcludeMissing
                foreignCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("foreign_currency_id")
                @ExcludeMissing
                foreignCurrencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_currency_name")
                @ExcludeMissing
                foreignCurrencyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("foreign_currency_symbol")
                @ExcludeMissing
                foreignCurrencySymbol: JsonField<String> = JsonMissing.of(),
                @JsonProperty("object_has_currency_setting")
                @ExcludeMissing
                objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("pc_amount")
                @ExcludeMissing
                pcAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_foreign_amount")
                @ExcludeMissing
                pcForeignAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("piggy_bank_id")
                @ExcludeMissing
                piggyBankId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("piggy_bank_name")
                @ExcludeMissing
                piggyBankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_code")
                @ExcludeMissing
                primaryCurrencyCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_decimal_places")
                @ExcludeMissing
                primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("primary_currency_id")
                @ExcludeMissing
                primaryCurrencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_name")
                @ExcludeMissing
                primaryCurrencyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_symbol")
                @ExcludeMissing
                primaryCurrencySymbol: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_iban")
                @ExcludeMissing
                sourceIban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_id")
                @ExcludeMissing
                sourceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_name")
                @ExcludeMissing
                sourceName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_type")
                @ExcludeMissing
                sourceType: JsonField<AccountTypeProperty> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subscription_name")
                @ExcludeMissing
                subscriptionName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                amount,
                description,
                id,
                budgetId,
                budgetName,
                categoryId,
                categoryName,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                destinationIban,
                destinationId,
                destinationName,
                destinationType,
                foreignAmount,
                foreignCurrencyCode,
                foreignCurrencyDecimalPlaces,
                foreignCurrencyId,
                foreignCurrencyName,
                foreignCurrencySymbol,
                objectHasCurrencySetting,
                pcAmount,
                pcForeignAmount,
                piggyBankId,
                piggyBankName,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                sourceIban,
                sourceId,
                sourceName,
                sourceType,
                subscriptionId,
                subscriptionName,
                tags,
                mutableMapOf(),
            )

            /**
             * Amount of the transaction.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun description(): String = description.getRequired("description")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * The budget ID for this transaction.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun budgetId(): String? = budgetId.getNullable("budget_id")

            /**
             * The name of the budget to be used. If the budget name is unknown, the ID will be used
             * or the value will be ignored.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun budgetName(): String? = budgetName.getNullable("budget_name")

            /**
             * Category ID for this transaction.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun categoryId(): String? = categoryId.getNullable("category_id")

            /**
             * Category name for this transaction.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun categoryName(): String? = categoryName.getNullable("category_name")

            /**
             * The currency code of the currency associated with this object.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currencyCode(): String? = currencyCode.getNullable("currency_code")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currencyDecimalPlaces(): Int? =
                currencyDecimalPlaces.getNullable("currency_decimal_places")

            /**
             * The currency ID of the currency associated with this object.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currencyId(): String? = currencyId.getNullable("currency_id")

            /**
             * The currency name of the currency associated with this object.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currencyName(): String? = currencyName.getNullable("currency_name")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun destinationIban(): String? = destinationIban.getNullable("destination_iban")

            /**
             * ID of the destination account. Submit either this or destination_name.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun destinationId(): String? = destinationId.getNullable("destination_id")

            /**
             * Name of the destination account. Submit either this or destination_id.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun destinationName(): String? = destinationName.getNullable("destination_name")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun destinationType(): AccountTypeProperty? =
                destinationType.getNullable("destination_type")

            /**
             * Foreign amount of the transaction.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun foreignAmount(): String? = foreignAmount.getNullable("foreign_amount")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun foreignCurrencyCode(): String? =
                foreignCurrencyCode.getNullable("foreign_currency_code")

            /**
             * Number of decimals in the currency
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun foreignCurrencyDecimalPlaces(): Int? =
                foreignCurrencyDecimalPlaces.getNullable("foreign_currency_decimal_places")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun foreignCurrencyId(): String? = foreignCurrencyId.getNullable("foreign_currency_id")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun foreignCurrencyName(): String? =
                foreignCurrencyName.getNullable("foreign_currency_name")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun foreignCurrencySymbol(): String? =
                foreignCurrencySymbol.getNullable("foreign_currency_symbol")

            /**
             * Indicates whether the object has a currency setting. If false, the object uses the
             * administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun objectHasCurrencySetting(): Boolean? =
                objectHasCurrencySetting.getNullable("object_has_currency_setting")

            /**
             * Amount of the transaction in primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pcAmount(): String? = pcAmount.getNullable("pc_amount")

            /**
             * Foreign amount of the transaction.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pcForeignAmount(): String? = pcForeignAmount.getNullable("pc_foreign_amount")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun piggyBankId(): String? = piggyBankId.getNullable("piggy_bank_id")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun piggyBankName(): String? = piggyBankName.getNullable("piggy_bank_name")

            /**
             * The currency code of the administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun primaryCurrencyCode(): String? =
                primaryCurrencyCode.getNullable("primary_currency_code")

            /**
             * The currency decimal places of the administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun primaryCurrencyDecimalPlaces(): Int? =
                primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

            /**
             * The currency ID of the administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

            /**
             * The currency name of the administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun primaryCurrencyName(): String? =
                primaryCurrencyName.getNullable("primary_currency_name")

            /**
             * The currency symbol of the administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun primaryCurrencySymbol(): String? =
                primaryCurrencySymbol.getNullable("primary_currency_symbol")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceIban(): String? = sourceIban.getNullable("source_iban")

            /**
             * ID of the source account. Submit either this or source_name.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceId(): String? = sourceId.getNullable("source_id")

            /**
             * Name of the source account. Submit either this or source_id.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceName(): String? = sourceName.getNullable("source_name")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceType(): AccountTypeProperty? = sourceType.getNullable("source_type")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun subscriptionName(): String? = subscriptionName.getNullable("subscription_name")

            /**
             * Array of tags.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
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
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [budgetId].
             *
             * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

            /**
             * Returns the raw JSON value of [budgetName].
             *
             * Unlike [budgetName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("budget_name")
            @ExcludeMissing
            fun _budgetName(): JsonField<String> = budgetName

            /**
             * Returns the raw JSON value of [categoryId].
             *
             * Unlike [categoryId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category_id")
            @ExcludeMissing
            fun _categoryId(): JsonField<String> = categoryId

            /**
             * Returns the raw JSON value of [categoryName].
             *
             * Unlike [categoryName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category_name")
            @ExcludeMissing
            fun _categoryName(): JsonField<String> = categoryName

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
             * Returns the raw JSON value of [currencyDecimalPlaces].
             *
             * Unlike [currencyDecimalPlaces], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("currency_decimal_places")
            @ExcludeMissing
            fun _currencyDecimalPlaces(): JsonField<Int> = currencyDecimalPlaces

            /**
             * Returns the raw JSON value of [currencyId].
             *
             * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency_id")
            @ExcludeMissing
            fun _currencyId(): JsonField<String> = currencyId

            /**
             * Returns the raw JSON value of [currencyName].
             *
             * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency_name")
            @ExcludeMissing
            fun _currencyName(): JsonField<String> = currencyName

            /**
             * Returns the raw JSON value of [currencySymbol].
             *
             * Unlike [currencySymbol], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("currency_symbol")
            @ExcludeMissing
            fun _currencySymbol(): JsonField<String> = currencySymbol

            /**
             * Returns the raw JSON value of [destinationIban].
             *
             * Unlike [destinationIban], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destination_iban")
            @ExcludeMissing
            fun _destinationIban(): JsonField<String> = destinationIban

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
             * Returns the raw JSON value of [destinationName].
             *
             * Unlike [destinationName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destination_name")
            @ExcludeMissing
            fun _destinationName(): JsonField<String> = destinationName

            /**
             * Returns the raw JSON value of [destinationType].
             *
             * Unlike [destinationType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destination_type")
            @ExcludeMissing
            fun _destinationType(): JsonField<AccountTypeProperty> = destinationType

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
             * Returns the raw JSON value of [foreignCurrencyDecimalPlaces].
             *
             * Unlike [foreignCurrencyDecimalPlaces], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("foreign_currency_decimal_places")
            @ExcludeMissing
            fun _foreignCurrencyDecimalPlaces(): JsonField<Int> = foreignCurrencyDecimalPlaces

            /**
             * Returns the raw JSON value of [foreignCurrencyId].
             *
             * Unlike [foreignCurrencyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_currency_id")
            @ExcludeMissing
            fun _foreignCurrencyId(): JsonField<String> = foreignCurrencyId

            /**
             * Returns the raw JSON value of [foreignCurrencyName].
             *
             * Unlike [foreignCurrencyName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_currency_name")
            @ExcludeMissing
            fun _foreignCurrencyName(): JsonField<String> = foreignCurrencyName

            /**
             * Returns the raw JSON value of [foreignCurrencySymbol].
             *
             * Unlike [foreignCurrencySymbol], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_currency_symbol")
            @ExcludeMissing
            fun _foreignCurrencySymbol(): JsonField<String> = foreignCurrencySymbol

            /**
             * Returns the raw JSON value of [objectHasCurrencySetting].
             *
             * Unlike [objectHasCurrencySetting], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_has_currency_setting")
            @ExcludeMissing
            fun _objectHasCurrencySetting(): JsonField<Boolean> = objectHasCurrencySetting

            /**
             * Returns the raw JSON value of [pcAmount].
             *
             * Unlike [pcAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pc_amount") @ExcludeMissing fun _pcAmount(): JsonField<String> = pcAmount

            /**
             * Returns the raw JSON value of [pcForeignAmount].
             *
             * Unlike [pcForeignAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pc_foreign_amount")
            @ExcludeMissing
            fun _pcForeignAmount(): JsonField<String> = pcForeignAmount

            /**
             * Returns the raw JSON value of [piggyBankId].
             *
             * Unlike [piggyBankId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("piggy_bank_id")
            @ExcludeMissing
            fun _piggyBankId(): JsonField<String> = piggyBankId

            /**
             * Returns the raw JSON value of [piggyBankName].
             *
             * Unlike [piggyBankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("piggy_bank_name")
            @ExcludeMissing
            fun _piggyBankName(): JsonField<String> = piggyBankName

            /**
             * Returns the raw JSON value of [primaryCurrencyCode].
             *
             * Unlike [primaryCurrencyCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("primary_currency_code")
            @ExcludeMissing
            fun _primaryCurrencyCode(): JsonField<String> = primaryCurrencyCode

            /**
             * Returns the raw JSON value of [primaryCurrencyDecimalPlaces].
             *
             * Unlike [primaryCurrencyDecimalPlaces], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("primary_currency_decimal_places")
            @ExcludeMissing
            fun _primaryCurrencyDecimalPlaces(): JsonField<Int> = primaryCurrencyDecimalPlaces

            /**
             * Returns the raw JSON value of [primaryCurrencyId].
             *
             * Unlike [primaryCurrencyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("primary_currency_id")
            @ExcludeMissing
            fun _primaryCurrencyId(): JsonField<String> = primaryCurrencyId

            /**
             * Returns the raw JSON value of [primaryCurrencyName].
             *
             * Unlike [primaryCurrencyName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("primary_currency_name")
            @ExcludeMissing
            fun _primaryCurrencyName(): JsonField<String> = primaryCurrencyName

            /**
             * Returns the raw JSON value of [primaryCurrencySymbol].
             *
             * Unlike [primaryCurrencySymbol], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("primary_currency_symbol")
            @ExcludeMissing
            fun _primaryCurrencySymbol(): JsonField<String> = primaryCurrencySymbol

            /**
             * Returns the raw JSON value of [sourceIban].
             *
             * Unlike [sourceIban], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("source_iban")
            @ExcludeMissing
            fun _sourceIban(): JsonField<String> = sourceIban

            /**
             * Returns the raw JSON value of [sourceId].
             *
             * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

            /**
             * Returns the raw JSON value of [sourceName].
             *
             * Unlike [sourceName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("source_name")
            @ExcludeMissing
            fun _sourceName(): JsonField<String> = sourceName

            /**
             * Returns the raw JSON value of [sourceType].
             *
             * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("source_type")
            @ExcludeMissing
            fun _sourceType(): JsonField<AccountTypeProperty> = sourceType

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [subscriptionName].
             *
             * Unlike [subscriptionName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_name")
            @ExcludeMissing
            fun _subscriptionName(): JsonField<String> = subscriptionName

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
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Transaction]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var description: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var budgetId: JsonField<String> = JsonMissing.of()
                private var budgetName: JsonField<String> = JsonMissing.of()
                private var categoryId: JsonField<String> = JsonMissing.of()
                private var categoryName: JsonField<String> = JsonMissing.of()
                private var currencyCode: JsonField<String> = JsonMissing.of()
                private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var currencyId: JsonField<String> = JsonMissing.of()
                private var currencyName: JsonField<String> = JsonMissing.of()
                private var currencySymbol: JsonField<String> = JsonMissing.of()
                private var destinationIban: JsonField<String> = JsonMissing.of()
                private var destinationId: JsonField<String> = JsonMissing.of()
                private var destinationName: JsonField<String> = JsonMissing.of()
                private var destinationType: JsonField<AccountTypeProperty> = JsonMissing.of()
                private var foreignAmount: JsonField<String> = JsonMissing.of()
                private var foreignCurrencyCode: JsonField<String> = JsonMissing.of()
                private var foreignCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var foreignCurrencyId: JsonField<String> = JsonMissing.of()
                private var foreignCurrencyName: JsonField<String> = JsonMissing.of()
                private var foreignCurrencySymbol: JsonField<String> = JsonMissing.of()
                private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
                private var pcAmount: JsonField<String> = JsonMissing.of()
                private var pcForeignAmount: JsonField<String> = JsonMissing.of()
                private var piggyBankId: JsonField<String> = JsonMissing.of()
                private var piggyBankName: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
                private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
                private var sourceIban: JsonField<String> = JsonMissing.of()
                private var sourceId: JsonField<String> = JsonMissing.of()
                private var sourceName: JsonField<String> = JsonMissing.of()
                private var sourceType: JsonField<AccountTypeProperty> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var subscriptionName: JsonField<String> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transaction: Transaction) = apply {
                    amount = transaction.amount
                    description = transaction.description
                    id = transaction.id
                    budgetId = transaction.budgetId
                    budgetName = transaction.budgetName
                    categoryId = transaction.categoryId
                    categoryName = transaction.categoryName
                    currencyCode = transaction.currencyCode
                    currencyDecimalPlaces = transaction.currencyDecimalPlaces
                    currencyId = transaction.currencyId
                    currencyName = transaction.currencyName
                    currencySymbol = transaction.currencySymbol
                    destinationIban = transaction.destinationIban
                    destinationId = transaction.destinationId
                    destinationName = transaction.destinationName
                    destinationType = transaction.destinationType
                    foreignAmount = transaction.foreignAmount
                    foreignCurrencyCode = transaction.foreignCurrencyCode
                    foreignCurrencyDecimalPlaces = transaction.foreignCurrencyDecimalPlaces
                    foreignCurrencyId = transaction.foreignCurrencyId
                    foreignCurrencyName = transaction.foreignCurrencyName
                    foreignCurrencySymbol = transaction.foreignCurrencySymbol
                    objectHasCurrencySetting = transaction.objectHasCurrencySetting
                    pcAmount = transaction.pcAmount
                    pcForeignAmount = transaction.pcForeignAmount
                    piggyBankId = transaction.piggyBankId
                    piggyBankName = transaction.piggyBankName
                    primaryCurrencyCode = transaction.primaryCurrencyCode
                    primaryCurrencyDecimalPlaces = transaction.primaryCurrencyDecimalPlaces
                    primaryCurrencyId = transaction.primaryCurrencyId
                    primaryCurrencyName = transaction.primaryCurrencyName
                    primaryCurrencySymbol = transaction.primaryCurrencySymbol
                    sourceIban = transaction.sourceIban
                    sourceId = transaction.sourceId
                    sourceName = transaction.sourceName
                    sourceType = transaction.sourceType
                    subscriptionId = transaction.subscriptionId
                    subscriptionName = transaction.subscriptionName
                    tags = transaction.tags.map { it.toMutableList() }
                    additionalProperties = transaction.additionalProperties.toMutableMap()
                }

                /** Amount of the transaction. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The budget ID for this transaction. */
                fun budgetId(budgetId: String) = budgetId(JsonField.of(budgetId))

                /**
                 * Sets [Builder.budgetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

                /**
                 * The name of the budget to be used. If the budget name is unknown, the ID will be
                 * used or the value will be ignored.
                 */
                fun budgetName(budgetName: String?) = budgetName(JsonField.ofNullable(budgetName))

                /**
                 * Sets [Builder.budgetName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budgetName(budgetName: JsonField<String>) = apply {
                    this.budgetName = budgetName
                }

                /** Category ID for this transaction. */
                fun categoryId(categoryId: String) = categoryId(JsonField.of(categoryId))

                /**
                 * Sets [Builder.categoryId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.categoryId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun categoryId(categoryId: JsonField<String>) = apply {
                    this.categoryId = categoryId
                }

                /** Category name for this transaction. */
                fun categoryName(categoryName: String) = categoryName(JsonField.of(categoryName))

                /**
                 * Sets [Builder.categoryName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.categoryName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun categoryName(categoryName: JsonField<String>) = apply {
                    this.categoryName = categoryName
                }

                /** The currency code of the currency associated with this object. */
                fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

                /**
                 * Sets [Builder.currencyCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyCode(currencyCode: JsonField<String>) = apply {
                    this.currencyCode = currencyCode
                }

                fun currencyDecimalPlaces(currencyDecimalPlaces: Int) =
                    currencyDecimalPlaces(JsonField.of(currencyDecimalPlaces))

                /**
                 * Sets [Builder.currencyDecimalPlaces] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyDecimalPlaces] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun currencyDecimalPlaces(currencyDecimalPlaces: JsonField<Int>) = apply {
                    this.currencyDecimalPlaces = currencyDecimalPlaces
                }

                /** The currency ID of the currency associated with this object. */
                fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

                /**
                 * Sets [Builder.currencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyId(currencyId: JsonField<String>) = apply {
                    this.currencyId = currencyId
                }

                /** The currency name of the currency associated with this object. */
                fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

                /**
                 * Sets [Builder.currencyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyName(currencyName: JsonField<String>) = apply {
                    this.currencyName = currencyName
                }

                fun currencySymbol(currencySymbol: String) =
                    currencySymbol(JsonField.of(currencySymbol))

                /**
                 * Sets [Builder.currencySymbol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencySymbol] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencySymbol(currencySymbol: JsonField<String>) = apply {
                    this.currencySymbol = currencySymbol
                }

                fun destinationIban(destinationIban: String?) =
                    destinationIban(JsonField.ofNullable(destinationIban))

                /**
                 * Sets [Builder.destinationIban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationIban] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun destinationIban(destinationIban: JsonField<String>) = apply {
                    this.destinationIban = destinationIban
                }

                /** ID of the destination account. Submit either this or destination_name. */
                fun destinationId(destinationId: String) =
                    destinationId(JsonField.of(destinationId))

                /**
                 * Sets [Builder.destinationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun destinationId(destinationId: JsonField<String>) = apply {
                    this.destinationId = destinationId
                }

                /** Name of the destination account. Submit either this or destination_id. */
                fun destinationName(destinationName: String) =
                    destinationName(JsonField.of(destinationName))

                /**
                 * Sets [Builder.destinationName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun destinationName(destinationName: JsonField<String>) = apply {
                    this.destinationName = destinationName
                }

                fun destinationType(destinationType: AccountTypeProperty) =
                    destinationType(JsonField.of(destinationType))

                /**
                 * Sets [Builder.destinationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationType] with a well-typed
                 * [AccountTypeProperty] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun destinationType(destinationType: JsonField<AccountTypeProperty>) = apply {
                    this.destinationType = destinationType
                }

                /** Foreign amount of the transaction. */
                fun foreignAmount(foreignAmount: String?) =
                    foreignAmount(JsonField.ofNullable(foreignAmount))

                /**
                 * Sets [Builder.foreignAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun foreignAmount(foreignAmount: JsonField<String>) = apply {
                    this.foreignAmount = foreignAmount
                }

                fun foreignCurrencyCode(foreignCurrencyCode: String?) =
                    foreignCurrencyCode(JsonField.ofNullable(foreignCurrencyCode))

                /**
                 * Sets [Builder.foreignCurrencyCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignCurrencyCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun foreignCurrencyCode(foreignCurrencyCode: JsonField<String>) = apply {
                    this.foreignCurrencyCode = foreignCurrencyCode
                }

                /** Number of decimals in the currency */
                fun foreignCurrencyDecimalPlaces(foreignCurrencyDecimalPlaces: Int?) =
                    foreignCurrencyDecimalPlaces(JsonField.ofNullable(foreignCurrencyDecimalPlaces))

                /**
                 * Alias for [Builder.foreignCurrencyDecimalPlaces].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun foreignCurrencyDecimalPlaces(foreignCurrencyDecimalPlaces: Int) =
                    foreignCurrencyDecimalPlaces(foreignCurrencyDecimalPlaces as Int?)

                /**
                 * Sets [Builder.foreignCurrencyDecimalPlaces] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignCurrencyDecimalPlaces] with a well-typed
                 * [Int] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun foreignCurrencyDecimalPlaces(foreignCurrencyDecimalPlaces: JsonField<Int>) =
                    apply {
                        this.foreignCurrencyDecimalPlaces = foreignCurrencyDecimalPlaces
                    }

                fun foreignCurrencyId(foreignCurrencyId: String?) =
                    foreignCurrencyId(JsonField.ofNullable(foreignCurrencyId))

                /**
                 * Sets [Builder.foreignCurrencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignCurrencyId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun foreignCurrencyId(foreignCurrencyId: JsonField<String>) = apply {
                    this.foreignCurrencyId = foreignCurrencyId
                }

                fun foreignCurrencyName(foreignCurrencyName: String?) =
                    foreignCurrencyName(JsonField.ofNullable(foreignCurrencyName))

                /**
                 * Sets [Builder.foreignCurrencyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignCurrencyName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun foreignCurrencyName(foreignCurrencyName: JsonField<String>) = apply {
                    this.foreignCurrencyName = foreignCurrencyName
                }

                fun foreignCurrencySymbol(foreignCurrencySymbol: String?) =
                    foreignCurrencySymbol(JsonField.ofNullable(foreignCurrencySymbol))

                /**
                 * Sets [Builder.foreignCurrencySymbol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.foreignCurrencySymbol] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun foreignCurrencySymbol(foreignCurrencySymbol: JsonField<String>) = apply {
                    this.foreignCurrencySymbol = foreignCurrencySymbol
                }

                /**
                 * Indicates whether the object has a currency setting. If false, the object uses
                 * the administration's primary currency.
                 */
                fun objectHasCurrencySetting(objectHasCurrencySetting: Boolean) =
                    objectHasCurrencySetting(JsonField.of(objectHasCurrencySetting))

                /**
                 * Sets [Builder.objectHasCurrencySetting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectHasCurrencySetting] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun objectHasCurrencySetting(objectHasCurrencySetting: JsonField<Boolean>) = apply {
                    this.objectHasCurrencySetting = objectHasCurrencySetting
                }

                /** Amount of the transaction in primary currency. */
                fun pcAmount(pcAmount: String) = pcAmount(JsonField.of(pcAmount))

                /**
                 * Sets [Builder.pcAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pcAmount(pcAmount: JsonField<String>) = apply { this.pcAmount = pcAmount }

                /** Foreign amount of the transaction. */
                fun pcForeignAmount(pcForeignAmount: String?) =
                    pcForeignAmount(JsonField.ofNullable(pcForeignAmount))

                /**
                 * Sets [Builder.pcForeignAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcForeignAmount] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pcForeignAmount(pcForeignAmount: JsonField<String>) = apply {
                    this.pcForeignAmount = pcForeignAmount
                }

                fun piggyBankId(piggyBankId: String?) =
                    piggyBankId(JsonField.ofNullable(piggyBankId))

                /**
                 * Sets [Builder.piggyBankId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.piggyBankId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun piggyBankId(piggyBankId: JsonField<String>) = apply {
                    this.piggyBankId = piggyBankId
                }

                fun piggyBankName(piggyBankName: String?) =
                    piggyBankName(JsonField.ofNullable(piggyBankName))

                /**
                 * Sets [Builder.piggyBankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.piggyBankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun piggyBankName(piggyBankName: JsonField<String>) = apply {
                    this.piggyBankName = piggyBankName
                }

                /** The currency code of the administration's primary currency. */
                fun primaryCurrencyCode(primaryCurrencyCode: String) =
                    primaryCurrencyCode(JsonField.of(primaryCurrencyCode))

                /**
                 * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun primaryCurrencyCode(primaryCurrencyCode: JsonField<String>) = apply {
                    this.primaryCurrencyCode = primaryCurrencyCode
                }

                /** The currency decimal places of the administration's primary currency. */
                fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: Int) =
                    primaryCurrencyDecimalPlaces(JsonField.of(primaryCurrencyDecimalPlaces))

                /**
                 * Sets [Builder.primaryCurrencyDecimalPlaces] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencyDecimalPlaces] with a well-typed
                 * [Int] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: JsonField<Int>) =
                    apply {
                        this.primaryCurrencyDecimalPlaces = primaryCurrencyDecimalPlaces
                    }

                /** The currency ID of the administration's primary currency. */
                fun primaryCurrencyId(primaryCurrencyId: String) =
                    primaryCurrencyId(JsonField.of(primaryCurrencyId))

                /**
                 * Sets [Builder.primaryCurrencyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencyId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun primaryCurrencyId(primaryCurrencyId: JsonField<String>) = apply {
                    this.primaryCurrencyId = primaryCurrencyId
                }

                /** The currency name of the administration's primary currency. */
                fun primaryCurrencyName(primaryCurrencyName: String) =
                    primaryCurrencyName(JsonField.of(primaryCurrencyName))

                /**
                 * Sets [Builder.primaryCurrencyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencyName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun primaryCurrencyName(primaryCurrencyName: JsonField<String>) = apply {
                    this.primaryCurrencyName = primaryCurrencyName
                }

                /** The currency symbol of the administration's primary currency. */
                fun primaryCurrencySymbol(primaryCurrencySymbol: String) =
                    primaryCurrencySymbol(JsonField.of(primaryCurrencySymbol))

                /**
                 * Sets [Builder.primaryCurrencySymbol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primaryCurrencySymbol] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun primaryCurrencySymbol(primaryCurrencySymbol: JsonField<String>) = apply {
                    this.primaryCurrencySymbol = primaryCurrencySymbol
                }

                fun sourceIban(sourceIban: String?) = sourceIban(JsonField.ofNullable(sourceIban))

                /**
                 * Sets [Builder.sourceIban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceIban] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceIban(sourceIban: JsonField<String>) = apply {
                    this.sourceIban = sourceIban
                }

                /** ID of the source account. Submit either this or source_name. */
                fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

                /**
                 * Sets [Builder.sourceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

                /** Name of the source account. Submit either this or source_id. */
                fun sourceName(sourceName: String) = sourceName(JsonField.of(sourceName))

                /**
                 * Sets [Builder.sourceName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceName(sourceName: JsonField<String>) = apply {
                    this.sourceName = sourceName
                }

                fun sourceType(sourceType: AccountTypeProperty) =
                    sourceType(JsonField.of(sourceType))

                /**
                 * Sets [Builder.sourceType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceType] with a well-typed
                 * [AccountTypeProperty] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun sourceType(sourceType: JsonField<AccountTypeProperty>) = apply {
                    this.sourceType = sourceType
                }

                fun subscriptionId(subscriptionId: String?) =
                    subscriptionId(JsonField.ofNullable(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                fun subscriptionName(subscriptionName: String?) =
                    subscriptionName(JsonField.ofNullable(subscriptionName))

                /**
                 * Sets [Builder.subscriptionName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subscriptionName(subscriptionName: JsonField<String>) = apply {
                    this.subscriptionName = subscriptionName
                }

                /** Array of tags. */
                fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Transaction =
                    Transaction(
                        checkRequired("amount", amount),
                        checkRequired("description", description),
                        id,
                        budgetId,
                        budgetName,
                        categoryId,
                        categoryName,
                        currencyCode,
                        currencyDecimalPlaces,
                        currencyId,
                        currencyName,
                        currencySymbol,
                        destinationIban,
                        destinationId,
                        destinationName,
                        destinationType,
                        foreignAmount,
                        foreignCurrencyCode,
                        foreignCurrencyDecimalPlaces,
                        foreignCurrencyId,
                        foreignCurrencyName,
                        foreignCurrencySymbol,
                        objectHasCurrencySetting,
                        pcAmount,
                        pcForeignAmount,
                        piggyBankId,
                        piggyBankName,
                        primaryCurrencyCode,
                        primaryCurrencyDecimalPlaces,
                        primaryCurrencyId,
                        primaryCurrencyName,
                        primaryCurrencySymbol,
                        sourceIban,
                        sourceId,
                        sourceName,
                        sourceType,
                        subscriptionId,
                        subscriptionName,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws EmceesProdTesting5InvalidDataException if any value type in this object
             *   doesn't match its expected type.
             */
            fun validate(): Transaction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                description()
                id()
                budgetId()
                budgetName()
                categoryId()
                categoryName()
                currencyCode()
                currencyDecimalPlaces()
                currencyId()
                currencyName()
                currencySymbol()
                destinationIban()
                destinationId()
                destinationName()
                destinationType()?.validate()
                foreignAmount()
                foreignCurrencyCode()
                foreignCurrencyDecimalPlaces()
                foreignCurrencyId()
                foreignCurrencyName()
                foreignCurrencySymbol()
                objectHasCurrencySetting()
                pcAmount()
                pcForeignAmount()
                piggyBankId()
                piggyBankName()
                primaryCurrencyCode()
                primaryCurrencyDecimalPlaces()
                primaryCurrencyId()
                primaryCurrencyName()
                primaryCurrencySymbol()
                sourceIban()
                sourceId()
                sourceName()
                sourceType()?.validate()
                subscriptionId()
                subscriptionName()
                tags()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (id.asKnown() == null) 0 else 1) +
                    (if (budgetId.asKnown() == null) 0 else 1) +
                    (if (budgetName.asKnown() == null) 0 else 1) +
                    (if (categoryId.asKnown() == null) 0 else 1) +
                    (if (categoryName.asKnown() == null) 0 else 1) +
                    (if (currencyCode.asKnown() == null) 0 else 1) +
                    (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (currencyId.asKnown() == null) 0 else 1) +
                    (if (currencyName.asKnown() == null) 0 else 1) +
                    (if (currencySymbol.asKnown() == null) 0 else 1) +
                    (if (destinationIban.asKnown() == null) 0 else 1) +
                    (if (destinationId.asKnown() == null) 0 else 1) +
                    (if (destinationName.asKnown() == null) 0 else 1) +
                    (destinationType.asKnown()?.validity() ?: 0) +
                    (if (foreignAmount.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyCode.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyId.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyName.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencySymbol.asKnown() == null) 0 else 1) +
                    (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                    (if (pcAmount.asKnown() == null) 0 else 1) +
                    (if (pcForeignAmount.asKnown() == null) 0 else 1) +
                    (if (piggyBankId.asKnown() == null) 0 else 1) +
                    (if (piggyBankName.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                    (if (sourceIban.asKnown() == null) 0 else 1) +
                    (if (sourceId.asKnown() == null) 0 else 1) +
                    (if (sourceName.asKnown() == null) 0 else 1) +
                    (sourceType.asKnown()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (subscriptionName.asKnown() == null) 0 else 1) +
                    (tags.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Transaction &&
                    amount == other.amount &&
                    description == other.description &&
                    id == other.id &&
                    budgetId == other.budgetId &&
                    budgetName == other.budgetName &&
                    categoryId == other.categoryId &&
                    categoryName == other.categoryName &&
                    currencyCode == other.currencyCode &&
                    currencyDecimalPlaces == other.currencyDecimalPlaces &&
                    currencyId == other.currencyId &&
                    currencyName == other.currencyName &&
                    currencySymbol == other.currencySymbol &&
                    destinationIban == other.destinationIban &&
                    destinationId == other.destinationId &&
                    destinationName == other.destinationName &&
                    destinationType == other.destinationType &&
                    foreignAmount == other.foreignAmount &&
                    foreignCurrencyCode == other.foreignCurrencyCode &&
                    foreignCurrencyDecimalPlaces == other.foreignCurrencyDecimalPlaces &&
                    foreignCurrencyId == other.foreignCurrencyId &&
                    foreignCurrencyName == other.foreignCurrencyName &&
                    foreignCurrencySymbol == other.foreignCurrencySymbol &&
                    objectHasCurrencySetting == other.objectHasCurrencySetting &&
                    pcAmount == other.pcAmount &&
                    pcForeignAmount == other.pcForeignAmount &&
                    piggyBankId == other.piggyBankId &&
                    piggyBankName == other.piggyBankName &&
                    primaryCurrencyCode == other.primaryCurrencyCode &&
                    primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                    primaryCurrencyId == other.primaryCurrencyId &&
                    primaryCurrencyName == other.primaryCurrencyName &&
                    primaryCurrencySymbol == other.primaryCurrencySymbol &&
                    sourceIban == other.sourceIban &&
                    sourceId == other.sourceId &&
                    sourceName == other.sourceName &&
                    sourceType == other.sourceType &&
                    subscriptionId == other.subscriptionId &&
                    subscriptionName == other.subscriptionName &&
                    tags == other.tags &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    description,
                    id,
                    budgetId,
                    budgetName,
                    categoryId,
                    categoryName,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    destinationIban,
                    destinationId,
                    destinationName,
                    destinationType,
                    foreignAmount,
                    foreignCurrencyCode,
                    foreignCurrencyDecimalPlaces,
                    foreignCurrencyId,
                    foreignCurrencyName,
                    foreignCurrencySymbol,
                    objectHasCurrencySetting,
                    pcAmount,
                    pcForeignAmount,
                    piggyBankId,
                    piggyBankName,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    sourceIban,
                    sourceId,
                    sourceName,
                    sourceType,
                    subscriptionId,
                    subscriptionName,
                    tags,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Transaction{amount=$amount, description=$description, id=$id, budgetId=$budgetId, budgetName=$budgetName, categoryId=$categoryId, categoryName=$categoryName, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, destinationIban=$destinationIban, destinationId=$destinationId, destinationName=$destinationName, destinationType=$destinationType, foreignAmount=$foreignAmount, foreignCurrencyCode=$foreignCurrencyCode, foreignCurrencyDecimalPlaces=$foreignCurrencyDecimalPlaces, foreignCurrencyId=$foreignCurrencyId, foreignCurrencyName=$foreignCurrencyName, foreignCurrencySymbol=$foreignCurrencySymbol, objectHasCurrencySetting=$objectHasCurrencySetting, pcAmount=$pcAmount, pcForeignAmount=$pcForeignAmount, piggyBankId=$piggyBankId, piggyBankName=$piggyBankName, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, sourceIban=$sourceIban, sourceId=$sourceId, sourceName=$sourceName, sourceType=$sourceType, subscriptionId=$subscriptionId, subscriptionName=$subscriptionName, tags=$tags, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                active == other.active &&
                applyRules == other.applyRules &&
                createdAt == other.createdAt &&
                description == other.description &&
                firstDate == other.firstDate &&
                latestDate == other.latestDate &&
                notes == other.notes &&
                nrOfRepetitions == other.nrOfRepetitions &&
                repeatUntil == other.repeatUntil &&
                repetitions == other.repetitions &&
                title == other.title &&
                transactions == other.transactions &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                active,
                applyRules,
                createdAt,
                description,
                firstDate,
                latestDate,
                notes,
                nrOfRepetitions,
                repeatUntil,
                repetitions,
                title,
                transactions,
                type,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{active=$active, applyRules=$applyRules, createdAt=$createdAt, description=$description, firstDate=$firstDate, latestDate=$latestDate, notes=$notes, nrOfRepetitions=$nrOfRepetitions, repeatUntil=$repeatUntil, repetitions=$repetitions, title=$title, transactions=$transactions, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecurrenceRead &&
            id == other.id &&
            attributes == other.attributes &&
            links == other.links &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, attributes, links, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecurrenceRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
