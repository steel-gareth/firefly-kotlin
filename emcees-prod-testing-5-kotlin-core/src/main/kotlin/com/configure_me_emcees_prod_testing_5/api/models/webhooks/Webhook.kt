// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

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

class Webhook
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
         * Returns a mutable builder for constructing an instance of [Webhook].
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

    /** A builder for [Webhook]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(webhook: Webhook) = apply {
            id = webhook.id
            attributes = webhook.attributes
            links = webhook.links
            type = webhook.type
            additionalProperties = webhook.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [Webhook].
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
        fun build(): Webhook =
            Webhook(
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
    fun validate(): Webhook = apply {
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
        private val delivery: JsonValue,
        private val response: JsonValue,
        private val title: JsonField<String>,
        private val trigger: JsonValue,
        private val url: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val deliveries: JsonField<List<WebhookDelivery>>,
        private val responses: JsonField<List<WebhookResponse>>,
        private val secret: JsonField<String>,
        private val triggers: JsonField<List<WebhookTrigger>>,
        private val updatedAt: JsonField<OffsetDateTime>,
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
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("deliveries")
            @ExcludeMissing
            deliveries: JsonField<List<WebhookDelivery>> = JsonMissing.of(),
            @JsonProperty("responses")
            @ExcludeMissing
            responses: JsonField<List<WebhookResponse>> = JsonMissing.of(),
            @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            triggers: JsonField<List<WebhookTrigger>> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            delivery,
            response,
            title,
            trigger,
            url,
            active,
            createdAt,
            deliveries,
            responses,
            secret,
            triggers,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = attributes.delivery().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("delivery") @ExcludeMissing fun _delivery(): JsonValue = delivery

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = attributes.response().convert(MyClass::class.java)
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
         * val myObject: MyClass = attributes.trigger().convert(MyClass::class.java)
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
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

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
         * A 24-character secret for the webhook. It's generated by Firefly III when saving a new
         * webhook. If you submit a new secret through the PUT endpoint it will generate a new
         * secret for the selected webhook, a new secret bearing no relation to whatever you just
         * submitted.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun secret(): String? = secret.getNullable("secret")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun triggers(): List<WebhookTrigger>? = triggers.getNullable("triggers")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [secret].
         *
         * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

        /**
         * Returns the raw JSON value of [triggers].
         *
         * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("triggers")
        @ExcludeMissing
        fun _triggers(): JsonField<List<WebhookTrigger>> = triggers

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
             * .delivery()
             * .response()
             * .title()
             * .trigger()
             * .url()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var delivery: JsonValue? = null
            private var response: JsonValue? = null
            private var title: JsonField<String>? = null
            private var trigger: JsonValue? = null
            private var url: JsonField<String>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var deliveries: JsonField<MutableList<WebhookDelivery>>? = null
            private var responses: JsonField<MutableList<WebhookResponse>>? = null
            private var secret: JsonField<String> = JsonMissing.of()
            private var triggers: JsonField<MutableList<WebhookTrigger>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                delivery = attributes.delivery
                response = attributes.response
                title = attributes.title
                trigger = attributes.trigger
                url = attributes.url
                active = attributes.active
                createdAt = attributes.createdAt
                deliveries = attributes.deliveries.map { it.toMutableList() }
                responses = attributes.responses.map { it.toMutableList() }
                secret = attributes.secret
                triggers = attributes.triggers.map { it.toMutableList() }
                updatedAt = attributes.updatedAt
                additionalProperties = attributes.additionalProperties.toMutableMap()
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

            /**
             * A 24-character secret for the webhook. It's generated by Firefly III when saving a
             * new webhook. If you submit a new secret through the PUT endpoint it will generate a
             * new secret for the selected webhook, a new secret bearing no relation to whatever you
             * just submitted.
             */
            fun secret(secret: String) = secret(JsonField.of(secret))

            /**
             * Sets [Builder.secret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secret] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
             * .delivery()
             * .response()
             * .title()
             * .trigger()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("delivery", delivery),
                    checkRequired("response", response),
                    checkRequired("title", title),
                    checkRequired("trigger", trigger),
                    checkRequired("url", url),
                    active,
                    createdAt,
                    (deliveries ?: JsonMissing.of()).map { it.toImmutable() },
                    (responses ?: JsonMissing.of()).map { it.toImmutable() },
                    secret,
                    (triggers ?: JsonMissing.of()).map { it.toImmutable() },
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

            title()
            url()
            active()
            createdAt()
            deliveries()?.forEach { it.validate() }
            responses()?.forEach { it.validate() }
            secret()
            triggers()?.forEach { it.validate() }
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
            (if (title.asKnown() == null) 0 else 1) +
                (if (url.asKnown() == null) 0 else 1) +
                (if (active.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (deliveries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (responses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (secret.asKnown() == null) 0 else 1) +
                (triggers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                delivery == other.delivery &&
                response == other.response &&
                title == other.title &&
                trigger == other.trigger &&
                url == other.url &&
                active == other.active &&
                createdAt == other.createdAt &&
                deliveries == other.deliveries &&
                responses == other.responses &&
                secret == other.secret &&
                triggers == other.triggers &&
                updatedAt == other.updatedAt &&
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
                createdAt,
                deliveries,
                responses,
                secret,
                triggers,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{delivery=$delivery, response=$response, title=$title, trigger=$trigger, url=$url, active=$active, createdAt=$createdAt, deliveries=$deliveries, responses=$responses, secret=$secret, triggers=$triggers, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Webhook &&
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
        "Webhook{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
