// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.tags

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.errors.FireflyInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Update existing tag. */
class TagUpdateParams
private constructor(
    private val pathTag: String?,
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathTag(): String? = pathTag

    fun xTraceId(): String? = xTraceId

    /**
     * The date to which the tag is applicable.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun date(): LocalDate? = body.date()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Latitude of the tag's location, if applicable. Can be used to draw a map.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latitude(): Double? = body.latitude()

    /**
     * Latitude of the tag's location, if applicable. Can be used to draw a map.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longitude(): Double? = body.longitude()

    /**
     * The tag
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyTag(): String? = body.bodyTag()

    /**
     * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
     * proprietary value because each map provider has different zoom levels.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun zoomLevel(): Int? = body.zoomLevel()

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _date(): JsonField<LocalDate> = body._date()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [latitude].
     *
     * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _latitude(): JsonField<Double> = body._latitude()

    /**
     * Returns the raw JSON value of [longitude].
     *
     * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _longitude(): JsonField<Double> = body._longitude()

    /**
     * Returns the raw JSON value of [bodyTag].
     *
     * Unlike [bodyTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyTag(): JsonField<String> = body._bodyTag()

    /**
     * Returns the raw JSON value of [zoomLevel].
     *
     * Unlike [zoomLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _zoomLevel(): JsonField<Int> = body._zoomLevel()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TagUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TagUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TagUpdateParams]. */
    class Builder internal constructor() {

        private var pathTag: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(tagUpdateParams: TagUpdateParams) = apply {
            pathTag = tagUpdateParams.pathTag
            xTraceId = tagUpdateParams.xTraceId
            body = tagUpdateParams.body.toBuilder()
            additionalHeaders = tagUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tagUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pathTag(pathTag: String?) = apply { this.pathTag = pathTag }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [date]
         * - [description]
         * - [latitude]
         * - [longitude]
         * - [bodyTag]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The date to which the tag is applicable. */
        fun date(date: LocalDate?) = apply { body.date(date) }

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { body.date(date) }

        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Latitude of the tag's location, if applicable. Can be used to draw a map. */
        fun latitude(latitude: Double?) = apply { body.latitude(latitude) }

        /**
         * Alias for [Builder.latitude].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latitude(latitude: Double) = latitude(latitude as Double?)

        /**
         * Sets [Builder.latitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latitude(latitude: JsonField<Double>) = apply { body.latitude(latitude) }

        /** Latitude of the tag's location, if applicable. Can be used to draw a map. */
        fun longitude(longitude: Double?) = apply { body.longitude(longitude) }

        /**
         * Alias for [Builder.longitude].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun longitude(longitude: Double) = longitude(longitude as Double?)

        /**
         * Sets [Builder.longitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitude(longitude: JsonField<Double>) = apply { body.longitude(longitude) }

        /** The tag */
        fun bodyTag(bodyTag: String) = apply { body.bodyTag(bodyTag) }

        /**
         * Sets [Builder.bodyTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyTag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bodyTag(bodyTag: JsonField<String>) = apply { body.bodyTag(bodyTag) }

        /**
         * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
         * proprietary value because each map provider has different zoom levels.
         */
        fun zoomLevel(zoomLevel: Int?) = apply { body.zoomLevel(zoomLevel) }

        /**
         * Alias for [Builder.zoomLevel].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun zoomLevel(zoomLevel: Int) = zoomLevel(zoomLevel as Int?)

        /**
         * Sets [Builder.zoomLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoomLevel] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoomLevel(zoomLevel: JsonField<Int>) = apply { body.zoomLevel(zoomLevel) }

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
         * Returns an immutable instance of [TagUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TagUpdateParams =
            TagUpdateParams(
                pathTag,
                xTraceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathTag ?: ""
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
        private val date: JsonField<LocalDate>,
        private val description: JsonField<String>,
        private val latitude: JsonField<Double>,
        private val longitude: JsonField<Double>,
        private val bodyTag: JsonField<String>,
        private val zoomLevel: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latitude")
            @ExcludeMissing
            latitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("longitude")
            @ExcludeMissing
            longitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tag") @ExcludeMissing bodyTag: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zoom_level") @ExcludeMissing zoomLevel: JsonField<Int> = JsonMissing.of(),
        ) : this(date, description, latitude, longitude, bodyTag, zoomLevel, mutableMapOf())

        /**
         * The date to which the tag is applicable.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun date(): LocalDate? = date.getNullable("date")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Latitude of the tag's location, if applicable. Can be used to draw a map.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latitude(): Double? = latitude.getNullable("latitude")

        /**
         * Latitude of the tag's location, if applicable. Can be used to draw a map.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun longitude(): Double? = longitude.getNullable("longitude")

        /**
         * The tag
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bodyTag(): String? = bodyTag.getNullable("tag")

        /**
         * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
         * proprietary value because each map provider has different zoom levels.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun zoomLevel(): Int? = zoomLevel.getNullable("zoom_level")

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [latitude].
         *
         * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

        /**
         * Returns the raw JSON value of [longitude].
         *
         * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

        /**
         * Returns the raw JSON value of [bodyTag].
         *
         * Unlike [bodyTag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag") @ExcludeMissing fun _bodyTag(): JsonField<String> = bodyTag

        /**
         * Returns the raw JSON value of [zoomLevel].
         *
         * Unlike [zoomLevel], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var date: JsonField<LocalDate> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var latitude: JsonField<Double> = JsonMissing.of()
            private var longitude: JsonField<Double> = JsonMissing.of()
            private var bodyTag: JsonField<String> = JsonMissing.of()
            private var zoomLevel: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                date = body.date
                description = body.description
                latitude = body.latitude
                longitude = body.longitude
                bodyTag = body.bodyTag
                zoomLevel = body.zoomLevel
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The date to which the tag is applicable. */
            fun date(date: LocalDate?) = date(JsonField.ofNullable(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [LocalDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            /** Latitude of the tag's location, if applicable. Can be used to draw a map. */
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
             * You should usually call [Builder.latitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

            /** Latitude of the tag's location, if applicable. Can be used to draw a map. */
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
             * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

            /** The tag */
            fun bodyTag(bodyTag: String) = bodyTag(JsonField.of(bodyTag))

            /**
             * Sets [Builder.bodyTag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyTag] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyTag(bodyTag: JsonField<String>) = apply { this.bodyTag = bodyTag }

            /**
             * Zoom level for the map, if drawn. This to set the box right. Unfortunately this is a
             * proprietary value because each map provider has different zoom levels.
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
             * You should usually call [Builder.zoomLevel] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zoomLevel(zoomLevel: JsonField<Int>) = apply { this.zoomLevel = zoomLevel }

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
                    date,
                    description,
                    latitude,
                    longitude,
                    bodyTag,
                    zoomLevel,
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

            date()
            description()
            latitude()
            longitude()
            bodyTag()
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
            (if (date.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (latitude.asKnown() == null) 0 else 1) +
                (if (longitude.asKnown() == null) 0 else 1) +
                (if (bodyTag.asKnown() == null) 0 else 1) +
                (if (zoomLevel.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                date == other.date &&
                description == other.description &&
                latitude == other.latitude &&
                longitude == other.longitude &&
                bodyTag == other.bodyTag &&
                zoomLevel == other.zoomLevel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                date,
                description,
                latitude,
                longitude,
                bodyTag,
                zoomLevel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{date=$date, description=$description, latitude=$latitude, longitude=$longitude, bodyTag=$bodyTag, zoomLevel=$zoomLevel, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TagUpdateParams &&
            pathTag == other.pathTag &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathTag, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TagUpdateParams{pathTag=$pathTag, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
