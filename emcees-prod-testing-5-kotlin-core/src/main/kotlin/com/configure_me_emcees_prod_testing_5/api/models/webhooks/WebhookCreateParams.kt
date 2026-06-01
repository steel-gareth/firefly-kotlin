// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.Params
import com.configure_me_emcees_prod_testing_5.api.core.checkKnown
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import com.configure_me_emcees_prod_testing_5.api.core.http.QueryParams
import com.configure_me_emcees_prod_testing_5.api.core.toImmutable
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Creates a new webhook. The data required can be submitted as a JSON body or as a list of
 * parameters. The webhook will be given a random secret.
 */
class WebhookCreateParams
private constructor(
    private val xTraceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xTraceId(): String? = xTraceId

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = webhookCreateParams.delivery().convert(MyClass::class.java)
     * ```
     */
    fun _delivery(): JsonValue = body._delivery()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = webhookCreateParams.response().convert(MyClass::class.java)
     * ```
     */
    fun _response(): JsonValue = body._response()

    /**
     * A title for the webhook for easy recognition.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = body.title()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = webhookCreateParams.trigger().convert(MyClass::class.java)
     * ```
     */
    fun _trigger(): JsonValue = body._trigger()

    /**
     * The URL of the webhook. Has to start with `https`.
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Boolean to indicate if the webhook is active
     *
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun active(): Boolean? = body.active()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deliveries(): List<WebhookDelivery>? = body.deliveries()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun responses(): List<WebhookResponse>? = body.responses()

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun triggers(): List<WebhookTrigger>? = body.triggers()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [deliveries].
     *
     * Unlike [deliveries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deliveries(): JsonField<List<WebhookDelivery>> = body._deliveries()

    /**
     * Returns the raw JSON value of [responses].
     *
     * Unlike [responses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responses(): JsonField<List<WebhookResponse>> = body._responses()

    /**
     * Returns the raw JSON value of [triggers].
     *
     * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _triggers(): JsonField<List<WebhookTrigger>> = body._triggers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .delivery()
         * .response()
         * .title()
         * .trigger()
         * .url()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WebhookCreateParams]. */
    class Builder internal constructor() {

        private var xTraceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(webhookCreateParams: WebhookCreateParams) = apply {
            xTraceId = webhookCreateParams.xTraceId
            body = webhookCreateParams.body.toBuilder()
            additionalHeaders = webhookCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookCreateParams.additionalQueryParams.toBuilder()
        }

        fun xTraceId(xTraceId: String?) = apply { this.xTraceId = xTraceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [delivery]
         * - [response]
         * - [title]
         * - [trigger]
         * - [url]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun delivery(delivery: JsonValue) = apply { body.delivery(delivery) }

        fun response(response: JsonValue) = apply { body.response(response) }

        /** A title for the webhook for easy recognition. */
        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        fun trigger(trigger: JsonValue) = apply { body.trigger(trigger) }

        /** The URL of the webhook. Has to start with `https`. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Boolean to indicate if the webhook is active */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        fun deliveries(deliveries: List<WebhookDelivery>) = apply { body.deliveries(deliveries) }

        /**
         * Sets [Builder.deliveries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveries] with a well-typed `List<WebhookDelivery>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deliveries(deliveries: JsonField<List<WebhookDelivery>>) = apply {
            body.deliveries(deliveries)
        }

        /**
         * Adds a single [WebhookDelivery] to [deliveries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDelivery(delivery: WebhookDelivery) = apply { body.addDelivery(delivery) }

        fun responses(responses: List<WebhookResponse>) = apply { body.responses(responses) }

        /**
         * Sets [Builder.responses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responses] with a well-typed `List<WebhookResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun responses(responses: JsonField<List<WebhookResponse>>) = apply {
            body.responses(responses)
        }

        /**
         * Adds a single [WebhookResponse] to [responses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponse(response: WebhookResponse) = apply { body.addResponse(response) }

        fun triggers(triggers: List<WebhookTrigger>) = apply { body.triggers(triggers) }

        /**
         * Sets [Builder.triggers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggers] with a well-typed `List<WebhookTrigger>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun triggers(triggers: JsonField<List<WebhookTrigger>>) = apply { body.triggers(triggers) }

        /**
         * Adds a single [WebhookTrigger] to [triggers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrigger(trigger: WebhookTrigger) = apply { body.addTrigger(trigger) }

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
         * Returns an immutable instance of [WebhookCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .delivery()
         * .response()
         * .title()
         * .trigger()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookCreateParams =
            WebhookCreateParams(
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
        private val delivery: JsonValue,
        private val response: JsonValue,
        private val title: JsonField<String>,
        private val trigger: JsonValue,
        private val url: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val deliveries: JsonField<List<WebhookDelivery>>,
        private val responses: JsonField<List<WebhookResponse>>,
        private val triggers: JsonField<List<WebhookTrigger>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delivery") @ExcludeMissing delivery: JsonValue = JsonMissing.of(),
            @JsonProperty("response") @ExcludeMissing response: JsonValue = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trigger") @ExcludeMissing trigger: JsonValue = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("deliveries")
            @ExcludeMissing
            deliveries: JsonField<List<WebhookDelivery>> = JsonMissing.of(),
            @JsonProperty("responses")
            @ExcludeMissing
            responses: JsonField<List<WebhookResponse>> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            triggers: JsonField<List<WebhookTrigger>> = JsonMissing.of(),
        ) : this(
            delivery,
            response,
            title,
            trigger,
            url,
            active,
            deliveries,
            responses,
            triggers,
            mutableMapOf(),
        )

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.delivery().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("delivery") @ExcludeMissing fun _delivery(): JsonValue = delivery

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.response().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("response") @ExcludeMissing fun _response(): JsonValue = response

        /**
         * A title for the webhook for easy recognition.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.trigger().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("trigger") @ExcludeMissing fun _trigger(): JsonValue = trigger

        /**
         * The URL of the webhook. Has to start with `https`.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Boolean to indicate if the webhook is active
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deliveries(): List<WebhookDelivery>? = deliveries.getNullable("deliveries")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun responses(): List<WebhookResponse>? = responses.getNullable("responses")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun triggers(): List<WebhookTrigger>? = triggers.getNullable("triggers")

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [deliveries].
         *
         * Unlike [deliveries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deliveries")
        @ExcludeMissing
        fun _deliveries(): JsonField<List<WebhookDelivery>> = deliveries

        /**
         * Returns the raw JSON value of [responses].
         *
         * Unlike [responses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("responses")
        @ExcludeMissing
        fun _responses(): JsonField<List<WebhookResponse>> = responses

        /**
         * Returns the raw JSON value of [triggers].
         *
         * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("triggers")
        @ExcludeMissing
        fun _triggers(): JsonField<List<WebhookTrigger>> = triggers

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
             * .delivery()
             * .response()
             * .title()
             * .trigger()
             * .url()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var delivery: JsonValue? = null
            private var response: JsonValue? = null
            private var title: JsonField<String>? = null
            private var trigger: JsonValue? = null
            private var url: JsonField<String>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var deliveries: JsonField<MutableList<WebhookDelivery>>? = null
            private var responses: JsonField<MutableList<WebhookResponse>>? = null
            private var triggers: JsonField<MutableList<WebhookTrigger>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                delivery = body.delivery
                response = body.response
                title = body.title
                trigger = body.trigger
                url = body.url
                active = body.active
                deliveries = body.deliveries.map { it.toMutableList() }
                responses = body.responses.map { it.toMutableList() }
                triggers = body.triggers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun delivery(delivery: JsonValue) = apply { this.delivery = delivery }

            fun response(response: JsonValue) = apply { this.response = response }

            /** A title for the webhook for easy recognition. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun trigger(trigger: JsonValue) = apply { this.trigger = trigger }

            /** The URL of the webhook. Has to start with `https`. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Boolean to indicate if the webhook is active */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun deliveries(deliveries: List<WebhookDelivery>) = deliveries(JsonField.of(deliveries))

            /**
             * Sets [Builder.deliveries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveries] with a well-typed
             * `List<WebhookDelivery>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun deliveries(deliveries: JsonField<List<WebhookDelivery>>) = apply {
                this.deliveries = deliveries.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookDelivery] to [deliveries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDelivery(delivery: WebhookDelivery) = apply {
                deliveries =
                    (deliveries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("deliveries", it).add(delivery)
                    }
            }

            fun responses(responses: List<WebhookResponse>) = responses(JsonField.of(responses))

            /**
             * Sets [Builder.responses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responses] with a well-typed `List<WebhookResponse>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responses(responses: JsonField<List<WebhookResponse>>) = apply {
                this.responses = responses.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookResponse] to [responses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResponse(response: WebhookResponse) = apply {
                responses =
                    (responses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("responses", it).add(response)
                    }
            }

            fun triggers(triggers: List<WebhookTrigger>) = triggers(JsonField.of(triggers))

            /**
             * Sets [Builder.triggers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggers] with a well-typed `List<WebhookTrigger>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun triggers(triggers: JsonField<List<WebhookTrigger>>) = apply {
                this.triggers = triggers.map { it.toMutableList() }
            }

            /**
             * Adds a single [WebhookTrigger] to [triggers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrigger(trigger: WebhookTrigger) = apply {
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
             *
             * The following fields are required:
             * ```kotlin
             * .delivery()
             * .response()
             * .title()
             * .trigger()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("delivery", delivery),
                    checkRequired("response", response),
                    checkRequired("title", title),
                    checkRequired("trigger", trigger),
                    checkRequired("url", url),
                    active,
                    (deliveries ?: JsonMissing.of()).map { it.toImmutable() },
                    (responses ?: JsonMissing.of()).map { it.toImmutable() },
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
         * @throws EmceesProdTesting5InvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            title()
            url()
            active()
            deliveries()?.forEach { it.validate() }
            responses()?.forEach { it.validate() }
            triggers()?.forEach { it.validate() }
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
            (if (title.asKnown() == null) 0 else 1) +
                (if (url.asKnown() == null) 0 else 1) +
                (if (active.asKnown() == null) 0 else 1) +
                (deliveries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (responses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (triggers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                delivery == other.delivery &&
                response == other.response &&
                title == other.title &&
                trigger == other.trigger &&
                url == other.url &&
                active == other.active &&
                deliveries == other.deliveries &&
                responses == other.responses &&
                triggers == other.triggers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                delivery,
                response,
                title,
                trigger,
                url,
                active,
                deliveries,
                responses,
                triggers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{delivery=$delivery, response=$response, title=$title, trigger=$trigger, url=$url, active=$active, deliveries=$deliveries, responses=$responses, triggers=$triggers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookCreateParams &&
            xTraceId == other.xTraceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xTraceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookCreateParams{xTraceId=$xTraceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
