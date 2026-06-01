// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.piggybanks

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

/** Update existing piggy bank. */
class PiggyBankUpdateParams
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
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accounts(): List<Account>? = body.accounts()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): String? = body.notes()

    /**
     * The group ID of the group this object is part of. NULL if no group.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectGroupId(): String? = body.objectGroupId()

    /**
     * The name of the group. NULL if no group.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectGroupTitle(): String? = body.objectGroupTitle()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Int? = body.order()

    /**
     * The date you started with this piggy bank.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): LocalDate? = body.startDate()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetAmount(): String? = body.targetAmount()

    /**
     * The date you intend to finish saving money.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetDate(): LocalDate? = body.targetDate()

    /**
     * Returns the raw JSON value of [accounts].
     *
     * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accounts(): JsonField<List<Account>> = body._accounts()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

    /**
     * Returns the raw JSON value of [objectGroupId].
     *
     * Unlike [objectGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectGroupId(): JsonField<String> = body._objectGroupId()

    /**
     * Returns the raw JSON value of [objectGroupTitle].
     *
     * Unlike [objectGroupTitle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _objectGroupTitle(): JsonField<String> = body._objectGroupTitle()

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _order(): JsonField<Int> = body._order()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<LocalDate> = body._startDate()

    /**
     * Returns the raw JSON value of [targetAmount].
     *
     * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetAmount(): JsonField<String> = body._targetAmount()

    /**
     * Returns the raw JSON value of [targetDate].
     *
     * Unlike [targetDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetDate(): JsonField<LocalDate> = body._targetDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PiggyBankUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PiggyBankUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PiggyBankUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(piggyBankUpdateParams: PiggyBankUpdateParams) = apply {
            id = piggyBankUpdateParams.id
            xTraceId = piggyBankUpdateParams.xTraceId
            body = piggyBankUpdateParams.body.toBuilder()
            additionalHeaders = piggyBankUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = piggyBankUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accounts]
         * - [name]
         * - [notes]
         * - [objectGroupId]
         * - [objectGroupTitle]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun accounts(accounts: List<Account>) = apply { body.accounts(accounts) }

        /**
         * Sets [Builder.accounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounts(accounts: JsonField<List<Account>>) = apply { body.accounts(accounts) }

        /**
         * Adds a single [Account] to [accounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccount(account: Account) = apply { body.addAccount(account) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun notes(notes: String?) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        /** The group ID of the group this object is part of. NULL if no group. */
        fun objectGroupId(objectGroupId: String?) = apply { body.objectGroupId(objectGroupId) }

        /**
         * Sets [Builder.objectGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectGroupId(objectGroupId: JsonField<String>) = apply {
            body.objectGroupId(objectGroupId)
        }

        /** The name of the group. NULL if no group. */
        fun objectGroupTitle(objectGroupTitle: String?) = apply {
            body.objectGroupTitle(objectGroupTitle)
        }

        /**
         * Sets [Builder.objectGroupTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectGroupTitle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectGroupTitle(objectGroupTitle: JsonField<String>) = apply {
            body.objectGroupTitle(objectGroupTitle)
        }

        fun order(order: Int) = apply { body.order(order) }

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Int>) = apply { body.order(order) }

        /** The date you started with this piggy bank. */
        fun startDate(startDate: LocalDate) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { body.startDate(startDate) }

        fun targetAmount(targetAmount: String?) = apply { body.targetAmount(targetAmount) }

        /**
         * Sets [Builder.targetAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetAmount(targetAmount: JsonField<String>) = apply {
            body.targetAmount(targetAmount)
        }

        /** The date you intend to finish saving money. */
        fun targetDate(targetDate: LocalDate?) = apply { body.targetDate(targetDate) }

        /**
         * Sets [Builder.targetDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetDate(targetDate: JsonField<LocalDate>) = apply { body.targetDate(targetDate) }

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
         * Returns an immutable instance of [PiggyBankUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PiggyBankUpdateParams =
            PiggyBankUpdateParams(
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
        private val accounts: JsonField<List<Account>>,
        private val name: JsonField<String>,
        private val notes: JsonField<String>,
        private val objectGroupId: JsonField<String>,
        private val objectGroupTitle: JsonField<String>,
        private val order: JsonField<Int>,
        private val startDate: JsonField<LocalDate>,
        private val targetAmount: JsonField<String>,
        private val targetDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accounts")
            @ExcludeMissing
            accounts: JsonField<List<Account>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_group_id")
            @ExcludeMissing
            objectGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_group_title")
            @ExcludeMissing
            objectGroupTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("target_amount")
            @ExcludeMissing
            targetAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_date")
            @ExcludeMissing
            targetDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            accounts,
            name,
            notes,
            objectGroupId,
            objectGroupTitle,
            order,
            startDate,
            targetAmount,
            targetDate,
            mutableMapOf(),
        )

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accounts(): List<Account>? = accounts.getNullable("accounts")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * The group ID of the group this object is part of. NULL if no group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectGroupId(): String? = objectGroupId.getNullable("object_group_id")

        /**
         * The name of the group. NULL if no group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectGroupTitle(): String? = objectGroupTitle.getNullable("object_group_title")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * The date you started with this piggy bank.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): LocalDate? = startDate.getNullable("start_date")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetAmount(): String? = targetAmount.getNullable("target_amount")

        /**
         * The date you intend to finish saving money.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetDate(): LocalDate? = targetDate.getNullable("target_date")

        /**
         * Returns the raw JSON value of [accounts].
         *
         * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accounts")
        @ExcludeMissing
        fun _accounts(): JsonField<List<Account>> = accounts

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [objectGroupId].
         *
         * Unlike [objectGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("object_group_id")
        @ExcludeMissing
        fun _objectGroupId(): JsonField<String> = objectGroupId

        /**
         * Returns the raw JSON value of [objectGroupTitle].
         *
         * Unlike [objectGroupTitle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("object_group_title")
        @ExcludeMissing
        fun _objectGroupTitle(): JsonField<String> = objectGroupTitle

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        /**
         * Returns the raw JSON value of [targetAmount].
         *
         * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<String> = targetAmount

        /**
         * Returns the raw JSON value of [targetDate].
         *
         * Unlike [targetDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_date")
        @ExcludeMissing
        fun _targetDate(): JsonField<LocalDate> = targetDate

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

            private var accounts: JsonField<MutableList<Account>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectGroupId: JsonField<String> = JsonMissing.of()
            private var objectGroupTitle: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var startDate: JsonField<LocalDate> = JsonMissing.of()
            private var targetAmount: JsonField<String> = JsonMissing.of()
            private var targetDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accounts = body.accounts.map { it.toMutableList() }
                name = body.name
                notes = body.notes
                objectGroupId = body.objectGroupId
                objectGroupTitle = body.objectGroupTitle
                order = body.order
                startDate = body.startDate
                targetAmount = body.targetAmount
                targetDate = body.targetDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

            /**
             * Sets [Builder.accounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accounts(accounts: JsonField<List<Account>>) = apply {
                this.accounts = accounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Account] to [accounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccount(account: Account) = apply {
                accounts =
                    (accounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accounts", it).add(account)
                    }
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

            fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** The group ID of the group this object is part of. NULL if no group. */
            fun objectGroupId(objectGroupId: String?) =
                objectGroupId(JsonField.ofNullable(objectGroupId))

            /**
             * Sets [Builder.objectGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectGroupId(objectGroupId: JsonField<String>) = apply {
                this.objectGroupId = objectGroupId
            }

            /** The name of the group. NULL if no group. */
            fun objectGroupTitle(objectGroupTitle: String?) =
                objectGroupTitle(JsonField.ofNullable(objectGroupTitle))

            /**
             * Sets [Builder.objectGroupTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectGroupTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectGroupTitle(objectGroupTitle: JsonField<String>) = apply {
                this.objectGroupTitle = objectGroupTitle
            }

            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /** The date you started with this piggy bank. */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            fun targetAmount(targetAmount: String?) =
                targetAmount(JsonField.ofNullable(targetAmount))

            /**
             * Sets [Builder.targetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetAmount(targetAmount: JsonField<String>) = apply {
                this.targetAmount = targetAmount
            }

            /** The date you intend to finish saving money. */
            fun targetDate(targetDate: LocalDate?) = targetDate(JsonField.ofNullable(targetDate))

            /**
             * Sets [Builder.targetDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetDate(targetDate: JsonField<LocalDate>) = apply {
                this.targetDate = targetDate
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
                    (accounts ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    notes,
                    objectGroupId,
                    objectGroupTitle,
                    order,
                    startDate,
                    targetAmount,
                    targetDate,
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

            accounts()?.forEach { it.validate() }
            name()
            notes()
            objectGroupId()
            objectGroupTitle()
            order()
            startDate()
            targetAmount()
            targetDate()
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
            (accounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectGroupId.asKnown() == null) 0 else 1) +
                (if (objectGroupTitle.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1) +
                (if (targetAmount.asKnown() == null) 0 else 1) +
                (if (targetDate.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accounts == other.accounts &&
                name == other.name &&
                notes == other.notes &&
                objectGroupId == other.objectGroupId &&
                objectGroupTitle == other.objectGroupTitle &&
                order == other.order &&
                startDate == other.startDate &&
                targetAmount == other.targetAmount &&
                targetDate == other.targetDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accounts,
                name,
                notes,
                objectGroupId,
                objectGroupTitle,
                order,
                startDate,
                targetAmount,
                targetDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accounts=$accounts, name=$name, notes=$notes, objectGroupId=$objectGroupId, objectGroupTitle=$objectGroupTitle, order=$order, startDate=$startDate, targetAmount=$targetAmount, targetDate=$targetDate, additionalProperties=$additionalProperties}"
    }

    class Account
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonValue,
        private val accountId: JsonField<String>,
        private val currentAmount: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonValue = JsonMissing.of(),
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("current_amount")
            @ExcludeMissing
            currentAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, accountId, currentAmount, name, mutableMapOf())

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = account.id().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonValue = id

        /**
         * The ID of the account.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountId(): String? = accountId.getNullable("account_id")

        /**
         * The amount saved currently.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentAmount(): String? = currentAmount.getNullable("current_amount")

        /**
         * The name of the account.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [currentAmount].
         *
         * Unlike [currentAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_amount")
        @ExcludeMissing
        fun _currentAmount(): JsonField<String> = currentAmount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Account].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var id: JsonValue? = null
            private var accountId: JsonField<String> = JsonMissing.of()
            private var currentAmount: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                id = account.id
                accountId = account.accountId
                currentAmount = account.currentAmount
                name = account.name
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            fun id(id: JsonValue) = apply { this.id = id }

            /** The ID of the account. */
            fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The amount saved currently. */
            fun currentAmount(currentAmount: String?) =
                currentAmount(JsonField.ofNullable(currentAmount))

            /**
             * Sets [Builder.currentAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentAmount(currentAmount: JsonField<String>) = apply {
                this.currentAmount = currentAmount
            }

            /** The name of the account. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Account =
                Account(
                    checkRequired("id", id),
                    accountId,
                    currentAmount,
                    name,
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
        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            accountId()
            currentAmount()
            name()
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
            (if (accountId.asKnown() == null) 0 else 1) +
                (if (currentAmount.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Account &&
                id == other.id &&
                accountId == other.accountId &&
                currentAmount == other.currentAmount &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, accountId, currentAmount, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{id=$id, accountId=$accountId, currentAmount=$currentAmount, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PiggyBankUpdateParams &&
            id == other.id &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PiggyBankUpdateParams{id=$id, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
