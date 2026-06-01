// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.autocomplete.AutocompleteBill
import com.firefly.api.models.configuration.PolymorphicProperty
import com.firefly.api.models.data.export.ExportFileFilter
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/firefly-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = FireflyOkHttpClient.fromEnv()

        assertThat(client).isNotNull()
        assertThat(client.autocomplete()).isNotNull()
        assertThat(client.chart()).isNotNull()
        assertThat(client.data()).isNotNull()
        assertThat(client.insight()).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.attachments()).isNotNull()
        assertThat(client.availableBudgets()).isNotNull()
        assertThat(client.bills()).isNotNull()
        assertThat(client.budgets()).isNotNull()
        assertThat(client.categories()).isNotNull()
        assertThat(client.exchangeRates()).isNotNull()
        assertThat(client.linkTypes()).isNotNull()
        assertThat(client.transactionLinks()).isNotNull()
        assertThat(client.objectGroups()).isNotNull()
        assertThat(client.piggyBanks()).isNotNull()
        assertThat(client.recurrences()).isNotNull()
        assertThat(client.ruleGroups()).isNotNull()
        assertThat(client.rules()).isNotNull()
        assertThat(client.tags()).isNotNull()
        assertThat(client.currencies()).isNotNull()
        assertThat(client.transactionJournals()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.userGroups()).isNotNull()
        assertThat(client.search()).isNotNull()
        assertThat(client.summary()).isNotNull()
        assertThat(client.about()).isNotNull()
        assertThat(client.batch()).isNotNull()
        assertThat(client.configuration()).isNotNull()
        assertThat(client.cron()).isNotNull()
        assertThat(client.users()).isNotNull()
        assertThat(client.preferences()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun autocompleteBillRoundtrip() {
        val jsonMapper = jsonMapper()
        val autocompleteBill =
            AutocompleteBill.builder().id("2").name("Yearly bill").active(true).build()

        val roundtrippedAutocompleteBill =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autocompleteBill),
                jacksonTypeRef<AutocompleteBill>(),
            )

        assertThat(roundtrippedAutocompleteBill).isEqualTo(autocompleteBill)
    }

    @Test
    fun polymorphicPropertyRoundtrip() {
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
    fun exportFileFilterRoundtrip() {
        val jsonMapper = jsonMapper()
        val exportFileFilter = ExportFileFilter.CSV

        val roundtrippedExportFileFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exportFileFilter),
                jacksonTypeRef<ExportFileFilter>(),
            )

        assertThat(roundtrippedExportFileFilter).isEqualTo(exportFileFilter)
    }
}
