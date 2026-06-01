// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.usergroups

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.Enum
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.checkKnown
import com.firefly.api.core.checkRequired
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class UserGroupRead
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val links: JsonField<ObjectLink>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<ObjectLink> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, links, type, mutableMapOf())

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): ObjectLink = links.getRequired("links")

    /**
     * Immutable value
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
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
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

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
         * Returns a mutable builder for constructing an instance of [UserGroupRead].
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

    /** A builder for [UserGroupRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userGroupRead: UserGroupRead) = apply {
            id = userGroupRead.id
            attributes = userGroupRead.attributes
            links = userGroupRead.links
            type = userGroupRead.type
            additionalProperties = userGroupRead.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

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
         * Returns an immutable instance of [UserGroupRead].
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
        fun build(): UserGroupRead =
            UserGroupRead(
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
     * @throws FireflyInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UserGroupRead = apply {
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
        } catch (e: FireflyInvalidDataException) {
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

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val canSeeMembers: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val inUse: JsonField<Boolean>,
        private val members: JsonField<List<Member>>,
        private val primaryCurrencyCode: JsonField<String>,
        private val primaryCurrencyDecimalPlaces: JsonField<Int>,
        private val primaryCurrencyId: JsonField<String>,
        private val primaryCurrencySymbol: JsonField<String>,
        private val title: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("can_see_members")
            @ExcludeMissing
            canSeeMembers: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("in_use") @ExcludeMissing inUse: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("members")
            @ExcludeMissing
            members: JsonField<List<Member>> = JsonMissing.of(),
            @JsonProperty("primary_currency_code")
            @ExcludeMissing
            primaryCurrencyCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_decimal_places")
            @ExcludeMissing
            primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("primary_currency_id")
            @ExcludeMissing
            primaryCurrencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("primary_currency_symbol")
            @ExcludeMissing
            primaryCurrencySymbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            canSeeMembers,
            createdAt,
            inUse,
            members,
            primaryCurrencyCode,
            primaryCurrencyDecimalPlaces,
            primaryCurrencyId,
            primaryCurrencySymbol,
            title,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Can the current user see the members of this user group?
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun canSeeMembers(): Boolean? = canSeeMembers.getNullable("can_see_members")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Is this user group ('financial administration') currently the active administration?
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inUse(): Boolean? = inUse.getNullable("in_use")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun members(): List<Member>? = members.getNullable("members")

        /**
         * Returns the primary currency code of the user group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyCode(): String? =
            primaryCurrencyCode.getNullable("primary_currency_code")

        /**
         * Returns the primary currency decimal places of the user group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyDecimalPlaces(): Int? =
            primaryCurrencyDecimalPlaces.getNullable("primary_currency_decimal_places")

        /**
         * Returns the primary currency ID of the user group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencyId(): String? = primaryCurrencyId.getNullable("primary_currency_id")

        /**
         * Returns the primary currency symbol of the user group.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primaryCurrencySymbol(): String? =
            primaryCurrencySymbol.getNullable("primary_currency_symbol")

        /**
         * Title of the user group. By default, it is the same as the user's email address.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): String? = title.getNullable("title")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [canSeeMembers].
         *
         * Unlike [canSeeMembers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("can_see_members")
        @ExcludeMissing
        fun _canSeeMembers(): JsonField<Boolean> = canSeeMembers

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [inUse].
         *
         * Unlike [inUse], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("in_use") @ExcludeMissing fun _inUse(): JsonField<Boolean> = inUse

        /**
         * Returns the raw JSON value of [members].
         *
         * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<Member>> = members

        /**
         * Returns the raw JSON value of [primaryCurrencyCode].
         *
         * Unlike [primaryCurrencyCode], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [primaryCurrencySymbol].
         *
         * Unlike [primaryCurrencySymbol], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("primary_currency_symbol")
        @ExcludeMissing
        fun _primaryCurrencySymbol(): JsonField<String> = primaryCurrencySymbol

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var canSeeMembers: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var inUse: JsonField<Boolean> = JsonMissing.of()
            private var members: JsonField<MutableList<Member>>? = null
            private var primaryCurrencyCode: JsonField<String> = JsonMissing.of()
            private var primaryCurrencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
            private var primaryCurrencyId: JsonField<String> = JsonMissing.of()
            private var primaryCurrencySymbol: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                canSeeMembers = attributes.canSeeMembers
                createdAt = attributes.createdAt
                inUse = attributes.inUse
                members = attributes.members.map { it.toMutableList() }
                primaryCurrencyCode = attributes.primaryCurrencyCode
                primaryCurrencyDecimalPlaces = attributes.primaryCurrencyDecimalPlaces
                primaryCurrencyId = attributes.primaryCurrencyId
                primaryCurrencySymbol = attributes.primaryCurrencySymbol
                title = attributes.title
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            /** Can the current user see the members of this user group? */
            fun canSeeMembers(canSeeMembers: Boolean) = canSeeMembers(JsonField.of(canSeeMembers))

            /**
             * Sets [Builder.canSeeMembers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canSeeMembers] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canSeeMembers(canSeeMembers: JsonField<Boolean>) = apply {
                this.canSeeMembers = canSeeMembers
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Is this user group ('financial administration') currently the active administration?
             */
            fun inUse(inUse: Boolean) = inUse(JsonField.of(inUse))

            /**
             * Sets [Builder.inUse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inUse] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inUse(inUse: JsonField<Boolean>) = apply { this.inUse = inUse }

            fun members(members: List<Member>) = members(JsonField.of(members))

            /**
             * Sets [Builder.members] to an arbitrary JSON value.
             *
             * You should usually call [Builder.members] with a well-typed `List<Member>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun members(members: JsonField<List<Member>>) = apply {
                this.members = members.map { it.toMutableList() }
            }

            /**
             * Adds a single [Member] to [members].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMember(member: Member) = apply {
                members =
                    (members ?: JsonField.of(mutableListOf())).also {
                        checkKnown("members", it).add(member)
                    }
            }

            /** Returns the primary currency code of the user group. */
            fun primaryCurrencyCode(primaryCurrencyCode: String) =
                primaryCurrencyCode(JsonField.of(primaryCurrencyCode))

            /**
             * Sets [Builder.primaryCurrencyCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCurrencyCode(primaryCurrencyCode: JsonField<String>) = apply {
                this.primaryCurrencyCode = primaryCurrencyCode
            }

            /** Returns the primary currency decimal places of the user group. */
            fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: Int) =
                primaryCurrencyDecimalPlaces(JsonField.of(primaryCurrencyDecimalPlaces))

            /**
             * Sets [Builder.primaryCurrencyDecimalPlaces] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencyDecimalPlaces] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun primaryCurrencyDecimalPlaces(primaryCurrencyDecimalPlaces: JsonField<Int>) = apply {
                this.primaryCurrencyDecimalPlaces = primaryCurrencyDecimalPlaces
            }

            /** Returns the primary currency ID of the user group. */
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

            /** Returns the primary currency symbol of the user group. */
            fun primaryCurrencySymbol(primaryCurrencySymbol: String) =
                primaryCurrencySymbol(JsonField.of(primaryCurrencySymbol))

            /**
             * Sets [Builder.primaryCurrencySymbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryCurrencySymbol] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun primaryCurrencySymbol(primaryCurrencySymbol: JsonField<String>) = apply {
                this.primaryCurrencySymbol = primaryCurrencySymbol
            }

            /** Title of the user group. By default, it is the same as the user's email address. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes =
                Attributes(
                    canSeeMembers,
                    createdAt,
                    inUse,
                    (members ?: JsonMissing.of()).map { it.toImmutable() },
                    primaryCurrencyCode,
                    primaryCurrencyDecimalPlaces,
                    primaryCurrencyId,
                    primaryCurrencySymbol,
                    title,
                    updatedAt,
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
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            canSeeMembers()
            createdAt()
            inUse()
            members()?.forEach { it.validate() }
            primaryCurrencyCode()
            primaryCurrencyDecimalPlaces()
            primaryCurrencyId()
            primaryCurrencySymbol()
            title()
            updatedAt()
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
            (if (canSeeMembers.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (inUse.asKnown() == null) 0 else 1) +
                (members.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (primaryCurrencyCode.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyDecimalPlaces.asKnown() == null) 0 else 1) +
                (if (primaryCurrencyId.asKnown() == null) 0 else 1) +
                (if (primaryCurrencySymbol.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        class Member
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val roles: JsonField<List<Role>>,
            private val userEmail: JsonField<String>,
            private val userId: JsonField<String>,
            private val you: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("roles")
                @ExcludeMissing
                roles: JsonField<List<Role>> = JsonMissing.of(),
                @JsonProperty("user_email")
                @ExcludeMissing
                userEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("you") @ExcludeMissing you: JsonField<Boolean> = JsonMissing.of(),
            ) : this(roles, userEmail, userId, you, mutableMapOf())

            /**
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun roles(): List<Role>? = roles.getNullable("roles")

            /**
             * The email address of the member
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userEmail(): String? = userEmail.getNullable("user_email")

            /**
             * The ID of the member.
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("user_id")

            /**
             * Is this you? (the current user)
             *
             * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun you(): Boolean? = you.getNullable("you")

            /**
             * Returns the raw JSON value of [roles].
             *
             * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<Role>> = roles

            /**
             * Returns the raw JSON value of [userEmail].
             *
             * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_email")
            @ExcludeMissing
            fun _userEmail(): JsonField<String> = userEmail

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [you].
             *
             * Unlike [you], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("you") @ExcludeMissing fun _you(): JsonField<Boolean> = you

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

                /** Returns a mutable builder for constructing an instance of [Member]. */
                fun builder() = Builder()
            }

            /** A builder for [Member]. */
            class Builder internal constructor() {

                private var roles: JsonField<MutableList<Role>>? = null
                private var userEmail: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var you: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(member: Member) = apply {
                    roles = member.roles.map { it.toMutableList() }
                    userEmail = member.userEmail
                    userId = member.userId
                    you = member.you
                    additionalProperties = member.additionalProperties.toMutableMap()
                }

                fun roles(roles: List<Role>) = roles(JsonField.of(roles))

                /**
                 * Sets [Builder.roles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.roles] with a well-typed `List<Role>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun roles(roles: JsonField<List<Role>>) = apply {
                    this.roles = roles.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Role] to [roles].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRole(role: Role) = apply {
                    roles =
                        (roles ?: JsonField.of(mutableListOf())).also {
                            checkKnown("roles", it).add(role)
                        }
                }

                /** The email address of the member */
                fun userEmail(userEmail: String) = userEmail(JsonField.of(userEmail))

                /**
                 * Sets [Builder.userEmail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userEmail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

                /** The ID of the member. */
                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                /** Is this you? (the current user) */
                fun you(you: Boolean) = you(JsonField.of(you))

                /**
                 * Sets [Builder.you] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.you] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun you(you: JsonField<Boolean>) = apply { this.you = you }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Member].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Member =
                    Member(
                        (roles ?: JsonMissing.of()).map { it.toImmutable() },
                        userEmail,
                        userId,
                        you,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws FireflyInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Member = apply {
                if (validated) {
                    return@apply
                }

                roles()?.forEach { it.validate() }
                userEmail()
                userId()
                you()
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
                (roles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (userEmail.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1) +
                    (if (you.asKnown() == null) 0 else 1)

            /**
             * The possible roles of the user in this user group are documented here:
             * https://docs.firefly-iii.org/references/firefly-iii/api/
             */
            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val RO = of("ro")

                    val MNG_TRX = of("mng_trx")

                    val MNG_META = of("mng_meta")

                    val READ_BUDGETS = of("read_budgets")

                    val READ_PIGGIES = of("read_piggies")

                    val READ_SUBSCRIPTIONS = of("read_subscriptions")

                    val READ_RULES = of("read_rules")

                    val READ_RECURRING = of("read_recurring")

                    val READ_WEBHOOKS = of("read_webhooks")

                    val READ_CURRENCIES = of("read_currencies")

                    val MNG_BUDGETS = of("mng_budgets")

                    val MNG_PIGGIES = of("mng_piggies")

                    val MNG_SUBSCRIPTIONS = of("mng_subscriptions")

                    val MNG_RULES = of("mng_rules")

                    val MNG_RECURRING = of("mng_recurring")

                    val MNG_WEBHOOKS = of("mng_webhooks")

                    val MNG_CURRENCIES = of("mng_currencies")

                    val VIEW_REPORTS = of("view_reports")

                    val VIEW_MEMBERSHIPS = of("view_memberships")

                    val FULL = of("full")

                    val OWNER = of("owner")

                    fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    RO,
                    MNG_TRX,
                    MNG_META,
                    READ_BUDGETS,
                    READ_PIGGIES,
                    READ_SUBSCRIPTIONS,
                    READ_RULES,
                    READ_RECURRING,
                    READ_WEBHOOKS,
                    READ_CURRENCIES,
                    MNG_BUDGETS,
                    MNG_PIGGIES,
                    MNG_SUBSCRIPTIONS,
                    MNG_RULES,
                    MNG_RECURRING,
                    MNG_WEBHOOKS,
                    MNG_CURRENCIES,
                    VIEW_REPORTS,
                    VIEW_MEMBERSHIPS,
                    FULL,
                    OWNER,
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RO,
                    MNG_TRX,
                    MNG_META,
                    READ_BUDGETS,
                    READ_PIGGIES,
                    READ_SUBSCRIPTIONS,
                    READ_RULES,
                    READ_RECURRING,
                    READ_WEBHOOKS,
                    READ_CURRENCIES,
                    MNG_BUDGETS,
                    MNG_PIGGIES,
                    MNG_SUBSCRIPTIONS,
                    MNG_RULES,
                    MNG_RECURRING,
                    MNG_WEBHOOKS,
                    MNG_CURRENCIES,
                    VIEW_REPORTS,
                    VIEW_MEMBERSHIPS,
                    FULL,
                    OWNER,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RO -> Value.RO
                        MNG_TRX -> Value.MNG_TRX
                        MNG_META -> Value.MNG_META
                        READ_BUDGETS -> Value.READ_BUDGETS
                        READ_PIGGIES -> Value.READ_PIGGIES
                        READ_SUBSCRIPTIONS -> Value.READ_SUBSCRIPTIONS
                        READ_RULES -> Value.READ_RULES
                        READ_RECURRING -> Value.READ_RECURRING
                        READ_WEBHOOKS -> Value.READ_WEBHOOKS
                        READ_CURRENCIES -> Value.READ_CURRENCIES
                        MNG_BUDGETS -> Value.MNG_BUDGETS
                        MNG_PIGGIES -> Value.MNG_PIGGIES
                        MNG_SUBSCRIPTIONS -> Value.MNG_SUBSCRIPTIONS
                        MNG_RULES -> Value.MNG_RULES
                        MNG_RECURRING -> Value.MNG_RECURRING
                        MNG_WEBHOOKS -> Value.MNG_WEBHOOKS
                        MNG_CURRENCIES -> Value.MNG_CURRENCIES
                        VIEW_REPORTS -> Value.VIEW_REPORTS
                        VIEW_MEMBERSHIPS -> Value.VIEW_MEMBERSHIPS
                        FULL -> Value.FULL
                        OWNER -> Value.OWNER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FireflyInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        RO -> Known.RO
                        MNG_TRX -> Known.MNG_TRX
                        MNG_META -> Known.MNG_META
                        READ_BUDGETS -> Known.READ_BUDGETS
                        READ_PIGGIES -> Known.READ_PIGGIES
                        READ_SUBSCRIPTIONS -> Known.READ_SUBSCRIPTIONS
                        READ_RULES -> Known.READ_RULES
                        READ_RECURRING -> Known.READ_RECURRING
                        READ_WEBHOOKS -> Known.READ_WEBHOOKS
                        READ_CURRENCIES -> Known.READ_CURRENCIES
                        MNG_BUDGETS -> Known.MNG_BUDGETS
                        MNG_PIGGIES -> Known.MNG_PIGGIES
                        MNG_SUBSCRIPTIONS -> Known.MNG_SUBSCRIPTIONS
                        MNG_RULES -> Known.MNG_RULES
                        MNG_RECURRING -> Known.MNG_RECURRING
                        MNG_WEBHOOKS -> Known.MNG_WEBHOOKS
                        MNG_CURRENCIES -> Known.MNG_CURRENCIES
                        VIEW_REPORTS -> Known.VIEW_REPORTS
                        VIEW_MEMBERSHIPS -> Known.VIEW_MEMBERSHIPS
                        FULL -> Known.FULL
                        OWNER -> Known.OWNER
                        else -> throw FireflyInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FireflyInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw FireflyInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws FireflyInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Role = apply {
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

                    return other is Role && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Member &&
                    roles == other.roles &&
                    userEmail == other.userEmail &&
                    userId == other.userId &&
                    you == other.you &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(roles, userEmail, userId, you, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Member{roles=$roles, userEmail=$userEmail, userId=$userId, you=$you, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                canSeeMembers == other.canSeeMembers &&
                createdAt == other.createdAt &&
                inUse == other.inUse &&
                members == other.members &&
                primaryCurrencyCode == other.primaryCurrencyCode &&
                primaryCurrencyDecimalPlaces == other.primaryCurrencyDecimalPlaces &&
                primaryCurrencyId == other.primaryCurrencyId &&
                primaryCurrencySymbol == other.primaryCurrencySymbol &&
                title == other.title &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                canSeeMembers,
                createdAt,
                inUse,
                members,
                primaryCurrencyCode,
                primaryCurrencyDecimalPlaces,
                primaryCurrencyId,
                primaryCurrencySymbol,
                title,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{canSeeMembers=$canSeeMembers, createdAt=$createdAt, inUse=$inUse, members=$members, primaryCurrencyCode=$primaryCurrencyCode, primaryCurrencyDecimalPlaces=$primaryCurrencyDecimalPlaces, primaryCurrencyId=$primaryCurrencyId, primaryCurrencySymbol=$primaryCurrencySymbol, title=$title, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserGroupRead &&
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
        "UserGroupRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
