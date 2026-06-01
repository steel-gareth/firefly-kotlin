// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.rules

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonField
import com.firefly.api.core.JsonMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.Params
import com.firefly.api.core.checkKnown
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

/** Update existing rule. */
class RuleUpdateParams
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
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actions(): List<Action>? = body.actions()

    /**
     * Whether or not the rule is even active. Default is true.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Boolean? = body.active()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Int? = body.order()

    /**
     * ID of the rule group under which the rule must be stored. Either this field or
     * rule_group_title is mandatory.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ruleGroupId(): String? = body.ruleGroupId()

    /**
     * If this value is true and the rule is triggered, other rules after this one in the group will
     * be skipped. Default value is false.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopProcessing(): Boolean? = body.stopProcessing()

    /**
     * If the rule is set to be strict, ALL triggers must hit in order for the rule to fire.
     * Otherwise, just one is enough. Default value is true.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun strict(): Boolean? = body.strict()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): String? = body.title()

    /**
     * Which action is necessary for the rule to fire? Use either store-journal, update-journal or
     * manual-activation.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trigger(): RuleTriggerType? = body.trigger()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggers(): List<Trigger>? = body.triggers()

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actions(): JsonField<List<Action>> = body._actions()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _order(): JsonField<Int> = body._order()

    /**
     * Returns the raw JSON value of [ruleGroupId].
     *
     * Unlike [ruleGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ruleGroupId(): JsonField<String> = body._ruleGroupId()

    /**
     * Returns the raw JSON value of [stopProcessing].
     *
     * Unlike [stopProcessing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stopProcessing(): JsonField<Boolean> = body._stopProcessing()

    /**
     * Returns the raw JSON value of [strict].
     *
     * Unlike [strict], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _strict(): JsonField<Boolean> = body._strict()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [trigger].
     *
     * Unlike [trigger], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trigger(): JsonField<RuleTriggerType> = body._trigger()

    /**
     * Returns the raw JSON value of [triggers].
     *
     * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _triggers(): JsonField<List<Trigger>> = body._triggers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): RuleUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RuleUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [RuleUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ruleUpdateParams: RuleUpdateParams) = apply {
            id = ruleUpdateParams.id
            xTraceId = ruleUpdateParams.xTraceId
            body = ruleUpdateParams.body.toBuilder()
            additionalHeaders = ruleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [actions]
         * - [active]
         * - [description]
         * - [order]
         * - [ruleGroupId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun actions(actions: List<Action>) = apply { body.actions(actions) }

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply { body.actions(actions) }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply { body.addAction(action) }

        /** Whether or not the rule is even active. Default is true. */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun order(order: Int) = apply { body.order(order) }

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Int>) = apply { body.order(order) }

        /**
         * ID of the rule group under which the rule must be stored. Either this field or
         * rule_group_title is mandatory.
         */
        fun ruleGroupId(ruleGroupId: String) = apply { body.ruleGroupId(ruleGroupId) }

        /**
         * Sets [Builder.ruleGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ruleGroupId(ruleGroupId: JsonField<String>) = apply { body.ruleGroupId(ruleGroupId) }

        /**
         * If this value is true and the rule is triggered, other rules after this one in the group
         * will be skipped. Default value is false.
         */
        fun stopProcessing(stopProcessing: Boolean) = apply { body.stopProcessing(stopProcessing) }

        /**
         * Sets [Builder.stopProcessing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopProcessing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stopProcessing(stopProcessing: JsonField<Boolean>) = apply {
            body.stopProcessing(stopProcessing)
        }

        /**
         * If the rule is set to be strict, ALL triggers must hit in order for the rule to fire.
         * Otherwise, just one is enough. Default value is true.
         */
        fun strict(strict: Boolean) = apply { body.strict(strict) }

        /**
         * Sets [Builder.strict] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strict] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun strict(strict: JsonField<Boolean>) = apply { body.strict(strict) }

        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        /**
         * Which action is necessary for the rule to fire? Use either store-journal, update-journal
         * or manual-activation.
         */
        fun trigger(trigger: RuleTriggerType) = apply { body.trigger(trigger) }

        /**
         * Sets [Builder.trigger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trigger] with a well-typed [RuleTriggerType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trigger(trigger: JsonField<RuleTriggerType>) = apply { body.trigger(trigger) }

        fun triggers(triggers: List<Trigger>) = apply { body.triggers(triggers) }

        /**
         * Sets [Builder.triggers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggers] with a well-typed `List<Trigger>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun triggers(triggers: JsonField<List<Trigger>>) = apply { body.triggers(triggers) }

        /**
         * Adds a single [Trigger] to [triggers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrigger(trigger: Trigger) = apply { body.addTrigger(trigger) }

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
         * Returns an immutable instance of [RuleUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleUpdateParams =
            RuleUpdateParams(
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
        private val actions: JsonField<List<Action>>,
        private val active: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val order: JsonField<Int>,
        private val ruleGroupId: JsonField<String>,
        private val stopProcessing: JsonField<Boolean>,
        private val strict: JsonField<Boolean>,
        private val title: JsonField<String>,
        private val trigger: JsonField<RuleTriggerType>,
        private val triggers: JsonField<List<Trigger>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actions")
            @ExcludeMissing
            actions: JsonField<List<Action>> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rule_group_id")
            @ExcludeMissing
            ruleGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop_processing")
            @ExcludeMissing
            stopProcessing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("strict") @ExcludeMissing strict: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trigger")
            @ExcludeMissing
            trigger: JsonField<RuleTriggerType> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            triggers: JsonField<List<Trigger>> = JsonMissing.of(),
        ) : this(
            actions,
            active,
            description,
            order,
            ruleGroupId,
            stopProcessing,
            strict,
            title,
            trigger,
            triggers,
            mutableMapOf(),
        )

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actions(): List<Action>? = actions.getNullable("actions")

        /**
         * Whether or not the rule is even active. Default is true.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * ID of the rule group under which the rule must be stored. Either this field or
         * rule_group_title is mandatory.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ruleGroupId(): String? = ruleGroupId.getNullable("rule_group_id")

        /**
         * If this value is true and the rule is triggered, other rules after this one in the group
         * will be skipped. Default value is false.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

        /**
         * If the rule is set to be strict, ALL triggers must hit in order for the rule to fire.
         * Otherwise, just one is enough. Default value is true.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun strict(): Boolean? = strict.getNullable("strict")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): String? = title.getNullable("title")

        /**
         * Which action is necessary for the rule to fire? Use either store-journal, update-journal
         * or manual-activation.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trigger(): RuleTriggerType? = trigger.getNullable("trigger")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun triggers(): List<Trigger>? = triggers.getNullable("triggers")

        /**
         * Returns the raw JSON value of [actions].
         *
         * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

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
         * Returns the raw JSON value of [ruleGroupId].
         *
         * Unlike [ruleGroupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_group_id")
        @ExcludeMissing
        fun _ruleGroupId(): JsonField<String> = ruleGroupId

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

            private var actions: JsonField<MutableList<Action>>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var ruleGroupId: JsonField<String> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var strict: JsonField<Boolean> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var trigger: JsonField<RuleTriggerType> = JsonMissing.of()
            private var triggers: JsonField<MutableList<Trigger>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                actions = body.actions.map { it.toMutableList() }
                active = body.active
                description = body.description
                order = body.order
                ruleGroupId = body.ruleGroupId
                stopProcessing = body.stopProcessing
                strict = body.strict
                title = body.title
                trigger = body.trigger
                triggers = body.triggers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
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
                    (actions ?: JsonMissing.of()).map { it.toImmutable() },
                    active,
                    description,
                    order,
                    ruleGroupId,
                    stopProcessing,
                    strict,
                    title,
                    trigger,
                    (triggers ?: JsonMissing.of()).map { it.toImmutable() },
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

            actions()?.forEach { it.validate() }
            active()
            description()
            order()
            ruleGroupId()
            stopProcessing()
            strict()
            title()
            trigger()?.validate()
            triggers()?.forEach { it.validate() }
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
            (actions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (ruleGroupId.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1) +
                (if (strict.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1) +
                (trigger.asKnown()?.validity() ?: 0) +
                (triggers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                actions == other.actions &&
                active == other.active &&
                description == other.description &&
                order == other.order &&
                ruleGroupId == other.ruleGroupId &&
                stopProcessing == other.stopProcessing &&
                strict == other.strict &&
                title == other.title &&
                trigger == other.trigger &&
                triggers == other.triggers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                actions,
                active,
                description,
                order,
                ruleGroupId,
                stopProcessing,
                strict,
                title,
                trigger,
                triggers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{actions=$actions, active=$active, description=$description, order=$order, ruleGroupId=$ruleGroupId, stopProcessing=$stopProcessing, strict=$strict, title=$title, trigger=$trigger, triggers=$triggers, additionalProperties=$additionalProperties}"
    }

    class Action
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val active: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val stopProcessing: JsonField<Boolean>,
        private val type: JsonField<RuleActionKeyword>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("stop_processing")
            @ExcludeMissing
            stopProcessing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<RuleActionKeyword> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(active, order, stopProcessing, type, value, mutableMapOf())

        /**
         * If the action is active.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * Order of the action
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * When true, other actions will not be fired after this action has fired.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

        /**
         * The type of thing this action will do. A limited set is possible.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): RuleActionKeyword? = type.getNullable("type")

        /**
         * The accompanying value the action will set, change or update. Can be empty, but for some
         * types this value is mandatory.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): String? = value.getNullable("value")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

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

            /** Returns a mutable builder for constructing an instance of [Action]. */
            fun builder() = Builder()
        }

        /** A builder for [Action]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<RuleActionKeyword> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(action: Action) = apply {
                active = action.active
                order = action.order
                stopProcessing = action.stopProcessing
                type = action.type
                value = action.value
                additionalProperties = action.additionalProperties.toMutableMap()
            }

            /** If the action is active. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /** Order of the action */
            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /** When true, other actions will not be fired after this action has fired. */
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

            /** The type of thing this action will do. A limited set is possible. */
            fun type(type: RuleActionKeyword) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [RuleActionKeyword] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<RuleActionKeyword>) = apply { this.type = type }

            /**
             * The accompanying value the action will set, change or update. Can be empty, but for
             * some types this value is mandatory.
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
             * Returns an immutable instance of [Action].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Action =
                Action(
                    active,
                    order,
                    stopProcessing,
                    type,
                    value,
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
        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            active()
            order()
            stopProcessing()
            type()?.validate()
            value()
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
            (if (active.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (value.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                active == other.active &&
                order == other.order &&
                stopProcessing == other.stopProcessing &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(active, order, stopProcessing, type, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Action{active=$active, order=$order, stopProcessing=$stopProcessing, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    class Trigger
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val active: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val stopProcessing: JsonField<Boolean>,
        private val type: JsonField<RuleTriggerKeyword>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("stop_processing")
            @ExcludeMissing
            stopProcessing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<RuleTriggerKeyword> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(active, order, stopProcessing, type, value, mutableMapOf())

        /**
         * If the trigger is active.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * Order of the trigger
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun order(): Int? = order.getNullable("order")

        /**
         * When true, other triggers will not be checked if this trigger was triggered.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

        /**
         * The type of thing this trigger responds to. A limited set is possible
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): RuleTriggerKeyword? = type.getNullable("type")

        /**
         * The accompanying value the trigger responds to. This value is often mandatory, but this
         * depends on the trigger. If the rule trigger is something like 'has any tag', submit the
         * string 'true'.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): String? = value.getNullable("value")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

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

            /** Returns a mutable builder for constructing an instance of [Trigger]. */
            fun builder() = Builder()
        }

        /** A builder for [Trigger]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<RuleTriggerKeyword> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trigger: Trigger) = apply {
                active = trigger.active
                order = trigger.order
                stopProcessing = trigger.stopProcessing
                type = trigger.type
                value = trigger.value
                additionalProperties = trigger.additionalProperties.toMutableMap()
            }

            /** If the trigger is active. */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /** Order of the trigger */
            fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Int>) = apply { this.order = order }

            /** When true, other triggers will not be checked if this trigger was triggered. */
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

            /** The type of thing this trigger responds to. A limited set is possible */
            fun type(type: RuleTriggerKeyword) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [RuleTriggerKeyword] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<RuleTriggerKeyword>) = apply { this.type = type }

            /**
             * The accompanying value the trigger responds to. This value is often mandatory, but
             * this depends on the trigger. If the rule trigger is something like 'has any tag',
             * submit the string 'true'.
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
             * Returns an immutable instance of [Trigger].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Trigger =
                Trigger(
                    active,
                    order,
                    stopProcessing,
                    type,
                    value,
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
        fun validate(): Trigger = apply {
            if (validated) {
                return@apply
            }

            active()
            order()
            stopProcessing()
            type()?.validate()
            value()
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
            (if (active.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (value.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trigger &&
                active == other.active &&
                order == other.order &&
                stopProcessing == other.stopProcessing &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(active, order, stopProcessing, type, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trigger{active=$active, order=$order, stopProcessing=$stopProcessing, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleUpdateParams &&
            id == other.id &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleUpdateParams{id=$id, xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
