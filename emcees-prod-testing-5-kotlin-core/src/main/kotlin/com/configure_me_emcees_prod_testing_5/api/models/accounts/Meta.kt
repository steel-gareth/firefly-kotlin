// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.accounts

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class Meta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of()
    ) : this(pagination, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pagination(): Pagination? = pagination.getNullable("pagination")

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

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

        /** Returns a mutable builder for constructing an instance of [Meta]. */
        fun builder() = Builder()
    }

    /** A builder for [Meta]. */
    class Builder internal constructor() {

        private var pagination: JsonField<Pagination> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(meta: Meta) = apply {
            pagination = meta.pagination
            additionalProperties = meta.additionalProperties.toMutableMap()
        }

        fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

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
         * Returns an immutable instance of [Meta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Meta = Meta(pagination, additionalProperties.toMutableMap())
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
    fun validate(): Meta = apply {
        if (validated) {
            return@apply
        }

        pagination()?.validate()
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
    internal fun validity(): Int = (pagination.asKnown()?.validity() ?: 0)

    class Pagination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val count: JsonField<Long>,
        private val currentPage: JsonField<Long>,
        private val perPage: JsonField<Long>,
        private val total: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("current_page")
            @ExcludeMissing
            currentPage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("per_page") @ExcludeMissing perPage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
        ) : this(count, currentPage, perPage, total, totalPages, mutableMapOf())

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun count(): Long? = count.getNullable("count")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentPage(): Long? = currentPage.getNullable("current_page")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun perPage(): Long? = perPage.getNullable("per_page")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun total(): Long? = total.getNullable("total")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalPages(): Long? = totalPages.getNullable("total_pages")

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

        /**
         * Returns the raw JSON value of [currentPage].
         *
         * Unlike [currentPage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("current_page")
        @ExcludeMissing
        fun _currentPage(): JsonField<Long> = currentPage

        /**
         * Returns the raw JSON value of [perPage].
         *
         * Unlike [perPage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per_page") @ExcludeMissing fun _perPage(): JsonField<Long> = perPage

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

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

            /** Returns a mutable builder for constructing an instance of [Pagination]. */
            fun builder() = Builder()
        }

        /** A builder for [Pagination]. */
        class Builder internal constructor() {

            private var count: JsonField<Long> = JsonMissing.of()
            private var currentPage: JsonField<Long> = JsonMissing.of()
            private var perPage: JsonField<Long> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pagination: Pagination) = apply {
                count = pagination.count
                currentPage = pagination.currentPage
                perPage = pagination.perPage
                total = pagination.total
                totalPages = pagination.totalPages
                additionalProperties = pagination.additionalProperties.toMutableMap()
            }

            fun count(count: Long) = count(JsonField.of(count))

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun count(count: JsonField<Long>) = apply { this.count = count }

            fun currentPage(currentPage: Long) = currentPage(JsonField.of(currentPage))

            /**
             * Sets [Builder.currentPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentPage] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentPage(currentPage: JsonField<Long>) = apply { this.currentPage = currentPage }

            fun perPage(perPage: Long) = perPage(JsonField.of(perPage))

            /**
             * Sets [Builder.perPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perPage] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perPage(perPage: JsonField<Long>) = apply { this.perPage = perPage }

            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

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
             * Returns an immutable instance of [Pagination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pagination =
                Pagination(
                    count,
                    currentPage,
                    perPage,
                    total,
                    totalPages,
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
        fun validate(): Pagination = apply {
            if (validated) {
                return@apply
            }

            count()
            currentPage()
            perPage()
            total()
            totalPages()
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
            (if (count.asKnown() == null) 0 else 1) +
                (if (currentPage.asKnown() == null) 0 else 1) +
                (if (perPage.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (if (totalPages.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pagination &&
                count == other.count &&
                currentPage == other.currentPage &&
                perPage == other.perPage &&
                total == other.total &&
                totalPages == other.totalPages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(count, currentPage, perPage, total, totalPages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pagination{count=$count, currentPage=$currentPage, perPage=$perPage, total=$total, totalPages=$totalPages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Meta &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Meta{pagination=$pagination, additionalProperties=$additionalProperties}"
}
