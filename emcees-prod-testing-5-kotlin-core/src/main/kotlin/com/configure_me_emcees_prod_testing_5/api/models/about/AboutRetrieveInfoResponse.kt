// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.about

import com.configure_me_emcees_prod_testing_5.api.core.ExcludeMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonField
import com.configure_me_emcees_prod_testing_5.api.core.JsonMissing
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class AboutRetrieveInfoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun data(): Data? = data.getNullable("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [AboutRetrieveInfoResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [AboutRetrieveInfoResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(aboutRetrieveInfoResponse: AboutRetrieveInfoResponse) = apply {
            data = aboutRetrieveInfoResponse.data
            additionalProperties = aboutRetrieveInfoResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [AboutRetrieveInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AboutRetrieveInfoResponse =
            AboutRetrieveInfoResponse(data, additionalProperties.toMutableMap())
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
    fun validate(): AboutRetrieveInfoResponse = apply {
        if (validated) {
            return@apply
        }

        data()?.validate()
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
    internal fun validity(): Int = (data.asKnown()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiVersion: JsonField<String>,
        private val driver: JsonField<String>,
        private val os: JsonField<String>,
        private val phpVersion: JsonField<String>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("driver") @ExcludeMissing driver: JsonField<String> = JsonMissing.of(),
            @JsonProperty("os") @ExcludeMissing os: JsonField<String> = JsonMissing.of(),
            @JsonProperty("php_version")
            @ExcludeMissing
            phpVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(apiVersion, driver, os, phpVersion, version, mutableMapOf())

        /**
         * Same value as the version field.
         *
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun apiVersion(): String? = apiVersion.getNullable("api_version")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun driver(): String? = driver.getNullable("driver")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun os(): String? = os.getNullable("os")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun phpVersion(): String? = phpVersion.getNullable("php_version")

        /**
         * @throws EmceesProdTesting5InvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun version(): String? = version.getNullable("version")

        /**
         * Returns the raw JSON value of [apiVersion].
         *
         * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_version")
        @ExcludeMissing
        fun _apiVersion(): JsonField<String> = apiVersion

        /**
         * Returns the raw JSON value of [driver].
         *
         * Unlike [driver], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("driver") @ExcludeMissing fun _driver(): JsonField<String> = driver

        /**
         * Returns the raw JSON value of [os].
         *
         * Unlike [os], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("os") @ExcludeMissing fun _os(): JsonField<String> = os

        /**
         * Returns the raw JSON value of [phpVersion].
         *
         * Unlike [phpVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("php_version")
        @ExcludeMissing
        fun _phpVersion(): JsonField<String> = phpVersion

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var driver: JsonField<String> = JsonMissing.of()
            private var os: JsonField<String> = JsonMissing.of()
            private var phpVersion: JsonField<String> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                apiVersion = data.apiVersion
                driver = data.driver
                os = data.os
                phpVersion = data.phpVersion
                version = data.version
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Same value as the version field. */
            fun apiVersion(apiVersion: String) = apiVersion(JsonField.of(apiVersion))

            /**
             * Sets [Builder.apiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

            fun driver(driver: String) = driver(JsonField.of(driver))

            /**
             * Sets [Builder.driver] to an arbitrary JSON value.
             *
             * You should usually call [Builder.driver] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun driver(driver: JsonField<String>) = apply { this.driver = driver }

            fun os(os: String) = os(JsonField.of(os))

            /**
             * Sets [Builder.os] to an arbitrary JSON value.
             *
             * You should usually call [Builder.os] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun os(os: JsonField<String>) = apply { this.os = os }

            fun phpVersion(phpVersion: String) = phpVersion(JsonField.of(phpVersion))

            /**
             * Sets [Builder.phpVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phpVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phpVersion(phpVersion: JsonField<String>) = apply { this.phpVersion = phpVersion }

            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    apiVersion,
                    driver,
                    os,
                    phpVersion,
                    version,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            apiVersion()
            driver()
            os()
            phpVersion()
            version()
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
            (if (apiVersion.asKnown() == null) 0 else 1) +
                (if (driver.asKnown() == null) 0 else 1) +
                (if (os.asKnown() == null) 0 else 1) +
                (if (phpVersion.asKnown() == null) 0 else 1) +
                (if (version.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                apiVersion == other.apiVersion &&
                driver == other.driver &&
                os == other.os &&
                phpVersion == other.phpVersion &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiVersion, driver, os, phpVersion, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{apiVersion=$apiVersion, driver=$driver, os=$os, phpVersion=$phpVersion, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AboutRetrieveInfoResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AboutRetrieveInfoResponse{data=$data, additionalProperties=$additionalProperties}"
}
