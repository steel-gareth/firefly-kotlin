// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.attachments

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

class AttachmentRead
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
         * Returns a mutable builder for constructing an instance of [AttachmentRead].
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

    /** A builder for [AttachmentRead]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var links: JsonField<ObjectLink>? = null
        private var type: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(attachmentRead: AttachmentRead) = apply {
            id = attachmentRead.id
            attributes = attachmentRead.attributes
            links = attachmentRead.links
            type = attachmentRead.type
            additionalProperties = attachmentRead.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AttachmentRead].
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
        fun build(): AttachmentRead =
            AttachmentRead(
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
    fun validate(): AttachmentRead = apply {
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
        private val attachableId: JsonField<String>,
        private val attachableType: JsonField<AttachableType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val downloadUrl: JsonField<String>,
        private val filename: JsonField<String>,
        private val hash: JsonField<String>,
        private val mime: JsonField<String>,
        private val notes: JsonField<String>,
        private val size: JsonField<Int>,
        private val title: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val uploadUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attachable_id")
            @ExcludeMissing
            attachableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachable_type")
            @ExcludeMissing
            attachableType: JsonField<AttachableType> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("download_url")
            @ExcludeMissing
            downloadUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hash") @ExcludeMissing hash: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mime") @ExcludeMissing mime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("upload_url")
            @ExcludeMissing
            uploadUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            attachableId,
            attachableType,
            createdAt,
            downloadUrl,
            filename,
            hash,
            mime,
            notes,
            size,
            title,
            updatedAt,
            uploadUrl,
            mutableMapOf(),
        )

        /**
         * ID of the model this attachment is linked to.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attachableId(): String? = attachableId.getNullable("attachable_id")

        /**
         * The object class to which the attachment must be linked.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attachableType(): AttachableType? = attachableType.getNullable("attachable_type")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun downloadUrl(): String? = downloadUrl.getNullable("download_url")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun filename(): String? = filename.getNullable("filename")

        /**
         * Hash of the file for basic duplicate detection.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hash(): String? = hash.getNullable("hash")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mime(): String? = mime.getNullable("mime")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): String? = notes.getNullable("notes")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun size(): Int? = size.getNullable("size")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun title(): String? = title.getNullable("title")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun uploadUrl(): String? = uploadUrl.getNullable("upload_url")

        /**
         * Returns the raw JSON value of [attachableId].
         *
         * Unlike [attachableId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attachable_id")
        @ExcludeMissing
        fun _attachableId(): JsonField<String> = attachableId

        /**
         * Returns the raw JSON value of [attachableType].
         *
         * Unlike [attachableType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attachable_type")
        @ExcludeMissing
        fun _attachableType(): JsonField<AttachableType> = attachableType

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [downloadUrl].
         *
         * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("download_url")
        @ExcludeMissing
        fun _downloadUrl(): JsonField<String> = downloadUrl

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [hash].
         *
         * Unlike [hash], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hash") @ExcludeMissing fun _hash(): JsonField<String> = hash

        /**
         * Returns the raw JSON value of [mime].
         *
         * Unlike [mime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mime") @ExcludeMissing fun _mime(): JsonField<String> = mime

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Int> = size

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

        /**
         * Returns the raw JSON value of [uploadUrl].
         *
         * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

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

            private var attachableId: JsonField<String> = JsonMissing.of()
            private var attachableType: JsonField<AttachableType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var downloadUrl: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var hash: JsonField<String> = JsonMissing.of()
            private var mime: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Int> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var uploadUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                attachableId = attributes.attachableId
                attachableType = attributes.attachableType
                createdAt = attributes.createdAt
                downloadUrl = attributes.downloadUrl
                filename = attributes.filename
                hash = attributes.hash
                mime = attributes.mime
                notes = attributes.notes
                size = attributes.size
                title = attributes.title
                updatedAt = attributes.updatedAt
                uploadUrl = attributes.uploadUrl
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            /** ID of the model this attachment is linked to. */
            fun attachableId(attachableId: String) = attachableId(JsonField.of(attachableId))

            /**
             * Sets [Builder.attachableId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attachableId(attachableId: JsonField<String>) = apply {
                this.attachableId = attachableId
            }

            /** The object class to which the attachment must be linked. */
            fun attachableType(attachableType: AttachableType) =
                attachableType(JsonField.of(attachableType))

            /**
             * Sets [Builder.attachableType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachableType] with a well-typed [AttachableType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attachableType(attachableType: JsonField<AttachableType>) = apply {
                this.attachableType = attachableType
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

            fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

            /**
             * Sets [Builder.downloadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.downloadUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun downloadUrl(downloadUrl: JsonField<String>) = apply {
                this.downloadUrl = downloadUrl
            }

            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** Hash of the file for basic duplicate detection. */
            fun hash(hash: String) = hash(JsonField.of(hash))

            /**
             * Sets [Builder.hash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hash] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun hash(hash: JsonField<String>) = apply { this.hash = hash }

            fun mime(mime: String) = mime(JsonField.of(mime))

            /**
             * Sets [Builder.mime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mime] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mime(mime: JsonField<String>) = apply { this.mime = mime }

            fun notes(notes: String?) = notes(JsonField.ofNullable(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            fun size(size: Int) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Int>) = apply { this.size = size }

            fun title(title: String?) = title(JsonField.ofNullable(title))

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

            fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

            /**
             * Sets [Builder.uploadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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
                    attachableId,
                    attachableType,
                    createdAt,
                    downloadUrl,
                    filename,
                    hash,
                    mime,
                    notes,
                    size,
                    title,
                    updatedAt,
                    uploadUrl,
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

            attachableId()
            attachableType()?.validate()
            createdAt()
            downloadUrl()
            filename()
            hash()
            mime()
            notes()
            size()
            title()
            updatedAt()
            uploadUrl()
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
            (if (attachableId.asKnown() == null) 0 else 1) +
                (attachableType.asKnown()?.validity() ?: 0) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (downloadUrl.asKnown() == null) 0 else 1) +
                (if (filename.asKnown() == null) 0 else 1) +
                (if (hash.asKnown() == null) 0 else 1) +
                (if (mime.asKnown() == null) 0 else 1) +
                (if (notes.asKnown() == null) 0 else 1) +
                (if (size.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (uploadUrl.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attributes &&
                attachableId == other.attachableId &&
                attachableType == other.attachableType &&
                createdAt == other.createdAt &&
                downloadUrl == other.downloadUrl &&
                filename == other.filename &&
                hash == other.hash &&
                mime == other.mime &&
                notes == other.notes &&
                size == other.size &&
                title == other.title &&
                updatedAt == other.updatedAt &&
                uploadUrl == other.uploadUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachableId,
                attachableType,
                createdAt,
                downloadUrl,
                filename,
                hash,
                mime,
                notes,
                size,
                title,
                updatedAt,
                uploadUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{attachableId=$attachableId, attachableType=$attachableType, createdAt=$createdAt, downloadUrl=$downloadUrl, filename=$filename, hash=$hash, mime=$mime, notes=$notes, size=$size, title=$title, updatedAt=$updatedAt, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachmentRead &&
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
        "AttachmentRead{id=$id, attributes=$attributes, links=$links, type=$type, additionalProperties=$additionalProperties}"
}
