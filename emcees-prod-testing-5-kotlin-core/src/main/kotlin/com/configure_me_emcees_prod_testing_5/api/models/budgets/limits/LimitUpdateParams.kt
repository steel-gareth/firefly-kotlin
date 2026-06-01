// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets.limits

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Update existing budget limit. */
class LimitUpdateParams
private constructor(
    private val id: String,
    private val limitId: String?,
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun limitId(): String? = limitId

    fun xTraceId(): String? = xTraceId

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun amount(): String? = body.amount()

    /**
     * The currency code of the currency associated with this object.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currencyCode(): String? = body.currencyCode()

    /**
     * The currency ID of the currency associated with this object.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currencyId(): String? = body.currencyId()

    /**
     * The currency name of the currency associated with this object.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun currencyName(): String? = body.currencyName()

    /**
     * End date of the budget limit.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun end(): OffsetDateTime? = body.end()

    /**
     * Whether or not to fire the webhooks that are related to this event.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fireWebhooks(): Boolean? = body.fireWebhooks()

    /**
     * Some notes for this specific budget limit.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): String? = body.notes()

    /**
     * Start date of the budget limit.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun start(): OffsetDateTime? = body.start()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<String> = body._amount()

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyCode(): JsonField<String> = body._currencyCode()

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyId(): JsonField<String> = body._currencyId()

    /**
     * Returns the raw JSON value of [currencyName].
     *
     * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyName(): JsonField<String> = body._currencyName()

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _end(): JsonField<OffsetDateTime> = body._end()

    /**
     * Returns the raw JSON value of [fireWebhooks].
     *
     * Unlike [fireWebhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fireWebhooks(): JsonField<Boolean> = body._fireWebhooks()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _start(): JsonField<OffsetDateTime> = body._start()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LimitUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LimitUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var limitId: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(limitUpdateParams: LimitUpdateParams) = apply {
            id = limitUpdateParams.id
            limitId = limitUpdateParams.limitId
            xTraceId = limitUpdateParams.xTraceId
            body = limitUpdateParams.body.toBuilder()
            additionalHeaders = limitUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = limitUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun limitId(limitId: String?) = apply { this.limitId = limitId }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [currencyCode]
         * - [currencyId]
         * - [currencyName]
         * - [end]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun amount(amount: String) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { body.amount(amount) }

        /** The currency code of the currency associated with this object. */
        fun currencyCode(currencyCode: String) = apply { body.currencyCode(currencyCode) }

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyCode(currencyCode: JsonField<String>) = apply {
            body.currencyCode(currencyCode)
        }

        /** The currency ID of the currency associated with this object. */
        fun currencyId(currencyId: String) = apply { body.currencyId(currencyId) }

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { body.currencyId(currencyId) }

        /** The currency name of the currency associated with this object. */
        fun currencyName(currencyName: String) = apply { body.currencyName(currencyName) }

        /**
         * Sets [Builder.currencyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyName(currencyName: JsonField<String>) = apply {
            body.currencyName(currencyName)
        }

        /** End date of the budget limit. */
        fun end(end: OffsetDateTime) = apply { body.end(end) }

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun end(end: JsonField<OffsetDateTime>) = apply { body.end(end) }

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

        /** Some notes for this specific budget limit. */
        fun notes(notes: String?) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        /** Start date of the budget limit. */
        fun start(start: OffsetDateTime) = apply { body.start(start) }

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { body.start(start) }

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
         * Returns an immutable instance of [LimitUpdateParams].
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
        fun build(): LimitUpdateParams =
            LimitUpdateParams(
                checkRequired("id", id),
                limitId,
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> limitId ?: ""
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
        private val amount: JsonField<String>,
        private val currencyCode: JsonField<String>,
        private val currencyId: JsonField<String>,
        private val currencyName: JsonField<String>,
        private val end: JsonField<OffsetDateTime>,
        private val fireWebhooks: JsonField<Boolean>,
        private val notes: JsonField<String>,
        private val start: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_code")
            @ExcludeMissing
            currencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_id")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_name")
            @ExcludeMissing
            currencyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("fire_webhooks")
            @ExcludeMissing
            fireWebhooks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start")
            @ExcludeMissing
            start: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            amount,
            currencyCode,
            currencyId,
            currencyName,
            end,
            fireWebhooks,
            notes,
            start,
            mutableMapOf(),
        )

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String? = amount.getNullable("amount")

        /**
         * The currency code of the currency associated with this object.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * The currency ID of the currency associated with this object.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * The currency name of the currency associated with this object.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currencyName(): String? = currencyName.getNullable("currency_name")

        /**
         * End date of the budget limit.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun end(): OffsetDateTime? = end.getNullable("end")

        /**
         * Whether or not to fire the webhooks that are related to this event.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fireWebhooks(): Boolean? = fireWebhooks.getNullable("fire_webhooks")

        /**
         * Some notes for this specific budget limit.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * Start date of the budget limit.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun start(): OffsetDateTime? = start.getNullable("start")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

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
         * Returns the raw JSON value of [currencyName].
         *
         * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_name")
        @ExcludeMissing
        fun _currencyName(): JsonField<String> = currencyName

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

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
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

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

            private var amount: JsonField<String> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var currencyName: JsonField<String> = JsonMissing.of()
            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fireWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amount = body.amount
                currencyCode = body.currencyCode
                currencyId = body.currencyId
                currencyName = body.currencyName
                end = body.end
                fireWebhooks = body.fireWebhooks
                notes = body.notes
                start = body.start
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The currency code of the currency associated with this object. */
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

            /** The currency ID of the currency associated with this object. */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** The currency name of the currency associated with this object. */
            fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

            /**
             * Sets [Builder.currencyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyName(currencyName: JsonField<String>) = apply {
                this.currencyName = currencyName
            }

            /** End date of the budget limit. */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

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

            /** Some notes for this specific budget limit. */
            fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /** Start date of the budget limit. */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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
                    amount,
                    currencyCode,
                    currencyId,
                    currencyName,
                    end,
                    fireWebhooks,
                    notes,
                    start,
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

            amount()
            currencyCode()
            currencyId()
            currencyName()
            end()
            fireWebhooks()
            notes()
            start()
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
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (currencyName.asKnown() == null) 0 else 1) +
                (if (end.asKnown() == null) 0 else 1) +
                (if (fireWebhooks.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (start.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                currencyCode == other.currencyCode &&
                currencyId == other.currencyId &&
                currencyName == other.currencyName &&
                end == other.end &&
                fireWebhooks == other.fireWebhooks &&
                notes == other.notes &&
                start == other.start &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                currencyCode,
                currencyId,
                currencyName,
                end,
                fireWebhooks,
                notes,
                start,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, currencyCode=$currencyCode, currencyId=$currencyId, currencyName=$currencyName, end=$end, fireWebhooks=$fireWebhooks, notes=$notes, start=$start, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LimitUpdateParams &&
            id == other.id &&
            limitId == other.limitId &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, limitId, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LimitUpdateParams{id=$id, limitId=$limitId, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
