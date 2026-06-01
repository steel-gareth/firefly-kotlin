// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.configuration

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.BaseDeserializer
import com.firefly.api.core.BaseSerializer
import com.firefly.api.core.ExcludeMissing
import com.firefly.api.core.JsonValue
import com.firefly.api.core.allMaxBy
import com.firefly.api.core.getOrThrow
import com.firefly.api.core.toImmutable
import com.firefly.api.errors.FireflyInvalidDataException
import java.util.Objects

@JsonDeserialize(using = PolymorphicProperty.Deserializer::class)
@JsonSerialize(using = PolymorphicProperty.Serializer::class)
class PolymorphicProperty
private constructor(
    private val boolean: Boolean? = null,
    private val string: String? = null,
    private val unionMember2: UnionMember2? = null,
    private val strings: List<String>? = null,
    private val _json: JsonValue? = null,
) {

    fun boolean(): Boolean? = boolean

    fun string(): String? = string

    fun unionMember2(): UnionMember2? = unionMember2

    fun strings(): List<String>? = strings

    fun isBoolean(): Boolean = boolean != null

    fun isString(): Boolean = string != null

    fun isUnionMember2(): Boolean = unionMember2 != null

    fun isStrings(): Boolean = strings != null

    fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

    fun asString(): String = string.getOrThrow("string")

    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

    fun asStrings(): List<String> = strings.getOrThrow("strings")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.firefly.api.core.JsonValue
     *
     * val result: String? = polymorphicProperty.accept(object : PolymorphicProperty.Visitor<String?> {
     *     override fun visitBoolean(boolean: Boolean): String? = boolean.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws FireflyInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            boolean != null -> visitor.visitBoolean(boolean)
            string != null -> visitor.visitString(string)
            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
            strings != null -> visitor.visitStrings(strings)
            else -> visitor.unknown(_json)
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
    fun validate(): PolymorphicProperty = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitBoolean(boolean: Boolean) {}

                override fun visitString(string: String) {}

                override fun visitUnionMember2(unionMember2: UnionMember2) {
                    unionMember2.validate()
                }

                override fun visitStrings(strings: List<String>) {}
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitBoolean(boolean: Boolean) = 1

                override fun visitString(string: String) = 1

                override fun visitUnionMember2(unionMember2: UnionMember2) = unionMember2.validity()

                override fun visitStrings(strings: List<String>) = strings.size

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolymorphicProperty &&
            boolean == other.boolean &&
            string == other.string &&
            unionMember2 == other.unionMember2 &&
            strings == other.strings
    }

    override fun hashCode(): Int = Objects.hash(boolean, string, unionMember2, strings)

    override fun toString(): String =
        when {
            boolean != null -> "PolymorphicProperty{boolean=$boolean}"
            string != null -> "PolymorphicProperty{string=$string}"
            unionMember2 != null -> "PolymorphicProperty{unionMember2=$unionMember2}"
            strings != null -> "PolymorphicProperty{strings=$strings}"
            _json != null -> "PolymorphicProperty{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PolymorphicProperty")
        }

    companion object {

        fun ofBoolean(boolean: Boolean) = PolymorphicProperty(boolean = boolean)

        fun ofString(string: String) = PolymorphicProperty(string = string)

        fun ofUnionMember2(unionMember2: UnionMember2) =
            PolymorphicProperty(unionMember2 = unionMember2)

        fun ofStrings(strings: List<String>) = PolymorphicProperty(strings = strings.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [PolymorphicProperty] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitBoolean(boolean: Boolean): T

        fun visitString(string: String): T

        fun visitUnionMember2(unionMember2: UnionMember2): T

        fun visitStrings(strings: List<String>): T

        /**
         * Maps an unknown variant of [PolymorphicProperty] to a value of type [T].
         *
         * An instance of [PolymorphicProperty] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws FireflyInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw FireflyInvalidDataException("Unknown PolymorphicProperty: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<PolymorphicProperty>(PolymorphicProperty::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PolymorphicProperty {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                            PolymorphicProperty(unionMember2 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            PolymorphicProperty(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                            PolymorphicProperty(boolean = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            PolymorphicProperty(strings = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from integer).
                0 -> PolymorphicProperty(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PolymorphicProperty>(PolymorphicProperty::class) {

        override fun serialize(
            value: PolymorphicProperty,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.boolean != null -> generator.writeObject(value.boolean)
                value.string != null -> generator.writeObject(value.string)
                value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                value.strings != null -> generator.writeObject(value.strings)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PolymorphicProperty")
            }
        }
    }

    class UnionMember2
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UnionMember2]. */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember2]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember2: UnionMember2) = apply {
                additionalProperties = unionMember2.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UnionMember2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember2 = UnionMember2(additionalProperties.toImmutable())
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
        fun validate(): UnionMember2 = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember2 && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UnionMember2{additionalProperties=$additionalProperties}"
    }
}
