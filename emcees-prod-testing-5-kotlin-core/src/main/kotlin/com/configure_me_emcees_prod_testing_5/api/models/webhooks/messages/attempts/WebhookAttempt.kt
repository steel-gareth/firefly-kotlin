// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks.messages.attempts

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.checkRequired
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class WebhookAttempt
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, attributes, type, mutableMapOf())

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
         * Returns a mutable builder for constructing an instance of [WebhookAttempt].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WebhookAttempt]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(webhookAttempt: WebhookAttempt) = apply {
            id = webhookAttempt.id
            attributes = webhookAttempt.attributes
            type = webhookAttempt.type
            additionalProperties = webhookAttempt.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [WebhookAttempt].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookAttempt =
            WebhookAttempt(
                checkRequired("id", id),
                checkRequired("attributes", attributes),
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
    fun validate(): WebhookAttempt = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().validate()
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
            (if (type.asKnown() == null) 0 else 1)

    class Attributes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val logs: JsonField<String>,
        private val response: JsonField<String>,
        private val statusCode: JsonField<Int>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val webhookMessageId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("logs") @ExcludeMissing logs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response")
            @ExcludeMissing
            response: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status_code")
            @ExcludeMissing
            statusCode: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("webhook_message_id")
            @ExcludeMissing
            webhookMessageId: JsonField<String> = JsonMissing.of(),
        ) : this(createdAt, logs, response, statusCode, updatedAt, webhookMessageId, mutableMapOf())

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * Internal log for this attempt. May contain sensitive user data.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logs(): String? = logs.getNullable("logs")

        /**
         * Webhook receiver response for this attempt, if any. May contain sensitive user data.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun response(): String? = response.getNullable("response")

        /**
         * The HTTP status code of the error, if any.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun statusCode(): Int? = statusCode.getNullable("status_code")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * The ID of the webhook message this attempt belongs to.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun webhookMessageId(): String? = webhookMessageId.getNullable("webhook_message_id")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [logs].
         *
         * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<String> = logs

        /**
         * Returns the raw JSON value of [response].
         *
         * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Int> = statusCode

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [webhookMessageId].
         *
         * Unlike [webhookMessageId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("webhook_message_id")
        @ExcludeMissing
        fun _webhookMessageId(): JsonField<String> = webhookMessageId

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

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var logs: JsonField<String> = JsonMissing.of()
            private var response: JsonField<String> = JsonMissing.of()
            private var statusCode: JsonField<Int> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var webhookMessageId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                createdAt = attributes.createdAt
                logs = attributes.logs
                response = attributes.response
                statusCode = attributes.statusCode
                updatedAt = attributes.updatedAt
                webhookMessageId = attributes.webhookMessageId
                additionalProperties = attributes.additionalProperties.toMutableMap()
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

            /** Internal log for this attempt. May contain sensitive user data. */
            fun logs(logs: String?) = logs(JsonField.ofNullable(logs))

            /**
             * Sets [Builder.logs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logs] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun logs(logs: JsonField<String>) = apply { this.logs = logs }

            /**
             * Webhook receiver response for this attempt, if any. May contain sensitive user data.
             */
            fun response(response: String?) = response(JsonField.ofNullable(response))

            /**
             * Sets [Builder.response] to an arbitrary JSON value.
             *
             * You should usually call [Builder.response] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun response(response: JsonField<String>) = apply { this.response = response }

            /** The HTTP status code of the error, if any. */
            fun statusCode(statusCode: Int?) = statusCode(JsonField.ofNullable(statusCode))

            /**
             * Alias for [Builder.statusCode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun statusCode(statusCode: Int) = statusCode(statusCode as Int?)

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Int>) = apply { this.statusCode = statusCode }

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

            /** The ID of the webhook message this attempt belongs to. */
            fun webhookMessageId(webhookMessageId: String) =
                webhookMessageId(JsonField.of(webhookMessageId))

            /**
             * Sets [Builder.webhookMessageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookMessageId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookMessageId(webhookMessageId: JsonField<String>) = apply {
                this.webhookMessageId = webhookMessageId
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
                    createdAt,
                    logs,
                    response,
                    statusCode,
                    updatedAt,
                    webhookMessageId,
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

            createdAt()
            logs()
            response()
            statusCode()
            updatedAt()
            webhookMessageId()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
                (if (logs.asKnown() == null) 0 else 1) +
                (if (response.asKnown() == null) 0 else 1) +
                (if (statusCode.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (webhookMessageId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                createdAt == other.createdAt &&
                logs == other.logs &&
                response == other.response &&
                statusCode == other.statusCode &&
                updatedAt == other.updatedAt &&
                webhookMessageId == other.webhookMessageId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                logs,
                response,
                statusCode,
                updatedAt,
                webhookMessageId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{createdAt=$createdAt, logs=$logs, response=$response, statusCode=$statusCode, updatedAt=$updatedAt, webhookMessageId=$webhookMessageId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookAttempt &&
            id == other.id &&
            attributes == other.attributes &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, attributes, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookAttempt{id=$id, attributes=$attributes, type=$type, additionalProperties=$additionalProperties}"
}
