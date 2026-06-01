// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.autocomplete

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

class AutocompleteListPiggyBanksWithBalanceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val currencyCode: JsonField<String>,
    private val currencyDecimalPlaces: JsonField<Int>,
    private val currencyId: JsonField<String>,
    private val currencySymbol: JsonField<String>,
    private val nameWithBalance: JsonField<String>,
    private val objectGroupId: JsonField<String>,
    private val objectGroupTitle: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_code")
        @ExcludeMissing
        currencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_decimal_places")
        @ExcludeMissing
        currencyDecimalPlaces: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("currency_id")
        @ExcludeMissing
        currencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_symbol")
        @ExcludeMissing
        currencySymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name_with_balance")
        @ExcludeMissing
        nameWithBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_group_id")
        @ExcludeMissing
        objectGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_group_title")
        @ExcludeMissing
        objectGroupTitle: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        name,
        currencyCode,
        currencyDecimalPlaces,
        currencyId,
        currencySymbol,
        nameWithBalance,
        objectGroupId,
        objectGroupTitle,
        mutableMapOf(),
    )

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Name of the piggy bank found by an auto-complete search.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Currency code for the currency used by this piggy bank. This will always be the piggy bank's
     * currency, never the primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyCode(): String? = currencyCode.getNullable("currency_code")

    /**
     * Currency decimal places for the currency used by this piggy bank. This will always be the
     * piggy bank's currency, never the primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyDecimalPlaces(): Int? = currencyDecimalPlaces.getNullable("currency_decimal_places")

    /**
     * Currency ID for the currency used by this piggy bank. This will always be the piggy bank's
     * currency, never the primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyId(): String? = currencyId.getNullable("currency_id")

    /**
     * Currency symbol for the currency used by this piggy bank. This will always be the piggy
     * bank's currency, never the primary currency.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencySymbol(): String? = currencySymbol.getNullable("currency_symbol")

    /**
     * Name of the piggy bank found by an auto-complete search, including the currently saved amount
     * and the target amount.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nameWithBalance(): String? = nameWithBalance.getNullable("name_with_balance")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [currencySymbol].
     *
     * Unlike [currencySymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_symbol")
    @ExcludeMissing
    fun _currencySymbol(): JsonField<String> = currencySymbol

    /**
     * Returns the raw JSON value of [nameWithBalance].
     *
     * Unlike [nameWithBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name_with_balance")
    @ExcludeMissing
    fun _nameWithBalance(): JsonField<String> = nameWithBalance

    /**
     * Returns the raw JSON value of [objectGroupId].
     *
     * Unlike [objectGroupId], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of
         * [AutocompleteListPiggyBanksWithBalanceResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AutocompleteListPiggyBanksWithBalanceResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var currencyCode: JsonField<String> = JsonMissing.of()
        private var currencyDecimalPlaces: JsonField<Int> = JsonMissing.of()
        private var currencyId: JsonField<String> = JsonMissing.of()
        private var currencySymbol: JsonField<String> = JsonMissing.of()
        private var nameWithBalance: JsonField<String> = JsonMissing.of()
        private var objectGroupId: JsonField<String> = JsonMissing.of()
        private var objectGroupTitle: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            autocompleteListPiggyBanksWithBalanceResponse:
                AutocompleteListPiggyBanksWithBalanceResponse
        ) = apply {
            id = autocompleteListPiggyBanksWithBalanceResponse.id
            name = autocompleteListPiggyBanksWithBalanceResponse.name
            currencyCode = autocompleteListPiggyBanksWithBalanceResponse.currencyCode
            currencyDecimalPlaces =
                autocompleteListPiggyBanksWithBalanceResponse.currencyDecimalPlaces
            currencyId = autocompleteListPiggyBanksWithBalanceResponse.currencyId
            currencySymbol = autocompleteListPiggyBanksWithBalanceResponse.currencySymbol
            nameWithBalance = autocompleteListPiggyBanksWithBalanceResponse.nameWithBalance
            objectGroupId = autocompleteListPiggyBanksWithBalanceResponse.objectGroupId
            objectGroupTitle = autocompleteListPiggyBanksWithBalanceResponse.objectGroupTitle
            additionalProperties =
                autocompleteListPiggyBanksWithBalanceResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the piggy bank found by an auto-complete search. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Currency code for the currency used by this piggy bank. This will always be the piggy
         * bank's currency, never the primary currency.
         */
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

        /**
         * Currency decimal places for the currency used by this piggy bank. This will always be the
         * piggy bank's currency, never the primary currency.
         */
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

        /**
         * Currency ID for the currency used by this piggy bank. This will always be the piggy
         * bank's currency, never the primary currency.
         */
        fun currencyId(currencyId: String) = currencyId(JsonField.of(currencyId))

        /**
         * Sets [Builder.currencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyId(currencyId: JsonField<String>) = apply { this.currencyId = currencyId }

        /**
         * Currency symbol for the currency used by this piggy bank. This will always be the piggy
         * bank's currency, never the primary currency.
         */
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

        /**
         * Name of the piggy bank found by an auto-complete search, including the currently saved
         * amount and the target amount.
         */
        fun nameWithBalance(nameWithBalance: String) =
            nameWithBalance(JsonField.of(nameWithBalance))

        /**
         * Sets [Builder.nameWithBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nameWithBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nameWithBalance(nameWithBalance: JsonField<String>) = apply {
            this.nameWithBalance = nameWithBalance
        }

        /** The group ID of the group this object is part of. NULL if no group. */
        fun objectGroupId(objectGroupId: String?) =
            objectGroupId(JsonField.ofNullable(objectGroupId))

        /**
         * Sets [Builder.objectGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [AutocompleteListPiggyBanksWithBalanceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AutocompleteListPiggyBanksWithBalanceResponse =
            AutocompleteListPiggyBanksWithBalanceResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                currencyCode,
                currencyDecimalPlaces,
                currencyId,
                currencySymbol,
                nameWithBalance,
                objectGroupId,
                objectGroupTitle,
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
    fun validate(): AutocompleteListPiggyBanksWithBalanceResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        currencyCode()
        currencyDecimalPlaces()
        currencyId()
        currencySymbol()
        nameWithBalance()
        objectGroupId()
        objectGroupTitle()
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
            (if (name.asKnown() == null) 0 else 1) +
            (if (currencyCode.asKnown() == null) 0 else 1) +
            (if (currencyDecimalPlaces.asKnown() == null) 0 else 1) +
            (if (currencyId.asKnown() == null) 0 else 1) +
            (if (currencySymbol.asKnown() == null) 0 else 1) +
            (if (nameWithBalance.asKnown() == null) 0 else 1) +
            (if (objectGroupId.asKnown() == null) 0 else 1) +
            (if (objectGroupTitle.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutocompleteListPiggyBanksWithBalanceResponse &&
            id == other.id &&
            name == other.name &&
            currencyCode == other.currencyCode &&
            currencyDecimalPlaces == other.currencyDecimalPlaces &&
            currencyId == other.currencyId &&
            currencySymbol == other.currencySymbol &&
            nameWithBalance == other.nameWithBalance &&
            objectGroupId == other.objectGroupId &&
            objectGroupTitle == other.objectGroupTitle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            currencyCode,
            currencyDecimalPlaces,
            currencyId,
            currencySymbol,
            nameWithBalance,
            objectGroupId,
            objectGroupTitle,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutocompleteListPiggyBanksWithBalanceResponse{id=$id, name=$name, currencyCode=$currencyCode, currencyDecimalPlaces=$currencyDecimalPlaces, currencyId=$currencyId, currencySymbol=$currencySymbol, nameWithBalance=$nameWithBalance, objectGroupId=$objectGroupId, objectGroupTitle=$objectGroupTitle, additionalProperties=$additionalProperties}"
}
