// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.bills

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.checkRequired
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.errors.FireflyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Creates a new bill. The data required can be submitted as a JSON body or as a list of parameters.
 */
class BillCreateParams
private constructor(
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xTraceId(): String? = xTraceId

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountMax(): String = body.amountMax()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountMin(): String = body.amountMin()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): OffsetDateTime = body.date()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * How often the bill must be paid.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repeatFreq(): BillRepeatFrequency = body.repeatFreq()

    /**
     * If the bill is active.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Boolean? = body.active()

    /**
     * Use either currency_id or currency_code
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyCode(): String? = body.currencyCode()

    /**
     * Use either currency_id or currency_code
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): String? = body.currencyId()

    /**
     * The date after which this bill is no longer valid or applicable
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = body.endDate()

    /**
     * The date before which the bill must be renewed (or cancelled)
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extensionDate(): OffsetDateTime? = body.extensionDate()

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
     * How often the bill must be skipped. 1 means a bi-monthly bill.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skip(): Int? = body.skip()

    /**
     * Returns the raw JSON value of [amountMax].
     *
     * Unlike [amountMax], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountMax(): JsonField<String> = body._amountMax()

    /**
     * Returns the raw JSON value of [amountMin].
     *
     * Unlike [amountMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountMin(): JsonField<String> = body._amountMin()

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _date(): JsonField<OffsetDateTime> = body._date()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [repeatFreq].
     *
     * Unlike [repeatFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repeatFreq(): JsonField<BillRepeatFrequency> = body._repeatFreq()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [extensionDate].
     *
     * Unlike [extensionDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extensionDate(): JsonField<OffsetDateTime> = body._extensionDate()

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
     * Returns the raw JSON value of [skip].
     *
     * Unlike [skip], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _skip(): JsonField<Int> = body._skip()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .amountMax()
         * .amountMin()
         * .date()
         * .name()
         * .repeatFreq()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillCreateParams]. */
    class Builder internal constructor() {

        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(billCreateParams: BillCreateParams) = apply {
            xTraceId = billCreateParams.xTraceId
            body = billCreateParams.body.toBuilder()
            additionalHeaders = billCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = billCreateParams.additionalQueryParams.toBuilder()
        }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amountMax]
         * - [amountMin]
         * - [date]
         * - [name]
         * - [repeatFreq]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun amountMax(amountMax: String) = apply { body.amountMax(amountMax) }

        /**
         * Sets [Builder.amountMax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountMax] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountMax(amountMax: JsonField<String>) = apply { body.amountMax(amountMax) }

        fun amountMin(amountMin: String) = apply { body.amountMin(amountMin) }

        /**
         * Sets [Builder.amountMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountMin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountMin(amountMin: JsonField<String>) = apply { body.amountMin(amountMin) }

        fun date(date: OffsetDateTime) = apply { body.date(date) }

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun date(date: JsonField<OffsetDateTime>) = apply { body.date(date) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** How often the bill must be paid. */
        fun repeatFreq(repeatFreq: BillRepeatFrequency) = apply { body.repeatFreq(repeatFreq) }

        /**
         * Sets [Builder.repeatFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repeatFreq] with a well-typed [BillRepeatFrequency]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun repeatFreq(repeatFreq: JsonField<BillRepeatFrequency>) = apply {
            body.repeatFreq(repeatFreq)
        }

        /** If the bill is active. */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        /** Use either currency_id or currency_code */
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

        /** Use either currency_id or currency_code */
        fun currencyId(currencyId: String) = apply { body.currencyId(currencyId) }

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { body.currencyId(currencyId) }

        /** The date after which this bill is no longer valid or applicable */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** The date before which the bill must be renewed (or cancelled) */
        fun extensionDate(extensionDate: OffsetDateTime) = apply {
            body.extensionDate(extensionDate)
        }

        /**
         * Sets [Builder.extensionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensionDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extensionDate(extensionDate: JsonField<OffsetDateTime>) = apply {
            body.extensionDate(extensionDate)
        }

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

        /** How often the bill must be skipped. 1 means a bi-monthly bill. */
        fun skip(skip: Int) = apply { body.skip(skip) }

        /**
         * Sets [Builder.skip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skip] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skip(skip: JsonField<Int>) = apply { body.skip(skip) }

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
         * Returns an immutable instance of [BillCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amountMax()
         * .amountMin()
         * .date()
         * .name()
         * .repeatFreq()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillCreateParams =
            BillCreateParams(
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
        private val amountMax: JsonField<String>,
        private val amountMin: JsonField<String>,
        private val date: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val repeatFreq: JsonField<BillRepeatFrequency>,
        private val active: JsonField<Boolean>,
        private val currencyCode: JsonField<String>,
        private val currencyId: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val extensionDate: JsonField<OffsetDateTime>,
        private val notes: JsonField<String>,
        private val objectGroupId: JsonField<String>,
        private val objectGroupTitle: JsonField<String>,
        private val skip: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_max")
            @ExcludeMissing
            amountMax: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_min")
            @ExcludeMissing
            amountMin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date")
            @ExcludeMissing
            date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("repeat_freq")
            @ExcludeMissing
            repeatFreq: JsonField<BillRepeatFrequency> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("currency_code")
            @ExcludeMissing
            currencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_id")
            @ExcludeMissing
            currencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("extension_date")
            @ExcludeMissing
            extensionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_group_id")
            @ExcludeMissing
            objectGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_group_title")
            @ExcludeMissing
            objectGroupTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("skip") @ExcludeMissing skip: JsonField<Int> = JsonMissing.of(),
        ) : this(
            amountMax,
            amountMin,
            date,
            name,
            repeatFreq,
            active,
            currencyCode,
            currencyId,
            endDate,
            extensionDate,
            notes,
            objectGroupId,
            objectGroupTitle,
            skip,
            mutableMapOf(),
        )

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountMax(): String = amountMax.getRequired("amount_max")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amountMin(): String = amountMin.getRequired("amount_min")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): OffsetDateTime = date.getRequired("date")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * How often the bill must be paid.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repeatFreq(): BillRepeatFrequency = repeatFreq.getRequired("repeat_freq")

        /**
         * If the bill is active.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * Use either currency_id or currency_code
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyCode(): String? = currencyCode.getNullable("currency_code")

        /**
         * Use either currency_id or currency_code
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyId(): String? = currencyId.getNullable("currency_id")

        /**
         * The date after which this bill is no longer valid or applicable
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The date before which the bill must be renewed (or cancelled)
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extensionDate(): OffsetDateTime? = extensionDate.getNullable("extension_date")

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
         * How often the bill must be skipped. 1 means a bi-monthly bill.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skip(): Int? = skip.getNullable("skip")

        /**
         * Returns the raw JSON value of [amountMax].
         *
         * Unlike [amountMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_max") @ExcludeMissing fun _amountMax(): JsonField<String> = amountMax

        /**
         * Returns the raw JSON value of [amountMin].
         *
         * Unlike [amountMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount_min") @ExcludeMissing fun _amountMin(): JsonField<String> = amountMin

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [repeatFreq].
         *
         * Unlike [repeatFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repeat_freq")
        @ExcludeMissing
        fun _repeatFreq(): JsonField<BillRepeatFrequency> = repeatFreq

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

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
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [extensionDate].
         *
         * Unlike [extensionDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extension_date")
        @ExcludeMissing
        fun _extensionDate(): JsonField<OffsetDateTime> = extensionDate

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
         * Returns the raw JSON value of [skip].
         *
         * Unlike [skip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("skip") @ExcludeMissing fun _skip(): JsonField<Int> = skip

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
             * .amountMax()
             * .amountMin()
             * .date()
             * .name()
             * .repeatFreq()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amountMax: JsonField<String>? = null
            private var amountMin: JsonField<String>? = null
            private var date: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var repeatFreq: JsonField<BillRepeatFrequency>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var currencyCode: JsonField<String> = JsonMissing.of()
            private var currencyId: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var extensionDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var objectGroupId: JsonField<String> = JsonMissing.of()
            private var objectGroupTitle: JsonField<String> = JsonMissing.of()
            private var skip: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amountMax = body.amountMax
                amountMin = body.amountMin
                date = body.date
                name = body.name
                repeatFreq = body.repeatFreq
                active = body.active
                currencyCode = body.currencyCode
                currencyId = body.currencyId
                endDate = body.endDate
                extensionDate = body.extensionDate
                notes = body.notes
                objectGroupId = body.objectGroupId
                objectGroupTitle = body.objectGroupTitle
                skip = body.skip
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun amountMax(amountMax: String) = amountMax(JsonField.of(amountMax))

            /**
             * Sets [Builder.amountMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountMax] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountMax(amountMax: JsonField<String>) = apply { this.amountMax = amountMax }

            fun amountMin(amountMin: String) = amountMin(JsonField.of(amountMin))

            /**
             * Sets [Builder.amountMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountMin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountMin(amountMin: JsonField<String>) = apply { this.amountMin = amountMin }

            fun date(date: OffsetDateTime) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** How often the bill must be paid. */
            fun repeatFreq(repeatFreq: BillRepeatFrequency) = repeatFreq(JsonField.of(repeatFreq))

            /**
             * Sets [Builder.repeatFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repeatFreq] with a well-typed [BillRepeatFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun repeatFreq(repeatFreq: JsonField<BillRepeatFrequency>) = apply {
                this.repeatFreq = repeatFreq
            }

            /** If the bill is active. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /** Use either currency_id or currency_code */
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

            /** Use either currency_id or currency_code */
            fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

            /**
             * Sets [Builder.currencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

            /** The date after which this bill is no longer valid or applicable */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The date before which the bill must be renewed (or cancelled) */
            fun extensionDate(extensionDate: OffsetDateTime) =
                extensionDate(JsonField.of(extensionDate))

            /**
             * Sets [Builder.extensionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extensionDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun extensionDate(extensionDate: JsonField<OffsetDateTime>) = apply {
                this.extensionDate = extensionDate
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

            /** How often the bill must be skipped. 1 means a bi-monthly bill. */
            fun skip(skip: Int) = skip(JsonField.of(skip))

            /**
             * Sets [Builder.skip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skip] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun skip(skip: JsonField<Int>) = apply { this.skip = skip }

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
             * .amountMax()
             * .amountMin()
             * .date()
             * .name()
             * .repeatFreq()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amountMax", amountMax),
                    checkRequired("amountMin", amountMin),
                    checkRequired("date", date),
                    checkRequired("name", name),
                    checkRequired("repeatFreq", repeatFreq),
                    active,
                    currencyCode,
                    currencyId,
                    endDate,
                    extensionDate,
                    notes,
                    objectGroupId,
                    objectGroupTitle,
                    skip,
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

            amountMax()
            amountMin()
            date()
            name()
            repeatFreq().validate()
            active()
            currencyCode()
            currencyId()
            endDate()
            extensionDate()
            notes()
            objectGroupId()
            objectGroupTitle()
            skip()
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
            (if (amountMax.asKnown() == null) 0 else 1) +
                (if (amountMin.asKnown() == null) 0 else 1) +
                (if (date.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (repeatFreq.asKnown()?.validity() ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (currencyCode.asKnown() == null) 0 else 1) +
                (if (currencyId.asKnown() == null) 0 else 1) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (extensionDate.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (objectGroupId.asKnown() == null) 0 else 1) +
                (if (objectGroupTitle.asKnown() == null) 0 else 1) +
                (if (skip.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amountMax == other.amountMax &&
                amountMin == other.amountMin &&
                date == other.date &&
                name == other.name &&
                repeatFreq == other.repeatFreq &&
                active == other.active &&
                currencyCode == other.currencyCode &&
                currencyId == other.currencyId &&
                endDate == other.endDate &&
                extensionDate == other.extensionDate &&
                notes == other.notes &&
                objectGroupId == other.objectGroupId &&
                objectGroupTitle == other.objectGroupTitle &&
                skip == other.skip &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amountMax,
                amountMin,
                date,
                name,
                repeatFreq,
                active,
                currencyCode,
                currencyId,
                endDate,
                extensionDate,
                notes,
                objectGroupId,
                objectGroupTitle,
                skip,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amountMax=$amountMax, amountMin=$amountMin, date=$date, name=$name, repeatFreq=$repeatFreq, active=$active, currencyCode=$currencyCode, currencyId=$currencyId, endDate=$endDate, extensionDate=$extensionDate, notes=$notes, objectGroupId=$objectGroupId, objectGroupTitle=$objectGroupTitle, skip=$skip, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillCreateParams &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BillCreateParams{xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
