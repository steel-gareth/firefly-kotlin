// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.rules

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.configure_me_emcees_prod_testing_5.api.models.attachments.ObjectLink
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class RuleRead
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
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

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
         * Returns a mutable builder for constructing an instance of [RuleRead].
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

    /** A builder for [RuleRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ruleRead: RuleRead) = apply {
            id = ruleRead.id
            attributes = ruleRead.attributes
            links = ruleRead.links
            type = ruleRead.type
            additionalProperties = ruleRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [RuleRead].
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
        fun build(): RuleRead =
            RuleRead(
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
    fun validate(): RuleRead = apply {
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

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actions: JsonField<List<Action>>,
        private val ruleGroupId: JsonField<String>,
        private val title: JsonField<String>,
        private val trigger: JsonField<RuleTriggerType>,
        private val triggers: JsonField<List<Trigger>>,
        private val active: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val order: JsonField<Int>,
        private val ruleGroupTitle: JsonField<String>,
        private val stopProcessing: JsonField<Boolean>,
        private val strict: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actions")
            @ExcludeMissing
            actions: JsonField<List<Action>> = JsonMissing.of(),
            @JsonProperty("rule_group_id")
            @ExcludeMissing
            ruleGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trigger")
            @ExcludeMissing
            trigger: JsonField<RuleTriggerType> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            triggers: JsonField<List<Trigger>> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rule_group_title")
            @ExcludeMissing
            ruleGroupTitle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop_processing")
            @ExcludeMissing
            stopProcessing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("strict") @ExcludeMissing strict: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            actions,
            ruleGroupId,
            title,
            trigger,
            triggers,
            active,
            createdAt,
            description,
            order,
            ruleGroupTitle,
            stopProcessing,
            strict,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun actions(): List<Action> = actions.getRequired("actions")

        /**
         * ID of the rule group under which the rule must be stored. Either this field or
         * rule_group_title is mandatory.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun ruleGroupId(): String = ruleGroupId.getRequired("rule_group_id")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Which action is necessary for the rule to fire? Use either store-journal, update-journal
         * or manual-activation.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun trigger(): RuleTriggerType = trigger.getRequired("trigger")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun triggers(): List<Trigger> = triggers.getRequired("triggers")

        /**
         * Whether or not the rule is even active. Default is true.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * Title of the rule group under which the rule must be stored. Either this field or
         * rule_group_id is mandatory.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ruleGroupTitle(): String? = ruleGroupTitle.getNullable("rule_group_title")

        /**
         * If this value is true and the rule is triggered, other rules after this one in the group
         * will be skipped. Default value is false.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

        /**
         * If the rule is set to be strict, ALL triggers must hit in order for the rule to fire.
         * Otherwise, just one is enough. Default value is true.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun strict(): Boolean? = strict.getNullable("strict")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * Returns the raw JSON value of [actions].
         *
         * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

        /**
         * Returns the raw JSON value of [ruleGroupId].
         *
         * Unlike [ruleGroupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_group_id")
        @ExcludeMissing
        fun _ruleGroupId(): JsonField<String> = ruleGroupId

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [trigger].
         *
         * Unlike [trigger], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trigger")
        @ExcludeMissing
        fun _trigger(): JsonField<RuleTriggerType> = trigger

        /**
         * Returns the raw JSON value of [triggers].
         *
         * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("triggers")
        @ExcludeMissing
        fun _triggers(): JsonField<List<Trigger>> = triggers

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

        /**
         * Returns the raw JSON value of [ruleGroupTitle].
         *
         * Unlike [ruleGroupTitle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rule_group_title")
        @ExcludeMissing
        fun _ruleGroupTitle(): JsonField<String> = ruleGroupTitle

        /**
         * Returns the raw JSON value of [stopProcessing].
         *
         * Unlike [stopProcessing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stop_processing")
        @ExcludeMissing
        fun _stopProcessing(): JsonField<Boolean> = stopProcessing

        /**
         * Returns the raw JSON value of [strict].
         *
         * Unlike [strict], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("strict") @ExcludeMissing fun _strict(): JsonField<Boolean> = strict

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

            /**
             * Returns a mutable builder for constructing an instance of [Attributes].
             *
             * The following fields are required:
             * ```kotlin
             * .actions()
             * .ruleGroupId()
             * .title()
             * .trigger()
             * .triggers()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var actions: JsonField<MutableList<Action>>? = null
            private var ruleGroupId: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var trigger: JsonField<RuleTriggerType>? = null
            private var triggers: JsonField<MutableList<Trigger>>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var ruleGroupTitle: JsonField<String> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var strict: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                actions = attributes.actions.map { it.toMutableList() }
                ruleGroupId = attributes.ruleGroupId
                title = attributes.title
                trigger = attributes.trigger
                triggers = attributes.triggers.map { it.toMutableList() }
                active = attributes.active
                createdAt = attributes.createdAt
                description = attributes.description
                order = attributes.order
                ruleGroupTitle = attributes.ruleGroupTitle
                stopProcessing = attributes.stopProcessing
                strict = attributes.strict
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            fun actions(actions: List<Action>) = actions(JsonField.of(actions))

            /**
             * Sets [Builder.actions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actions] with a well-typed `List<Action>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actions(actions: JsonField<List<Action>>) = apply {
                this.actions = actions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Action] to [actions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAction(action: Action) = apply {
                actions =
                    (actions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("actions", it).add(action)
                    }
            }

            /**
             * ID of the rule group under which the rule must be stored. Either this field or
             * rule_group_title is mandatory.
             */
            fun ruleGroupId(ruleGroupId: String) = ruleGroupId(JsonField.of(ruleGroupId))

            /**
             * Sets [Builder.ruleGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleGroupId(ruleGroupId: JsonField<String>) = apply {
                this.ruleGroupId = ruleGroupId
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /**
             * Which action is necessary for the rule to fire? Use either store-journal,
             * update-journal or manual-activation.
             */
            fun trigger(trigger: RuleTriggerType) = trigger(JsonField.of(trigger))

            /**
             * Sets [Builder.trigger] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trigger] with a well-typed [RuleTriggerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trigger(trigger: JsonField<RuleTriggerType>) = apply { this.trigger = trigger }

            fun triggers(triggers: List<Trigger>) = triggers(JsonField.of(triggers))

            /**
             * Sets [Builder.triggers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggers] with a well-typed `List<Trigger>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun triggers(triggers: JsonField<List<Trigger>>) = apply {
                this.triggers = triggers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Trigger] to [triggers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrigger(trigger: Trigger) = apply {
                triggers =
                    (triggers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("triggers", it).add(trigger)
                    }
            }

            /** Whether or not the rule is even active. Default is true. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

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

            fun description(description: String) = description(JsonField.of(description))

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

            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /**
             * Title of the rule group under which the rule must be stored. Either this field or
             * rule_group_id is mandatory.
             */
            fun ruleGroupTitle(ruleGroupTitle: String) =
                ruleGroupTitle(JsonField.of(ruleGroupTitle))

            /**
             * Sets [Builder.ruleGroupTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleGroupTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleGroupTitle(ruleGroupTitle: JsonField<String>) = apply {
                this.ruleGroupTitle = ruleGroupTitle
            }

            /**
             * If this value is true and the rule is triggered, other rules after this one in the
             * group will be skipped. Default value is false.
             */
            fun stopProcessing(stopProcessing: Boolean) =
                stopProcessing(JsonField.of(stopProcessing))

            /**
             * Sets [Builder.stopProcessing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopProcessing] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopProcessing(stopProcessing: JsonField<Boolean>) = apply {
                this.stopProcessing = stopProcessing
            }

            /**
             * If the rule is set to be strict, ALL triggers must hit in order for the rule to fire.
             * Otherwise, just one is enough. Default value is true.
             */
            fun strict(strict: Boolean) = strict(JsonField.of(strict))

            /**
             * Sets [Builder.strict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.strict] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

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
             *
             * The following fields are required:
             * ```kotlin
             * .actions()
             * .ruleGroupId()
             * .title()
             * .trigger()
             * .triggers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("actions", actions).map { it.toImmutable() },
                    checkRequired("ruleGroupId", ruleGroupId),
                    checkRequired("title", title),
                    checkRequired("trigger", trigger),
                    checkRequired("triggers", triggers).map { it.toImmutable() },
                    active,
                    createdAt,
                    description,
                    order,
                    ruleGroupTitle,
                    stopProcessing,
                    strict,
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
         * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            actions().forEach { it.validate() }
            ruleGroupId()
            title()
            trigger().validate()
            triggers().forEach { it.validate() }
            active()
            createdAt()
            description()
            order()
            ruleGroupTitle()
            stopProcessing()
            strict()
            updatedAt()
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
            (actions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (ruleGroupId.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1) +
                (trigger.asKnown()?.validity() ?: 0) +
                (triggers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (ruleGroupTitle.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1) +
                (if (strict.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        class Action
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<RuleActionKeyword>,
            private val value: JsonField<String>,
            private val id: JsonField<String>,
            private val active: JsonField<Boolean>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val order: JsonField<Int>,
            private val stopProcessing: JsonField<Boolean>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<RuleActionKeyword> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("active")
                @ExcludeMissing
                active: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("stop_processing")
                @ExcludeMissing
                stopProcessing: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                type,
                value,
                id,
                active,
                createdAt,
                order,
                stopProcessing,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * The type of thing this action will do. A limited set is possible.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun type(): RuleActionKeyword = type.getRequired("type")

            /**
             * The accompanying value the action will set, change or update. Can be empty, but for
             * some types this value is mandatory.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun value(): String? = value.getNullable("value")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * If the action is active. Defaults to true.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun active(): Boolean? = active.getNullable("active")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * Order of the action
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun order(): Int? = order.getNullable("order")

            /**
             * When true, other actions will not be fired after this action has fired. Defaults to
             * false.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<RuleActionKeyword> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [active].
             *
             * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

            /**
             * Returns the raw JSON value of [stopProcessing].
             *
             * Unlike [stopProcessing], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("stop_processing")
            @ExcludeMissing
            fun _stopProcessing(): JsonField<Boolean> = stopProcessing

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [Action].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * .value()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Action]. */
            class Builder internal constructor() {

                private var type: JsonField<RuleActionKeyword>? = null
                private var value: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var active: JsonField<Boolean> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var order: JsonField<Int> = JsonMissing.of()
                private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(action: Action) = apply {
                    type = action.type
                    value = action.value
                    id = action.id
                    active = action.active
                    createdAt = action.createdAt
                    order = action.order
                    stopProcessing = action.stopProcessing
                    updatedAt = action.updatedAt
                    additionalProperties = action.additionalProperties.toMutableMap()
                }

                /** The type of thing this action will do. A limited set is possible. */
                fun type(type: RuleActionKeyword) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [RuleActionKeyword]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun type(type: JsonField<RuleActionKeyword>) = apply { this.type = type }

                /**
                 * The accompanying value the action will set, change or update. Can be empty, but
                 * for some types this value is mandatory.
                 */
                fun value(value: String?) = value(JsonField.ofNullable(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** If the action is active. Defaults to true. */
                fun active(active: Boolean) = active(JsonField.of(active))

                /**
                 * Sets [Builder.active] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.active] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun active(active: JsonField<Boolean>) = apply { this.active = active }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Order of the action */
                fun order(order: Int) = order(JsonField.of(order))

                /**
                 * Sets [Builder.order] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.order] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun order(order: JsonField<Int>) = apply { this.order = order }

                /**
                 * When true, other actions will not be fired after this action has fired. Defaults
                 * to false.
                 */
                fun stopProcessing(stopProcessing: Boolean) =
                    stopProcessing(JsonField.of(stopProcessing))

                /**
                 * Sets [Builder.stopProcessing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopProcessing] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun stopProcessing(stopProcessing: JsonField<Boolean>) = apply {
                    this.stopProcessing = stopProcessing
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Action].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Action =
                    Action(
                        checkRequired("type", type),
                        checkRequired("value", value),
                        id,
                        active,
                        createdAt,
                        order,
                        stopProcessing,
                        updatedAt,
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
             * @throws EmceesProdTesting5InvalidDataException if any value type in this object
             *   doesn't match its expected type.
             */
            fun validate(): Action = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                value()
                id()
                active()
                createdAt()
                order()
                stopProcessing()
                updatedAt()
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
                (type.asKnown()?.validity() ?: 0) +
                    (if (value.asKnown() == null) 0 else 1) +
                    (if (id.asKnown() == null) 0 else 1) +
                    (if (active.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (order.asKnown() == null) 0 else 1) +
                    (if (stopProcessing.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Action &&
                    type == other.type &&
                    value == other.value &&
                    id == other.id &&
                    active == other.active &&
                    createdAt == other.createdAt &&
                    order == other.order &&
                    stopProcessing == other.stopProcessing &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    type,
                    value,
                    id,
                    active,
                    createdAt,
                    order,
                    stopProcessing,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Action{type=$type, value=$value, id=$id, active=$active, createdAt=$createdAt, order=$order, stopProcessing=$stopProcessing, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        class Trigger
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<RuleTriggerKeyword>,
            private val value: JsonField<String>,
            private val id: JsonField<String>,
            private val active: JsonField<Boolean>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val order: JsonField<Int>,
            private val prohibited: JsonField<Boolean>,
            private val stopProcessing: JsonField<Boolean>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<RuleTriggerKeyword> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("active")
                @ExcludeMissing
                active: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("prohibited")
                @ExcludeMissing
                prohibited: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("stop_processing")
                @ExcludeMissing
                stopProcessing: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                type,
                value,
                id,
                active,
                createdAt,
                order,
                prohibited,
                stopProcessing,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * The type of thing this trigger responds to. A limited set is possible
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun type(): RuleTriggerKeyword = type.getRequired("type")

            /**
             * The accompanying value the trigger responds to. This value is often mandatory, but
             * this depends on the trigger.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * If the trigger is active. Defaults to true.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun active(): Boolean? = active.getNullable("active")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * Order of the trigger
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun order(): Int? = order.getNullable("order")

            /**
             * If 'prohibited' is true, this rule trigger will be negated. 'Description is' will
             * become 'Description is NOT' etc.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun prohibited(): Boolean? = prohibited.getNullable("prohibited")

            /**
             * When true, other triggers will not be checked if this trigger was triggered. Defaults
             * to false.
             *
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

            /**
             * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<RuleTriggerKeyword> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [active].
             *
             * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [order].
             *
             * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

            /**
             * Returns the raw JSON value of [prohibited].
             *
             * Unlike [prohibited], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("prohibited")
            @ExcludeMissing
            fun _prohibited(): JsonField<Boolean> = prohibited

            /**
             * Returns the raw JSON value of [stopProcessing].
             *
             * Unlike [stopProcessing], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("stop_processing")
            @ExcludeMissing
            fun _stopProcessing(): JsonField<Boolean> = stopProcessing

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [Trigger].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * .value()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Trigger]. */
            class Builder internal constructor() {

                private var type: JsonField<RuleTriggerKeyword>? = null
                private var value: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var active: JsonField<Boolean> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var order: JsonField<Int> = JsonMissing.of()
                private var prohibited: JsonField<Boolean> = JsonMissing.of()
                private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(trigger: Trigger) = apply {
                    type = trigger.type
                    value = trigger.value
                    id = trigger.id
                    active = trigger.active
                    createdAt = trigger.createdAt
                    order = trigger.order
                    prohibited = trigger.prohibited
                    stopProcessing = trigger.stopProcessing
                    updatedAt = trigger.updatedAt
                    additionalProperties = trigger.additionalProperties.toMutableMap()
                }

                /** The type of thing this trigger responds to. A limited set is possible */
                fun type(type: RuleTriggerKeyword) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [RuleTriggerKeyword]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun type(type: JsonField<RuleTriggerKeyword>) = apply { this.type = type }

                /**
                 * The accompanying value the trigger responds to. This value is often mandatory,
                 * but this depends on the trigger.
                 */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** If the trigger is active. Defaults to true. */
                fun active(active: Boolean) = active(JsonField.of(active))

                /**
                 * Sets [Builder.active] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.active] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun active(active: JsonField<Boolean>) = apply { this.active = active }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Order of the trigger */
                fun order(order: Int) = order(JsonField.of(order))

                /**
                 * Sets [Builder.order] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.order] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun order(order: JsonField<Int>) = apply { this.order = order }

                /**
                 * If 'prohibited' is true, this rule trigger will be negated. 'Description is' will
                 * become 'Description is NOT' etc.
                 */
                fun prohibited(prohibited: Boolean) = prohibited(JsonField.of(prohibited))

                /**
                 * Sets [Builder.prohibited] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prohibited] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prohibited(prohibited: JsonField<Boolean>) = apply {
                    this.prohibited = prohibited
                }

                /**
                 * When true, other triggers will not be checked if this trigger was triggered.
                 * Defaults to false.
                 */
                fun stopProcessing(stopProcessing: Boolean) =
                    stopProcessing(JsonField.of(stopProcessing))

                /**
                 * Sets [Builder.stopProcessing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopProcessing] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun stopProcessing(stopProcessing: JsonField<Boolean>) = apply {
                    this.stopProcessing = stopProcessing
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Trigger].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Trigger =
                    Trigger(
                        checkRequired("type", type),
                        checkRequired("value", value),
                        id,
                        active,
                        createdAt,
                        order,
                        prohibited,
                        stopProcessing,
                        updatedAt,
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
             * @throws EmceesProdTesting5InvalidDataException if any value type in this object
             *   doesn't match its expected type.
             */
            fun validate(): Trigger = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                value()
                id()
                active()
                createdAt()
                order()
                prohibited()
                stopProcessing()
                updatedAt()
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
                (type.asKnown()?.validity() ?: 0) +
                    (if (value.asKnown() == null) 0 else 1) +
                    (if (id.asKnown() == null) 0 else 1) +
                    (if (active.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (order.asKnown() == null) 0 else 1) +
                    (if (prohibited.asKnown() == null) 0 else 1) +
                    (if (stopProcessing.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Trigger &&
                    type == other.type &&
                    value == other.value &&
                    id == other.id &&
                    active == other.active &&
                    createdAt == other.createdAt &&
                    order == other.order &&
                    prohibited == other.prohibited &&
                    stopProcessing == other.stopProcessing &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    type,
                    value,
                    id,
                    active,
                    createdAt,
                    order,
                    prohibited,
                    stopProcessing,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Trigger{type=$type, value=$value, id=$id, active=$active, createdAt=$createdAt, order=$order, prohibited=$prohibited, stopProcessing=$stopProcessing, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                actions == other.actions &&
                ruleGroupId == other.ruleGroupId &&
                title == other.title &&
                trigger == other.trigger &&
                triggers == other.triggers &&
                active == other.active &&
                createdAt == other.createdAt &&
                description == other.description &&
                order == other.order &&
                ruleGroupTitle == other.ruleGroupTitle &&
                stopProcessing == other.stopProcessing &&
                strict == other.strict &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                actions,
                ruleGroupId,
                title,
                trigger,
                triggers,
                active,
                createdAt,
                description,
                order,
                ruleGroupTitle,
                stopProcessing,
                strict,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{actions=$actions, ruleGroupId=$ruleGroupId, title=$title, trigger=$trigger, triggers=$triggers, active=$active, createdAt=$createdAt, description=$description, order=$order, ruleGroupTitle=$ruleGroupTitle, stopProcessing=$stopProcessing, strict=$strict, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleRead &&
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
        "RuleRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
