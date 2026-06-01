// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.piggybanks

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.accounts.Meta
import com.configure_me_emcees_prod_testing_5.api.models.accounts.PageLink
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PiggyBankEventArray
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val links: JsonField<PageLink>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<PageLink> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, links, meta, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): PageLink = links.getRequired("links")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meta(): Meta = meta.getRequired("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<PageLink> = links

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
         * Returns a mutable builder for constructing an instance of [PiggyBankEventArray].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .links()
         * .meta()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PiggyBankEventArray]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var links: JsonField<PageLink>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(piggyBankEventArray: PiggyBankEventArray) = apply {
            data = piggyBankEventArray.data.map { it.toMutableList() }
            links = piggyBankEventArray.links
            meta = piggyBankEventArray.meta
            additionalProperties = piggyBankEventArray.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun links(links: PageLink) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [PageLink] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun links(links: JsonField<PageLink>) = apply { this.links = links }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [PiggyBankEventArray].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .links()
         * .meta()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PiggyBankEventArray =
            PiggyBankEventArray(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("links", links),
                checkRequired("meta", meta),
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
    fun validate(): PiggyBankEventArray = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        links().validate()
        meta().validate()
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
        (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (links.asKnown()?.validity() ?: 0) +
            (meta.asKnown()?.validity() ?: 0)

    class Data
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
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun attributes(): Attributes = attributes.getRequired("attributes")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun links(): ObjectLink = links.getRequired("links")

        /**
         * Immutable value
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
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
             * Returns a mutable builder for constructing an instance of [Data].
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var attributes: JsonField<Attributes>? = null
            private var links: JsonField<ObjectLink>? = null
            private var type: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                attributes = data.attributes
                links = data.links
                type = data.type
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

            fun links(links: ObjectLink) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [ObjectLink] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun links(links: JsonField<ObjectLink>) = apply { this.links = links }

            /** Immutable value */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Data].
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
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("attributes", attributes),
                    checkRequired("links", links),
                    checkRequired("type", type),
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
        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
            private val amount: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currencyCode: JsonField<String>,
            private val currencyDecimalPlaces: JsonField<Int>,
            private val currencyId: JsonField<String>,
            private val currencyName: JsonField<String>,
            private val currencySymbol: JsonField<String>,
            private val objectHasCurrencySetting: JsonField<Boolean>,
            private val pcAmount: JsonField<String>,
            private val primaryCurrencyCode: JsonField<String>,
            private val primaryCurrencyDecimalPlaces: JsonField<Int>,
            private val primaryCurrencyId: JsonField<String>,
            private val primaryCurrencyName: JsonField<String>,
            private val primaryCurrencySymbol: JsonField<String>,
            private val transactionGroupId: JsonField<String>,
            private val transactionJournalId: JsonField<String>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
                @JsonProperty("object_has_currency_setting")
                @ExcludeMissing
                objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("pc_amount")
                @ExcludeMissing
                pcAmount: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("transaction_group_id")
                @ExcludeMissing
                transactionGroupId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_journal_id")
                @ExcludeMissing
                transactionJournalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                amount,
                createdAt,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                objectHasCurrencySetting,
                pcAmount,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                transactionGroupId,
                transactionJournalId,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun amount(): String? = amount.getNullable("amount")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

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
             * Indicates whether the object has a currency setting. If false, the object uses the
             * administration's primary currency.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun objectHasCurrencySetting(): Boolean? =
                objectHasCurrencySetting.getNullable("object_has_currency_setting")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pcAmount(): String? = pcAmount.getNullable("pc_amount")

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
             * The transaction group associated with the event.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun transactionGroupId(): String? =
                transactionGroupId.getNullable("transaction_group_id")

            /**
             * The journal associated with the event.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun transactionJournalId(): String? =
                transactionJournalId.getNullable("transaction_journal_id")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

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
             * Returns the raw JSON value of [transactionGroupId].
             *
             * Unlike [transactionGroupId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transaction_group_id")
            @ExcludeMissing
            fun _transactionGroupId(): JsonField<String> = transactionGroupId

            /**
             * Returns the raw JSON value of [transactionJournalId].
             *
             * Unlike [transactionJournalId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transaction_journal_id")
            @ExcludeMissing
            fun _transactionJournalId(): JsonField<String> = transactionJournalId

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                private var amount: JsonField<String> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var currencyCode: JsonField<String> = JsonMissing.of()
                private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var currencyId: JsonField<String> = JsonMissing.of()
                private var currencyName: JsonField<String> = JsonMissing.of()
                private var currencySymbol: JsonField<String> = JsonMissing.of()
                private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
                private var pcAmount: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
                private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
                private var transactionGroupId: JsonField<String> = JsonMissing.of()
                private var transactionJournalId: JsonField<String> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attributes: Attributes) = apply {
                    amount = attributes.amount
                    createdAt = attributes.createdAt
                    currencyCode = attributes.currencyCode
                    currencyDecimalPlaces = attributes.currencyDecimalPlaces
                    currencyId = attributes.currencyId
                    currencyName = attributes.currencyName
                    currencySymbol = attributes.currencySymbol
                    objectHasCurrencySetting = attributes.objectHasCurrencySetting
                    pcAmount = attributes.pcAmount
                    primaryCurrencyCode = attributes.primaryCurrencyCode
                    primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                    primaryCurrencyId = attributes.primaryCurrencyId
                    primaryCurrencyName = attributes.primaryCurrencyName
                    primaryCurrencySymbol = attributes.primaryCurrencySymbol
                    transactionGroupId = attributes.transactionGroupId
                    transactionJournalId = attributes.transactionJournalId
                    updatedAt = attributes.updatedAt
                    additionalProperties = attributes.additionalProperties.toMutableMap()
                }

                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

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

                fun pcAmount(pcAmount: String) = pcAmount(JsonField.of(pcAmount))

                /**
                 * Sets [Builder.pcAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pcAmount(pcAmount: JsonField<String>) = apply { this.pcAmount = pcAmount }

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

                /** The transaction group associated with the event. */
                fun transactionGroupId(transactionGroupId: String?) =
                    transactionGroupId(JsonField.ofNullable(transactionGroupId))

                /**
                 * Sets [Builder.transactionGroupId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionGroupId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun transactionGroupId(transactionGroupId: JsonField<String>) = apply {
                    this.transactionGroupId = transactionGroupId
                }

                /** The journal associated with the event. */
                fun transactionJournalId(transactionJournalId: String?) =
                    transactionJournalId(JsonField.ofNullable(transactionJournalId))

                /**
                 * Sets [Builder.transactionJournalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionJournalId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun transactionJournalId(transactionJournalId: JsonField<String>) = apply {
                    this.transactionJournalId = transactionJournalId
                }

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
                 * Returns an immutable instance of [Attributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Attributes =
                    Attributes(
                        amount,
                        createdAt,
                        currencyCode,
                        currencyDecimalPlaces,
                        currencyId,
                        currencyName,
                        currencySymbol,
                        objectHasCurrencySetting,
                        pcAmount,
                        primaryCurrencyCode,
                        primaryCurrencyDecimalPlaces,
                        primaryCurrencyId,
                        primaryCurrencyName,
                        primaryCurrencySymbol,
                        transactionGroupId,
                        transactionJournalId,
                        updatedAt,
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
            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                amount()
                createdAt()
                currencyCode()
                currencyDecimalPlaces()
                currencyId()
                currencyName()
                currencySymbol()
                objectHasCurrencySetting()
                pcAmount()
                primaryCurrencyCode()
                primaryCurrencyDecimalPlaces()
                primaryCurrencyId()
                primaryCurrencyName()
                primaryCurrencySymbol()
                transactionGroupId()
                transactionJournalId()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (currencyCode.asKnown() == null) 0 else 1) +
                    (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (currencyId.asKnown() == null) 0 else 1) +
                    (if (currencyName.asKnown() == null) 0 else 1) +
                    (if (currencySymbol.asKnown() == null) 0 else 1) +
                    (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                    (if (pcAmount.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                    (if (transactionGroupId.asKnown() == null) 0 else 1) +
                    (if (transactionJournalId.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Attributes &&
                    amount == other.amount &&
                    createdAt == other.createdAt &&
                    currencyCode == other.currencyCode &&
                    currencyDecimalPlaces == other.currencyDecimalPlaces &&
                    currencyId == other.currencyId &&
                    currencyName == other.currencyName &&
                    currencySymbol == other.currencySymbol &&
                    objectHasCurrencySetting == other.objectHasCurrencySetting &&
                    pcAmount == other.pcAmount &&
                    primaryCurrencyCode == other.primaryCurrencyCode &&
                    primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                    primaryCurrencyId == other.primaryCurrencyId &&
                    primaryCurrencyName == other.primaryCurrencyName &&
                    primaryCurrencySymbol == other.primaryCurrencySymbol &&
                    transactionGroupId == other.transactionGroupId &&
                    transactionJournalId == other.transactionJournalId &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    createdAt,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    objectHasCurrencySetting,
                    pcAmount,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencyName,
                    primaryCurrencySymbol,
                    transactionGroupId,
                    transactionJournalId,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attributes{amount=$amount, createdAt=$createdAt, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, objectHasCurrencySetting=$objectHasCurrencySetting, pcAmount=$pcAmount, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, transactionGroupId=$transactionGroupId, transactionJournalId=$transactionJournalId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
            "Data{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PiggyBankEventArray &&
            data == other.data &&
            links == other.links &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, links, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PiggyBankEventArray{data=$data, links=$links, meta=$meta, additionalProperties=$additionalProperties}"
}
