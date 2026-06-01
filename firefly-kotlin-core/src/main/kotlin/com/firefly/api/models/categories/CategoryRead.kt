// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.categories

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.checkKnown
import com.firefly.api.core.checkRequired
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import com.firefly.api.models.availablebudgets.ArrayEntryWithCurrencyAndSum
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CategoryRead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, type, mutableMapOf())

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * Immutable value
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
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
         * Returns a mutable builder for constructing an instance of [CategoryRead].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CategoryRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(categoryRead: CategoryRead) = apply {
            id = categoryRead.id
            attributes = categoryRead.attributes
            type = categoryRead.type
            additionalProperties = categoryRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CategoryRead].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CategoryRead =
            CategoryRead(
                checkRequired("id", id),
                checkRequired("attributes", attributes),
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
     * @throws FireflyInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CategoryRead = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().validate()
        type()
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
        (if (id.asKnown() == null) 0 else 1) +
            (attributes.asKnown()?.validity() ?: 0) +
            (if (type.asKnown() == null) 0 else 1)

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val earned: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val notes: JsonField<String>,
        private val objectHasCurrencySetting: JsonField<Boolean>,
        private val pcEarned: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val pcSpent: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val pcTransferred: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencyName: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val spent: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val transferred: JsonField<List<ArrayEntryWithCurrencyAndSum>>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("earned")
            @ExcludeMissing
            earned: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_has_currency_setting")
            @ExcludeMissing
            objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pc_earned")
            @ExcludeMissing
            pcEarned: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("pc_spent")
            @ExcludeMissing
            pcSpent: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("pc_transferred")
            @ExcludeMissing
            pcTransferred: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
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
            @JsonProperty("spent")
            @ExcludeMissing
            spent: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("transferred")
            @ExcludeMissing
            transferred: JsonField<List<ArrayEntryWithCurrencyAndSum>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            name,
            createdAt,
            earned,
            notes,
            objectHasCurrencySetting,
            pcEarned,
            pcSpent,
            pcTransferred,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            spent,
            transferred,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Amount(s) earned in the currencies in the database for this category. ONLY present when
         * start and date are set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earned(): List<ArrayEntryWithCurrencyAndSum>? = earned.getNullable("earned")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * This object never has its own currency setting, so this value is always false.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectHasCurrencySetting(): Boolean? =
            objectHasCurrencySetting.getNullable("object_has_currency_setting")

        /**
         * Amount(s) earned in the primary currency in the database for this category. ONLY present
         * when start and date are set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pcEarned(): List<ArrayEntryWithCurrencyAndSum>? = pcEarned.getNullable("pc_earned")

        /**
         * Amount(s) spent in the primary currency in the database for this category. ONLY present
         * when start and date are set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pcSpent(): List<ArrayEntryWithCurrencyAndSum>? = pcSpent.getNullable("pc_spent")

        /**
         * Amount(s) transferred in primary currency in the database for this category. ONLY present
         * when start and date are set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pcTransferred(): List<ArrayEntryWithCurrencyAndSum>? =
            pcTransferred.getNullable("pc_transferred")

        /**
         * The currency code of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyCode(): String? =
            primaryCurrencyCode.getNullable("primary_currency_code")

        /**
         * The currency decimal places of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyDecimalPlaces(): Int? =
            primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

        /**
         * The currency ID of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

        /**
         * The currency name of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyName(): String? =
            primaryCurrencyName.getNullable("primary_currency_name")

        /**
         * The currency symbol of the administration's primary currency.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencySymbol(): String? =
            primaryCurrencySymbol.getNullable("primary_currency_symbol")

        /**
         * Amount(s) spent in the currencies in the database for this category. ONLY present when
         * start and date are set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spent(): List<ArrayEntryWithCurrencyAndSum>? = spent.getNullable("spent")

        /**
         * Amount(s) transferred in the currencies in the database for this category. ONLY present
         * when start and date are set.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferred(): List<ArrayEntryWithCurrencyAndSum>? =
            transferred.getNullable("transferred")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [earned].
         *
         * Unlike [earned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("earned")
        @ExcludeMissing
        fun _earned(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = earned

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
         * Returns the raw JSON value of [pcEarned].
         *
         * Unlike [pcEarned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_earned")
        @ExcludeMissing
        fun _pcEarned(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = pcEarned

        /**
         * Returns the raw JSON value of [pcSpent].
         *
         * Unlike [pcSpent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pc_spent")
        @ExcludeMissing
        fun _pcSpent(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = pcSpent

        /**
         * Returns the raw JSON value of [pcTransferred].
         *
         * Unlike [pcTransferred], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pc_transferred")
        @ExcludeMissing
        fun _pcTransferred(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = pcTransferred

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
         * Unlike [primaryCurrencyDecimalPlaces], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_currency_decimal_places")
        @ExcludeMissing
        fun _primaryCurrencyDecimalPlaces(): JsonField<Int> = primaryCurrencyDecimalPlaces

        /**
         * Returns the raw JSON value of [primaryCurrencyId].
         *
         * Unlike [primaryCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [spent].
         *
         * Unlike [spent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spent")
        @ExcludeMissing
        fun _spent(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = spent

        /**
         * Returns the raw JSON value of [transferred].
         *
         * Unlike [transferred], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transferred")
        @ExcludeMissing
        fun _transferred(): JsonField<List<ArrayEntryWithCurrencyAndSum>> = transferred

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

            /**
             * Returns a mutable builder for constructing an instance of [Attributes].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var earned: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
            private var pcEarned: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var pcSpent: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var pcTransferred: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var spent: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var transferred: JsonField<MutableList<ArrayEntryWithCurrencyAndSum>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                name = attributes.name
                createdAt = attributes.createdAt
                earned = attributes.earned.map { it.toMutableList() }
                notes = attributes.notes
                objectHasCurrencySetting = attributes.objectHasCurrencySetting
                pcEarned = attributes.pcEarned.map { it.toMutableList() }
                pcSpent = attributes.pcSpent.map { it.toMutableList() }
                pcTransferred = attributes.pcTransferred.map { it.toMutableList() }
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencyName = attributes.primaryCurrencyName
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                spent = attributes.spent.map { it.toMutableList() }
                transferred = attributes.transferred.map { it.toMutableList() }
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Amount(s) earned in the currencies in the database for this category. ONLY present
             * when start and date are set.
             */
            fun earned(earned: List<ArrayEntryWithCurrencyAndSum>) = earned(JsonField.of(earned))

            /**
             * Sets [Builder.earned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.earned] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun earned(earned: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.earned = earned.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.earned].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEarned(earned: ArrayEntryWithCurrencyAndSum) = apply {
                this.earned =
                    (this.earned ?: JsonField.of(mutableListOf())).also {
                        checkKnown("earned", it).add(earned)
                    }
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

            /** This object never has its own currency setting, so this value is always false. */
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

            /**
             * Amount(s) earned in the primary currency in the database for this category. ONLY
             * present when start and date are set.
             */
            fun pcEarned(pcEarned: List<ArrayEntryWithCurrencyAndSum>) =
                pcEarned(JsonField.of(pcEarned))

            /**
             * Sets [Builder.pcEarned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcEarned] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun pcEarned(pcEarned: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.pcEarned = pcEarned.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.pcEarned].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPcEarned(pcEarned: ArrayEntryWithCurrencyAndSum) = apply {
                this.pcEarned =
                    (this.pcEarned ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pcEarned", it).add(pcEarned)
                    }
            }

            /**
             * Amount(s) spent in the primary currency in the database for this category. ONLY
             * present when start and date are set.
             */
            fun pcSpent(pcSpent: List<ArrayEntryWithCurrencyAndSum>) =
                pcSpent(JsonField.of(pcSpent))

            /**
             * Sets [Builder.pcSpent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcSpent] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun pcSpent(pcSpent: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.pcSpent = pcSpent.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.pcSpent].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPcSpent(pcSpent: ArrayEntryWithCurrencyAndSum) = apply {
                this.pcSpent =
                    (this.pcSpent ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pcSpent", it).add(pcSpent)
                    }
            }

            /**
             * Amount(s) transferred in primary currency in the database for this category. ONLY
             * present when start and date are set.
             */
            fun pcTransferred(pcTransferred: List<ArrayEntryWithCurrencyAndSum>) =
                pcTransferred(JsonField.of(pcTransferred))

            /**
             * Sets [Builder.pcTransferred] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pcTransferred] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun pcTransferred(pcTransferred: JsonField<List<ArrayEntryWithCurrencyAndSum>>) =
                apply {
                    this.pcTransferred = pcTransferred.map { it.toMutableList() }
                }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.pcTransferred].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPcTransferred(pcTransferred: ArrayEntryWithCurrencyAndSum) = apply {
                this.pcTransferred =
                    (this.pcTransferred ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pcTransferred", it).add(pcTransferred)
                    }
            }

            /** The currency code of the administration's primary currency. */
            fun primaryCurrencyCode(primaryCurrencyCode: String) =
                primaryCurrencyCode(JsonField.of(primaryCurrencyCode))

            /**
             * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: JsonField<Int>) = apply {
                this.primaryCurrencyDecimalPlaces = primaryCurrencyDecimalPlaces
            }

            /** The currency ID of the administration's primary currency. */
            fun primaryCurrencyId(primaryCurrencyId: String) =
                primaryCurrencyId(JsonField.of(primaryCurrencyId))

            /**
             * Sets [Builder.primaryCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.primaryCurrencySymbol] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCurrencySymbol(primaryCurrencySymbol: JsonField<String>) = apply {
                this.primaryCurrencySymbol = primaryCurrencySymbol
            }

            /**
             * Amount(s) spent in the currencies in the database for this category. ONLY present
             * when start and date are set.
             */
            fun spent(spent: List<ArrayEntryWithCurrencyAndSum>) = spent(JsonField.of(spent))

            /**
             * Sets [Builder.spent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spent] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun spent(spent: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.spent = spent.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.spent].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpent(spent: ArrayEntryWithCurrencyAndSum) = apply {
                this.spent =
                    (this.spent ?: JsonField.of(mutableListOf())).also {
                        checkKnown("spent", it).add(spent)
                    }
            }

            /**
             * Amount(s) transferred in the currencies in the database for this category. ONLY
             * present when start and date are set.
             */
            fun transferred(transferred: List<ArrayEntryWithCurrencyAndSum>) =
                transferred(JsonField.of(transferred))

            /**
             * Sets [Builder.transferred] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferred] with a well-typed
             * `List<ArrayEntryWithCurrencyAndSum>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun transferred(transferred: JsonField<List<ArrayEntryWithCurrencyAndSum>>) = apply {
                this.transferred = transferred.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArrayEntryWithCurrencyAndSum] to [Builder.transferred].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTransferred(transferred: ArrayEntryWithCurrencyAndSum) = apply {
                this.transferred =
                    (this.transferred ?: JsonField.of(mutableListOf())).also {
                        checkKnown("transferred", it).add(transferred)
                    }
            }

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
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("name", name),
                    createdAt,
                    (earned ?: JsonMissing.of()).map { it.toImmutable() },
                    notes,
                    objectHasCurrencySetting,
                    (pcEarned ?: JsonMissing.of()).map { it.toImmutable() },
                    (pcSpent ?: JsonMissing.of()).map { it.toImmutable() },
                    (pcTransferred ?: JsonMissing.of()).map { it.toImmutable() },
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    (spent ?: JsonMissing.of()).map { it.toImmutable() },
                    (transferred ?: JsonMissing.of()).map { it.toImmutable() },
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
         * @throws FireflyInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            name()
            createdAt()
            earned()?.forEach { it.validate() }
            notes()
            objectHasCurrencySetting()
            pcEarned()?.forEach { it.validate() }
            pcSpent()?.forEach { it.validate() }
            pcTransferred()?.forEach { it.validate() }
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencyName()
            primaryCurrencySymbol()
            spent()?.forEach { it.validate() }
            transferred()?.forEach { it.validate() }
            updatedAt()
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
            (if (name.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (earned.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                (pcEarned.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (pcSpent.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (pcTransferred.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (spent.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (transferred.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                name == other.name &&
                createdAt == other.createdAt &&
                earned == other.earned &&
                notes == other.notes &&
                objectHasCurrencySetting == other.objectHasCurrencySetting &&
                pcEarned == other.pcEarned &&
                pcSpent == other.pcSpent &&
                pcTransferred == other.pcTransferred &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencyName == other.primaryCurrencyName &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                spent == other.spent &&
                transferred == other.transferred &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                createdAt,
                earned,
                notes,
                objectHasCurrencySetting,
                pcEarned,
                pcSpent,
                pcTransferred,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                spent,
                transferred,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{name=$name, createdAt=$createdAt, earned=$earned, notes=$notes, objectHasCurrencySetting=$objectHasCurrencySetting, pcEarned=$pcEarned, pcSpent=$pcSpent, pcTransferred=$pcTransferred, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, spent=$spent, transferred=$transferred, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryRead &&
            id == other.id &&
            attributes == other.attributes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, attributes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CategoryRead{id=$id, attributes=$attributes, type=$type, additionalProperties=$additionalProperties}"
}
