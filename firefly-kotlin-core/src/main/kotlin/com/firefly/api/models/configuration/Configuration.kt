// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.configuration

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.checkRequired
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

class Configuration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val editable: JsonField<Boolean>,
    private val title: JsonField<ConfigValueFilter>,
    private val value: JsonField<PolymorphicProperty>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("editable") @ExcludeMissing editable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("title")
        @ExcludeMissing
        title: JsonField<ConfigValueFilter> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        value: JsonField<PolymorphicProperty> = JsonMissing.of(),
    ) : this(editable, title, value, mutableMapOf())

    /**
     * If this config variable can be edited by the user
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun editable(): Boolean = editable.getRequired("editable")

    /**
     * Title of the configuration value.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): ConfigValueFilter = title.getRequired("title")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): PolymorphicProperty = value.getRequired("value")

    /**
     * Returns the raw JSON value of [editable].
     *
     * Unlike [editable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("editable") @ExcludeMissing fun _editable(): JsonField<Boolean> = editable

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<ConfigValueFilter> = title

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<PolymorphicProperty> = value

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
         * Returns a mutable builder for constructing an instance of [Configuration].
         *
         * The following fields are required:
         * ```kotlin
         * .editable()
         * .title()
         * .value()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Configuration]. */
    class Builder internal constructor() {

        private var editable: JsonField<Boolean>? = null
        private var title: JsonField<ConfigValueFilter>? = null
        private var value: JsonField<PolymorphicProperty>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(configuration: Configuration) = apply {
            editable = configuration.editable
            title = configuration.title
            value = configuration.value
            additionalProperties = configuration.additionalProperties.toMutableMap()
        }

        /** If this config variable can be edited by the user */
        fun editable(editable: Boolean) = editable(JsonField.of(editable))

        /**
         * Sets [Builder.editable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.editable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

        /** Title of the configuration value. */
        fun title(title: ConfigValueFilter) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [ConfigValueFilter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun title(title: JsonField<ConfigValueFilter>) = apply { this.title = title }

        fun value(value: PolymorphicProperty) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [PolymorphicProperty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun value(value: JsonField<PolymorphicProperty>) = apply { this.value = value }

        /** Alias for calling [value] with `PolymorphicProperty.ofBoolean(boolean)`. */
        fun value(boolean: Boolean) = value(PolymorphicProperty.ofBoolean(boolean))

        /** Alias for calling [value] with `PolymorphicProperty.ofString(string)`. */
        fun value(string: String) = value(PolymorphicProperty.ofString(string))

        /** Alias for calling [value] with `PolymorphicProperty.ofUnionMember2(unionMember2)`. */
        fun value(unionMember2: PolymorphicProperty.UnionMember2) =
            value(PolymorphicProperty.ofUnionMember2(unionMember2))

        /** Alias for calling [value] with `PolymorphicProperty.ofStrings(strings)`. */
        fun valueOfStrings(strings: List<String>) = value(PolymorphicProperty.ofStrings(strings))

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
         * Returns an immutable instance of [Configuration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .editable()
         * .title()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Configuration =
            Configuration(
                checkRequired("editable", editable),
                checkRequired("title", title),
                checkRequired("value", value),
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
    fun validate(): Configuration = apply {
        if (validated) {
            return@apply
        }

        editable()
        title().validate()
        value().validate()
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
        (if (editable.asKnown() == null) 0 else 1) +
            (title.asKnown()?.validity() ?: 0) +
            (value.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Configuration &&
            editable == other.editable &&
            title == other.title &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(editable, title, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Configuration{editable=$editable, title=$title, value=$value, additionalProperties=$additionalProperties}"
}
