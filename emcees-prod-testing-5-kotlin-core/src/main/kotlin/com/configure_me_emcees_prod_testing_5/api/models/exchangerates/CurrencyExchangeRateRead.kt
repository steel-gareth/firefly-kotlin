// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.exchangerates

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CurrencyExchangeRateRead
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
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attributes(): Attributes? = attributes.getNullable("attributes")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun links(): ObjectLink? = links.getNullable("links")

    /**
     * Immutable value
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

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

        /** Returns a mutable builder for constructing an instance of [CurrencyExchangeRateRead]. */
        fun builder() = Builder()
    }

    /** A builder for [CurrencyExchangeRateRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var links: JsonField<ObjectLink> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(currencyExchangeRateRead: CurrencyExchangeRateRead) = apply {
            id = currencyExchangeRateRead.id
            attributes = currencyExchangeRateRead.attributes
            links = currencyExchangeRateRead.links
            type = currencyExchangeRateRead.type
            additionalProperties = currencyExchangeRateRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CurrencyExchangeRateRead].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CurrencyExchangeRateRead =
            CurrencyExchangeRateRead(
                id,
                attributes,
                links,
                type,
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
    fun validate(): CurrencyExchangeRateRead = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes()?.validate()
        links()?.validate()
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
        private val createdAt: JsonField<OffsetDateTime>,
        private val date: JsonField<OffsetDateTime>,
        private val fromCurrencyCode: JsonField<String>,
        private val fromCurrencyDecimalPlaces: JsonField<Int>,
        private val fromCurrencyId: JsonField<String>,
        private val fromCurrencyName: JsonField<String>,
        private val fromCurrencySymbol: JsonField<String>,
        private val rate: JsonField<String>,
        private val toCurrencyCode: JsonField<String>,
        private val toCurrencyDecimalPlaces: JsonField<Int>,
        private val toCurrencyId: JsonField<String>,
        private val toCurrencyName: JsonField<String>,
        private val toCurrencySymbol: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("date")
            @ExcludeMissing
            date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("from_currency_code")
            @ExcludeMissing
            fromCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from_currency_decimal_places")
            @ExcludeMissing
            fromCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("from_currency_id")
            @ExcludeMissing
            fromCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from_currency_name")
            @ExcludeMissing
            fromCurrencyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from_currency_symbol")
            @ExcludeMissing
            fromCurrencySymbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_currency_code")
            @ExcludeMissing
            toCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_currency_decimal_places")
            @ExcludeMissing
            toCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("to_currency_id")
            @ExcludeMissing
            toCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_currency_name")
            @ExcludeMissing
            toCurrencyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to_currency_symbol")
            @ExcludeMissing
            toCurrencySymbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            createdAt,
            date,
            fromCurrencyCode,
            fromCurrencyDecimalPlaces,
            fromCurrencyId,
            fromCurrencyName,
            fromCurrencySymbol,
            rate,
            toCurrencyCode,
            toCurrencyDecimalPlaces,
            toCurrencyId,
            toCurrencyName,
            toCurrencySymbol,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Date and time of the exchange rate.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun date(): OffsetDateTime? = date.getNullable("date")

        /**
         * Base currency code for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromCurrencyCode(): String? = fromCurrencyCode.getNullable("from_currency_code")

        /**
         * Base currency decimal places for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromCurrencyDecimalPlaces(): Int? =
            fromCurrencyDecimalPlaces.getNullable("from_currency_decimal_places")

        /**
         * Base currency ID for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromCurrencyId(): String? = fromCurrencyId.getNullable("from_currency_id")

        /**
         * Base currency name for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromCurrencyName(): String? = fromCurrencyName.getNullable("from_currency_name")

        /**
         * Base currency symbol for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fromCurrencySymbol(): String? = fromCurrencySymbol.getNullable("from_currency_symbol")

        /**
         * The actual exchange rate. How many 'to' currency will you get for 1 'from' currency?
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rate(): String? = rate.getNullable("rate")

        /**
         * Destination currency code for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toCurrencyCode(): String? = toCurrencyCode.getNullable("to_currency_code")

        /**
         * Destination currency decimal places for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toCurrencyDecimalPlaces(): Int? =
            toCurrencyDecimalPlaces.getNullable("to_currency_decimal_places")

        /**
         * Destination currency ID for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toCurrencyId(): String? = toCurrencyId.getNullable("to_currency_id")

        /**
         * Destination currency name for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toCurrencyName(): String? = toCurrencyName.getNullable("to_currency_name")

        /**
         * Destination currency symbol for this exchange rate entry.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toCurrencySymbol(): String? = toCurrencySymbol.getNullable("to_currency_symbol")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /**
         * Returns the raw JSON value of [fromCurrencyCode].
         *
         * Unlike [fromCurrencyCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("from_currency_code")
        @ExcludeMissing
        fun _fromCurrencyCode(): JsonField<String> = fromCurrencyCode

        /**
         * Returns the raw JSON value of [fromCurrencyDecimalPlaces].
         *
         * Unlike [fromCurrencyDecimalPlaces], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("from_currency_decimal_places")
        @ExcludeMissing
        fun _fromCurrencyDecimalPlaces(): JsonField<Int> = fromCurrencyDecimalPlaces

        /**
         * Returns the raw JSON value of [fromCurrencyId].
         *
         * Unlike [fromCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("from_currency_id")
        @ExcludeMissing
        fun _fromCurrencyId(): JsonField<String> = fromCurrencyId

        /**
         * Returns the raw JSON value of [fromCurrencyName].
         *
         * Unlike [fromCurrencyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("from_currency_name")
        @ExcludeMissing
        fun _fromCurrencyName(): JsonField<String> = fromCurrencyName

        /**
         * Returns the raw JSON value of [fromCurrencySymbol].
         *
         * Unlike [fromCurrencySymbol], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("from_currency_symbol")
        @ExcludeMissing
        fun _fromCurrencySymbol(): JsonField<String> = fromCurrencySymbol

        /**
         * Returns the raw JSON value of [rate].
         *
         * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

        /**
         * Returns the raw JSON value of [toCurrencyCode].
         *
         * Unlike [toCurrencyCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("to_currency_code")
        @ExcludeMissing
        fun _toCurrencyCode(): JsonField<String> = toCurrencyCode

        /**
         * Returns the raw JSON value of [toCurrencyDecimalPlaces].
         *
         * Unlike [toCurrencyDecimalPlaces], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("to_currency_decimal_places")
        @ExcludeMissing
        fun _toCurrencyDecimalPlaces(): JsonField<Int> = toCurrencyDecimalPlaces

        /**
         * Returns the raw JSON value of [toCurrencyId].
         *
         * Unlike [toCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("to_currency_id")
        @ExcludeMissing
        fun _toCurrencyId(): JsonField<String> = toCurrencyId

        /**
         * Returns the raw JSON value of [toCurrencyName].
         *
         * Unlike [toCurrencyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("to_currency_name")
        @ExcludeMissing
        fun _toCurrencyName(): JsonField<String> = toCurrencyName

        /**
         * Returns the raw JSON value of [toCurrencySymbol].
         *
         * Unlike [toCurrencySymbol], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("to_currency_symbol")
        @ExcludeMissing
        fun _toCurrencySymbol(): JsonField<String> = toCurrencySymbol

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

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var date: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fromCurrencyCode: JsonField<String> = JsonMissing.of()
            private var fromCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var fromCurrencyId: JsonField<String> = JsonMissing.of()
            private var fromCurrencyName: JsonField<String> = JsonMissing.of()
            private var fromCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var rate: JsonField<String> = JsonMissing.of()
            private var toCurrencyCode: JsonField<String> = JsonMissing.of()
            private var toCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var toCurrencyId: JsonField<String> = JsonMissing.of()
            private var toCurrencyName: JsonField<String> = JsonMissing.of()
            private var toCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                createdAt = attributes.createdAt
                date = attributes.date
                fromCurrencyCode = attributes.fromCurrencyCode
                fromCurrencyDecimalPlaces = attributes.fromCurrencyDecimalPlaces
                fromCurrencyId = attributes.fromCurrencyId
                fromCurrencyName = attributes.fromCurrencyName
                fromCurrencySymbol = attributes.fromCurrencySymbol
                rate = attributes.rate
                toCurrencyCode = attributes.toCurrencyCode
                toCurrencyDecimalPlaces = attributes.toCurrencyDecimalPlaces
                toCurrencyId = attributes.toCurrencyId
                toCurrencyName = attributes.toCurrencyName
                toCurrencySymbol = attributes.toCurrencySymbol
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

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

            /** Date and time of the exchange rate. */
            fun date(date: OffsetDateTime) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            /** Base currency code for this exchange rate entry. */
            fun fromCurrencyCode(fromCurrencyCode: String) =
                fromCurrencyCode(JsonField.of(fromCurrencyCode))

            /**
             * Sets [Builder.fromCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromCurrencyCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromCurrencyCode(fromCurrencyCode: JsonField<String>) = apply {
                this.fromCurrencyCode = fromCurrencyCode
            }

            /** Base currency decimal places for this exchange rate entry. */
            fun fromCurrencyDecimalPlaces(fromCurrencyDecimalPlaces: Int) =
                fromCurrencyDecimalPlaces(JsonField.of(fromCurrencyDecimalPlaces))

            /**
             * Sets [Builder.fromCurrencyDecimalPlaces] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromCurrencyDecimalPlaces] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fromCurrencyDecimalPlaces(fromCurrencyDecimalPlaces: JsonField<Int>) = apply {
                this.fromCurrencyDecimalPlaces = fromCurrencyDecimalPlaces
            }

            /** Base currency ID for this exchange rate entry. */
            fun fromCurrencyId(fromCurrencyId: String) =
                fromCurrencyId(JsonField.of(fromCurrencyId))

            /**
             * Sets [Builder.fromCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromCurrencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromCurrencyId(fromCurrencyId: JsonField<String>) = apply {
                this.fromCurrencyId = fromCurrencyId
            }

            /** Base currency name for this exchange rate entry. */
            fun fromCurrencyName(fromCurrencyName: String) =
                fromCurrencyName(JsonField.of(fromCurrencyName))

            /**
             * Sets [Builder.fromCurrencyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromCurrencyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromCurrencyName(fromCurrencyName: JsonField<String>) = apply {
                this.fromCurrencyName = fromCurrencyName
            }

            /** Base currency symbol for this exchange rate entry. */
            fun fromCurrencySymbol(fromCurrencySymbol: String) =
                fromCurrencySymbol(JsonField.of(fromCurrencySymbol))

            /**
             * Sets [Builder.fromCurrencySymbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fromCurrencySymbol] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromCurrencySymbol(fromCurrencySymbol: JsonField<String>) = apply {
                this.fromCurrencySymbol = fromCurrencySymbol
            }

            /**
             * The actual exchange rate. How many 'to' currency will you get for 1 'from' currency?
             */
            fun rate(rate: String) = rate(JsonField.of(rate))

            /**
             * Sets [Builder.rate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rate] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rate(rate: JsonField<String>) = apply { this.rate = rate }

            /** Destination currency code for this exchange rate entry. */
            fun toCurrencyCode(toCurrencyCode: String) =
                toCurrencyCode(JsonField.of(toCurrencyCode))

            /**
             * Sets [Builder.toCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toCurrencyCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toCurrencyCode(toCurrencyCode: JsonField<String>) = apply {
                this.toCurrencyCode = toCurrencyCode
            }

            /** Destination currency decimal places for this exchange rate entry. */
            fun toCurrencyDecimalPlaces(toCurrencyDecimalPlaces: Int) =
                toCurrencyDecimalPlaces(JsonField.of(toCurrencyDecimalPlaces))

            /**
             * Sets [Builder.toCurrencyDecimalPlaces] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toCurrencyDecimalPlaces] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun toCurrencyDecimalPlaces(toCurrencyDecimalPlaces: JsonField<Int>) = apply {
                this.toCurrencyDecimalPlaces = toCurrencyDecimalPlaces
            }

            /** Destination currency ID for this exchange rate entry. */
            fun toCurrencyId(toCurrencyId: String) = toCurrencyId(JsonField.of(toCurrencyId))

            /**
             * Sets [Builder.toCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toCurrencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toCurrencyId(toCurrencyId: JsonField<String>) = apply {
                this.toCurrencyId = toCurrencyId
            }

            /** Destination currency name for this exchange rate entry. */
            fun toCurrencyName(toCurrencyName: String) =
                toCurrencyName(JsonField.of(toCurrencyName))

            /**
             * Sets [Builder.toCurrencyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toCurrencyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toCurrencyName(toCurrencyName: JsonField<String>) = apply {
                this.toCurrencyName = toCurrencyName
            }

            /** Destination currency symbol for this exchange rate entry. */
            fun toCurrencySymbol(toCurrencySymbol: String) =
                toCurrencySymbol(JsonField.of(toCurrencySymbol))

            /**
             * Sets [Builder.toCurrencySymbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toCurrencySymbol] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toCurrencySymbol(toCurrencySymbol: JsonField<String>) = apply {
                this.toCurrencySymbol = toCurrencySymbol
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
             */
            fun build(): Attributes =
                Attributes(
                    createdAt,
                    date,
                    fromCurrencyCode,
                    fromCurrencyDecimalPlaces,
                    fromCurrencyId,
                    fromCurrencyName,
                    fromCurrencySymbol,
                    rate,
                    toCurrencyCode,
                    toCurrencyDecimalPlaces,
                    toCurrencyId,
                    toCurrencyName,
                    toCurrencySymbol,
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

            createdAt()
            date()
            fromCurrencyCode()
            fromCurrencyDecimalPlaces()
            fromCurrencyId()
            fromCurrencyName()
            fromCurrencySymbol()
            rate()
            toCurrencyCode()
            toCurrencyDecimalPlaces()
            toCurrencyId()
            toCurrencyName()
            toCurrencySymbol()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
                (if (date.asKnown() == null) 0 else 1) +
                (if (fromCurrencyCode.asKnown() == null) 0 else 1) +
                (if (fromCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (fromCurrencyId.asKnown() == null) 0 else 1) +
                (if (fromCurrencyName.asKnown() == null) 0 else 1) +
                (if (fromCurrencySymbol.asKnown() == null) 0 else 1) +
                (if (rate.asKnown() == null) 0 else 1) +
                (if (toCurrencyCode.asKnown() == null) 0 else 1) +
                (if (toCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (toCurrencyId.asKnown() == null) 0 else 1) +
                (if (toCurrencyName.asKnown() == null) 0 else 1) +
                (if (toCurrencySymbol.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                createdAt == other.createdAt &&
                date == other.date &&
                fromCurrencyCode == other.fromCurrencyCode &&
                fromCurrencyDecimalPlaces == other.fromCurrencyDecimalPlaces &&
                fromCurrencyId == other.fromCurrencyId &&
                fromCurrencyName == other.fromCurrencyName &&
                fromCurrencySymbol == other.fromCurrencySymbol &&
                rate == other.rate &&
                toCurrencyCode == other.toCurrencyCode &&
                toCurrencyDecimalPlaces == other.toCurrencyDecimalPlaces &&
                toCurrencyId == other.toCurrencyId &&
                toCurrencyName == other.toCurrencyName &&
                toCurrencySymbol == other.toCurrencySymbol &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                date,
                fromCurrencyCode,
                fromCurrencyDecimalPlaces,
                fromCurrencyId,
                fromCurrencyName,
                fromCurrencySymbol,
                rate,
                toCurrencyCode,
                toCurrencyDecimalPlaces,
                toCurrencyId,
                toCurrencyName,
                toCurrencySymbol,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{createdAt=$createdAt, date=$date, fromCurrencyCode=$fromCurrencyCode, fromCurrencyDecimalPlaces=$fromCurrencyDecimalPlaces, fromCurrencyId=$fromCurrencyId, fromCurrencyName=$fromCurrencyName, fromCurrencySymbol=$fromCurrencySymbol, rate=$rate, toCurrencyCode=$toCurrencyCode, toCurrencyDecimalPlaces=$toCurrencyDecimalPlaces, toCurrencyId=$toCurrencyId, toCurrencyName=$toCurrencyName, toCurrencySymbol=$toCurrencySymbol, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrencyExchangeRateRead &&
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
        "CurrencyExchangeRateRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
