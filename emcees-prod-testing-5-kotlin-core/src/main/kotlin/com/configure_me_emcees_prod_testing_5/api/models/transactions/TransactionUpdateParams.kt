// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.transactions

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Update an existing transaction. */
class TransactionUpdateParams
private constructor(
    private val id: String?,
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun xTraceId(): String? = xTraceId

    /**
     * Whether or not to apply rules when submitting transaction.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun applyRules(): Boolean? = body.applyRules()

    /**
     * Whether or not to fire the webhooks that are related to this event.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fireWebhooks(): Boolean? = body.fireWebhooks()

    /**
     * Title of the transaction if it has been split in more than one piece. Empty otherwise.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun groupTitle(): String? = body.groupTitle()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactions(): List<Transaction>? = body.transactions()

    /**
     * Returns the raw JSON value of [applyRules].
     *
     * Unlike [applyRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applyRules(): JsonField<Boolean> = body._applyRules()

    /**
     * Returns the raw JSON value of [fireWebhooks].
     *
     * Unlike [fireWebhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fireWebhooks(): JsonField<Boolean> = body._fireWebhooks()

    /**
     * Returns the raw JSON value of [groupTitle].
     *
     * Unlike [groupTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupTitle(): JsonField<String> = body._groupTitle()

    /**
     * Returns the raw JSON value of [transactions].
     *
     * Unlike [transactions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactions(): JsonField<List<Transaction>> = body._transactions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TransactionUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TransactionUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TransactionUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionUpdateParams: TransactionUpdateParams) = apply {
            id = transactionUpdateParams.id
            xTraceId = transactionUpdateParams.xTraceId
            body = transactionUpdateParams.body.toBuilder()
            additionalHeaders = transactionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [applyRules]
         * - [fireWebhooks]
         * - [groupTitle]
         * - [transactions]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Whether or not to apply rules when submitting transaction. */
        fun applyRules(applyRules: Boolean) = apply { body.applyRules(applyRules) }

        /**
         * Sets [Builder.applyRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyRules] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applyRules(applyRules: JsonField<Boolean>) = apply { body.applyRules(applyRules) }

        /** Whether or not to fire the webhooks that are related to this event. */
        fun fireWebhooks(fireWebhooks: Boolean) = apply { body.fireWebhooks(fireWebhooks) }

        /**
         * Sets [Builder.fireWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fireWebhooks] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fireWebhooks(fireWebhooks: JsonField<Boolean>) = apply {
            body.fireWebhooks(fireWebhooks)
        }

        /**
         * Title of the transaction if it has been split in more than one piece. Empty otherwise.
         */
        fun groupTitle(groupTitle: String?) = apply { body.groupTitle(groupTitle) }

        /**
         * Sets [Builder.groupTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupTitle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupTitle(groupTitle: JsonField<String>) = apply { body.groupTitle(groupTitle) }

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
         * Returns an immutable instance of [TransactionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransactionUpdateParams =
            TransactionUpdateParams(
                id,
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

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
        private val applyRules: JsonField<Boolean>,
        private val fireWebhooks: JsonField<Boolean>,
        private val groupTitle: JsonField<String>,
        private val transactions: JsonField<List<Transaction>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("apply_rules")
            @ExcludeMissing
            applyRules: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("fire_webhooks")
            @ExcludeMissing
            fireWebhooks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("group_title")
            @ExcludeMissing
            groupTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transactions")
            @ExcludeMissing
            transactions: JsonField<List<Transaction>> = JsonMissing.of(),
        ) : this(applyRules, fireWebhooks, groupTitle, transactions, mutableMapOf())

        /**
         * Whether or not to apply rules when submitting transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun applyRules(): Boolean? = applyRules.getNullable("apply_rules")

        /**
         * Whether or not to fire the webhooks that are related to this event.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fireWebhooks(): Boolean? = fireWebhooks.getNullable("fire_webhooks")

        /**
         * Title of the transaction if it has been split in more than one piece. Empty otherwise.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groupTitle(): String? = groupTitle.getNullable("group_title")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactions(): List<Transaction>? = transactions.getNullable("transactions")

        /**
         * Returns the raw JSON value of [applyRules].
         *
         * Unlike [applyRules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apply_rules")
        @ExcludeMissing
        fun _applyRules(): JsonField<Boolean> = applyRules

        /**
         * Returns the raw JSON value of [fireWebhooks].
         *
         * Unlike [fireWebhooks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fire_webhooks")
        @ExcludeMissing
        fun _fireWebhooks(): JsonField<Boolean> = fireWebhooks

        /**
         * Returns the raw JSON value of [groupTitle].
         *
         * Unlike [groupTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_title")
        @ExcludeMissing
        fun _groupTitle(): JsonField<String> = groupTitle

        /**
         * Returns the raw JSON value of [transactions].
         *
         * Unlike [transactions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactions")
        @ExcludeMissing
        fun _transactions(): JsonField<List<Transaction>> = transactions

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var applyRules: JsonField<Boolean> = JsonMissing.of()
            private var fireWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var groupTitle: JsonField<String> = JsonMissing.of()
            private var transactions: JsonField<MutableList<Transaction>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                applyRules = body.applyRules
                fireWebhooks = body.fireWebhooks
                groupTitle = body.groupTitle
                transactions = body.transactions.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Whether or not to apply rules when submitting transaction. */
            fun applyRules(applyRules: Boolean) = applyRules(JsonField.of(applyRules))

            /**
             * Sets [Builder.applyRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applyRules] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applyRules(applyRules: JsonField<Boolean>) = apply { this.applyRules = applyRules }

            /** Whether or not to fire the webhooks that are related to this event. */
            fun fireWebhooks(fireWebhooks: Boolean) = fireWebhooks(JsonField.of(fireWebhooks))

            /**
             * Sets [Builder.fireWebhooks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fireWebhooks] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fireWebhooks(fireWebhooks: JsonField<Boolean>) = apply {
                this.fireWebhooks = fireWebhooks
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
             */
            fun build(): Body =
                Body(
                    applyRules,
                    fireWebhooks,
                    groupTitle,
                    (transactions ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            applyRules()
            fireWebhooks()
            groupTitle()
            transactions()?.forEach { it.validate() }
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
            (if (applyRules.asKnown() == null) 0 else 1) +
                (if (fireWebhooks.asKnown() == null) 0 else 1) +
                (if (groupTitle.asKnown() == null) 0 else 1) +
                (transactions.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                applyRules == other.applyRules &&
                fireWebhooks == other.fireWebhooks &&
                groupTitle == other.groupTitle &&
                transactions == other.transactions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(applyRules, fireWebhooks, groupTitle, transactions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{applyRules=$applyRules, fireWebhooks=$fireWebhooks, groupTitle=$groupTitle, transactions=$transactions, additionalProperties=$additionalProperties}"
    }

    class Transaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<String>,
        private val billId: JsonField<String>,
        private val billName: JsonField<String>,
        private val bookDate: JsonField<OffsetDateTime>,
        private val budgetId: JsonField<String>,
        private val categoryId: JsonField<String>,
        private val categoryName: JsonField<String>,
        private val currencyCode: JsonField<String>,
        private val currencyId: JsonField<String>,
        private val date: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val destinationIban: JsonField<String>,
        private val destinationId: JsonField<String>,
        private val destinationName: JsonField<String>,
        private val dueDate: JsonField<OffsetDateTime>,
        private val externalId: JsonField<String>,
        private val externalUrl: JsonField<String>,
        private val foreignAmount: JsonField<String>,
        private val foreignCurrencyCode: JsonField<String>,
        private val foreignCurrencyId: JsonField<String>,
        private val interestDate: JsonField<OffsetDateTime>,
        private val internalReference: JsonField<String>,
        private val invoiceDate: JsonField<OffsetDateTime>,
        private val notes: JsonField<String>,
        private val order: JsonField<Int>,
        private val paymentDate: JsonField<OffsetDateTime>,
        private val processDate: JsonField<OffsetDateTime>,
        private val reconciled: JsonField<Boolean>,
        private val sepaBatchId: JsonField<String>,
        private val sepaCc: JsonField<String>,
        private val sepaCi: JsonField<String>,
        private val sepaCountry: JsonField<String>,
        private val sepaCtId: JsonField<String>,
        private val sepaCtOp: JsonField<String>,
        private val sepaDb: JsonField<String>,
        private val sepaEp: JsonField<String>,
        private val sourceIban: JsonField<String>,
        private val sourceId: JsonField<String>,
        private val sourceName: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val transactionJournalId: JsonField<String>,
        private val type: JsonField<TransactionTypeProperty>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bill_id") @ExcludeMissing billId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bill_name")
            @ExcludeMissing
            billName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("book_date")
            @ExcludeMissing
            bookDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category_id")
            @ExcludeMissing
            categoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category_name")
            @ExcludeMissing
            categoryName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_code")
            @ExcludeMissing
            currencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_id")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date")
            @ExcludeMissing
            date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_iban")
            @ExcludeMissing
            destinationIban: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_id")
            @ExcludeMissing
            destinationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_name")
            @ExcludeMissing
            destinationName: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("foreign_currency_id")
            @ExcludeMissing
            foreignCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interest_date")
            @ExcludeMissing
            interestDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("internal_reference")
            @ExcludeMissing
            internalReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_date")
            @ExcludeMissing
            invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payment_date")
            @ExcludeMissing
            paymentDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("process_date")
            @ExcludeMissing
            processDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("reconciled")
            @ExcludeMissing
            reconciled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sepa_batch_id")
            @ExcludeMissing
            sepaBatchId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_cc") @ExcludeMissing sepaCc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_ci") @ExcludeMissing sepaCi: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_country")
            @ExcludeMissing
            sepaCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_ct_id")
            @ExcludeMissing
            sepaCtId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_ct_op")
            @ExcludeMissing
            sepaCtOp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_db") @ExcludeMissing sepaDb: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sepa_ep") @ExcludeMissing sepaEp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_iban")
            @ExcludeMissing
            sourceIban: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_id")
            @ExcludeMissing
            sourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_name")
            @ExcludeMissing
            sourceName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("transaction_journal_id")
            @ExcludeMissing
            transactionJournalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<TransactionTypeProperty> = JsonMissing.of(),
        ) : this(
            amount,
            billId,
            billName,
            bookDate,
            budgetId,
            categoryId,
            categoryName,
            currencyCode,
            currencyId,
            date,
            description,
            destinationIban,
            destinationId,
            destinationName,
            dueDate,
            externalId,
            externalUrl,
            foreignAmount,
            foreignCurrencyCode,
            foreignCurrencyId,
            interestDate,
            internalReference,
            invoiceDate,
            notes,
            order,
            paymentDate,
            processDate,
            reconciled,
            sepaBatchId,
            sepaCc,
            sepaCi,
            sepaCountry,
            sepaCtId,
            sepaCtOp,
            sepaDb,
            sepaEp,
            sourceIban,
            sourceId,
            sourceName,
            tags,
            transactionJournalId,
            type,
            mutableMapOf(),
        )

        /**
         * Amount of the transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String? = amount.getNullable("amount")

        /**
         * Optional. Use either this or the bill_name
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun billId(): String? = billId.getNullable("bill_id")

        /**
         * Optional. Use either this or the bill_id
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun billName(): String? = billName.getNullable("bill_name")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bookDate(): OffsetDateTime? = bookDate.getNullable("book_date")

        /**
         * The budget ID for this transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun budgetId(): String? = budgetId.getNullable("budget_id")

        /**
         * The category ID for this transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun categoryId(): String? = categoryId.getNullable("category_id")

        /**
         * The name of the category to be used. If the category is unknown, it will be created. If
         * the ID and the name point to different categories, the ID overrules the name.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun categoryName(): String? = categoryName.getNullable("category_name")

        /**
         * Currency code. Default is the source account's currency, or the user's financial
         * administration's primary currency. Can be used instead of currency_id.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * Currency ID. Default is the source account's currency, or the user's financial
         * administration's primary currency. Can be used instead of currency_code.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * Date of the transaction
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun date(): OffsetDateTime? = date.getNullable("date")

        /**
         * Description of the transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun destinationIban(): String? = destinationIban.getNullable("destination_iban")

        /**
         * ID of the destination account. For a deposit or a transfer, this must always be an asset
         * account. For withdrawals this must be an expense account.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun destinationId(): String? = destinationId.getNullable("destination_id")

        /**
         * Name of the destination account. You can submit the name instead of the ID. For
         * everything except transfers, the account will be auto-generated if unknown, so submitting
         * a name is enough.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun destinationName(): String? = destinationName.getNullable("destination_name")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dueDate(): OffsetDateTime? = dueDate.getNullable("due_date")

        /**
         * Reference to external ID in other systems.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): String? = externalId.getNullable("external_id")

        /**
         * External, custom URL for this transaction.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalUrl(): String? = externalUrl.getNullable("external_url")

        /**
         * The amount in a foreign currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun foreignAmount(): String? = foreignAmount.getNullable("foreign_amount")

        /**
         * Currency code of the foreign currency. Default is NULL. Can be used instead of the
         * foreign_currency_id, but this or the ID is required when submitting a foreign amount.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun foreignCurrencyCode(): String? =
            foreignCurrencyCode.getNullable("foreign_currency_code")

        /**
         * Currency ID of the foreign currency. Default is null. Is required when you submit a
         * foreign amount.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun foreignCurrencyId(): String? = foreignCurrencyId.getNullable("foreign_currency_id")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun interestDate(): OffsetDateTime? = interestDate.getNullable("interest_date")

        /**
         * Reference to internal reference of other systems.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun internalReference(): String? = internalReference.getNullable("internal_reference")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun invoiceDate(): OffsetDateTime? = invoiceDate.getNullable("invoice_date")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * Order of this entry in the list of transactions.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun paymentDate(): OffsetDateTime? = paymentDate.getNullable("payment_date")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun processDate(): OffsetDateTime? = processDate.getNullable("process_date")

        /**
         * If the transaction has been reconciled already. When you set this, the amount can no
         * longer be edited by the user.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reconciled(): Boolean? = reconciled.getNullable("reconciled")

        /**
         * SEPA Batch ID
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaBatchId(): String? = sepaBatchId.getNullable("sepa_batch_id")

        /**
         * SEPA Clearing Code
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaCc(): String? = sepaCc.getNullable("sepa_cc")

        /**
         * SEPA Creditor Identifier
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaCi(): String? = sepaCi.getNullable("sepa_ci")

        /**
         * SEPA Country
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaCountry(): String? = sepaCountry.getNullable("sepa_country")

        /**
         * SEPA end-to-end Identifier
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaCtId(): String? = sepaCtId.getNullable("sepa_ct_id")

        /**
         * SEPA Opposing Account Identifier
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaCtOp(): String? = sepaCtOp.getNullable("sepa_ct_op")

        /**
         * SEPA mandate identifier
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaDb(): String? = sepaDb.getNullable("sepa_db")

        /**
         * SEPA External Purpose indicator
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sepaEp(): String? = sepaEp.getNullable("sepa_ep")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceIban(): String? = sourceIban.getNullable("source_iban")

        /**
         * ID of the source account. For a withdrawal or a transfer, this must always be an asset
         * account. For deposits, this must be a revenue account.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceId(): String? = sourceId.getNullable("source_id")

        /**
         * Name of the source account. For a withdrawal or a transfer, this must always be an asset
         * account. For deposits, this must be a revenue account. Can be used instead of the
         * source_id. If the transaction is a deposit, the source_name can be filled in freely: the
         * account will be created based on the name.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceName(): String? = sourceName.getNullable("source_name")

        /**
         * Array of tags.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): List<String>? = tags.getNullable("tags")

        /**
         * Transaction journal ID of current transaction (split).
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactionJournalId(): String? =
            transactionJournalId.getNullable("transaction_journal_id")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): TransactionTypeProperty? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [billId].
         *
         * Unlike [billId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bill_id") @ExcludeMissing fun _billId(): JsonField<String> = billId

        /**
         * Returns the raw JSON value of [billName].
         *
         * Unlike [billName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bill_name") @ExcludeMissing fun _billName(): JsonField<String> = billName

        /**
         * Returns the raw JSON value of [bookDate].
         *
         * Unlike [bookDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("book_date")
        @ExcludeMissing
        fun _bookDate(): JsonField<OffsetDateTime> = bookDate

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
         * Returns the raw JSON value of [currencyId].
         *
         * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency_id")
        @ExcludeMissing
        fun _currencyId(): JsonField<String> = currencyId

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [destinationIban].
         *
         * Unlike [destinationIban], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [destinationName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destination_name")
        @ExcludeMissing
        fun _destinationName(): JsonField<String> = destinationName

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
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [externalUrl].
         *
         * Unlike [externalUrl], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns the raw JSON value of [foreignCurrencyId].
         *
         * Unlike [foreignCurrencyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("foreign_currency_id")
        @ExcludeMissing
        fun _foreignCurrencyId(): JsonField<String> = foreignCurrencyId

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
         * Unlike [internalReference], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("internal_reference")
        @ExcludeMissing
        fun _internalReference(): JsonField<String> = internalReference

        /**
         * Returns the raw JSON value of [invoiceDate].
         *
         * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_date")
        @ExcludeMissing
        fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

        /**
         * Returns the raw JSON value of [paymentDate].
         *
         * Unlike [paymentDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_date")
        @ExcludeMissing
        fun _paymentDate(): JsonField<OffsetDateTime> = paymentDate

        /**
         * Returns the raw JSON value of [processDate].
         *
         * Unlike [processDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("process_date")
        @ExcludeMissing
        fun _processDate(): JsonField<OffsetDateTime> = processDate

        /**
         * Returns the raw JSON value of [reconciled].
         *
         * Unlike [reconciled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reconciled")
        @ExcludeMissing
        fun _reconciled(): JsonField<Boolean> = reconciled

        /**
         * Returns the raw JSON value of [sepaBatchId].
         *
         * Unlike [sepaBatchId], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [sepaCountry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sepa_country")
        @ExcludeMissing
        fun _sepaCountry(): JsonField<String> = sepaCountry

        /**
         * Returns the raw JSON value of [sepaCtId].
         *
         * Unlike [sepaCtId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sepa_ct_id") @ExcludeMissing fun _sepaCtId(): JsonField<String> = sepaCtId

        /**
         * Returns the raw JSON value of [sepaCtOp].
         *
         * Unlike [sepaCtOp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sepa_ct_op") @ExcludeMissing fun _sepaCtOp(): JsonField<String> = sepaCtOp

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
         * Returns the raw JSON value of [sourceIban].
         *
         * Unlike [sourceIban], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_iban")
        @ExcludeMissing
        fun _sourceIban(): JsonField<String> = sourceIban

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [sourceName].
         *
         * Unlike [sourceName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_name")
        @ExcludeMissing
        fun _sourceName(): JsonField<String> = sourceName

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<TransactionTypeProperty> = type

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

            /** Returns a mutable builder for constructing an instance of [Transaction]. */
            fun builder() = Builder()
        }

        /** A builder for [Transaction]. */
        class Builder internal constructor() {

            private var amount: JsonField<String> = JsonMissing.of()
            private var billId: JsonField<String> = JsonMissing.of()
            private var billName: JsonField<String> = JsonMissing.of()
            private var bookDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var categoryId: JsonField<String> = JsonMissing.of()
            private var categoryName: JsonField<String> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var date: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var destinationIban: JsonField<String> = JsonMissing.of()
            private var destinationId: JsonField<String> = JsonMissing.of()
            private var destinationName: JsonField<String> = JsonMissing.of()
            private var dueDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var externalUrl: JsonField<String> = JsonMissing.of()
            private var foreignAmount: JsonField<String> = JsonMissing.of()
            private var foreignCurrencyCode: JsonField<String> = JsonMissing.of()
            private var foreignCurrencyId: JsonField<String> = JsonMissing.of()
            private var interestDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var internalReference: JsonField<String> = JsonMissing.of()
            private var invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var paymentDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var processDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var reconciled: JsonField<Boolean> = JsonMissing.of()
            private var sepaBatchId: JsonField<String> = JsonMissing.of()
            private var sepaCc: JsonField<String> = JsonMissing.of()
            private var sepaCi: JsonField<String> = JsonMissing.of()
            private var sepaCountry: JsonField<String> = JsonMissing.of()
            private var sepaCtId: JsonField<String> = JsonMissing.of()
            private var sepaCtOp: JsonField<String> = JsonMissing.of()
            private var sepaDb: JsonField<String> = JsonMissing.of()
            private var sepaEp: JsonField<String> = JsonMissing.of()
            private var sourceIban: JsonField<String> = JsonMissing.of()
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var sourceName: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var transactionJournalId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<TransactionTypeProperty> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transaction: Transaction) = apply {
                amount = transaction.amount
                billId = transaction.billId
                billName = transaction.billName
                bookDate = transaction.bookDate
                budgetId = transaction.budgetId
                categoryId = transaction.categoryId
                categoryName = transaction.categoryName
                currencyCode = transaction.currencyCode
                currencyId = transaction.currencyId
                date = transaction.date
                description = transaction.description
                destinationIban = transaction.destinationIban
                destinationId = transaction.destinationId
                destinationName = transaction.destinationName
                dueDate = transaction.dueDate
                externalId = transaction.externalId
                externalUrl = transaction.externalUrl
                foreignAmount = transaction.foreignAmount
                foreignCurrencyCode = transaction.foreignCurrencyCode
                foreignCurrencyId = transaction.foreignCurrencyId
                interestDate = transaction.interestDate
                internalReference = transaction.internalReference
                invoiceDate = transaction.invoiceDate
                notes = transaction.notes
                order = transaction.order
                paymentDate = transaction.paymentDate
                processDate = transaction.processDate
                reconciled = transaction.reconciled
                sepaBatchId = transaction.sepaBatchId
                sepaCc = transaction.sepaCc
                sepaCi = transaction.sepaCi
                sepaCountry = transaction.sepaCountry
                sepaCtId = transaction.sepaCtId
                sepaCtOp = transaction.sepaCtOp
                sepaDb = transaction.sepaDb
                sepaEp = transaction.sepaEp
                sourceIban = transaction.sourceIban
                sourceId = transaction.sourceId
                sourceName = transaction.sourceName
                tags = transaction.tags.map { it.toMutableList() }
                transactionJournalId = transaction.transactionJournalId
                type = transaction.type
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

            /** Optional. Use either this or the bill_name */
            fun billId(billId: String?) = billId(JsonField.ofNullable(billId))

            /**
             * Sets [Builder.billId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billId(billId: JsonField<String>) = apply { this.billId = billId }

            /** Optional. Use either this or the bill_id */
            fun billName(billName: String?) = billName(JsonField.ofNullable(billName))

            /**
             * Sets [Builder.billName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billName(billName: JsonField<String>) = apply { this.billName = billName }

            fun bookDate(bookDate: OffsetDateTime?) = bookDate(JsonField.ofNullable(bookDate))

            /**
             * Sets [Builder.bookDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bookDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bookDate(bookDate: JsonField<OffsetDateTime>) = apply { this.bookDate = bookDate }

            /** The budget ID for this transaction. */
            fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

            /**
             * Sets [Builder.budgetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            /** The category ID for this transaction. */
            fun categoryId(categoryId: String?) = categoryId(JsonField.ofNullable(categoryId))

            /**
             * Sets [Builder.categoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categoryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categoryId(categoryId: JsonField<String>) = apply { this.categoryId = categoryId }

            /**
             * The name of the category to be used. If the category is unknown, it will be created.
             * If the ID and the name point to different categories, the ID overrules the name.
             */
            fun categoryName(categoryName: String?) =
                categoryName(JsonField.ofNullable(categoryName))

            /**
             * Sets [Builder.categoryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categoryName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categoryName(categoryName: JsonField<String>) = apply {
                this.categoryName = categoryName
            }

            /**
             * Currency code. Default is the source account's currency, or the user's financial
             * administration's primary currency. Can be used instead of currency_id.
             */
            fun currencyCode(currencyCode: String?) =
                currencyCode(JsonField.ofNullable(currencyCode))

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

            /**
             * Currency ID. Default is the source account's currency, or the user's financial
             * administration's primary currency. Can be used instead of currency_code.
             */
            fun currencyId(currencyId: String?) = currencyId(JsonField.ofNullable(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** Date of the transaction */
            fun date(date: OffsetDateTime) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            /** Description of the transaction. */
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

            fun destinationIban(destinationIban: String?) =
                destinationIban(JsonField.ofNullable(destinationIban))

            /**
             * Sets [Builder.destinationIban] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationIban] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationIban(destinationIban: JsonField<String>) = apply {
                this.destinationIban = destinationIban
            }

            /**
             * ID of the destination account. For a deposit or a transfer, this must always be an
             * asset account. For withdrawals this must be an expense account.
             */
            fun destinationId(destinationId: String?) =
                destinationId(JsonField.ofNullable(destinationId))

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
             * You should usually call [Builder.destinationName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationName(destinationName: JsonField<String>) = apply {
                this.destinationName = destinationName
            }

            fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

            /**
             * Sets [Builder.dueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

            /** Reference to external ID in other systems. */
            fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** External, custom URL for this transaction. */
            fun externalUrl(externalUrl: String?) = externalUrl(JsonField.ofNullable(externalUrl))

            /**
             * Sets [Builder.externalUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalUrl(externalUrl: JsonField<String>) = apply {
                this.externalUrl = externalUrl
            }

            /** The amount in a foreign currency. */
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

            /**
             * Currency code of the foreign currency. Default is NULL. Can be used instead of the
             * foreign_currency_id, but this or the ID is required when submitting a foreign amount.
             */
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

            /**
             * Currency ID of the foreign currency. Default is null. Is required when you submit a
             * foreign amount.
             */
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

            fun interestDate(interestDate: OffsetDateTime?) =
                interestDate(JsonField.ofNullable(interestDate))

            /**
             * Sets [Builder.interestDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interestDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.internalReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
                this.invoiceDate = invoiceDate
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
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            fun paymentDate(paymentDate: OffsetDateTime?) =
                paymentDate(JsonField.ofNullable(paymentDate))

            /**
             * Sets [Builder.paymentDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentDate(paymentDate: JsonField<OffsetDateTime>) = apply {
                this.paymentDate = paymentDate
            }

            fun processDate(processDate: OffsetDateTime?) =
                processDate(JsonField.ofNullable(processDate))

            /**
             * Sets [Builder.processDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun processDate(processDate: JsonField<OffsetDateTime>) = apply {
                this.processDate = processDate
            }

            /**
             * If the transaction has been reconciled already. When you set this, the amount can no
             * longer be edited by the user.
             */
            fun reconciled(reconciled: Boolean) = reconciled(JsonField.of(reconciled))

            /**
             * Sets [Builder.reconciled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reconciled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reconciled(reconciled: JsonField<Boolean>) = apply { this.reconciled = reconciled }

            /** SEPA Batch ID */
            fun sepaBatchId(sepaBatchId: String?) = sepaBatchId(JsonField.ofNullable(sepaBatchId))

            /**
             * Sets [Builder.sepaBatchId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaBatchId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaBatchId(sepaBatchId: JsonField<String>) = apply {
                this.sepaBatchId = sepaBatchId
            }

            /** SEPA Clearing Code */
            fun sepaCc(sepaCc: String?) = sepaCc(JsonField.ofNullable(sepaCc))

            /**
             * Sets [Builder.sepaCc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaCc] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaCc(sepaCc: JsonField<String>) = apply { this.sepaCc = sepaCc }

            /** SEPA Creditor Identifier */
            fun sepaCi(sepaCi: String?) = sepaCi(JsonField.ofNullable(sepaCi))

            /**
             * Sets [Builder.sepaCi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaCi] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaCi(sepaCi: JsonField<String>) = apply { this.sepaCi = sepaCi }

            /** SEPA Country */
            fun sepaCountry(sepaCountry: String?) = sepaCountry(JsonField.ofNullable(sepaCountry))

            /**
             * Sets [Builder.sepaCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaCountry(sepaCountry: JsonField<String>) = apply {
                this.sepaCountry = sepaCountry
            }

            /** SEPA end-to-end Identifier */
            fun sepaCtId(sepaCtId: String?) = sepaCtId(JsonField.ofNullable(sepaCtId))

            /**
             * Sets [Builder.sepaCtId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaCtId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaCtId(sepaCtId: JsonField<String>) = apply { this.sepaCtId = sepaCtId }

            /** SEPA Opposing Account Identifier */
            fun sepaCtOp(sepaCtOp: String?) = sepaCtOp(JsonField.ofNullable(sepaCtOp))

            /**
             * Sets [Builder.sepaCtOp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaCtOp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaCtOp(sepaCtOp: JsonField<String>) = apply { this.sepaCtOp = sepaCtOp }

            /** SEPA mandate identifier */
            fun sepaDb(sepaDb: String?) = sepaDb(JsonField.ofNullable(sepaDb))

            /**
             * Sets [Builder.sepaDb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaDb] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaDb(sepaDb: JsonField<String>) = apply { this.sepaDb = sepaDb }

            /** SEPA External Purpose indicator */
            fun sepaEp(sepaEp: String?) = sepaEp(JsonField.ofNullable(sepaEp))

            /**
             * Sets [Builder.sepaEp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sepaEp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sepaEp(sepaEp: JsonField<String>) = apply { this.sepaEp = sepaEp }

            fun sourceIban(sourceIban: String?) = sourceIban(JsonField.ofNullable(sourceIban))

            /**
             * Sets [Builder.sourceIban] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceIban] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceIban(sourceIban: JsonField<String>) = apply { this.sourceIban = sourceIban }

            /**
             * ID of the source account. For a withdrawal or a transfer, this must always be an
             * asset account. For deposits, this must be a revenue account.
             */
            fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /**
             * Name of the source account. For a withdrawal or a transfer, this must always be an
             * asset account. For deposits, this must be a revenue account. Can be used instead of
             * the source_id. If the transaction is a deposit, the source_name can be filled in
             * freely: the account will be created based on the name.
             */
            fun sourceName(sourceName: String?) = sourceName(JsonField.ofNullable(sourceName))

            /**
             * Sets [Builder.sourceName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceName(sourceName: JsonField<String>) = apply { this.sourceName = sourceName }

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

            /** Transaction journal ID of current transaction (split). */
            fun transactionJournalId(transactionJournalId: String) =
                transactionJournalId(JsonField.of(transactionJournalId))

            /**
             * Sets [Builder.transactionJournalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionJournalId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transactionJournalId(transactionJournalId: JsonField<String>) = apply {
                this.transactionJournalId = transactionJournalId
            }

            fun type(type: TransactionTypeProperty) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [TransactionTypeProperty]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun type(type: JsonField<TransactionTypeProperty>) = apply { this.type = type }

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
             */
            fun build(): Transaction =
                Transaction(
                    amount,
                    billId,
                    billName,
                    bookDate,
                    budgetId,
                    categoryId,
                    categoryName,
                    currencyCode,
                    currencyId,
                    date,
                    description,
                    destinationIban,
                    destinationId,
                    destinationName,
                    dueDate,
                    externalId,
                    externalUrl,
                    foreignAmount,
                    foreignCurrencyCode,
                    foreignCurrencyId,
                    interestDate,
                    internalReference,
                    invoiceDate,
                    notes,
                    order,
                    paymentDate,
                    processDate,
                    reconciled,
                    sepaBatchId,
                    sepaCc,
                    sepaCi,
                    sepaCountry,
                    sepaCtId,
                    sepaCtOp,
                    sepaDb,
                    sepaEp,
                    sourceIban,
                    sourceId,
                    sourceName,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    transactionJournalId,
                    type,
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
        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            amount()
            billId()
            billName()
            bookDate()
            budgetId()
            categoryId()
            categoryName()
            currencyCode()
            currencyId()
            date()
            description()
            destinationIban()
            destinationId()
            destinationName()
            dueDate()
            externalId()
            externalUrl()
            foreignAmount()
            foreignCurrencyCode()
            foreignCurrencyId()
            interestDate()
            internalReference()
            invoiceDate()
            notes()
            order()
            paymentDate()
            processDate()
            reconciled()
            sepaBatchId()
            sepaCc()
            sepaCi()
            sepaCountry()
            sepaCtId()
            sepaCtOp()
            sepaDb()
            sepaEp()
            sourceIban()
            sourceId()
            sourceName()
            tags()
            transactionJournalId()
            type()?.validate()
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
                (if (billId.asKnown() == null) 0 else 1) +
                (if (billName.asKnown() == null) 0 else 1) +
                (if (bookDate.asKnown() == null) 0 else 1) +
                (if (budgetId.asKnown() == null) 0 else 1) +
                (if (categoryId.asKnown() == null) 0 else 1) +
                (if (categoryName.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (date.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (destinationIban.asKnown() == null) 0 else 1) +
                (if (destinationId.asKnown() == null) 0 else 1) +
                (if (destinationName.asKnown() == null) 0 else 1) +
                (if (dueDate.asKnown() == null) 0 else 1) +
                (if (externalId.asKnown() == null) 0 else 1) +
                (if (externalUrl.asKnown() == null) 0 else 1) +
                (if (foreignAmount.asKnown() == null) 0 else 1) +
                (if (foreignCurrencyCode.asKnown() == null) 0 else 1) +
                (if (foreignCurrencyId.asKnown() == null) 0 else 1) +
                (if (interestDate.asKnown() == null) 0 else 1) +
                (if (internalReference.asKnown() == null) 0 else 1) +
                (if (invoiceDate.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (paymentDate.asKnown() == null) 0 else 1) +
                (if (processDate.asKnown() == null) 0 else 1) +
                (if (reconciled.asKnown() == null) 0 else 1) +
                (if (sepaBatchId.asKnown() == null) 0 else 1) +
                (if (sepaCc.asKnown() == null) 0 else 1) +
                (if (sepaCi.asKnown() == null) 0 else 1) +
                (if (sepaCountry.asKnown() == null) 0 else 1) +
                (if (sepaCtId.asKnown() == null) 0 else 1) +
                (if (sepaCtOp.asKnown() == null) 0 else 1) +
                (if (sepaDb.asKnown() == null) 0 else 1) +
                (if (sepaEp.asKnown() == null) 0 else 1) +
                (if (sourceIban.asKnown() == null) 0 else 1) +
                (if (sourceId.asKnown() == null) 0 else 1) +
                (if (sourceName.asKnown() == null) 0 else 1) +
                (tags.asKnown()?.size ?: 0) +
                (if (transactionJournalId.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transaction &&
                amount == other.amount &&
                billId == other.billId &&
                billName == other.billName &&
                bookDate == other.bookDate &&
                budgetId == other.budgetId &&
                categoryId == other.categoryId &&
                categoryName == other.categoryName &&
                currencyCode == other.currencyCode &&
                currencyId == other.currencyId &&
                date == other.date &&
                description == other.description &&
                destinationIban == other.destinationIban &&
                destinationId == other.destinationId &&
                destinationName == other.destinationName &&
                dueDate == other.dueDate &&
                externalId == other.externalId &&
                externalUrl == other.externalUrl &&
                foreignAmount == other.foreignAmount &&
                foreignCurrencyCode == other.foreignCurrencyCode &&
                foreignCurrencyId == other.foreignCurrencyId &&
                interestDate == other.interestDate &&
                internalReference == other.internalReference &&
                invoiceDate == other.invoiceDate &&
                notes == other.notes &&
                order == other.order &&
                paymentDate == other.paymentDate &&
                processDate == other.processDate &&
                reconciled == other.reconciled &&
                sepaBatchId == other.sepaBatchId &&
                sepaCc == other.sepaCc &&
                sepaCi == other.sepaCi &&
                sepaCountry == other.sepaCountry &&
                sepaCtId == other.sepaCtId &&
                sepaCtOp == other.sepaCtOp &&
                sepaDb == other.sepaDb &&
                sepaEp == other.sepaEp &&
                sourceIban == other.sourceIban &&
                sourceId == other.sourceId &&
                sourceName == other.sourceName &&
                tags == other.tags &&
                transactionJournalId == other.transactionJournalId &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                billId,
                billName,
                bookDate,
                budgetId,
                categoryId,
                categoryName,
                currencyCode,
                currencyId,
                date,
                description,
                destinationIban,
                destinationId,
                destinationName,
                dueDate,
                externalId,
                externalUrl,
                foreignAmount,
                foreignCurrencyCode,
                foreignCurrencyId,
                interestDate,
                internalReference,
                invoiceDate,
                notes,
                order,
                paymentDate,
                processDate,
                reconciled,
                sepaBatchId,
                sepaCc,
                sepaCi,
                sepaCountry,
                sepaCtId,
                sepaCtOp,
                sepaDb,
                sepaEp,
                sourceIban,
                sourceId,
                sourceName,
                tags,
                transactionJournalId,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transaction{amount=$amount, billId=$billId, billName=$billName, bookDate=$bookDate, budgetId=$budgetId, categoryId=$categoryId, categoryName=$categoryName, currencyCode=$currencyCode, currencyId=$currencyId, date=$date, description=$description, destinationIban=$destinationIban, destinationId=$destinationId, destinationName=$destinationName, dueDate=$dueDate, externalId=$externalId, externalUrl=$externalUrl, foreignAmount=$foreignAmount, foreignCurrencyCode=$foreignCurrencyCode, foreignCurrencyId=$foreignCurrencyId, interestDate=$interestDate, internalReference=$internalReference, invoiceDate=$invoiceDate, notes=$notes, order=$order, paymentDate=$paymentDate, processDate=$processDate, reconciled=$reconciled, sepaBatchId=$sepaBatchId, sepaCc=$sepaCc, sepaCi=$sepaCi, sepaCountry=$sepaCountry, sepaCtId=$sepaCtId, sepaCtOp=$sepaCtOp, sepaDb=$sepaDb, sepaEp=$sepaEp, sourceIban=$sourceIban, sourceId=$sourceId, sourceName=$sourceName, tags=$tags, transactionJournalId=$transactionJournalId, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionUpdateParams &&
            id == other.id &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionUpdateParams{id=$id, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
