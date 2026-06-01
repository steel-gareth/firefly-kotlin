// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.chart.account

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.Enum
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.errors.FireflyInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ChartDataSet
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currencyCode: JsonField<String>,
    private val currencyDecimalPlaces: JsonField<Int>,
    private val currencyId: JsonField<String>,
    private val currencyName: JsonField<String>,
    private val currencySymbol: JsonField<String>,
    private val date: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val entries: JsonValue,
    private val label: JsonField<String>,
    private val pcEntries: JsonValue,
    private val period: JsonField<Period>,
    private val primaryCurrencyCode: JsonField<String>,
    private val primaryCurrencyDecimalPlaces: JsonField<Int>,
    private val primaryCurrencyId: JsonField<String>,
    private val primaryCurrencyName: JsonField<String>,
    private val primaryCurrencySymbol: JsonField<String>,
    private val startDate: JsonField<OffsetDateTime>,
    private val type: JsonField<String>,
    private val yAxisId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
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
        @JsonProperty("date") @ExcludeMissing date: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entries") @ExcludeMissing entries: JsonValue = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pc_entries") @ExcludeMissing pcEntries: JsonValue = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Period> = JsonMissing.of(),
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
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("yAxisID") @ExcludeMissing yAxisId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        currencyCode,
        currencyDecimalPlaces,
        currencyId,
        currencyName,
        currencySymbol,
        date,
        endDate,
        entries,
        label,
        pcEntries,
        period,
        primaryCurrencyCode,
        primaryCurrencyDecimalPlaces,
        primaryCurrencyId,
        primaryCurrencyName,
        primaryCurrencySymbol,
        startDate,
        type,
        yAxisId,
        mutableMapOf(),
    )

    /**
     * The currency code of the currency associated with this object.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyCode(): String? = currencyCode.getNullable("currency_code")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyDecimalPlaces(): Int? = currencyDecimalPlaces.getNullable("currency_decimal_places")

    /**
     * The currency ID of the currency associated with this object.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): String? = currencyId.getNullable("currency_id")

    /**
     * The currency name of the currency associated with this object.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyName(): String? = currencyName.getNullable("currency_name")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun date(): OffsetDateTime? = date.getNullable("date")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * The actual entries for this data set. They 'key' value is the label for the data point. The
     * value is the actual (numerical) value.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = chartDataSet.entries().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonValue = entries

    /**
     * This is the title of the current set. It can refer to an account, a budget or another object
     * (by name).
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): String? = label.getNullable("label")

    /**
     * The actual entries for this data set. They 'key' value is the label for the data point. The
     * value is the actual (numerical) value.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = chartDataSet.pcEntries().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("pc_entries") @ExcludeMissing fun _pcEntries(): JsonValue = pcEntries

    /**
     * Period of the chart.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Period? = period.getNullable("period")

    /**
     * The currency code of the administration's primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCurrencyCode(): String? = primaryCurrencyCode.getNullable("primary_currency_code")

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
    fun primaryCurrencyName(): String? = primaryCurrencyName.getNullable("primary_currency_name")

    /**
     * The currency symbol of the administration's primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryCurrencySymbol(): String? =
        primaryCurrencySymbol.getNullable("primary_currency_symbol")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

    /**
     * Indicated the type of chart that is expected to be rendered. You can safely ignore this if
     * you want.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

    /**
     * Used to indicate the Y axis for this data set. Is usually between 0 and 1 (left and right
     * side of the chart).
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun yAxisId(): Int? = yAxisId.getNullable("yAxisID")

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_code")
    @ExcludeMissing
    fun _currencyCode(): JsonField<String> = currencyCode

    /**
     * Returns the raw JSON value of [currencyDecimalPlaces].
     *
     * Unlike [currencyDecimalPlaces], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currency_decimal_places")
    @ExcludeMissing
    fun _currencyDecimalPlaces(): JsonField<Int> = currencyDecimalPlaces

    /**
     * Returns the raw JSON value of [currencyId].
     *
     * Unlike [currencyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_id") @ExcludeMissing fun _currencyId(): JsonField<String> = currencyId

    /**
     * Returns the raw JSON value of [currencyName].
     *
     * Unlike [currencyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_name")
    @ExcludeMissing
    fun _currencyName(): JsonField<String> = currencyName

    /**
     * Returns the raw JSON value of [currencySymbol].
     *
     * Unlike [currencySymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_symbol")
    @ExcludeMissing
    fun _currencySymbol(): JsonField<String> = currencySymbol

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

    /**
     * Returns the raw JSON value of [primaryCurrencyCode].
     *
     * Unlike [primaryCurrencyCode], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Unlike [primaryCurrencyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primary_currency_name")
    @ExcludeMissing
    fun _primaryCurrencyName(): JsonField<String> = primaryCurrencyName

    /**
     * Returns the raw JSON value of [primaryCurrencySymbol].
     *
     * Unlike [primaryCurrencySymbol], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primary_currency_symbol")
    @ExcludeMissing
    fun _primaryCurrencySymbol(): JsonField<String> = primaryCurrencySymbol

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [yAxisId].
     *
     * Unlike [yAxisId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yAxisID") @ExcludeMissing fun _yAxisId(): JsonField<Int> = yAxisId

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

        /** Returns a mutable builder for constructing an instance of [ChartDataSet]. */
        fun builder() = Builder()
    }

    /** A builder for [ChartDataSet]. */
    class Builder internal constructor() {

        private var currencyCode: JsonField<String> = JsonMissing.of()
        private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var currencyName: JsonField<String> = JsonMissing.of()
        private var currencySymbol: JsonField<String> = JsonMissing.of()
        private var date: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entries: JsonValue = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var pcEntries: JsonValue = JsonMissing.of()
        private var period: JsonField<Period> = JsonMissing.of()
        private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
        private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
        private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
        private var primaryCurrencyName: JsonField<String> = JsonMissing.of()
        private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var yAxisId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chartDataSet: ChartDataSet) = apply {
            currencyCode = chartDataSet.currencyCode
            currencyDecimalPlaces = chartDataSet.currencyDecimalPlaces
            currencyId = chartDataSet.currencyId
            currencyName = chartDataSet.currencyName
            currencySymbol = chartDataSet.currencySymbol
            date = chartDataSet.date
            endDate = chartDataSet.endDate
            entries = chartDataSet.entries
            label = chartDataSet.label
            pcEntries = chartDataSet.pcEntries
            period = chartDataSet.period
            primaryCurrencyCode = chartDataSet.primaryCurrencyCode
            primaryCurrencyDecimalPlaces = chartDataSet.primaryCurrencyDecimalPlaces
            primaryCurrencyId = chartDataSet.primaryCurrencyId
            primaryCurrencyName = chartDataSet.primaryCurrencyName
            primaryCurrencySymbol = chartDataSet.primaryCurrencySymbol
            startDate = chartDataSet.startDate
            type = chartDataSet.type
            yAxisId = chartDataSet.yAxisId
            additionalProperties = chartDataSet.additionalProperties.toMutableMap()
        }

        /** The currency code of the currency associated with this object. */
        fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyCode(currencyCode: JsonField<String>) = apply {
            this.currencyCode = currencyCode
        }

        fun currencyDecimalPlaces(currencyDecimalPlaces: Int) =
            currencyDecimalPlaces(JsonField.of(currencyDecimalPlaces))

        /**
         * Sets [Builder.currencyDecimalPlaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyDecimalPlaces] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencyDecimalPlaces(currencyDecimalPlaces: JsonField<Int>) = apply {
            this.currencyDecimalPlaces = currencyDecimalPlaces
        }

        /** The currency ID of the currency associated with this object. */
        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        /** The currency name of the currency associated with this object. */
        fun currencyName(currencyName: String) = currencyName(JsonField.of(currencyName))

        /**
         * Sets [Builder.currencyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyName(currencyName: JsonField<String>) = apply {
            this.currencyName = currencyName
        }

        fun currencySymbol(currencySymbol: String) = currencySymbol(JsonField.of(currencySymbol))

        /**
         * Sets [Builder.currencySymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencySymbol] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencySymbol(currencySymbol: JsonField<String>) = apply {
            this.currencySymbol = currencySymbol
        }

        fun date(date: OffsetDateTime) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /**
         * The actual entries for this data set. They 'key' value is the label for the data point.
         * The value is the actual (numerical) value.
         */
        fun entries(entries: JsonValue) = apply { this.entries = entries }

        /**
         * This is the title of the current set. It can refer to an account, a budget or another
         * object (by name).
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * The actual entries for this data set. They 'key' value is the label for the data point.
         * The value is the actual (numerical) value.
         */
        fun pcEntries(pcEntries: JsonValue) = apply { this.pcEntries = pcEntries }

        /** Period of the chart. */
        fun period(period: Period) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Period] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Period>) = apply { this.period = period }

        /** The currency code of the administration's primary currency. */
        fun primaryCurrencyCode(primaryCurrencyCode: String) =
            primaryCurrencyCode(JsonField.of(primaryCurrencyCode))

        /**
         * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.primaryCurrencyDecimalPlaces] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.primaryCurrencyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.primaryCurrencySymbol] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun primaryCurrencySymbol(primaryCurrencySymbol: JsonField<String>) = apply {
            this.primaryCurrencySymbol = primaryCurrencySymbol
        }

        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /**
         * Indicated the type of chart that is expected to be rendered. You can safely ignore this
         * if you want.
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Used to indicate the Y axis for this data set. Is usually between 0 and 1 (left and right
         * side of the chart).
         */
        fun yAxisId(yAxisId: Int) = yAxisId(JsonField.of(yAxisId))

        /**
         * Sets [Builder.yAxisId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yAxisId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yAxisId(yAxisId: JsonField<Int>) = apply { this.yAxisId = yAxisId }

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
         * Returns an immutable instance of [ChartDataSet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChartDataSet =
            ChartDataSet(
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencyName,
                currencySymbol,
                date,
                endDate,
                entries,
                label,
                pcEntries,
                period,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencyName,
                primaryCurrencySymbol,
                startDate,
                type,
                yAxisId,
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
    fun validate(): ChartDataSet = apply {
        if (validated) {
            return@apply
        }

        currencyCode()
        currencyDecimalPlaces()
        currencyId()
        currencyName()
        currencySymbol()
        date()
        endDate()
        label()
        period()?.validate()
        primaryCurrencyCode()
        primaryCurrencyDecimalPlaces()
        primaryCurrencyId()
        primaryCurrencyName()
        primaryCurrencySymbol()
        startDate()
        type()
        yAxisId()
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
        (if (currencyCode.asKnown() == null) 0 else 1) +
            (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
            (if (currencyId.asKnown() == null) 0 else 1) +
            (if (currencyName.asKnown() == null) 0 else 1) +
            (if (currencySymbol.asKnown() == null) 0 else 1) +
            (if (date.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (label.asKnown() == null) 0 else 1) +
            (period.asKnown()?.validity() ?: 0) +
            (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
            (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
            (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
            (if (primaryCurrencyName.asKnown() == null) 0 else 1) +
            (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (yAxisId.asKnown() == null) 0 else 1)

    /** Period of the chart. */
    class Period @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val _1_D = of("1D")

            val _1_W = of("1W")

            val _1_M = of("1M")

            val _3_M = of("3M")

            val _1_Y = of("1Y")

            val CUSTOM = of("custom")

            fun of(value: String) = Period(JsonField.of(value))
        }

        /** An enum containing [Period]'s known values. */
        enum class Known {
            _1_D,
            _1_W,
            _1_M,
            _3_M,
            _1_Y,
            CUSTOM,
        }

        /**
         * An enum containing [Period]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Period] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1_D,
            _1_W,
            _1_M,
            _3_M,
            _1_Y,
            CUSTOM,
            /** An enum member indicating that [Period] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _1_D -> Value._1_D
                _1_W -> Value._1_W
                _1_M -> Value._1_M
                _3_M -> Value._3_M
                _1_Y -> Value._1_Y
                CUSTOM -> Value.CUSTOM
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FireflyInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _1_D -> Known._1_D
                _1_W -> Known._1_W
                _1_M -> Known._1_M
                _3_M -> Known._3_M
                _1_Y -> Known._1_Y
                CUSTOM -> Known.CUSTOM
                else -> throw FireflyInvalidDataException("Unknown Period: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FireflyInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw FireflyInvalidDataException("Value is not a String")

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
        fun validate(): Period = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Period && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChartDataSet &&
            currencyCode == other.currencyCode &&
            currencyDecimalPlaces == other.currencyDecimalPlaces &&
            currencyId == other.currencyId &&
            currencyName == other.currencyName &&
            currencySymbol == other.currencySymbol &&
            date == other.date &&
            endDate == other.endDate &&
            entries == other.entries &&
            label == other.label &&
            pcEntries == other.pcEntries &&
            period == other.period &&
            primaryCurrencyCode == other.primaryCurrencyCode &&
            primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
            primaryCurrencyId == other.primaryCurrencyId &&
            primaryCurrencyName == other.primaryCurrencyName &&
            primaryCurrencySymbol == other.primaryCurrencySymbol &&
            startDate == other.startDate &&
            type == other.type &&
            yAxisId == other.yAxisId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencyName,
            currencySymbol,
            date,
            endDate,
            entries,
            label,
            pcEntries,
            period,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencyName,
            primaryCurrencySymbol,
            startDate,
            type,
            yAxisId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChartDataSet{currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencyName=$currencyName, currencySymbol=$currencySymbol, date=$date, endDate=$endDate, entries=$entries, label=$label, pcEntries=$pcEntries, period=$period, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencyName=$primaryCurrencyName, primaryCurrencySymbol=$primaryCurrencySymbol, startDate=$startDate, type=$type, yAxisId=$yAxisId, additionalProperties=$additionalProperties}"
}
