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
import com.firefly.api.core.checkRequired
import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Creates a new rule. The data required can be submitted as a JSON body or as a list of parameters.
 */
class RuleCreateParams
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
    fun actions(): List<Action> = body.actions()

    /**
     * ID of the rule group under which the rule must be stored. Either this field or
     * rule_group_title is mandatory.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleGroupId(): String = body.ruleGroupId()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = body.title()

    /**
     * Which action is necessary for the rule to fire? Use either store-journal, update-journal or
     * manual-activation.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trigger(): RuleTriggerType = body.trigger()

    /**
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun triggers(): List<Trigger> = body.triggers()

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
     * Title of the rule group under which the rule must be stored. Either this field or
     * rule_group_id is mandatory.
     *
     * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ruleGroupTitle(): String? = body.ruleGroupTitle()

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
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actions(): JsonField<List<Action>> = body._actions()

    /**
     * Returns the raw JSON value of [ruleGroupId].
     *
     * Unlike [ruleGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ruleGroupId(): JsonField<String> = body._ruleGroupId()

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
     * Returns the raw JSON value of [ruleGroupTitle].
     *
     * Unlike [ruleGroupTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ruleGroupTitle(): JsonField<String> = body._ruleGroupTitle()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RuleCreateParams].
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

    /** A builder for [RuleCreateParams]. */
    class Builder internal constructor() {

        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ruleCreateParams: RuleCreateParams) = apply {
            xTraceId = ruleCreateParams.xTraceId
            body = ruleCreateParams.body.toBuilder()
            additionalHeaders = ruleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleCreateParams.additionalQueryParams.toBuilder()
        }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [actions]
         * - [ruleGroupId]
         * - [title]
         * - [trigger]
         * - [triggers]
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
         * Title of the rule group under which the rule must be stored. Either this field or
         * rule_group_id is mandatory.
         */
        fun ruleGroupTitle(ruleGroupTitle: String) = apply { body.ruleGroupTitle(ruleGroupTitle) }

        /**
         * Sets [Builder.ruleGroupTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleGroupTitle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ruleGroupTitle(ruleGroupTitle: JsonField<String>) = apply {
            body.ruleGroupTitle(ruleGroupTitle)
        }

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
         * Returns an immutable instance of [RuleCreateParams].
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
        fun build(): RuleCreateParams =
            RuleCreateParams(
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
        private val actions: JsonField<List<Action>>,
        private val ruleGroupId: JsonField<String>,
        private val title: JsonField<String>,
        private val trigger: JsonField<RuleTriggerType>,
        private val triggers: JsonField<List<Trigger>>,
        private val active: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val order: JsonField<Int>,
        private val ruleGroupTitle: JsonField<String>,
        private val stopProcessing: JsonField<Boolean>,
        private val strict: JsonField<Boolean>,
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
        ) : this(
            actions,
            ruleGroupId,
            title,
            trigger,
            triggers,
            active,
            description,
            order,
            ruleGroupTitle,
            stopProcessing,
            strict,
            mutableMapOf(),
        )

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actions(): List<Action> = actions.getRequired("actions")

        /**
         * ID of the rule group under which the rule must be stored. Either this field or
         * rule_group_title is mandatory.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ruleGroupId(): String = ruleGroupId.getRequired("rule_group_id")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Which action is necessary for the rule to fire? Use either store-journal, update-journal
         * or manual-activation.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trigger(): RuleTriggerType = trigger.getRequired("trigger")

        /**
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun triggers(): List<Trigger> = triggers.getRequired("triggers")

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
         * Title of the rule group under which the rule must be stored. Either this field or
         * rule_group_id is mandatory.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ruleGroupTitle(): String? = ruleGroupTitle.getNullable("rule_group_title")

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
             * .actions()
             * .ruleGroupId()
             * .title()
             * .trigger()
             * .triggers()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var actions: JsonField<MutableList<Action>>? = null
            private var ruleGroupId: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var trigger: JsonField<RuleTriggerType>? = null
            private var triggers: JsonField<MutableList<Trigger>>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var ruleGroupTitle: JsonField<String> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var strict: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                actions = body.actions.map { it.toMutableList() }
                ruleGroupId = body.ruleGroupId
                title = body.title
                trigger = body.trigger
                triggers = body.triggers.map { it.toMutableList() }
                active = body.active
                description = body.description
                order = body.order
                ruleGroupTitle = body.ruleGroupTitle
                stopProcessing = body.stopProcessing
                strict = body.strict
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
             * .actions()
             * .ruleGroupId()
             * .title()
             * .trigger()
             * .triggers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("actions", actions).map { it.toImmutable() },
                    checkRequired("ruleGroupId", ruleGroupId),
                    checkRequired("title", title),
                    checkRequired("trigger", trigger),
                    checkRequired("triggers", triggers).map { it.toImmutable() },
                    active,
                    description,
                    order,
                    ruleGroupTitle,
                    stopProcessing,
                    strict,
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

            actions().forEach { it.validate() }
            ruleGroupId()
            title()
            trigger().validate()
            triggers().forEach { it.validate() }
            active()
            description()
            order()
            ruleGroupTitle()
            stopProcessing()
            strict()
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
                (if (ruleGroupId.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1) +
                (trigger.asKnown()?.validity() ?: 0) +
                (triggers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (ruleGroupTitle.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1) +
                (if (strict.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                actions == other.actions &&
                ruleGroupId == other.ruleGroupId &&
                title == other.title &&
                trigger == other.trigger &&
                triggers == other.triggers &&
                active == other.active &&
                description == other.description &&
                order == other.order &&
                ruleGroupTitle == other.ruleGroupTitle &&
                stopProcessing == other.stopProcessing &&
                strict == other.strict &&
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
                description,
                order,
                ruleGroupTitle,
                stopProcessing,
                strict,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{actions=$actions, ruleGroupId=$ruleGroupId, title=$title, trigger=$trigger, triggers=$triggers, active=$active, description=$description, order=$order, ruleGroupTitle=$ruleGroupTitle, stopProcessing=$stopProcessing, strict=$strict, additionalProperties=$additionalProperties}"
    }

    class Action
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<RuleActionKeyword>,
        private val value: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val stopProcessing: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<RuleActionKeyword> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("stop_processing")
            @ExcludeMissing
            stopProcessing: JsonField<Boolean> = JsonMissing.of(),
        ) : this(type, value, active, order, stopProcessing, mutableMapOf())

        /**
         * The type of thing this action will do. A limited set is possible.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): RuleActionKeyword = type.getRequired("type")

        /**
         * The accompanying value the action will set, change or update. Can be empty, but for some
         * types this value is mandatory.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): String? = value.getNullable("value")

        /**
         * If the action is active. Defaults to true.
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
         * When true, other actions will not be fired after this action has fired. Defaults to
         * false.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

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
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(action: Action) = apply {
                type = action.type
                value = action.value
                active = action.active
                order = action.order
                stopProcessing = action.stopProcessing
                additionalProperties = action.additionalProperties.toMutableMap()
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

            /** If the action is active. Defaults to true. */
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

            /**
             * When true, other actions will not be fired after this action has fired. Defaults to
             * false.
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
                    active,
                    order,
                    stopProcessing,
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

            type().validate()
            value()
            active()
            order()
            stopProcessing()
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
            (type.asKnown()?.validity() ?: 0) +
                (if (value.asKnown() == null) 0 else 1) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                type == other.type &&
                value == other.value &&
                active == other.active &&
                order == other.order &&
                stopProcessing == other.stopProcessing &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, value, active, order, stopProcessing, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Action{type=$type, value=$value, active=$active, order=$order, stopProcessing=$stopProcessing, additionalProperties=$additionalProperties}"
    }

    class Trigger
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<RuleTriggerKeyword>,
        private val value: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val order: JsonField<Int>,
        private val prohibited: JsonField<Boolean>,
        private val stopProcessing: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<RuleTriggerKeyword> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("prohibited")
            @ExcludeMissing
            prohibited: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("stop_processing")
            @ExcludeMissing
            stopProcessing: JsonField<Boolean> = JsonMissing.of(),
        ) : this(type, value, active, order, prohibited, stopProcessing, mutableMapOf())

        /**
         * The type of thing this trigger responds to. A limited set is possible
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): RuleTriggerKeyword = type.getRequired("type")

        /**
         * The accompanying value the trigger responds to. This value is often mandatory, but this
         * depends on the trigger.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * If the trigger is active. Defaults to true.
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
         * If 'prohibited' is true, this rule trigger will be negated. 'Description is' will become
         * 'Description is NOT' etc.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prohibited(): Boolean? = prohibited.getNullable("prohibited")

        /**
         * When true, other triggers will not be checked if this trigger was triggered. Defaults to
         * false.
         *
         * @throws FireflyInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopProcessing(): Boolean? = stopProcessing.getNullable("stop_processing")

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
         * Returns the raw JSON value of [prohibited].
         *
         * Unlike [prohibited], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prohibited")
        @ExcludeMissing
        fun _prohibited(): JsonField<Boolean> = prohibited

        /**
         * Returns the raw JSON value of [stopProcessing].
         *
         * Unlike [stopProcessing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stop_processing")
        @ExcludeMissing
        fun _stopProcessing(): JsonField<Boolean> = stopProcessing

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
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var prohibited: JsonField<Boolean> = JsonMissing.of()
            private var stopProcessing: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trigger: Trigger) = apply {
                type = trigger.type
                value = trigger.value
                active = trigger.active
                order = trigger.order
                prohibited = trigger.prohibited
                stopProcessing = trigger.stopProcessing
                additionalProperties = trigger.additionalProperties.toMutableMap()
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
             * this depends on the trigger.
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

            /** If the trigger is active. Defaults to true. */
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

            /**
             * If 'prohibited' is true, this rule trigger will be negated. 'Description is' will
             * become 'Description is NOT' etc.
             */
            fun prohibited(prohibited: Boolean) = prohibited(JsonField.of(prohibited))

            /**
             * Sets [Builder.prohibited] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prohibited] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prohibited(prohibited: JsonField<Boolean>) = apply { this.prohibited = prohibited }

            /**
             * When true, other triggers will not be checked if this trigger was triggered. Defaults
             * to false.
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
                    active,
                    order,
                    prohibited,
                    stopProcessing,
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

            type().validate()
            value()
            active()
            order()
            prohibited()
            stopProcessing()
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
            (type.asKnown()?.validity() ?: 0) +
                (if (value.asKnown() == null) 0 else 1) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (order.asKnown() == null) 0 else 1) +
                (if (prohibited.asKnown() == null) 0 else 1) +
                (if (stopProcessing.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trigger &&
                type == other.type &&
                value == other.value &&
                active == other.active &&
                order == other.order &&
                prohibited == other.prohibited &&
                stopProcessing == other.stopProcessing &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                value,
                active,
                order,
                prohibited,
                stopProcessing,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trigger{type=$type, value=$value, active=$active, order=$order, prohibited=$prohibited, stopProcessing=$stopProcessing, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleCreateParams &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleCreateParams{xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
