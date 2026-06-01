// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.transactionjournals

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
import com.firefly.api.models.attachments.ObjectLink
import com.firefly.api.models.recurrences.AccountTypeProperty
import com.firefly.api.models.transactions.TransactionTypeProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class TransactionRead
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
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): ObjectLink = links.getRequired("links")

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
         * Returns a mutable builder for constructing an instance of [TransactionRead].
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

    /** A builder for [TransactionRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionRead: TransactionRead) = apply {
            id = transactionRead.id
            attributes = transactionRead.attributes
            links = transactionRead.links
            type = transactionRead.type
            additionalProperties = transactionRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [TransactionRead].
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
        fun build(): TransactionRead =
            TransactionRead(
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
     * @throws FireflyInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TransactionRead = apply {
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
            (links.asKnown()?.validity() ?: 0) +
            (if (type.asKnown() == null) 0 else 1)

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transactions: JsonField<List<Transaction>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val groupTitle: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transactions")
            @ExcludeMissing
            transactions: JsonField<List<Transaction>> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("group_title")
            @ExcludeMissing
            groupTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(transactions, createdAt, groupTitle, updatedAt, user, mutableMapOf())

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactions(): List<Transaction> = transactions.getRequired("transactions")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Title of the transaction if it has been split in more than one piece. Empty otherwise.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupTitle(): String? = groupTitle.getNullable("group_title")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * User ID
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun user(): String? = user.getNullable("user")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [groupTitle].
         *
         * Unlike [groupTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_title")
        @ExcludeMissing
        fun _groupTitle(): JsonField<String> = groupTitle

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
             * .transactions()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var transactions: JsonField<MutableList<Transaction>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupTitle: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                transactions = attributes.transactions.map { it.toMutableList() }
                createdAt = attributes.createdAt
                groupTitle = attributes.groupTitle
                updatedAt = attributes.updatedAt
                user = attributes.user
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

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
             * Title of the transaction if it has been split in more than one piece. Empty
             * otherwise.
             */
            fun groupTitle(groupTitle: String?) = groupTitle(JsonField.ofNullable(groupTitle))

            /**
             * Sets [Builder.groupTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupTitle(groupTitle: JsonField<String>) = apply { this.groupTitle = groupTitle }

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

            /** User ID */
            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

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
             * .transactions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("transactions", transactions).map { it.toImmutable() },
                    createdAt,
                    groupTitle,
                    updatedAt,
                    user,
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

            transactions().forEach { it.validate() }
            createdAt()
            groupTitle()
            updatedAt()
            user()
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
            (transactions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (groupTitle.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (user.asKnown() == null) 0 else 1)

        class Transaction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val date: JsonField<OffsetDateTime>,
            private val description: JsonField<String>,
            private val destinationId: JsonField<String>,
            private val sourceId: JsonField<String>,
            private val type: JsonField<TransactionTypeProperty>,
            private val billId: JsonField<String>,
            private val billName: JsonField<String>,
            private val bookDate: JsonField<OffsetDateTime>,
            private val budgetId: JsonField<String>,
            private val budgetName: JsonField<String>,
            private val categoryId: JsonField<String>,
            private val categoryName: JsonField<String>,
            private val currencyCode: JsonField<String>,
            private val currencyDecimalPlaces: JsonField<Int>,
            private val currencyId: JsonField<String>,
            private val currencyName: JsonField<String>,
            private val currencySymbol: JsonField<String>,
            private val destinationBalanceAfter: JsonField<String>,
            private val destinationIban: JsonField<String>,
            private val destinationName: JsonField<String>,
            private val destinationType: JsonField<AccountTypeProperty>,
            private val dueDate: JsonField<OffsetDateTime>,
            private val externalId: JsonField<String>,
            private val externalUrl: JsonField<String>,
            private val foreignAmount: JsonField<String>,
            private val foreignCurrencyCode: JsonField<String>,
            private val foreignCurrencyDecimalPlaces: JsonField<Int>,
            private val foreignCurrencyId: JsonField<String>,
            private val foreignCurrencySymbol: JsonField<String>,
            private val hasAttachments: JsonField<Boolean>,
            private val importHashV2: JsonField<String>,
            private val interestDate: JsonField<OffsetDateTime>,
            private val internalReference: JsonField<String>,
            private val invoiceDate: JsonField<OffsetDateTime>,
            private val latitude: JsonField<Double>,
            private val longitude: JsonField<Double>,
            private val notes: JsonField<String>,
            private val objectHasCurrencySetting: JsonField<Boolean>,
            private val order: JsonField<Int>,
            private val originalSource: JsonField<String>,
            private val paymentDate: JsonField<OffsetDateTime>,
            private val pcAmount: JsonField<String>,
            private val pcDestinationBalanceAfter: JsonField<String>,
            private val pcForeignAmount: JsonField<String>,
            private val pcSourceBalanceAfter: JsonField<String>,
            private val primaryCurrencyCode: JsonField<String>,
            private val primaryCurrencyDecimalPlaces: JsonField<Int>,
            private val primaryCurrencyId: JsonField<String>,
            private val primaryCurrencySymbol: JsonField<String>,
            private val processDate: JsonField<OffsetDateTime>,
            private val reconciled: JsonField<Boolean>,
            private val recurrenceCount: JsonField<Int>,
            private val recurrenceId: JsonField<String>,
            private val recurrenceTotal: JsonField<Int>,
            private val sepaBatchId: JsonField<String>,
            private val sepaCc: JsonField<String>,
            private val sepaCi: JsonField<String>,
            private val sepaCountry: JsonField<String>,
            private val sepaCtId: JsonField<String>,
            private val sepaCtOp: JsonField<String>,
            private val sepaDb: JsonField<String>,
            private val sepaEp: JsonField<String>,
            private val sourceBalanceAfter: JsonField<String>,
            private val sourceIban: JsonField<String>,
            private val sourceName: JsonField<String>,
            private val sourceType: JsonField<AccountTypeProperty>,
            private val subscriptionId: JsonField<String>,
            private val subscriptionName: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val transactionJournalId: JsonField<String>,
            private val user: JsonField<String>,
            private val zoomLevel: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("date")
                @ExcludeMissing
                date: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_id")
                @ExcludeMissing
                destinationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_id")
                @ExcludeMissing
                sourceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<TransactionTypeProperty> = JsonMissing.of(),
                @JsonProperty("bill_id")
                @ExcludeMissing
                billId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bill_name")
                @ExcludeMissing
                billName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("book_date")
                @ExcludeMissing
                bookDate: JsonField<OffsetDateTime> = JsonMissing.of(),
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
                @JsonProperty("destination_balance_after")
                @ExcludeMissing
                destinationBalanceAfter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_iban")
                @ExcludeMissing
                destinationIban: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_name")
                @ExcludeMissing
                destinationName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("destination_type")
                @ExcludeMissing
                destinationType: JsonField<AccountTypeProperty> = JsonMissing.of(),
                @JsonProperty("due_date")
                @ExcludeMissing
                dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("external_id")
                @ExcludeMissing
                externalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_url")
                @ExcludeMissing
                externalUrl: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("foreign_currency_symbol")
                @ExcludeMissing
                foreignCurrencySymbol: JsonField<String> = JsonMissing.of(),
                @JsonProperty("has_attachments")
                @ExcludeMissing
                hasAttachments: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("import_hash_v2")
                @ExcludeMissing
                importHashV2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("interest_date")
                @ExcludeMissing
                interestDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("internal_reference")
                @ExcludeMissing
                internalReference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoice_date")
                @ExcludeMissing
                invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("latitude")
                @ExcludeMissing
                latitude: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("longitude")
                @ExcludeMissing
                longitude: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
                @JsonProperty("object_has_currency_setting")
                @ExcludeMissing
                objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("original_source")
                @ExcludeMissing
                originalSource: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_date")
                @ExcludeMissing
                paymentDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("pc_amount")
                @ExcludeMissing
                pcAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_destination_balance_after")
                @ExcludeMissing
                pcDestinationBalanceAfter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_foreign_amount")
                @ExcludeMissing
                pcForeignAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pc_source_balance_after")
                @ExcludeMissing
                pcSourceBalanceAfter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_code")
                @ExcludeMissing
                primaryCurrencyCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_decimal_places")
                @ExcludeMissing
                primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("primary_currency_id")
                @ExcludeMissing
                primaryCurrencyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("primary_currency_symbol")
                @ExcludeMissing
                primaryCurrencySymbol: JsonField<String> = JsonMissing.of(),
                @JsonProperty("process_date")
                @ExcludeMissing
                processDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("reconciled")
                @ExcludeMissing
                reconciled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("recurrence_count")
                @ExcludeMissing
                recurrenceCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("recurrence_id")
                @ExcludeMissing
                recurrenceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recurrence_total")
                @ExcludeMissing
                recurrenceTotal: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("sepa_batch_id")
                @ExcludeMissing
                sepaBatchId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_cc")
                @ExcludeMissing
                sepaCc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_ci")
                @ExcludeMissing
                sepaCi: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_country")
                @ExcludeMissing
                sepaCountry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_ct_id")
                @ExcludeMissing
                sepaCtId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_ct_op")
                @ExcludeMissing
                sepaCtOp: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_db")
                @ExcludeMissing
                sepaDb: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sepa_ep")
                @ExcludeMissing
                sepaEp: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_balance_after")
                @ExcludeMissing
                sourceBalanceAfter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_iban")
                @ExcludeMissing
                sourceIban: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("transaction_journal_id")
                @ExcludeMissing
                transactionJournalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zoom_level")
                @ExcludeMissing
                zoomLevel: JsonField<Int> = JsonMissing.of(),
            ) : this(
                amount,
                date,
                description,
                destinationId,
                sourceId,
                type,
                billId,
                billName,
                bookDate,
                budgetId,
                budgetName,
                categoryId,
                categoryName,
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                destinationBalanceAfter,
                destinationIban,
                destinationName,
                destinationType,
                dueDate,
                externalId,
                externalUrl,
                foreignAmount,
                foreignCurrencyCode,
                foreignCurrencyDecimalPlaces,
                foreignCurrencyId,
                foreignCurrencySymbol,
                hasAttachments,
                importHashV2,
                interestDate,
                internalReference,
                invoiceDate,
                latitude,
                longitude,
                notes,
                objectHasCurrencySetting,
                order,
                originalSource,
                paymentDate,
                pcAmount,
                pcDestinationBalanceAfter,
                pcForeignAmount,
                pcSourceBalanceAfter,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencySymbol,
                processDate,
                reconciled,
                recurrenceCount,
                recurrenceId,
                recurrenceTotal,
                sepaBatchId,
                sepaCc,
                sepaCi,
                sepaCountry,
                sepaCtId,
                sepaCtOp,
                sepaDb,
                sepaEp,
                sourceBalanceAfter,
                sourceIban,
                sourceName,
                sourceType,
                subscriptionId,
                subscriptionName,
                tags,
                transactionJournalId,
                user,
                zoomLevel,
                mutableMapOf(),
            )

            /**
             * Amount of the transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * Date of the transaction
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun date(): OffsetDateTime = date.getRequired("date")

            /**
             * Description of the transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun description(): String = description.getRequired("description")

            /**
             * ID of the destination account. For a deposit or a transfer, this must always be an
             * asset account. For withdrawals this must be an expense account.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destinationId(): String? = destinationId.getNullable("destination_id")

            /**
             * ID of the source account. For a withdrawal or a transfer, this must always be an
             * asset account. For deposits, this must be a revenue account.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceId(): String? = sourceId.getNullable("source_id")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): TransactionTypeProperty = type.getRequired("type")

            /**
             * The associated subscription ID for this transaction. `bill` refers to the OLD name
             * for subscriptions and this field will be removed.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billId(): String? = billId.getNullable("bill_id")

            /**
             * The associated subscription name for this transaction. `bill` refers to the OLD name
             * for subscriptions and this field will be removed.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun billName(): String? = billName.getNullable("bill_name")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bookDate(): OffsetDateTime? = bookDate.getNullable("book_date")

            /**
             * The budget ID for this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetId(): String? = budgetId.getNullable("budget_id")

            /**
             * The name of the budget used.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetName(): String? = budgetName.getNullable("budget_name")

            /**
             * The category ID for this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun categoryId(): String? = categoryId.getNullable("category_id")

            /**
             * The name of the category to be used. If the category is unknown, it will be created.
             * If the ID and the name point to different categories, the ID overrules the name.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun categoryName(): String? = categoryName.getNullable("category_name")

            /**
             * Currency code for the currency of this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyCode(): String? = currencyCode.getNullable("currency_code")

            /**
             * Number of decimals used in this currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyDecimalPlaces(): Int? =
                currencyDecimalPlaces.getNullable("currency_decimal_places")

            /**
             * Currency ID for the currency of this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyId(): String? = currencyId.getNullable("currency_id")

            /**
             * Currency name for the currency of this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencyName(): String? = currencyName.getNullable("currency_name")

            /**
             * Currency symbol for the currency of this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

            /**
             * The balance of the destination account. This is the balance in the account's currency
             * which may be different from this transaction, and is not provided in this model.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destinationBalanceAfter(): String? =
                destinationBalanceAfter.getNullable("destination_balance_after")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destinationIban(): String? = destinationIban.getNullable("destination_iban")

            /**
             * Name of the destination account. You can submit the name instead of the ID. For
             * everything except transfers, the account will be auto-generated if unknown, so
             * submitting a name is enough.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destinationName(): String? = destinationName.getNullable("destination_name")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destinationType(): AccountTypeProperty? =
                destinationType.getNullable("destination_type")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dueDate(): OffsetDateTime? = dueDate.getNullable("due_date")

            /**
             * Reference to external ID in other systems.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalId(): String? = externalId.getNullable("external_id")

            /**
             * External, custom URL for this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun externalUrl(): String? = externalUrl.getNullable("external_url")

            /**
             * The amount in the set foreign currency. May be NULL if the transaction does not have
             * a foreign amount.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun foreignAmount(): String? = foreignAmount.getNullable("foreign_amount")

            /**
             * Currency code of the foreign currency. Default is NULL.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun foreignCurrencyCode(): String? =
                foreignCurrencyCode.getNullable("foreign_currency_code")

            /**
             * Number of decimals in the foreign currency.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun foreignCurrencyDecimalPlaces(): Int? =
                foreignCurrencyDecimalPlaces.getNullable("foreign_currency_decimal_places")

            /**
             * Currency ID of the foreign currency, if this transaction has a foreign amount.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun foreignCurrencyId(): String? = foreignCurrencyId.getNullable("foreign_currency_id")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun foreignCurrencySymbol(): String? =
                foreignCurrencySymbol.getNullable("foreign_currency_symbol")

            /**
             * If the transaction has attachments.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hasAttachments(): Boolean? = hasAttachments.getNullable("has_attachments")

            /**
             * Hash value of original import transaction (for duplicate detection).
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun importHashV2(): String? = importHashV2.getNullable("import_hash_v2")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interestDate(): OffsetDateTime? = interestDate.getNullable("interest_date")

            /**
             * Reference to internal reference of other systems.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun internalReference(): String? = internalReference.getNullable("internal_reference")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun invoiceDate(): OffsetDateTime? = invoiceDate.getNullable("invoice_date")

            /**
             * Latitude of the transaction's location, if applicable. Can be used to draw a map.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun latitude(): Double? = latitude.getNullable("latitude")

            /**
             * Latitude of the transaction's location, if applicable. Can be used to draw a map.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun longitude(): Double? = longitude.getNullable("longitude")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun notes(): String? = notes.getNullable("notes")

            /**
             * Indicates whether the transaction has a currency setting. For transactions this is
             * always true.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectHasCurrencySetting(): Boolean? =
                objectHasCurrencySetting.getNullable("object_has_currency_setting")

            /**
             * Order of this entry in the list of transactions.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun order(): Int? = order.getNullable("order")

            /**
             * System generated identifier for original creator of transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun originalSource(): String? = originalSource.getNullable("original_source")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentDate(): OffsetDateTime? = paymentDate.getNullable("payment_date")

            /**
             * Amount of the transaction in the primary currency of this administration. The
             * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
             * does have 'convert to primary' set to true in their settings.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pcAmount(): String? = pcAmount.getNullable("pc_amount")

            /**
             * The balance of the destination account in the primary currency of this
             * administration. The `primary_currency_*` fields reflect the currency used. This field
             * is NULL if the user does have 'convert to primary' set to true in their settings.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pcDestinationBalanceAfter(): String? =
                pcDestinationBalanceAfter.getNullable("pc_destination_balance_after")

            /**
             * Foreign amount of the transaction in the primary currency of this administration. The
             * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
             * does have 'convert to primary' set to true in their settings.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pcForeignAmount(): String? = pcForeignAmount.getNullable("pc_foreign_amount")

            /**
             * The balance of the source account in the primary currency of this administration. The
             * `primary_currency_*` fields reflect the currency used. This field is NULL if the user
             * does have 'convert to primary' set to true in their settings.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pcSourceBalanceAfter(): String? =
                pcSourceBalanceAfter.getNullable("pc_source_balance_after")

            /**
             * Returns the primary currency code of the administration. This currency is used as the
             * currency for all `pc_*` amount and balance fields of this account.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyCode(): String? =
                primaryCurrencyCode.getNullable("primary_currency_code")

            /**
             * See the other `primary_*` fields.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyDecimalPlaces(): Int? =
                primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

            /**
             * Returns the primary currency ID of the administration. This currency is used as the
             * currency for all `pc_*` amount and balance fields of this account.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

            /**
             * See the other `primary_*` fields.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primaryCurrencySymbol(): String? =
                primaryCurrencySymbol.getNullable("primary_currency_symbol")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun processDate(): OffsetDateTime? = processDate.getNullable("process_date")

            /**
             * If the transaction has been reconciled already. When you set this, the amount can no
             * longer be edited by the user.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reconciled(): Boolean? = reconciled.getNullable("reconciled")

            /**
             * The # of the current transaction created under this recurrence.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recurrenceCount(): Int? = recurrenceCount.getNullable("recurrence_count")

            /**
             * Reference to recurrence that made the transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recurrenceId(): String? = recurrenceId.getNullable("recurrence_id")

            /**
             * Total number of transactions expected to be created by this recurrence repetition.
             * Will be 0 if infinite.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun recurrenceTotal(): Int? = recurrenceTotal.getNullable("recurrence_total")

            /**
             * SEPA Batch ID
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaBatchId(): String? = sepaBatchId.getNullable("sepa_batch_id")

            /**
             * SEPA Clearing Code
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaCc(): String? = sepaCc.getNullable("sepa_cc")

            /**
             * SEPA Creditor Identifier
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaCi(): String? = sepaCi.getNullable("sepa_ci")

            /**
             * SEPA Country
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaCountry(): String? = sepaCountry.getNullable("sepa_country")

            /**
             * SEPA end-to-end Identifier
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaCtId(): String? = sepaCtId.getNullable("sepa_ct_id")

            /**
             * SEPA Opposing Account Identifier
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaCtOp(): String? = sepaCtOp.getNullable("sepa_ct_op")

            /**
             * SEPA mandate identifier
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaDb(): String? = sepaDb.getNullable("sepa_db")

            /**
             * SEPA External Purpose indicator
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sepaEp(): String? = sepaEp.getNullable("sepa_ep")

            /**
             * The balance of the source account. This is the balance in the account's currency
             * which may be different from this transaction, and is not provided in this model.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceBalanceAfter(): String? =
                sourceBalanceAfter.getNullable("source_balance_after")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceIban(): String? = sourceIban.getNullable("source_iban")

            /**
             * Name of the source account. For a withdrawal or a transfer, this must always be an
             * asset account. For deposits, this must be a revenue account. Can be used instead of
             * the source_id. If the transaction is a deposit, the source_name can be filled in
             * freely: the account will be created based on the name.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceName(): String? = sourceName.getNullable("source_name")

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sourceType(): AccountTypeProperty? = sourceType.getNullable("source_type")

            /**
             * The associated subscription ID for this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * The associated subscription name for this transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subscriptionName(): String? = subscriptionName.getNullable("subscription_name")

            /**
             * Array of tags.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tags(): List<String>? = tags.getNullable("tags")

            /**
             * ID of the underlying transaction journal. Each transaction consists of a transaction
             * group (see the top ID) and one or more journals making up the splits of the
             * transaction.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transactionJournalId(): String? =
                transactionJournalId.getNullable("transaction_journal_id")

            /**
             * User ID
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun user(): String? = user.getNullable("user")

            /**
             * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
             * proprietary value because each map provider has different zoom levels.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun zoomLevel(): Int? = zoomLevel.getNullable("zoom_level")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

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
             * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<TransactionTypeProperty> = type

            /**
             * Returns the raw JSON value of [billId].
             *
             * Unlike [billId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bill_id") @ExcludeMissing fun _billId(): JsonField<String> = billId

            /**
             * Returns the raw JSON value of [billName].
             *
             * Unlike [billName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bill_name") @ExcludeMissing fun _billName(): JsonField<String> = billName

            /**
             * Returns the raw JSON value of [bookDate].
             *
             * Unlike [bookDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("book_date")
            @ExcludeMissing
            fun _bookDate(): JsonField<OffsetDateTime> = bookDate

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
             * Returns the raw JSON value of [destinationBalanceAfter].
             *
             * Unlike [destinationBalanceAfter], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("destination_balance_after")
            @ExcludeMissing
            fun _destinationBalanceAfter(): JsonField<String> = destinationBalanceAfter

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
             * Returns the raw JSON value of [dueDate].
             *
             * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("due_date")
            @ExcludeMissing
            fun _dueDate(): JsonField<OffsetDateTime> = dueDate

            /**
             * Returns the raw JSON value of [externalId].
             *
             * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * Returns the raw JSON value of [externalUrl].
             *
             * Unlike [externalUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_url")
            @ExcludeMissing
            fun _externalUrl(): JsonField<String> = externalUrl

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
             * Returns the raw JSON value of [foreignCurrencySymbol].
             *
             * Unlike [foreignCurrencySymbol], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("foreign_currency_symbol")
            @ExcludeMissing
            fun _foreignCurrencySymbol(): JsonField<String> = foreignCurrencySymbol

            /**
             * Returns the raw JSON value of [hasAttachments].
             *
             * Unlike [hasAttachments], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("has_attachments")
            @ExcludeMissing
            fun _hasAttachments(): JsonField<Boolean> = hasAttachments

            /**
             * Returns the raw JSON value of [importHashV2].
             *
             * Unlike [importHashV2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("import_hash_v2")
            @ExcludeMissing
            fun _importHashV2(): JsonField<String> = importHashV2

            /**
             * Returns the raw JSON value of [interestDate].
             *
             * Unlike [interestDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("interest_date")
            @ExcludeMissing
            fun _interestDate(): JsonField<OffsetDateTime> = interestDate

            /**
             * Returns the raw JSON value of [internalReference].
             *
             * Unlike [internalReference], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("internal_reference")
            @ExcludeMissing
            fun _internalReference(): JsonField<String> = internalReference

            /**
             * Returns the raw JSON value of [invoiceDate].
             *
             * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_date")
            @ExcludeMissing
            fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

            /**
             * Returns the raw JSON value of [latitude].
             *
             * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

            /**
             * Returns the raw JSON value of [longitude].
             *
             * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("longitude")
            @ExcludeMissing
            fun _longitude(): JsonField<Double> = longitude

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
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

            /**
             * Returns the raw JSON value of [originalSource].
             *
             * Unlike [originalSource], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("original_source")
            @ExcludeMissing
            fun _originalSource(): JsonField<String> = originalSource

            /**
             * Returns the raw JSON value of [paymentDate].
             *
             * Unlike [paymentDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_date")
            @ExcludeMissing
            fun _paymentDate(): JsonField<OffsetDateTime> = paymentDate

            /**
             * Returns the raw JSON value of [pcAmount].
             *
             * Unlike [pcAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pc_amount") @ExcludeMissing fun _pcAmount(): JsonField<String> = pcAmount

            /**
             * Returns the raw JSON value of [pcDestinationBalanceAfter].
             *
             * Unlike [pcDestinationBalanceAfter], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("pc_destination_balance_after")
            @ExcludeMissing
            fun _pcDestinationBalanceAfter(): JsonField<String> = pcDestinationBalanceAfter

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
             * Returns the raw JSON value of [pcSourceBalanceAfter].
             *
             * Unlike [pcSourceBalanceAfter], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pc_source_balance_after")
            @ExcludeMissing
            fun _pcSourceBalanceAfter(): JsonField<String> = pcSourceBalanceAfter

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
             * Returns the raw JSON value of [primaryCurrencySymbol].
             *
             * Unlike [primaryCurrencySymbol], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("primary_currency_symbol")
            @ExcludeMissing
            fun _primaryCurrencySymbol(): JsonField<String> = primaryCurrencySymbol

            /**
             * Returns the raw JSON value of [processDate].
             *
             * Unlike [processDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("process_date")
            @ExcludeMissing
            fun _processDate(): JsonField<OffsetDateTime> = processDate

            /**
             * Returns the raw JSON value of [reconciled].
             *
             * Unlike [reconciled], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reconciled")
            @ExcludeMissing
            fun _reconciled(): JsonField<Boolean> = reconciled

            /**
             * Returns the raw JSON value of [recurrenceCount].
             *
             * Unlike [recurrenceCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurrence_count")
            @ExcludeMissing
            fun _recurrenceCount(): JsonField<Int> = recurrenceCount

            /**
             * Returns the raw JSON value of [recurrenceId].
             *
             * Unlike [recurrenceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recurrence_id")
            @ExcludeMissing
            fun _recurrenceId(): JsonField<String> = recurrenceId

            /**
             * Returns the raw JSON value of [recurrenceTotal].
             *
             * Unlike [recurrenceTotal], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurrence_total")
            @ExcludeMissing
            fun _recurrenceTotal(): JsonField<Int> = recurrenceTotal

            /**
             * Returns the raw JSON value of [sepaBatchId].
             *
             * Unlike [sepaBatchId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sepa_batch_id")
            @ExcludeMissing
            fun _sepaBatchId(): JsonField<String> = sepaBatchId

            /**
             * Returns the raw JSON value of [sepaCc].
             *
             * Unlike [sepaCc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sepa_cc") @ExcludeMissing fun _sepaCc(): JsonField<String> = sepaCc

            /**
             * Returns the raw JSON value of [sepaCi].
             *
             * Unlike [sepaCi], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sepa_ci") @ExcludeMissing fun _sepaCi(): JsonField<String> = sepaCi

            /**
             * Returns the raw JSON value of [sepaCountry].
             *
             * Unlike [sepaCountry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sepa_country")
            @ExcludeMissing
            fun _sepaCountry(): JsonField<String> = sepaCountry

            /**
             * Returns the raw JSON value of [sepaCtId].
             *
             * Unlike [sepaCtId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sepa_ct_id")
            @ExcludeMissing
            fun _sepaCtId(): JsonField<String> = sepaCtId

            /**
             * Returns the raw JSON value of [sepaCtOp].
             *
             * Unlike [sepaCtOp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sepa_ct_op")
            @ExcludeMissing
            fun _sepaCtOp(): JsonField<String> = sepaCtOp

            /**
             * Returns the raw JSON value of [sepaDb].
             *
             * Unlike [sepaDb], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sepa_db") @ExcludeMissing fun _sepaDb(): JsonField<String> = sepaDb

            /**
             * Returns the raw JSON value of [sepaEp].
             *
             * Unlike [sepaEp], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sepa_ep") @ExcludeMissing fun _sepaEp(): JsonField<String> = sepaEp

            /**
             * Returns the raw JSON value of [sourceBalanceAfter].
             *
             * Unlike [sourceBalanceAfter], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("source_balance_after")
            @ExcludeMissing
            fun _sourceBalanceAfter(): JsonField<String> = sourceBalanceAfter

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
             * Returns the raw JSON value of [user].
             *
             * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

            /**
             * Returns the raw JSON value of [zoomLevel].
             *
             * Unlike [zoomLevel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("zoom_level") @ExcludeMissing fun _zoomLevel(): JsonField<Int> = zoomLevel

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
                 * .date()
                 * .description()
                 * .destinationId()
                 * .sourceId()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Transaction]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var date: JsonField<OffsetDateTime>? = null
                private var description: JsonField<String>? = null
                private var destinationId: JsonField<String>? = null
                private var sourceId: JsonField<String>? = null
                private var type: JsonField<TransactionTypeProperty>? = null
                private var billId: JsonField<String> = JsonMissing.of()
                private var billName: JsonField<String> = JsonMissing.of()
                private var bookDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var budgetId: JsonField<String> = JsonMissing.of()
                private var budgetName: JsonField<String> = JsonMissing.of()
                private var categoryId: JsonField<String> = JsonMissing.of()
                private var categoryName: JsonField<String> = JsonMissing.of()
                private var currencyCode: JsonField<String> = JsonMissing.of()
                private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var currencyId: JsonField<String> = JsonMissing.of()
                private var currencyName: JsonField<String> = JsonMissing.of()
                private var currencySymbol: JsonField<String> = JsonMissing.of()
                private var destinationBalanceAfter: JsonField<String> = JsonMissing.of()
                private var destinationIban: JsonField<String> = JsonMissing.of()
                private var destinationName: JsonField<String> = JsonMissing.of()
                private var destinationType: JsonField<AccountTypeProperty> = JsonMissing.of()
                private var dueDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var externalUrl: JsonField<String> = JsonMissing.of()
                private var foreignAmount: JsonField<String> = JsonMissing.of()
                private var foreignCurrencyCode: JsonField<String> = JsonMissing.of()
                private var foreignCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var foreignCurrencyId: JsonField<String> = JsonMissing.of()
                private var foreignCurrencySymbol: JsonField<String> = JsonMissing.of()
                private var hasAttachments: JsonField<Boolean> = JsonMissing.of()
                private var importHashV2: JsonField<String> = JsonMissing.of()
                private var interestDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var internalReference: JsonField<String> = JsonMissing.of()
                private var invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var latitude: JsonField<Double> = JsonMissing.of()
                private var longitude: JsonField<Double> = JsonMissing.of()
                private var notes: JsonField<String> = JsonMissing.of()
                private var objectHasCurrencySetting: JsonField<Boolean> = JsonMissing.of()
                private var order: JsonField<Int> = JsonMissing.of()
                private var originalSource: JsonField<String> = JsonMissing.of()
                private var paymentDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var pcAmount: JsonField<String> = JsonMissing.of()
                private var pcDestinationBalanceAfter: JsonField<String> = JsonMissing.of()
                private var pcForeignAmount: JsonField<String> = JsonMissing.of()
                private var pcSourceBalanceAfter: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
                private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
                private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
                private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
                private var processDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var reconciled: JsonField<Boolean> = JsonMissing.of()
                private var recurrenceCount: JsonField<Int> = JsonMissing.of()
                private var recurrenceId: JsonField<String> = JsonMissing.of()
                private var recurrenceTotal: JsonField<Int> = JsonMissing.of()
                private var sepaBatchId: JsonField<String> = JsonMissing.of()
                private var sepaCc: JsonField<String> = JsonMissing.of()
                private var sepaCi: JsonField<String> = JsonMissing.of()
                private var sepaCountry: JsonField<String> = JsonMissing.of()
                private var sepaCtId: JsonField<String> = JsonMissing.of()
                private var sepaCtOp: JsonField<String> = JsonMissing.of()
                private var sepaDb: JsonField<String> = JsonMissing.of()
                private var sepaEp: JsonField<String> = JsonMissing.of()
                private var sourceBalanceAfter: JsonField<String> = JsonMissing.of()
                private var sourceIban: JsonField<String> = JsonMissing.of()
                private var sourceName: JsonField<String> = JsonMissing.of()
                private var sourceType: JsonField<AccountTypeProperty> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var subscriptionName: JsonField<String> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var transactionJournalId: JsonField<String> = JsonMissing.of()
                private var user: JsonField<String> = JsonMissing.of()
                private var zoomLevel: JsonField<Int> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(transaction: Transaction) = apply {
                    amount = transaction.amount
                    date = transaction.date
                    description = transaction.description
                    destinationId = transaction.destinationId
                    sourceId = transaction.sourceId
                    type = transaction.type
                    billId = transaction.billId
                    billName = transaction.billName
                    bookDate = transaction.bookDate
                    budgetId = transaction.budgetId
                    budgetName = transaction.budgetName
                    categoryId = transaction.categoryId
                    categoryName = transaction.categoryName
                    currencyCode = transaction.currencyCode
                    currencyDecimalPlaces = transaction.currencyDecimalPlaces
                    currencyId = transaction.currencyId
                    currencyName = transaction.currencyName
                    currencySymbol = transaction.currencySymbol
                    destinationBalanceAfter = transaction.destinationBalanceAfter
                    destinationIban = transaction.destinationIban
                    destinationName = transaction.destinationName
                    destinationType = transaction.destinationType
                    dueDate = transaction.dueDate
                    externalId = transaction.externalId
                    externalUrl = transaction.externalUrl
                    foreignAmount = transaction.foreignAmount
                    foreignCurrencyCode = transaction.foreignCurrencyCode
                    foreignCurrencyDecimalPlaces = transaction.foreignCurrencyDecimalPlaces
                    foreignCurrencyId = transaction.foreignCurrencyId
                    foreignCurrencySymbol = transaction.foreignCurrencySymbol
                    hasAttachments = transaction.hasAttachments
                    importHashV2 = transaction.importHashV2
                    interestDate = transaction.interestDate
                    internalReference = transaction.internalReference
                    invoiceDate = transaction.invoiceDate
                    latitude = transaction.latitude
                    longitude = transaction.longitude
                    notes = transaction.notes
                    objectHasCurrencySetting = transaction.objectHasCurrencySetting
                    order = transaction.order
                    originalSource = transaction.originalSource
                    paymentDate = transaction.paymentDate
                    pcAmount = transaction.pcAmount
                    pcDestinationBalanceAfter = transaction.pcDestinationBalanceAfter
                    pcForeignAmount = transaction.pcForeignAmount
                    pcSourceBalanceAfter = transaction.pcSourceBalanceAfter
                    primaryCurrencyCode = transaction.primaryCurrencyCode
                    primaryCurrencyDecimalPlaces = transaction.primaryCurrencyDecimalPlaces
                    primaryCurrencyId = transaction.primaryCurrencyId
                    primaryCurrencySymbol = transaction.primaryCurrencySymbol
                    processDate = transaction.processDate
                    reconciled = transaction.reconciled
                    recurrenceCount = transaction.recurrenceCount
                    recurrenceId = transaction.recurrenceId
                    recurrenceTotal = transaction.recurrenceTotal
                    sepaBatchId = transaction.sepaBatchId
                    sepaCc = transaction.sepaCc
                    sepaCi = transaction.sepaCi
                    sepaCountry = transaction.sepaCountry
                    sepaCtId = transaction.sepaCtId
                    sepaCtOp = transaction.sepaCtOp
                    sepaDb = transaction.sepaDb
                    sepaEp = transaction.sepaEp
                    sourceBalanceAfter = transaction.sourceBalanceAfter
                    sourceIban = transaction.sourceIban
                    sourceName = transaction.sourceName
                    sourceType = transaction.sourceType
                    subscriptionId = transaction.subscriptionId
                    subscriptionName = transaction.subscriptionName
                    tags = transaction.tags.map { it.toMutableList() }
                    transactionJournalId = transaction.transactionJournalId
                    user = transaction.user
                    zoomLevel = transaction.zoomLevel
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

                /** Date of the transaction */
                fun date(date: OffsetDateTime) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

                /** Description of the transaction. */
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

                /**
                 * ID of the destination account. For a deposit or a transfer, this must always be
                 * an asset account. For withdrawals this must be an expense account.
                 */
                fun destinationId(destinationId: String?) =
                    destinationId(JsonField.ofNullable(destinationId))

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

                /**
                 * ID of the source account. For a withdrawal or a transfer, this must always be an
                 * asset account. For deposits, this must be a revenue account.
                 */
                fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

                /**
                 * Sets [Builder.sourceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

                fun type(type: TransactionTypeProperty) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed
                 * [TransactionTypeProperty] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun type(type: JsonField<TransactionTypeProperty>) = apply { this.type = type }

                /**
                 * The associated subscription ID for this transaction. `bill` refers to the OLD
                 * name for subscriptions and this field will be removed.
                 */
                fun billId(billId: String?) = billId(JsonField.ofNullable(billId))

                /**
                 * Sets [Builder.billId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billId(billId: JsonField<String>) = apply { this.billId = billId }

                /**
                 * The associated subscription name for this transaction. `bill` refers to the OLD
                 * name for subscriptions and this field will be removed.
                 */
                fun billName(billName: String?) = billName(JsonField.ofNullable(billName))

                /**
                 * Sets [Builder.billName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun billName(billName: JsonField<String>) = apply { this.billName = billName }

                fun bookDate(bookDate: OffsetDateTime?) = bookDate(JsonField.ofNullable(bookDate))

                /**
                 * Sets [Builder.bookDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bookDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun bookDate(bookDate: JsonField<OffsetDateTime>) = apply {
                    this.bookDate = bookDate
                }

                /** The budget ID for this transaction. */
                fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

                /**
                 * Sets [Builder.budgetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

                /** The name of the budget used. */
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

                /** The category ID for this transaction. */
                fun categoryId(categoryId: String?) = categoryId(JsonField.ofNullable(categoryId))

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

                /**
                 * The name of the category to be used. If the category is unknown, it will be
                 * created. If the ID and the name point to different categories, the ID overrules
                 * the name.
                 */
                fun categoryName(categoryName: String?) =
                    categoryName(JsonField.ofNullable(categoryName))

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

                /** Currency code for the currency of this transaction. */
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

                /** Number of decimals used in this currency. */
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

                /** Currency ID for the currency of this transaction. */
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

                /** Currency name for the currency of this transaction. */
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

                /** Currency symbol for the currency of this transaction. */
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
                 * The balance of the destination account. This is the balance in the account's
                 * currency which may be different from this transaction, and is not provided in
                 * this model.
                 */
                fun destinationBalanceAfter(destinationBalanceAfter: String?) =
                    destinationBalanceAfter(JsonField.ofNullable(destinationBalanceAfter))

                /**
                 * Sets [Builder.destinationBalanceAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destinationBalanceAfter] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun destinationBalanceAfter(destinationBalanceAfter: JsonField<String>) = apply {
                    this.destinationBalanceAfter = destinationBalanceAfter
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

                /**
                 * Name of the destination account. You can submit the name instead of the ID. For
                 * everything except transfers, the account will be auto-generated if unknown, so
                 * submitting a name is enough.
                 */
                fun destinationName(destinationName: String?) =
                    destinationName(JsonField.ofNullable(destinationName))

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

                fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

                /**
                 * Sets [Builder.dueDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

                /** Reference to external ID in other systems. */
                fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

                /**
                 * Sets [Builder.externalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
                }

                /** External, custom URL for this transaction. */
                fun externalUrl(externalUrl: String?) =
                    externalUrl(JsonField.ofNullable(externalUrl))

                /**
                 * Sets [Builder.externalUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun externalUrl(externalUrl: JsonField<String>) = apply {
                    this.externalUrl = externalUrl
                }

                /**
                 * The amount in the set foreign currency. May be NULL if the transaction does not
                 * have a foreign amount.
                 */
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

                /** Currency code of the foreign currency. Default is NULL. */
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

                /** Number of decimals in the foreign currency. */
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

                /**
                 * Currency ID of the foreign currency, if this transaction has a foreign amount.
                 */
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

                /** If the transaction has attachments. */
                fun hasAttachments(hasAttachments: Boolean) =
                    hasAttachments(JsonField.of(hasAttachments))

                /**
                 * Sets [Builder.hasAttachments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasAttachments] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun hasAttachments(hasAttachments: JsonField<Boolean>) = apply {
                    this.hasAttachments = hasAttachments
                }

                /** Hash value of original import transaction (for duplicate detection). */
                fun importHashV2(importHashV2: String?) =
                    importHashV2(JsonField.ofNullable(importHashV2))

                /**
                 * Sets [Builder.importHashV2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.importHashV2] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun importHashV2(importHashV2: JsonField<String>) = apply {
                    this.importHashV2 = importHashV2
                }

                fun interestDate(interestDate: OffsetDateTime?) =
                    interestDate(JsonField.ofNullable(interestDate))

                /**
                 * Sets [Builder.interestDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interestDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interestDate(interestDate: JsonField<OffsetDateTime>) = apply {
                    this.interestDate = interestDate
                }

                /** Reference to internal reference of other systems. */
                fun internalReference(internalReference: String?) =
                    internalReference(JsonField.ofNullable(internalReference))

                /**
                 * Sets [Builder.internalReference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.internalReference] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun internalReference(internalReference: JsonField<String>) = apply {
                    this.internalReference = internalReference
                }

                fun invoiceDate(invoiceDate: OffsetDateTime?) =
                    invoiceDate(JsonField.ofNullable(invoiceDate))

                /**
                 * Sets [Builder.invoiceDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
                    this.invoiceDate = invoiceDate
                }

                /**
                 * Latitude of the transaction's location, if applicable. Can be used to draw a map.
                 */
                fun latitude(latitude: Double?) = latitude(JsonField.ofNullable(latitude))

                /**
                 * Alias for [Builder.latitude].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun latitude(latitude: Double) = latitude(latitude as Double?)

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /**
                 * Latitude of the transaction's location, if applicable. Can be used to draw a map.
                 */
                fun longitude(longitude: Double?) = longitude(JsonField.ofNullable(longitude))

                /**
                 * Alias for [Builder.longitude].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun longitude(longitude: Double) = longitude(longitude as Double?)

                /**
                 * Sets [Builder.longitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.longitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

                fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

                /**
                 * Sets [Builder.notes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notes] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun notes(notes: JsonField<String>) = apply { this.notes = notes }

                /**
                 * Indicates whether the transaction has a currency setting. For transactions this
                 * is always true.
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

                /** Order of this entry in the list of transactions. */
                fun order(order: Int?) = order(JsonField.ofNullable(order))

                /**
                 * Alias for [Builder.order].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun order(order: Int) = order(order as Int?)

                /**
                 * Sets [Builder.order] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.order] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun order(order: JsonField<Int>) = apply { this.order = order }

                /** System generated identifier for original creator of transaction. */
                fun originalSource(originalSource: String?) =
                    originalSource(JsonField.ofNullable(originalSource))

                /**
                 * Sets [Builder.originalSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originalSource] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun originalSource(originalSource: JsonField<String>) = apply {
                    this.originalSource = originalSource
                }

                fun paymentDate(paymentDate: OffsetDateTime?) =
                    paymentDate(JsonField.ofNullable(paymentDate))

                /**
                 * Sets [Builder.paymentDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentDate(paymentDate: JsonField<OffsetDateTime>) = apply {
                    this.paymentDate = paymentDate
                }

                /**
                 * Amount of the transaction in the primary currency of this administration. The
                 * `primary_currency_*` fields reflect the currency used. This field is NULL if the
                 * user does have 'convert to primary' set to true in their settings.
                 */
                fun pcAmount(pcAmount: String) = pcAmount(JsonField.of(pcAmount))

                /**
                 * Sets [Builder.pcAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pcAmount(pcAmount: JsonField<String>) = apply { this.pcAmount = pcAmount }

                /**
                 * The balance of the destination account in the primary currency of this
                 * administration. The `primary_currency_*` fields reflect the currency used. This
                 * field is NULL if the user does have 'convert to primary' set to true in their
                 * settings.
                 */
                fun pcDestinationBalanceAfter(pcDestinationBalanceAfter: String?) =
                    pcDestinationBalanceAfter(JsonField.ofNullable(pcDestinationBalanceAfter))

                /**
                 * Sets [Builder.pcDestinationBalanceAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcDestinationBalanceAfter] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun pcDestinationBalanceAfter(pcDestinationBalanceAfter: JsonField<String>) =
                    apply {
                        this.pcDestinationBalanceAfter = pcDestinationBalanceAfter
                    }

                /**
                 * Foreign amount of the transaction in the primary currency of this administration.
                 * The `primary_currency_*` fields reflect the currency used. This field is NULL if
                 * the user does have 'convert to primary' set to true in their settings.
                 */
                fun pcForeignAmount(pcForeignAmount: String) =
                    pcForeignAmount(JsonField.of(pcForeignAmount))

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

                /**
                 * The balance of the source account in the primary currency of this administration.
                 * The `primary_currency_*` fields reflect the currency used. This field is NULL if
                 * the user does have 'convert to primary' set to true in their settings.
                 */
                fun pcSourceBalanceAfter(pcSourceBalanceAfter: String?) =
                    pcSourceBalanceAfter(JsonField.ofNullable(pcSourceBalanceAfter))

                /**
                 * Sets [Builder.pcSourceBalanceAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pcSourceBalanceAfter] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pcSourceBalanceAfter(pcSourceBalanceAfter: JsonField<String>) = apply {
                    this.pcSourceBalanceAfter = pcSourceBalanceAfter
                }

                /**
                 * Returns the primary currency code of the administration. This currency is used as
                 * the currency for all `pc_*` amount and balance fields of this account.
                 */
                fun primaryCurrencyCode(primaryCurrencyCode: String?) =
                    primaryCurrencyCode(JsonField.ofNullable(primaryCurrencyCode))

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

                /** See the other `primary_*` fields. */
                fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: Int?) =
                    primaryCurrencyDecimalPlaces(JsonField.ofNullable(primaryCurrencyDecimalPlaces))

                /**
                 * Alias for [Builder.primaryCurrencyDecimalPlaces].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: Int) =
                    primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces as Int?)

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

                /**
                 * Returns the primary currency ID of the administration. This currency is used as
                 * the currency for all `pc_*` amount and balance fields of this account.
                 */
                fun primaryCurrencyId(primaryCurrencyId: String?) =
                    primaryCurrencyId(JsonField.ofNullable(primaryCurrencyId))

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

                /** See the other `primary_*` fields. */
                fun primaryCurrencySymbol(primaryCurrencySymbol: String?) =
                    primaryCurrencySymbol(JsonField.ofNullable(primaryCurrencySymbol))

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

                fun processDate(processDate: OffsetDateTime?) =
                    processDate(JsonField.ofNullable(processDate))

                /**
                 * Sets [Builder.processDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun processDate(processDate: JsonField<OffsetDateTime>) = apply {
                    this.processDate = processDate
                }

                /**
                 * If the transaction has been reconciled already. When you set this, the amount can
                 * no longer be edited by the user.
                 */
                fun reconciled(reconciled: Boolean) = reconciled(JsonField.of(reconciled))

                /**
                 * Sets [Builder.reconciled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reconciled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reconciled(reconciled: JsonField<Boolean>) = apply {
                    this.reconciled = reconciled
                }

                /** The # of the current transaction created under this recurrence. */
                fun recurrenceCount(recurrenceCount: Int?) =
                    recurrenceCount(JsonField.ofNullable(recurrenceCount))

                /**
                 * Alias for [Builder.recurrenceCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun recurrenceCount(recurrenceCount: Int) = recurrenceCount(recurrenceCount as Int?)

                /**
                 * Sets [Builder.recurrenceCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurrenceCount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recurrenceCount(recurrenceCount: JsonField<Int>) = apply {
                    this.recurrenceCount = recurrenceCount
                }

                /** Reference to recurrence that made the transaction. */
                fun recurrenceId(recurrenceId: String?) =
                    recurrenceId(JsonField.ofNullable(recurrenceId))

                /**
                 * Sets [Builder.recurrenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurrenceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recurrenceId(recurrenceId: JsonField<String>) = apply {
                    this.recurrenceId = recurrenceId
                }

                /**
                 * Total number of transactions expected to be created by this recurrence
                 * repetition. Will be 0 if infinite.
                 */
                fun recurrenceTotal(recurrenceTotal: Int?) =
                    recurrenceTotal(JsonField.ofNullable(recurrenceTotal))

                /**
                 * Alias for [Builder.recurrenceTotal].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun recurrenceTotal(recurrenceTotal: Int) = recurrenceTotal(recurrenceTotal as Int?)

                /**
                 * Sets [Builder.recurrenceTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurrenceTotal] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recurrenceTotal(recurrenceTotal: JsonField<Int>) = apply {
                    this.recurrenceTotal = recurrenceTotal
                }

                /** SEPA Batch ID */
                fun sepaBatchId(sepaBatchId: String?) =
                    sepaBatchId(JsonField.ofNullable(sepaBatchId))

                /**
                 * Sets [Builder.sepaBatchId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaBatchId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaBatchId(sepaBatchId: JsonField<String>) = apply {
                    this.sepaBatchId = sepaBatchId
                }

                /** SEPA Clearing Code */
                fun sepaCc(sepaCc: String?) = sepaCc(JsonField.ofNullable(sepaCc))

                /**
                 * Sets [Builder.sepaCc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaCc] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaCc(sepaCc: JsonField<String>) = apply { this.sepaCc = sepaCc }

                /** SEPA Creditor Identifier */
                fun sepaCi(sepaCi: String?) = sepaCi(JsonField.ofNullable(sepaCi))

                /**
                 * Sets [Builder.sepaCi] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaCi] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaCi(sepaCi: JsonField<String>) = apply { this.sepaCi = sepaCi }

                /** SEPA Country */
                fun sepaCountry(sepaCountry: String?) =
                    sepaCountry(JsonField.ofNullable(sepaCountry))

                /**
                 * Sets [Builder.sepaCountry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaCountry] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaCountry(sepaCountry: JsonField<String>) = apply {
                    this.sepaCountry = sepaCountry
                }

                /** SEPA end-to-end Identifier */
                fun sepaCtId(sepaCtId: String?) = sepaCtId(JsonField.ofNullable(sepaCtId))

                /**
                 * Sets [Builder.sepaCtId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaCtId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaCtId(sepaCtId: JsonField<String>) = apply { this.sepaCtId = sepaCtId }

                /** SEPA Opposing Account Identifier */
                fun sepaCtOp(sepaCtOp: String?) = sepaCtOp(JsonField.ofNullable(sepaCtOp))

                /**
                 * Sets [Builder.sepaCtOp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaCtOp] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaCtOp(sepaCtOp: JsonField<String>) = apply { this.sepaCtOp = sepaCtOp }

                /** SEPA mandate identifier */
                fun sepaDb(sepaDb: String?) = sepaDb(JsonField.ofNullable(sepaDb))

                /**
                 * Sets [Builder.sepaDb] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaDb] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaDb(sepaDb: JsonField<String>) = apply { this.sepaDb = sepaDb }

                /** SEPA External Purpose indicator */
                fun sepaEp(sepaEp: String?) = sepaEp(JsonField.ofNullable(sepaEp))

                /**
                 * Sets [Builder.sepaEp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sepaEp] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sepaEp(sepaEp: JsonField<String>) = apply { this.sepaEp = sepaEp }

                /**
                 * The balance of the source account. This is the balance in the account's currency
                 * which may be different from this transaction, and is not provided in this model.
                 */
                fun sourceBalanceAfter(sourceBalanceAfter: String?) =
                    sourceBalanceAfter(JsonField.ofNullable(sourceBalanceAfter))

                /**
                 * Sets [Builder.sourceBalanceAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceBalanceAfter] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sourceBalanceAfter(sourceBalanceAfter: JsonField<String>) = apply {
                    this.sourceBalanceAfter = sourceBalanceAfter
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

                /**
                 * Name of the source account. For a withdrawal or a transfer, this must always be
                 * an asset account. For deposits, this must be a revenue account. Can be used
                 * instead of the source_id. If the transaction is a deposit, the source_name can be
                 * filled in freely: the account will be created based on the name.
                 */
                fun sourceName(sourceName: String?) = sourceName(JsonField.ofNullable(sourceName))

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

                /** The associated subscription ID for this transaction. */
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

                /** The associated subscription name for this transaction. */
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

                /**
                 * ID of the underlying transaction journal. Each transaction consists of a
                 * transaction group (see the top ID) and one or more journals making up the splits
                 * of the transaction.
                 */
                fun transactionJournalId(transactionJournalId: String) =
                    transactionJournalId(JsonField.of(transactionJournalId))

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

                /** User ID */
                fun user(user: String) = user(JsonField.of(user))

                /**
                 * Sets [Builder.user] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.user] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun user(user: JsonField<String>) = apply { this.user = user }

                /**
                 * Zoom level for the map, if drawn. This to set the box right. Unfortunately this
                 * is a proprietary value because each map provider has different zoom levels.
                 */
                fun zoomLevel(zoomLevel: Int?) = zoomLevel(JsonField.ofNullable(zoomLevel))

                /**
                 * Alias for [Builder.zoomLevel].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun zoomLevel(zoomLevel: Int) = zoomLevel(zoomLevel as Int?)

                /**
                 * Sets [Builder.zoomLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zoomLevel] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zoomLevel(zoomLevel: JsonField<Int>) = apply { this.zoomLevel = zoomLevel }

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
                 * .date()
                 * .description()
                 * .destinationId()
                 * .sourceId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Transaction =
                    Transaction(
                        checkRequired("amount", amount),
                        checkRequired("date", date),
                        checkRequired("description", description),
                        checkRequired("destinationId", destinationId),
                        checkRequired("sourceId", sourceId),
                        checkRequired("type", type),
                        billId,
                        billName,
                        bookDate,
                        budgetId,
                        budgetName,
                        categoryId,
                        categoryName,
                        currencyCode,
                        currencyDecimalPlaces,
                        currencyId,
                        currencyName,
                        currencySymbol,
                        destinationBalanceAfter,
                        destinationIban,
                        destinationName,
                        destinationType,
                        dueDate,
                        externalId,
                        externalUrl,
                        foreignAmount,
                        foreignCurrencyCode,
                        foreignCurrencyDecimalPlaces,
                        foreignCurrencyId,
                        foreignCurrencySymbol,
                        hasAttachments,
                        importHashV2,
                        interestDate,
                        internalReference,
                        invoiceDate,
                        latitude,
                        longitude,
                        notes,
                        objectHasCurrencySetting,
                        order,
                        originalSource,
                        paymentDate,
                        pcAmount,
                        pcDestinationBalanceAfter,
                        pcForeignAmount,
                        pcSourceBalanceAfter,
                        primaryCurrencyCode,
                        primaryCurrencyDecimalPlaces,
                        primaryCurrencyId,
                        primaryCurrencySymbol,
                        processDate,
                        reconciled,
                        recurrenceCount,
                        recurrenceId,
                        recurrenceTotal,
                        sepaBatchId,
                        sepaCc,
                        sepaCi,
                        sepaCountry,
                        sepaCtId,
                        sepaCtOp,
                        sepaDb,
                        sepaEp,
                        sourceBalanceAfter,
                        sourceIban,
                        sourceName,
                        sourceType,
                        subscriptionId,
                        subscriptionName,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        transactionJournalId,
                        user,
                        zoomLevel,
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
             * @throws FireflyInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Transaction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                date()
                description()
                destinationId()
                sourceId()
                type().validate()
                billId()
                billName()
                bookDate()
                budgetId()
                budgetName()
                categoryId()
                categoryName()
                currencyCode()
                currencyDecimalPlaces()
                currencyId()
                currencyName()
                currencySymbol()
                destinationBalanceAfter()
                destinationIban()
                destinationName()
                destinationType()?.validate()
                dueDate()
                externalId()
                externalUrl()
                foreignAmount()
                foreignCurrencyCode()
                foreignCurrencyDecimalPlaces()
                foreignCurrencyId()
                foreignCurrencySymbol()
                hasAttachments()
                importHashV2()
                interestDate()
                internalReference()
                invoiceDate()
                latitude()
                longitude()
                notes()
                objectHasCurrencySetting()
                order()
                originalSource()
                paymentDate()
                pcAmount()
                pcDestinationBalanceAfter()
                pcForeignAmount()
                pcSourceBalanceAfter()
                primaryCurrencyCode()
                primaryCurrencyDecimalPlaces()
                primaryCurrencyId()
                primaryCurrencySymbol()
                processDate()
                reconciled()
                recurrenceCount()
                recurrenceId()
                recurrenceTotal()
                sepaBatchId()
                sepaCc()
                sepaCi()
                sepaCountry()
                sepaCtId()
                sepaCtOp()
                sepaDb()
                sepaEp()
                sourceBalanceAfter()
                sourceIban()
                sourceName()
                sourceType()?.validate()
                subscriptionId()
                subscriptionName()
                tags()
                transactionJournalId()
                user()
                zoomLevel()
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
                    (if (date.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (destinationId.asKnown() == null) 0 else 1) +
                    (if (sourceId.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (billId.asKnown() == null) 0 else 1) +
                    (if (billName.asKnown() == null) 0 else 1) +
                    (if (bookDate.asKnown() == null) 0 else 1) +
                    (if (budgetId.asKnown() == null) 0 else 1) +
                    (if (budgetName.asKnown() == null) 0 else 1) +
                    (if (categoryId.asKnown() == null) 0 else 1) +
                    (if (categoryName.asKnown() == null) 0 else 1) +
                    (if (currencyCode.asKnown() == null) 0 else 1) +
                    (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (currencyId.asKnown() == null) 0 else 1) +
                    (if (currencyName.asKnown() == null) 0 else 1) +
                    (if (currencySymbol.asKnown() == null) 0 else 1) +
                    (if (destinationBalanceAfter.asKnown() == null) 0 else 1) +
                    (if (destinationIban.asKnown() == null) 0 else 1) +
                    (if (destinationName.asKnown() == null) 0 else 1) +
                    (destinationType.asKnown()?.validity() ?: 0) +
                    (if (dueDate.asKnown() == null) 0 else 1) +
                    (if (externalId.asKnown() == null) 0 else 1) +
                    (if (externalUrl.asKnown() == null) 0 else 1) +
                    (if (foreignAmount.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyCode.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencyId.asKnown() == null) 0 else 1) +
                    (if (foreignCurrencySymbol.asKnown() == null) 0 else 1) +
                    (if (hasAttachments.asKnown() == null) 0 else 1) +
                    (if (importHashV2.asKnown() == null) 0 else 1) +
                    (if (interestDate.asKnown() == null) 0 else 1) +
                    (if (internalReference.asKnown() == null) 0 else 1) +
                    (if (invoiceDate.asKnown() == null) 0 else 1) +
                    (if (latitude.asKnown() == null) 0 else 1) +
                    (if (longitude.asKnown() == null) 0 else 1) +
                    (if (notes.asKnown() == null) 0 else 1) +
                    (if (objectHasCurrencySetting.asKnown() == null) 0 else 1) +
                    (if (order.asKnown() == null) 0 else 1) +
                    (if (originalSource.asKnown() == null) 0 else 1) +
                    (if (paymentDate.asKnown() == null) 0 else 1) +
                    (if (pcAmount.asKnown() == null) 0 else 1) +
                    (if (pcDestinationBalanceAfter.asKnown() == null) 0 else 1) +
                    (if (pcForeignAmount.asKnown() == null) 0 else 1) +
                    (if (pcSourceBalanceAfter.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                    (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                    (if (processDate.asKnown() == null) 0 else 1) +
                    (if (reconciled.asKnown() == null) 0 else 1) +
                    (if (recurrenceCount.asKnown() == null) 0 else 1) +
                    (if (recurrenceId.asKnown() == null) 0 else 1) +
                    (if (recurrenceTotal.asKnown() == null) 0 else 1) +
                    (if (sepaBatchId.asKnown() == null) 0 else 1) +
                    (if (sepaCc.asKnown() == null) 0 else 1) +
                    (if (sepaCi.asKnown() == null) 0 else 1) +
                    (if (sepaCountry.asKnown() == null) 0 else 1) +
                    (if (sepaCtId.asKnown() == null) 0 else 1) +
                    (if (sepaCtOp.asKnown() == null) 0 else 1) +
                    (if (sepaDb.asKnown() == null) 0 else 1) +
                    (if (sepaEp.asKnown() == null) 0 else 1) +
                    (if (sourceBalanceAfter.asKnown() == null) 0 else 1) +
                    (if (sourceIban.asKnown() == null) 0 else 1) +
                    (if (sourceName.asKnown() == null) 0 else 1) +
                    (sourceType.asKnown()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (subscriptionName.asKnown() == null) 0 else 1) +
                    (tags.asKnown()?.size ?: 0) +
                    (if (transactionJournalId.asKnown() == null) 0 else 1) +
                    (if (user.asKnown() == null) 0 else 1) +
                    (if (zoomLevel.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Transaction &&
                    amount == other.amount &&
                    date == other.date &&
                    description == other.description &&
                    destinationId == other.destinationId &&
                    sourceId == other.sourceId &&
                    type == other.type &&
                    billId == other.billId &&
                    billName == other.billName &&
                    bookDate == other.bookDate &&
                    budgetId == other.budgetId &&
                    budgetName == other.budgetName &&
                    categoryId == other.categoryId &&
                    categoryName == other.categoryName &&
                    currencyCode == other.currencyCode &&
                    currencyDecimalPlaces == other.currencyDecimalPlaces &&
                    currencyId == other.currencyId &&
                    currencyName == other.currencyName &&
                    currencySymbol == other.currencySymbol &&
                    destinationBalanceAfter == other.destinationBalanceAfter &&
                    destinationIban == other.destinationIban &&
                    destinationName == other.destinationName &&
                    destinationType == other.destinationType &&
                    dueDate == other.dueDate &&
                    externalId == other.externalId &&
                    externalUrl == other.externalUrl &&
                    foreignAmount == other.foreignAmount &&
                    foreignCurrencyCode == other.foreignCurrencyCode &&
                    foreignCurrencyDecimalPlaces == other.foreignCurrencyDecimalPlaces &&
                    foreignCurrencyId == other.foreignCurrencyId &&
                    foreignCurrencySymbol == other.foreignCurrencySymbol &&
                    hasAttachments == other.hasAttachments &&
                    importHashV2 == other.importHashV2 &&
                    interestDate == other.interestDate &&
                    internalReference == other.internalReference &&
                    invoiceDate == other.invoiceDate &&
                    latitude == other.latitude &&
                    longitude == other.longitude &&
                    notes == other.notes &&
                    objectHasCurrencySetting == other.objectHasCurrencySetting &&
                    order == other.order &&
                    originalSource == other.originalSource &&
                    paymentDate == other.paymentDate &&
                    pcAmount == other.pcAmount &&
                    pcDestinationBalanceAfter == other.pcDestinationBalanceAfter &&
                    pcForeignAmount == other.pcForeignAmount &&
                    pcSourceBalanceAfter == other.pcSourceBalanceAfter &&
                    primaryCurrencyCode == other.primaryCurrencyCode &&
                    primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                    primaryCurrencyId == other.primaryCurrencyId &&
                    primaryCurrencySymbol == other.primaryCurrencySymbol &&
                    processDate == other.processDate &&
                    reconciled == other.reconciled &&
                    recurrenceCount == other.recurrenceCount &&
                    recurrenceId == other.recurrenceId &&
                    recurrenceTotal == other.recurrenceTotal &&
                    sepaBatchId == other.sepaBatchId &&
                    sepaCc == other.sepaCc &&
                    sepaCi == other.sepaCi &&
                    sepaCountry == other.sepaCountry &&
                    sepaCtId == other.sepaCtId &&
                    sepaCtOp == other.sepaCtOp &&
                    sepaDb == other.sepaDb &&
                    sepaEp == other.sepaEp &&
                    sourceBalanceAfter == other.sourceBalanceAfter &&
                    sourceIban == other.sourceIban &&
                    sourceName == other.sourceName &&
                    sourceType == other.sourceType &&
                    subscriptionId == other.subscriptionId &&
                    subscriptionName == other.subscriptionName &&
                    tags == other.tags &&
                    transactionJournalId == other.transactionJournalId &&
                    user == other.user &&
                    zoomLevel == other.zoomLevel &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    date,
                    description,
                    destinationId,
                    sourceId,
                    type,
                    billId,
                    billName,
                    bookDate,
                    budgetId,
                    budgetName,
                    categoryId,
                    categoryName,
                    currencyCode,
                    currencyDecimalPlaces,
                    currencyId,
                    currencyName,
                    currencySymbol,
                    destinationBalanceAfter,
                    destinationIban,
                    destinationName,
                    destinationType,
                    dueDate,
                    externalId,
                    externalUrl,
                    foreignAmount,
                    foreignCurrencyCode,
                    foreignCurrencyDecimalPlaces,
                    foreignCurrencyId,
                    foreignCurrencySymbol,
                    hasAttachments,
                    importHashV2,
                    interestDate,
                    internalReference,
                    invoiceDate,
                    latitude,
                    longitude,
                    notes,
                    objectHasCurrencySetting,
                    order,
                    originalSource,
                    paymentDate,
                    pcAmount,
                    pcDestinationBalanceAfter,
                    pcForeignAmount,
                    pcSourceBalanceAfter,
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencySymbol,
                    processDate,
                    reconciled,
                    recurrenceCount,
                    recurrenceId,
                    recurrenceTotal,
                    sepaBatchId,
                    sepaCc,
                    sepaCi,
                    sepaCountry,
                    sepaCtId,
                    sepaCtOp,
                    sepaDb,
                    sepaEp,
                    sourceBalanceAfter,
                    sourceIban,
                    sourceName,
                    sourceType,
                    subscriptionId,
                    subscriptionName,
                    tags,
                    transactionJournalId,
                    user,
                    zoomLevel,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Transaction{amount=$amount, date=$date, description=$description, destinationId=$destinationId, sourceId=$sourceId, type=$type, billId=$billId, billName=$billName, bookDate=$bookDate, budgetId=$budgetId, budgetName=$budgetName, categoryId=$categoryId, categoryName=$categoryName, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, destinationBalanceAfter=$destinationBalanceAfter, destinationIban=$destinationIban, destinationName=$destinationName, destinationType=$destinationType, dueDate=$dueDate, externalId=$externalId, externalUrl=$externalUrl, foreignAmount=$foreignAmount, foreignCurrencyCode=$foreignCurrencyCode, foreignCurrencyDecimalPlaces=$foreignCurrencyDecimalPlaces, foreignCurrencyId=$foreignCurrencyId, foreignCurrencySymbol=$foreignCurrencySymbol, hasAttachments=$hasAttachments, importHashV2=$importHashV2, interestDate=$interestDate, internalReference=$internalReference, invoiceDate=$invoiceDate, latitude=$latitude, longitude=$longitude, notes=$notes, objectHasCurrencySetting=$objectHasCurrencySetting, order=$order, originalSource=$originalSource, paymentDate=$paymentDate, pcAmount=$pcAmount, pcDestinationBalanceAfter=$pcDestinationBalanceAfter, pcForeignAmount=$pcForeignAmount, pcSourceBalanceAfter=$pcSourceBalanceAfter, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencySymbol=$primaryCurrencySymbol, processDate=$processDate, reconciled=$reconciled, recurrenceCount=$recurrenceCount, recurrenceId=$recurrenceId, recurrenceTotal=$recurrenceTotal, sepaBatchId=$sepaBatchId, sepaCc=$sepaCc, sepaCi=$sepaCi, sepaCountry=$sepaCountry, sepaCtId=$sepaCtId, sepaCtOp=$sepaCtOp, sepaDb=$sepaDb, sepaEp=$sepaEp, sourceBalanceAfter=$sourceBalanceAfter, sourceIban=$sourceIban, sourceName=$sourceName, sourceType=$sourceType, subscriptionId=$subscriptionId, subscriptionName=$subscriptionName, tags=$tags, transactionJournalId=$transactionJournalId, user=$user, zoomLevel=$zoomLevel, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                transactions == other.transactions &&
                createdAt == other.createdAt &&
                groupTitle == other.groupTitle &&
                updatedAt == other.updatedAt &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(transactions, createdAt, groupTitle, updatedAt, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{transactions=$transactions, createdAt=$createdAt, groupTitle=$groupTitle, updatedAt=$updatedAt, user=$user, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionRead &&
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
        "TransactionRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
