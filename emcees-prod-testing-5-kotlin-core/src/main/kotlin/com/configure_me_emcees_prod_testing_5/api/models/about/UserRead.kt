// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.about

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.configure_me_emcees_prod_testing_5.api.models.users.User
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class UserRead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<User>,
    private val links: JsonField<ObjectLink>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes") @ExcludeMissing attributes: JsonField<User> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<ObjectLink> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, links, type, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): User = attributes.getRequired("attributes")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): ObjectLink = links.getRequired("links")

    /**
     * Immutable value
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
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
    @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonField<User> = attributes

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
         * Returns a mutable builder for constructing an instance of [UserRead].
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

    /** A builder for [UserRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<User>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userRead: UserRead) = apply {
            id = userRead.id
            attributes = userRead.attributes
            links = userRead.links
            type = userRead.type
            additionalProperties = userRead.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attributes(attributes: User) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [User] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun attributes(attributes: JsonField<User>) = apply { this.attributes = attributes }

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
         * Returns an immutable instance of [UserRead].
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
        fun build(): UserRead =
            UserRead(
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
     * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't match
     *   its expected type.
     */
    fun validate(): UserRead = apply {
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
        } catch (e: EmceesProdTesting5InvalidDataException) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserRead &&
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
        "UserRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
