// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.configuration

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.configure_me_emcees_prod_testing_5.api.errors.EmceesProdTesting5InvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PolymorphicPropertyTest {

    @Test
    fun ofBoolean() {
        val boolean = true

        val polymorphicProperty = PolymorphicProperty.ofBoolean(boolean)

        assertThat(polymorphicProperty.boolean()).isEqualTo(boolean)
        assertThat(polymorphicProperty.string()).isNull()
        assertThat(polymorphicProperty.unionMember2()).isNull()
        assertThat(polymorphicProperty.strings()).isNull()
    }

    @Test
    fun ofBooleanRoundtrip() {
        val jsonMapper = jsonMapper()
        val polymorphicProperty = PolymorphicProperty.ofBoolean(true)

        val roundtrippedPolymorphicProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(polymorphicProperty),
                jacksonTypeRef<PolymorphicProperty>(),
            )

        assertThat(roundtrippedPolymorphicProperty).isEqualTo(polymorphicProperty)
    }

    @Test
    fun ofString() {
        val string = "string"

        val polymorphicProperty = PolymorphicProperty.ofString(string)

        assertThat(polymorphicProperty.boolean()).isNull()
        assertThat(polymorphicProperty.string()).isEqualTo(string)
        assertThat(polymorphicProperty.unionMember2()).isNull()
        assertThat(polymorphicProperty.strings()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val polymorphicProperty = PolymorphicProperty.ofString("string")

        val roundtrippedPolymorphicProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(polymorphicProperty),
                jacksonTypeRef<PolymorphicProperty>(),
            )

        assertThat(roundtrippedPolymorphicProperty).isEqualTo(polymorphicProperty)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            PolymorphicProperty.UnionMember2.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val polymorphicProperty = PolymorphicProperty.ofUnionMember2(unionMember2)

        assertThat(polymorphicProperty.boolean()).isNull()
        assertThat(polymorphicProperty.string()).isNull()
        assertThat(polymorphicProperty.unionMember2()).isEqualTo(unionMember2)
        assertThat(polymorphicProperty.strings()).isNull()
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val polymorphicProperty =
            PolymorphicProperty.ofUnionMember2(
                PolymorphicProperty.UnionMember2.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedPolymorphicProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(polymorphicProperty),
                jacksonTypeRef<PolymorphicProperty>(),
            )

        assertThat(roundtrippedPolymorphicProperty).isEqualTo(polymorphicProperty)
    }

    @Test
    fun ofStrings() {
        val strings = listOf("EUR")

        val polymorphicProperty = PolymorphicProperty.ofStrings(strings)

        assertThat(polymorphicProperty.boolean()).isNull()
        assertThat(polymorphicProperty.string()).isNull()
        assertThat(polymorphicProperty.unionMember2()).isNull()
        assertThat(polymorphicProperty.strings()).isEqualTo(strings)
    }

    @Test
    fun ofStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val polymorphicProperty = PolymorphicProperty.ofStrings(listOf("EUR"))

        val roundtrippedPolymorphicProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(polymorphicProperty),
                jacksonTypeRef<PolymorphicProperty>(),
            )

        assertThat(roundtrippedPolymorphicProperty).isEqualTo(polymorphicProperty)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val polymorphicProperty =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PolymorphicProperty>())

        val e =
            assertThrows<EmceesProdTesting5InvalidDataException> { polymorphicProperty.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
