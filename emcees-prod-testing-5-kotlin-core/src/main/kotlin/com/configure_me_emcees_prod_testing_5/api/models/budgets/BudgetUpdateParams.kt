// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.budgets

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
import java.util.Collections
import java.util.Objects

/** Update existing budget. This endpoint cannot be used to set budget amount limits. */
class BudgetUpdateParams
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
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun active(): Boolean? = body.active()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun autoBudgetAmount(): String? = body.autoBudgetAmount()

    /**
     * Use either currency_id or currency_code. Defaults to the user's financial administration's
     * currency.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun autoBudgetCurrencyCode(): String? = body.autoBudgetCurrencyCode()

    /**
     * Use either currency_id or currency_code. Defaults to the user's financial administration's
     * currency.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun autoBudgetCurrencyId(): String? = body.autoBudgetCurrencyId()

    /**
     * Period for the auto budget
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun autoBudgetPeriod(): AutoBudgetPeriod? = body.autoBudgetPeriod()

    /**
     * The type of auto-budget that Firefly III must create.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun autoBudgetType(): AutoBudgetType? = body.autoBudgetType()

    /**
     * Whether or not to fire the webhooks that are related to this event.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fireWebhooks(): Boolean? = body.fireWebhooks()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): String? = body.notes()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun order(): Int? = body.order()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [autoBudgetAmount].
     *
     * Unlike [autoBudgetAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoBudgetAmount(): JsonField<String> = body._autoBudgetAmount()

    /**
     * Returns the raw JSON value of [autoBudgetCurrencyCode].
     *
     * Unlike [autoBudgetCurrencyCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _autoBudgetCurrencyCode(): JsonField<String> = body._autoBudgetCurrencyCode()

    /**
     * Returns the raw JSON value of [autoBudgetCurrencyId].
     *
     * Unlike [autoBudgetCurrencyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoBudgetCurrencyId(): JsonField<String> = body._autoBudgetCurrencyId()

    /**
     * Returns the raw JSON value of [autoBudgetPeriod].
     *
     * Unlike [autoBudgetPeriod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoBudgetPeriod(): JsonField<AutoBudgetPeriod> = body._autoBudgetPeriod()

    /**
     * Returns the raw JSON value of [autoBudgetType].
     *
     * Unlike [autoBudgetType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoBudgetType(): JsonField<AutoBudgetType> = body._autoBudgetType()

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
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _order(): JsonField<Int> = body._order()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BudgetUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BudgetUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(budgetUpdateParams: BudgetUpdateParams) = apply {
            id = budgetUpdateParams.id
            xTraceId = budgetUpdateParams.xTraceId
            body = budgetUpdateParams.body.toBuilder()
            additionalHeaders = budgetUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = budgetUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [active]
         * - [autoBudgetAmount]
         * - [autoBudgetCurrencyCode]
         * - [autoBudgetCurrencyId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        fun autoBudgetAmount(autoBudgetAmount: String?) = apply {
            body.autoBudgetAmount(autoBudgetAmount)
        }

        /**
         * Sets [Builder.autoBudgetAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoBudgetAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoBudgetAmount(autoBudgetAmount: JsonField<String>) = apply {
            body.autoBudgetAmount(autoBudgetAmount)
        }

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         */
        fun autoBudgetCurrencyCode(autoBudgetCurrencyCode: String?) = apply {
            body.autoBudgetCurrencyCode(autoBudgetCurrencyCode)
        }

        /**
         * Sets [Builder.autoBudgetCurrencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoBudgetCurrencyCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoBudgetCurrencyCode(autoBudgetCurrencyCode: JsonField<String>) = apply {
            body.autoBudgetCurrencyCode(autoBudgetCurrencyCode)
        }

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         */
        fun autoBudgetCurrencyId(autoBudgetCurrencyId: String?) = apply {
            body.autoBudgetCurrencyId(autoBudgetCurrencyId)
        }

        /**
         * Sets [Builder.autoBudgetCurrencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoBudgetCurrencyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoBudgetCurrencyId(autoBudgetCurrencyId: JsonField<String>) = apply {
            body.autoBudgetCurrencyId(autoBudgetCurrencyId)
        }

        /** Period for the auto budget */
        fun autoBudgetPeriod(autoBudgetPeriod: AutoBudgetPeriod?) = apply {
            body.autoBudgetPeriod(autoBudgetPeriod)
        }

        /**
         * Sets [Builder.autoBudgetPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoBudgetPeriod] with a well-typed [AutoBudgetPeriod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun autoBudgetPeriod(autoBudgetPeriod: JsonField<AutoBudgetPeriod>) = apply {
            body.autoBudgetPeriod(autoBudgetPeriod)
        }

        /** The type of auto-budget that Firefly III must create. */
        fun autoBudgetType(autoBudgetType: AutoBudgetType?) = apply {
            body.autoBudgetType(autoBudgetType)
        }

        /**
         * Sets [Builder.autoBudgetType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoBudgetType] with a well-typed [AutoBudgetType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoBudgetType(autoBudgetType: JsonField<AutoBudgetType>) = apply {
            body.autoBudgetType(autoBudgetType)
        }

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

        fun notes(notes: String?) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        fun order(order: Int) = apply { body.order(order) }

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Int>) = apply { body.order(order) }

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
         * Returns an immutable instance of [BudgetUpdateParams].
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
        fun build(): BudgetUpdateParams =
            BudgetUpdateParams(
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
        private val name: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val autoBudgetAmount: JsonField<String>,
        private val autoBudgetCurrencyCode: JsonField<String>,
        private val autoBudgetCurrencyId: JsonField<String>,
        private val autoBudgetPeriod: JsonField<AutoBudgetPeriod>,
        private val autoBudgetType: JsonField<AutoBudgetType>,
        private val fireWebhooks: JsonField<Boolean>,
        private val notes: JsonField<String>,
        private val order: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_budget_amount")
            @ExcludeMissing
            autoBudgetAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_budget_currency_code")
            @ExcludeMissing
            autoBudgetCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_budget_currency_id")
            @ExcludeMissing
            autoBudgetCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_budget_period")
            @ExcludeMissing
            autoBudgetPeriod: JsonField<AutoBudgetPeriod> = JsonMissing.of(),
            @JsonProperty("auto_budget_type")
            @ExcludeMissing
            autoBudgetType: JsonField<AutoBudgetType> = JsonMissing.of(),
            @JsonProperty("fire_webhooks")
            @ExcludeMissing
            fireWebhooks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
        ) : this(
            name,
            active,
            autoBudgetAmount,
            autoBudgetCurrencyCode,
            autoBudgetCurrencyId,
            autoBudgetPeriod,
            autoBudgetType,
            fireWebhooks,
            notes,
            order,
            mutableMapOf(),
        )

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetAmount(): String? = autoBudgetAmount.getNullable("auto_budget_amount")

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetCurrencyCode(): String? =
            autoBudgetCurrencyCode.getNullable("auto_budget_currency_code")

        /**
         * Use either currency_id or currency_code. Defaults to the user's financial
         * administration's currency.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetCurrencyId(): String? =
            autoBudgetCurrencyId.getNullable("auto_budget_currency_id")

        /**
         * Period for the auto budget
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetPeriod(): AutoBudgetPeriod? =
            autoBudgetPeriod.getNullable("auto_budget_period")

        /**
         * The type of auto-budget that Firefly III must create.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoBudgetType(): AutoBudgetType? = autoBudgetType.getNullable("auto_budget_type")

        /**
         * Whether or not to fire the webhooks that are related to this event.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fireWebhooks(): Boolean? = fireWebhooks.getNullable("fire_webhooks")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [autoBudgetAmount].
         *
         * Unlike [autoBudgetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_budget_amount")
        @ExcludeMissing
        fun _autoBudgetAmount(): JsonField<String> = autoBudgetAmount

        /**
         * Returns the raw JSON value of [autoBudgetCurrencyCode].
         *
         * Unlike [autoBudgetCurrencyCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_budget_currency_code")
        @ExcludeMissing
        fun _autoBudgetCurrencyCode(): JsonField<String> = autoBudgetCurrencyCode

        /**
         * Returns the raw JSON value of [autoBudgetCurrencyId].
         *
         * Unlike [autoBudgetCurrencyId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_budget_currency_id")
        @ExcludeMissing
        fun _autoBudgetCurrencyId(): JsonField<String> = autoBudgetCurrencyId

        /**
         * Returns the raw JSON value of [autoBudgetPeriod].
         *
         * Unlike [autoBudgetPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_budget_period")
        @ExcludeMissing
        fun _autoBudgetPeriod(): JsonField<AutoBudgetPeriod> = autoBudgetPeriod

        /**
         * Returns the raw JSON value of [autoBudgetType].
         *
         * Unlike [autoBudgetType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_budget_type")
        @ExcludeMissing
        fun _autoBudgetType(): JsonField<AutoBudgetType> = autoBudgetType

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
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

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
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var autoBudgetAmount: JsonField<String> = JsonMissing.of()
            private var autoBudgetCurrencyCode: JsonField<String> = JsonMissing.of()
            private var autoBudgetCurrencyId: JsonField<String> = JsonMissing.of()
            private var autoBudgetPeriod: JsonField<AutoBudgetPeriod> = JsonMissing.of()
            private var autoBudgetType: JsonField<AutoBudgetType> = JsonMissing.of()
            private var fireWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                name = body.name
                active = body.active
                autoBudgetAmount = body.autoBudgetAmount
                autoBudgetCurrencyCode = body.autoBudgetCurrencyCode
                autoBudgetCurrencyId = body.autoBudgetCurrencyId
                autoBudgetPeriod = body.autoBudgetPeriod
                autoBudgetType = body.autoBudgetType
                fireWebhooks = body.fireWebhooks
                notes = body.notes
                order = body.order
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun autoBudgetAmount(autoBudgetAmount: String?) =
                autoBudgetAmount(JsonField.ofNullable(autoBudgetAmount))

            /**
             * Sets [Builder.autoBudgetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoBudgetAmount(autoBudgetAmount: JsonField<String>) = apply {
                this.autoBudgetAmount = autoBudgetAmount
            }

            /**
             * Use either currency_id or currency_code. Defaults to the user's financial
             * administration's currency.
             */
            fun autoBudgetCurrencyCode(autoBudgetCurrencyCode: String?) =
                autoBudgetCurrencyCode(JsonField.ofNullable(autoBudgetCurrencyCode))

            /**
             * Sets [Builder.autoBudgetCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoBudgetCurrencyCode(autoBudgetCurrencyCode: JsonField<String>) = apply {
                this.autoBudgetCurrencyCode = autoBudgetCurrencyCode
            }

            /**
             * Use either currency_id or currency_code. Defaults to the user's financial
             * administration's currency.
             */
            fun autoBudgetCurrencyId(autoBudgetCurrencyId: String?) =
                autoBudgetCurrencyId(JsonField.ofNullable(autoBudgetCurrencyId))

            /**
             * Sets [Builder.autoBudgetCurrencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetCurrencyId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoBudgetCurrencyId(autoBudgetCurrencyId: JsonField<String>) = apply {
                this.autoBudgetCurrencyId = autoBudgetCurrencyId
            }

            /** Period for the auto budget */
            fun autoBudgetPeriod(autoBudgetPeriod: AutoBudgetPeriod?) =
                autoBudgetPeriod(JsonField.ofNullable(autoBudgetPeriod))

            /**
             * Sets [Builder.autoBudgetPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetPeriod] with a well-typed
             * [AutoBudgetPeriod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun autoBudgetPeriod(autoBudgetPeriod: JsonField<AutoBudgetPeriod>) = apply {
                this.autoBudgetPeriod = autoBudgetPeriod
            }

            /** The type of auto-budget that Firefly III must create. */
            fun autoBudgetType(autoBudgetType: AutoBudgetType?) =
                autoBudgetType(JsonField.ofNullable(autoBudgetType))

            /**
             * Sets [Builder.autoBudgetType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoBudgetType] with a well-typed [AutoBudgetType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoBudgetType(autoBudgetType: JsonField<AutoBudgetType>) = apply {
                this.autoBudgetType = autoBudgetType
            }

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

            fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    active,
                    autoBudgetAmount,
                    autoBudgetCurrencyCode,
                    autoBudgetCurrencyId,
                    autoBudgetPeriod,
                    autoBudgetType,
                    fireWebhooks,
                    notes,
                    order,
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

            name()
            active()
            autoBudgetAmount()
            autoBudgetCurrencyCode()
            autoBudgetCurrencyId()
            autoBudgetPeriod()?.validate()
            autoBudgetType()?.validate()
            fireWebhooks()
            notes()
            order()
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
            (if (name.asKnown() == null) 0 else 1) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (autoBudgetAmount.asKnown() == null) 0 else 1) +
                (if (autoBudgetCurrencyCode.asKnown() == null) 0 else 1) +
                (if (autoBudgetCurrencyId.asKnown() == null) 0 else 1) +
                (autoBudgetPeriod.asKnown()?.validity() ?: 0) +
                (autoBudgetType.asKnown()?.validity() ?: 0) +
                (if (fireWebhooks.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                active == other.active &&
                autoBudgetAmount == other.autoBudgetAmount &&
                autoBudgetCurrencyCode == other.autoBudgetCurrencyCode &&
                autoBudgetCurrencyId == other.autoBudgetCurrencyId &&
                autoBudgetPeriod == other.autoBudgetPeriod &&
                autoBudgetType == other.autoBudgetType &&
                fireWebhooks == other.fireWebhooks &&
                notes == other.notes &&
                order == other.order &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                active,
                autoBudgetAmount,
                autoBudgetCurrencyCode,
                autoBudgetCurrencyId,
                autoBudgetPeriod,
                autoBudgetType,
                fireWebhooks,
                notes,
                order,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, active=$active, autoBudgetAmount=$autoBudgetAmount, autoBudgetCurrencyCode=$autoBudgetCurrencyCode, autoBudgetCurrencyId=$autoBudgetCurrencyId, autoBudgetPeriod=$autoBudgetPeriod, autoBudgetType=$autoBudgetType, fireWebhooks=$fireWebhooks, notes=$notes, order=$order, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BudgetUpdateParams &&
            id == other.id &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BudgetUpdateParams{id=$id, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
